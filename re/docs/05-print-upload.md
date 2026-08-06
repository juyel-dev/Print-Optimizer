# 05 — Print order upload: sending strategy & architecture

How a picked PDF reaches the NotesCrafter server and ends up in **Cloudflare R2** storage — the multipart upload protocol, the API client, auth, progress/state machine, error handling, and what happens after the file is stored.

> Opposite to Flow/Tools (fully on-device), the print-order path **does** talk to a server: `https://notescrafter.com/api/...` (REST over HTTPS, JSON). Files are stored in **Cloudflare R2** (hence `r2_file_key`). The client never touches R2 directly — everything is proxied through the API server, authenticated with a Bearer JWT.

## End-to-end

```
[Upload screen Fd]  pick PDF (SAF uri)
        │  open ParcelFileDescriptor → PdfRenderer → pageCount
        │  validations: 0 pages → error | <20 → warn | >250 → warn
        │  cache copy: contentResolver → File.createTempFile("print_upload_", ".pdf", cacheDir)
        │  cart item m created: id=UUID, status="idle", progress=0, previewUri=null
        ▼
PrintOrderViewModel.s(file, id)
        │  ├─ r(id, cb)  : coroutine → item status → "uploading" (state update)
        │  └─ new Thread(new t(file, progressCb, apiClient, resultCb, 1)).start()   ← raw Thread
        ▼
(1) POST /api/print/upload-pdf/init    {"filename", "fileSize"}
        ▲                                  │  {"success": true, "data": {"uploadId", "fileKey"}}
        │                                  ▼
(2) POST /api/print/upload-pdf/chunk  × ceil(size / 10 MiB), 3 in parallel
        │     multipart/form-data:  chunk (name "chunk-<n>", application/pdf, byte range),
        │                           partNumber, uploadId, fileKey
        │     each → {"success": true, "data": {"etag"}}     ← S3/R2 multipart part etag
        │     part etags collected: [{partNumber, etag}, ...]
        ▼
(3) POST /api/print/upload-pdf/complete  {"uploadId", "fileKey", "parts":[{partNumber, etag}]}
        │     → {"success": true, "data": {"r2_file_key": "<key>"}}
        ▼
item → status "success", progress 100,
previewUri = "https://notescrafter.com/api/print/preview-pdf/<r2_file_key>"   (client-built)
        ▼
POST /api/print/calculate-price  {"items":[{color_mode, duplex_mode, paper_size, binding_type, pages, copies}]}  (all cart items)
        ▼
server prices stored as pricePaise per item → checkout
```

On any chunk failure → POST `/api/print/upload-pdf/abort` `{"uploadId", "fileKey"}` (fire-and-forget), item → error state.

## The upload client — `com.razorpay.t` (Rasp-obfuscated app code)

> The app bundles Razorpay's SDK and their **Rasp obfuscator**, which renames app classes into the `com.razorpay` package. `t.java` is the app's own `PrintUploadWorker`, not SDK code.

Constructor path (`s()`): `new Thread(new t(file, C2275a0(progress), C2117x(api), C2275a0(result), 1)).start()` — a plain Java `Thread` (not a coroutine), one thread per uploaded file.

### Init phase
- `POST upload-pdf/init`, JSON body `{"filename": file.getName(), "fileSize": length}`
- Progress callback fired: `invoke(2)` (started), then `invoke(5)` (init done, session ready)
- Response gives opaque `uploadId` + `fileKey` — both re-sent on every chunk (server-side session)

### Chunked upload (S3-compatible multipart)
- Chunk size: **10 MiB** (10,485,760 bytes); chunk count `ceil(size / 10MiB)`
- Concurrency: `Executors.newFixedThreadPool(3)` — 3 chunks in flight, one `Future` each, all `future.get()`-ed before completing
- Each chunk: `multipart/form-data` (`g4.r`) with:
  - part `chunk` — file body (`v3.u`) streaming the byte range `[i*10MiB, i*10MiB+min(10MiB, size-…)` from the cache file, content-type `application/pdf`, form-name `"chunk-<n>"` where n is 1-based
  - part `partNumber` — chunk index (1-based)
  - part `uploadId` / `fileKey` — session identifiers
