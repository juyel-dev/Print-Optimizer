# 22 — LandingScreen (FLOW destination): complete implementation map

> RE target: `com.notescrafter.app` v4.0.8 (versionCode 48). Decompiled ground truth: `../NotesCrafter/jadx-out/`.
> Page: the screen shown when the user taps **FLOW** on the Home screen.
> This is a **recursive implementation map** — every file needed to reconstruct this page 100% is identified, traced to leaf dependencies, and labeled (obfuscated jadx name → original Kotlin name where known).
> Verdict (corrected): FLOW tap opens **LandingScreen**, step 0 — **NOT** DownloadsScreen. DownloadsScreen (X3.java) only opens from the top-bar Downloads icon / cart (C2313u modes 0–1 via C2319x top bar). See §14.

---

## 0. Identity

| | |
|---|---|
| Original Kotlin file | `com.notescrafter/ui/screens/LandingScreen.kt` (proved by compose trace names, e.g. `com.notescrafter.ui.screens.LandingScreen (LandingScreen.kt:47)` at AbstractC2574m6.java:446) |
| Decompiled file | `sources/p102x3/AbstractC2574m6.java` (670 lines, 6 composables) |
| Page purpose | Marketing/entry page of the print pipeline — "Make Your Notes Printable" + CTA |
| UI framework | Jetpack Compose (Material3), dark theme |

---

## 1. Exact source files responsible for this page

| Role | File (jadx) | Original name | Evidence |
|---|---|---|---|
| Screen | `p102x3/AbstractC2574m6.java` | `ui/screens/LandingScreen.kt` | trace: `LandingScreen (LandingScreen.kt:47)`; `StepItem (LandingScreen.kt:344)` |
| — sub-composables | same file, methods `a`→`f` | `AIBadge`(:212), `FeatureCard`(:406), `FeaturesSection`(:371), `HowItWorksSection`(:312), `LandingScreen`(:47), `StepItem`(:344) | trace names (file:line) |
| Step data class | `p102x3/C2693te.java` | `StepItem`-data (icon, title, subtitle, index) | used by `HowItWorksSection` list |
| Layout wrapper | `p083t3/M.java` (RouterState, initial route), `p083t3/S.java` (Scaffold + RouteScope) | `M.kt` / `S.kt` | launch chain doc 21 §2 |
| Router (screen switch) | `p083t3/L.java` | `NotesCrafterContent` | `case "flow"` at L:517; step 0 → `AbstractC2574m6.e` at L:691 |
| Route writer | `p083t3/C2313u.java` (mode 2) | flow-step nav helper | home case: L:2757 `new C2313u(y4, mutableState, 2)` → `"flow"` + `g(0)` |
| Route names table | `p083t3/C2315v.java` | route lambdas | `setValue("flow"|"tools"|...)` |
| ViewModel (state) | `p083t3/Y.java` | `PrintOrderViewModel` | step/uri state, `g()`, `h()` |

---

## 2. Dependency graph (recursive)

### 2.1 Direct imports of AbstractC2574m6.java (all 45 imports, resolved)

| Import | What it is / why used |
|---|---|
| `com.notescrafter.app.R` | **`showcase_image.webp`** asset (painterResource) |
| `p107y3.a` | **DesignTokens** — all colors/gradients (f15978a, f15979b, f15990o, f15994w, f15995x …) |
| `p097w3.j` | **GlassCard** (`ui/components/GlassCard.kt:26`) — glass card composable used by `StepItem` (j.a at line 660) |
| `C3.v` | Kotlin collection helpers (`v.S(...)` = `arrayOf/listOf`; extends `p003a2.a`) |
| `O3.c`, `O3.e`, `O3.a` | Kotlin stdlib function interfaces (Function0/1/2…, used by lambda classes) |
| `p076s.b` | Compose internal remember/group helpers (`b.k`, `b.j`, `b.n`, `b.g`, `b.m`) |
| `p083t3.C2292j` | updateScope lambda for FeatureCard recomposition (not a composable) |
| `kotlin.jvm.internal.o` | `o.f(...,"param")` non-null param asserts |
| `p003a2.a` | (transitive via C3.v) `a.w(from,to,2)` step-loop helper for the 2-col grid |

### 2.2 Compose framework imports (Material3 + foundation + runtime)

`material3` (IconKt, MaterialTheme, TextKt), `foundation` (Background, Border, Canvas, Clickable, Image, Scroll, layout.*, shape.RoundedCornerShape), `ui` (Alignment, Brush, Color, Modifier, Clip, Scale, Shadow, ContentScale, SpanStyle, TextStyle, FontWeight, FontFamily, TextAlign, Dp …), `runtime` (Composer, State, Updater, remember…), `animation.core` (**InfiniteTransition** — pulsing animations).

### 2.3 Icons (Material icons module)

