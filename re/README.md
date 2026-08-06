# Print-Optimizer

Reverse-engineered analysis of the **NotesCrafter** Android app (package `com.notescrafter.app`): the print-optimization ("Flow") pipeline — how a PDF is turned into a clean, print-ready document — and the "Quick Tools" suite, entirely **on-device**.

> Analysis of the developer's own app, from their own device (APK extract + decompile + native disassembly). No server interaction is involved in any of the processing.

## What was analyzed

| Layer | Artifact | Tools |
|---|---|---|
| Kotlin/Java (heavily obfuscated Jetpack Compose) | `jadx` decompilation of `base.apk` + splits | [jadx 1.5.6](https://github.com/skylot/jadx) |
| Native enhancement engine | `libnotescrafter-native.so` (arm64-v8a, stripped, ~276 KB) | [rizin 0.9.1](https://github.com/rizinorg/rizin) |

## The "AI Enhancement" secret

The advertised "AI-Powered PDF Enhancement" is **pure pixel math** — no ML, no network calls:

1. **Invert** — `pixel ^ 0xFFFFFFFF`
2. **Grayscale** — Rec.601 luma `(299R + 587G + 114B) / 1000`
3. **Clear background** — if `avg(RGB) <= threshold` → `×1.2` boost, else → white (default threshold `180`)
4. **Black & White (adaptive/local thresholding)**:
   - gamma pre-enhancement: `255 · (luma/255)^0.6`
   - integral image (summed-area table) built in two passes
   - per-pixel **21×21 window** mean, O(1) via the integral image
   - `pixel_luma >= (window_mean − 10)` → white, else black (alpha preserved)
   - This is what makes unevenly-lit scans come out clean.

## Pipeline highlights

- PDF pages decoded with Android's `PdfRenderer` and rendered at **100 / 200 / 300 DPI** (LOW / MEDIUM / HIGH)
- N-up layout (default 3×1), separation lines, page numbers drawn on the sheet canvas
- Each sheet compressed to **JPEG (quality 80)** and embedded as a `DCTDecode` XObject by a **from-scratch native PDF-1.4 writer** (`initPdfWriter` / `writePageNative` / `finishPdfWriter`)
- OOM fallback: bitmaps recycled, quality downgraded, page retried (max 3×)
- Output saved to app-private storage and shared via `FileProvider`

## Repository layout

```
├── README.md
├── sources/                # Key decompiled sources (package structure preserved)
│   ├── com/notescrafter/service/PDFProcessor.java   # JNI bridge
│   ├── com/notescrafter/service/NotesCrafterFCMService.java  # FCM + notification channels
│   ├── com/notescrafter/utils/NetworkUtils.java     # Connectivity check (NetworkCapabilities)
│   ├── com/notescrafter/utils/ReviewHelper.java     # Play In-App Review trigger logic
│   ├── com/notescrafter/utils/AnalyticsManager.java  # Firebase Analytics wrapper (5 event types)
│   ├── com/notescrafter/PrintOrderViewModel.java    # Print-order state machine + upload trigger
│   ├── com/razorpay/t.java                          # Multipart upload worker (Rasp-obfuscated)
│   ├── com/google/.../measurement/C2117x.java       # PrintApiClient: full REST surface
│   ├── p083t3/             # Y.java (FlowViewModel), L.java (success screen),
│   │                       # X/V (download workers), A.java (Preview/PdfCrop), C2306q (Enhance),
│   │                       # C2315v (back-dispatch), C2311t (analytics), C2323z/C2319x (ads/header),
│   │                       # C2275a0/X0/W0/Y0 (upload progress/success workers)
│   ├── p087u3/             # All flow data models & enums (a–u), m.java (cart item)
│   ├── p092v3/             # q.java (processing worker), h/d/b (AuthManager), e/f (rates/status)
│   ├── p097w3/             # f/e/d/b/c/r.java — BottomNavBar (5 destinations) + NavItem
│   ├── p083t3/             # Payment/drafts/orders workers (F/F0/E0/G0/d1/Z0/c1/C2282e,
│   │                       # C2285f0, C2277b0, C2291i0, C2299m0, C2301n0, C2308r0,
│   │                       # C2320x0, C2312t0, C2316v0, H0/U0/W0, C2275a0, X0, S.java)
│   └── p102x3/             # LandingScreen (AbstractC2574m6), UploadScreen (ef),
│                           # Ud.java (QuickToolsScreen + registry), Rd.java (QuickTool),
│                           # Td.java (ToolCard), Q8.java (PdfMergeScreen),
│                           # GlobalHomeScreen (AbstractC2684t5), Ec.java (PlaceOrder),
│                           # Fc.java (pay bar), C2460f4, F3.java (ContactUs),
│                           # AbstractC2598ne.java (Settings), AbstractC2471g (About),
│                           # F5.java (InfoPages), com/notescrafter/MainActivity (Razorpay)
└── docs/
    ├── 01-architecture.md     # App architecture, state machine, layers
    ├── 02-user-journey.md     # Landing → download: exact strings & screen logic
    ├── 03-values-defaults.md  # Enums, prefs keys, defaults, formatting rules
    ├── 04-tools.md            # Quick Tools: registry, routes, isolation, add-a-tool recipe
    ├── 05-print-upload.md     # Print upload: multipart→Cloudflare R2, API client, auth
    ├── 06-checkout-payment.md # Orders: Razorpay checkout/verify, cloud drafts, dashboard
    ├── 07-home-screen.md      # Global home: hero, product cards, trust badges
    ├── 08-navbar-settings-contact.md  # Top bar tabs, BottomNavBar, Settings & Contact
    ├── 09-permissions-privacy.md  # Permissions & privacy deep-dive (ads/NFC/network/FCM/telephony)
    ├── 10-analytics-scrolling-touch.md  # Analytics events, scroll containers, touch gestures
    ├── 11-todo-pomodoro.md       # To-Do tab: tasks, exams, clock, calendar + Pomodoro timer
    ├── 12-downloads-upload.md    # Downloads list, file actions, rename/delete, source picker, reprocess
    ├── 13-logo-removal-ui.md     # LogoSelectionScreen: overlay, fine-tune pads, shape/mode enums
    ├── 14-promo-help-error-components.md  # Flash-sale dialog, promo banner, Help/FAQ, ErrorScreen, WarningBanner
    ├── 15-home-about-components.md  # Features/Landing/About/GlobalHome/EditPage sub-components
    ├── 16-livechat-community.md  # Live Chat (stub), Community social links, Community Pass tiers
    ├── 17-auth-google-signin-addresses.md  # CredentialManager Google Sign-In, JWT exchange, address book API
    ├── 18-quick-tools-step-screens.md  # 9 tool step screens, empty "Calculators" category, notebook leftovers
    ├── 19-tech-stack.md        # Languages, Compose/MVVM, OkHttp+org.json, AdMob/Firebase/Razorpay/PairIP, build fingerprint
    ├── 20-flow-pipeline-tech-stack.md  # Stage→tech map (SAF, PdfRenderer, native .so, Canvas layout, C PDF-1.4 writer) + all processing constants
    ├── flow.md                # End-to-end flow: upload → process → download
    ├── native_algorithm.md    # processPage() native pipeline, step by step
    └── disassembly/           # rizin dumps of every JNI export
        ├── processPage.txt
        ├── processPage_rest.txt
        ├── removeLogo.txt
        ├── invertRegion.txt
        ├── invertRegionOval.txt
        ├── fillRegion.txt
        ├── fillRegionOval.txt
        ├── initPdfWriter.txt
        ├── writePageNative.txt
        └── finishPdfWriter.txt
```

## Key files in the original app (obfuscated names)

| Purpose | Class |
|---|---|
| Flow state machine (`Y`: −1 Landing, 0 Upload, 2 Reorder, 3 Preview, 4 Enhance, success) | `p083t3/Y` |
| Core processing worker (`invokeSuspend`, full instruction dump) | `p092v3/q` |
| JNI bindings (`PDFProcessor`: `processPage`, `removeLogo`, `fillRegion`, `invertRegion`, `initPdfWriter`, `writePageNative`, `finishPdfWriter`) | `com.notescrafter.service.PDFProcessor` |
| Filter settings (`invertColors`, `clearBackground`, `grayscale`, `blackAndWhite`, `backgroundThreshold`, `removeLogo`, `logoBox`, `logoShape`) | `p087u3/b` |
| Output settings (`quality`, `documentSize`, `orientation`, `nupRows`, `nupColumns`, `addSeparationLines`, `addPageNumbers`) | `p087u3/e` |
| Per-page manual edits (`InvertRect`, `InvertOval`, `MaskRect(rect,color)`, `MaskOval(rect,color)`) | `p087u3/h` |
| Success/download screen (View / Share / Process Another) | `p083t3/L` |
| Download (reprocess) worker | `p083t3/X`, `p083t3/V` |

## Documentation index

1. **[01 — App architecture](docs/01-architecture.md)** — stack, package map, FlowViewModel state machine (`-1` Landing → 0 Upload → 2 Reorder → 3 Preview → 4 Enhance → Success), worker, native side.
2. **[02 — User journey](docs/02-user-journey.md)** — every screen with its exact UI strings (landing copy, 12 feature tiles, social-proof stats, success buttons) and the logic behind each transition.
3. **[03 — Values & defaults](docs/03-values-defaults.md)** — full `enhance_prefs` key table, enum values (Quality 72/150/300 DPI, PageSize, Orientation), data-class defaults, rendering constants, PDF writer constants.
4. **[04 — Quick Tools](docs/04-tools.md)** — the Tools suite: static registry (`QuickTool` list), string-route navigation, 10 tools & their routes, shared components, isolation model, ad/header rules, recipe for adding a new tool.
5. **[05 — Print upload](docs/05-print-upload.md)** — the server side of PRINTS: multipart upload (init/chunk/complete/abort) into Cloudflare R2, the `PrintApiClient` endpoint surface, JWT/Firebase auth, upload state machine, error taxonomy.
6. **[06 — Checkout & payment](docs/06-checkout-payment.md)** — the paid half of PRINTS: order creation, server-mediated Razorpay checkout + signature verification, pending-payment UI pattern, cloud drafts (save/re-list/delete/re-order), orders dashboard (my-orders/status/tracking/EDD).
7. **[07 — Global home](docs/07-home-screen.md)** — the landing screen: gradient hero, FLOW/PRINTS/TOOLS product cards with press-scale animations, trust badges, WebStyleCTA.
8. **[08 — Navigation, Settings & Contact](docs/08-navbar-settings-contact.md)** — adaptive top bar (logo header + FLOW/PRINTS/TOOLS tabs), the 5-destination BottomNavBar (Contact/To-Do/Home/My Orders/Setting), the Settings & Info hub (plan badges, legal pages), and Contact Us (email/WhatsApp/phone deep links).
9. **[09 — Permissions & privacy](docs/09-permissions-privacy.md)** — every manifest permission/feature mapped to code: AdMob (integrated but disabled, watermark prefix), no NFC/telephony/foreground-service usage, FCM notifications & token registration, OkHttp API surface, Play Review/in-app update, SDK-only telemetry.
10. **[10 — Analytics, scrolling & touch](docs/10-analytics-scrolling-touch.md)** — `AnalyticsManager` events (screen_view/cta_click/filter_toggle/handled_error), full route→screen map, scroll containers (Column+verticalScroll vs Lazy lists), HorizontalPager sliders, the EditPage drag-to-draw mask gesture, and everything that's absent (haptics/zoom/sticky/reorder).
11. **[11 — To-Do & Pomodoro](docs/11-todo-pomodoro.md)** — the To-Do tab: `ToDoManager` (Gson in SharedPreferences), task/exam models, AnalogClock + CalendarWidget, urgent-exam pulse, animated task rows, and the Pomodoro setup→timer flow (landscape lock, countdown ring, control buttons, ephemeral setup values).
12. **[12 — Downloads & source picker](docs/12-downloads-upload.md)** — the Downloads list (`NotesCrafterFiles` storage, `H3` model, newest-first loader), view/share/delete/rename actions, and the Upload screen's `PdfSourcePickerDialog` + `Fd` reprocess pipeline (page-count validation, new BW job).
13. **[13 — Logo removal UI](docs/13-logo-removal-ui.md)** — `LogoSelectionScreen`: normalized `RectF` selection (default top-right), `RECTANGLE/CIRCLE` shapes, `BOTH/WIDTH/HEIGHT` resize modes, overlay canvas, move/resize fine-tune pads, page preview, and its link to the native `removeLogo` region.
14. **[14 — Promo/help/error components](docs/14-promo-help-error-components.md)** — `WeekendFlashSaleDialog` (live/upcoming title logic), `AnimatedPromoBanner` (rotating `AnimatedContent`), `HelpCenterScreen`/`FAQCard`, `ErrorScreen`, `WarningBanner`.
15. **[15 — Home/About/Edit components](docs/15-home-about-components.md)** — `FeaturesScreen`/`FeatureCard`, Landing sections (`HowItWorksSection`, `StepItem`, `FeaturesSection`, `AIBadge`), `AboutUsScreen` (`TechItem`/`StatCard`/`ValueItem`), `GlobalHomeScreen` (`BrandFeatureBadge`, `WebStyleCTA`, `ToolGridItem`), `EditPageScreen` (`SelectionOverlay`, `ToolOption`, `HistoryButton`).
16. **[16 — Live Chat & Community](docs/16-livechat-community.md)** — `LiveChatScreen` is a stub (static placeholder, no chat transport), `CommunityScreen` social link cards (Telegram etc.), `CommunityPassScreen` tiers + `ComparisonTable` + sign-in gate.
17. **[17 — Google Sign-In & addresses](docs/17-auth-google-signin-addresses.md)** — `AuthManager`: CredentialManager Google ID → idToken → `POST /api/auth/mobile` → JWT; full `auth_prefs` map, per-plan page rates, logout; `PrintAddressesScreen` (gate when logged out), address model + `/api/print/shipping-addresses/` CRUD.
18. **[18 — Quick Tools step screens](docs/18-quick-tools-step-screens.md)** — file map + shared state machine for all 9 tool screens, the empty **"Calculators"** category, and the PRINTS notebook leftovers (`PrintNotebookItem`, `NotebookConfiguratorCard`, `A4CoverPage`, `LiveNotebookCoverShowcase`).
19. **[19 — Tech stack](docs/19-tech-stack.md)** — full dependency fingerprint: Kotlin+Compose (Material3 1.3.1) MVVM, OkHttp3+org.json, no DI/Retrofit/Room-usage, 9 JNI exports, AdMob (2 banner units), Firebase Analytics/Messaging, Play Core update+review, Razorpay checkout+NFC, PairIP licensing, R8 full-mode, build fingerprint (SDK 36 / coroutines 1.9.0 / Baseline Profiles).
20. **[20 — Flow pipeline tech stack](docs/20-flow-pipeline-tech-stack.md)** — no-i18n verdict; stage→tech map (SAF picker, `PdfRenderer` render, native `libnotescrafter-native.so` enhance, Kotlin/Canvas layout, JPEG-80 + from-scratch C PDF-1.4 writer); merge = same pipeline; full constants table (invert XOR, Rec.601, *1.2 boost, gamma 0.6, ±10 window, -10 bias, DPI ratios 1.38/2.77/4.16, quality fallbacks).
21. **[Flow](docs/flow.md)** — processing pipeline end to end.
22. **[Native algorithm](docs/native_algorithm.md)** — `processPage()` step by step.
23. **[Disassembly](docs/disassembly/)** — rizin dumps of all 9 JNI exports.

## Disclaimer

Educational / interoperability research only. No app binaries are distributed in this repository — only the analysis and algorithm descriptions.