- Each success → `{"data": {"etag": "..."}}`; `{partNumber, etag}` JSON objects accumulated in a `CopyOnWriteArrayList`; bytes-per-chunk recorded in a `ConcurrentHashMap` (aggregated by the chunk callback `v3.s` into progress updates)
- **First-failure-wins**: a shared `kotlin.jvm.internal.A` boolean + `Exception` holder under `synchronized` — the first failed chunk records the error and every other thread bails (`if (flag) return`)

### Complete phase
- `POST upload-pdf/complete`, JSON body `{"uploadId", "fileKey", "parts": [{partNumber, etag}, ...]}` (sorted by part number)
- Success → `data.r2_file_key` — the **Cloudflare R2 object key**
- Progress callback `invoke(100)` → routed to the success worker `X0`

### Abort phase
- `POST upload-pdf/abort` `{"uploadId", "fileKey"}`, no response handling (`close()` only)

## The API client — `C2117x` ("PrintApiClient")

Obfuscated into `com.google.android.gms.internal.measurement` by the code renamer; log tag `PrintApiClient`.

- **HTTP stack**: OkHttp (`g4.t`) — connect/read/write timeout all **30 s** (upload client); AuthManager has its own 15 s client
- **Request factory** `c(url)`: builds a request and injects
  `Authorization: Bearer <jwt>` read from SharedPreferences **`auth_prefs`** key `jwt`
- Upload calls are **synchronous** (`execute().f()`) inside the worker thread; cart/price calls use the same client's async path

### Full endpoint surface (`https://notescrafter.com/api/...`)

| Endpoint | Method | Purpose |
|---|---|---|
| `auth/mobile` | POST | Firebase `idToken` → custom JWT + user profile + subscription (AuthManager) |
| `print/send-otp` | POST | `{phone}` — recipient/address verification OTP |
| `print/verify-otp` | POST | `{phone, code}` |
| `print/upload-pdf/init` | POST | start multipart session (`{filename, fileSize}`) |
| `print/upload-pdf/chunk` | POST | upload one 10 MiB part |
| `print/upload-pdf/complete` | POST | finalize multipart, get `r2_file_key` |
| `print/upload-pdf/abort` | POST | cancel session |
| `print/preview-pdf/{r2_file_key}` | GET | preview PDF (proxy/serve from R2) |
| `print/calculate-price` | POST | batch pricing of cart items |
| `print/drafts` | GET/POST | cloud draft notebooks (per-user, stored with `r2_file_key`) |
| `print/drafts/delete` | POST | remove draft |
| `print/rates` | GET | server rate card |
| `print/status` | GET | shop open/paused + banner message |
| `print/shipping-addresses` | GET/POST | list / create address; `/{id}` PUT update; `/{id}/default` |
| `print/pincode/{pincode}` | GET | address validation + EDD |
| `print/check-edd?pincode=` | GET | expected delivery date |
| `print/shipping-cost` | GET | shipping price |
| `print/orders/{id}/verify-payment` | POST | Razorpay payment verification |
| `print/orders/{id}/tracking` | GET | order tracking |
| `print/my-orders` | GET | order history |
| `subscription/status` | GET | subscription state refresh |
| `notifications/register` | POST | FCM token registration |

## Auth & identity

Two layers:

