# End-to-End Flow: Upload → Process → Download

State machine `p083t3/Y`: `−1` Landing → `0` Upload → `2` Reorder → `3` Preview → `4` Enhance → Success. Route `"flow"` is selected in `p083t3/L`.

## 1. Upload (state 0)

- **Screen**: `p102x3/ef.java` (UploadScreen) — "Upload Files" → `GetContent` picker.
- **Page count worker**: `p092v3/o.java` — `ContentResolver.openFileDescriptor(uri, "r")` + `PdfRenderer.getPageCount()`.
- Each page becomes a `p087u3/g` (`PageItem`): `sourceUri` + `originalPageIndex`, plus `isSelected`, `isEnabled`, `edits` list.

## 2. Reorder (state 2)

- Worker `p083t3/U.java`: drag to reorder, toggle page selection → Continue.

## 3. Preview (state 3)

- Per-page preview with `PDFProcessor.k(bitmap, filterSettings)`: `getPixels` → native `processPage` → optional `removeLogo` → `setPixels` (PDFProcessor.java:71-83).
- Tapping a page adds a **manual edit** (`p087u3/h` sealed class):
  - `InvertRect(rect)` → native `invertRegion`
  - `InvertOval(rect)` → native `invertRegionOval`
  - `MaskRect(rect, color)` → native `fillRegion`
  - `MaskOval(rect, color)` → native `fillRegionOval`
- Filters (`p087u3/b`): `invertColors`, `clearBackground`, `grayscale`, `blackAndWhite`, `backgroundThreshold` (default 180), `removeLogo` + `logoBox`/`logoShape`.

## 4. Enhance (state 4) — core worker `p092v3/q.invokeSuspend`

Triggered from Preview via "Continue" (`L.java` case 6), or from the Enhance screen via "Process File" → worker `p083t3/V.java` → `PDFProcessor.n(pages, filters, outputSettings, name)`.

1. **Filename**: `<basename>_processed.pdf`, deduplicated with ` (2)`, ` (3)`… in `getExternalFilesDir(null)/NotesCrafterFiles/`.
2. **`initPdfWriter(path)`** → native handle (0 ⇒ fail).
3. Log: `Output Config: Size=..., Orientation=..., Rows=..., Cols=..., Quality=...`.
4. **Sheets** = `ceil(pageCount / (rows × cols))`; `documentSize == ORIGINAL` ⇒ 1×1.
5. Per sheet (progress `u3.t(sheet, total, "processing")`, `System.gc()` every 5):
   - **DPI ratio**: HIGH → 4.16 (≈300 DPI), MEDIUM → 2.77 (≈200 DPI), LOW → 1.38 (≈100 DPI) — mapping `p092v3/p.f13554a`; the enum's own `dpi` field (72/150/300) is not used.
   - Canvas = first page of group rendered size × ratio (fallback A4 595×842 pt), white.
   - Each page: `PdfRenderer.openPage(idx)` → aspect-fit bitmap (`ARGB_8888`, white) → `render(bitmap, rect, 0, 1)`; red placeholder on failure. Log: `Rendered Page i (w x h): CenterPixel=0x…`.
   - Apply per-page edits (native region ops).
   - If any filter enabled: `processPage(pixels, w, h, invert, grayscale, clearBg, bw, threshold)` (see `native_algorithm.md`).
   - `removeLogo(logoBox, isCircle)` if enabled.
   - `drawBitmap` centered in the sheet cell.
   - **Separation lines**: 2px black `Paint.Style.STROKE` between cells (only if `addSeparationLines` and not ORIGINAL).
   - **Page number**: bottom-center, 30px, `Paint.Align.CENTER`.
   - **`bitmap.compress(JPEG, 80, baos)`** — quality fixed at 80 → `writePageNative(handle, jpegBytes, w, h)`.
   - **OOM**: recycle tracked bitmaps → downgrade quality (MEDIUM→LOW, HIGH→MEDIUM) → retry sheet (≤3).
6. `finishPdfWriter(handle)` (also in `finally`; failure logged as `"Failed to close native writer in finally block"`) → emit `"complete"`.

## 5. Success → View / Share / Download

- Worker `p083t3/X.java`: after processing, `PDFProcessor.l()` returns the **newest** `.pdf` in `NotesCrafterFiles/` → result state `u.a(size, pageCount, Uri.fromFile(file))`; errors become `u.b(message)`.
- **View_File**: `FileProvider` → `ACTION_VIEW` (`application/pdf`).
- **Share_File**: `FileProvider` → `ACTION_SEND` chooser ("Share PDF").
- **Download**: re-runs the same pipeline via `X` ("Starting Download..." progress).
- **Process_Another**: resets to Landing (`Y.h()`).

## Notes

- The output lives in app-private external storage (`Android/data/<pkg>/files/NotesCrafterFiles/`) — it is *not* written to public Downloads; sharing goes through `FileProvider`.
- `PDFProcessor.i()`: memory-aware quality — free memory < 50 MB → LOW; ≥ 100 MB or non-HIGH request → unchanged; else HIGH→MEDIUM.
- All processing is on-device; `Log.d("PDFProcessor", …)` / `Log.e("PDFProcessor", …)` used for diagnostics.