`Icons.Filled.Favorite` (Free Forever ❤), `Icons.Filled.ArrowForward` (button →), `Icons.Outlined.UploadFile` (button ⬆), `Icons.Outlined.Upload`, `.Visibility`, `.AutoFixHigh`, `.GridView`, `.Memory`, `.Download` (6 How-It-Works steps).
→ Note: GridView/Memory/AutoFixHigh come from `material-icons-extended` artifact.

### 2.4 Transitive leaf dependencies (no further app code)

- `p107y3/a.java` → static `long` color constants only (no imports besides Color) ✅ leaf
- `C2693te` → ImageVector + text only ✅ leaf
- `C2313u` → route string + `Y` (viewmodel) + step ints ✅
- `C2315v` → route strings only ✅ leaf
- `Y` (PrintOrderViewModel) → extends `androidx.lifecycle.X` (ViewModel); state = `T` (`androidx.compose.runtime.MutableState`); holds SharedPreferences `"enhance_prefs"`; touches `com.notescrafter.service.PDFProcessor` (used later in flow, not on this page)

---

## 3. UI component hierarchy (parent → child)

```
LandingScreen (m6.e, :47)                                  [Column, fillMaxSize, verticalScroll]
│
├─ Spacer(f5)
├─ FreeForeverBadge ── Box(pill, horizontalGradient #22C55E→#059669, clip RoundedCornerShape)
│   └─ Row(centerVertically)
│       ├─ Icon(Favorite, filled)
│       └─ Text("Free Forever", labelLarge, WHITE, Bold)
│
├─ AIBadge (m6.a, :212)                                    [infinite pulse animation]
│   └─ Box(pill, linearGradient #A855F7→#6366F1, circle clip, scaled by pulse)
│       └─ Text("AI-Inspired Document Processing", bodyMedium, WHITE @95%)
│
├─ Spacer(f6)
├─ Text(AnnotatedString, displayMedium, padding)           ← "Make Your Notes" WHITE
│                                                             + "\n" + "Printable" gradient #A855F7→#6366F1
├─ StartProcessingButton ── Box(border?, horizontalGradient #A855F7→#6366F1, scale=pulse×press)
│   └─ Row(centerVertically)
│       ├─ Icon(UploadFile, outlined, 24dp)
│       ├─ Spacer(12dp)
│       ├─ Text("Start Processing", titleMedium, WHITE, Bold)
│       ├─ Spacer(f7)
│       └─ Icon(ArrowForward, filled, 20dp)
│       └─ click → onStartProcessing()                      ← router lambda (L.java case 0)
│
├─ Spacer(48dp)
├─ Image(showcase_image.webp, "App Showcase", 16:9, 3-tone gradient border #201533→#3B2C55→#16223A)
├─ Spacer(f5)
│
├─ HowItWorksSection (m6.d, :312)
│   ├─ FeatureCard("How It Works", fillMaxWidth)            ← headlineLarge, WHITE, Bold
│   └─ Column ── 6 × StepItem (m6.f, :344) ── GlassCard (p097w3/j.a, GlassCard.kt:26)
│       └─ Row: [icon] + Column( title(Bold), subtitle )    (1→6, spaced f5)
│
├─ Spacer(f5)
│
└─ FeaturesSection (m6.c, :371)  = "Why Choose Us?"
    ├─ FeatureCard("Why Choose Us?", fillMaxWidth)          ← headlineMedium, WHITE, Bold
    └─ 3× Row(spacedBy 12dp) of 2 × FeatureCard(weight 1f)  ← 6 pills:
       Lightning Fast │ Complete Privacy
       Print-Optimized │ No Installation
       Save Ink & Paper │ 100% Free
```

---

## 4. Styles used

No CSS/XML styles — Compose Material3 + **static Kotlin design tokens**.

### 4.1 Design tokens — `p107y3/a.java` (app palette, dark theme)

| Token | Hex | Role on this page |
|---|---|---|
| `f15978a` | `#A855F7` | Purple-500 — gradient start (badge, button, "Printable") |
| `f15979b` | `#6366F1` | Indigo-500 — gradient end (badge, button, "Printable") |
| `f15990o` | `#FFFFFF` | White — title, headings, badge/button text |
| `f15994w` | `#22C55E` | Green-500 — "Free Forever" gradient start |
| `f15995x` | `#059669` | Emerald-600 — "Free Forever" gradient end |
| `f15984i` | `#10B981` | Emerald-500 — unused here (used in home hero) |
| `f15982f` / `f15983h` | `#1A1A24` / `#1E1E2E` | page background (dark) |
| `f15991r` | `#27272A` | Zinc-800 — dark text on light cards |
| `f15980c` `f15981d` `f15985j`–`f15989n` `f15992s` `f15993v` `f15996y` | (see a.java) | other routes (PRINTS/TOOLS badges, order chips) |

