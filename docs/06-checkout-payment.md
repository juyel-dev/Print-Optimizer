# 06 — Checkout & payment (Razorpay), drafts, order dashboard

The paid half of PRINTS: how an order is created, paid via **Razorpay**, verified, and tracked; plus the cloud-drafts system and the orders dashboard.

## Payment flow (server-mediated Razorpay)

```
[PrintOrderCheckoutScreen — Pay button, bottom bar]
   click (C2460f4 case 3) → loading=true → launch Ec (PlaceOrderWorker, coroutine)
        │
        │ POST /api/print/orders            ← order creation (JWT-authenticated)
        │   items: [{r2_file_key, name, pages, copies,
        │            color_mode, duplex_mode, paper_size, binding_type}]
        │   shipping: full address (firstName…postalCode, addressType)
        │     └── OR shippingAddressId (saved address)
        │   couponCode (optional)
        │
        ▼  response: {orderId, razorpayOrderId, rzp_key, totalAmountPaise}
   F case 1 → F0 → state f10892c0 = RazorpayCheckoutData(orderId, rzpOrderId, rzpKey, amountPaise)
        │
        ▼  collected (a4.C0217p) → C2282e (CheckoutWorker, coroutine)
   Razorpay SDK: new Checkout().open(activity, options)
        ├─ key_id = rzpKey (from server), order_id = rzpOrderId (from server)
        ├─ name "NotesCrafter", description "NotesCrafter Print Order",
        ├─ amount (paise), currency INR
        ├─ prefill: {name: shipping first+last, contact: "+91"+digits(phone),
        │            email: auth_prefs user_email}
        ├─ display config: UPI-first (intent/collect/qr) + card/netbanking/wallet/emi
        ├─ theme: #7C3AED on #0A0A0F
        ├─ notes: {notescrafter_order_id}
        └─ f10860M = orderId (stored for verify callback)
        │
        ▼  MainActivity implements PaymentResultWithDataListener
   onPaymentSuccess(paymentId, data):
        │  POST /api/print/orders/{orderId}/verify-payment
        │    {razorpay_order_id, razorpay_payment_id, razorpay_signature}
        │    → F case 2 → d1 (finalize)
        │       ├─ PrintOrderViewModel.m()  = reset cart/address/price state
        │       └─ pending C2291i0: loading=false, success=orderId → success UI
        ▼
   onPaymentError(code, msg) → onPaymentFailed → E0 → error text state ("Failed to place order" fallback)
```

Key detail: the client never sends money data to its own server except the three Razorpay ids (order/payment/signature) — the server verifies the signature itself. `rzp_order_id` is generated **server-side** (server holds the Razorpay secret key); the app only gets `rzp_key` for the SDK.

### Pending-payment pattern (C2291i0 case 5)

Before `POST /api/print/orders` the ViewModel stores a **pending payment callback** (`f10895e0`, volatile). It survives the gateway round-trip and is handed to both `onPaymentSuccess` (verify-payment response) and the failure workers (`E0`/`G0`), which flip its UI states:

- `f13180r` (MutableState) = isLoading → false
- `q` = orderId (success) or error message
- `f13181s` = paymentDone → true

On order-creation failure: `f10895e0 = null` + `G0` (error message). On verify failure after payment: `d1` keeps the cart intact and surfaces the server error.

### Payment workers map

| Worker | Role |
|---|---|
| `Ec` (p102x3) | PlaceOrderWorker — builds items/shipping/coupon JSON, POST orders |
| `F` case 1 | order-creation response → `F0` → `RazorpayCheckoutData` state |
| `C2282e` (p083t3) | CheckoutWorker — builds Razorpay options JSON, `checkout.open()` |
| `F0` (p083t3) | stores RazorpayCheckoutData into `f10892c0` |
| `C2285f0` (p083t3) | `RazorpayCheckoutData(orderId, rzpOrderId, rzpKey, amountPaise)` |
| `F` case 2 | verify-payment response → `d1` |
| `d1` (p083t3) | PaymentSuccessWorker — resets cart, flips pending states |
| `E0` / `G0` (p083t3) | PaymentFailureWorker / OrderCreateFailureWorker — error text state |
| `C2460f4` case 3 (p102x3) | Pay-button click → launch `Ec` |
| `Fc` (p102x3) | Pay bottom-bar (gradient bar, Lock icon, "Pay with Razorpay · ₹…", "Connecting to Razorpay…" spinner) — PrintOrderScreens.kt:3483 |

