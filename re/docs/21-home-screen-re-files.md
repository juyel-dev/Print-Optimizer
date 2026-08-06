# 21 — NotesCrafter HOME screen RE: file-by-file index

> RE target: `com.notescrafter.app` v4.0.8 (versionCode 48, minSdk 24, targetSdk 36)
> Ground truth: `../NotesCrafter/jadx-out/` (jadx decompile). Companion docs: `07-home-screen.md` (layout detail), `19-tech-stack.md`, `20-flow-pipeline-tech-stack.md`.
> Purpose of THIS doc: label every code file examined during the "what does the user see on app open" RE, so anyone reading the repo knows instantly which file does what and where to look next.

---

## 1. First-screen experience (one paragraph)

Opening the app shows a dark blank window (the "splash" is just `Theme.NotesCrafter`'s dark windowBackground while Compose boots), then on Android 13+ a POST_NOTIFICATIONS permission dialog, then directly the Home screen — there is **no onboarding, no welcome flow, no first-launch flag**. Home = brand hero ("NotesCrafter" gradient title + logo + tagline "Reimagining the Student Learning Experience"), three product cards (FLOW / PRINTS / TOOLS), two trust badges (100% Secure · Processed Locally / Lightning Fast · Offline Capabilities), top-right cart + downloads icons, and a 5-item bottom nav (Contact, To-Do, Home, My Orders, Setting). Initial route is hard-coded to `"home"` (M.java:393).

---

## 2. Launch chain (files examined, in call order)

```
AndroidManifest.xml  ──launcher──▶  com.notescrafter.MainActivity
MainActivity.onCreate ──setContent▶  p107y3.b.a (theme)
                                    └▶ p083t3.S.b (scaffold/RouteScope)
                                       └▶ p083t3.L.b (NotesCrafterContent / router)
                                          initial route "home" (p083t3/M.java:393)
                                          └▶ GlobalHomeScreen (p102x3/AbstractC2684t5)
```

---

## 3. File index — which file contains what

| # | File (under `re/NotesCrafter/jadx-out/`) | Original name (if known) | Contains / label |
|---|---|---|---|
| 1 | `resources/AndroidManifest.xml` | — | Package, launcher activity, permissions, version. **Entry point proof**: MAIN+LAUNCHER = `com.notescrafter.MainActivity`. No splash/onboarding activity exists. |
| 2 | `sources/com/notescrafter/MainActivity.java` | MainActivity.kt | `onCreate`: edge-to-edge insets (#0A0A0F dark), cutout mode, `Checkout.preload` (Razorpay), in-app update check, `NotesCrafterFiles` dir under externalFilesDir, **POST_NOTIFICATIONS runtime request (API 33+, code 101)**, 2 AdMob banners (`ca-app-pub-1879950570227607/...`), Analytics init, `setContent` → theme → S.b → L.b. Also Razorpay payment result callbacks → `PrintOrderViewModel.onPaymentFailed/success`. |
| 3 | `resources/res/values/styles.xml` | — | `Theme.NotesCrafter` = `Theme.Material.NoActionBar`, dark `windowBackground`/status/nav bar. The fake "splash". |
| 4 | `sources/p083t3/L.java` | NotesCrafterContent / central router | String-based router: destination switch (`home` case at L:2751 → GlobalHomeScreen; `flow` at L:517). THE map of every screen + its route name. |
| 5 | `sources/p083t3/M.java` | Router state / NavHost | Initial route state `"home"` (M:393) — proves Home is the first screen, no onboarding gate. |
| 6 | `sources/p083t3/S.java` | Scaffold + RouteScope | App scaffold wiring: top bar, bottom bar visibility, route lambdas passed into screens. |
| 7 | `sources/p083t3/C2313u.java` | flow step navigation helper | FLOW/PRINTS card tap → route `"flow"`, step −1 (opens Downloads screen of the flow). |
| 8 | `sources/p102x3/AbstractC2684t5.java` | **GlobalHomeScreen.kt** (line 52) | THE HOME SCREEN: hero (gradient "NotesCrafter" 40sp ExtraBold, tagline 18sp Bold), `ProductContainer` (card, press-scale 0.98, line 337), `WebStyleCTA` (line 418, fontScale 1.3), `ToolGridItem` (line 512), `BrandFeatureBadge` (line 552). Stateless — only 3 nav lambdas. |
| 9 | `sources/p102x3/C2557l5.java` | FLOW card content | "Start Processing" + "Upload dark slides and download printable notes" + "Free Access" badge. |
| 10 | `sources/p102x3/C2621p5.java` | PRINTS card content | "Print & Deliver" + "Get custom printed notebooks at your doorstep" + "₹0.89/page". |
| 11 | `sources/p102x3/C2637q5.java` | TOOLS card content | "Tools" + tool grid (comes from tool registry). |
| 12 | `sources/p102x3/X3.java` | DownloadsScreen.kt (line 58) | "My Downloads" + "All your processed PDFs are stored here"; empty state (FolderOpen icon, "No downloads yet", "Process your first PDF to see it here"); file cards with open/share/delete. |
| 13 | `sources/p102x3/AbstractC2574m6.java` | LandingScreen.kt | "Make Your Notes\nPrintable" (42sp, "Printable" gradient), gradient "Start Processing" button, 16:9 showcase image, "Why Choose Us?" (animated "AI-Inspired Document Processing"), "How It Works", "Free Forever" badge. |
| 14 | `sources/p097w3/f.java` | BottomNavBar.kt (line 65) | **Bottom nav 5 items** (exact list below): Contact, To-Do, Home, My Orders, Setting + route names + icons (Chat, Checklist, Home, Assignment, Settings). |
| 15 | `sources/p083t3/D.java` | Download file card | Reusable file card composable (name, size, open/share/delete icons) used by DownloadsScreen. |
| 16 | `sources/p083t3/Y.java` | PrintOrderViewModel | Flow state machine (currentStep, `g()` setter, `h()` reset); SharedPreferences `"enhance_prefs"` with **defaults** (see §5). |
| 17 | `sources/p107y3/a.java` | Design tokens | Brand gradient pair `f15978a→f15979b`, text colors (`f15990o`), spacing — the app's palette source. |
| 18 | `sources/p083t3/C2274a.java` / `C2276b.java` | TopBar icons | Cart icon with badge; Downloads icon (top-right of home). |

---

## 4. Key decompiled snippets

### 4.1 Launcher proof + onCreate essentials (MainActivity.java)

```java
// MainActivity.java (com.notescrafter)
// setContent: theme -> scaffold -> router (compressed by jadx)
ComposableLambda composableLambda = ComposableLambdaKt.composableLambdaInstance(
    -546050999, true, new C2284f(this, 1));          // C2284f = root composable lambda
composeView2.setContent(composableLambda);           // Compose UI begins here

// Notable onCreate calls:
Checkout.preload(getApplicationContext());                     // Razorpay SDK
if (Build.VERSION.SDK_INT >= 33 && ...POST_NOTIFICATIONS... != 0) {
    p098x.b.c(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);  // permission dialog
}
this.f10856I = new b(this, "ca-app-pub-1879950570227607/4664195660");   // AdMob banner unit 1
this.f10857J = new b(this, "ca-app-pub-1879950570227607/5837949600");   // AdMob banner unit 2
File file = new File(getExternalFilesDir(null), "NotesCrafterFiles");   // app working dir
```

### 4.2 Bottom nav — the 5 tabs (f.java:33)

```java
f13615a = v.S(
    new r(ChatKt.getChat(outlined),             "Contact",   "contact-us"),
    new r(ChecklistKt.getChecklist(outlined),   "To-Do",     "dashboard"),
    new r(HomeKt.getHome(outlined),             "Home",      "home"),
    new r(AssignmentKt.getAssignment(...),      "My Orders", "my-orders"),
    new r(SettingsKt.getSettings(outlined),     "Setting",   "settings"));
```

### 4.3 Default convert settings on first run (Y.java — prefs `"enhance_prefs"`)

```java
invert_colors      = true    (default)
clear_background   = true    (default)
grayscale          = false
black_and_white    = false
background_threshold = 180
quality            = "HIGH"
document_size      = "A4"
nup_rows           = 3
nup_cols           = 1
add_page_numbers   = true
```

---

## 5. Obfuscation map (jadx renamed → original)

| jadx file | Original Kotlin |
|---|---|
| `p102x3/AbstractC2684t5.java` | GlobalHomeScreen.kt |
| `p102x3/X3.java` | DownloadsScreen.kt |
| `p102x3/AbstractC2574m6.java` | LandingScreen.kt |
| `p097w3/f.java` | BottomNavBar.kt (ui/components) |
| `p083t3/L.java` | NotesCrafterContent (router) |
| `p083t3/Y.java` | PrintOrderViewModel |

---

## 6. Where to go next (routes from Home)

| Card / icon | Route | Screen |
|---|---|---|
| FLOW card | `"flow"` step −1 | Downloads screen (flow) |
| FLOW CTA / PRINTS card | `"flow"` step −1 | Downloads screen (flow) |
| TOOLS card | `"flow"` step 0 | LandingScreen ("Make Your Notes Printable") |
| Downloads icon | downloads | My Downloads |
| Bottom nav tabs | `contact-us`, `dashboard`, `home`, `my-orders`, `settings` | respective screens |

Next RE candidates: `p083t3/L.java` full route table (every screen in the app), then `20-flow-pipeline-tech-stack.md` already covers the flow screens (upload → settings → convert → PDF).
