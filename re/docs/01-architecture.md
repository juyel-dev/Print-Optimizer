# 01 — App Architecture

How NotesCrafter (`com.notescrafter.app`) is put together, from the decompiled `base.apk` (jadx 1.5.6, `--comments-level debug`).

## Stack

| Layer | Technology |
|---|---|
| UI | Jetpack Compose (Material 3), single-activity style, heavy string interpolation |
| State | `androidx.lifecycle.ViewModel` (`X`) + `MutableStateFlow` (`T`) backed by `StateFlow` (`F`) |
| Persistence | `SharedPreferences("enhance_prefs", MODE_PRIVATE)` |
| PDF decode | Android `PdfRenderer` (system) |
| PDF encode | **Custom native PDF-1.4 writer** in `libnotescrafter-native.so` (JNI) |
| Pixel filters | Native, same `.so` (JNI table) |
| Threading | Kotlin coroutines (`CoroutineScope` inside the worker `p092v3/q`) |
| File sharing | `FileProvider` |

There is **no server component**. The whole pipeline runs on-device; the only out-of-process interactions are the system file picker (`GetContent`) and the share sheet.

## Package map (deobfuscated roles)

```
com.notescrafter             # manifest root
├── service/
│   └── PDFProcessor         # JNI bridge (System.loadLibrary("notescrafter-native"))
├── ui/                      # MainActivity etc. (Compose host)
p083t3/                      # "Flow" feature package
├── Y                        # FlowViewModel (state machine, prefs, processor)
├── L                        # Success/download screen
├── X, V                     # Download (reprocess) worker chain
p092v3/
├── q                        # Core processing worker (invokeSuspend, the pipeline)
p102x3/
├── AbstractC2574m6          # LandingScreen composable
├── ef                       # UploadScreen composable
p087u3/                      # Flow data models & enums
├── b   FilterSettings       # invert, clearBg, grayscale, b&w, threshold, removeLogo
├── e   OutputSettings       # quality, page size, orientation, nup, sep lines, page numbers
├── d   QualityEnum          # LOW(72) MEDIUM(150) HIGH(300) DPI
├── a   PageSizeEnum         # ORIGINAL, A4
├── c   OrientationEnum      # PORTRAIT, LANDSCAPE
├── f   PDFDocument          # uri, name, size, pageCount, thumbnails, id
├── g   PDFPage              # index, thumbnail, isSelected, sourceUri, originalPageIndex, edits
├── h   PageEdit             # InvertRect / InvertOval / MaskRect / MaskOval
├── t   ProcessingProgress   # currentPage/totalPages → progress float
└── u   ResultState          # Idle | Processing | ReadyToDownload | Complete | Error
```

## FlowViewModel state machine (`p083t3/Y`)

Screen is a single `Int` StateFlow (`e`). Transitions happen inside each screen's "Continue" handlers:

| Value | Screen |
|---|---|
| `-1` | Landing (marketing) |
| `0` | Upload |
| `2` | Reorder |
| `3` | Preview (page selection) |
| `4` | Enhance (filters/layout) |
| other | Processing / Success (driven by worker + result state) |

### State fields

| Field | Type | Initial value |
|---|---|---|
| `e` | `StateFlow<Int>` | `0` (Upload) |
| `g` | `StateFlow<Uri?>` | `Uri.EMPTY` — original file uri |
| `i` | `StateFlow<Uri?>` | `Uri.EMPTY` — processed file uri |
| `k` | `StateFlow<FilterSettings>` | defaults below |
| `m` | `StateFlow<OutputSettings>` | defaults below |
| `o` | `StateFlow<ProcessingProgress>` | `(0,0,0,0,"idle")` |
| `q` | `StateFlow<ResultState>` | `Idle` |
| `s`, `u` | `StateFlow<Long>` | `0L` — start/end timestamps |

`f()` reloads both settings bundles from `SharedPreferences` (see [03-values-defaults](03-values-defaults.md)). Unknown enum strings in prefs are caught and replaced with defaults (`HIGH`, `A4`, `PORTRAIT`).

`h()` is the full reset: clears URIs, reloads prefs, resets progress → `Idle`, timestamps → 0, and calls `System.gc()`.

## The processing worker (`p092v3/q`)

A coroutine-based worker (`invokeSuspend`, ~97 KB of bytecode in the debug dump). Full responsibility chain:

1. Read `FilterSettings` + `OutputSettings` (from `Y`).
2. For each page: `PDFProcessor.renderPageAsBitmap(...)` (PdfRenderer at computed DPI).
3. Apply filters via JNI `processPage(...)` per page region.
4. Compose N-up sheet(s), separation lines, page numbers.
5. Native PDF writer (`initPdfWriter` → `writePageNative` per sheet → `finishPdfWriter`).
6. Publish progress through `Y.o` / `Y.q` (`Processing`, `ReadyToDownload`, `Complete`, `Error`).

Memory strategy: every 5 pages a `System.gc()`; on `OutOfMemoryError` the quality is downgraded one step and the page retried (max 3 attempts). At `initPdfWriter` time, free memory < 50 MB forces LOW; ≥ 100 MB keeps the choice; otherwise HIGH is downgraded to MEDIUM.

## The success/download chain (`p083t3/L`, `X`, `V`)

- `L` renders the success screen from `Complete(originalSize, processedSize, outputUri)`:
  - **View File** → `FileProvider` `ACTION_VIEW`
  - **Share File** → `ACTION_SEND` chooser
  - **Download** → re-runs the whole processing worker with fresh copies (`X` → `V`)
  - **Process Another** → `Y.h()` reset, back to Upload
- `V` re-processes to a new file with `(2)`, `(3)`… name dedupe (see flow doc).

## Native side (`libnotescrafter-native.so`)

Stripped ARM64 shared object, built with Android clang 18.0.1, ~276.5 KB. Exports (JNI table):

| Native function | Address | Role |
|---|---|---|
| `processPage` | `0x1c230` | main filter pipeline (see [native_algorithm](native_algorithm.md)) |
| `removeLogo` | `0x1cbdc` | fill logo region(s) |
| `invertRegion` | `0x1d07c` | invert a rectangular region |
| `invertRegionOval` | `0x1d224` | invert an oval region |
| `fillRegion` | `0x1ced8` | fill rectangle with color |
| `fillRegionOval` | `0x1d3c8` | fill oval with color |
| `initPdfWriter` | `0x1d654` | start PDF-1.4 output |
| `writePageNative` | `0x1d704` | append one JPEG page (DCTDecode XObject) |
| `finishPdfWriter` | `0x1d7b8` | close xref/trailer |

The PDF writer writes a minimal but valid PDF-1.4 document: header, objects, `/Pages`, `/Page` with `/MediaBox` and a single `/XObject` image per page (`/DCTDecode`, `DeviceRGB`, `BitsPerComponent 8`, `/Length`), cross-reference table and trailer with `startxref`.
