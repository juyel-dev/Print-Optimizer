# 23 — Logo Removal: Complete Implementation Deep Dive

Feature: user selects a rectangular/elliptical region on a page preview, and the
app fills that region with white pixels (via native ARM64 code) so a watermark /
logo / header text disappears from the exported PDF.

---

## 1. End-to-End Chain (verified)

```
EnhanceScreen (H4) "Remove Logo" section
   └─ toggle "Enable Logo Removal" (removeLogo flag)
   └─ button (enabled when removeLogo && logoBox != null)  → S4
        └─ LogoSelectionScreen (A6) — drag to draw box, pick shape, fine-tune
             └─ Confirm button → C2306q case 3 (p083t3)
                  ├─ reads RectF box from MutableState (drag result)
                  ├─ shape = B6 enum .name().toLowerCase(ROOT)   → "rectangle" | "circle"
                  └─ invokes R4 (O3.e) with (box, shape)
                       └─ R4 case 0: filterSettings.copy(
                               removeLogo = true, logoBox = box, logoShape = shape)
                          + closes the LogoSelection dialog
   └─ "Apply" → PDFProcessor.k(bitmap, filterSettings)
        ├─ processPage(pixels, w, h, invert, grayscale, clearBg, bAndW, threshold)   [native]
        └─ if (removeLogo && logoBox != null)
             removeLogo(pixels, w, h,
                        logoBox.left, logoBox.top, logoBox.width(), logoBox.height(),
                        logoShape == "circle")                                        [native]
```

## 2. UI Layer

### 2.1 EnhanceScreen — `p102x3/H4.java` (= `EnhanceScreen.kt`)
- L84: section header `Z4.i("Remove Logo", ...)`
- L87: reads current `filterSettings.getRemoveLogo()`
- L98: toggle row `Z4.d("Enable Logo Removal", "Select region to remove", removeLogo, onToggle, ...)`
- Button to open selection (only visible when `removeLogo && logoBox != null`):
  passes current `logoBox` to `S4`.

### 2.2 `p102x3/S4.java` (L45–62)
- Reads `bVar.getLogoBox()`
- L62: `A6.c(context, logoBox, (e) filterSettings, onConfirm, ...)` — opens the
  LogoSelectionScreen dialog.

### 2.3 LogoSelectionScreen — `p102x3/A6.java` (= `LogoSelectionScreen.kt`)
Composables (from Compose trace strings):

| trace: line | composable |
|---|---|
| LogoSelectionScreen.kt:80 | `LogoSelectionScreen` (dialog host) |
| LogoSelectionScreen.kt:371 | `ShapeOption` |
| LogoSelectionScreen.kt:422 | `LogoSelectionOverlay` (drag box) |
| LogoSelectionScreen.kt:479 | `FineTuneControls` |
| LogoSelectionScreen.kt:541 | `TinyControlIcon` |
| LogoSelectionScreen.kt:119 | `ComposableSingletons$LogoSelectionScreenKt.lambda-1` (header) |
| LogoSelectionScreen.kt:352 | `lambda-2` (footer) |
| LogoSelectionScreen.kt:135/189/203 | nested confirm/cancel handlers |
| LogoSelectionScreen.kt:487/507/531 | fine-tune sliders/steppers |

- `p102x3/B6.java` = enum `Shape { RECTANGLE, CIRCLE }` — drives both the
  selection overlay (rect vs ellipse drawing) and the native branch.
- Confirm (C2701u6 @ 531 etc.) → final lambda `C2306q` case 3.

### 2.4 Confirm lambda — `p083t3/C2306q.java` case 3 (L75–80)
```java
RectF rectF = (RectF) ((MutableState) obj3).getValue();          // drawn box
String lowerCase = ((B6) ((MutableState) obj2).getValue())
        .name().toLowerCase(Locale.ROOT);                        // "rectangle"|"circle"
((O3.e) obj).invoke(rectF, lowerCase);                           // → R4
```

### 2.5 Apply lambda — `p102x3/R4.java` case 0 (L33–41)
```java
b bVar = (b) this.f14351r;                                       // current FilterSettings
((c) this.q).invoke(bVar.copy(..., removeLogo = true,            // bit 32
                               logoBox = box,                    // bit 64
                               logoShape = shape));              // bit 128 (SpotShadowColor)
this.p.setValue(Boolean.FALSE);                                  // close dialog
```
Note the copy mask 247 = 0b11110111: every field is taken from the new lambda
params (not preserved from old state) — the whole FilterSettings is replaced by
the selection result.

## 3. Data Model — `p087u3/b.java` (FilterSettings)

| field | type | set by |
|---|---|---|
| invertColors | boolean | E4 case A |
| clearBackground | boolean | E4 case B |
| grayscale | boolean | E4 case C |
| blackAndWhite | boolean | E4 case D |
| backgroundThreshold | int | EnhanceScreen slider |
| removeLogo | boolean | R4 case 0 (always true on confirm) |
| logoBox | RectF | R4 case 0 (drawn box, pixel coords) |
| logoShape | String | R4 case 0 ("rectangle"/"circle") |

