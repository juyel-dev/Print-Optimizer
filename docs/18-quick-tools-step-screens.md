# 18 — Quick Tools step screens & leftovers

> App: **com.notescrafter.app** v4.0.8 · Compose
> Source: `p102x3/Ud.java` (registry), `p102x3/C9.java` (PdfSplitScreen.kt),
> `p102x3/Z9.java` (PdfToJpgScreen.kt), `p102x3/AbstractC2416c8.java`
> (PdfCropScreen.kt), `p102x3/AbstractC2447e7.java` (PdfAddPageNumbersScreen.kt),
> `p102x3/AbstractC2494h6.java` (JpgToPdfScreen.kt),
> `p102x3/AbstractC2545k9.java` (PdfOrganizeScreen.kt),
> `p102x3/AbstractC2782z7.java` (PdfCompressScreen.kt),
> `p102x3/AbstractC2783z8.java` (PdfInvertScreen.kt)

## 1. Registry recap (`Ud.java`)

| Tool | Route | Category |
|---|---|---|
| merge-pdf "Merge PDF" | `pdf-merge` | PDF Tools |
| split-pdf "Split PDF" | `pdf-split` | PDF Tools |
| compress-pdf "Compress PDF" | `pdf-compress` | PDF Tools |
| add-page-numbers "Add Page Numbers" | `pdf-add-page-numbers` | PDF Tools |
| organize-pdf "Organize PDF" | `pdf-organize` | PDF Tools |
| crop-pdf "Crop PDF" | `pdf-crop` | PDF Tools |
| invert-pdf "Invert PDF" | `pdf-invert` | PDF Tools |
| pdf-to-jpg "PDF to JPG" | `pdf-to-jpg` | Image Tools |
| jpg-to-pdf "JPG to PDF" | `jpg-to-pdf` | Image Tools |
| pomodoro "Pomodoro Timer" | `pomodoro-setup` | Focus |

Categories: `"All", "PDF Tools", "Image Tools", "Calculators", "Focus"`.

### "Calculators" is an EMPTY category

`f14501a` contains **zero** entries with category `"Calculators"` — a
category chip that filters to an empty grid (UI dead-end / placeholder for a
planned tool, e.g. an exam/percentage calculator).

## 2. Step-screen file map

| Screen | Root trace | File | Step item |
|---|---|---|---|
| PdfSplitScreen | PdfSplitScreen.kt:62 | `C9.java` | SplitStepItem (1078) |
| PdfCompressScreen | PdfCompressScreen.kt:62 | `AbstractC2782z7.java` | CompressStepItem (1154) |
| PdfInvertScreen | PdfInvertScreen.kt:62 | `AbstractC2783z8.java` | PdfInvertStepItem (992) |
| PdfCropScreen | PdfCropScreen.kt:64 | `AbstractC2416c8.java` | PdfCropStepItem (1149) |
| PdfOrganizeScreen | PdfOrganizeScreen.kt:72 | `AbstractC2545k9.java` (5000+ lines) | PdfOrganizeStepItem (1236) |
| PdfToJpgScreen | PdfToJpgScreen.kt:73 | `Z9.java` | PdfToJpgStepItem (1029) |
| JpgToPdfScreen | JpgToPdfScreen.kt:74 | `AbstractC2494h6.java` | JpgToPdfStepItem (1128) |
| PdfAddPageNumbersScreen | PdfAddPageNumbersScreen.kt | `AbstractC2447e7.java` | PdfAddPageNumbersStepItem (364) |

## 3. Shared step architecture

Every tool follows the same single-screen wizard state (seen in
`PdfSplitScreen`):

```
states:
  file (null) → pageCount, size, name ("")
  mode enum   (e.g. EnumC2677se — split/compress mode)
  param text  ("1", "1,3-5", quality…)
  progress (0f), status ("Processing..."), result list, error
```

Steps (each screen's `StepItem`): **choose file → configure params → process
→ result/export** — with the shared tool scaffold (top bar, progress bar,
`click_scale` buttons). Processing reuses the same local `PDFProcessor`
pipeline as FLOW (no server). Route-level `pdf-crop` also aliases the Flow's
Preview crop entry point (`p083t3/A.java`).

---

## 4. PRINTS leftovers (no work — noted for completeness)

- **`PrintNotebookItem`** (`p087u3/m.java:216`): a third cart item variant
  (`id, name, pages, …`) — the "Notebook" product.
- **`NotebookConfiguratorCard`** (PrintOrderScreens.kt:1228, `Gd.java`) —
  checkout card where the notebook's cover/page settings are configured.
- **`A4CoverPage`** (PrintOrderScreens.kt:~200, `Gd.java`) — the generated
  A4 cover sheet for notebooks.
- **`LiveNotebookCoverShowcase`** (PrintOrderScreens.kt:749, `Gd.java`) —
  live preview of the cover as settings change.
