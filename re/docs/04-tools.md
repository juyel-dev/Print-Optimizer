# 04 — Quick Tools: architecture & extensibility

How the "Tools" suite (`tools.notescrafter.com` equivalent inside the Android app) is built: the tool registry, navigation wiring, shared/reusable components, isolation model, classification, and the recipe for adding a new tool.

## Overview

Tools is a **collection of fully independent single-screen features** (PDF utilities + one focus timer) behind a single "Quick Tools" grid screen. Every tool is:

- a standalone composable in `p102x3` (e.g. `Q8` = `PdfMergeScreen`),
- registered in a **static tool registry** (`Ud.f14501a`),
- reachable through a **string route** handled by the app-wide `when(route)` router in `p083t3/L.java`.

There is no shared tool state, no shared ViewModel for tools, no server. Tools are pure UI + `PDFProcessor` (same JNI engine used by Flow) or local logic (Pomodoro).

## The tool registry

### Model — `QuickTool` (`p102x3/Rd`)

```kotlin
QuickTool(
    id: String,                 // "merge-pdf", "split-pdf", ...
    title: String,              // "Merge PDF"
    description: String,        // "Combine multiple PDFs into one document"
    icon: ImageVector,          // material outlined icon
    category: String,           // "PDF Tools" | "Image Tools" | "Focus"
    route: String               // "pdf-merge" → router case
)
```

`category` and `route` are **plain strings** — the registry is data-driven, not type-driven.

### Registry — `Ud` (p102x3/Ud)

```kotlin
f14501a: List<QuickTool>   // static, 10 tools
f14502b: List<String>      // static categories: "All", "PDF Tools", "Image Tools", "Calculators", "Focus"
```

The 10 registered tools:

| id | title | category | route |
|---|---|---|---|
| `merge-pdf` | Merge PDF | PDF Tools | `pdf-merge` |
| `split-pdf` | Split PDF | PDF Tools | `pdf-split` |
| `compress-pdf` | Compress PDF | PDF Tools | `pdf-compress` |
| `add-page-numbers` | Add Page Numbers | PDF Tools | `pdf-add-page-numbers` |
| `organize-pdf` | Organize PDF | PDF Tools | `pdf-organize` |
| `crop-pdf` | Crop PDF | PDF Tools | `pdf-crop` |
| `invert-pdf` | Invert PDF | PDF Tools | `pdf-invert` |
| `pdf-to-jpg` | PDF to JPG | Image Tools | `pdf-to-jpg` |
| `jpg-to-pdf` | JPG to PDF | Image Tools | `jpg-to-pdf` |
| `pomodoro` | Pomodoro Timer | Focus | `pomodoro-setup` |

> Note: `f14502b` lists **"Calculators"** but no tool uses it yet — the category list is a forward-looking superset. The grid itself is built by grouping `f14501a` by its own `category` field, so new categories appear automatically; the `f14502b` list is currently unused code (dead/reserved).

## Quick Tools screen (`Ud.a`)

`QuickToolsScreen` (route `"tools"`) is rendered by the router with one callback that performs navigation (`Y3/d` case 2 → `mutableState.setValue(route)`).

Layout:

1. **Header text** — "Everything you need - One tap away"
2. **Search field** — filters tools by `title` OR `description` (case-insensitive `contains`)
3. **LazyVerticalGrid** — tools grouped by category:
   - category header row per group (`Sd`),
   - `ToolCard` items below it (`N8`),
   - grid definition: `Y3/d` case 10 (LazyGridScope builder).

`ToolCard` (`Ud.b`): rounded gradient-border icon box, bold title, 2-line-ellipsized description, gradient **"Open →"** chip. Whole card clickable.

## Tool screens & routes

The router in `p083t3/L.java` is one big `when(route)` (~50 routes). Tool cases:

| route | screen composable | screen source |
|---|---|---|
| `pdf-merge` | `Q8.b` | PdfMergeScreen.kt |
| `pdf-split` | `C9.a` | PdfSplitScreen.kt |
| `pdf-compress` | `AbstractC2782z7.b` | PdfCompressScreen.kt |
| `pdf-crop` | `AbstractC2416c8.a` | PdfCropScreen.kt |
| `pdf-invert` | `AbstractC2783z8.a` | PdfInvertScreen.kt |
| `pdf-organize` | `AbstractC2545k9.a` | PdfOrganizeScreen.kt |
| `pdf-add-page-numbers` | `AbstractC2447e7.a` | AddPageNumbersScreen.kt |
| `pdf-to-jpg` | `Z9.a` | PdfToJpgScreen.kt |
| `jpg-to-pdf` | `AbstractC2494h6.a` | JpgToPdfScreen.kt |
| `pomodoro-setup` | `AbstractC2642qa.a` | PomodoroSetupScreen.kt |
| `pomodoro-timer` | `Ja.b` | PomodoroTimerScreen.kt (internal sub-route of pomodoro) |