Razorpay UI options recap: name, description, `order_id` (Razorpay-side), amount, currency INR, prefill (recipient name/phone/email), display blocks (upi_block + other_block), theme, `notes.notescrafter_order_id`.

## Cloud drafts

Draft = an uploaded notebook (already in R2) saved to the user's cloud so it can be re-ordered later — **the PDF itself is never re-sent**; only metadata + the R2 key.

| Worker | Endpoint | Behavior |
|---|---|---|
| `U0` (p083t3) | `POST /api/print/drafts` | DraftSyncWorker — after **2 s delay**, for every cart item with `uploadStatus=="success"` + `r2_file_key`, POST `{r2_file_key, name(fileName), notebook_name, pages, copies, color_mode, duplex_mode, paper_size, binding_type}` (fire-and-forget per item) |
| `C2312t0` (p083t3) | `GET /api/print/drafts` | DraftFetchWorker — loads the user's drafts |
| `C2117x.l` | — | parses the drafts array into cart items `m` (`previewUri = preview-pdf/{key}`, status `"success"`, `pricePaise` from server if present, `r2_file_key`) → `C2310s0` → cart state |
| `H0` (p083t3) | `POST /api/print/drafts/delete` | `{r2_file_key}` — deletes one draft |

Re-ordering from a draft does **not** reuse the R2 file directly: the upload screen re-opens the local PDF (page count → validation → `PrintOrderViewModel.f` cache copy) and **re-uploads** it in a new multipart session (`Fd` second branch, status set to "uploading" before `s()`). The draft's `r2_file_key` is used only for preview.

## Orders dashboard

| Worker | Endpoint | Result state |
|---|---|---|
| `C2301n0` (p083t3) | `GET /api/print/my-orders` | list → `C2299m0` → `f10872K` (orders list); loading flag `f10874M` off |
| `C2320x0` (p083t3) | `GET /api/print/orders/{id}/tracking` | tracking → `C2275a0` case 4 → `C2318w0` (tracking state) |
| `C2308r0` (p083t3) | `GET /api/print/status` | shop status → `C2277b0` case 6 → `C2307q0` (paused banner `f10878Q`: "Store is temporarily paused for new print jobs.") |
| `C2316v0` (p083t3) | `GET /api/print/check-edd?pincode=` | expected delivery date for default/saved address pincode → `C2314u0` |
| `C2289h0` (p083t3) | `GET /api/print/shipping-cost` | shipping price for pincode → subtotal states |

Screens (all in `p102x3`):
- **PrintMyOrdersScreen** (`AbstractC2452ec`) — "My Orders", tabs, `OrderCardItem` (PrintMyOrdersScreen.kt:560)
- **Ub** — order detail with `tracking {awb, courier, estimatedDelivery}` → "Track" action (opens tracking URL)
- **PrintAddressesScreen** (`AbstractC2595nb`) — saved addresses, `AddressCard`, `AddressFormDialog`, `AddressField`
- Dashboard route (`"dashboard"`) in the router shows account/orders entry points; success screen (Gd:1564): *"Your notebooks are queued for printing. You'll receive a confirmation and tracking link shortly."*

## Order state machine (PrintOrderViewModel)

Steps (UI progress): `0` upload screen → `1` (pay click) → verify → success resets everything (`m()`):

- cart items `g` (List<m>) — upload statuses: idle → uploading → success
- shipping address `f10898i` (q), selected default from saved addresses (`C2316v0` picks `isDefault==1`, falls back to first)
- prices: `f10902m` (items subtotal) + `f10904o` (shipping) = total; server rate card `f13537w` fallback
- RazorpayCheckoutData `f10892c0`, pending callback `f10895e0` (volatile)
- error text `f10908w`, loading `f10866E`, payment success state (`f13181s`)
- coupon `f10884W` (C2283e0, `couponCode`) — applied into order creation, never calculated client-side
