# full-src — complete NotesCrafter app source (decompiled, labeled)

**What this is:** every app-owned source file of `com.notescrafter.app` v4.0.8 (jadx output), copied here so the whole codebase is browsable and searchable from this repo. Libraries (androidx, com.google.*, okhttp, coil, kotlinx, …) are intentionally **not** included.

**Contents**

| | |
|---|---|
| `p102x3/` … `p111z2/` (112 dirs, 1,937 files, 21.2 MB) | app code obfuscated by R8 (jadx names preserved) |
| `com/notescrafter/` (11 files) | unobfuscated original app code |
| `full-src-INDEX.md` (sibling) | auto-generated labeled index of every file |

**How to read the index:** every row = one file. The most valuable column is `trace:` — it carries the original Kotlin reference recovered from Compose trace metadata, e.g. `com.notescrafter.ui.screens.LandingScreen (LandingScreen.kt:47)`. 549 files (410 unique Kotlin paths) are identifiable this way. `strings:` shows the UI texts inside the file for quick lookup.

**Package → original-name evidence so far**

| Package | Files | Known identity |
|---|---|---|
| p102x3 | 760 | `ui.screens` — LandingScreen, GlobalHomeScreen, DownloadsScreen, EnhanceScreen, LogoSelectionScreen, UploadScreen, ReorderScreen, SuccessScreen, A4CoverPage, SignInRequiredScreen … |
| p083t3 | 101 | navigation core — `NotesCrafterContent` router (L), Scaffold+RouteScope (S), RouterState (M), PrintOrderViewModel (Y), TopBar, route lambdas |
| p097w3 | 16 | `ui.components` — BottomNavBar (f), GlassCard (j), GradientButton, GlassDialog, CinematicBackground, StepIndicator, AppHeader |
| p107y3 | 3 | `ui.theme` — DesignTokens (a), NotesCrafterTheme (b) |
| p087u3 | 22 | data/service layer — FilterSettings (b), PDF output types, uri helpers |
| p090v1 | 93 | to be labeled from trace column (contains ui.screens members — see index) |
| p082t2 | 121 | to be labeled from trace column |
| all others | | trace column in `full-src-INDEX.md` reveals identity per file |

**Verified routing / call graph docs:** `../22-landing-screen-implementation-map.md`, `../21-home-screen-re-files.md`, `../disassembly/*.txt` (native engine dumps), `../19-tech-stack.md`, `../20-flow-pipeline-tech-stack.md`.

**Native engine:** `com/notescrafter/service/PDFProcessor.java` = JNI wrapper (`processPage`, `removeLogo`, `fillRegion`, `fillRegionOval`, `invertRegion`, `invertRegionOval`, `initPdfWriter`, `writePageNative`, `finishPdfWriter`); the `.so` itself lives at `../../../NotesCrafter/split-arm64/lib/arm64-v8a/libnotescrafter-native.so` (276 KB, Ghidra dumps in `../disassembly/`).

> RE reference only — nothing here is copied into the PrintReady AI implementation; behavior is matched by reimplementation (see docs 19/20).
