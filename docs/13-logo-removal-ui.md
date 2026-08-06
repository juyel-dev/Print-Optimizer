# 13 — Logo removal UI (`LogoSelectionScreen.kt`)

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p102x3/A6.java` (whole LogoSelectionScreen.kt), `p102x3/B6.java`
> (shape enum), `p102x3/EnumC2422ce.java` (resize mode)
> Companion UI: `p102x3/AbstractC2588n4.java` (EditPageScreen.kt:66)

One file, five composables:

| Composable | Kt line | A6 method | Signature |
|---|---|---|---|
| `LogoSelectionScreen` | 80 | `c` | `(pages: List<…>, rectF: RectF?, onConfirm, onCancel)` |
| `ShapeOption` | 371 | `d` | `(str, selected: Boolean, onClick)` |
| `LogoSelectionOverlay` | 422 | `b` | `(color, selection: RectF, shape, onSelectionChange)` |
| `FineTuneControls` | 479 | `a` | `(onMove, onResize, resizeMode, onResizeModeChange)` |
| `TinyControlIcon` | 541 | `e` | `(icon, onClick)` |

Launched from the EditPage mask tool (draw a box → "Remove logo" flows into
this screen); `onConfirm` returns the normalized region.

---

## 1. Screen state (`A6.c`, kt:80)

| State | Default | Type |
|---|---|---|
| `selection` | `rectF ?: RectF(0.89f, 0.0f, 1.0f, 0.16f)` | `RectF` — **top-right corner** = where logos live |
| `shape` | `B6.RECTANGLE` | `B6` = `RECTANGLE` / `CIRCLE` |
| `resizeMode` | `EnumC2422ce.BOTH` | `EnumC2422ce` = `BOTH` / `WIDTH` / `HEIGHT` (which handles the fine-tune pad resizes) |
| `pageIndex` | `0` | `IntState` — which page preview is shown |
| preview size | `IntSize.Zero` | layout size of the rendered page |

`selection` is a **normalized 0..1 rect** against the page size; current page
picked with `u.s0(pageIndex, pages)` (fallback `u.r0`).

## 2. Layout

```
Column(fillMaxSize)
├─ Row(fillMaxWidth, spaceBetween, padding 16)      ← header
│   ├─ "Select Logo Region" (titleLarge bold)
│   └─ IconButton(onCancel, Icons close)
├─ page preview (Image, size captured into IntSize state)     ← weight 1f
│   └─ LogoSelectionOverlay(selection, shape, onSelectionChange)
├─ FineTuneControls(onMove, onResize, resizeMode, onResizeModeChange)
└─ footer Column(padding 16):
    ├─ "Logo will be removed from all pages" (bodyMedium gray)
    └─ Row: [OutlinedButton(onCancel) "Cancel"]
           [OutlinedButton(onConfirm) "Apply"]      ← height 48dp, weight 1f
```

The `onSelectionChange` sink keeps `RectF` normalized to the preview size, so
rotations/first-layout don't break the box.

## 3. LogoSelectionOverlay (`A6.b`, kt:422)

`Box(fillMaxSize, TopStart)`:

- inner box: `offset(px = selection.left*w, selection.top*h)` +
  `size(px = selection.width()*w, selection.height()*h)`
- `Canvas(fillMaxSize)` (worker `b(shape, 5)`) draws the selection outline —
  **rect or circle** depending on `shape` — with the given `color`.

## 4. FineTuneControls (`A6.a`, kt:479)

Two 72dp-tall cards stacked with 12dp spacing:

1. **Move pad** (`C2685t6` content) — drag anywhere inside to move the region
   (`onMove` with normalized delta)
2. **Resize pad** (`C2717v6` content) — drag a corner handle; behavior
   switches between `BOTH`/`WIDTH`/`HEIGHT` (`onResizeModeChange`), each mode
   has its own cursor/handle rendering

## 5. TinyControlIcon / ShapeOption

- `TinyControlIcon` (`A6.e`): small icon `IconButton` used for the pad
  handles
- `ShapeOption` (`A6.d`): pill label (`14sp`, medium weight) with
  selected/unselected state → the Rectangle/Circle toggle row

---

## 6. How it connects to processing

On confirm, the region becomes the stored mask:

- `enhance_prefs` keys `remove_logo` (true), `logo_box` (the normalized rect),
  `logo_shape` (rect/oval) — consumed by the native `removeLogo` export
  (see `docs/disassembly/removeLogo.txt`)
- The same normalized-rect + shape model appears in EditPage's
  `SelectionOverlay` (EditPageScreen.kt:518) for the manual per-page masks
  (`InvertRect/InvertOval/MaskRect/MaskOval`)
