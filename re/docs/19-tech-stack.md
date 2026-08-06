# 19 — Tech stack & build fingerprint

> App: **com.notescrafter.app** v4.0.8 (versionCode 48) · AAB
> Evidence: `jadx-out/sources` · `META-INF/*.version` · `AndroidManifest.xml` ·
> `base.apk`/`split_config.arm64_v8a.apk`

## 1. Signal summary

| Layer | Choice | Evidence |
|---|---|---|
| Language | **Kotlin** (stdlib + coroutines) w/ some Java | `kotlin/`, `kotlinx_coroutines_core=1.9.0` |
| UI | **Jetpack Compose 100%** | material3 1.3.1, ui, foundation, animation, icons-extended |
| Activity | **Single-Activity, all-Compose** | `com.notescrafter.MainActivity` : ComponentActivity |
| Architecture | MVVM + **manual DI** (no Koin/Hilt/Dagger) | `PrintOrderViewModel`, `C2358m` factory, holder-singletons (`AuthManager`, `AnalyticsManager`, …) |
| Networking | **OkHttp3 + org.json** (manual parsing) | `okhttp3/`, `JSONObject` everywhere; **no Retrofit, no kotlinx.serialization, no Moshi** (Gson bundled but unused) |
| Database | **None effectively** | Room 2.2.5 bundled, **zero `@Entity`/DAO** → dead dependency |
| Native | **C/C++** `libnotescrafter-native.so` (+ androidx graphics-path) | `System.loadLibrary("notescrafter-native")` in `NotesCrafterApp` |
| Protection | **PairIP licensing** wrapper | `com.pairip.*` (LicenseClient, LicenseActivity, …) |
| R8 | Full minification — **all app packages renamed** `p000a`–`p111z2` | decompile output |

## 2. Language & concurrency

- Kotlin stdlib + **kotlinx-coroutines 1.9.0** (`kotlinx_coroutines_core`),
  `kotlin/coroutines` dir; Dispatchers/Main used by all workers.
- `kotlinx_coroutines_play_services` — coroutines <-> Tasks bridge.
- Java: several non-Kotlin app classes remain (decompiled wrns); the core
  processing class `pdfprocessor.…` is Kotlin (`DateTime` etc.).
- Native: `libnotescrafter-native.so` (arm64-v8a only) exports **9 JNI
  methods** on `com.notescrafter.service.PDFProcessor`:
  `initPdfWriter(String)→long`, `writePageNative(long, byte[], int, int)`,
  `finishPdfWriter(long)`, `processPage(int[],int,int,boolean×4,int)`,
  `fillRegion`, `fillRegionOval`, `invertRegion`, `invertRegionOval`,
  `removeLogo(array,size,…,rect…)`. Loaded in `NotesCrafterApp` static init.
- `libandroidx.graphics.path.so` — Jetpack `graphics-path` (Compose text).

## 3. UI framework

- **AndroidX Compose (Material3 1.3.1)** — `androidx.compose.*`: ui,
  foundation, material (icons-extended), animation, runtime.
- `androidx.lifecycle` 2.8.7 (`lifecycle-runtime-compose`,
  `lifecycle-viewmodel-compose`), `androidx.activity:activity-compose` 1.9.3.
- Dark-only theme `#0A0A0F` background `background_dark`, purple accent
  `#a855f7`; edge-to-edge via `WindowInsetsController` (custom, not
  androidx `EdgeToEdge`).
- Icons: **material-icons-extended** (huge icon set — `p1xx`/`P1xx` export).

## 4. Networking

- Single client: **OkHttp3** (custom `okhttp3.internal`), mocks nothing.
- JSON build/parse is **`org.json`** (`JSONObject`) — e.g.
  `MainActivity.onPaymentSuccess` fills `{razorpay_order_id, payment_id,
  signature}`.
- Endpoints all `https://notescrafter.com/api/…` (auth/mobile, print/orders,
  print/shipping-addresses, print/files, notifications/register).
- Gson (`com.google.gson`) present but never constructed by app — a
  transitive dep.

