# disassembly/ui-landing-flow — decompiled sources for the FLOW journey (LandingScreen map)

Ground truth: jadx output of `com.notescrafter.app` v4.0.8. Companion doc: `../22-landing-screen-implementation-map.md` (recursive map, §15 mandatory/shared file split) and `../21-home-screen-re-files.md` (home launch chain).

Filenames keep the jadx names (package-prefixed, `__` = path separator) so cross-references in docs match 1:1. Original Kotlin names are in the last column.

## File index

| File here | Package | Original name | Role |
|---|---|---|---|
| `p102x3__AbstractC2574m6.java` | x3 (ui.screens) | **LandingScreen.kt** | THE page: `LandingScreen`(:47), `AIBadge`(:212), `HowItWorksSection`(:312), `StepItem`(:344), `FeaturesSection`(:371), `FeatureCard`(:406) |
| `p102x3__C2693te.java` | x3 | StepItem data | data class (index, ImageVector icon, title, subtitle) |
| `p102x3__C2557l5.java` | x3 | FLOW card content | Home FLOW card composable lambda ("Start Processing…") |
| `p102x3__C2621p5.java` | x3 | PRINTS card content | Home PRINTS card ("Print & Deliver", ₹0.89/page) |
| `p102x3__C2637q5.java` | x3 | TOOLS card content | Home TOOLS card (tool grid) |
| `p102x3__AbstractC2684t5.java` | x3 | **GlobalHomeScreen.kt** | Home screen — source of the FLOW tap (t5:110, cards t5:231–233) |
| `p102x3__X3.java` | x3 | DownloadsScreen.kt | step −1 destination (top-bar Downloads icon only — NOT the FLOW card) |
| `p083t3__C2313u.java` | t3 | flow-step nav helper | mode 2 (home FLOW card): route `"flow"` + `g(0)`; modes 0/1: `"flow"` + `g(−1)` |
| `p083t3__C2315v.java` | t3 | route lambdas | route-name table: `"flow"`, `"how-to-print"`, `"tools"`, `"contact-us"`, … (modes 0–26+) |
| `p083t3__C2319x.java` | t3 | TopBar | Scaffold top bar — hosts cart/downloads icons (mode-0/1 C2313u) |
| `p083t3__Y.java` | t3 | **PrintOrderViewModel** | flow state machine: step MutableState (f13136s), `g(Int)`=setStep, `h()`=reset, uri/order state |
| `p083t3__L.java` | t3 | **NotesCrafterContent** (router) | `case "flow"` L:517; step 0 → `AbstractC2574m6.e` L:691; step 1 → UploadScreen L:694; all step lambdas L:623–741 |
| `p083t3__M.java` | t3 | RouterState | initial route `"home"` (M:393); route MutableState |
| `p083t3__S.java` | t3 | Scaffold + RouteScope | app scaffold wiring (top bar/bottom bar visibility) |
| `p083t3__D.java` | t3 | DownloadedFileItem | download file card (used by DownloadsScreen) |
| `p107y3__a.java` | y3 | DesignTokens | the palette: brand gradient `#A855F7→#6366F1`, white `f15990o`, FreeForever `#22C55E→#059669`, bg `#1A1A24/#1E1E2E` |
| `p097w3__j.java` | w3 | GlassCard.kt (j.a) | glass card composable — used by StepItem rows (j.java:26) |

## Verified routing (see docs 21/22)

```
Home FLOW card (t5:231) → C2313u(mode 2) → route "flow", step 0 → LandingScreen (m6.e)
Step 0 "Start Processing" → Analytics("Start Processing","Landing_Screen") → h() → g(1) → UploadScreen
Top-bar Downloads/Cart icons (C2319x) → C2313u(modes 0/1) → step −1 → DownloadsScreen (X3)
```

## Notes

- `p097w3__j.java` (GlassCard) and `p083t3__L.java` (router) are large (≈3.1k lines each) because jadx flattens every Compose group; the relevant entry points are documented in the companion docs.
- Native PDF engine (`PDFProcessor` / `.so`) is not part of this folder — see `../disassembly/*.txt` for the native function dumps.
- These files are RE reference only — nothing was copied into the PrintReady AI app implementation (docs 19/20 define the behavior-alignment contract).
