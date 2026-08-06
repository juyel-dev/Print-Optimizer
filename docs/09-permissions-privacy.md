# 09 — Permissions, Privacy & Sensitive Features Deep-Dive

> App: **com.notescrafter.app** v4.0.8 (versionCode 48) · minSdk 24 · targetSdk/compileSdk 36
> Source: `NotesCrafter/jadx-out/resources/AndroidManifest.xml` + `jadx-out/sources`

Focus areas (per Play-Console-style review): ads, foreground services, NFC, network
access & connection, notifications, telephony status & identity, receive-data-from-internet.

---

## 1. Manifest snapshot (permissions → actual usage)

| Permission / feature | Declared | Used in app code? | Notes |
|---|---|---|---|
| `INTERNET` | ✔ | ✔ | all API traffic (see §4) |
| `ACCESS_NETWORK_STATE` | ✔ | ✔ | `NetworkUtils.isInternetAvailable` + SDKs |
| `POST_NOTIFICATIONS` (API 33+) | ✔ | ✔ | FCM notifications (§5) |
| `READ_EXTERNAL_STORAGE` (maxSdk 32) | ✔ | ≈ no | files handled via SAF/FileProvider; SDK compat only |
| `WRITE_EXTERNAL_STORAGE` (maxSdk 28) | ✔ | ≈ no | legacy compat |
| `NFC` + feature `android.hardware.nfc` (required=false) | ✔ | **no** | §3 |
| `WAKE_LOCK` | ✔ | SDKs | FCM/WorkManager |
| `FOREGROUND_SERVICE` | ✔ | **no app-owned service** | §2 |
| `com.google.android.c2dm.permission.RECEIVE` | ✔ | ✔ | FCM |
| `com.google.android.gms.permission.AD_ID` + `ACCESS_ADSERVICES_*` | ✔ | SDK only | §1a |
| `READ_BASIC_PHONE_STATE` | ✔ | SDK only | §6 |
| `com.android.vending.CHECK_LICENSE` | ✔ | Pairip | license-check SDK |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | ✔ | SDK only | ad install referrer |
| DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION (signature, self) | ✔ | — | AndroidX |

Also in `<application>`:
- `android:usesCleartextTraffic="true"` — cleartext HTTP is allowed
- `android:name="com.pairip.application.Application"` — Google Play Pairip-protected
  APK (Play Integrity-style obfuscation); `com.pairip.licensecheck.LicenseActivity`
- `largeHeap="true"`, `allowBackup="true"`, Play Store distribution stamp
  (`STAMP_TYPE_DISTRIBUTION_APK`, splits vending metadata)

### 1a. Ads — AdMob is integrated but **disabled at runtime**

Manifest wires the AdMob SDK: application ID `ca-app-pub-1879950570227607~3008333211`,
`MobileAdsInitProvider`, `AdActivity`, `AdService`, `NotificationHandlerActivity`,
`OutOfContextTestingActivity`, `gma_ad_services_config` (Privacy Sandbox).

App-side, there is an **AdMobManager** with **two instances**:

- `pdfAdMobManager` and `quickToolAdMobManager` — constructed in
  `MainActivity.onCreate` Compose scope (`p083t3/C2284f`, saved-state keys
  `"pdfAdMobManager"` / `"quickToolAdMobManager"`)
- Constructor logs `"Ads are disabled — skipping MobileAds SDK initialization"` —
  the SDK is never initialized by app code
- `j()` logs `"Premium mode enabled — ads disabled"` and flips two Compose-observable
  states to `false` (observed with `collectAsState` in the result screen `p102x3/Ee`
  and progress UI `p102x3/Qd`)
- `p083t3/C2300n` (a LaunchedEffect-style coroutine) calls `j()` on both managers
  when the premium/pass state becomes active

No `InterstitialAd` / `RewardedAd` / `AdView` / `loadAd` exists anywhere in app
classes — all such hits are inside the bundled `com.google.android.gms.ads.*`
SDK internals (obfuscated namespaces A1/E1/p067p1/p085u1/p090v1/p110z1/M0/G0).

**Verdict:** AdMob dependency + app ID + ad-services config are baked in and the
manager/state plumbing is in place, but no ad unit is ever loaded in v4.0.8 —
ads are feature-gated (likely for non-premium builds). The only visible "AdMob"
string is the watermark prefix `watermark_label_prefix = "AdMob - "`
(`res/values/strings.xml`) stamped on free exports.