## 4. Processing Pipeline — `com/notescrafter/service/PDFProcessor.java`

### 4.1 JNI surface (native → `libnotescrafter-native.so`)
```java
native int    processPage(int[] pixels, int w, int h,
                          boolean invert, boolean grayscale,
                          boolean clearBg, boolean bAndW, int threshold);
native void   removeLogo(int[] pixels, int w, int h,
                         float left, float top, float rectW, float rectH,
                         boolean isCircle);
native void   fillRegion / fillRegionOval(int[] pixels, int w, int h, float l, float t, float rw, float rh, int color);
native void   invertRegion / invertRegionOval(...);
native long   initPdfWriter(String path);
native boolean writePageNative(long writer, byte[] jpeg, int w, int h);
native boolean finishPdfWriter(long writer);
```

### 4.2 `k(Bitmap, FilterSettings)` — L71–83 (verified)
```java
public final void k(Bitmap bitmap, b filterSettings) {
    int width = bitmap.getWidth();
    int height = bitmap.getHeight();
    int[] iArr = new int[width * height];
    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);        // ARGB8888 ints

    processPage(iArr, width, height,
        filterSettings.getInvertColors(), filterSettings.getGrayscale(),
        filterSettings.getClearBackground(), filterSettings.getBlackAndWhite(),
        filterSettings.getBackgroundThreshold());

    if (filterSettings.getRemoveLogo()) {
        RectF logoBox = filterSettings.getLogoBox();
        if (logoBox != null) {
            removeLogo(iArr, width, height,
                logoBox.left, logoBox.top, logoBox.width(), logoBox.height(),
                o.b(filterSettings.getLogoShape(), "circle"));    // ← KEY LINE
        }
    }
}
```

### 4.3 KEY INSIGHT — `o.b(logoShape, "circle")`
`o` is `kotlin.jvm.internal.o` (Intrinsics). `o.b(a, b)` is the
`==` equality helper — it does **NOT** mean "default to circle".

It compiles from Kotlin `logoShape == "circle"` and returns a **boolean**,
which matches the native signature's last param `boolean z3`.

So the native branch is: `isCircle = (logoShape == "circle")`.
- `logoShape == null` → false → **rectangle** fill
- any string other than exactly `"circle"` (case-sensitive) → rectangle
- only `"circle"` (as produced by `B6.CIRCLE.name().toLowerCase(ROOT)`) → ellipse

## 5. Native Algorithm — `removeLogo` (ARM64, Ghidra dump: `re/docs/disassembly/removeLogo.txt`)

Symbol: `Java_com_notescrafter_service_PDFProcessor_removeLogo`, 0x1cbdc, ~250 B.

JNI arg mapping (standard JNI):
```
x0 JNIEnv    x1 this     x2 int[] pixels     x3 w(int)     x4 h(int)
s0 left      s1 top      s2 rectW            s3 rectH      w5 isCircle (boolean)
```

### 5.1 Entry (0x1cbdc–0x1cc38)
- save callee regs, load env vtable into x8
- `blr x8` → `GetIntArrayRegion(env, pixels, 0, w, buf)` — copies the Java
  `int[]` into a native buffer; `cbz x0` → bail at 0x1ce34 (no dirty buffer,
  empty result).
- float args parked in s8..s11; w/h kept in w22/w24; isCircle in w23.

### 5.2 Bounds computation (0x1cc38–0x1cc9c)
- `scvtf w22,w24` → bitmap dims as float
- multiply rect corners by dims, `fcvtzs` to int → integer bounding box
  x0..x1, y0..y1 (clamped with `csel`/`bic asr 31` so negative → 0,
  overflow → edge)
- `tst w23, 0xff` on the **isCircle** flag → decides fill mode:
  - `b.eq 0x1ce58` — isCircle == false → **RECTANGLE path**
  - fall-through → **ELLIPSE path** (0x1cca0)

### 5.3 ELLIPSE path (0x1cca0–0x1ce30) — NEON per-pixel mask
- `scvtf` cx/cy/rx/ry (center + radii), squares them
- `dup v6.4s, w25` = `{4,4,4,4}` lane stride; `dup v5.4s, 1.0`
- row loop `y`: for each row compute `t = (y-cy)/ry`, `t²`
- inner 4-pixel SIMD loop:
  - `scvtf v21.4s, x, x+4` (4 pixels at once)
  - `fsub` → dx from center; `fmul` → dx²; `fdiv` by rx²
  - `fadd` → `dx²/rx² + dy²/ry²`
  - `fcmge v21, 1.0` → mask (0xFFFFFFFF if ≤ 1.0, else 0)
  - `xtn` → 4 halfwords; `umov`/`tbnz w1, #0..3` → per-lane branch
  - stores `w16` (= -1 = **0xFFFFFFFF = white**) at matching pixel offsets
    (`stur w16,[ptr,-8]` / `str w16,[ptr]` / `str w16,[ptr,+4]`…)