### 4.2 Theme / typography

- App theme: `Theme.NotesCrafter` = `Theme.Material.NoActionBar`, dark window background (`res/values/styles.xml`) — set in `p107y3/b.java`.
- Material3 `Typography` slots used: **displayMedium** (hero title), **headlineLarge** ("How It Works"), **headlineMedium** ("Why Choose Us?"), **titleMedium** (button), **labelLarge** ("Free Forever"), **bodyMedium** (AI badge).

---

## 5. Icons, images, fonts, assets

| Asset | Source |
|---|---|
| `showcase_image.webp` | `resources/res/drawable/showcase_image.webp` (16:9 demo photo, dark 3-tone gradient border) |
| 10 Material icons (see 2.3) | `material-icons` (core: Favorite, ArrowForward, Upload, UploadFile, Visibility, Download) + `material-icons-extended` (AutoFixHigh, GridView, Memory) |
| Fonts | **none custom** — system default (FontFamily null everywhere) |
| Backgrounds | all gradient brushes inline (no drawable XML) |

---

## 6. State management

- **No Redux/Zustand/Context** — Compose native + ViewModel.
- `PrintOrderViewModel` (`p083t3/Y.java`) extends `androidx.lifecycle.X` (ViewModel). Owns `MutableState` fields (obfuscated `T`): **step** (f13136s, `Int`), uri/fileName/orderId (f13130k–f13137v pairs). API: `g(Int)` = setStep, `h()` = reset, `j(...)` = set uri/step.
- The page itself is **stateless**: `LandingScreen.e(onStartProcessing, modifier)` receives a single `O3.a` (Function0) lambda from the router (L.java:691). The lambda is the `remembered` anonymous class `t3.C` (case 0 branch, L:623–640):
  ```
  onStartProcessing = {
      AnalyticsManager.logCtaClick("Start Processing", "Landing_Screen")
      viewModel.h()          // reset order state
      viewModel.g(1)         // step → 1 (UploadScreen)
  }
  ```

---

## 7. Business logic files

| File | Logic |
|---|---|
| `p083t3/Y.java` (PrintOrderViewModel) | step machine: 0=landing, 1=upload, 2=reorder, 3=enhance/preview, 4=success; reset; uri persistence |
| `p083t3/L.java` (router) | step→screen dispatch for route `"flow"` (L:517–741) |
| `com.notescrafter.service.PDFProcessor` | native processing engine — **not touched by this page**, only from step 3 |
| `AnalyticsManager` (com.notescrafter) | `logCtaClick("Start Processing","Landing_Screen")` on CTA |

---

## 8. Utility/helper functions

| Helper | File | Use |
|---|---|---|
| `v.S(...)` (listOf) | `C3/v.java` | build token/step lists |
| `a.w(from, to, step)` | `p003a2/a.java` | 2-col grid loop stride |
| `b.k/b.j/b.n/b.g/b.m` | `p076s/b.java` | compose remember/group/size helpers |
| `j.a` = **GlassCard** | `p097w3/j.java` (GlassCard.kt:26) | step item card |
| `o.f` | kotlin.jvm.internal | param non-null asserts |

---

## 9. API / service layer

- **Zero network APIs on this page** (marketing/entry page, fully offline).
- AdMob banners + Razorpay exist app-wide (MainActivity) but are **not referenced by LandingScreen**.
- Only "service" call is the local analytics log (see §7).

---

## 10. Animations

| Where | Animation | Source |
|---|---|---|
| `AIBadge` (m6.a, :113) | **infinite pulse** — `rememberInfiniteTransition("badge…")` → `animateFloat` (scale/alpha loop) | `androidx.compose.animation.core.InfiniteTransition` |
| "Start Processing" button (m6.e, :450) | **infinite pulse** `("puls…")` scale + press-scale (`ScaleKt.scale`) | same + foundation interaction |
| Home cards (context) | press-scale 0.98 (ProductContainer, t5:337) | — |

---

## 11. Third-party libraries (this page)

| Library | Use |
|---|---|
| Jetpack Compose Foundation / Material3 / UI / Runtime | everything (BOM from libs.versions.toml) |
| Compose `animation-core` | infinite pulse transitions |
| `material-icons` + `material-icons-extended` | 10 icons |
| androidx.lifecycle (ViewModel) | via PrintOrderViewModel |
| Kotlin stdlib | o.f, collections |

---

## 12. Folder structure related to this page (original app layout)

