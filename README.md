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
└── docs/
    ├── flow.md              # End-to-end flow: upload → process → download
    ├── native_algorithm.md  # processPage() native pipeline, step by step
    └── disassembly/
        ├── processPage.txt  # rizin disassembly of Java_com_notescrafter_service_PDFProcessor_processPage
        └── processPage_rest.txt
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

## Disclaimer

Educational / interoperability research only. No app binaries are distributed in this repository — only the analysis and algorithm descriptions.