1. **Account auth (AuthManager `p092v3/h` + worker `d`)** — POST `auth/mobile` with the **Firebase Auth idToken**; response `{jwt, user{name,email,phone,phone_verified,profile_picture,print_first_login_at}, has_active_subscription, subscription{plan_type, remaining_days}, first_order_diamond_deal_eligible}` persisted to `auth_prefs` (`is_logged_in`, `jwt`, `user_name/email/photo`, `is_premium`, `subscription_plan`, `remaining_days`, `user_phone`, `user_phone_verified`, …). `is_logged_in` gates premium UI.
2. **Recipient phone OTP (guest checkout)** — `print/send-otp` + `print/verify-otp` verify the shipping-contact phone without an account; verified phone stored on the shipping address (`isPhoneVerified`).

## Client-side state machine — cart item `m` (PrintNotebookItem)

| field | meaning |
|---|---|
| `id` | client UUID (generated at pick time) |
| `uploadStatus` | `"idle"` → `"uploading"` → `"success"` (or error state via `uploadError`) |
| `uploadProgress` | 0–100, **clamped to 10–95** during transfer; set to 100 only at complete |
| `r2FileKey` | server R2 object key (null until complete) |
| `previewUri` | `https://notescrafter.com/api/print/preview-pdf/{r2_file_key}` (built client-side) |
| `pricePaise` | server price after `calculate-price` (null → local fallback, see below) |
| `localPath` | cache file path of the picked PDF |

Progress callback (`C2275a0` case 2) updates the item's `uploadProgress` via the state `F`; final `X0` worker flips status to `success`, then `N0.C` sets `uploadProgress=100` + `previewUri`.

## Error taxonomy

`C2117x.h(e)` (exceptions) → user messages:
- `UnknownHostException` / "resolve" → *"No internet connection. Please check your network status and try again."*
- `SocketTimeoutException` / "timeout" → *"Upload timed out. Your connection might be too slow for this file…"*
- `FileNotFoundException` → *"The selected PDF file could not be found or read…"*
- `IOException` → *"Network transmission error occurred…"*
- else message or *"Failed to securely upload file. Please try again."*

`C2117x.i(body, code, fallback)` (HTTP) → user messages:
- 401 → *"Session expired. Please log out and sign back in."*
- 413 → *"This PDF file is too large to upload. Maximum size is 1 GB."*
- 503 → *"File uploads are temporarily disabled. The print shop is not accepting orders right now."*
- 5xx → *"Server encountered an error while processing the PDF…"*

## After the upload

- `X0` (calculate-price worker): marks the item success, refreshes state, then **batch-prices all cart items** — `POST calculate-price` with `{color_mode, duplex_mode, paper_size, binding_type, pages, copies}` per item → `pricePaise` per item.
- Until the server price arrives, the client uses a **local rate-card fallback** (`p092v3/h`): ₹ per page by plan — guest {BW 1.25, color 3.35}, monthly {1.15, 3.00}, half_yearly {1.05, 2.75}, annual {0.99, 2.35}, lifetime {0.89, 1.99} — `price = (pages × rate + 65₹ setup) × copies` (`PrintOrderViewModel.l`).
- Drafts: uploaded notebooks can be saved as cloud drafts (`print/drafts`) — re-selected later, the file is **re-uploaded** (new session) using the stored `r2_file_key` only for preview (`preview-pdf`).

## Design takeaways

- **Server-mediated upload, not direct-to-bucket** — no presigned URLs, no R2 credentials on device; the API server streams parts into R2 and answers with R2 multipart etags. Uploads are tied to a JWT-authenticated session.
- **S3 multipart semantics** (init → parts+etags → complete/abort) = standard, resumable-ready; 10 MiB × 3 concurrent keeps memory low and tolerates flaky networks (per-chunk retry via future.get + first-failure abort).
- **Two network stacks**: PrintApiClient (30 s, Bearer JWT) for orders; AuthManager (15 s) for auth — separate OkHttp instances, one base URL (`notescrafter.com`).
- **Synchronous upload on a raw Thread** — deliberate: upload must not be cancelled by composition (Flow's coroutine worker would be), progress flows via callback → Compose state (`F`/`T`).