```
com.notescrafter/
├── MainActivity.kt                 (launcher, setContent)
├── AnalyticsManager.kt             (logCtaClick)
├── ui/
│   ├── screens/
│   │   ├── LandingScreen.kt        ← THIS PAGE (6 composables)
│   │   ├── GlobalHomeScreen.kt     (parent: FLOW card)
│   │   ├── DownloadsScreen.kt      (step −1 destination — NOT this page)
│   │   ├── UploadScreen.kt         (step 1 destination)
│   │   ├── … (Reorder/Enhance/Preview/Success screens — later flow steps)
│   ├── components/
│   │   ├── GlassCard.kt            (p097w3/j — used by StepItem)
│   │   ├── BottomNavBar.kt         (p097w3/f)
│   │   └── … (TopBar icons p083t3/C2274a, C2276b)
│   └── theme/ (DesignTokens.kt = p107y3/a, Theme = p107y3/b)
├── viewmodel/ PrintOrderViewModel.kt (p083t3/Y)
├── service/ PDFProcessor.kt
└── (navigation: p083t3/L.kt router, M.kt route state, S.kt scaffold)
res/
└── drawable/showcase_image.webp
```

---

## 13. Data flow diagram

```
[GlobalHomeScreen] FLOW card
      │ tap  (C2557l5 content + clickable)
      ▼
C2313u(mode 2) ──► routeState.setValue("flow"); viewModel.h(); viewModel.g(0)
      ▼
L.java case "flow" (L:517) ── S.s(viewModel) reads step ──► switch(step)
      │ step 0 (L:623) → remembered lambda C:
      │    { Analytics.logCtaClick("Start Processing","Landing_Screen");
      │      viewModel.h(); viewModel.g(1) }
      ▼
AbstractC2574m6.e(onStartProcessing, …)      ← L:691  (THIS PAGE renders)
      ▼  (Start Processing pressed → lambda runs)
UploadScreen (step 1, L:694) ──► (step 2 Reorder → 3 Enhance → 4 Success)
```

State store: `PrintOrderViewModel` (single instance, app-scoped). Page is a pure render of `step==0`.

---

## 14. Navigation flow

**Where it comes from:** Home screen (GlobalHomeScreen, t5) → FLOW card → route `"flow"`, step 0. (PRINTS card → route `"how-to-print"`; TOOLS card → route `"tools"` — C2315v modes 17/18.)
⚠️ Corrected: step **−1** (→ DownloadsScreen, X3.b at L:620) is used by the **top-bar Downloads/Cart icons** (C2319x top bar → C2313u modes 0/1), NOT by the home FLOW card.

**Where it goes:** "Start Processing" → analytics event → reset → step 1 → **UploadScreen** (L:694, analytics `Select_Files/Upload_Screen`) → SAF file picker → step 2 ReorderScreen ("Continue"/`Reorder_Screen`, L:559) → step 3 EnhanceScreen (`Process_File`/`Enhance_Screen`, L:575) → step 4 SuccessScreen (`Process_Another`/`Success_Screen`, L:583). Back arrow on this page: step 0 → `viewModel.g(0)` (L:537) → LandingScreen re-render.

---

## 15. Mandatory vs shared files (to recreate the page 100%)

### Mandatory (page-specific — must be recreated)
1. `LandingScreen.kt` — the 6 composables (LandingScreen, AIBadge, FeatureCard, FeaturesSection, HowItWorksSection, StepItem)
2. `showcase_image.webp` asset (or equivalent 16:9 demo image)
3. `C2693te` (StepItem data class: index, icon, title, subtitle)
4. Route wiring: `L.java` `case "flow"` step-0 branch + the `C` lambda (analytics + reset + `g(1)`)
5. `C2313u` mode-2 lambda + `C2315v` route table (`"flow"`)
6. `PrintOrderViewModel` step state (`MutableState<Int>` step, `g()`, `h()`) — minimal version: a single step counter + reset is enough
7. Gradient values: `#A855F7→#6366F1` (brand), `#22C55E→#059669` (free badge), 3-tone showcase border
8. Material3 icons: Favorite, ArrowForward, UploadFile (outlined), Upload, Visibility, AutoFixHigh, GridView, Memory, Download

### Shared globally (import once, reused everywhere)
1. `DesignTokens` (`p107y3/a.java`) — the color constants file
2. `GlassCard` (`p097w3/j.java`, GlassCard.kt:26) — step items
3. `BottomNavBar` (`p097w3/f.java`) — bottom nav (5 items)
4. `PrintOrderViewModel` (`Y.java`) — shared across all flow screens
5. `AnalyticsManager` — CTA events
6. Theme (`p107y3/b.java`) + `styles.xml` dark theme
7. Router/scaffold (`L.java`, `M.java`, `S.java`) — hosts every screen
8. Compose libs (Material3, icons, animation) — via libs.versions.toml

### Dependency counts (leaf-level, this page only)
- App files touched: **8** (m6, C2693te, C2313u, C2315v, L, Y, p107y3/a, p097w3/j) + route neighbors (C2319x, M, S)
- Assets: 1 image, 10 icons
- Libraries: Compose BOM set + Kotlin stdlib + lifecycle