## 5. Persistence

- **SharedPreferences** everywhere (`auth_prefs`, `enhance_prefs`,
  `notescrafter_review_prefs`, …).
- Files: `getExternalFilesDir(null)/NotesCrafterFiles` (split/result PDFs).
- **Room 2.2.5** shipped but **no RoomDatabase/Entity/DAO** found → dead dep
  (probably leftover or from another lib).
- No SQLite/LiteColumn usage by app code.

## 6. 3rd-party SDKs (bundle `META-INF/*.version`)

| SDK | Component | Notes |
|---|---|---|
| **AdMob** (GMS ads) | `MobileAds`/`AdView`, ad-services config | app id `ca-app-pub-XXXXXXX~3008333211`, **2 banner units** (`…/4664195660`, `…/5837949600`) created in `MainActivity.onCreate` (free-plan banners) |
| **Firebase Analytics** | `com.google.firebase.analytics` | `AnalyticsManager` singleton: `screen_view`, `cta_click`, `filter_toggle`, `handled_error` |
| **Firebase Messaging** | `firebase-messaging` + `installations` + `iid` | `NotesCrafterFCMService`, data push → local notification |
| **Google Play Core** | `play-core` (install, review level) | in-app update (`getAppUpdateInfo` in `onCreate`), in-app review (`ReviewHelper`: prefs `notescrafter_review_prefs`, gates: ≥3 ops, ≥7 days) |
| **androidx.credentials** | `credentials` 1.3.0 + `credentials-play-services-auth` | Google Sign-In (see 17) |
| **Razorpay** | `com.razorpay` checkout + nfc | checkout (`PaymentResultWithDataListener`, `Checkout.preload`), **EMV/NFC tap** (`CardData`, `EmvCommands`, `NfcHelper`); `rzp_config_checkout.json`, `rzp_loader.xml` UI |
| **Firebase** | `installations`, `datatransport`, `measurement` | project `notescrafter-d3be8`, bucket `notescrafter-d3be8.firebasestorage.app` |
| **GMS auth** | `ads`, `auth`, `auth-api-phone`, `fido`, `identity` | presence only; phone/identity unused by app |
| **PairIP** | `com.pairip.*` LicenseClient | license enforcement wrapper (LicenseActivity, RepeatedCheckMetadata) |
| **Coil** | `coil` | image loading (`AsyncImage` in `N0/*` — logo previews, cover art) |
| Stubware | privacy-sandbox, measurement | transitively bundled |

Not bundled: `. Crashlytics`, `. BillingClient` (payments go through the
**server** + Razorpay web-checkout, not Play Billing), `. Google Maps`.
(play-services-maps/new play-services-wallet jars ship as transitive
overheads of Razorpay checkout but are never invoked.)

## 7. Build fingerprint

- Compiled **compileSdk 36, targetSDK 36, minSDK 24** (API 24).
- **AAB** with per-ABI split; JNI only for `arm64-v8a`
  (`libnotescrafter-native.so`).
- R8 **full mode** — app packages renamed `p000a…p111z2`, fields/params
  k-renamed (`fxxxx`, `m…`), strings kept.
- Baseline profile shipped (`assets/dexopt/baseline.prof`) +
  `profileinstaller` → **Baseline Profiles** enabled.
- kotlinx-coroutines**1.9.0** ⇒ **Kotlin 1.9.x** toolchain; Material3 1.3.1
  + lifecycle 2.8.7 ⇒ **Compose BOM 2025-ish**; all consistent with a
  **mid-2025** build (Android 16, API 36).
- `versionCode 48`, versionName `4.0.8`.

## 8. Dead / bundled-but-unused

| lib | why bundled | usage |
|---|---|---|
| room 2.2.5 | transitive (`androidx.sqlite`) | 0 |
| navigation-compose 2.8.5 | maybe habit | **0 `NavHost` refs** — app uses custom route dispatcher (`p083t3/L.java` switch-on-string) |
| gson | razorpay | 0 |
| play-services-maps / wallet | razorpay | 0 |