### 1b. Play In-App Review (not ads)

`com/notescrafter/utils/ReviewHelper.java` — prompts Play Store review via Play
Core `requestReviewFlow`/`launchReviewFlow` after **3 successful operations**
(`success_ops_count`), min **7 days** between prompts, never again after
`rated_or_dismissed`. Prefs: `notescrafter_review_prefs`.

---

## 2. Foreground services — none owned by the app

- `FOREGROUND_SERVICE` permission is present because **WorkManager** is used;
  the only foreground-capable service is AndroidX's
  `androidx.work.impl.foreground.SystemForegroundService` (declared by the WM
  library; `G0/b.java` is WM's internal `startForeground` runnable).
- The app itself declares exactly **one** service: `NotesCrafterFCMService`
  (FCM). All heavy work runs on **coroutines**, not services:
  - `com/notescrafter/service/PDFProcessor.java` — native (JNI) PDF engine:
    `initPdfWriter`, `processPage` (invert / grayscale / clear-background / B&W +
    threshold), `removeLogo` (circle/oval regions), `fillRegion*`, `writePageNative`,
    `finishPdfWriter`; jobs are async via `p092v3/o` (single page) and `p092v3/q`
    (full PDF write). Quality auto-downgrades by free RAM: <100 MB → MEDIUM,
    <50 MB → LOW. Output: `getExternalFilesDir(null)/NotesCrafterFiles/` —
    app-private, no storage permission needed.

---

## 3. NFC — declared, never used

Manifest lines 71–74: `<uses-permission android:name="android.permission.NFC"/>`
+ `<uses-feature android:name="android.hardware.nfc" android:required="false"/>`.

Zero usage: no `NfcAdapter`/`NdefMessage`/`NfcManager` in any app class (the only
grep hits live in `androidx.compose.material3` internals). Leftover/planned
declaration, harmless for Play review because `required="false"`.

---

## 4. Network access & connection

### App's own stack (OkHttp + coroutines)
- Request builder = OkHttp `Request.Builder` (merged in `M0/b.java`), client =
  `p092v3/t` (`AuthManager.f13523c`), async via `g4/*` + `e4.d` dispatchers.
- Endpoints seen in this pass:
  - `GET https://notescrafter.com/api/print/rates` → `{success, data:{guest,
    monthly, half_yearly, annual, lifetime: {bw, color}}}` — refreshes the rate
    card (`p092v3/e`, `AuthManager`).
  - `POST https://notescrafter.com/api/notifications/register`
    `{"fcm_token": "…"}` + `Authorization: Bearer <JWT>` — registers FCM token
    (`p092v3/j`); saved to `auth_prefs["fcm_token"]`.
  - `DELETE https://notescrafter.com/api/notifications/register` — unregister on
    logout (`p092v3/k`).
  - (from earlier sessions) multipart upload/order API → Cloudflare R2,
    `preview-pdf/{r2_file_key}`, JWT in `auth_prefs["jwt"]`.
- Connectivity check: `com/notescrafter/utils/NetworkUtils.java` —
  `getActiveNetwork()` + `NetworkCapabilities.hasTransport(WIFI|CELLULAR|ETHERNET)`
  (used pre-upload); swallows `SecurityException`.
- `usesCleartextTraffic="true"` is set (cleartext HTTP permitted).

### SDK-driven network activity (bundled, auto-initialized)
- **GMS ads SDK**: `CONNECTIVITY_CHANGE` receiver mapping network type → class
  (cellular subtype matrix, WiFi/ethernet); on API 31+ registers a
  `TelephonyCallback` when the network is cellular (`A2/k.java` case 4,
  `p105y1/G,H`).
- **FirebaseMessaging**: connectivity-change receiver → retries pending message
  sync (`"Connectivity changed. Starting background sync."`, `A2/k.java` case 5).
- **Play Core**: in-app update receiver — on `install.status == 11`
  (`"Update downloaded"`) triggers the app's update UI (`p092v3/y` +
  `p083t3/C2306q`).
- **Firebase Analytics**: `TRIGGERS_AVAILABLE` receiver (`A2/k.java` case 6),
  standard auto-collection, CCT datatransport.

---

## 5. Notifications

