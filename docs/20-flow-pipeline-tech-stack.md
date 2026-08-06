# 20 — Flow pipeline: tech stack & processing values

> App: **com.notescrafter.app** v4.0.8 · source map per stage
> Complements: `flow.md` (state machine) + `native_algorithm.md` (processPage
> internals) + `19-tech-stack.md` (dependency inventory)

## 1. i18n verdict

**No i18n system.** Only default `res/values/` — no `values-bn/hi/…` locale
folders. App UI strings are hardcoded English Compose literals in 264
source files (`TextKt.m2432Text4IGK_g("…")`); `strings.xml` holds only 189
library/system entries. `android:supportsRtl="true"` but no RTL resources —
single-language, single-locale app.

## 2. Stage → technology map (upload → merged PDF)

| Stage | Technology | Evidence |
|---|---|---|
| **Upload / file picking** | Android **SAF** (`ActivityResultContracts.GetContent`/OpenDocument) + `ContentResolver.openFileDescriptor` | `p102x3/ef.java` (UploadScreen), `p092v3/o.java` page-count worker |
| **Page count / metadata** | Android framework **`android.graphics.pdf.PdfRenderer`** | `p092v3/o.java` |
| **Merge PDF** | **Same pipeline as Flow** — no separate merge library | `p102x3/Q8.java` (PdfMergeScreen.kt:61) creates `PDFProcessor` + worker `C2291i0` → `p102x3/O8.java`; pages of all selected files are **concatenated**, each rendered original-size (1×1 sheet), then written through the native writer |
| **Render** | Android framework **`PdfRenderer.openPage(idx)`** → `Bitmap` `ARGB_8888` (aspect-fit on white canvas), `render(bitmap, rect, 0, 1)` | `p092v3/q.java` (flow.md §4) |
| **Processing (enhance)** | **Custom native lib** `libnotescrafter-native.so` via `com.notescrafter.service.PDFProcessor` — `processPage`, `removeLogo`, `fillRegion/Oval`, `invertRegion/Oval` (9 JNI exports) | `native_algorithm.md` |
| **Layout / sheet assembly** | **Pure Kotlin + Android Canvas**: rows×cols grid math, DPI-ratio canvas scaling, 2px black separation lines (`Paint.Style.STROKE`), 30px centered page numbers (`Paint.Align.CENTER`) | `p092v3/q.java`; output settings model `p087u3/e` |
| **Image encode** | **`Bitmap.compress(JPEG, 80, baos)`** (quality fixed 80) | `p092v3/q.java` |
| **PDF write** | **From-scratch C PDF-1.4 writer** (`initPdfWriter`/`writePageNative`/`finishPdfWriter`): `/Filter /DCTDecode` XObject pages, content stream `q %d 0 0 %d 0 0 cm /Img Do Q` — **no third-party libs** (no zlib/libjpeg/png; JPEG passes through) | `native_algorithm.md` §PDF writer |

Key detail: **merge, organize, split, compress, crop, invert, page numbers
and the Flow pipeline all share one engine** — render (PdfRenderer) → optional
native enhance → native PDF writer. No PDF library (PDFBox/MuPDF/iText) exists
in the binary; only parameterization differs (page ranges, ordering, grid,
quality).

## 3. Processing values & logic (from native_algorithm.md — canonical)

Constants used in `processPage` (`0x1c230`):

| Stage | Operation | Constant |
|---|---|---|
| Invert | `pixel ^= 0xFFFFFFFF` (RGB only, alpha kept) | — |
| Grayscale | Rec.601 luma | `(299R + 587G + 114B) / 1000` |
| Clear background | `avg = (R+G+B)/3`; `avg <= threshold` → `*1.2` boost, else → pure WHITE | threshold default **180** (`backgroundThreshold`, `p087u3/b`) |
| B&W gamma | `255 * powf(R/255, 0.6f)` on luma | gamma **0.6** |
| B&W threshold | local window ±10 px via integral image (summed-area table), `mean - 10.0` bias → WHITE else BLACK | window **±10**, bias **-10** |
| Alpha | preserved through all stages | `A<<24 \| out<<16 \| out<<8 \| out` |

Region ops (normalized `RectF`, optional `shape == "circle"`):

| Op | Native | Semantics |
|---|---|---|
| MaskRect / MaskOval | `fillRegion` / `fillRegionOval` (`0x1ced8`/`0x1d3c8`) | fill rect/ellipse with an ARGB color int |
| InvertRect / InvertOval | `invertRegion` / `invertRegionOval` (`0x1d07c`/`0x1d224`) | XOR-invert region only |

## 4. Output/layout settings (`p087u3/e` + `p092v3/q`)

- `documentSize` ∈ {**ORIGINAL**, n-up}: ORIGINAL → 1×1 per page; else
  `sheets = ceil(pageCount / (rows×cols))`
- `nupRows × nupColumns` grid, `orientation`, `addSeparationLines`,
  `addPageNumbers` (bottom-center, 30px)
- DPI ratio (actual, from `p092v3/p.f13554a`): **LOW 1.38 (≈100) · MEDIUM
  2.77 (≈200) · HIGH 4.16 (≈300)** — enum's own 72/150/300 field is unused
- Memory-aware quality (`PDFProcessor.i`): free < 50 MB → LOW; ≥ 100 MB →
  keep; else HIGH→MEDIUM
- OOM recovery: recycle bitmaps, downgrade quality, retry ≤ 3×
- Canvas fallback when render fails: A4 **595×842 pt** white, red placeholder
- JPEG quality fixed **80**; log `Output Config: Size=… Orientation=… Rows=…
  Cols=… Quality=…`
