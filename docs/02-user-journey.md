# 02 — User Journey (landing → download)

Every screen in the Flow, with the exact UI strings found in the decompiled composables and the logic that runs on each transition.

---

## 1. Landing (`p102x3/AbstractC2574m6` → LandingScreen, state `-1`)

Marketing screen shown on cold start.

| Element | String (exact) |
|---|---|
| Badge | **AI-Inspired Document Processing** (shimmer animation over a gradient) |
| Badge #2 | **Free Forever** (heart icon) |
| Hero title | **Make Your Notes**<br>**Printable** (second line in gradient) |
| CTA button | **Start Processing** (pulse animation, upload icon) → sets state to `0` (Upload) |

### "How It Works" (6 steps)

| # | Title | Subtitle |
|---|---|---|
| 1 | Upload PDF | No server upload required. |
| 2 | Preview & Edit | Select pages to keep. |
| 3 | Enhance | Invert colors & clean background. |
| 4 | Layout | Multiple slides per page. |
| 5 | Process | Local browser processing. |
| 6 | Download | Print-ready PDF. |

(Note the marketing copy "Local browser processing" — the app is an Android app; the actual processing is on-device native code. The copy is leftover from a web version.)

### "Why Choose Us?" feature chips

Lightning Fast · Complete Privacy · Print-Optimized · No Installation · Save Ink & Paper · **100% Free**

---

## 2. Upload (`p102x3/ef` → UploadScreen, state `0`)

| Element | String (exact) |
|---|---|
| Title | **Upload Files** |
| Subtitle | Select PDF files from your device to begin processing. |
| Dropzone | Whole card is clickable → launches system picker (`GetContent`, multiple) |

### Social-proof stats (shown while no files selected)

| Stat | Value |
|---|---|
| Files Processed | 300k+ |
| Students Helped | 50k+ |
| Thank You | 5k+ |

### 12 feature tiles (grid)

| Tile | Subtitle |
|---|---|
| Reorder | Organize pages |
| Edit Pages | Modify content |
| Remove Logo | Clean pages |
| Grayscale | Save ink |
| Separators | Add lines |
| Page No | Add numbering |
| Merge PDFs | Combine files |
| Invert Colors | Dark to Light |
| Clear Background | Remove noise |
| Multiple Slides | Grid layout |
| Remove Slides | Delete pages |
| Black & White | High contrast |

### Logic
- Files come back from picker as a list of `Uri`s; each becomes a `PDFDocument` (`p087u3/f`) with `id = UUID.randomUUID()`, `name`, `size`, `pageCount` (from `PdfRenderer`), and per-page `thumbnails`.
- **Continue** → state `2` (Reorder). Note: in the current build the flow is driven forward by the Continue handlers inside each screen; the worker `p092v3/q` only starts from the Enhance screen (state 4).

---

## 3. Reorder (state `2`)

- Drag-and-drop list of page thumbnails (`PDFPage` items keep `originalPageIndex`).
- **Continue** → state `3` (Preview).

## 4. Preview / Edit (state `3`)

- Grid of page thumbnails with selection toggles; unselected pages are dropped (`Remove Slides`).
- Per-page manual edits (`p087u3/h`): invert rectangle / invert oval / mask rectangle / mask oval (color), applied later on the rendered bitmap.
- **Continue** → state `4` (Enhance).

## 5. Enhance (state `4`)

Settings screen for `FilterSettings` + `OutputSettings`:

- **Invert Colors** (default ON)
- **Clear Background** (default ON) + background threshold slider (default **180**)
- **Grayscale** (default OFF)
- **Black & White** (default OFF)
- **Remove Logo** (drag a box, shape `rectangle` or oval)
- Quality: LOW / MEDIUM / HIGH (72 / 150 / 300 DPI)
- Page size: A4 / ORIGINAL
- Orientation: PORTRAIT / LANDSCAPE
- N-up grid rows × cols (default **3 × 1**)
- Separators between cells (default OFF)
- Page numbers (default ON)

Each change writes straight to `SharedPreferences("enhance_prefs")` and updates the ViewModel state.

**Process** → runs the pipeline: state → Processing; worker `p092v3/q` runs.

## 6. Processing

Progress published as `Processing(currentPage, totalPages, currentBatch, totalBatches, progress, status)`.

- `progress = currentPage / totalPages` (float), displayed as `getPercentComplete() = progress * 100`.
- Status strings observed: `"idle"` (initial), plus batch/page statuses emitted by the worker while rendering/enhancing.

On success → `ReadyToDownload(originalSize, pageCount)`, then `Complete(originalSize, processedSize, outputUri)` and the screen switches to the Success screen.

## 7. Success (`p083t3/L`)

| Button | Action (exact) |
|---|---|
| **View File** | `FileProvider` `ACTION_VIEW` on `outputUri` |
| **Share File** | `ACTION_SEND` chooser (shares the processed PDF) |
| **Download** | Re-runs the full processing to a fresh copy via workers `X` → `V`; filename gets `(2)`, `(3)` … dedupe |
| **Process Another** | `Y.h()` — full reset, back to Upload |

---

## Output artifacts

- File name: `<basename>_processed.pdf`, deduplicated with `(2)`, `(3)`.
- Location: `getExternalFilesDir(null)/NotesCrafterFiles/` (app-private external storage).
- Format: JPEG-embedded PDF (quality 80), pages 1 per sheet at `ORIGINAL`, N-up otherwise; A4 MediaBox for `A4`, source page box for `ORIGINAL`.
