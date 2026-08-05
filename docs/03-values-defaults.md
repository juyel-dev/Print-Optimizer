# 03 — Values, defaults & prefs keys

Every constant, default, enum value and preference key used by the Flow, cross-checked against the decompiled classes (`p087u3/*`, `p083t3/Y`).

## SharedPreferences: `enhance_prefs` (MODE_PRIVATE)

| Key | Type | Default | Meaning |
|---|---|---|---|
| `invert_colors` | bool | `true` | Invert page colors |
| `clear_background` | bool | `true` | Clean noisy background |
| `grayscale` | bool | `false` | Grayscale output |
| `black_and_white` | bool | `false` | Adaptive B&W thresholding |
| `background_threshold` | int | `180` | Clear-background brightness cutoff |
| `quality` | string | `"HIGH"` | Enum name of `Quality` |
| `document_size` | string | `"A4"` | Enum name of `PageSize` |
| `orientation` | string | `"PORTRAIT"` | Enum name of `Orientation` |
| `nup_rows` | int | `3` | Slides per sheet, rows |
| `nup_cols` | int | `1` | Slides per sheet, columns |
| `add_separation_lines` | bool | `false` | Grid lines between slides |
| `add_page_numbers` | bool | `true` | Page number bottom-center |

Bad values in prefs are swallowed: invalid enum names fall back to `HIGH` / `A4` / `PORTRAIT`.

## Enums

### Quality (`p087u3/d`) — name + DPI

| Name | DPI | Render scale (relative) |
|---|---|---|
| `LOW` | 72 | 1.38× |
| `MEDIUM` | 150 | 2.77× |
| `HIGH` | 300 | 4.16× |

Enum constant `LOW(72)` / `MEDIUM(150)` / `HIGH(300)` is stored but the worker uses the **scale map** above for `PdfRenderer` output size.

### PageSize (`p087u3/a`)

`ORIGINAL` → 1×1 (one slide per page, source media box) · `A4` → N-up sheet sized A4.

### Orientation (`p087u3/c`)

`PORTRAIT` · `LANDSCAPE` — swaps sheet width/height when building the layout.

## Data classes (constructor defaults, via `$default` synthetic ctors)

### `FilterSettings` (`p087u3/b`)

```kotlin
FilterSettings(
    invertColors       = true,
    clearBackground    = true,
    grayscale          = false,
    blackAndWhite      = false,
    backgroundThreshold= 180,
    removeLogo         = false,
    logoBox            = null,      // RectF in page coords
    logoShape          = "rectangle" // or "oval"
)
```

### `OutputSettings` (`p087u3/e`)

```kotlin
OutputSettings(
    quality            = HIGH,
    documentSize       = A4,
    orientation        = PORTRAIT,
    nupRows            = 3,
    nupColumns         = 1,
    addSeparationLines = false,
    addPageNumbers     = true
)
```

### `ProcessingProgress` (`p087u3/t`)

`(currentPage, totalPages, currentBatch, totalBatches, status)` — `getProgress() = currentPage / totalPages` (0 when totalPages == 0), `getPercentComplete() = (int)(progress * 100)`.

Initial state: `t(0, 0, 0, 0, "idle")`.

### Result state (`p087u3/u`)

| Subclass | Fields |
|---|---|
| `Idle` | singleton |
| `Processing` | `currentPage, totalPages, currentBatch, totalBatches, progress: Float, status: String` |
| `ReadyToDownload` | `originalSize: Long, pageCount: Int` |
| `Complete` | `originalSize: Long, processedSize: Long, outputUri: Uri` |
| `Error` | `message: String` |

### `PDFDocument` (`p087u3/f`)

`uri, name, size, pageCount, thumbnails: List<Bitmap>, id` — `id` defaults to `UUID.randomUUID().toString()`.

Size formatting (`getFormattedSize()`):

| Range | Format |
|---|---|
| ≥ 1e9 | `%.2f GB` |
| ≥ 1e6 | `%.2f MB` |
| ≥ 1000 | `%.2f KB` |
| else | `N B` |

### `PDFPage` (`p087u3/g`)

`index, thumbnail: Bitmap?, isSelected = true, sourceUri = Uri.EMPTY, originalPageIndex = 0, edits = emptyList, committedImageData: Bitmap?`

### Page edit ops (`p087u3/h`)

| Op | Arguments | Native call |
|---|---|---|
| `InvertRect` | rect | `invertRegion` |
| `InvertOval` | rect (bounds) | `invertRegionOval` |
| `MaskRect` | rect, color | `fillRegion` |
| `MaskOval` | rect, color | `fillRegionOval` |

## Rendering / processing constants

| Constant | Value |
|---|---|
| Sheet JPEG quality | `80` (fixed, `Bitmap.compress`) |
| Separation line | 2 px black |
| Page number | 30 px, bottom-center |
| `System.gc()` cadence | every 5 pages |
| OOM retry | downgrade quality, retry ≤ 3 |
| Free-mem auto-downgrade (at `initPdfWriter`) | < 50 MB → LOW; ≥ 100 MB → unchanged; else HIGH → MEDIUM |
| Output dir | `getExternalFilesDir(null)/NotesCrafterFiles/` |
| Output name | `<basename>_processed.pdf`, dedupe `(2)`, `(3)`… |

## Native PDF writer constants (`initPdfWriter` / `writePageNative`)

```
<< /Type /XObject /Subtype /Image /Width %d /Height %d
   /ColorSpace /DeviceRGB /BitsPerComponent 8
   /Filter /DCTDecode /Length %zu >>
```

- PDF-1.4 header, `/Pages` tree, `/Page` per sheet with `/MediaBox` (A4: 595.28 × 841.89 pt at 72 dpi), single image XObject per page, xref + trailer + `startxref`.
