# Print-Optimizer

Reverse-engineered analysis of the **NotesCrafter** Android app (package `com.notescrafter.app`) print-optimization ("Flow") pipeline: how a PDF is turned into a clean, print-ready document — entirely **on-device**.

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
│   ├── p083t3/             # Y.java (FlowViewModel), L.java (success screen),
│   │                       # X/V (download workers), A.java (Preview/PdfCrop), C2306q (Enhance)
│   ├── p087u3/             # All flow data models & enums (a–u)
│   ├── p092v3/q.java       # Core processing worker
│   └── p102x3/             # LandingScreen (AbstractC2574m6), UploadScreen (ef)
└── docs/
    ├── 01-architecture.md     # App architecture, state machine, layers
    ├── 02-user-journey.md     # Landing → download: exact strings & screen logic
    ├── 03-values-defaults.md  # Enums, prefs keys, defaults, formatting rules
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
4. **[Flow](docs/flow.md)** — processing pipeline end to end.
5. **[Native algorithm](docs/native_algorithm.md)** — `processPage()` step by step.
6. **[Disassembly](docs/disassembly/)** — rizin dumps of all 9 JNI exports.

## Disclaimer

Educational / interoperability research only. No app binaries are distributed in this repository — only the analysis and algorithm descriptions.