- `fcmp s19, s17; b.hi` → skip when out of ellipse → next row.

### 5.4 RECTANGLE path (0x1ce58–0x1ce98) — memset rows
- `subs w23, w9, w8` → row length
- `madd w24 = x0 * w + y` → pixel index; `ubfiz x27 = index << 2` → byte offset
- per row: `memset(buf + offset, 0xFF, (x1-x0+1)*4)` — whole row span filled
  white in one call
- loop rows y0..y1 (`subs w23; b.eq`, `cmp; b.ge`).

### 5.5 Exit (0x1ce9c–0x1ced4)
- `ldr x4, [x8, vtable+0x618]` → `SetIntArrayRegion(env, pixels, 0, w, buf)`
- `br x4` — tail call, write back to Java `int[]`.

### 5.6 Summary of native behavior
| mode | condition | method | fill color |
|---|---|---|---|
| RECTANGLE | `logoShape == "circle"` is false | per-row `memset` (0xFF) | `0xFFFFFFFF` white |
| ELLIPSE | `logoShape == "circle"` is true | NEON per-pixel ellipse test | `0xFFFFFFFF` white |

- Fill is **pure white**, not background-color matched.
- In-place on the pixel buffer; result written back to the Java array;
  caller then re-wraps to Bitmap and encodes to JPEG for `writePageNative`.

## 6. Reconstructed Kotlin (equivalent source)
```kotlin
// PDFProcessor.kt (reconstructed)
fun process(bitmap: Bitmap, settings: FilterSettings) {
    val w = bitmap.width; val h = bitmap.height
    val pixels = IntArray(w * h)
    bitmap.getPixels(pixels, 0, w, 0, 0, w, h)

    processPage(pixels, w, h, settings.invertColors, settings.grayscale,
                settings.clearBackground, settings.blackAndWhite,
                settings.backgroundThreshold)

    if (settings.removeLogo && settings.logoBox != null) {
        removeLogo(pixels, w, h,
                   settings.logoBox.left, settings.logoBox.top,
                   settings.logoBox.width(), settings.logoBox.height(),
                   settings.logoShape == "circle")          // ← string equality!
    }
    ...encode & writePageNative / finishPdfWriter...
}

// LogoSelectionScreen.kt (reconstructed, confirm)
Button(onClick = {
    onConfirm(box, shape.name.lowercase())   // "rectangle" | "circle"
    showDialog.value = false
})

// EnhanceScreen.kt (reconstructed, apply)
onConfirm = { box, shape ->
    settings = settings.copy(removeLogo = true, logoBox = box, logoShape = shape)
}
```

## 7. File Map

| file | role |
|---|---|
| `com/notescrafter/service/PDFProcessor.java` | JNI wrapper + `k()` pipeline (L71–83, key line L80) |
| `p087u3/b.java` | FilterSettings model (removeLogo/logoBox/logoShape) |
| `p102x3/H4.java` | EnhanceScreen — Remove Logo section (L84–98) |
| `p102x3/S4.java` | opens LogoSelectionScreen, passes logoBox (L45–62) |
| `p102x3/A6.java` | LogoSelectionScreen.kt (5 composables) |
| `p102x3/B6.java` | enum Shape { RECTANGLE, CIRCLE } |
| `p083t3/C2306q.java` | confirm lambda case 3 (L75–80): box + shape name → R4 |
| `p102x3/R4.java` | case 0 (L33–41): FilterSettings.copy + close dialog |
| `p102x3/E4.java` | toggle handlers for other filters (removeLogo reset path) |
| `p102x3/AbstractC2493h5.java` | home tools list entry "Remove Logo — Clean pages" (L98) |
| `p102x3/ef.java` | tool selection UI entry (L374) |
| native `.so` | `NotesCrafter/split-arm64/lib/arm64-v8a/libnotescrafter-native.so` (276 KB) |
| `re/docs/disassembly/removeLogo.txt` | Ghidra ARM64 dump (219 lines) |

## 8. Notes / gotchas
1. **`o.b(x, "circle")` is equality, not a default.** A `null` logoShape
   silently behaves as rectangle.
2. Shape string is case-sensitive; the app always sends lowercase from the
   enum, so they match.
3. Coordinates passed are float (pixel space), converted to int in native;
   box is clamped to bitmap bounds.
4. The ellipse test is `(dx/rx)² + (dy/ry)² ≤ 1` evaluated with NEON 4-lane
   SIMD — a true ellipse fill, not a bounding-box fill.
5. Fill color is pure white `0xFFFFFFFF` — on a white page this reads as
   "erased"; on dark pages it will show a white block.
6. FilterSettings.copy mask 247 (0b11110111) replaces ALL fields in the
   confirm path — only values passed by R4 survive.