- Default channel meta-data: `order_updates`; `firebase_messaging_auto_init_enabled=true`.
- `com/notescrafter/service/NotesCrafterFCMService` (`onMessageReceived`):
  - requires **title + body** (notification payload); data-only messages parsed
    into a map, dropping `google.*` / `gcm.*` / `from` / `message_type` /
    `collapse_key`
  - channels created on demand: **`order_updates`** (desc "Notifications about
    your print order status", vibration on, badge on, priority HIGH) and
    **`general`** (desc "General announcements and updates from NotesCrafter",
    badge off)
  - image: notification-message image or data `imageUrl`; downloaded with raw
    `URL.openStream()` on background dispatcher (`p092v3/m`), shown as
    BigPicture style (`p092v3/l`); fallback standard layout
  - tap → `MainActivity` intent (NEW_TASK|CLEAR_TOP) with extras
    `notification_type`, `order_number`, `deep_link`
  - icons: small `ic_notification_logo`, large `ic_real_logo`
- Token lifecycle: `onNewToken` → `Q3/a.N(context, token)` → POST to
  `/api/notifications/register` **only if a JWT exists** (logged-in users);
  unregistered on logout.

---

## 6. Telephony status & identity — SDK-only, nothing from app code

- `READ_BASIC_PHONE_STATE` (no `READ_PHONE_STATE`, no `READ_PHONE_NUMBERS`).
- App classes use **no** telephony APIs. The hits belong to bundled SDKs:
  - Firebase Analytics: `getSimOperator()` → `mcc_mnc` user property
    (`p012c1/d.java`)
  - GMS ads SDK: `getNetworkType()` / `isDataEnabled()` / `registerTelephonyCallback`
    for network-class measurement (`p105y1/G,H`, `A2/k.java` case 4)
- Device identity: Firebase Installations (FID) + Analytics app-instance ID —
  standard Firebase behavior, no IMEI/serial access.

---

## 7. Receive data from the internet (other background paths)

- **FCM** (above) + **WorkManager**: `SystemJobService` (BIND_JOB_SERVICE),
  `SystemAlarmService`, `SystemForegroundService`, constraint proxies
  (`NetworkStateProxy` ← `android.net.conn.CONNECTIVITY_CHANGE`,
  battery/storage proxies), `RescheduleReceiver` (BOOT_COMPLETED / TIME_SET /
  TIMEZONE_CHANGED), diagnostics receiver.
- **Razorpay**: `CheckoutActivity`, `MagicXActivity`, `DeeplinkActivity`
  (`razorpay://com.notescrafter.app`), `UpiChooserSelectionReceiver`,
  `RazorpayInitializer`/`CoreInitializer` via AndroidX Startup.
- **Google Sign-In**: `SignInHubActivity`, `RevocationBoundService`.
- **Credential Manager**: `androidx.credentials.playservices.*`
  (`CredentialProviderPlayServicesImpl`).
- **Firebase Analytics**: `AppMeasurementReceiver/Service/JobService`,
  `FirebaseInitProvider`, Installations, datatransport `JobInfoSchedulerService`.
- **Play Core**: review dialog activity + in-app update install receiver.
- **Queries** (package visibility): UPI apps — GPay, PhonePe, Paytm, NPCI UPI,
  Amazon, WhatsApp, Dreamplug, Mobikwik, Airtel; plus `upi://pay` BROWSABLE intent,
  `rzp.device_token.share`, https, custom-tabs service, SEND action.
- Storage: `FileProvider` `com.notescrafter.app.provider` (`xml/file_paths`),
  Room (`MultiInstanceInvalidationService`), EmojiCompat, ProfileInstaller,
  `org.apache.http.legacy` (legacy, Razorpay-era), `android.ext.adservices` lib.

---

## Bottom line for a privacy review

1. No ad SDK initialization in app code; AdMob fully gated off (reserved for
   future/premium) — watermark prefix only.
2. No NFC, no telephony, no foreground service, no location, no camera/mic, no
   contacts/calendar, no device-identity APIs in app code.
3. Network = HTTPS API to `notescrafter.com` (JWT-authenticated), except:
   `usesCleartextTraffic=true` flag and raw `URL.openStream()` for FCM image
   download (no HTTP-auth, but server-controlled URL).
4. Background data = FCM + WorkManager + Firebase Analytics + Play Core
   (review/in-app update) + Razorpay.
5. Files stay in app-private external storage; watermark "AdMob - " on free exports.