`pomodoro-timer` is not in the registry — it is a second route reached *from within* the Pomodoro screen (setup → start). Each screen takes an `onBack` callback that is a case in the shared back-dispatch `C2315v` (cases 7–16, 18 → `setValue("tools")`; case 6 → `setValue("pomodoro-setup")`).

## Shared / reusable pieces

| Piece | Where | Used by |
|---|---|---|
| `AppHeader` (logo + gradient title + bell badge + optional back) | `S.a` (MainActivity.kt) | top-level, all non-tool routes |
| `SubHeader` tabs FLOW / PRINTS / TOOLS | `S.e` | home & flow |
| Back-button dispatch (route-state setter) | `C2315v` | every tool screen (one-liner `onBack`) |
| Analytics screen mapping | `C2311t` | router — logs `logScreenView(route)` on route change |
| Click wrapper with CTA logging | `p083t3/O` | success screen CTA etc. |
| Glass card wrapper | `p097w3/j` | ToolCard, home cards, feature tiles |
| `PDFProcessor` + JNI engine | `com.notescrafter.service.PDFProcessor` | Flow **and** every PDF tool |
| File picker result wrapper (multi-URI) | `Wd` | Flow upload; tools reuse the same uri-list → process pattern |
| Native processing claim badge | `AbstractC2471g` ("Native Processing — All PDF processing happens locally on your device using native C++ code.") | marketing screens |

Tool screens do **not** use the `AppHeader`/`SubHeader` (see ad/header logic below) — they render their own top bar with a back arrow inside the screen.

## Header & ad visibility (MainActivity.kt)

Two composables decide chrome around tool routes:

- **`C2319x`** (AppHeader): if route is any of the tool routes → **no AppHeader** (tools own their chrome). Otherwise header shows, with cart badge only on print routes; `home`/`flow` show SubHeader tabs except during processing/landing.
- **`C2323z`** (bottom ad banner): banner is shown when `(home or flow-at-steps-0/1/6/-1)` or `non-home non-flow route`, **but never** on:
  - tool routes (`pomodoro-*`, `pdf-*`) → **tools are ad-free**
  - print checkout routes (`print-order-upload/shipping/checkout`)

So tools get: own screen chrome, no bottom banner. Ads live on home/flow/other pages only.

## Isolation model

- **No shared mutable state** between tools — each screen keeps its own `remember`ed states inside the router (e.g. pomodoro settings `K` callback + 5 remembered states, timer progress in `Ja.b`).
- **No per-tool ViewModels** (Flow's `p083t3/Y` is the only feature ViewModel). Tools run in composition scope + `PDFProcessor` on a coroutine.
- Adding/removing a tool touches exactly: registry entry + router case (+ optional analytics mapping default = route string). Nothing else reacts.
- The Pomodoro timer is the odd one out: it is a *non-PDF* tool that still fits the same registry → route pattern (category "Focus").

## How a new tool is added (derived recipe)

1. **Create the screen** in `p102x3` — e.g. `AbstractCxxxx.a(onBack, ...)`, self-contained state, reuse `PDFProcessor` for PDF work.
2. **Register the route** — add a `case "my-tool-route":` in the `when(route)` router in `p083t3/L.java` calling your composable with the shared back callback.
3. **Add to the registry** — append `QuickTool("my-tool", "My Tool", "Short description", SomeIcon, "PDF Tools", "my-tool-route")` to `Ud.f14501a`.
4. **Wire the back button** — use an unused `C2315v` case (or reuse one) → `setValue("tools")`.
5. **Done** — the grid auto-groups by category, search picks it up, analytics logs `logScreenView("my-tool-route")` automatically, ads stay hidden on it.

If the category is new, the grid shows a new section automatically (`f14502b` needs no update — it is only a reserved list).

## Web ↔ app parity

Per the app's own Terms of Service: "Tools is a collection of browser-based document utilities... All processing occurs locally in your browser or on your device with zero server interaction. No account is required." The Android implementation matches: no auth gate, no server, same tool set as `tools.notescrafter.com`.
