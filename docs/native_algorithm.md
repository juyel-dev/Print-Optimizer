# Native Enhancement Pipeline — `processPage`

`Java_com_notescrafter_service_PDFProcessor_processPage` at `0x1c230` in `libnotescrafter-native.so` (stripped, arm64-v8a, Android clang 18.0.1, ~2476 bytes).

Signature: `processPage(int[] pixels /* ARGB ints */, int width, int height, boolean invert, boolean grayscale, boolean clearBackground, boolean blackAndWhite, int threshold)`

## Stage 1 — Invert

```
pixel ^= 0xFFFFFFFF        (all RGB channels, alpha untouched)
```

## Stage 2 — Grayscale (Rec.601 luma)

```
luma = (299*R + 587*G + 114*B) / 1000
```

## Stage 3 — Clear background

```
avg = (R + G + B) / 3
if (avg <= threshold)  pixel = pixel * 1.2      // dark-ish: slight boost
else                   pixel = WHITE            // bright: strip to white
```

## Stage 4 — Black & White (adaptive thresholding)

Only when `blackAndWhite == true`:

### 4a. Gamma pre-enhancement

Allocates `luma[width*height]` (u8) and `integral[width*height]` (u32).

```
for each pixel:
    luma[i] = (int)(255 * powf(R / 255.0f, 0.6f))     // R == G == B after grayscale
```

### 4b. Integral image (summed-area table)

- Row pass: `integral[i] = integral[i-1] + luma[i]` (row prefix sums).
- Column pass: `integral[y*w+x] = integral[(y-1)*w+x] + rowSum`.

Result: `integral[y*w+x]` = sum of the rectangle `(0,0)-(x,y)` → O(1) window sums.

### 4c. Window threshold

For each pixel `(x, y)`:

```
top    = max(0, y-10)        bottom = min(height-1, y+10)
left   = max(0, x-10)        right  = min(width-1,  x+10)
windowArea = (right-left+1) * (bottom-top+1)
windowMean = windowSum / windowArea            // from integral image

if (pixelLuma >= windowMean - 10.0f)  out = WHITE (0xFF)
else                                  out = BLACK (0x00)
```

Output pixel: `A<<24 | out<<16 | out<<8 | out` — **alpha preserved**, RGB forced to pure black/white. The `-10` bias makes the binarization more aggressive (less black speckle).

This is classic local/adaptive thresholding (Bradley-type, without variance) — the reason uneven lighting and shadows don't break the output.

## Related JNI entry points

| Symbol | Address | Purpose |
|---|---|---|
| `processPage` | `0x1c230` | full-page enhancement (this doc) |
| `removeLogo` | `0x1cbdc` | erase logo region (rect or circle) |
| `fillRegion` | `0x1ced8` | fill rect with color (MaskRect) |
| `invertRegion` | `0x1d07c` | invert rect (InvertRect) |
| `fillRegionOval` | `0x1d3c8` | fill oval with color (MaskOval) |
| `invertRegionOval` | `0x1d224` | invert oval (InvertOval) |
| `initPdfWriter` | `0x1d654` | create PDF-1.4 writer, returns handle |
| `writePageNative` | `0x1d704` | embed page as DCTDecode (JPEG) XObject |
| `finishPdfWriter` | `0x1d7b8` | finalize and close |

## PDF writer format

Page image dictionary (from `.rodata`):

```
<< /Type /XObject /Subtype /Image /Width %d /Height %d
   /ColorSpace /DeviceRGB /BitsPerComponent 8 /Filter /DCTDecode /Length %zu >>
```

Content stream: `q %d 0 0 %d 0 0 cm /Img Do Q` — from-scratch PDF-1.4 writer, **no third-party libraries** (no libjpeg/libpng/zlib linked; JPEG data is produced on the Java side via `Bitmap.compress(JPEG, 80, …)`).

## Diagnostics

- Error path (bad dimensions) logs via `__android_log_print` (tag `NotesCrafterNative`, priority ERROR) and returns 0.
