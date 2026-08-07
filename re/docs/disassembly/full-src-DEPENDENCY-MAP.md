# NotesCrafter full-src dependency map (auto-generated)

> App-internal references only (obfuscated p-packages + com.notescrafter).
> A -> B [Screen] means file A imports/instantiates B; B belongs to Screen.
> Search targets: screen names, class names, or file paths.

## 1. Most depended-on app classes

| # | class | # dependents |
|---|---|---|
| 1 | `p105y1/o.java` | 653 |
| 2 | `p111z2/b.java` | 380 |
| 3 | `p111z2/a.java` | 338 |
| 4 | `p111z2/g.java` | 126 |
| 5 | `p111z2/j.java` | 105 |
| 6 | `com/notescrafter/PrintOrderViewModel.java` | 104 |
| 7 | `p111z2/e.java` | 85 |
| 8 | `p105y1/q.java` | 82 |
| 9 | `p111z2/d.java` | 77 |
| 10 | `p111z2/h.java` | 75 |
| 11 | `p105y1/t.java` | 74 |
| 12 | `p111z2/c.java` | 72 |
| 13 | `p109z0/l.java` | 71 |
| 14 | `p111z2/f.java` | 64 |
| 15 | `p111z2/i.java` | 62 |
| 16 | `p105y1/p.java` | 62 |
| 17 | `p105y1/m.java` | 54 |
| 18 | `p090v1/C2366q.java` | 49 |
| 19 | `p105y1/r.java` | 44 |
| 20 | `p111z2/k.java` | 44 |
| 21 | `p083t3/C2290i.java` | 43 |
| 22 | `p105y1/n.java` | 41 |
| 23 | `p047l/C2174e.java` | 39 |
| 24 | `com/notescrafter/service/PDFProcessor.java` | 39 |
| 25 | `p083t3/C2321y.java` | 32 |
| 26 | `p105y1/v.java` | 31 |
| 27 | `p082t2/AbstractC2268x.java` | 31 |
| 28 | `p064o2/AbstractC2198a.java` | 29 |
| 29 | `p105y1/u.java` | 27 |
| 30 | `p083t3/C2306q.java` | 27 |

## 2. File -> dependencies (internal)

| file | label | internal deps |
|---|---|---|
| `com/notescrafter/MainActivity.java` | **[KNOWN]** MainActivity.kt (launcher: adb, razorpay, ads, setContent) renamed: N, H | p105y1/r.java [?]<br>p105y1/q.java [?]<br>p105y1/r.java [?]<br>p105y1/n.java [?]<br>com/notescrafter/utils/AnalyticsManager.java [?]<br>p111z2/f.java [?]<br>p111z2/a.java [?]<br>p111z2/h.java [?]<br>p105y1/m.java [?]<br>p105y1/o.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?]<br>... +19 more |
| `com/notescrafter/PrintOrderViewModel.java` | **[KNOWN]** PrintOrderViewModel (unobfuscated twin of p083t3/Y) renamed: f0, A | p111z2/f.java [?]<br>p105y1/t.java [?]<br>p105y1/q.java [?]<br>p105y1/x.java [?]<br>p105y1/n.java [?]<br>p105y1/t.java [?]<br>p111z2/e.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/c.java [?]<br>p083t3/C2275a0.java [?]<br>p083t3/C2277b0.java [?]<br>... +12 more |
| `com/notescrafter/service/NotesCrafterFCMService.java` | **[KNOWN]** FCM push service renamed: v | p111z2/f.java [?]<br>p111z2/d.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p111z2/e.java [?]<br>p047l/C2174e.java [?]<br>p111z2/i.java [?]<br>p105y1/m.java [?]<br>p047l/C2174e.java [?] |
| `com/notescrafter/service/PDFProcessor.java` | **[KNOWN]** PDFProcessor (JNI wrapper: processPage, removeLogo, fillRegion, invertRegion, ... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?] |
| `com/notescrafter/utils/AnalyticsManager.java` | **[KNOWN]** AnalyticsManager (logCtaClick) | p105y1/o.java [?] |
| `com/notescrafter/utils/ExamItem.java` | **[KNOWN]** ExamItem model | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `com/notescrafter/utils/NetworkUtils.java` | **[KNOWN]** NetworkUtils | p105y1/o.java [?] |
| `com/notescrafter/utils/ReviewHelper.java` | **[KNOWN]** ReviewHelper (in-app review) | p102x3/H1.java [PdfSplitScreen]<br>p105y1/o.java [?]<br>p102x3/U0.java [PdfCropScreen]<br>p111z2/i.java [?] |
| `com/notescrafter/utils/ToDoItem.java` | **[KNOWN]** ToDoItem model | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `com/notescrafter/utils/ToDoManager.java` | **[KNOWN]** ToDoManager (todo storage) | p105y1/o.java [?]<br>p111z2/d.java [?] |
| `p000a/a.java` |  | p105y1/m.java [?]<br>p105y1/u.java [?]<br>p111z2/d.java [?]<br>p111z2/f.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p111z2/h.java [?]<br>p111z2/j.java [?]<br>p111z2/k.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p105y1/o.java [?] |
| `p002a1/b.java` | renamed: o | p105y1/o.java [?] |
| `p002a1/c.java` | renamed: o, r | p105y1/o.java [?]<br>p111z2/g.java [?] |
| `p002a1/d.java` | renamed: o | p105y1/p.java [?] |
| `p002a1/e.java` | renamed: a | p111z2/g.java [?] |
| `p003a2/a.java` | trace: com.notescrafter.ui.screens.LiveChatScreen (LiveChatScreen.kt:23) renamed: a, b | p102x3/S7.java [PdfCropScreen]<br>p105y1/r.java [?]<br>p105y1/p.java [?]<br>p105y1/v.java [?]<br>p105y1/o.java [?]<br>p111z2/f.java [?]<br>p111z2/g.java [?]<br>p111z2/g.java [?]<br>p111z2/e.java [?]<br>p111z2/f.java [?]<br>p111z2/h.java [?]<br>p111z2/k.java [?]<br>... +5 more |
| `p003a2/b.java` | renamed: o | p111z2/c.java [?]<br>p111z2/a.java [?]<br>p111z2/e.java [?] |
| `p005b/a.java` | renamed: o | p111z2/c.java [?] |
| `p006b0/a.java` | renamed: o | p105y1/p.java [?] |
| `p006b0/b.java` | renamed: a | p105y1/o.java [?]<br>p111z2/d.java [?] |
| `p007b1/a.java` | renamed: a, b | p111z2/e.java [?] |
| `p007b1/c.java` | renamed: a | p111z2/a.java [?] |
| `p009b3/c.java` | renamed: m, a | p111z2/a.java [?]<br>p111z2/b.java [?]<br>p111z2/i.java [?]<br>p105y1/o.java [?] |
| `p009b3/f.java` | renamed: a, b | p111z2/b.java [?]<br>p111z2/i.java [?] |
| `p009b3/g.java` | renamed: a | p111z2/b.java [?]<br>p111z2/i.java [?] |
| `p009b3/i.java` |  | p111z2/b.java [?] |
| `p009b3/j.java` | renamed: b, c | p111z2/b.java [?] |
| `p010c/A.java` | renamed: a, b | p105y1/o.java [?]<br>p010c/C0689b.java [?] |
| `p010c/B.java` | renamed: a | p105y1/o.java [?] |
| `p010c/C.java` | renamed: o, r | p105y1/o.java [?]<br>p010c/InterfaceC0690c.java [?] |
| `p010c/C0688a.java` | renamed: c, a | p105y1/o.java [?]<br>p010c/C0688a.java [?] |
| `p010c/C0689b.java` | renamed: c, a | p111z2/a.java [?]<br>p105y1/o.java [?]<br>p010c/C0689b.java [?]<br>p010c/C0688a.java [?] |
| `p010c/C0692e.java` | renamed: c, o | p105y1/o.java [?]<br>p111z2/e.java [?]<br>p010c/C0692e.java [?] |
| `p010c/C0693f.java` | renamed: c, o | p105y1/o.java [?]<br>p010c/C0693f.java [?]<br>p010c/C0694g.java [?] |
| `p010c/C0694g.java` | renamed: c, a | p105y1/o.java [?]<br>p010c/C0694g.java [?] |
| `p010c/C0695h.java` | renamed: c, a | p102x3/B0.java [PdfAddPageNumbersScreen]<br>p010c/C0695h.java [?] |
| `p010c/D.java` | renamed: o | p105y1/o.java [?]<br>p010c/InterfaceC0690c.java [?] |
| `p010c/E.java` | renamed: o | p109z0/l.java [?] |
| `p010c/F.java` | renamed: a, b | p105y1/o.java [?] |
| `p010c/I.java` | renamed: o | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p105y1/p.java [?] |
| `p010c/InterfaceC0690c.java` | renamed: c | p010c/InterfaceC0690c.java [?] |
| `p010c/j.java` | renamed: o, r | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/c.java [?] |
| `p010c/k.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p111z2/c.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/g.java [?]<br>p111z2/b.java [?] |
| `p010c/l.java` | renamed: o | p105y1/u.java [?]<br>p105y1/p.java [?]<br>p010c/RunnableC0691d.java [?]<br>p010c/C0693f.java [?] |
| `p010c/m.java` | renamed: G, A | p111z2/k.java [?]<br>p105y1/m.java [?]<br>p105y1/q.java [?]<br>p105y1/y.java [?]<br>p105y1/z.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/C0.java [PdfAddPageNumbersScreen]<br>p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/f.java [?]<br>p111z2/e.java [?]<br>p111z2/b.java [?]<br>... +5 more |
| `p010c/n.java` |  | p105y1/q.java [?]<br>p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/f.java [?]<br>p111z2/g.java [?] |
| `p010c/p.java` |  | p105y1/t.java [?]<br>p105y1/u.java [?]<br>p105y1/v.java [?]<br>p105y1/w.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/g.java [?]<br>p111z2/b.java [?] |
| `p010c/q.java` |  | p105y1/t.java [?]<br>p105y1/u.java [?]<br>p105y1/v.java [?]<br>p105y1/w.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/g.java [?]<br>p111z2/b.java [?] |
| `p010c/r.java` |  | p105y1/o.java [?] |
| `p010c/RunnableC0691d.java` | renamed: c, o | p105y1/o.java [?]<br>p010c/RunnableC0691d.java [?] |
| `p010c/s.java` |  | p105y1/t.java [?]<br>p105y1/u.java [?]<br>p105y1/v.java [?]<br>p105y1/w.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/g.java [?] |
| `p010c/t.java` |  | p105y1/o.java [?] |
| `p010c/u.java` | renamed: a, b | p105y1/o.java [?] |
| `p010c/v.java` | renamed: a, b | p109z0/l.java [?]<br>p105y1/o.java [?]<br>p010c/InterfaceC0690c.java [?]<br>p010c/C0689b.java [?] |
| `p010c/ViewTreeObserverOnDrawListenerC0696i.java` | renamed: c, o | p105y1/o.java [?] |
| `p010c/w.java` | renamed: o | p105y1/p.java [?]<br>p010c/C0689b.java [?] |
| `p010c/x.java` | renamed: o | p105y1/p.java [?] |
| `p010c/z.java` | renamed: a | p105y1/o.java [?] |
| `p011c0/d.java` | renamed: a | p105y1/x.java [?]<br>p105y1/z.java [?]<br>p111z2/f.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p011c0/e.java` |  | p105y1/o.java [?] |
| `p012c1/a.java` | renamed: c, d | p111z2/c.java [?] |
| `p012c1/b.java` | renamed: a, b | p111z2/i.java [?] |
| `p012c1/c.java` | renamed: o, l | p102x3/Rd.java [?]<br>p102x3/Sd.java [QuickToolsScreen]<br>p102x3/X1.java [PomodoroSetupScreen] |
| `p012c1/d.java` | renamed: a, b | p111z2/h.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?]<br>p111z2/c.java [?]<br>p111z2/f.java [?]<br>p111z2/g.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p111z2/k.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p105y1/o.java [?]<br>... +6 more |
| `p013c2/d.java` | renamed: a, b | p102x3/M0.java [PdfCompressScreen] |
| `p013c2/e.java` | renamed: f, h | p111z2/a.java [?]<br>p105y1/m.java [?] |
| `p013c2/f.java` | renamed: o | p111z2/h.java [?] |
| `p013c2/g.java` | renamed: a, b | p111z2/f.java [?]<br>p111z2/g.java [?]<br>p111z2/f.java [?]<br>p111z2/k.java [?]<br>p105y1/o.java [?]<br>p105y1/p.java [?] |
| `p013c2/j.java` |  | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p013c2/k.java` |  | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p014c3/a.java` | renamed: a, b | p102x3/E0.java [?]<br>p105y1/m.java [?]<br>p105y1/n.java [?]<br>p105y1/t.java [?]<br>p105y1/u.java [?]<br>p105y1/w.java [?]<br>p105y1/x.java [?]<br>p111z2/k.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/c.java [?]<br>... +8 more |
| `p014c3/b.java` | renamed: a, b | p111z2/a.java [?] |
| `p015d/a.java` | renamed: a | p111z2/e.java [?] |
| `p015d/b.java` | renamed: a, b | p111z2/e.java [?] |
| `p015d/c.java` | renamed: o, r | p105y1/p.java [?]<br>p111z2/k.java [?]<br>p111z2/e.java [?] |
| `p015d/d.java` | renamed: r, o | p105y1/p.java [?] |
| `p015d/e.java` | renamed: o | p105y1/p.java [?] |
| `p015d/f.java` | renamed: o, r | p105y1/p.java [?]<br>p111z2/f.java [?]<br>p105y1/v.java [?] |
| `p015d/g.java` | renamed: o, r | p105y1/p.java [?]<br>p111z2/a.java [?] |
| `p015d/h.java` | renamed: d | p105y1/v.java [?] |
| `p015d/k.java` | renamed: a | p105y1/o.java [?]<br>p111z2/g.java [?]<br>p111z2/i.java [?] |
| `p015d/l.java` | renamed: c, d | p111z2/e.java [?] |
| `p015d/m.java` | renamed: o | p111z2/a.java [?] |
| `p015d/n.java` | renamed: o, r | p102x3/N5.java [JpgToPdfScreen]<br>p111z2/a.java [?] |
| `p015d/o.java` | renamed: d, f | p102x3/N5.java [JpgToPdfScreen]<br>p010c/C0689b.java [?]<br>p105y1/v.java [?]<br>p010c/C0689b.java [?] |
| `p015d/p.java` | renamed: o | p102x3/N5.java [JpgToPdfScreen] |
| `p016d0/a.java` | renamed: o | p105y1/p.java [?] |
| `p017d1/h.java` | renamed: a, b | p111z2/a.java [?] |
| `p018d3/c.java` | renamed: d, a | p111z2/a.java [?]<br>p111z2/e.java [?] |
| `p018d3/d.java` | renamed: d, a | p111z2/j.java [?] |
| `p019e0/a.java` | renamed: o | p105y1/o.java [?] |
| `p019e0/b.java` | renamed: a | p105y1/x.java [?]<br>p105y1/z.java [?]<br>p109z0/l.java [?]<br>p111z2/a.java [?]<br>p111z2/e.java [?] |
| `p019e0/d.java` | renamed: o | p111z2/b.java [?] |
| `p020e1/h.java` | renamed: a, b | p111z2/a.java [?]<br>p111z2/c.java [?]<br>p105y1/m.java [?]<br>p105y1/n.java [?]<br>p111z2/i.java [?]<br>p111z2/g.java [?]<br>p102x3/U0.java [PdfCropScreen]<br>p105y1/o.java [?] |
| `p020e1/j.java` | renamed: a, b | p111z2/d.java [?]<br>p111z2/e.java [?] |
| `p020e1/k.java` | renamed: o, r | p111z2/d.java [?]<br>p111z2/h.java [?] |
| `p020e1/l.java` | renamed: a, b | p111z2/c.java [?] |
| `p020e1/n.java` | renamed: a | p111z2/b.java [?]<br>p111z2/d.java [?]<br>p111z2/f.java [?]<br>p111z2/e.java [?] |
| `p020e1/o.java` | renamed: a, b | p111z2/e.java [?] |
| `p020e1/p.java` | renamed: a, b | p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/k.java [?]<br>p111z2/h.java [?] |
| `p022f/a.java` | renamed: o | p105y1/o.java [?] |
| `p022f/d.java` | renamed: o | p105y1/p.java [?] |
| `p022f/e.java` | renamed: c, d | p105y1/o.java [?]<br>p111z2/k.java [?] |
| `p022f/f.java` |  | p111z2/k.java [?] |
| `p022f/g.java` | renamed: o, r | p105y1/o.java [?] |
| `p023f0/a.java` | renamed: l, m | p111z2/e.java [?]<br>p111z2/f.java [?] |
| `p023f0/b.java` | renamed: d, b | p105y1/x.java [?]<br>p105y1/z.java [?] |
| `p024f2/b.java` | renamed: o | p111z2/a.java [?]<br>p064o2/AbstractC2207j.java [?]<br>p111z2/i.java [?]<br>p064o2/AbstractC2207j.java [?] |
| `p028g2/A.java` | renamed: o | p111z2/a.java [?]<br>p028g2/C2157z.java [?] |
| `p028g2/a0.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/AbstractC2144l.java` | renamed: g2 | p028g2/AbstractC2144l.java [?] |
| `p028g2/B.java` | renamed: o, r | p111z2/g.java [?]<br>p105y1/x.java [?] |
| `p028g2/C.java` | renamed: o | p028g2/InterfaceC2133a.java [?] |
| `p028g2/C2134b.java` | renamed: g2 | p028g2/C2134b.java [?] |
| `p028g2/C2136d.java` | renamed: g2 | p028g2/C2136d.java [?] |
| `p028g2/C2138f.java` | renamed: g2, o | ; ui: PaymentScreen | p111z2/g.java [?]<br>p028g2/C2138f.java [?]<br>p028g2/C2150s.java [?]<br>p028g2/C2151t.java [?] |
| `p028g2/C2139g.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2139g.java [?]<br>p028g2/C2140h.java [?] |
| `p028g2/C2140h.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2140h.java [?] |
| `p028g2/C2141i.java` | renamed: g2, o | p111z2/g.java [?]<br>p111z2/e.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p105y1/x.java [?]<br>p028g2/AbstractC2144l.java [?]<br>p028g2/C2141i.java [?] |
| `p028g2/C2142j.java` | renamed: g2, o | p111z2/g.java [?]<br>p111z2/e.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2215s.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p105y1/w.java [?]<br>p105y1/x.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/C0.java [PdfAddPageNumbersScreen]<br>p102x3/D0.java [PdfAddPageNumbersScreen]<br>p102x3/E0.java [?]<br>... +8 more |
| `p028g2/C2143k.java` | renamed: g2, o | p111z2/g.java [?]<br>p111z2/e.java [?]<br>p064o2/C2200c.java [?]<br>p028g2/AbstractC2144l.java [?]<br>p064o2/C2200c.java [?]<br>p028g2/C2143k.java [?]<br>p028g2/C2149q.java [?] |
| `p028g2/C2145m.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/EnumC2135c.java [?]<br>p028g2/C2145m.java [?]<br>p028g2/C2134b.java [?] |
| `p028g2/C2146n.java` | renamed: g2 | p028g2/C2146n.java [?] |
| `p028g2/C2147o.java` | renamed: g2, o | p111z2/a.java [?]<br>p028g2/InterfaceC2133a.java [?]<br>p028g2/EnumC2148p.java [?]<br>p028g2/C2147o.java [?]<br>p028g2/C2146n.java [?] |
| `p028g2/C2149q.java` | renamed: g2 | p028g2/C2149q.java [?] |
| `p028g2/C2150s.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2150s.java [?] |
| `p028g2/C2151t.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2151t.java [?] |
| `p028g2/C2152u.java` | renamed: g2, o | p105y1/x.java [?]<br>p102x3/P0.java [PdfCropScreen]<br>p028g2/C2152u.java [?]<br>p028g2/C2142j.java [?]<br>p028g2/C2141i.java [?]<br>p028g2/C2143k.java [?]<br>p028g2/C2139g.java [?] |
| `p028g2/C2153v.java` | renamed: g2, A | ; ui: PaymentScreen | p111z2/g.java [?]<br>p064o2/AbstractC2201d.java [?]<br>p064o2/C2199b.java [?]<br>p064o2/C2202e.java [?]<br>p064o2/AbstractC2201d.java [?]<br>p028g2/EnumC2137e.java [?]<br>p064o2/C2199b.java [?]<br>p064o2/C2202e.java [?]<br>p028g2/C2153v.java [?]<br>p028g2/C2156y.java [?]<br>p028g2/C2145m.java [?]<br>p028g2/C2138f.java [?]<br>... +5 more |
| `p028g2/C2154w.java` | renamed: g2, o | p111z2/g.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p105y1/x.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p028g2/C2154w.java [?]<br>p028g2/C2157z.java [?] |
| `p028g2/C2155x.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2155x.java [?]<br>p028g2/C2147o.java [?]<br>p028g2/C2146n.java [?]<br>p028g2/C2157z.java [?] |
| `p028g2/C2156y.java` | renamed: g2, o | p111z2/g.java [?]<br>p028g2/C2156y.java [?] |
| `p028g2/C2157z.java` | renamed: g2 | p028g2/C2157z.java [?] |
| `p028g2/E.java` | renamed: o | p111z2/a.java [?] |
| `p028g2/EnumC2135c.java` | renamed: g2, o | p111z2/a.java [?]<br>p028g2/EnumC2135c.java [?]<br>p028g2/C2134b.java [?] |
| `p028g2/EnumC2137e.java` | renamed: g2, o | p111z2/a.java [?]<br>p028g2/EnumC2137e.java [?]<br>p028g2/C2136d.java [?] |
| `p028g2/EnumC2148p.java` | renamed: g2, o | p028g2/EnumC2148p.java [?]<br>p028g2/InterfaceC2133a.java [?] |
| `p028g2/F.java` | renamed: o | p111z2/a.java [?] |
| `p028g2/H.java` | renamed: o | p111z2/g.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2198a.java [?] |
| `p028g2/I.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/InterfaceC2133a.java` | renamed: g2 | p028g2/InterfaceC2133a.java [?] |
| `p028g2/J.java` | renamed: o | p111z2/a.java [?] |
| `p028g2/K.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/L.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/M.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/N.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/O.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/P.java` | renamed: o, r | p111z2/g.java [?]<br>p105y1/x.java [?] |
| `p028g2/Q.java` | renamed: o | p111z2/g.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p111z2/h.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p111z2/k.java [?]<br>p109z0/l.java [?]<br>p105y1/m.java [?]<br>p064o2/AbstractC2198a.java [?] |
| `p028g2/r.java` | renamed: o | p111z2/a.java [?]<br>p028g2/C2149q.java [?] |
| `p028g2/S.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/U.java` | renamed: a | p111z2/a.java [?]<br>p105y1/q.java [?]<br>p105y1/x.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p028g2/C2140h.java [?]<br>p028g2/C2139g.java [?]<br>p028g2/C2150s.java [?]<br>p028g2/C2151t.java [?]<br>p028g2/C2138f.java [?]<br>... +7 more |
| `p028g2/V.java` | renamed: o | p111z2/g.java [?]<br>p105y1/x.java [?] |
| `p028g2/W.java` | renamed: o | p111z2/g.java [?]<br>p105y1/x.java [?] |
| `p028g2/X.java` | renamed: o, r | p111z2/g.java [?] |
| `p028g2/Y.java` | renamed: o | p111z2/g.java [?] |
| `p028g2/Z.java` |  | p111z2/g.java [?] |
| `p029g3/a.java` | renamed: r, s | p105y1/o.java [?] |
| `p030h/a.java` | renamed: a, b | p105y1/r.java [?] |
| `p030h/b.java` | renamed: d, a | p105y1/r.java [?]<br>p047l/AbstractC2190v.java [?]<br>p047l/C2189u.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2190v.java [?]<br>p047l/C2189u.java [?] |
| `p033h3/A.java` | renamed: o | p111z2/i.java [?] |
| `p033h3/B.java` | renamed: a, b | p111z2/i.java [?] |
| `p033h3/C.java` | renamed: o, r | p105y1/o.java [?] |
| `p033h3/C2159a.java` | renamed: h3, a | p033h3/C2159a.java [?] |
| `p033h3/C2160b.java` | renamed: h3, a | p033h3/C2160b.java [?] |
| `p033h3/C2161c.java` | renamed: h3, a | p033h3/C2161c.java [?] |
| `p033h3/d.java` | renamed: a | p111z2/f.java [?] |
| `p033h3/f.java` | renamed: o | ; related: ReviewHelper ; ui: ReviewScreen | p102x3/H1.java [PdfSplitScreen]<br>com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/d.java [?]<br>p111z2/j.java [?]<br>p047l/C2174e.java [?]<br>p111z2/g.java [?]<br>p111z2/h.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?]<br>p111z2/c.java [?]<br>p047l/C2174e.java [?] |
| `p033h3/g.java` | renamed: o, r | p111z2/i.java [?]<br>p105y1/o.java [?] |
| `p033h3/j.java` | renamed: c, d | p111z2/a.java [?]<br>p047l/C2174e.java [?]<br>p111z2/h.java [?]<br>p105y1/o.java [?]<br>p047l/C2174e.java [?] |
| `p033h3/k.java` | renamed: o | ; ui: SettingsScreen | p082t2/C2236g0.java [?]<br>p082t2/C2258s.java [?]<br>p082t2/C2267w0.java [?]<br>p102x3/K0.java [PdfCompressScreen]<br>p102x3/L0.java [PdfCompressScreen]<br>p102x3/M0.java [PdfCompressScreen]<br>p082t2/RunnableC2270y.java [?]<br>p102x3/Y0.java [PdfInvertScreen]<br>p102x3/Z0.java [PdfInvertScreen]<br>p102x3/N1.java [PdfToJpgScreen]<br>p082t2/RunnableC2270y.java [?]<br>p082t2/C2258s.java [?] |
| `p033h3/m.java` | renamed: o, r | p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/a.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p109z0/l.java [?]<br>p111z2/c.java [?]<br>p111z2/f.java [?]<br>p111z2/h.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p105y1/o.java [?] |
| `p033h3/n.java` | renamed: o | p102x3/R3.java [?]<br>p109z0/l.java [?]<br>p105y1/o.java [?] |
| `p033h3/o.java` | renamed: a | p111z2/e.java [?]<br>p111z2/d.java [?]<br>p033h3/C2161c.java [?]<br>p033h3/C2160b.java [?]<br>p033h3/C2159a.java [?] |
| `p033h3/q.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?]<br>p111z2/e.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2174e.java [?] |
| `p033h3/r.java` | renamed: s, o | p102x3/Ac.java [NotebookConfiguratorCard]<br>p102x3/Cc.java [PdfSourcePickerDialog]<br>p102x3/Ec.java [?]<br>p102x3/Fc.java [PrintOrderCheckoutScreen]<br>p102x3/K6.java [PdfAddPageNumbersScreen]<br>p102x3/L6.java [PdfAddPageNumbersScreen]<br>p102x3/X7.java [?]<br>p111z2/e.java [?] |
| `p033h3/t.java` | renamed: d, a | p111z2/a.java [?] |
| `p033h3/w.java` | renamed: i, j | p111z2/a.java [?]<br>p111z2/h.java [?]<br>p047l/C2174e.java [?]<br>p111z2/i.java [?]<br>p105y1/o.java [?]<br>p047l/C2174e.java [?] |
| `p033h3/z.java` | renamed: a, b | p111z2/a.java [?] |
| `p035i0/b.java` | renamed: o | p105y1/p.java [?]<br>p111z2/h.java [?]<br>p111z2/j.java [?] |
| `p036i2/e.java` | renamed: s, o | ; related: MainActivity.kt | p105y1/q.java [?]<br>p105y1/u.java [?]<br>p105y1/w.java [?]<br>p105y1/x.java [?]<br>p105y1/z.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/F7.java [PdfCropScreen]<br>com/notescrafter/MainActivity.java [?]<br>p111z2/f.java [?]<br>p111z2/h.java [?]<br>p105y1/o.java [?]<br>p010c/RunnableC0691d.java [?]<br>... +10 more |
| `p036i2/f.java` | renamed: A, y | p105y1/o.java [?] |
| `p039j0/a.java` | renamed: o | p111z2/b.java [?] |
| `p039j0/c.java` | renamed: o | p111z2/b.java [?] |
| `p039j0/d.java` | renamed: a | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?]<br>p111z2/c.java [?] |
| `p040j1/a.java` | renamed: f, a | p111z2/f.java [?]<br>p105y1/p.java [?]<br>p111z2/d.java [?]<br>p111z2/c.java [?] |
| `p041j2/a.java` |  | p111z2/i.java [?] |
| `p041j2/c.java` |  | p111z2/a.java [?]<br>p111z2/i.java [?] |
| `p042j3/c.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/r.java [?]<br>p105y1/q.java [?]<br>p102x3/U7.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/e.java [?]<br>p105y1/x.java [?]<br>p105y1/o.java [?]<br>p111z2/a.java [?]<br>p111z2/f.java [?]<br>p111z2/b.java [?]<br>p109z0/l.java [?]<br>p111z2/g.java [?]<br>... +17 more |
| `p043k/c.java` | renamed: o | p102x3/G7.java [PdfCropScreen] |
| `p043k/d.java` | renamed: a, b | p102x3/G7.java [PdfCropScreen]<br>p111z2/a.java [?]<br>p111z2/c.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2358m.java [?] |
| `p044k0/a.java` | renamed: o | p111z2/f.java [?] |
| `p044k0/b.java` | renamed: a | p105y1/n.java [?]<br>p111z2/e.java [?]<br>p105y1/o.java [?]<br>p111z2/a.java [?]<br>p111z2/f.java [?] |
| `p045k1/b.java` | renamed: a, b | p111z2/d.java [?]<br>p111z2/h.java [?] |
| `p045k1/d.java` | renamed: a, b | p111z2/j.java [?]<br>p111z2/h.java [?]<br>p111z2/a.java [?] |
| `p045k1/f.java` | renamed: o, r | p111z2/j.java [?]<br>p111z2/d.java [?]<br>p111z2/h.java [?]<br>p111z2/a.java [?]<br>p111z2/c.java [?] |
| `p045k1/i.java` | renamed: o | p111z2/c.java [?]<br>p111z2/j.java [?]<br>p111z2/e.java [?]<br>p111z2/f.java [?]<br>p111z2/h.java [?]<br>p111z2/b.java [?] |
| `p045k1/j.java` | renamed: a, b | p111z2/a.java [?]<br>p111z2/f.java [?]<br>p111z2/k.java [?]<br>p105y1/t.java [?]<br>p105y1/u.java [?]<br>p105y1/w.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p111z2/e.java [?]<br>p111z2/h.java [?]<br>... +3 more |
| `p045k1/k.java` | renamed: a, b | p111z2/d.java [?]<br>p111z2/c.java [?] |
| `p046k2/a.java` | renamed: o | p111z2/i.java [?] |
| `p046k2/h.java` | renamed: o | p111z2/c.java [?]<br>p105y1/u.java [?]<br>p105y1/o.java [?]<br>p111z2/f.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p111z2/a.java [?]<br>p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p111z2/d.java [?]<br>p105y1/m.java [?]<br>p111z2/i.java [?]<br>... +6 more |
| `p047l/A.java` | renamed: f | p111z2/a.java [?]<br>p047l/AbstractC2182m.java [?]<br>p047l/AbstractC2184o.java [?] |
| `p047l/AbstractC2176g.java` | renamed: l, a | p105y1/o.java [?]<br>p047l/AbstractC2176g.java [?] |
| `p047l/AbstractC2177h.java` | renamed: l, a | p047l/AbstractC2177h.java [?]<br>p047l/AbstractC2178i.java [?] |
| `p047l/AbstractC2178i.java` | renamed: l, a | p047l/AbstractC2178i.java [?] |
| `p047l/AbstractC2180k.java` | renamed: l, a | p105y1/o.java [?]<br>p047l/AbstractC2180k.java [?] |
| `p047l/AbstractC2181l.java` | renamed: l, a | p047l/AbstractC2181l.java [?]<br>p047l/AbstractC2184o.java [?]<br>p047l/C2194z.java [?] |
| `p047l/AbstractC2182m.java` | renamed: l, a | p105y1/o.java [?]<br>p047l/AbstractC2182m.java [?] |
| `p047l/AbstractC2183n.java` | renamed: l, a | p047l/AbstractC2183n.java [?] |
| `p047l/AbstractC2184o.java` | renamed: l, a | p047l/AbstractC2184o.java [?] |
| `p047l/AbstractC2185p.java` | renamed: l, a | p105y1/o.java [?]<br>p047l/AbstractC2185p.java [?] |
| `p047l/AbstractC2186q.java` | renamed: l, a | p047l/AbstractC2186q.java [?] |
| `p047l/AbstractC2187s.java` | renamed: l, a | p047l/AbstractC2187s.java [?] |
| `p047l/AbstractC2188t.java` | renamed: l, a | p047l/AbstractC2188t.java [?] |
| `p047l/AbstractC2190v.java` | renamed: l, a | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2190v.java [?]<br>p047l/C2175f.java [?] |
| `p047l/B.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2184o.java [?] |
| `p047l/C.java` | renamed: f | p111z2/a.java [?]<br>p047l/AbstractC2185p.java [?]<br>p047l/AbstractC2188t.java [?]<br>p047l/AbstractC2184o.java [?] |
| `p047l/C2170a.java` | renamed: l, o | p047l/C2170a.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2175f.java [?] |
| `p047l/C2171b.java` | renamed: l, o | p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2170a.java [?] |
| `p047l/C2172c.java` | renamed: l, o | p105y1/o.java [?]<br>p047l/C2172c.java [?]<br>p047l/C2174e.java [?] |
| `p047l/C2173d.java` | renamed: l, o | p047l/C2173d.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2170a.java [?] |
| `p047l/C2174e.java` | renamed: l, r | p047l/C2174e.java [?]<br>p047l/C2171b.java [?]<br>p047l/C2173d.java [?] |
| `p047l/C2175f.java` | renamed: l, o | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2190v.java [?]<br>p047l/C2175f.java [?]<br>p047l/C2170a.java [?] |
| `p047l/C2179j.java` | renamed: l, a | p111z2/a.java [?]<br>p047l/C2179j.java [?] |
| `p047l/C2189u.java` | renamed: l, o | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2190v.java [?]<br>p047l/C2189u.java [?] |
| `p047l/C2191w.java` | renamed: l, a | p105y1/o.java [?]<br>p111z2/h.java [?]<br>p111z2/a.java [?]<br>p047l/C2191w.java [?] |
| `p047l/C2192x.java` | renamed: l | p105y1/o.java [?]<br>p047l/AbstractC2176g.java [?]<br>p047l/C2192x.java [?] |
| `p047l/C2193y.java` | renamed: l, a | p105y1/o.java [?]<br>p047l/AbstractC2184o.java [?]<br>p047l/C2193y.java [?] |
| `p047l/C2194z.java` | renamed: l | p105y1/o.java [?]<br>p047l/AbstractC2180k.java [?]<br>p047l/AbstractC2184o.java [?]<br>p047l/C2194z.java [?] |
| `p047l/D.java` | renamed: f | p111z2/a.java [?]<br>p047l/AbstractC2188t.java [?] |
| `p047l/E.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2188t.java [?] |
| `p047l/F.java` | renamed: f | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2178i.java [?] |
| `p047l/G.java` | renamed: f | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2184o.java [?] |
| `p047l/H.java` | renamed: a, b | p105y1/o.java [?]<br>p047l/AbstractC2190v.java [?] |
| `p047l/I.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2188t.java [?] |
| `p047l/J.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p047l/L.java` |  | p105y1/o.java [?] |
| `p047l/M.java` |  | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p047l/N.java` | renamed: a, b | p105y1/o.java [?] |
| `p047l/O.java` | renamed: a, b | p105y1/o.java [?] |
| `p047l/r.java` | renamed: a, b | p105y1/o.java [?] |
| `p047l/T.java` | renamed: o | p105y1/n.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p047l/U.java` | renamed: a | p105y1/o.java [?] |
| `p047l/W.java` | renamed: a, b | p105y1/o.java [?] |
| `p047l/Y.java` | renamed: o | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p047l/Z.java` | renamed: o, a | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p047l/AbstractC2190v.java [?] |
| `p048l0/b.java` | renamed: a | p111z2/e.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?] |
| `p049l1/b.java` | renamed: a, b | p111z2/i.java [?]<br>p111z2/j.java [?] |
| `p049l1/e.java` | renamed: o | p111z2/d.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p049l1/h.java` | renamed: o, r | p111z2/j.java [?]<br>p105y1/m.java [?]<br>p111z2/i.java [?]<br>p111z2/b.java [?]<br>p111z2/c.java [?] |
| `p049l1/j.java` | renamed: r, s | p111z2/a.java [?] |
| `p051l3/a.java` | renamed: a | p111z2/b.java [?] |
| `p051l3/b.java` | renamed: a, b | p111z2/a.java [?] |
| `p051l3/c.java` | renamed: a | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p051l3/d.java` | renamed: a, b | p111z2/f.java [?]<br>p111z2/c.java [?]<br>p111z2/g.java [?]<br>p111z2/h.java [?]<br>p105y1/m.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p051l3/f.java` |  | p111z2/g.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p111z2/b.java [?] |
| `p051l3/i.java` | renamed: o | p105y1/m.java [?] |
| `p051l3/j.java` | renamed: o | p111z2/h.java [?] |
| `p051l3/p.java` |  | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p052m/a.java` | renamed: a, b | p105y1/o.java [?] |
| `p053m0/b.java` | renamed: a | p105y1/o.java [?] |
| `p053m0/c.java` | renamed: a, b | p111z2/a.java [?] |
| `p053m0/d.java` | renamed: b | p111z2/e.java [?]<br>p105y1/o.java [?] |
| `p053m0/f.java` | renamed: a | p111z2/e.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?] |
| `p058n0/c.java` | renamed: a, b | p111z2/a.java [?]<br>p111z2/h.java [?] |
| `p058n0/e.java` |  | p111z2/a.java [?] |
| `p058n0/i.java` | renamed: a, b | p111z2/h.java [?]<br>p111z2/k.java [?] |
| `p060n3/e.java` | renamed: a, b | p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p060n3/f.java` | renamed: o | p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?] |
| `p060n3/i.java` | renamed: o | p111z2/f.java [?] |
| `p062o0/a.java` | renamed: a, b | p105y1/o.java [?]<br>p105y1/w.java [?] |
| `p062o0/d.java` | renamed: j, b | p111z2/b.java [?]<br>p111z2/f.java [?] |
| `p062o0/f.java` | renamed: a, b | p111z2/a.java [?] |
| `p062o0/g.java` | renamed: a, b | p111z2/c.java [?]<br>p111z2/b.java [?] |
| `p062o0/h.java` | renamed: w, o | p111z2/c.java [?]<br>p111z2/b.java [?] |
| `p062o0/i.java` |  | p111z2/b.java [?] |
| `p062o0/j.java` | renamed: a, b | p111z2/f.java [?] |
| `p063o1/a.java` | renamed: a, b | p111z2/d.java [?] |
| `p064o2/A.java` |  | p064o2/AbstractC2216t.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/InterfaceC2218v.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p064o2/C2206i.java [?]<br>p064o2/C2221y.java [?]<br>p064o2/C2219w.java [?] |
| `p064o2/AbstractC2198a.java` | renamed: o2, b | p111z2/h.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2216t.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/C2219w.java [?]<br>p064o2/C2215s.java [?] |
| `p064o2/AbstractC2201d.java` | renamed: o2 | p064o2/AbstractC2201d.java [?] |
| `p064o2/AbstractC2205h.java` | renamed: o2, o | p064o2/AbstractC2205h.java [?] |
| `p064o2/AbstractC2207j.java` | renamed: o2, a | p064o2/AbstractC2207j.java [?] |
| `p064o2/AbstractC2210m.java` | renamed: o2, r | p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2206i.java [?]<br>p064o2/C2221y.java [?]<br>p064o2/C2208k.java [?]<br>p064o2/C2209l.java [?] |
| `p064o2/AbstractC2211n.java` | renamed: o2, o | p064o2/AbstractC2211n.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2215s.java [?]<br>p064o2/C2222z.java [?] |
| `p064o2/AbstractC2212o.java` | renamed: o2 | p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2222z.java [?]<br>p064o2/C2206i.java [?] |
| `p064o2/AbstractC2216t.java` | renamed: o2, r | p064o2/AbstractC2216t.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/C2219w.java [?]<br>p064o2/C2206i.java [?]<br>p064o2/C2221y.java [?] |
| `p064o2/AbstractC2220x.java` | renamed: o2 | p064o2/AbstractC2220x.java [?] |
| `p064o2/B.java` | renamed: o | p064o2/AbstractC2220x.java [?]<br>p064o2/C2219w.java [?] |
| `p064o2/b0.java` | renamed: o | p111z2/a.java [?]<br>p064o2/AbstractC2198a.java [?] |
| `p064o2/C.java` | renamed: o | p064o2/AbstractC2220x.java [?] |
| `p064o2/C2199b.java` | renamed: o2, o | p064o2/AbstractC2201d.java [?]<br>p064o2/C2199b.java [?] |
| `p064o2/C2200c.java` | renamed: o2 | p111z2/e.java [?]<br>p064o2/C2200c.java [?] |
| `p064o2/C2202e.java` | renamed: o2, o | p111z2/a.java [?]<br>p028g2/C2155x.java [?]<br>p064o2/AbstractC2201d.java [?]<br>p028g2/C2155x.java [?]<br>p064o2/C2202e.java [?] |
| `p064o2/C2203f.java` | renamed: o2, o | p111z2/a.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2203f.java [?] |
| `p064o2/C2204g.java` | renamed: o2, o | p064o2/AbstractC2220x.java [?]<br>p064o2/C2204g.java [?] |
| `p064o2/C2206i.java` | renamed: o2, o | p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2206i.java [?] |
| `p064o2/C2208k.java` | renamed: o2, r | p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2208k.java [?] |
| `p064o2/C2209l.java` | renamed: o2, r | p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2209l.java [?] |
| `p064o2/C2214q.java` | renamed: o2 | p064o2/AbstractC2210m.java [?]<br>p064o2/C2214q.java [?] |
| `p064o2/C2215s.java` | renamed: o2, r | p111z2/b.java [?]<br>p064o2/AbstractC2211n.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2216t.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2220x.java [?]<br>p064o2/C2215s.java [?]<br>p064o2/C2219w.java [?]<br>p064o2/C2206i.java [?]<br>p064o2/C2221y.java [?]<br>p064o2/C2204g.java [?] |
| `p064o2/C2217u.java` | renamed: o2, o | p064o2/C2217u.java [?] |
| `p064o2/C2219w.java` | renamed: o2, o | p064o2/AbstractC2220x.java [?]<br>p064o2/C2219w.java [?] |
| `p064o2/C2221y.java` | renamed: o2, s | p064o2/AbstractC2210m.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2221y.java [?] |
| `p064o2/C2222z.java` | renamed: o2, w | p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/C2222z.java [?] |
| `p064o2/D.java` | renamed: r | p111z2/a.java [?]<br>p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/C2217u.java [?]<br>p064o2/C2206i.java [?] |
| `p064o2/e0.java` | renamed: o | p111z2/h.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/C2215s.java [?] |
| `p064o2/f0.java` | renamed: o | p111z2/a.java [?] |
| `p064o2/h0.java` |  | p111z2/b.java [?]<br>p064o2/AbstractC2198a.java [?] |
| `p064o2/I.java` | renamed: o | p064o2/AbstractC2198a.java [?] |
| `p064o2/InterfaceC2218v.java` | renamed: o2 | p064o2/InterfaceC2218v.java [?] |
| `p064o2/j0.java` | renamed: o, r | p111z2/a.java [?]<br>p111z2/c.java [?] |
| `p064o2/k0.java` | renamed: b, a | p064o2/C2203f.java [?] |
| `p064o2/m0.java` | renamed: a | p064o2/AbstractC2212o.java [?]<br>p064o2/C2222z.java [?] |
| `p064o2/N.java` | renamed: a, b | p064o2/AbstractC2198a.java [?] |
| `p064o2/n0.java` | renamed: b, a | p064o2/C2203f.java [?] |
| `p064o2/O.java` |  | p064o2/AbstractC2198a.java [?] |
| `p064o2/P.java` |  | p064o2/AbstractC2198a.java [?] |
| `p064o2/p0.java` | renamed: a | p064o2/AbstractC2212o.java [?]<br>p064o2/C2222z.java [?] |
| `p064o2/Q.java` | renamed: d, a | p064o2/AbstractC2198a.java [?] |
| `p064o2/q0.java` |  | p111z2/a.java [?] |
| `p064o2/r.java` | renamed: r | p064o2/AbstractC2212o.java [?]<br>p064o2/AbstractC2198a.java [?]<br>p064o2/AbstractC2205h.java [?]<br>p064o2/AbstractC2210m.java [?]<br>p064o2/C2215s.java [?]<br>p064o2/C2214q.java [?] |
| `p064o2/W.java` | renamed: r, s | p111z2/a.java [?] |
| `p064o2/X.java` | renamed: o | p102x3/S1.java [PdfToJpgScreen]<br>p111z2/a.java [?]<br>p064o2/AbstractC2198a.java [?] |
| `p064o2/Z.java` | renamed: o | p111z2/h.java [?]<br>p064o2/C2221y.java [?] |
| `p065o3/a.java` | renamed: o | p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?] |
| `p065o3/b.java` | renamed: d, a | p111z2/d.java [?]<br>p111z2/g.java [?]<br>p105y1/p.java [?]<br>p105y1/n.java [?]<br>p111z2/a.java [?] |
| `p065o3/c.java` | renamed: o | p111z2/b.java [?]<br>p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?]<br>p111z2/a.java [?] |
| `p065o3/d.java` | renamed: b, a | p105y1/p.java [?]<br>p111z2/g.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p065o3/e.java` | renamed: a, b | p111z2/h.java [?]<br>p111z2/d.java [?]<br>p111z2/g.java [?]<br>p105y1/p.java [?]<br>p105y1/n.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p065o3/f.java` | renamed: o | p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?] |
| `p065o3/g.java` | renamed: b, a | p111z2/e.java [?]<br>p111z2/f.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p105y1/p.java [?]<br>p111z2/h.java [?]<br>p111z2/k.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p065o3/h.java` | renamed: b, a | p111z2/d.java [?]<br>p105y1/o.java [?]<br>p105y1/p.java [?]<br>p105y1/m.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p065o3/i.java` | renamed: a, b | p111z2/a.java [?]<br>p111z2/d.java [?]<br>p111z2/g.java [?]<br>p105y1/p.java [?]<br>p111z2/c.java [?]<br>p111z2/b.java [?] |
| `p065o3/j.java` | renamed: a | p111z2/g.java [?]<br>p105y1/p.java [?]<br>p111z2/c.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p065o3/k.java` | renamed: b | p111z2/g.java [?]<br>p105y1/n.java [?]<br>p111z2/c.java [?]<br>p111z2/a.java [?] |
| `p065o3/l.java` | renamed: b, c | p111z2/c.java [?] |
| `p065o3/m.java` | renamed: o, r | p111z2/a.java [?]<br>p111z2/d.java [?]<br>p111z2/g.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p111z2/c.java [?] |
| `p065o3/n.java` | renamed: a, b | p111z2/c.java [?]<br>p111z2/d.java [?]<br>p105y1/p.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p065o3/o.java` | renamed: o | p111z2/d.java [?]<br>p105y1/p.java [?]<br>p105y1/q.java [?] |
| `p065o3/q.java` | renamed: A, b | p111z2/b.java [?]<br>p111z2/f.java [?] |
| `p066p0/a.java` | renamed: a, b | p111z2/b.java [?] |
| `p067p1/b.java` | renamed: a, b | p090v1/C2352j.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2362o.java [?]<br>p111z2/e.java [?]<br>p090v1/C2352j.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2362o.java [?] |
| `p067p1/c.java` | renamed: a, b | p102x3/U7.java [?]<br>p111z2/b.java [?]<br>p090v1/C2366q.java [?]<br>p102x3/L0.java [PdfCompressScreen]<br>p102x3/R0.java [PdfCropScreen]<br>p090v1/C2366q.java [?] |
| `p067p1/d.java` | renamed: a | p102x3/R0.java [PdfCropScreen] |
| `p067p1/g.java` | renamed: a, b | p102x3/O0.java [PdfCropScreen]<br>p102x3/T0.java [PdfCropScreen] |
| `p067p1/h.java` | renamed: o | p102x3/J3.java [?]<br>p102x3/J5.java [?]<br>p102x3/U7.java [?]<br>p111z2/b.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p102x3/D0.java [PdfAddPageNumbersScreen]<br>p111z2/i.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p102x3/M0.java [PdfCompressScreen]<br>p102x3/S0.java [PdfCropScreen]<br>... +4 more |
| `p067p1/j.java` |  | p102x3/M8.java [PdfMergeScreen] |
| `p067p1/m.java` | renamed: a, b | p090v1/C2362o.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p102x3/O0.java [PdfCropScreen]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/C2362o.java [?] |
| `p067p1/o.java` | renamed: o | p102x3/J3.java [?]<br>p111z2/i.java [?] |
| `p069p3/a.java` | renamed: a | p111z2/b.java [?] |
| `p070q0/b.java` | renamed: a, b | p111z2/a.java [?] |
| `p070q0/e.java` | renamed: a, b | p111z2/b.java [?] |
| `p071q1/a.java` |  | p111z2/h.java [?] |
| `p072q3/c.java` | renamed: a | p111z2/g.java [?] |
| `p074r0/a.java` | renamed: a | p105y1/o.java [?] |
| `p074r0/b.java` | renamed: o | p111z2/a.java [?]<br>p105y1/q.java [?]<br>p105y1/s.java [?]<br>p105y1/x.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/C0.java [PdfAddPageNumbersScreen]<br>p105y1/o.java [?]<br>p010c/C0695h.java [?]<br>p105y1/m.java [?]<br>p010c/C0695h.java [?] |
| `p074r0/e.java` | renamed: b, c | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/c.java [?]<br>p111z2/f.java [?] |
| `p074r0/f.java` | renamed: a, b | p105y1/o.java [?]<br>p010c/C0692e.java [?]<br>p111z2/d.java [?]<br>p010c/C0692e.java [?] |
| `p074r0/h.java` | renamed: o | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p105y1/p.java [?] |
| `p075r3/a.java` | renamed: c, d | p111z2/g.java [?]<br>p105y1/p.java [?]<br>p111z2/b.java [?] |
| `p075r3/b.java` | renamed: a, b | p111z2/a.java [?] |
| `p076s/b.java` |  | p111z2/a.java [?] |
| `p077s0/c.java` |  | p111z2/b.java [?] |
| `p078s1/a.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p078s1/b.java` |  | p111z2/j.java [?] |
| `p078s1/c.java` | renamed: a, b | p102x3/Id.java [PrintPriceCalculatorScreen] |
| `p078s1/d.java` | renamed: o | p102x3/J5.java [?]<br>p111z2/g.java [?]<br>p105y1/u.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?] |
| `p079s3/a.java` | renamed: B, C | p111z2/h.java [?]<br>p111z2/b.java [?] |
| `p080t0/a.java` | renamed: a | p111z2/c.java [?] |
| `p080t0/b.java` | renamed: o | p111z2/c.java [?] |
| `p080t0/c.java` | renamed: a, b | p111z2/c.java [?] |
| `p080t0/d.java` | renamed: o | p111z2/c.java [?]<br>p109z0/l.java [?]<br>p111z2/f.java [?] |
| `p080t0/e.java` | renamed: o, r | p111z2/c.java [?]<br>p111z2/b.java [?] |
| `p081t1/b.java` | renamed: a, b | p111z2/c.java [?]<br>p111z2/d.java [?] |
| `p082t2/A.java` | renamed: a, b | p102x3/K3.java [DownloadedFileItem]<br>p102x3/M3.java [DownloadedFileItem]<br>p102x3/Q3.java [DownloadsScreen]<br>p102x3/S3.java [DownloadsScreen]<br>p102x3/K4.java [?]<br>p102x3/L4.java [EnhanceScreen]<br>p102x3/P4.java [EnhanceScreen]<br>p102x3/Q4.java [EnhanceScreen]<br>p102x3/R4.java [?]<br>p102x3/U4.java [?]<br>p102x3/V4.java [?]<br>p102x3/W4.java [?]<br>... +2 more |
| `p082t2/a1.java` | renamed: o | p111z2/g.java [?] |
| `p082t2/AbstractC2224a0.java` | renamed: t2, a | p082t2/AbstractC2224a0.java [?] |
| `p082t2/AbstractC2249n.java` | renamed: t2, d | p082t2/AbstractC2249n.java [?]<br>p082t2/InterfaceC2254p0.java [?] |
| `p082t2/AbstractC2250n0.java` | renamed: t2, b | p082t2/AbstractC2250n0.java [?]<br>p082t2/AbstractC2252o0.java [?] |
| `p082t2/AbstractC2252o0.java` | renamed: t2, a | p082t2/AbstractC2252o0.java [?]<br>p082t2/InterfaceC2254p0.java [?] |
| `p082t2/AbstractC2261t0.java` | renamed: t2, a | p105y1/r.java [?]<br>p111z2/a.java [?]<br>p082t2/AbstractC2261t0.java [?] |
| `p082t2/AbstractC2268x.java` | renamed: t2, A | p082t2/AbstractC2268x.java [?]<br>p082t2/C2233f.java [?]<br>p082t2/C2272z.java [?] |
| `p082t2/B0.java` | renamed: f | p082t2/AbstractC2249n.java [?]<br>p082t2/InterfaceC2254p0.java [?] |
| `p082t2/b1.java` | renamed: f | p082t2/AbstractC2249n.java [?]<br>p082t2/InterfaceC2254p0.java [?]<br>p082t2/C2258s.java [?] |
| `p082t2/BinderC2238h0.java` | renamed: t2, o | p111z2/i.java [?]<br>p111z2/j.java [?]<br>p082t2/RunnableC2240i0.java [?]<br>p082t2/CallableC2246l0.java [?]<br>p082t2/RunnableC2244k0.java [?]<br>p082t2/RunnableC2242j0.java [?]<br>p082t2/C2239i.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/C.java` | renamed: b, c | p102x3/A4.java [EnhanceScreen]<br>p102x3/C4.java [EnhanceScreen]<br>p102x3/F3.java [ContactMethodItem]<br>p102x3/H3.java [?]<br>p102x3/L3.java [DownloadedFileItem]<br>p102x3/N3.java [?]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/C2223a.java` | renamed: t2, a | p105y1/y.java [?]<br>p082t2/C2223a.java [?] |
| `p082t2/C2226b0.java` | renamed: t2, k | p082t2/AbstractC2250n0.java [?]<br>p082t2/AbstractC2252o0.java [?] |
| `p082t2/C2227c.java` | renamed: t2, a | p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/C0.java [PdfAddPageNumbersScreen]<br>p047l/C2174e.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p047l/C2174e.java [?]<br>p082t2/C2227c.java [?]<br>p082t2/C2260t.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/C2229d.java` | renamed: t2, a | p111z2/a.java [?]<br>p082t2/C2229d.java [?]<br>p082t2/C2264v.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2239i.java [?] |
| `p082t2/C2230d0.java` | renamed: t2, o | p111z2/a.java [?] |
| `p082t2/C2231e.java` | renamed: t2, o | p111z2/g.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2229d.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/C2233f.java` | renamed: t2, a | p102x3/W3.java [?]<br>p102x3/Y3.java [?]<br>p082t2/InterfaceC2237h.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2233f.java [?] |
| `p082t2/C2235g.java` | renamed: t2, b | p102x3/L3.java [DownloadedFileItem]<br>p111z2/c.java [?]<br>p082t2/AbstractC2252o0.java [?]<br>p082t2/InterfaceC2237h.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/C2236g0.java` | renamed: t2, I | p102x3/C1.java [?]<br>p102x3/E1.java [PdfSplitScreen]<br>p102x3/H1.java [PdfSplitScreen]<br>p102x3/I1.java [PdfSplitScreen]<br>p102x3/N1.java [PdfToJpgScreen]<br>p102x3/O1.java [PdfToJpgScreen]<br>p111z2/k.java [?]<br>p111z2/c.java [?]<br>p111z2/b.java [?]<br>p082t2/InterfaceC2254p0.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/AbstractC2250n0.java [?]<br>... +9 more |
| `p082t2/C2239i.java` | renamed: t2, o | p111z2/g.java [?]<br>p082t2/C2239i.java [?]<br>p082t2/C2229d.java [?] |
| `p082t2/C2243k.java` | renamed: t2, f | p111z2/a.java [?]<br>p102x3/E0.java [?]<br>p102x3/A0.java [PdfAddPageNumbersScreen]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/V4.java [?]<br>p047l/C2174e.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p047l/C2174e.java [?]<br>p082t2/C2243k.java [?]<br>p082t2/C2247m.java [?]<br>p082t2/C2264v.java [?]<br>p082t2/C2231e.java [?]<br>... +4 more |
| `p082t2/C2245l.java` | renamed: t2, a | p082t2/C2245l.java [?] |
| `p082t2/C2247m.java` | renamed: t2, o | p102x3/E0.java [?]<br>p082t2/AbstractC2252o0.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/C2247m.java [?]<br>p082t2/C2243k.java [?] |
| `p082t2/C2251o.java` | renamed: t2, f | p082t2/EnumC2257r0.java [?]<br>p082t2/EnumC2256q0.java [?]<br>p082t2/C2251o.java [?] |
| `p082t2/C2253p.java` | renamed: t2, a | p082t2/C2253p.java [?] |
| `p082t2/C2255q.java` | renamed: t2, c | p111z2/a.java [?]<br>p082t2/AbstractC2250n0.java [?]<br>p082t2/C2255q.java [?] |
| `p082t2/C2258s.java` | renamed: t2, b | p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/RunnableC2225b.java [?]<br>p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/C2258s.java [?] |
| `p082t2/C2259s0.java` | renamed: t2, c | p082t2/EnumC2257r0.java [?]<br>p082t2/EnumC2256q0.java [?] |
| `p082t2/C2260t.java` | renamed: t2, a | p082t2/C2260t.java [?] |
| `p082t2/C2262u.java` | renamed: t2, o | p082t2/C2262u.java [?] |
| `p082t2/C2264v.java` | renamed: t2, o | p111z2/g.java [?]<br>p082t2/C2264v.java [?]<br>p082t2/C2229d.java [?] |
| `p082t2/C2267w0.java` | renamed: t2, c | ; ui: SettingsScreen | p102x3/E3.java [ContactUsScreen]<br>p102x3/F3.java [ContactMethodItem]<br>p111z2/i.java [?]<br>p105y1/y.java [?]<br>p111z2/k.java [?]<br>p111z2/d.java [?]<br>p082t2/EnumC2257r0.java [?]<br>p082t2/RunnableC2244k0.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/RunnableC2234f0.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/RunnableC2269x0.java [?]<br>... +6 more |
| `p082t2/C2272z.java` | renamed: t2, a | p102x3/A3.java [?]<br>p102x3/D4.java [EnhanceScreen]<br>p102x3/E3.java [ContactUsScreen]<br>p102x3/G3.java [?]<br>p102x3/G4.java [EnhanceScreen]<br>p102x3/H4.java [EnhanceScreen]<br>p102x3/R3.java [?]<br>p102x3/T3.java [?]<br>p102x3/X3.java [DownloadedFileItem]<br>p102x3/Z3.java [?]<br>p102x3/Q4.java [EnhanceScreen]<br>p082t2/AbstractC2268x.java [?]<br>... +1 more |
| `p082t2/CallableC2246l0.java` | renamed: t2, a | p111z2/k.java [?]<br>p082t2/CallableC2246l0.java [?]<br>p082t2/C2243k.java [?] |
| `p082t2/D.java` |  | p082t2/AbstractC2252o0.java [?] |
| `p082t2/d1.java` | renamed: o | p111z2/g.java [?]<br>p082t2/C2229d.java [?] |
| `p082t2/E0.java` | renamed: o | p082t2/AbstractC2268x.java [?] |
| `p082t2/e1.java` | renamed: d, f | p105y1/o.java [?]<br>p082t2/AbstractC2249n.java [?] |
| `p082t2/EnumC2241j.java` | renamed: t2, o | p082t2/EnumC2241j.java [?] |
| `p082t2/EnumC2256q0.java` | renamed: t2, o | p082t2/EnumC2256q0.java [?]<br>p082t2/EnumC2257r0.java [?] |
| `p082t2/EnumC2257r0.java` | renamed: t2, o | p082t2/EnumC2257r0.java [?] |
| `p082t2/F.java` | renamed: a, b | p082t2/AbstractC2261t0.java [?]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/F0.java` | renamed: o, r | p082t2/AbstractC2268x.java [?] |
| `p082t2/f1.java` | renamed: b | p082t2/AbstractC2252o0.java [?]<br>p082t2/C2243k.java [?] |
| `p082t2/G.java` | renamed: U | p082t2/C2239i.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/G0.java` | renamed: o, r | p082t2/AbstractC2268x.java [?] |
| `p082t2/g1.java` |  | p102x3/N0.java [?]<br>p102x3/V4.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/H.java` | renamed: c, d | p082t2/EnumC2257r0.java [?] |
| `p082t2/I.java` | renamed: U | p082t2/C2239i.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/I0.java` |  | p082t2/AbstractC2250n0.java [?] |
| `p082t2/InterfaceC2237h.java` | renamed: t2 | p082t2/InterfaceC2237h.java [?] |
| `p082t2/InterfaceC2254p0.java` | renamed: t2 | p082t2/InterfaceC2254p0.java [?] |
| `p082t2/J.java` | renamed: c, d | p082t2/C2247m.java [?] |
| `p082t2/J0.java` | renamed: o, r | p102x3/F3.java [ContactMethodItem]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/j1.java` | renamed: H, B | ; ui: SettingsScreen | p102x3/Pc.java [PrintOrderCheckoutScreen]<br>p102x3/A4.java [EnhanceScreen]<br>p102x3/F3.java [ContactMethodItem]<br>p102x3/G0.java [PdfCompressScreen]<br>p102x3/H0.java [PdfCompressScreen]<br>p102x3/H3.java [?]<br>p102x3/I0.java [PdfCompressScreen]<br>p102x3/K3.java [DownloadedFileItem]<br>p102x3/L3.java [DownloadedFileItem]<br>p102x3/N0.java [?]<br>p105y1/p.java [?]<br>p102x3/Q3.java [DownloadsScreen]<br>... +22 more |
| `p082t2/K.java` | renamed: b, c | p111z2/a.java [?]<br>p111z2/c.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/K0.java` | renamed: c, d | p082t2/C2258s.java [?] |
| `p082t2/k1.java` | renamed: o, r | p111z2/g.java [?]<br>p082t2/C2229d.java [?] |
| `p082t2/L.java` | renamed: c, d | p082t2/AbstractC2250n0.java [?]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/M.java` | renamed: o, r | p111z2/a.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/N0.java` | renamed: f | p082t2/AbstractC2249n.java [?] |
| `p082t2/n1.java` | renamed: i, j | p111z2/a.java [?]<br>p102x3/Pc.java [PrintOrderCheckoutScreen]<br>p102x3/Q3.java [DownloadsScreen]<br>p105y1/v.java [?]<br>p111z2/c.java [?]<br>p111z2/d.java [?]<br>p082t2/AbstractC2250n0.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/O0.java` | renamed: c, d | p102x3/E0.java [?]<br>p111z2/c.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2251o.java [?]<br>p082t2/C2235g.java [?]<br>p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/o1.java` | renamed: A, B | p111z2/g.java [?]<br>p082t2/C2229d.java [?] |
| `p082t2/P.java` | renamed: d | p102x3/C0.java [PdfAddPageNumbersScreen]<br>p102x3/E1.java [PdfSplitScreen]<br>p102x3/K1.java [PdfSplitScreen]<br>p102x3/N0.java [?]<br>p102x3/V0.java [PdfCropScreen]<br>p102x3/X0.java [?]<br>p102x3/X1.java [PomodoroSetupScreen]<br>p102x3/Z0.java [PdfInvertScreen]<br>p111z2/b.java [?]<br>p082t2/AbstractC2261t0.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/EnumC2257r0.java [?]<br>... +5 more |
| `p082t2/P0.java` | renamed: o, r | p082t2/C2231e.java [?]<br>p082t2/C2264v.java [?] |
| `p082t2/q1.java` | renamed: d, f | p102x3/Pc.java [PrintOrderCheckoutScreen]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/W0.java [PdfCropScreen]<br>p102x3/X0.java [?]<br>p102x3/Y0.java [PdfInvertScreen]<br>p102x3/Z0.java [PdfInvertScreen]<br>p047l/C2170a.java [?]<br>p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p047l/C2170a.java [?]<br>p047l/C2171b.java [?]<br>... +4 more |
| `p082t2/r.java` | renamed: o | p111z2/g.java [?]<br>p082t2/C2229d.java [?]<br>p082t2/C2262u.java [?] |
| `p082t2/r1.java` | renamed: a, b | p102x3/B0.java [PdfAddPageNumbersScreen]<br>p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p047l/C2171b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/C2227c.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/RunnableC2225b.java` | renamed: t2, o | p047l/C2174e.java [?]<br>p082t2/RunnableC2225b.java [?]<br>p047l/C2174e.java [?]<br>p082t2/C2258s.java [?] |
| `p082t2/RunnableC2234f0.java` | renamed: t2, o | p082t2/RunnableC2234f0.java [?]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/RunnableC2240i0.java` | renamed: t2, o | ; ui: SettingsScreen | p082t2/RunnableC2240i0.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/EnumC2257r0.java [?]<br>p082t2/C2235g.java [?]<br>p082t2/C2251o.java [?]<br>p082t2/C2243k.java [?] |
| `p082t2/RunnableC2242j0.java` | renamed: t2, o | p082t2/RunnableC2242j0.java [?] |
| `p082t2/RunnableC2244k0.java` | renamed: t2, o | p082t2/RunnableC2244k0.java [?] |
| `p082t2/RunnableC2248m0.java` | renamed: t2, o | p105y1/v.java [?]<br>p082t2/RunnableC2248m0.java [?] |
| `p082t2/RunnableC2266w.java` | renamed: t2, o | p102x3/N1.java [PdfToJpgScreen]<br>p082t2/RunnableC2266w.java [?] |
| `p082t2/RunnableC2269x0.java` | renamed: t2, o | p082t2/RunnableC2269x0.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/RunnableC2270y.java` | renamed: t2, o | p082t2/RunnableC2270y.java [?]<br>p082t2/C2258s.java [?] |
| `p082t2/RunnableC2273z0.java` | renamed: t2, o | p082t2/RunnableC2273z0.java [?]<br>p082t2/C2231e.java [?] |
| `p082t2/T.java` | renamed: o, r | p105y1/q.java [?] |
| `p082t2/U.java` | renamed: A, c | p082t2/AbstractC2250n0.java [?] |
| `p082t2/U0.java` | renamed: d, f | p111z2/a.java [?]<br>p111z2/b.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/X.java` | renamed: a | p111z2/b.java [?]<br>p111z2/c.java [?]<br>p082t2/AbstractC2268x.java [?] |
| `p082t2/Y.java` | renamed: d, f | p102x3/A0.java [PdfAddPageNumbersScreen]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/F0.java [PdfCompressScreen]<br>p102x3/I0.java [PdfCompressScreen]<br>p102x3/J0.java [PdfCompressScreen]<br>p102x3/K0.java [PdfCompressScreen]<br>p109z0/l.java [?]<br>p102x3/L0.java [PdfCompressScreen]<br>p102x3/M0.java [PdfCompressScreen]<br>p102x3/N0.java [?]<br>p102x3/Q0.java [PdfCropScreen]<br>p047l/C2174e.java [?]<br>... +8 more |
| `p082t2/Y0.java` | renamed: o | p111z2/g.java [?]<br>p111z2/c.java [?]<br>p082t2/AbstractC2268x.java [?]<br>p082t2/C2235g.java [?] |
| `p082t2/Z.java` | renamed: a, b | p111z2/c.java [?]<br>p082t2/C2243k.java [?] |
| `p082t2/Z0.java` | renamed: c, d | p111z2/g.java [?]<br>p111z2/c.java [?] |
| `p083t3/A.java` | trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:451);... | p111z2/a.java [?] |
| `p083t3/A0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/q.java [?] |
| `p083t3/a1.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/Pa.java [?]<br>p102x3/Va.java [?] |
| `p083t3/AbstractC2278c.java` | renamed: t3, a | ; related: MainActivity.lambda-1 (MainActivity.kt:1107); MainActivity.lam... | p083t3/AbstractC2278c.java [?]<br>p083t3/C2274a.java [MainActivity]<br>p083t3/C2276b.java [MainActivity] |
| `p083t3/B0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/b1.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/Pa.java [?]<br>p102x3/Va.java [?] |
| `p083t3/C0.java` | renamed: o | p102x3/C2622p6.java [?] |
| `p083t3/c1.java` | renamed: o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/q.java [?] |
| `p083t3/C2274a.java` | **[KNOWN]** MainActivity composable lambda 1 (MainActivity.kt:1107) trace: com.notescrafte... | p111z2/a.java [?]<br>p083t3/C2274a.java [MainActivity] |
| `p083t3/C2275a0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/d.java [?] |
| `p083t3/C2276b.java` | **[KNOWN]** MainActivity composable lambda 2 (MainActivity.kt:1144) trace: com.notescrafte... | p111z2/a.java [?]<br>p083t3/C2276b.java [MainActivity] |
| `p083t3/C2277b0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p105y1/t.java [?]<br>p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/d.java [?]<br>p105y1/m.java [?]<br>p105y1/q.java [?] |
| `p083t3/C2279c0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p105y1/m.java [?] |
| `p083t3/C2280d.java` | renamed: t3, o | ; related: MainActivity.kt | com/notescrafter/MainActivity.java [?]<br>p105y1/o.java [?]<br>p111z2/e.java [?]<br>p105y1/y.java [?]<br>p111z2/j.java [?]<br>p111z2/c.java [?]<br>p111z2/d.java [?]<br>p083t3/C2280d.java [?] |
| `p083t3/C2281d0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p111z2/a.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p105y1/m.java [?] |
| `p083t3/C2282e.java` | renamed: t3, o | ; related: MainActivity.kt; PrintOrderViewModel ; ui: PaymentScreen; Paym... | p105y1/t.java [?]<br>com/notescrafter/MainActivity.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/r.java [?]<br>p105y1/q.java [?]<br>p083t3/C2282e.java [?] |
| `p083t3/C2283e0.java` | renamed: t3, a | p105y1/o.java [?] |
| `p083t3/C2284f.java` | trace: com.notescrafter.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:192... | com/notescrafter/MainActivity.java [?]<br>p105y1/o.java [?]<br>p111z2/h.java [?]<br>p083t3/C2284f.java [MainActivity] |
| `p083t3/C2285f0.java` | renamed: t3, a | ; ui: PaymentScreen; PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p083t3/C2286g.java` | renamed: t3, o | ; related: MainActivity.kt | com/notescrafter/MainActivity.java [?]<br>p105y1/p.java [?]<br>p083t3/C2286g.java [?] |
| `p083t3/C2287g0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/C2288h.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/h.java [?]<br>p102x3/Gd.java [A4CoverPage]<br>p102x3/H3.java [?]<br>p102x3/Kd.java [PrintPriceCalculatorScreen]<br>p102x3/X3.java [DownloadedFileItem]<br>p083t3/C2288h.java [?] |
| `p083t3/C2289h0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?]<br>p105y1/m.java [?] |
| `p083t3/C2290i.java` | renamed: t3, o | ; related: AnalyticsManager; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/utils/AnalyticsManager.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p105y1/v.java [?]<br>p111z2/h.java [?]<br>p105y1/r.java [?]<br>p102x3/A3.java [?]<br>p102x3/C2646qe.java [?]<br>p102x3/E6.java [?]<br>p102x3/EnumC2614oe.java [?]<br>p102x3/EnumC2677se.java [?]<br>... +10 more |
| `p083t3/C2291i0.java` | renamed: t3, o | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p102x3/C2438de.java [?]<br>p102x3/O8.java [?]<br>p102x3/Pa.java [?]<br>p102x3/Va.java [?] |
| `p083t3/C2292j.java` | **[KNOWN]** FeatureCard updateScope lambda (LandingScreen.kt) renamed: t3, o | p111z2/h.java [?]<br>p102x3/A6.java [FineTuneControls]<br>p102x3/AbstractC2574m6.java [AIBadge]<br>p102x3/AbstractC2583n.java [CommunityPassScreen]<br>p102x3/C2627pb.java [?]<br>p102x3/C2646qe.java [?]<br>p102x3/D5.java [FAQCard]<br>p102x3/Rb.java [AnimatedPromoBanner]<br>p102x3/Rd.java [?]<br>p102x3/Ud.java [QuickToolsScreen]<br>p105y1/r.java [?]<br>p102x3/AbstractC2574m6.java [AIBadge]<br>... +2 more |
| `p083t3/C2293j0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?] |
| `p083t3/C2294k.java` | renamed: t3, o | ; related: GlobalHomeScreen.kt; GlobalHomeScreen-adjacent (x3); PDFProces... | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p105y1/m.java [?]<br>p105y1/v.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2588n4.java [EditPageScreen]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge]<br>p102x3/Gd.java [A4CoverPage]<br>p102x3/Z4.java [DropdownSelector]<br>... +4 more |
| `p083t3/C2295k0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?]<br>p111z2/c.java [?] |
| `p083t3/C2297l0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/m.java [?] |
| `p083t3/C2298m.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2298m.java [?] |
| `p083t3/C2299m0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/C2300n.java` | renamed: t3, o | p083t3/C2300n.java [?] |
| `p083t3/C2301n0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?] |
| `p083t3/C2302o.java` | renamed: t3, o | p083t3/C2302o.java [?] |
| `p083t3/C2303o0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/q.java [?]<br>p105y1/v.java [?] |
| `p083t3/C2304p.java` | renamed: t3, o | ; related: NetworkUtils | com/notescrafter/utils/NetworkUtils.java [?]<br>p083t3/C2304p.java [?]<br>p083t3/C2302o.java [?] |
| `p083t3/C2305p0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/M4.java [?] |
| `p083t3/C2306q.java` | **[KNOWN]** LogoSelectionScreen confirm lambda (LogoSelectionScreen.kt) renamed: t3, o | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/utils/AnalyticsManager.java [?]<br>com/notescrafter/utils/ExamItem.java [?]<br>com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p111z2/e.java [?]<br>p111z2/d.java [?]<br>p111z2/i.java [?]<br>p105y1/q.java [?]<br>p105y1/v.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>... +5 more |
| `p083t3/C2307q0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/r.java [?] |
| `p083t3/C2308r0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?] |
| `p083t3/C2309s.java` | renamed: t3, o | ; related: LogoSelectionScreen confirm lambda | p083t3/C2309s.java [?]<br>p083t3/C2306q.java [?] |
| `p083t3/C2310s0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/g.java [?]<br>p105y1/t.java [?]<br>p105y1/m.java [?] |
| `p083t3/C2311t.java` | renamed: t3, o | ; related: AnalyticsManager ; ui: ContactScreen; PrintFlow; SettingsScree... | com/notescrafter/utils/AnalyticsManager.java [?]<br>p083t3/C2311t.java [?] |
| `p083t3/C2312t0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?] |
| `p083t3/C2313u.java` | **[KNOWN]** flow-step nav helper (FLOW card tap -> "flow" + step 0) renamed: t3, o | p083t3/C2313u.java [?] |
| `p083t3/C2314u0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/C2315v.java` | **[KNOWN]** route lambdas table ("flow","how-to-print","tools","contact-us",...) renamed: ... | p083t3/C2315v.java [?] |
| `p083t3/C2316v0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?]<br>p105y1/v.java [?] |
| `p083t3/C2317w.java` | renamed: t3, o | p105y1/o.java [?]<br>p083t3/C2317w.java [?] |
| `p083t3/C2318w0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p109z0/l.java [?] |
| `p083t3/C2319x.java` | **[KNOWN]** TopBar (cart/downloads icons -> step -1 DownloadsScreen) trace: com.notescraft... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2319x.java [NotesCrafterContent]<br>p083t3/C2313u.java [?]<br>p083t3/C2315v.java [?]<br>p083t3/C2317w.java [?] |
| `p083t3/C2320x0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/t.java [?] |
| `p083t3/C2321y.java` | renamed: t3, o | ; related: ToDo list state (x3) | p102x3/AbstractC2642qa.java [PomodoroStepItem]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem]<br>p083t3/C2321y.java [?] |
| `p083t3/C2322y0.java` | renamed: t3, o | p102x3/C2492h4.java [?] |
| `p083t3/C2323z.java` | trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:514) ... | p105y1/o.java [?]<br>p111z2/f.java [?]<br>p083t3/C2323z.java [NotesCrafterContent]<br>p083t3/C2321y.java [?] |
| `p083t3/C2324z0.java` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/C2492h4.java [?] |
| `p083t3/D.java` | **[KNOWN]** DownloadedFileItem (download file card) renamed: o | p105y1/o.java [?] |
| `p083t3/D0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/d1.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/E0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/Gd.java [A4CoverPage] |
| `p083t3/F.java` | renamed: o, r | ; related: LogoSelectionScreen confirm lambda; PrintOrderViewModel; ToDo l... | p105y1/t.java [?]<br>p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p105y1/m.java [?]<br>p105y1/q.java [?]<br>p105y1/v.java [?]<br>... +11 more |
| `p083t3/F0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/C2435db.java [?] |
| `p083t3/G0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/Gd.java [A4CoverPage] |
| `p083t3/H0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?] |
| `p083t3/I.java` | renamed: o | p102x3/B6.java [?]<br>p102x3/EnumC2380a4.java [?]<br>p102x3/EnumC2422ce.java [?]<br>p102x3/EnumC2604o4.java [?]<br>p102x3/EnumC2380a4.java [?]<br>p102x3/EnumC2422ce.java [?]<br>p102x3/EnumC2604o4.java [?] |
| `p083t3/I0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/J3.java [?]<br>p083t3/C2321y.java [?] |
| `p083t3/J.java` | renamed: o | ; related: AnalyticsManager; NotesCrafterApp ; ui: LoginScreen(WhatsApp) | com/notescrafter/utils/AnalyticsManager.java [?]<br>p102x3/F3.java [ContactMethodItem] |
| `p083t3/J0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?]<br>p102x3/J3.java [?]<br>p083t3/C2321y.java [?] |
| `p083t3/K0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?]<br>p102x3/R4.java [?] |
| `p083t3/L.java` | **[KNOWN]** NotesCrafterContent (central router, case "flow"/"home"/...) trace: com.notesc... | p105y1/t.java [?]<br>p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/utils/AnalyticsManager.java [?]<br>p105y1/o.java [?]<br>p111z2/g.java [?]<br>p105y1/u.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2397b5.java [ErrorScreen]<br>p102x3/AbstractC2406be.java [ReorderScreen]<br>p102x3/AbstractC2416c8.java [PdfCropScreen]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen]<br>... +56 more |
| `p083t3/L0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?]<br>p102x3/R4.java [?] |
| `p083t3/M.java` | **[KNOWN]** RouterState (initial route "home", M:393) trace: com.notescrafter.NotesCrafter... | com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/h.java [?]<br>p083t3/C2319x.java [NotesCrafterContent]<br>p083t3/C2323z.java [NotesCrafterContent] |
| `p083t3/M0.java` | renamed: o | p102x3/R4.java [?] |
| `p083t3/N.java` | renamed: o, r | p111z2/h.java [?]<br>p102x3/C2502he.java [?] |
| `p083t3/N0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?]<br>p102x3/R4.java [?] |
| `p083t3/O.java` | renamed: o | ; related: AnalyticsManager ; ui: PrintFlow | com/notescrafter/utils/AnalyticsManager.java [?] |
| `p083t3/O0.java` | renamed: o | ; related: LogoSelectionScreen confirm lambda | p102x3/Va.java [?]<br>p083t3/C2306q.java [?] |
| `p083t3/P.java` | renamed: o | p111z2/h.java [?] |
| `p083t3/P0.java` | renamed: o, r | ; related: LogoSelectionScreen confirm lambda; PrintOrderViewModel ; ui: P... | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/Va.java [?]<br>p083t3/C2306q.java [?] |
| `p083t3/Q.java` | trace: com.notescrafter.SignInRequiredScreen.<anonymous>.<anonymous> (MainActivity.kt:1251... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/h.java [?] |
| `p083t3/Q0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: LoginScreen(WhatsApp); PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/r.java` | renamed: o | p111z2/i.java [?]<br>p111z2/f.java [?] |
| `p083t3/R0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?] |
| `p083t3/S.java` | **[KNOWN]** Scaffold + RouteScope trace: com.notescrafter.AppHeader (MainActivity.kt:1068)... | p105y1/q.java [?]<br>p105y1/x.java [?]<br>p105y1/z.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/C0.java [PdfAddPageNumbersScreen]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/r.java [?]<br>p111z2/f.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p105y1/t.java [?]<br>p105y1/u.java [?]<br>... +11 more |
| `p083t3/S0.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?] |
| `p083t3/T.java` | renamed: o, r | p111z2/d.java [?]<br>p111z2/e.java [?] |
| `p083t3/T0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/m.java [?] |
| `p083t3/U.java` | renamed: o, r | ; related: PDFProcessor | p111z2/c.java [?] |
| `p083t3/U0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?]<br>p111z2/c.java [?]<br>p105y1/m.java [?] |
| `p083t3/V0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/W.java` | renamed: o | p105y1/t.java [?]<br>p105y1/t.java [?]<br>p105y1/u.java [?] |
| `p083t3/W0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/m.java [?] |
| `p083t3/X.java` | renamed: o | ; related: PDFProcessor | p105y1/t.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p083t3/X0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?]<br>p111z2/c.java [?]<br>p111z2/k.java [?]<br>p105y1/m.java [?] |
| `p083t3/Y.java` | **[KNOWN]** PrintOrderViewModel (flow step machine: g()=setStep, h()=reset) renamed: w, b | p111z2/f.java [?]<br>p105y1/t.java [?]<br>p105y1/x.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/d.java [?]<br>p111z2/c.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?]<br>p111z2/e.java [?]<br>p105y1/t.java [?]<br>p105y1/u.java [?] |
| `p083t3/Y0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p083t3/Z.java` | renamed: a, b | p105y1/o.java [?] |
| `p083t3/Z0.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?] |
| `p084u0/a.java` | renamed: d, c | p105y1/r.java [?] |
| `p085u1/a.java` | renamed: a, b | p111z2/f.java [?] |
| `p085u1/d.java` | renamed: A, C | p102x3/I4.java [EnhanceScreen]<br>p102x3/K4.java [?]<br>p102x3/L4.java [EnhanceScreen]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p111z2/f.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?] |
| `p085u1/e.java` | renamed: o, r | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p085u1/g.java` | renamed: a | p102x3/N4.java [EnhanceScreen]<br>p090v1/C2362o.java [?]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/C2362o.java [?] |
| `p085u1/h.java` | renamed: o | p102x3/M4.java [?] |
| `p085u1/i.java` | renamed: a | p111z2/a.java [?]<br>p102x3/L7.java [?]<br>p102x3/M4.java [?]<br>p102x3/N4.java [EnhanceScreen]<br>p111z2/h.java [?] |
| `p085u1/j.java` | renamed: o, r | ; ui: SettingsScreen | p102x3/E7.java [PdfCropScreen]<br>p102x3/L7.java [?]<br>p102x3/M4.java [?]<br>p111z2/a.java [?]<br>p111z2/h.java [?]<br>p102x3/G0.java [PdfCompressScreen]<br>p111z2/h.java [?]<br>p090v1/InterfaceC2347g0.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/InterfaceC2363o0.java [?]<br>p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2371w.java [?]<br>... +13 more |
| `p085u1/k.java` | renamed: A, b | p102x3/E0.java [?]<br>p102x3/N5.java [JpgToPdfScreen]<br>p102x3/S6.java [PdfAddPageNumbersScreen]<br>p111z2/h.java [?]<br>p111z2/b.java [?]<br>p105y1/C2790a.java [?]<br>p105y1/C2799j.java [?]<br>p111z2/f.java [?]<br>p111z2/g.java [?]<br>p111z2/h.java [?]<br>p111z2/j.java [?]<br>p111z2/k.java [?]<br>... +2 more |
| `p087u3/b.java` | **[KNOWN]** FilterSettings data class (invertColors, clearBackground, grayscale, blackAndW... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/e.java` | | ; ui: SettingsScreen | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/f.java` |  | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/g.java` |  | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/h.java` |  | p105y1/o.java [?] |
| `p087u3/l.java` | | ; ui: PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p087u3/m.java` | | ; ui: PrintFlow | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/n.java` | | ; ui: HistoryScreen; PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p087u3/o.java` | | ; ui: PrintFlow | p111z2/a.java [?] |
| `p087u3/p.java` | | ; ui: PrintFlow | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/q.java` | | ; ui: AddressScreen; PrintFlow | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/r.java` | | ; ui: PrintFlow | p105y1/o.java [?] |
| `p087u3/s.java` | | ; ui: PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p087u3/t.java` |  | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p087u3/u.java` |  | p105y1/o.java [?] |
| `p087u3/v.java` |  | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p088v/d.java` | renamed: b, c | p111z2/b.java [?] |
| `p088v/e.java` |  | p111z2/b.java [?] |
| `p088v/g.java` | renamed: r, s | p111z2/a.java [?] |
| `p090v1/A0.java` | renamed: o | p102x3/E7.java [PdfCropScreen]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/InterfaceC2363o0.java [?]<br>p090v1/InterfaceC2347g0.java [?]<br>p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2373y.java [?] |
| `p090v1/AbstractBinderC2337b0.java` | renamed: v1 | p090v1/InterfaceC2341d0.java [?] |
| `p090v1/AbstractBinderC2361n0.java` | renamed: v1 | p090v1/InterfaceC2363o0.java [?] |
| `p090v1/AbstractBinderC2370v.java` | renamed: v1 | p090v1/InterfaceC2371w.java [?] |
| `p090v1/AbstractC2360n.java` | renamed: v1, a | p102x3/S6.java [PdfAddPageNumbersScreen]<br>p111z2/e.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2362o.java [?] |
| `p090v1/B0.java` |  | p102x3/E8.java [PdfMergeScreen]<br>p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p090v1/BinderC2364p.java` | renamed: v1, o | p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2334a.java [?] |
| `p090v1/C.java` |  | p102x3/Q8.java [MergeStepItem]<br>p102x3/S8.java [PdfOrganizeScreen]<br>p102x3/X8.java [PdfOrganizeScreen]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/C2374z.java [?] |
| `p090v1/C0.java` |  | p090v1/InterfaceC2357l0.java [?]<br>p090v1/InterfaceC2347g0.java [?] |
| `p090v1/C2335a0.java` | renamed: v1 | p090v1/InterfaceC2341d0.java [?] |
| `p090v1/C2336b.java` | renamed: v1, b | p111z2/b.java [?]<br>p111z2/c.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2336b.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?] |
| `p090v1/C2338c.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2338c.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?] |
| `p090v1/C2339c0.java` | renamed: v1, a | p111z2/a.java [?] |
| `p090v1/C2340d.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2340d.java [?] |
| `p090v1/C2342e.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2342e.java [?] |
| `p090v1/C2344f.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2344f.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2345f0.java` | renamed: v1 | p090v1/InterfaceC2347g0.java [?] |
| `p090v1/C2346g.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2346g.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2348h.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2348h.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2349h0.java` | renamed: v1 | p111z2/a.java [?]<br>p090v1/InterfaceC2351i0.java [?] |
| `p090v1/C2350i.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2350i.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2352j.java` | renamed: v1, b | p111z2/b.java [?]<br>p111z2/c.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2352j.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?] |
| `p090v1/C2353j0.java` | renamed: v1 | p111z2/b.java [?]<br>p090v1/InterfaceC2351i0.java [?] |
| `p090v1/C2354k.java` | renamed: v1, b | p102x3/D8.java [PdfMergeScreen]<br>p102x3/E8.java [PdfMergeScreen]<br>p102x3/F8.java [PdfMergeScreen]<br>p102x3/G8.java [PdfMergeScreen]<br>p102x3/H8.java [PdfMergeScreen]<br>p102x3/I8.java [PdfMergeScreen]<br>p111z2/b.java [?]<br>p111z2/c.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2354k.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?] |
| `p090v1/C2355k0.java` | renamed: v1 | p090v1/InterfaceC2357l0.java [?] |
| `p090v1/C2356l.java` | renamed: v1, b | p111z2/b.java [?]<br>p090v1/AbstractC2360n.java [?]<br>p090v1/C2356l.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2358m.java` | renamed: v1, o | ; related: MainActivity.kt; PrintOrderViewModel ; ui: PrintFlow | p105y1/x.java [?]<br>p102x3/B0.java [PdfAddPageNumbersScreen]<br>p102x3/Cc.java [PdfSourcePickerDialog]<br>p102x3/F7.java [PdfCropScreen]<br>p102x3/Fc.java [PrintOrderCheckoutScreen]<br>p102x3/S6.java [PdfAddPageNumbersScreen]<br>p102x3/U9.java [?]<br>p111z2/h.java [?]<br>p102x3/J1.java [PdfSplitScreen]<br>p102x3/J4.java [EnhanceScreen]<br>p105y1/r.java [?]<br>com/notescrafter/MainActivity.java [?]<br>... +14 more |
| `p090v1/C2359m0.java` | renamed: v1 | p090v1/InterfaceC2363o0.java [?] |
| `p090v1/C2362o.java` | renamed: v1, f | p090v1/C2362o.java [?]<br>p090v1/C2358m.java [?] |
| `p090v1/C2366q.java` | renamed: v1, d | p102x3/S6.java [PdfAddPageNumbersScreen]<br>p090v1/C2366q.java [?] |
| `p090v1/C2367s.java` | renamed: v1 | p090v1/InterfaceC2368t.java [?]<br>p090v1/C2367s.java [?] |
| `p090v1/C2369u.java` | renamed: v1 | p090v1/InterfaceC2371w.java [?]<br>p090v1/C2369u.java [?] |
| `p090v1/C2372x.java` | renamed: v1 | p090v1/InterfaceC2373y.java [?]<br>p090v1/C2372x.java [?] |
| `p090v1/C2374z.java` | renamed: v1 | p090v1/C2374z.java [?] |
| `p090v1/D.java` |  | p102x3/N8.java [?]<br>p102x3/N9.java [PdfToJpgScreen]<br>p102x3/O8.java [?]<br>p102x3/P8.java [?]<br>p102x3/Q8.java [MergeStepItem]<br>p102x3/R9.java [PdfToJpgScreen]<br>p102x3/S8.java [PdfOrganizeScreen]<br>p102x3/U8.java [PdfOrganizeScreen]<br>p102x3/V8.java [PdfOrganizeScreen]<br>p102x3/X8.java [PdfOrganizeScreen]<br>p111z2/a.java [?]<br>p111z2/d.java [?]<br>... +2 more |
| `p090v1/D0.java` |  | p090v1/InterfaceC2347g0.java [?] |
| `p090v1/E.java` |  | p102x3/N8.java [?]<br>p102x3/N9.java [PdfToJpgScreen]<br>p102x3/O8.java [?]<br>p102x3/Q8.java [MergeStepItem]<br>p102x3/R9.java [PdfToJpgScreen]<br>p102x3/S8.java [PdfOrganizeScreen]<br>p102x3/U8.java [PdfOrganizeScreen]<br>p102x3/X8.java [PdfOrganizeScreen]<br>p111z2/a.java [?]<br>p111z2/d.java [?]<br>p090v1/InterfaceC2371w.java [?] |
| `p090v1/E0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/F0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/G.java` |  | p111z2/a.java [?]<br>p111z2/b.java [?]<br>p090v1/InterfaceC2347g0.java [?]<br>p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2373y.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/InterfaceC2363o0.java [?]<br>p090v1/InterfaceC2371w.java [?] |
| `p090v1/G0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/H.java` |  | p102x3/E7.java [PdfCropScreen]<br>p111z2/a.java [?]<br>p111z2/b.java [?]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/InterfaceC2373y.java [?]<br>p090v1/InterfaceC2347g0.java [?]<br>p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2363o0.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/C2369u.java [?]<br>p090v1/C2367s.java [?]<br>p090v1/C2372x.java [?] |
| `p090v1/H0.java` | renamed: o | p111z2/a.java [?]<br>p090v1/InterfaceC2371w.java [?] |
| `p090v1/I.java` |  | p102x3/E7.java [PdfCropScreen]<br>p111z2/a.java [?]<br>p090v1/InterfaceC2347g0.java [?]<br>p090v1/InterfaceC2368t.java [?]<br>p090v1/InterfaceC2373y.java [?]<br>p090v1/InterfaceC2371w.java [?]<br>p090v1/InterfaceC2357l0.java [?]<br>p090v1/InterfaceC2363o0.java [?] |
| `p090v1/I0.java` | renamed: o | p102x3/S9.java [PdfToJpgScreen]<br>p105y1/p.java [?]<br>p090v1/InterfaceC2373y.java [?] |
| `p090v1/InterfaceC2334a.java` | renamed: v1 | p090v1/InterfaceC2334a.java [?] |
| `p090v1/InterfaceC2341d0.java` | renamed: v1 | p090v1/InterfaceC2341d0.java [?] |
| `p090v1/InterfaceC2347g0.java` | renamed: v1 | p090v1/InterfaceC2347g0.java [?] |
| `p090v1/InterfaceC2351i0.java` | renamed: v1 | p111z2/a.java [?]<br>p090v1/InterfaceC2351i0.java [?] |
| `p090v1/InterfaceC2357l0.java` | renamed: v1 | p090v1/InterfaceC2357l0.java [?] |
| `p090v1/InterfaceC2363o0.java` | renamed: v1 | p090v1/InterfaceC2363o0.java [?] |
| `p090v1/InterfaceC2368t.java` | renamed: v1 | p090v1/InterfaceC2368t.java [?] |
| `p090v1/InterfaceC2371w.java` | renamed: v1 | p090v1/InterfaceC2371w.java [?] |
| `p090v1/InterfaceC2373y.java` | renamed: v1 | p090v1/InterfaceC2373y.java [?] |
| `p090v1/J.java` |  | p111z2/b.java [?] |
| `p090v1/J0.java` | renamed: A, B | p111z2/e.java [?]<br>p111z2/g.java [?] |
| `p090v1/K0.java` | renamed: o | p109z0/l.java [?] |
| `p090v1/L0.java` | renamed: a | p109z0/l.java [?]<br>p090v1/C2362o.java [?] |
| `p090v1/M.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/M0.java` | renamed: A, B | p111z2/g.java [?]<br>p111z2/e.java [?]<br>p090v1/C2362o.java [?] |
| `p090v1/N0.java` | renamed: o, r | p111z2/g.java [?] |
| `p090v1/O.java` |  | p102x3/D8.java [PdfMergeScreen]<br>p102x3/E8.java [PdfMergeScreen]<br>p102x3/F8.java [PdfMergeScreen]<br>p111z2/a.java [?]<br>p090v1/InterfaceC2351i0.java [?] |
| `p090v1/O0.java` | renamed: o, r | p111z2/g.java [?] |
| `p090v1/P.java` |  | p102x3/F8.java [PdfMergeScreen]<br>p111z2/a.java [?]<br>p090v1/InterfaceC2351i0.java [?] |
| `p090v1/P0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/q0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/s0.java` | renamed: o | p102x3/J3.java [?]<br>p111z2/g.java [?]<br>p111z2/a.java [?]<br>p111z2/i.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p090v1/InterfaceC2363o0.java [?] |
| `p090v1/t0.java` | renamed: o, r | p111z2/g.java [?]<br>p111z2/i.java [?]<br>p105y1/m.java [?]<br>p090v1/InterfaceC2357l0.java [?] |
| `p090v1/u0.java` | renamed: r, o | p102x3/A2.java [PrintOrderScreens]<br>p102x3/B2.java [PrintOrderScreens]<br>p102x3/C2.java [PrintOrderScreens]<br>p102x3/D2.java [PrintOrderScreens]<br>p102x3/D7.java [PdfCropScreen]<br>p111z2/e.java [?]<br>p102x3/E7.java [PdfCropScreen]<br>p111z2/h.java [?]<br>p102x3/J2.java [PrintOrderScreens]<br>p111z2/k.java [?]<br>p102x3/N5.java [JpgToPdfScreen]<br>p102x3/Rd.java [?]<br>... +11 more |
| `p090v1/v0.java` |  | p102x3/P4.java [EnhanceScreen]<br>p111z2/c.java [?] |
| `p090v1/x0.java` | renamed: o | p111z2/g.java [?] |
| `p090v1/z0.java` | renamed: o | p102x3/N8.java [?]<br>p102x3/N9.java [PdfToJpgScreen]<br>p102x3/O8.java [?]<br>p102x3/Q8.java [MergeStepItem]<br>p102x3/R9.java [PdfToJpgScreen]<br>p102x3/S8.java [PdfOrganizeScreen]<br>p102x3/U8.java [PdfOrganizeScreen]<br>p102x3/X8.java [PdfOrganizeScreen]<br>p111z2/a.java [?]<br>p111z2/d.java [?]<br>p090v1/InterfaceC2371w.java [?] |
| `p091v2/b.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p091v2/c.java` |  | p111z2/a.java [?] |
| `p091v2/e.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p091v2/f.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p092v3/d.java` | renamed: o | p105y1/t.java [?]<br>p105y1/p.java [?]<br>p105y1/x.java [?]<br>p111z2/c.java [?]<br>p111z2/i.java [?] |
| `p092v3/e.java` | renamed: o | ; ui: PrintFlow | p105y1/t.java [?]<br>p105y1/x.java [?] |
| `p092v3/f.java` | renamed: o | p105y1/t.java [?]<br>p105y1/x.java [?] |
| `p092v3/h.java` | renamed: y, z | ; related: NotesCrafterFCMService | p111z2/f.java [?]<br>p105y1/t.java [?]<br>com/notescrafter/service/NotesCrafterFCMService.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p105y1/s.java [?]<br>p105y1/t.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?] |
| `p092v3/j.java` | renamed: o | p105y1/p.java [?]<br>p105y1/s.java [?]<br>p105y1/t.java [?]<br>p105y1/x.java [?]<br>p111z2/b.java [?] |
| `p092v3/k.java` | renamed: o | p105y1/p.java [?]<br>p105y1/s.java [?]<br>p105y1/t.java [?] |
| `p092v3/l.java` | renamed: o, r | ; related: MainActivity.kt; NotesCrafterFCMService | com/notescrafter/MainActivity.java [?]<br>p105y1/r.java [?]<br>com/notescrafter/service/NotesCrafterFCMService.java [?]<br>p047l/C2174e.java [?]<br>p111z2/h.java [?]<br>p111z2/i.java [?]<br>p111z2/k.java [?]<br>p047l/C2174e.java [?] |
| `p092v3/m.java` | renamed: o, r | ; related: NotesCrafterFCMService | p105y1/n.java [?]<br>com/notescrafter/service/NotesCrafterFCMService.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2174e.java [?] |
| `p092v3/n.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/e.java [?] |
| `p092v3/o.java` | renamed: o | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p092v3/p.java` | renamed: a | p111z2/d.java [?] |
| `p092v3/q.java` | renamed: A, B | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?] |
| `p092v3/s.java` | renamed: o, r | p083t3/C2275a0.java [?] |
| `p092v3/t.java` |  | p105y1/o.java [?]<br>p105y1/m.java [?] |
| `p092v3/u.java` | renamed: c, d | p105y1/p.java [?]<br>p111z2/d.java [?]<br>p111z2/g.java [?]<br>p105y1/y.java [?] |
| `p092v3/v.java` | renamed: c, d | p105y1/p.java [?]<br>p111z2/a.java [?]<br>p111z2/g.java [?] |
| `p092v3/w.java` | renamed: o | p111z2/e.java [?]<br>p105y1/x.java [?]<br>p111z2/i.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p105y1/v.java [?] |
| `p092v3/x.java` | renamed: o | p111z2/e.java [?]<br>p111z2/i.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?] |
| `p092v3/y.java` | renamed: a | p111z2/e.java [?] |
| `p093w/a.java` | renamed: a, b | ; ui: SettingsScreen | p105y1/r.java [?] |
| `p095w1/a.java` | renamed: o | p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p096w2/a.java` | renamed: n, o | p111z2/b.java [?] |
| `p097w3/a.java` | renamed: o, r | ; related: GlobalHomeScreen.kt; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/m.java [?]<br>p105y1/t.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2397b5.java [ErrorScreen]<br>p102x3/AbstractC2598ne.java [SettingsItem]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge]<br>p102x3/F3.java [ContactMethodItem]<br>p102x3/Gd.java [A4CoverPage]<br>p102x3/Qd.java [Particle]<br>p102x3/Rb.java [AnimatedPromoBanner]<br>p102x3/Ye.java [AnalogClock]<br>... +3 more |
| `p097w3/b.java` | trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<an... | p111z2/a.java [?] |
| `p097w3/c.java` | trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<an... | p111z2/a.java [?] |
| `p097w3/d.java` | trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous> (Bo... | p105y1/o.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2290i.java [?] |
| `p097w3/e.java` | trace: com.notescrafter.ui.components.BottomNavBar.<anonymous> (BottomNavBar.kt:75) rename... | p105y1/o.java [?] |
| `p097w3/f.java` | **[KNOWN]** BottomNavBar.kt (5 items: Contact, To-Do, Home, My Orders, Setting) trace: com... | p105y1/o.java [?] |
| `p097w3/g.java` | renamed: o | p105y1/o.java [?]<br>p102x3/C2477g5.java [?]<br>p102x3/V3.java [?] |
| `p097w3/h.java` | trace: com.notescrafter.ui.components.CinematicBackground (CinematicBackground.kt:25) | p105y1/o.java [?]<br>p083t3/C2292j.java [?]<br>p111z2/a.java [?]<br>p083t3/C2292j.java [?] |
| `p097w3/j.java` | **[KNOWN]** GlassCard.kt (glass card, GlassCard.kt:26) trace: com.notescrafter.ui.componen... | p105y1/o.java [?] |
| `p097w3/l.java` | trace: com.notescrafter.ui.components.GlassDialog.<anonymous>.<anonymous> (GlassDialog.kt:... | p105y1/o.java [?] |
| `p097w3/n.java` | trace: com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21) | p105y1/o.java [?] |
| `p097w3/p.java` | trace: com.notescrafter.ui.components.GradientButton.<anonymous> (GradientButton.kt:47) re... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p097w3/q.java` | trace: com.notescrafter.ui.components.GradientButton (GradientButton.kt:28) | p105y1/o.java [?] |
| `p097w3/r.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p097w3/t.java` | trace: com.notescrafter.ui.components.StepIndicator (StepIndicator.kt:37) | p105y1/o.java [?] |
| `p098x/b.java` |  | p111z2/a.java [?] |
| `p098x/c.java` | renamed: o | p105y1/r.java [?]<br>p111z2/k.java [?]<br>p105y1/m.java [?]<br>p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p098x/h.java` | renamed: f | p105y1/r.java [?] |
| `p098x/i.java` |  | p105y1/r.java [?] |
| `p098x/k.java` | renamed: a, f | ; ui: HistoryScreen | p105y1/r.java [?]<br>p105y1/r.java [?]<br>p047l/C2175f.java [?]<br>p047l/C2175f.java [?] |
| `p098x/l.java` | renamed: a, b | p105y1/r.java [?] |
| `p099x0/a.java` | renamed: a, b | p047l/C2174e.java [?]<br>p047l/C2174e.java [?] |
| `p099x0/b.java` | renamed: d, f | p111z2/a.java [?]<br>p047l/C2174e.java [?]<br>p047l/C2174e.java [?] |
| `p100x1/b.java` |  | p111z2/h.java [?]<br>p111z2/k.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p111z2/f.java [?]<br>p090v1/InterfaceC2334a.java [?] |
| `p100x1/c.java` | renamed: M, D | p102x3/S6.java [PdfAddPageNumbersScreen]<br>p105y1/r.java [?]<br>p111z2/b.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/k.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>... +2 more |
| `p100x1/d.java` | renamed: o, r | p111z2/b.java [?]<br>p111z2/g.java [?]<br>p105y1/u.java [?] |
| `p100x1/g.java` | renamed: o | p105y1/C2796g.java [?]<br>p105y1/C2796g.java [?] |
| `p100x1/l.java` | renamed: o | p102x3/K3.java [DownloadedFileItem]<br>p102x3/L3.java [DownloadedFileItem]<br>p111z2/a.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p111z2/b.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p100x1/n.java` | renamed: r, s | p111z2/a.java [?]<br>p111z2/h.java [?]<br>p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p090v1/InterfaceC2334a.java [?]<br>p090v1/C2366q.java [?] |
| `p101x2/o.java` | renamed: a, b | p102x3/N5.java [JpgToPdfScreen] |
| `p102x3/A.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityScreenKt.lambda-2.<anonym... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/A0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-6... | p105y1/o.java [?]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/A1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-8.<anon... | p111z2/a.java [?] |
| `p102x3/A4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/e.java [?] |
| `p102x3/A5.java` | trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous>.<a... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/A6.java` | **[KNOWN]** LogoSelectionScreen.kt (LogoSelectionScreen:80, LogoSelectionOverlay:422, Shap... | p105y1/o.java [?]<br>p083t3/C2292j.java [?]<br>p083t3/C2306q.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/i.java [?]<br>p111z2/g.java [?]<br>p111z2/j.java [?]<br>p105y1/q.java [?]<br>p102x3/EnumC2422ce.java [?]<br>p102x3/AbstractC2647r0.java [?]<br>p083t3/C2292j.java [?]<br>p083t3/C2306q.java [?]<br>... +2 more |
| `p102x3/A9.java` | renamed: A, B | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p102x3/Ab.java` | trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous> (PrintLandingS... | p105y1/o.java [?] |
| `p102x3/AbstractC2376a0.java` | renamed: x3, a | p102x3/AbstractC2376a0.java [?] |
| `p102x3/AbstractC2378a2.java` | renamed: x3, a | p102x3/AbstractC2378a2.java [?] |
| `p102x3/AbstractC2395b3.java` | renamed: x3, a | p102x3/AbstractC2395b3.java [?] |
| `p102x3/AbstractC2397b5.java` | trace: com.notescrafter.ui.screens.ErrorScreen (ErrorScreen.kt:23) renamed: x3 | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2397b5.java [ErrorScreen] |
| `p102x3/AbstractC2406be.java` | trace: com.notescrafter.ui.screens.ReorderScreen (ReorderScreen.kt:50); com.notescrafter.u... | p105y1/o.java [?]<br>p111z2/d.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p111z2/f.java [?]<br>p111z2/f.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p105y1/q.java [?]<br>p105y1/t.java [?]<br>p102x3/AbstractC2406be.java [ReorderScreen]<br>... +2 more |
| `p102x3/AbstractC2416c8.java` | trace: com.notescrafter.ui.screens.PdfCropScreen (PdfCropScreen.kt:64); com.notescrafter.u... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/AbstractC2443e3.java` | renamed: x3, a | p102x3/AbstractC2443e3.java [?] |
| `p102x3/AbstractC2447e7.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen (PdfAddPageNumbersScreen.kt:74)... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/AbstractC2452ec.java` | trace: com.notescrafter.ui.screens.OrderCardItem (PrintMyOrdersScreen.kt:560); com.notescr... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem]<br>p102x3/C2519j.java [?] |
| `p102x3/AbstractC2469fd.java` | renamed: x3, a | p111z2/i.java [?]<br>p102x3/AbstractC2469fd.java [?] |
| `p102x3/AbstractC2471g.java` | trace: com.notescrafter.ui.screens.AboutUsScreen (AboutUsScreen.kt:26); com.notescrafter.u... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2471g.java [AboutUsScreen]<br>p102x3/AbstractC2710v.java [?]<br>p102x3/C2375a.java [?]<br>p102x3/C2423d.java [StatCard]<br>p102x3/C2407c.java [?]<br>p102x3/C2439e.java [TechItem]<br>p102x3/C2455f.java [ValueItem]<br>p102x3/C2391b.java [?] |
| `p102x3/AbstractC2474g2.java` | renamed: x3, a | p102x3/AbstractC2474g2.java [?] |
| `p102x3/AbstractC2475g3.java` | renamed: x3, a | p102x3/AbstractC2475g3.java [?] |
| `p102x3/AbstractC2489h1.java` | renamed: x3, a | p102x3/AbstractC2489h1.java [?] |
| `p102x3/AbstractC2493h5.java` | trace: com.notescrafter.ui.screens.FeatureCard (FeaturesScreen.kt:83); com.notescrafter.ui... | p105y1/o.java [?]<br>p111z2/g.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2493h5.java [FeatureCard]<br>p102x3/C2375a.java [?] |
| `p102x3/AbstractC2494h6.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen (JpgToPdfScreen.kt:74); com.notescrafter... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2291i0.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2494h6.java [JpgToPdfScreen]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/AbstractC2535k.java` | trace: com.notescrafter.ui.screens.CategoryChipItem (CategoryChipItem.kt:32) renamed: x3 | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2535k.java [CategoryChipItem]<br>p102x3/C2503i.java [?]<br>p102x3/C2519j.java [?] |
| `p102x3/AbstractC2539k3.java` | renamed: x3, a | p102x3/AbstractC2539k3.java [?] |
| `p102x3/AbstractC2545k9.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen (PdfOrganizeScreen.kt:72); com.notesc... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p105y1/n.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen] |
| `p102x3/AbstractC2552l0.java` | renamed: x3, a | p102x3/AbstractC2552l0.java [?] |
| `p102x3/AbstractC2565ld.java` | renamed: x3, a | p111z2/i.java [?]<br>p102x3/AbstractC2565ld.java [?] |
| `p102x3/AbstractC2574m6.java` | **[KNOWN]** LandingScreen.kt (LandingScreen, AIBadge, FeatureCard, FeaturesSection, HowItW... | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2292j.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2574m6.java [AIBadge]<br>p083t3/C2292j.java [?]<br>p102x3/C2599o.java [?] |
| `p102x3/AbstractC2583n.java` | trace: com.notescrafter.ui.screens.CommunityPassScreen (CommunityPassScreen.kt:149); com.n... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2292j.java [?]<br>p105y1/o.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2583n.java [CommunityPassScreen]<br>p102x3/AbstractC2758y.java [?]<br>p083t3/C2292j.java [?]<br>p102x3/C2662s.java [?]<br>p102x3/C2551l.java [?]<br>p102x3/C2567m.java [?] |
| `p102x3/AbstractC2587n3.java` | renamed: x3, a | p102x3/AbstractC2587n3.java [?] |
| `p102x3/AbstractC2588n4.java` | trace: com.notescrafter.ui.screens.EditPageScreen (EditPageScreen.kt:66); com.notescrafter... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2294k.java [?]<br>p111z2/i.java [?]<br>p111z2/g.java [?]<br>p111z2/h.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2588n4.java [EditPageScreen]<br>p102x3/EnumC2604o4.java [?]<br>p102x3/EnumC2380a4.java [?]<br>p102x3/EnumC2454ee.java [?]<br>... +2 more |
| `p102x3/AbstractC2595nb.java` | trace: com.notescrafter.ui.screens.AddressCard (PrintAddressesScreen.kt:575); com.notescra... | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/d.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2294k.java [?]<br>p083t3/C2306q.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/J0.java [PdfCompressScreen]<br>p105y1/o.java [?]<br>p102x3/B1.java [PdfOrganizeScreen]<br>... +8 more |
| `p102x3/AbstractC2598ne.java` | trace: com.notescrafter.ui.screens.SettingsItem (SettingsScreen.kt:580); com.notescrafter.... | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2598ne.java [SettingsItem] |
| `p102x3/AbstractC2616p0.java` | renamed: x3, a | p102x3/AbstractC2616p0.java [?] |
| `p102x3/AbstractC2642qa.java` | trace: com.notescrafter.ui.screens.PomodoroStepItem (PomodoroSetupScreen.kt:670); com.note... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/AbstractC2647r0.java` | renamed: x3, a | p102x3/AbstractC2647r0.java [?] |
| `p102x3/AbstractC2648r1.java` | renamed: x3, a | p102x3/AbstractC2648r1.java [?] |
| `p102x3/AbstractC2649r2.java` | renamed: x3, a | p102x3/AbstractC2649r2.java [?] |
| `p102x3/AbstractC2684t5.java` | **[KNOWN]** GlobalHomeScreen.kt (hero + FLOW/PRINTS/TOOLS cards) trace: com.notescrafter.u... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2294k.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge]<br>p083t3/C2294k.java [?]<br>p102x3/C2567m.java [?] |
| `p102x3/AbstractC2710v.java` | renamed: x3, a | p102x3/AbstractC2710v.java [?]<br>p102x3/C2678t.java [AboutUsScreen]<br>p102x3/C2694u.java [AboutUsScreen] |
| `p102x3/AbstractC2730w3.java` | renamed: x3, a | p102x3/AbstractC2730w3.java [?] |
| `p102x3/AbstractC2745x2.java` | renamed: x3, a | p102x3/AbstractC2745x2.java [?] |
| `p102x3/AbstractC2758y.java` | renamed: x3, a | p102x3/AbstractC2758y.java [?]<br>p102x3/C2726w.java [CommunityPassScreen]<br>p102x3/C2742x.java [CommunityPassScreen] |
| `p102x3/AbstractC2762y3.java` | renamed: x3, a | p102x3/AbstractC2762y3.java [?] |
| `p102x3/AbstractC2777z2.java` | renamed: x3, a | p102x3/AbstractC2777z2.java [?] |
| `p102x3/AbstractC2782z7.java` | trace: com.notescrafter.ui.screens.CompressStepItem (PdfCompressScreen.kt:1154); com.notes... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2782z7.java [CompressStepItem]<br>p102x3/EnumC2778z3.java [?]<br>p102x3/EnumC2614oe.java [?] |
| `p102x3/AbstractC2783z8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen (PdfInvertScreen.kt:62); com.notescraft... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/Ac.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/m.java [?] |
| `p102x3/Ad.java` | trace: com.notescrafter.ui.screens.ShippingTextField.<anonymous>.<anonymous> (PrintOrderSc... | p111z2/a.java [?] |
| `p102x3/B.java` | renamed: a, b | p102x3/C2774z.java [CommunityScreen] |
| `p102x3/B0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-7... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/B1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-9.<anon... | p111z2/a.java [?] |
| `p102x3/B2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-10.<ano... | p105y1/o.java [?] |
| `p102x3/B5.java` | renamed: o | ; related: AnalyticsManager ; ui: ContactScreen; PrintFlow; SettingsScreen | com/notescrafter/utils/AnalyticsManager.java [?] |
| `p102x3/B7.java` | renamed: A, B | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/B8.java` | trace: com.notescrafter.ui.screens.MergeStepItem.<anonymous> (PdfMergeScreen.kt:1061) rena... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/B9.java` | trace: com.notescrafter.ui.screens.SplitStepItem.<anonymous> (PdfSplitScreen.kt:1082) rena... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Ba.java` | trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?] |
| `p102x3/Bb.java` | renamed: o | p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Bc.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous> (PrintOrderScreens... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p105y1/z.java [?]<br>p105y1/m.java [?]<br>p111z2/h.java [?]<br>p111z2/j.java [?] |
| `p102x3/Bd.java` | trace: com.notescrafter.ui.screens.WarningBanner.<anonymous> (PrintOrderScreens.kt:1188) r... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Be.java` | trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?] |
| `p102x3/bf.java` | trace: com.notescrafter.ui.screens.FeatureTile.<anonymous> (UploadScreen.kt:348) renamed: ... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-1.<anonym... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-8... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2375a.java` | renamed: x3, o | p102x3/AbstractC2471g.java [AboutUsScreen]<br>p102x3/AbstractC2493h5.java [FeatureCard]<br>p102x3/C2375a.java [?] |
| `p102x3/C2377a1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-3.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2379a3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintPriceCalculatorScreenKt.lambd... | p105y1/o.java [?] |
| `p102x3/C2381a5.java` | trace: com.notescrafter.ui.screens.ErrorScreen.<anonymous>.<anonymous> (ErrorScreen.kt:34)... | p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2382a6.java` | renamed: x3, o | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p102x3/C2383a7.java` | renamed: x3, o | p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/C2384a8.java` | renamed: x3, A | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/e.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/C2385a9.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p111z2/a.java [?] |
| `p102x3/C2388ac.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/C2389ad.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2390ae.java` | trace: com.notescrafter.ui.screens.ReorderableItem.<anonymous> (ReorderScreen.kt:252) rena... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2391b.java` | renamed: x3, o | p102x3/AbstractC2471g.java [AboutUsScreen]<br>p102x3/C2391b.java [?] |
| `p102x3/C2392b0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-1.<anonymo... | p111z2/a.java [?] |
| `p102x3/C2393b1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-4.<anonym... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2394b2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-13.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2398b6.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2399b7.java` | renamed: x3, A | p111z2/e.java [?] |
| `p102x3/C2400b8.java` | trace: com.notescrafter.ui.screens.PdfCropStepItem.<anonymous> (PdfCropScreen.kt:1153) ren... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2401b9.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous> (PdfOrganizeS... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2404bc.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/C2405bd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?] |
| `p102x3/C2407c.java` | renamed: x3, o | p102x3/AbstractC2471g.java [AboutUsScreen]<br>p102x3/C2407c.java [?] |
| `p102x3/C2408c0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-10.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2409c1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-5.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2410c2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-14.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2411c3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-1.<anony... | p105y1/o.java [?] |
| `p102x3/C2412c4.java` | renamed: x3, o | p111z2/h.java [?]<br>p102x3/EnumC2454ee.java [?] |
| `p102x3/C2413c5.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2414c6.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous> (JpgToPdfScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/i.java [?] |
| `p102x3/C2415c7.java` | renamed: x3, A | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/e.java [?] |
| `p102x3/C2417c9.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow; SettingsScreen | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem]<br>p102x3/AbstractC2406be.java [ReorderScreen] |
| `p102x3/C2419cb.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2324z0.java [?] |
| `p102x3/C2420cc.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/C2421cd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2277b0.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2423d.java` | trace: com.notescrafter.ui.screens.StatCard.<anonymous> (AboutUsScreen.kt:273) renamed: x3... | p105y1/o.java [?]<br>p102x3/C2423d.java [StatCard] |
| `p102x3/C2424d0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-2.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2425d1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-6.<anonym... | p105y1/o.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2426d2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-15.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2427d3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-2.<anony... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2429d5.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2431d7.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersStepItem.<anonymous> (PdfAddPageNumber... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2434da.java` | renamed: x3, o | ; related: ToDo list state (x3) | p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/C2435db.java` | renamed: x3, o | p105y1/q.java [?] |
| `p102x3/C2436dc.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous> (PrintMyOrdersScreen.kt... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem]<br>p102x3/AbstractC2777z2.java [?] |
| `p102x3/C2437dd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2438de.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2439e.java` | trace: com.notescrafter.ui.screens.TechItem.<anonymous> (AboutUsScreen.kt:258) renamed: x3... | p105y1/o.java [?]<br>p102x3/C2439e.java [TechItem] |
| `p102x3/C2440e0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-3.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2441e1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-7.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2442e2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-16.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2444e4.java` | renamed: x3, o | p102x3/AbstractC2588n4.java [EditPageScreen] |
| `p102x3/C2445e5.java` | renamed: x3, o | ; related: ExamItem; LandingScreen.kt; StepItem data class (LandingScreen... | com/notescrafter/utils/ExamItem.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2493h5.java [FeatureCard]<br>p102x3/AbstractC2574m6.java [AIBadge] |
| `p102x3/C2446e6.java` | renamed: x3, o | p111z2/e.java [?] |
| `p102x3/C2448e8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/C2450ea.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2378a2.java [?] |
| `p102x3/C2451eb.java` | trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p105y1/v.java [?] |
| `p102x3/C2453ed.java` | renamed: x3, o | p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2455f.java` | trace: com.notescrafter.ui.screens.ValueItem.<anonymous> (AboutUsScreen.kt:299) renamed: x... | p105y1/o.java [?]<br>p102x3/C2455f.java [ValueItem] |
| `p102x3/C2456f0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-4.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2457f1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-8.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/C2458f2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-17.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2460f4.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/EnumC2604o4.java [?]<br>p102x3/EnumC2380a4.java [?] |
| `p102x3/C2461f5.java` | trace: com.notescrafter.ui.screens.FeatureCard.<anonymous> (FeaturesScreen.kt:87) renamed:... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2462f6.java` | renamed: x3, o | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/e.java [?] |
| `p102x3/C2463f7.java` | renamed: x3, o | ; related: PDFProcessor; ToDoManager | com/notescrafter/service/PDFProcessor.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p102x3/AbstractC2378a2.java [?] |
| `p102x3/C2464f8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/C2465f9.java` | renamed: x3, A | p102x3/AbstractC2545k9.java [PdfOrganizeScreen] |
| `p102x3/C2466fa.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem]<br>p083t3/C2321y.java [?] |
| `p102x3/C2467fb.java` | trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous>.<anonymous>.<anonymous> (... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2321y.java [?]<br>p105y1/v.java [?]<br>p102x3/AbstractC2649r2.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>p083t3/C2290i.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/C2472g0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-5.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2473g1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-9.<anonym... | p111z2/a.java [?] |
| `p102x3/C2476g4.java` | renamed: x3, o | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2588n4.java [EditPageScreen]<br>p102x3/EnumC2454ee.java [?] |
| `p102x3/C2477g5.java` | renamed: x3, o | ; ui: SettingsScreen | p105y1/p.java [?]<br>p102x3/AbstractC2493h5.java [FeatureCard] |
| `p102x3/C2478g6.java` | trace: com.notescrafter.ui.screens.JpgToPdfStepItem.<anonymous> (JpgToPdfScreen.kt:1132) r... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2480g8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/C2482ga.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2483gb.java` | trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous> (PrintAddressesScreen.kt:... | p105y1/o.java [?]<br>p105y1/o.java [?]<br>p105y1/v.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2485gd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2469fd.java [?] |
| `p102x3/C2486ge.java` | trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2598ne.java [SettingsItem]<br>p083t3/C2290i.java [?] |
| `p102x3/C2487h.java` | renamed: x3, a | p105y1/o.java [?]<br>p111z2/a.java [?]<br>p102x3/C2487h.java [?] |
| `p102x3/C2488h0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-6.<anonymo... | p105y1/o.java [?]<br>p102x3/AbstractC2494h6.java [JpgToPdfScreen] |
| `p102x3/C2491h3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-2.<anonymou... | p105y1/o.java [?] |
| `p102x3/C2492h4.java` | renamed: x3, o | p102x3/EnumC2454ee.java [?] |
| `p102x3/C2495h7.java` | trace: com.notescrafter.ui.screens.CompressStepItem.<anonymous> (PdfCompressScreen.kt:1158... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2496h8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2497h9.java` | renamed: x3, A | p111z2/e.java [?] |
| `p102x3/C2499hb.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p102x3/C2501hd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2502he.java` | renamed: x3, o | p111z2/h.java [?] |
| `p102x3/C2503i.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?]<br>p102x3/C2503i.java [?] |
| `p102x3/C2504i0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-7.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2505i1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-1.<anonymo... | p111z2/a.java [?] |
| `p102x3/C2506i2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-10.<... | p105y1/o.java [?] |
| `p102x3/C2507i3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-3.<anonymou... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2509i5.java` | renamed: x3, o | ; related: GlobalHomeScreen.kt | p102x3/AbstractC2684t5.java [BrandFeatureBadge] |
| `p102x3/C2510i6.java` | renamed: x3, o | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2511i7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?] |
| `p102x3/C2512i8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2513i9.java` | renamed: x3, o | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/e.java [?]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen] |
| `p102x3/C2514ia.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/C2515ib.java` | trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous> (PrintAddr... | p105y1/o.java [?] |
| `p102x3/C2516ic.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p102x3/C2517id.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2518ie.java` | trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p111z2/h.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2519j.java` | renamed: x3, o | ; related: ToDo list state (x3) | p109z0/l.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2535k.java [CategoryChipItem]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem]<br>p102x3/AbstractC2452ec.java [OrderCardItem]<br>p102x3/C2519j.java [?]<br>p102x3/C2503i.java [?] |
| `p102x3/C2520j0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-8.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/C2521j1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-2.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2523j3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-4.<anonymou... | p105y1/o.java [?] |
| `p102x3/C2524j4.java` | trace: com.notescrafter.ui.screens.EditPageScreen.<anonymous>.<anonymous> (EditPageScreen.... | p111z2/b.java [?]<br>p111z2/g.java [?]<br>p102x3/EnumC2604o4.java [?]<br>p102x3/EnumC2380a4.java [?]<br>p102x3/AbstractC2588n4.java [EditPageScreen] |
| `p102x3/C2525j5.java` | renamed: x3, o | ; related: GlobalHomeScreen.kt; ToDoItem | com/notescrafter/utils/ToDoItem.java [?]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge] |
| `p102x3/C2526j6.java` | renamed: x3, o | ; related: LandingScreen.kt | p102x3/AbstractC2574m6.java [AIBadge] |
| `p102x3/C2528j8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen]<br>p102x3/AbstractC2489h1.java [?] |
| `p102x3/C2529j9.java` | trace: com.notescrafter.ui.screens.PdfOrganizeStepItem.<anonymous> (PdfOrganizeScreen.kt:1... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2530ja.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2531jb.java` | trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous>.<anonymous... | p105y1/o.java [?] |
| `p102x3/C2533jd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2534je.java` | trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.... | p105y1/o.java [?]<br>p102x3/AbstractC2598ne.java [SettingsItem] |
| `p102x3/C2537k1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-3.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2540k4.java` | trace: com.notescrafter.ui.screens.HistoryButton.<anonymous> (EditPageScreen.kt:728) renam... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2541k5.java` | trace: com.notescrafter.ui.screens.BrandFeatureBadge.<anonymous> (GlobalHomeScreen.kt:556)... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2542k6.java` | trace: com.notescrafter.ui.screens.FeatureCard.<anonymous> (LandingScreen.kt:410) renamed:... | p105y1/o.java [?] |
| `p102x3/C2543k7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?] |
| `p102x3/C2544k8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2546ka.java` | renamed: x3, o | ; related: ToDo list state (x3); ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/C2547kb.java` | trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous>.<anonymous... | p105y1/o.java [?] |
| `p102x3/C2548kc.java` | renamed: x3, o | p105y1/q.java [?] |
| `p102x3/C2549kd.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous> (Print... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2550ke.java` | trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.... | p105y1/o.java [?]<br>p102x3/AbstractC2598ne.java [SettingsItem] |
| `p102x3/C2551l.java` | renamed: x3, o | p105y1/o.java [?]<br>p102x3/C2551l.java [?] |
| `p102x3/C2553l1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-4.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2555l3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$SuccessScreenKt.lambda-1.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2557l5.java` | **[KNOWN]** FLOW card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.screens... | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge] |
| `p102x3/C2558l6.java` | trace: com.notescrafter.ui.screens.StepItem.<anonymous> (LandingScreen.kt:348) renamed: x3... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2559l7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2782z7.java [CompressStepItem] |
| `p102x3/C2560l8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2561l9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/C2562la.java` | renamed: x3, o | ; related: ToDo list state (x3); ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/C2563lb.java` | trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous> (PrintAddr... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2649r2.java [?] |
| `p102x3/C2566le.java` | trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.... | p105y1/o.java [?]<br>p102x3/AbstractC2598ne.java [SettingsItem] |
| `p102x3/C2567m.java` | renamed: x3, o | ; related: GlobalHomeScreen.kt; GlobalHomeScreen-adjacent (x3); PrintOrde... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/v.java [?]<br>p111z2/h.java [?]<br>p102x3/AbstractC2583n.java [CommunityPassScreen]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge]<br>p102x3/EnumC2422ce.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>p102x3/C2567m.java [?] |
| `p102x3/C2569m1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-5.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2570m2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-5.<a... | p105y1/o.java [?] |
| `p102x3/C2571m3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$SuccessScreenKt.lambda-2.<anonymou... | p105y1/o.java [?] |
| `p102x3/C2572m4.java` | trace: com.notescrafter.ui.screens.SelectionOverlay.<anonymous> (EditPageScreen.kt:520) re... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/EnumC2380a4.java [?]<br>p102x3/EnumC2604o4.java [?] |
| `p102x3/C2575m7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2576m8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p111z2/a.java [?] |
| `p102x3/C2577m9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2578ma.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/C2579mb.java` | trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous> (PrintAddressesScreen.... | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p083t3/C2306q.java [?]<br>p102x3/AbstractC2649r2.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/C2580mc.java` | trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.... | p105y1/o.java [?] |
| `p102x3/C2581md.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous> (PrintOrderScreens... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p105y1/q.java [?]<br>p105y1/v.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/C2582me.java` | trace: com.notescrafter.ui.screens.SettingsSection.<anonymous>.<anonymous> (SettingsScreen... | p105y1/o.java [?] |
| `p102x3/C2585n1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-6.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2586n2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-6.<a... | p105y1/o.java [?] |
| `p102x3/C2591n7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2592n8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p111z2/a.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2593n9.java` | renamed: x3, o | p105y1/o.java [?] |
| `p102x3/C2594na.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/f.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem]<br>p083t3/C2306q.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/C2596nc.java` | trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p111z2/i.java [?]<br>p105y1/q.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/C2597nd.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2312t0.java [?] |
| `p102x3/C2599o.java` | renamed: x3, o | ; related: LandingScreen.kt | p102x3/AbstractC2574m6.java [AIBadge]<br>p102x3/C2599o.java [?] |
| `p102x3/C2600o0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$LiveChatScreenKt.lambda-3.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2601o1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-7.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2648r1.java [?] |
| `p102x3/C2603o3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-1.<anonymous> ... | p105y1/o.java [?] |
| `p102x3/C2605o5.java` | trace: com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous>.<a... | p105y1/o.java [?] |
| `p102x3/C2606o6.java` | trace: com.notescrafter.ui.screens.LiveChatScreen.<anonymous>.<anonymous> (LiveChatScreen.... | p102x3/AbstractC2616p0.java [?] |
| `p102x3/C2607o7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2608o8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | p105y1/o.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2609o9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2610oa.java` | trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>... | com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2611ob.java` | renamed: x3, a | ; ui: PrintFlow | p105y1/o.java [?] |
| `p102x3/C2612oc.java` | trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous> (PrintOrderScreens.kt:44... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2613od.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2617p1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-8.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2621p5.java` | **[KNOWN]** PRINTS card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.scree... | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge] |
| `p102x3/C2622p6.java` | renamed: x3, o | ; ui: AddressScreen | p105y1/u.java [?]<br>p105y1/r.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2623p7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2782z7.java [CompressStepItem] |
| `p102x3/C2625p9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/C2626pa.java` | trace: com.notescrafter.ui.screens.PomodoroStepItem.<anonymous> (PomodoroSetupScreen.kt:67... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2627pb.java` | renamed: x3, a | ; ui: PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2629pd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/m.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2630pe.java` | renamed: x3, a | p111z2/a.java [?] |
| `p102x3/C2631q.java` | trace: com.notescrafter.ui.screens.SocialCard.<anonymous> (CommunityScreen.kt:315) renamed... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/C2631q.java [SocialCard] |
| `p102x3/C2632q0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$LogoSelectionScreenKt.lambda-1.<an... | p111z2/a.java [?] |
| `p102x3/C2633q1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-9.<anonymo... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2635q3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-3.<anonymous> ... | p105y1/o.java [?] |
| `p102x3/C2637q5.java` | **[KNOWN]** TOOLS card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.screen... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2684t5.java [BrandFeatureBadge] |
| `p102x3/C2639q7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2640q8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<an... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2641q9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2646qe.java` | renamed: x3, a | p111z2/a.java [?] |
| `p102x3/C2650r3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-4.<anonymous> ... | p105y1/o.java [?] |
| `p102x3/C2652r5.java` | trace: com.notescrafter.ui.screens.ProductContainer.<anonymous> (GlobalHomeScreen.kt:350) ... | p105y1/r.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2654r7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p102x3/EnumC2778z3.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/C2655r8.java` | trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous> (PdfInvertScree... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2656r9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2659rc.java` | renamed: x3, o | p105y1/n.java [?] |
| `p102x3/C2661re.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2662s.java` | renamed: x3, a | p111z2/a.java [?]<br>p105y1/o.java [?]<br>p102x3/C2662s.java [?] |
| `p102x3/C2663s0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1... | p111z2/a.java [?] |
| `p102x3/C2664s1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-1.<anon... | p111z2/a.java [?] |
| `p102x3/C2665s2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-1.<ano... | p105y1/o.java [?] |
| `p102x3/C2666s3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-6.<anonymous> ... | p105y1/o.java [?] |
| `p102x3/C2668s5.java` | trace: com.notescrafter.ui.screens.WebStyleCTA.<anonymous> (GlobalHomeScreen.kt:432) renam... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2670s7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/EnumC2778z3.java [?]<br>p102x3/EnumC2614oe.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/C2672s9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2676sd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/t.java [?] |
| `p102x3/C2678t.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-1.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/C2678t.java [AboutUsScreen] |
| `p102x3/C2679t0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1... | p111z2/a.java [?] |
| `p102x3/C2685t6.java` | trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelection... | p105y1/o.java [?] |
| `p102x3/C2688t9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/C2692td.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2693te.java` | **[KNOWN]** StepItem data class (icon, title, subtitle, index) - LandingScreen.kt renamed:... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2694u.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-2.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?]<br>p102x3/C2694u.java [AboutUsScreen] |
| `p102x3/C2695u0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1... | p111z2/a.java [?] |
| `p102x3/C2696u1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-2.<anon... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2698u3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-8.<anonymous> ... | p105y1/o.java [?] |
| `p102x3/C2699u4.java` | renamed: x3, o | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?] |
| `p102x3/C2701u6.java` | trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous>.<anonymous>.<a... | p111z2/a.java [?] |
| `p102x3/C2702u7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/q.java [?]<br>p102x3/EnumC2778z3.java [?]<br>p102x3/EnumC2614oe.java [?] |
| `p102x3/C2704u9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p102x3/EnumC2677se.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/C2707uc.java` | trace: com.notescrafter.ui.screens.NativePDFPageSlider.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/z.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2708ud.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2711v0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1... | p111z2/a.java [?] |
| `p102x3/C2712v1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-3.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2713v2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-4.<ano... | p105y1/o.java [?] |
| `p102x3/C2717v6.java` | trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelection... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/EnumC2422ce.java [?] |
| `p102x3/C2718v7.java` | trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous> (PdfCompressS... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/EnumC2778z3.java [?] |
| `p102x3/C2719v8.java` | renamed: x3, A | p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2720v9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/j.java [?]<br>p102x3/EnumC2677se.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/C2721va.java` | renamed: x3, o | p105y1/o.java [?]<br>p102x3/EnumC2386aa.java [?] |
| `p102x3/C2724vd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?] |
| `p102x3/C2725ve.java` | renamed: x3, o | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?] |
| `p102x3/C2726w.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-1.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/C2726w.java [CommunityPassScreen] |
| `p102x3/C2727w0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-2... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2728w1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-4.<anon... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2729w2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-5.<ano... | p105y1/o.java [?] |
| `p102x3/C2733w6.java` | trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>... | p111z2/a.java [?] |
| `p102x3/C2734w7.java` | renamed: x3, o | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p102x3/C2735w8.java` | renamed: x3, o | p111z2/a.java [?]<br>p105y1/t.java [?] |
| `p102x3/C2737wa.java` | renamed: x3, o | ; related: ToDoItem | com/notescrafter/utils/ToDoItem.java [?] |
| `p102x3/C2739wc.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?] |
| `p102x3/C2740wd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2742x.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-2.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/C2742x.java [CommunityPassScreen] |
| `p102x3/C2743x0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-3... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2744x1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-5.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2746x3.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$UploadScreenKt.lambda-2.<anonymous... | p105y1/o.java [?] |
| `p102x3/C2747x4.java` | trace: com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous>.<a... | p111z2/a.java [?] |
| `p102x3/C2748x5.java` | trace: com.notescrafter.ui.screens.FAQCard.<anonymous>.<anonymous>.<anonymous> (HelpCenter... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2749x6.java` | trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>... | p111z2/a.java [?] |
| `p102x3/C2750x7.java` | renamed: x3, o | p105y1/t.java [?] |
| `p102x3/C2751x8.java` | renamed: x3, o | ; related: PDFProcessor; ReviewHelper ; ui: ReviewScreen | com/notescrafter/service/PDFProcessor.java [?]<br>com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/C2752x9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/C2755xc.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2756xd.java` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2759y0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-4... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2760y1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-6.<anon... | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2761y2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintMyOrdersScreenKt.lambda-1.<an... | p105y1/o.java [?] |
| `p102x3/C2763y4.java` | trace: com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous> (E... | p105y1/o.java [?] |
| `p102x3/C2764y5.java` | trace: com.notescrafter.ui.screens.FAQCard.<anonymous> (HelpCenterScreen.kt:340) renamed: ... | p105y1/o.java [?] |
| `p102x3/C2765y6.java` | trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/i.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/C2766y7.java` | renamed: x3, A | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p102x3/C2767y8.java` | trace: com.notescrafter.ui.screens.PdfInvertStepItem.<anonymous> (PdfInvertScreen.kt:996) ... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2768y9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous> (PdfSplitScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/C2769ya.java` | renamed: x3, o | p102x3/EnumC2386aa.java [?] |
| `p102x3/C2770yb.java` | renamed: x3, o | p105y1/o.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2771yc.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2772yd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous> (PrintOr... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?] |
| `p102x3/C2773ye.java` | trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?] |
| `p102x3/C2774z.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityScreenKt.lambda-1.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/C2774z.java [CommunityScreen] |
| `p102x3/C2775z0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-5... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2776z1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-7.<anon... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/C2779z4.java` | renamed: x3, o | ; related: NetworkUtils | com/notescrafter/utils/NetworkUtils.java [?] |
| `p102x3/C2780z5.java` | trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous> (H... | p111z2/i.java [?]<br>p102x3/AbstractC2376a0.java [?]<br>p102x3/AbstractC2649r2.java [?] |
| `p102x3/C2781z6.java` | trace: com.notescrafter.ui.screens.TinyControlIcon.<anonymous> (LogoSelectionScreen.kt:546... | p111z2/a.java [?] |
| `p102x3/C2784z9.java` | renamed: x3, o | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?] |
| `p102x3/C2785za.java` | renamed: x3, o | ; related: ToDoManager | com/notescrafter/utils/ToDoManager.java [?] |
| `p102x3/C2786zb.java` | trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous>.<anonymous> (P... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/C2787zc.java` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p105y1/m.java [?] |
| `p102x3/C2788zd.java` | trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous> (PrintOrderScreens.k... | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p109z0/l.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/C2789ze.java` | trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous> (SuccessScreen.kt... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/q.java [?] |
| `p102x3/C3.java` | trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (Co... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/o.java [?] |
| `p102x3/C4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/e.java [?] |
| `p102x3/C5.java` | trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous> (H... | p105y1/o.java [?]<br>p102x3/AbstractC2376a0.java [?] |
| `p102x3/C6.java` | renamed: a, b | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/C7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?] |
| `p102x3/C8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p102x3/AbstractC2648r1.java [?] |
| `p102x3/C9.java` | trace: com.notescrafter.ui.screens.PdfSplitScreen (PdfSplitScreen.kt:62); com.notescrafter... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?]<br>p102x3/EnumC2677se.java [?] |
| `p102x3/Ca.java` | trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?] |
| `p102x3/Cb.java` | trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous>.<anonymous> (P... | p105y1/o.java [?] |
| `p102x3/Cc.java` | trace: com.notescrafter.ui.screens.PdfSourcePickerDialog.<anonymous> (PrintOrderScreens.kt... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/Ce.java` | trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous> (Succ... | p105y1/o.java [?] |
| `p102x3/cf.java` | trace: com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:1... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2762y3.java [?] |
| `p102x3/D.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-2.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/D0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-9... | p111z2/a.java [?] |
| `p102x3/D1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-1.<anonymo... | p111z2/a.java [?] |
| `p102x3/D3.java` | trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (Co... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/D4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?] |
| `p102x3/D5.java` | trace: com.notescrafter.ui.screens.FAQCard (HelpCenterScreen.kt:334); com.notescrafter.ui.... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2292j.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2376a0.java [?]<br>p102x3/AbstractC2535k.java [CategoryChipItem]<br>p083t3/C2292j.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/C2503i.java [?] |
| `p102x3/D6.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/D7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/D8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Da.java` | renamed: o, r | ; related: ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?] |
| `p102x3/Db.java` | trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous> (PrintLandingScreen.kt:174... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2745x2.java [?] |
| `p102x3/Dc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?] |
| `p102x3/Dd.java` | renamed: o | p111z2/c.java [?] |
| `p102x3/De.java` | trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous> (SuccessScreen.kt... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/df.java` | trace: com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:2... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2762y3.java [?] |
| `p102x3/E.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-3.<anonym... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/E1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-2.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/E2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-15.<ano... | p105y1/o.java [?] |
| `p102x3/E3.java` | trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (Co... | p105y1/o.java [?] |
| `p102x3/E4.java` | **[KNOWN]** EnhanceScreen filter-toggle lambdas renamed: o | com/notescrafter/utils/AnalyticsManager.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/E5.java` | trace: com.notescrafter.ui.screens.InfoPageScreen.<anonymous>.<anonymous> (InfoPages.kt:35... | p105y1/o.java [?] |
| `p102x3/E7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/E8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2648r1.java [?] |
| `p102x3/Ea.java` | renamed: o, r | ; related: ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?] |
| `p102x3/Eb.java` | trace: com.notescrafter.ui.screens.PrintFaqAccordionItem.<anonymous> (PrintLandingScreen.k... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Ec.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/p.java [?]<br>p105y1/t.java [?]<br>p083t3/C2283e0.java [?]<br>p083t3/C2291i0.java [?]<br>p111z2/f.java [?]<br>p111z2/k.java [?]<br>p105y1/m.java [?]<br>p105y1/q.java [?] |
| `p102x3/Ed.java` | renamed: o | p111z2/c.java [?] |
| `p102x3/Ee.java` | trace: com.notescrafter.ui.screens.SizeInfo (SuccessScreen.kt:663); com.notescrafter.ui.sc... | p111z2/f.java [?]<br>p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2587n3.java [?] |
| `p102x3/ef.java` | trace: com.notescrafter.ui.screens.FeatureTile (UploadScreen.kt:344); com.notescrafter.ui.... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/t.java [?]<br>p102x3/C2391b.java [?] |
| `p102x3/EnumC2380a4.java` | renamed: x3, o | p102x3/EnumC2380a4.java [?] |
| `p102x3/EnumC2386aa.java` | renamed: x3, o | p102x3/EnumC2386aa.java [?] |
| `p102x3/EnumC2422ce.java` | renamed: x3, o | p102x3/EnumC2422ce.java [?] |
| `p102x3/EnumC2454ee.java` | renamed: x3, o | p102x3/EnumC2454ee.java [?] |
| `p102x3/EnumC2604o4.java` | renamed: x3, o | p102x3/EnumC2604o4.java [?] |
| `p102x3/EnumC2614oe.java` | renamed: x3, o | p102x3/EnumC2614oe.java [?] |
| `p102x3/EnumC2677se.java` | renamed: x3, o | p102x3/EnumC2677se.java [?] |
| `p102x3/EnumC2778z3.java` | renamed: x3, o | p102x3/EnumC2778z3.java [?] |
| `p102x3/F0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-1.<anon... | p111z2/a.java [?] |
| `p102x3/F1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-3.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/F2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-16.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/F3.java` | trace: com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339); com.notescr... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/F4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/F5.java` | trace: com.notescrafter.ui.screens.InfoPageScreen (InfoPages.kt:19) | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p102x3/C2407c.java [?] |
| `p102x3/F7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/F8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/F9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/Fa.java` | renamed: o, r | ; related: ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/p.java [?] |
| `p102x3/Fb.java` | trace: com.notescrafter.ui.screens.PrintFeatureCard.<anonymous> (PrintLandingScreen.kt:972... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Fc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Fd.java` | renamed: o, r | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>p105y1/n.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/c.java [?]<br>p083t3/C2281d0.java [?]<br>p105y1/m.java [?] |
| `p102x3/G.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-10.<anony... | p105y1/o.java [?] |
| `p102x3/G0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-2.<anon... | p105y1/o.java [?] |
| `p102x3/G1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-4.<anonymo... | p105y1/o.java [?] |
| `p102x3/G2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-17.<ano... | p105y1/o.java [?] |
| `p102x3/G3.java` | renamed: a, b | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/G4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/i.java [?]<br>p111z2/b.java [?] |
| `p102x3/G6.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/G7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/G8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/G9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Ga.java` | trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>... | com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2321y.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/Gb.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2277b0.java [?]<br>p083t3/C2308r0.java [?] |
| `p102x3/Gc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (Print... | com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/a.java [?] |
| `p102x3/Gd.java` | trace: com.notescrafter.ui.screens.A4CoverPage (PrintOrderScreens.kt:2164); com.notescraft... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/r.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2277b0.java [?]<br>p083t3/C2283e0.java [?]<br>p083t3/C2288h.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2294k.java [?]<br>p105y1/o.java [?]<br>... +11 more |
| `p102x3/H0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-3.<anon... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/H1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-5.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/H3.java` | renamed: a, b | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/H4.java` | **[KNOWN]** EnhanceScreen.kt anonymous (Remove Logo section, EnhanceScreen.kt:289) trace: ... | p105y1/o.java [?]<br>p111z2/f.java [?]<br>p111z2/i.java [?]<br>p111z2/b.java [?] |
| `p102x3/H7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/H8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Hb.java` | renamed: o | p111z2/h.java [?] |
| `p102x3/Hd.java` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/I.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-4.<anonym... | p105y1/o.java [?] |
| `p102x3/I0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-4.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/I1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-6.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/I3.java` | renamed: o, r | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?]<br>com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?] |
| `p102x3/I4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/I7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/I8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/I9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/Ib.java` | trace: com.notescrafter.ui.screens.PrintLandingScreen.<anonymous>.<anonymous>.<anonymous> ... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/h.java [?] |
| `p102x3/Ic.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/b.java [?]<br>p105y1/t.java [?] |
| `p102x3/Id.java` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/J.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-5.<anonym... | p111z2/a.java [?] |
| `p102x3/J0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-5.<anon... | p105y1/o.java [?]<br>p102x3/AbstractC2782z7.java [CompressStepItem] |
| `p102x3/J1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-7.<anonymo... | p111z2/a.java [?] |
| `p102x3/J2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-2.<anon... | p105y1/o.java [?] |
| `p102x3/J4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p111z2/e.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/J5.java` | renamed: o, r | p102x3/AbstractC2494h6.java [JpgToPdfScreen]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen]<br>p102x3/AbstractC2782z7.java [CompressStepItem]<br>p102x3/AbstractC2416c8.java [PdfCropScreen]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen]<br>p102x3/AbstractC2583n.java [CommunityPassScreen] |
| `p102x3/J6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?] |
| `p102x3/J9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/Ja.java` | trace: com.notescrafter.ui.screens.ControlButton (PomodoroTimerScreen.kt:602); com.notescr... | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/EnumC2386aa.java [?] |
| `p102x3/Jb.java` | trace: com.notescrafter.ui.screens.PrintReviewCard.<anonymous> (PrintLandingScreen.kt:1241... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Jc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p111z2/a.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p105y1/m.java [?] |
| `p102x3/Jd.java` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/K.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-6.<anonym... | p111z2/a.java [?] |
| `p102x3/K0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-6.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/K1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-8.<anonymo... | p105y1/o.java [?] |
| `p102x3/K3.java` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.... | p105y1/o.java [?] |
| `p102x3/K4.java` | renamed: o, r | p111z2/e.java [?]<br>p105y1/q.java [?] |
| `p102x3/K5.java` | renamed: o, r | ; related: ToDo list state (x3) | p102x3/AbstractC2494h6.java [JpgToPdfScreen]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen]<br>p102x3/AbstractC2782z7.java [CompressStepItem]<br>p102x3/AbstractC2416c8.java [PdfCropScreen]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/K6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/K7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/K8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/K9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?] |
| `p102x3/Ka.java` | renamed: o, r | p102x3/AbstractC2406be.java [ReorderScreen] |
| `p102x3/Kb.java` | trace: com.notescrafter.ui.screens.PrintStepCard.<anonymous> (PrintLandingScreen.kt:1066) ... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Kc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/m.java [?] |
| `p102x3/Kd.java` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen (PrintPriceCalculatorScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2288h.java [?]<br>p111z2/h.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2395b3.java [?]<br>p083t3/C2288h.java [?]<br>p102x3/C2487h.java [?]<br>p102x3/C2551l.java [?] |
| `p102x3/Ke.java` | trace: com.notescrafter.ui.screens.AnalogClock.<anonymous> (ToDoScreen.kt:852) renamed: o | p105y1/o.java [?] |
| `p102x3/L.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-7.<anonym... | p111z2/a.java [?] |
| `p102x3/L0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-7.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/L2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-21.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/L3.java` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.... | p105y1/o.java [?]<br>p111z2/j.java [?] |
| `p102x3/L4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/e.java [?] |
| `p102x3/L5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/L6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/L7.java` | renamed: o, r | p102x3/AbstractC2416c8.java [PdfCropScreen]<br>p102x3/AbstractC2783z8.java [PdfInvertScreen] |
| `p102x3/L8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/q.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2648r1.java [?] |
| `p102x3/L9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/Lb.java` | trace: com.notescrafter.ui.screens.PrintSupportSection.<anonymous>.<anonymous> (PrintLandi... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2745x2.java [?] |
| `p102x3/Lc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/Ld.java` | renamed: a, b | ; ui: PrintFlow | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/Le.java` | trace: com.notescrafter.ui.screens.ExamCardItem.<anonymous> (ToDoScreen.kt:529) renamed: o... | com/notescrafter/utils/ExamItem.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/M.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-8.<anonym... | p105y1/o.java [?] |
| `p102x3/M0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-8.<anon... | p111z2/a.java [?] |
| `p102x3/M1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-1.<anonymo... | p111z2/a.java [?] |
| `p102x3/M2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-22.<ano... | p111z2/b.java [?] |
| `p102x3/M3.java` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous> (DownloadsScreen.kt:316)... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/i.java [?] |
| `p102x3/M4.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2303o0.java [?]<br>p111z2/e.java [?] |
| `p102x3/M5.java` | renamed: o | p105y1/o.java [?] |
| `p102x3/M6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/M7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p111z2/a.java [?] |
| `p102x3/M8.java` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous> (PdfMergeScreen.kt:958) rena... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/M9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/Ma.java` | trace: com.notescrafter.ui.screens.PageThumbnail.<anonymous> (PreviewScreen.kt:615) rename... | p105y1/o.java [?]<br>p111z2/g.java [?] |
| `p102x3/Mb.java` | trace: com.notescrafter.ui.screens.UnifiedShippingAndEddCard.<anonymous> (PrintLandingScre... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Mc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/i.java [?]<br>p105y1/q.java [?] |
| `p102x3/Me.java` | trace: com.notescrafter.ui.screens.ManageExamsContent.<anonymous>.<anonymous> (ToDoScreen.... | p105y1/o.java [?] |
| `p102x3/N.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-9.<anonym... | p111z2/a.java [?] |
| `p102x3/N1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-10.<anonym... | p111z2/a.java [?] |
| `p102x3/N2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-23.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/N3.java` | renamed: o | ; related: ToDoItem | com/notescrafter/utils/ToDoItem.java [?]<br>p105y1/o.java [?] |
| `p102x3/N4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/e.java [?] |
| `p102x3/N5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/N6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/N7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p111z2/a.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/N8.java` | renamed: o | p105y1/p.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?] |
| `p102x3/N9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Na.java` | renamed: o, r | ; related: ExamItem ; ui: ExamScreen | com/notescrafter/utils/ExamItem.java [?]<br>p105y1/o.java [?]<br>p111z2/g.java [?] |
| `p102x3/Ne.java` | trace: com.notescrafter.ui.screens.TaskItemMinimal.<anonymous> (ToDoScreen.kt:659) renamed... | com/notescrafter/utils/ToDoItem.java [?]<br>p105y1/o.java [?]<br>p102x3/AbstractC2730w3.java [?] |
| `p102x3/O0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-1.<anonymou... | p111z2/a.java [?] |
| `p102x3/O1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-2.<anonymo... | p111z2/a.java [?] |
| `p102x3/O2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-24.<ano... | p105y1/o.java [?] |
| `p102x3/O5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/O7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/O8.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?] |
| `p102x3/O9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/Oa.java` | trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:109) rename... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2474g2.java [?] |
| `p102x3/Ob.java` | trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Oc.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p083t3/C2275a0.java [?]<br>p105y1/q.java [?] |
| `p102x3/Oe.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?] |
| `p102x3/P.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-1.<anonymo... | p111z2/a.java [?] |
| `p102x3/P0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-2.<anonymou... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/P1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-3.<anonymo... | p111z2/a.java [?] |
| `p102x3/P2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-3.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/P3.java` | renamed: o, r | p105y1/o.java [?] |
| `p102x3/P4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/e.java [?] |
| `p102x3/P5.java` | renamed: o | p109z0/l.java [?] |
| `p102x3/P6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/P7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p111z2/a.java [?] |
| `p102x3/P8.java` | renamed: o, r | ; related: PDFProcessor; ReviewHelper ; ui: ReviewScreen | com/notescrafter/service/PDFProcessor.java [?]<br>com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?] |
| `p102x3/P9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/Pa.java` | renamed: o, r | ; related: GlobalHomeScreen-adjacent (x3) | p111z2/g.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard] |
| `p102x3/Pb.java` | trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p102x3/AbstractC2745x2.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/Pc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?] |
| `p102x3/Pe.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2730w3.java [?] |
| `p102x3/Q.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-3.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Q0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-3.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Q1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-4.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Q3.java` | trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:91) ren... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/i.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/Q4.java` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous> (EnhanceScreen.kt... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/b.java [?]<br>p111z2/e.java [?]<br>p111z2/j.java [?]<br>p105y1/q.java [?]<br>p105y1/t.java [?] |
| `p102x3/Q5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/Q6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?] |
| `p102x3/Q7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?]<br>p111z2/a.java [?] |
| `p102x3/Q8.java` | trace: com.notescrafter.ui.screens.MergeStepItem (PdfMergeScreen.kt:1057); com.notescrafte... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p083t3/C2291i0.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2648r1.java [?] |
| `p102x3/Qa.java` | trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:169) rename... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/AbstractC2474g2.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/Qb.java` | trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous> (PrintLandingScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Qc.java` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java [?] |
| `p102x3/Qd.java` | trace: com.notescrafter.ui.screens.Particle (ProcessingScreen.kt:347); com.notescrafter.ui... | p105y1/r.java [?]<br>p111z2/d.java [?]<br>p105y1/t.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2443e3.java [?] |
| `p102x3/Qe.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p102x3/AbstractC2730w3.java [?] |
| `p102x3/r.java` | trace: com.notescrafter.ui.screens.CommunityScreen (CommunityScreen.kt:88); com.notescraft... | p105y1/r.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2292j.java [?]<br>p111z2/j.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2292j.java [?]<br>p102x3/C2599o.java [?]<br>p102x3/C2631q.java [SocialCard] |
| `p102x3/R0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-4.<anonymou... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/R1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-5.<anonymo... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/R2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-5.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/R3.java` | renamed: o, r | p111z2/h.java [?]<br>p105y1/o.java [?]<br>p111z2/f.java [?] |
| `p102x3/R4.java` | **[KNOWN]** LogoSelectionScreen confirm lambda (saves logoBox+logoShape, closes dialog) re... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/R5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/R9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/Ra.java` | trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:287) rename... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?]<br>p083t3/C2321y.java [?]<br>p102x3/AbstractC2474g2.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/Rb.java` | trace: com.notescrafter.ui.screens.AnimatedPromoBanner (PrintLandingScreen.kt:289); com.no... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/r.java [?]<br>p111z2/b.java [?]<br>p083t3/C2292j.java [?]<br>p111z2/j.java [?]<br>p105y1/o.java [?]<br>p111z2/g.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2745x2.java [?]<br>p083t3/C2292j.java [?]<br>p102x3/C2375a.java [?] |
| `p102x3/Rc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/Rd.java` | renamed: a, b | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p102x3/Re.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2730w3.java [?] |
| `p102x3/S.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-4.<anonymo... | p105y1/o.java [?] |
| `p102x3/S0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-5.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/S1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-6.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/S3.java` | trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:160) re... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/i.java [?] |
| `p102x3/S4.java` | **[KNOWN]** EnhanceScreen.kt:503 anonymous (opens LogoSelectionScreen with current logoBox... | p105y1/o.java [?]<br>p111z2/i.java [?]<br>p111z2/b.java [?] |
| `p102x3/S5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/S6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/S7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/o.java [?]<br>p105y1/q.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/S8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen] |
| `p102x3/S9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous> (PdfToJpgScreen.... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Sa.java` | trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:378) rename... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2474g2.java [?] |
| `p102x3/Sc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (Print... | com/notescrafter/PrintOrderViewModel.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Sd.java` | trace: com.notescrafter.ui.screens.QuickToolsScreen.<anonymous>.<anonymous>.<anonymous>.<a... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Se.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | com/notescrafter/utils/ExamItem.java [?]<br>p105y1/o.java [?] |
| `p102x3/T0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-6.<anonymou... | p105y1/o.java [?]<br>p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/T1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-7.<anonymo... | p105y1/o.java [?] |
| `p102x3/T2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-6.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/T4.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?] |
| `p102x3/T5.java` | renamed: o, r | p102x3/EnumC2386aa.java [?] |
| `p102x3/T6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/T7.java` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous> (PdfCropScreen.kt... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/T8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?] |
| `p102x3/T9.java` | renamed: o, r | ; ui: AddressScreen; SettingsScreen | p105y1/p.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/q.java [?] |
| `p102x3/Ta.java` | renamed: o, r | p111z2/g.java [?] |
| `p102x3/Tb.java` | renamed: o, r | p109z0/l.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Tc.java` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous> (PrintOrderScreens... | com/notescrafter/PrintOrderViewModel.java [?] |
| `p102x3/Td.java` | trace: com.notescrafter.ui.screens.ToolCard.<anonymous> (QuickToolsScreen.kt:162) renamed:... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?] |
| `p102x3/Te.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?]<br>p111z2/j.java [?] |
| `p102x3/U.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$EnhanceScreenKt.lambda-2.<anonymou... | p105y1/o.java [?] |
| `p102x3/U0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-7.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/U1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-8.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/U2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-7.<anon... | p111z2/a.java [?] |
| `p102x3/U3.java` | renamed: o, r | p105y1/m.java [?] |
| `p102x3/U4.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?] |
| `p102x3/U5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p111z2/a.java [?] |
| `p102x3/U6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2321y.java [?]<br>p111z2/a.java [?]<br>p083t3/C2321y.java [?] |
| `p102x3/U8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?] |
| `p102x3/Ua.java` | trace: com.notescrafter.ui.screens.PageThumbnail (PreviewScreen.kt:607); com.notescrafter.... | p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/b.java [?]<br>p111z2/g.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p105y1/q.java [?]<br>p105y1/t.java [?]<br>p102x3/AbstractC2474g2.java [?] |
| `p102x3/Ub.java` | trace: com.notescrafter.ui.screens.OrderCardItem.<anonymous>.<anonymous>.<anonymous> (Prin... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p109z0/l.java [?]<br>p105y1/n.java [?]<br>p105y1/p.java [?]<br>p105y1/s.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Ud.java` | trace: com.notescrafter.ui.screens.QuickToolsScreen (QuickToolsScreen.kt:62); com.notescra... | p105y1/o.java [?]<br>p083t3/C2292j.java [?]<br>p105y1/o.java [?]<br>p102x3/AbstractC2475g3.java [?]<br>p083t3/C2292j.java [?] |
| `p102x3/Ue.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | p105y1/o.java [?] |
| `p102x3/V0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-8.<anonymou... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/V1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-9.<anonymo... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/V2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-8.<anon... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/V3.java` | renamed: o | p105y1/p.java [?] |
| `p102x3/V4.java` | renamed: o | p111z2/g.java [?] |
| `p102x3/V5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p111z2/a.java [?] |
| `p102x3/V8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/j.java [?]<br>p111z2/a.java [?] |
| `p102x3/Va.java` | renamed: o | ; related: GlobalHomeScreen-adjacent (x3) | p105y1/o.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard] |
| `p102x3/Vb.java` | renamed: o | ; related: PrintOrderViewModel ; ui: PrintFlow | p105y1/t.java [?]<br>p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p083t3/C2301n0.java [?]<br>p083t3/C2308r0.java [?] |
| `p102x3/Vc.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p105y1/q.java [?] |
| `p102x3/Vd.java` | renamed: a, b | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Ve.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?] |
| `p102x3/W.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-1.<anony... | p111z2/a.java [?] |
| `p102x3/W0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-9.<anonymou... | p111z2/a.java [?] |
| `p102x3/W3.java` | renamed: o, r | p105y1/p.java [?]<br>p109z0/l.java [?] |
| `p102x3/W4.java` | renamed: o, r | p111z2/g.java [?] |
| `p102x3/W5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2552l0.java [?] |
| `p102x3/W6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p105y1/o.java [?]<br>p102x3/AbstractC2447e7.java [PdfAddPageNumbersScreen] |
| `p102x3/W8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2545k9.java [PdfOrganizeScreen] |
| `p102x3/W9.java` | renamed: o, r | p111z2/e.java [?] |
| `p102x3/Wd.java` | renamed: o | p105y1/o.java [?] |
| `p102x3/We.java` | trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymo... | com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p105y1/o.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2730w3.java [?] |
| `p102x3/X.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-2.<anony... | p111z2/a.java [?] |
| `p102x3/X1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-1.<an... | p111z2/a.java [?] |
| `p102x3/X3.java` | **[KNOWN]** DownloadsScreen.kt ("My Downloads", empty state, file list) trace: com.notescr... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2288h.java [?]<br>p111z2/i.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p083t3/C2288h.java [?]<br>p102x3/C2567m.java [?] |
| `p102x3/X4.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?] |
| `p102x3/X5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?] |
| `p102x3/X6.java` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous> (PdfAdd... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/X7.java` | renamed: A, B | p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/X8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p105y1/o.java [?]<br>p111z2/j.java [?] |
| `p102x3/X9.java` | renamed: A, o | ; related: ReviewHelper ; ui: ReviewScreen | com/notescrafter/utils/ReviewHelper.java [?]<br>p111z2/e.java [?] |
| `p102x3/Xa.java` | renamed: o, r | ; related: GlobalHomeScreen-adjacent (x3); PrintOrderViewModel ; ui: Print... | com/notescrafter/PrintOrderViewModel.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Xb.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Xe.java` | renamed: o, r | ; related: ToDoItem; ToDoManager | com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p105y1/p.java [?] |
| `p102x3/Y.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-3.<anony... | p111z2/a.java [?] |
| `p102x3/Y0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-1.<anonym... | p111z2/a.java [?] |
| `p102x3/Y1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-2.<an... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/a.java [?]<br>p102x3/AbstractC2642qa.java [PomodoroStepItem] |
| `p102x3/Y4.java` | renamed: o, r | ; related: PDFProcessor | com/notescrafter/service/PDFProcessor.java [?]<br>p111z2/b.java [?] |
| `p102x3/Y5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/Y7.java` | renamed: o, r | p102x3/AbstractC2416c8.java [PdfCropScreen] |
| `p102x3/Y9.java` | trace: com.notescrafter.ui.screens.PdfToJpgStepItem.<anonymous> (PdfToJpgScreen.kt:1033) r... | p105y1/o.java [?]<br>p111z2/b.java [?] |
| `p102x3/Yb.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p111z2/a.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/j.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Yc.java` | trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anony... | p105y1/o.java [?]<br>p111z2/d.java [?]<br>p111z2/b.java [?]<br>p105y1/t.java [?] |
| `p102x3/Yd.java` | trace: com.notescrafter.ui.screens.ReorderScreen.<anonymous> (ReorderScreen.kt:67) renamed... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p111z2/f.java [?]<br>p102x3/AbstractC2539k3.java [?] |
| `p102x3/Ye.java` | trace: com.notescrafter.ui.screens.AnalogClock (ToDoScreen.kt:841); com.notescrafter.ui.sc... | com/notescrafter/utils/ExamItem.java [?]<br>com/notescrafter/utils/ToDoItem.java [?]<br>com/notescrafter/utils/ToDoManager.java [?]<br>p111z2/b.java [?]<br>p083t3/C2306q.java [?]<br>p111z2/j.java [?]<br>p105y1/n.java [?]<br>p102x3/AbstractC2730w3.java [?]<br>p083t3/C2306q.java [?]<br>p102x3/C2375a.java [?] |
| `p102x3/Z.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-4.<anony... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Z0.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-2.<anonym... | p105y1/o.java [?]<br>p111z2/a.java [?] |
| `p102x3/Z1.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-3.<an... | p105y1/o.java [?] |
| `p102x3/Z2.java` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintPriceCalculatorScreenKt.lambd... | p105y1/o.java [?] |
| `p102x3/Z4.java` | **[KNOWN]** EnhanceScreen.kt composables (SectionTitle:540, FilterToggle:592, DropdownSele... | com/notescrafter/service/PDFProcessor.java [?]<br>p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2294k.java [?]<br>p111z2/i.java [?]<br>p111z2/g.java [?]<br>p083t3/C2290i.java [?]<br>p083t3/C2294k.java [?]<br>p102x3/C2519j.java [?] |
| `p102x3/Z5.java` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p083t3/C2290i.java [?]<br>p111z2/a.java [?]<br>p083t3/C2290i.java [?] |
| `p102x3/Z7.java` | renamed: A, B | p111z2/e.java [?] |
| `p102x3/Z8.java` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p111z2/a.java [?] |
| `p102x3/Z9.java` | trace: com.notescrafter.ui.screens.PdfToJpgScreen (PdfToJpgScreen.kt:73); com.notescrafter... | p105y1/o.java [?]<br>p109z0/l.java [?]<br>p111z2/b.java [?]<br>p105y1/n.java [?] |
| `p102x3/Za.java` | renamed: o, r | ; related: GlobalHomeScreen-adjacent (x3); LogoSelectionScreen confirm lam... | p105y1/q.java [?]<br>com/notescrafter/PrintOrderViewModel.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p083t3/C2306q.java [?]<br>p102x3/N0.java [?]<br>p102x3/P0.java [PdfCropScreen]<br>p105y1/q.java [?]<br>p105y1/v.java [?]<br>p102x3/AbstractC2595nb.java [AddressCard]<br>p102x3/AbstractC2565ld.java [?]<br>p083t3/C2306q.java [?] |
| `p102x3/Zb.java` | trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>... | p105y1/o.java [?]<br>p111z2/b.java [?]<br>p102x3/AbstractC2452ec.java [OrderCardItem] |
| `p102x3/Zd.java` | renamed: o, r | p111z2/f.java [?] |
| `p102x3/Ze.java` | renamed: a, b | p111z2/a.java [?]<br>p105y1/o.java [?] |
| `p103y/b.java` | renamed: a | p105y1/n.java [?] |
| `p104y0/m.java` | renamed: o, a | p102x3/Ke.java [AnalogClock]<br>p102x3/Rd.java [?]<br>p102x3/Sd.java [QuickToolsScreen]<br>p111z2/c.java [?]<br>p111z2/h.java [?] |
| `p104y0/o.java` | renamed: c | p111z2/a.java [?]<br>p111z2/g.java [?] |
| `p104y0/p.java` |  | p111z2/g.java [?] |
| `p104y0/q.java` |  | p111z2/g.java [?] |
| `p104y0/t.java` | renamed: a | p111z2/a.java [?] |
| `p105y1/A.java` | renamed: a, b | p102x3/S6.java [PdfAddPageNumbersScreen]<br>p111z2/k.java [?] |
| `p105y1/BinderC2797h.java` | renamed: y1, o | p090v1/AbstractBinderC2337b0.java [?]<br>p102x3/T0.java [PdfCropScreen]<br>p090v1/InterfaceC2341d0.java [?]<br>p105y1/C2799j.java [?] |
| `p105y1/C.java` |  | p111z2/k.java [?] |
| `p105y1/C2790a.java` | renamed: y1, a | p105y1/C2790a.java [?] |
| `p105y1/C2796g.java` | renamed: y1, a | ; ui: HistoryScreen | p111z2/a.java [?]<br>p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/RunnableC2791b.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/C2796g.java [?]<br>p105y1/C2799j.java [?] |
| `p105y1/C2799j.java` | renamed: y1, a | p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/RunnableC2798i.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/C2799j.java [?] |
| `p105y1/C2800k.java` | renamed: y1, r | p102x3/G3.java [?]<br>p102x3/I3.java [?]<br>p102x3/L3.java [DownloadedFileItem]<br>p102x3/P4.java [EnhanceScreen]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/C2800k.java [?] |
| `p105y1/D.java` | renamed: b, d | p102x3/O7.java [PdfCropScreen]<br>p102x3/P5.java [?]<br>p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p105y1/DialogInterfaceOnClickListenerC2794e.java` | renamed: y1, a | p111z2/k.java [?]<br>p105y1/RunnableC2798i.java [?]<br>p105y1/C2796g.java [?] |
| `p105y1/F.java` | renamed: l, h | ; ui: SettingsScreen | p105y1/r.java [?]<br>p111z2/a.java [?]<br>p102x3/F7.java [PdfCropScreen]<br>p111z2/c.java [?]<br>p111z2/e.java [?]<br>p111z2/k.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2362o.java [?]<br>p090v1/C2366q.java [?] |
| `p105y1/G.java` |  | p111z2/k.java [?] |
| `p105y1/H.java` |  | p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p111z2/i.java [?]<br>p090v1/C2366q.java [?] |
| `p105y1/J.java` |  | p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p105y1/K.java` |  | p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p105y1/m.java` | renamed: o | p111z2/g.java [?] |
| `p105y1/n.java` |  | p111z2/a.java [?] |
| `p105y1/p.java` | renamed: a, b | p111z2/e.java [?] |
| `p105y1/q.java` | renamed: A, B | p111z2/e.java [?]<br>p102x3/G3.java [?]<br>p102x3/I3.java [?]<br>p111z2/c.java [?] |
| `p105y1/RunnableC2791b.java` | renamed: y1, o | p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/RunnableC2791b.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/C2796g.java [?]<br>p105y1/C2799j.java [?] |
| `p105y1/RunnableC2798i.java` | renamed: y1, o | p111z2/k.java [?]<br>p105y1/RunnableC2798i.java [?] |
| `p105y1/s.java` | renamed: A, B | p111z2/e.java [?]<br>p102x3/G3.java [?]<br>p102x3/I3.java [?]<br>p090v1/C2358m.java [?]<br>p109z0/l.java [?]<br>p090v1/C2358m.java [?] |
| `p105y1/t.java` | renamed: a, b | p102x3/J3.java [?]<br>p102x3/P4.java [EnhanceScreen]<br>p102x3/T3.java [?]<br>p111z2/c.java [?]<br>p102x3/H1.java [PdfSplitScreen]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2358m.java [?]<br>p090v1/C2366q.java [?]<br>p105y1/C2800k.java [?] |
| `p105y1/u.java` |  | p111z2/a.java [?] |
| `p105y1/v.java` |  | p111z2/a.java [?] |
| `p105y1/w.java` | renamed: b, c | p082t2/AbstractC2252o0.java [?]<br>p111z2/k.java [?]<br>p082t2/AbstractC2252o0.java [?] |
| `p105y1/y.java` | renamed: a, b | p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p106y2/a.java` | renamed: a, b | p111z2/g.java [?] |
| `p106y2/b.java` | renamed: c | p105y1/o.java [?] |
| `p107y3/b.java` | **[KNOWN]** NotesCrafterTheme (dark theme wrapper) trace: com.notescrafter.ui.theme.NotesC... | p105y1/o.java [?]<br>p102x3/C2445e5.java [?] |
| `p108z/c.java` | renamed: a | p105y1/r.java [?]<br>p111z2/a.java [?] |
| `p108z/d.java` | renamed: a, b | p111z2/g.java [?]<br>p111z2/a.java [?] |
| `p108z/k.java` | renamed: a | p047l/C2191w.java [?]<br>p047l/C2191w.java [?] |
| `p108z/l.java` | renamed: k, a | p111z2/a.java [?] |
| `p109z0/b.java` | renamed: z, r | p111z2/a.java [?]<br>p111z2/e.java [?]<br>p111z2/g.java [?]<br>p111z2/i.java [?]<br>p105y1/m.java [?] |
| `p109z0/d.java` | renamed: a | p111z2/b.java [?]<br>p105y1/m.java [?] |
| `p109z0/e.java` | renamed: f, a | p111z2/d.java [?]<br>p105y1/m.java [?]<br>p105y1/n.java [?] |
| `p109z0/g.java` | renamed: c | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p109z0/h.java` | renamed: c, d | p111z2/a.java [?]<br>p111z2/b.java [?] |
| `p109z0/j.java` | renamed: a, b | p105y1/m.java [?] |
| `p109z0/k.java` | renamed: j, k | p105y1/r.java [?]<br>p109z0/l.java [?]<br>p111z2/a.java [?]<br>p111z2/e.java [?]<br>p111z2/h.java [?]<br>p111z2/g.java [?]<br>p111z2/b.java [?]<br>p105y1/m.java [?] |
| `p109z0/l.java` | renamed: H, A | ; ui: SettingsScreen | p111z2/a.java [?]<br>p111z2/e.java [?]<br>p111z2/h.java [?]<br>p111z2/f.java [?]<br>p102x3/U0.java [PdfCropScreen]<br>p102x3/S2.java [?]<br>p105y1/m.java [?]<br>p105y1/s.java [?] |
| `p110z1/a.java` |  | p102x3/S9.java [PdfToJpgScreen]<br>p102x3/U7.java [?]<br>p111z2/d.java [?]<br>p090v1/C2366q.java [?]<br>p090v1/C2366q.java [?] |
| `p110z1/b.java` |  | p105y1/p.java [?] |
| `p111z2/b.java` | renamed: a | p105y1/p.java [?]<br>p105y1/u.java [?]<br>p105y1/o.java [?]<br>p111z2/g.java [?]<br>p111z2/k.java [?]<br>p090v1/C2366q.java [?]<br>p102x3/S2.java [?]<br>p111z2/d.java [?]<br>p111z2/e.java [?]<br>p105y1/w.java [?]<br>p090v1/C2366q.java [?] |
| `p111z2/d.java` | renamed: a, b | p111z2/a.java [?]<br>p111z2/i.java [?]<br>p105y1/o.java [?] |
| `p111z2/e.java` | renamed: o, a | p111z2/c.java [?]<br>p111z2/b.java [?] |
| `p111z2/f.java` | renamed: r, s | p111z2/i.java [?] |
| `p111z2/h.java` |  | p111z2/i.java [?] |

## 3. Class -> who uses it (reverse)

| class | label | used by |
|---|---|---|
| `a` | renamed: a, b | com/notescrafter/MainActivity.java<br>com/notescrafter/utils/ExamItem.java<br>com/notescrafter/utils/ToDoItem.java<br>p003a2/b.java<br>p007b1/c.java<br>p009b3/c.java<br>p010c/C0689b.java<br>p010c/k.java<br>p012c1/d.java<br>p013c2/e.java<br>p014c3/b.java<br>p015d/g.java<br>p015d/m.java<br>p015d/n.java<br>p017d1/h.java<br>... +297 more |
| `A0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-6... | p082t2/C2243k.java<br>p082t2/Y.java |
| `A2` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-1.<anon... | p090v1/u0.java |
| `A3` | renamed: o, r | p082t2/C2272z.java<br>p083t3/C2290i.java |
| `A4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/C.java<br>p082t2/j1.java |
| `A6` | **[KNOWN]** LogoSelectionScreen.kt (LogoSelectionScreen:80, LogoSelectionOverlay:422, Shap... | p083t3/C2292j.java |
| `AbstractBinderC2337b0` | renamed: v1 | p105y1/BinderC2797h.java |
| `AbstractC2144l` | renamed: g2 | p028g2/AbstractC2144l.java<br>p028g2/C2141i.java<br>p028g2/C2142j.java<br>p028g2/C2143k.java |
| `AbstractC2176g` | renamed: l, a | p047l/AbstractC2176g.java<br>p047l/C2192x.java |
| `AbstractC2177h` | renamed: l, a | p047l/AbstractC2177h.java |
| `AbstractC2178i` | renamed: l, a | p047l/AbstractC2177h.java<br>p047l/AbstractC2178i.java<br>p047l/F.java |
| `AbstractC2180k` | renamed: l, a | p047l/AbstractC2180k.java<br>p047l/C2194z.java |
| `AbstractC2181l` | renamed: l, a | p047l/AbstractC2181l.java |
| `AbstractC2182m` | renamed: l, a | p047l/A.java<br>p047l/AbstractC2182m.java |
| `AbstractC2183n` | renamed: l, a | p047l/AbstractC2183n.java |
| `AbstractC2184o` | renamed: l, a | p047l/A.java<br>p047l/AbstractC2181l.java<br>p047l/AbstractC2184o.java<br>p047l/B.java<br>p047l/C.java<br>p047l/C2193y.java<br>p047l/C2194z.java<br>p047l/G.java |
| `AbstractC2185p` | renamed: l, a | p047l/AbstractC2185p.java<br>p047l/C.java |
| `AbstractC2186q` | renamed: l, a | p047l/AbstractC2186q.java |
| `AbstractC2187s` | renamed: l, a | p047l/AbstractC2187s.java |
| `AbstractC2188t` | renamed: l, a | p047l/AbstractC2188t.java<br>p047l/C.java<br>p047l/D.java<br>p047l/E.java<br>p047l/I.java |
| `AbstractC2190v` | renamed: l, a | p030h/b.java<br>p047l/AbstractC2190v.java<br>p047l/C2175f.java<br>p047l/C2189u.java<br>p047l/H.java<br>p047l/Z.java |
| `AbstractC2198a` | renamed: o2, b | p028g2/C2142j.java<br>p028g2/C2154w.java<br>p028g2/H.java<br>p028g2/Q.java<br>p064o2/AbstractC2198a.java<br>p064o2/AbstractC2210m.java<br>p064o2/AbstractC2211n.java<br>p064o2/AbstractC2212o.java<br>p064o2/b0.java<br>p064o2/C2203f.java<br>p064o2/C2206i.java<br>p064o2/C2208k.java<br>p064o2/C2209l.java<br>p064o2/C2215s.java<br>p064o2/C2221y.java<br>... +6 more |
| `AbstractC2201d` | renamed: o2 | p028g2/C2153v.java<br>p064o2/AbstractC2201d.java<br>p064o2/C2199b.java<br>p064o2/C2202e.java |
| `AbstractC2205h` | renamed: o2, o | p064o2/AbstractC2205h.java<br>p064o2/AbstractC2210m.java<br>p064o2/AbstractC2212o.java<br>p064o2/C2209l.java<br>p064o2/C2221y.java<br>p064o2/C2222z.java<br>p064o2/D.java<br>p064o2/r.java |
| `AbstractC2207j` | renamed: o2, a | p024f2/b.java<br>p064o2/AbstractC2207j.java |
| `AbstractC2210m` | renamed: o2, r | p064o2/AbstractC2198a.java<br>p064o2/AbstractC2210m.java<br>p064o2/AbstractC2212o.java<br>p064o2/AbstractC2216t.java<br>p064o2/C2206i.java<br>p064o2/C2208k.java<br>p064o2/C2209l.java<br>p064o2/C2214q.java<br>p064o2/C2215s.java<br>p064o2/C2221y.java<br>p064o2/C2222z.java<br>p064o2/D.java<br>p064o2/r.java |
| `AbstractC2211n` | renamed: o2, o | p064o2/AbstractC2211n.java<br>p064o2/C2215s.java |
| `AbstractC2212o` | renamed: o2 | p028g2/C2154w.java<br>p064o2/AbstractC2198a.java<br>p064o2/AbstractC2211n.java<br>p064o2/AbstractC2212o.java<br>p064o2/AbstractC2216t.java<br>p064o2/C2222z.java<br>p064o2/D.java<br>p064o2/m0.java<br>p064o2/p0.java<br>p064o2/r.java |
| `AbstractC2216t` | renamed: o2, r | p064o2/AbstractC2198a.java<br>p064o2/AbstractC2216t.java<br>p064o2/C2215s.java |
| `AbstractC2220x` | renamed: o2 | p064o2/AbstractC2220x.java<br>p064o2/B.java<br>p064o2/C.java<br>p064o2/C2204g.java<br>p064o2/C2215s.java<br>p064o2/C2219w.java |
| `AbstractC2224a0` | renamed: t2, a | p082t2/AbstractC2224a0.java<br>p082t2/Y.java |
| `AbstractC2249n` | renamed: t2, d | p082t2/AbstractC2249n.java<br>p082t2/B0.java<br>p082t2/b1.java<br>p082t2/e1.java<br>p082t2/N0.java |
| `AbstractC2250n0` | renamed: t2, b | p082t2/AbstractC2250n0.java<br>p082t2/C2226b0.java<br>p082t2/C2236g0.java<br>p082t2/C2255q.java<br>p082t2/L.java<br>p082t2/n1.java<br>p082t2/U.java |
| `AbstractC2252o0` | renamed: t2, a | p082t2/AbstractC2250n0.java<br>p082t2/AbstractC2252o0.java<br>p082t2/C2226b0.java<br>p082t2/C2235g.java<br>p082t2/C2236g0.java<br>p082t2/C2247m.java<br>p082t2/f1.java<br>p105y1/w.java |
| `AbstractC2261t0` | renamed: t2, a | p082t2/AbstractC2261t0.java<br>p082t2/C2236g0.java<br>p082t2/C2247m.java<br>p082t2/C2267w0.java<br>p082t2/F.java<br>p082t2/j1.java<br>p082t2/K.java<br>p082t2/n1.java<br>p082t2/P.java<br>p082t2/Y.java |
| `AbstractC2268x` | renamed: t2, A | p042j3/c.java<br>p082t2/A.java<br>p082t2/AbstractC2268x.java<br>p082t2/C.java<br>p082t2/C2227c.java<br>p082t2/C2233f.java<br>p082t2/C2235g.java<br>p082t2/C2236g0.java<br>p082t2/C2243k.java<br>p082t2/C2267w0.java<br>p082t2/C2272z.java<br>p082t2/E0.java<br>p082t2/F.java<br>p082t2/F0.java<br>p082t2/G0.java<br>... +14 more |
| `AbstractC2278c` | renamed: t3, a | ; related: MainActivity.lambda-1 (MainActivity.kt:1107); MainActivity.lam... | p083t3/AbstractC2278c.java<br>p083t3/S.java |
| `AbstractC2360n` | renamed: v1, a | p090v1/AbstractC2360n.java<br>p090v1/C2336b.java<br>p090v1/C2338c.java<br>p090v1/C2340d.java<br>p090v1/C2342e.java<br>p090v1/C2344f.java<br>p090v1/C2346g.java<br>p090v1/C2348h.java<br>p090v1/C2350i.java<br>p090v1/C2352j.java<br>p090v1/C2354k.java<br>p090v1/C2356l.java |
| `AbstractC2376a0` | renamed: x3, a | p102x3/AbstractC2376a0.java<br>p102x3/C2780z5.java<br>p102x3/C5.java<br>p102x3/D5.java |
| `AbstractC2378a2` | renamed: x3, a | p102x3/AbstractC2378a2.java<br>p102x3/C2450ea.java<br>p102x3/C2463f7.java |
| `AbstractC2395b3` | renamed: x3, a | p102x3/AbstractC2395b3.java<br>p102x3/Kd.java |
| `AbstractC2397b5` | trace: com.notescrafter.ui.screens.ErrorScreen (ErrorScreen.kt:23) renamed: x3 | p083t3/L.java<br>p097w3/a.java<br>p102x3/AbstractC2397b5.java |
| `AbstractC2406be` | trace: com.notescrafter.ui.screens.ReorderScreen (ReorderScreen.kt:50); com.notescrafter.u... | p083t3/L.java<br>p102x3/AbstractC2406be.java<br>p102x3/C2417c9.java<br>p102x3/Ka.java |
| `AbstractC2416c8` | trace: com.notescrafter.ui.screens.PdfCropScreen (PdfCropScreen.kt:64); com.notescrafter.u... | p083t3/L.java<br>p102x3/AbstractC2416c8.java<br>p102x3/B7.java<br>p102x3/C2384a8.java<br>p102x3/D7.java<br>p102x3/H7.java<br>p102x3/J5.java<br>p102x3/K5.java<br>p102x3/L7.java<br>p102x3/N7.java<br>p102x3/O7.java<br>p102x3/S7.java<br>p102x3/T0.java<br>p102x3/X7.java<br>p102x3/Y7.java |
| `AbstractC2443e3` | renamed: x3, a | p102x3/AbstractC2443e3.java<br>p102x3/Qd.java |
| `AbstractC2447e7` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen (PdfAddPageNumbersScreen.kt:74)... | p083t3/L.java<br>p102x3/A0.java<br>p102x3/AbstractC2447e7.java<br>p102x3/C2383a7.java<br>p102x3/J5.java<br>p102x3/K5.java<br>p102x3/K6.java<br>p102x3/P6.java<br>p102x3/W6.java |
| `AbstractC2452ec` | trace: com.notescrafter.ui.screens.OrderCardItem (PrintMyOrdersScreen.kt:560); com.notescr... | p083t3/L.java<br>p102x3/AbstractC2452ec.java<br>p102x3/Bb.java<br>p102x3/C2388ac.java<br>p102x3/C2404bc.java<br>p102x3/C2417c9.java<br>p102x3/C2420cc.java<br>p102x3/C2436dc.java<br>p102x3/C2519j.java<br>p102x3/Tb.java<br>p102x3/Ub.java<br>p102x3/Xa.java<br>p102x3/Xb.java<br>p102x3/Yb.java<br>p102x3/Zb.java |
| `AbstractC2469fd` | renamed: x3, a | p102x3/AbstractC2469fd.java<br>p102x3/C2485gd.java |
| `AbstractC2471g` | trace: com.notescrafter.ui.screens.AboutUsScreen (AboutUsScreen.kt:26); com.notescrafter.u... | p083t3/L.java<br>p102x3/AbstractC2471g.java<br>p102x3/C2375a.java<br>p102x3/C2391b.java<br>p102x3/C2407c.java |
| `AbstractC2474g2` | renamed: x3, a | p102x3/AbstractC2474g2.java<br>p102x3/Oa.java<br>p102x3/Qa.java<br>p102x3/Ra.java<br>p102x3/Sa.java<br>p102x3/Ua.java |
| `AbstractC2475g3` | renamed: x3, a | p102x3/AbstractC2475g3.java<br>p102x3/Ud.java |
| `AbstractC2489h1` | renamed: x3, a | p102x3/AbstractC2489h1.java<br>p102x3/AbstractC2783z8.java<br>p102x3/C2448e8.java<br>p102x3/C2457f1.java<br>p102x3/C2464f8.java<br>p102x3/C2480g8.java<br>p102x3/C2528j8.java |
| `AbstractC2493h5` | trace: com.notescrafter.ui.screens.FeatureCard (FeaturesScreen.kt:83); com.notescrafter.ui... | p083t3/L.java<br>p102x3/AbstractC2493h5.java<br>p102x3/C2375a.java<br>p102x3/C2445e5.java<br>p102x3/C2477g5.java |
| `AbstractC2494h6` | trace: com.notescrafter.ui.screens.JpgToPdfScreen (JpgToPdfScreen.kt:74); com.notescrafter... | p083t3/L.java<br>p102x3/AbstractC2494h6.java<br>p102x3/C2488h0.java<br>p102x3/J5.java<br>p102x3/K5.java |
| `AbstractC2535k` | trace: com.notescrafter.ui.screens.CategoryChipItem (CategoryChipItem.kt:32) renamed: x3 | p102x3/AbstractC2535k.java<br>p102x3/C2519j.java<br>p102x3/D5.java |
| `AbstractC2539k3` | renamed: x3, a | p102x3/AbstractC2406be.java<br>p102x3/AbstractC2539k3.java<br>p102x3/Yd.java |
| `AbstractC2545k9` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen (PdfOrganizeScreen.kt:72); com.notesc... | p083t3/L.java<br>p102x3/AbstractC2545k9.java<br>p102x3/C2465f9.java<br>p102x3/C2513i9.java<br>p102x3/J5.java<br>p102x3/K5.java<br>p102x3/S8.java<br>p102x3/W8.java |
| `AbstractC2552l0` | renamed: x3, a | p102x3/AbstractC2494h6.java<br>p102x3/AbstractC2552l0.java<br>p102x3/C2520j0.java<br>p102x3/L5.java<br>p102x3/N5.java<br>p102x3/O5.java<br>p102x3/W5.java |
| `AbstractC2565ld` | renamed: x3, a | p102x3/AbstractC2565ld.java<br>p102x3/Za.java |
| `AbstractC2574m6` | **[KNOWN]** LandingScreen.kt (LandingScreen, AIBadge, FeatureCard, FeaturesSection, HowItW... | p083t3/C2292j.java<br>p083t3/L.java<br>p102x3/AbstractC2574m6.java<br>p102x3/C2445e5.java<br>p102x3/C2526j6.java<br>p102x3/C2599o.java |
| `AbstractC2583n` | trace: com.notescrafter.ui.screens.CommunityPassScreen (CommunityPassScreen.kt:149); com.n... | p083t3/C2292j.java<br>p083t3/L.java<br>p102x3/AbstractC2583n.java<br>p102x3/C2567m.java<br>p102x3/J5.java |
| `AbstractC2587n3` | renamed: x3, a | p102x3/AbstractC2587n3.java<br>p102x3/Ee.java |
| `AbstractC2588n4` | trace: com.notescrafter.ui.screens.EditPageScreen (EditPageScreen.kt:66); com.notescrafter... | p083t3/C2294k.java<br>p083t3/L.java<br>p102x3/AbstractC2588n4.java<br>p102x3/C2444e4.java<br>p102x3/C2476g4.java<br>p102x3/C2524j4.java |
| `AbstractC2595nb` | trace: com.notescrafter.ui.screens.AddressCard (PrintAddressesScreen.kt:575); com.notescra... | p083t3/C2294k.java<br>p083t3/C2306q.java<br>p083t3/L.java<br>p102x3/AbstractC2595nb.java<br>p102x3/C2467fb.java<br>p102x3/C2567m.java<br>p102x3/Pa.java<br>p102x3/Va.java<br>p102x3/Xa.java<br>p102x3/Za.java |
| `AbstractC2598ne` | trace: com.notescrafter.ui.screens.SettingsItem (SettingsScreen.kt:580); com.notescrafter.... | p083t3/L.java<br>p097w3/a.java<br>p102x3/AbstractC2598ne.java<br>p102x3/C2486ge.java<br>p102x3/C2534je.java<br>p102x3/C2550ke.java<br>p102x3/C2566le.java |
| `AbstractC2616p0` | renamed: x3, a | p003a2/a.java<br>p102x3/AbstractC2616p0.java<br>p102x3/C2606o6.java |
| `AbstractC2642qa` | trace: com.notescrafter.ui.screens.PomodoroStepItem (PomodoroSetupScreen.kt:670); com.note... | p083t3/C2306q.java<br>p083t3/C2321y.java<br>p083t3/F.java<br>p083t3/L.java<br>p102x3/AbstractC2642qa.java<br>p102x3/C2434da.java<br>p102x3/C2466fa.java<br>p102x3/C2514ia.java<br>p102x3/C2519j.java<br>p102x3/C2546ka.java<br>p102x3/C2562la.java<br>p102x3/C2578ma.java<br>p102x3/C2594na.java<br>p102x3/K5.java<br>p102x3/Y1.java |
| `AbstractC2647r0` | renamed: x3, a | p102x3/A6.java<br>p102x3/AbstractC2647r0.java |
| `AbstractC2648r1` | renamed: x3, a | p102x3/AbstractC2648r1.java<br>p102x3/C2601o1.java<br>p102x3/C8.java<br>p102x3/E8.java<br>p102x3/L8.java<br>p102x3/Q8.java |
| `AbstractC2649r2` | renamed: x3, a | p102x3/AbstractC2595nb.java<br>p102x3/AbstractC2649r2.java<br>p102x3/C2467fb.java<br>p102x3/C2563lb.java<br>p102x3/C2579mb.java<br>p102x3/C2780z5.java |
| `AbstractC2684t5` | **[KNOWN]** GlobalHomeScreen.kt (hero + FLOW/PRINTS/TOOLS cards) trace: com.notescrafter.u... | p083t3/C2294k.java<br>p083t3/L.java<br>p097w3/a.java<br>p102x3/AbstractC2684t5.java<br>p102x3/C2509i5.java<br>p102x3/C2525j5.java<br>p102x3/C2557l5.java<br>p102x3/C2567m.java<br>p102x3/C2621p5.java<br>p102x3/C2637q5.java |
| `AbstractC2710v` | renamed: x3, a | p102x3/AbstractC2471g.java<br>p102x3/AbstractC2710v.java |
| `AbstractC2730w3` | renamed: x3, a | p102x3/AbstractC2730w3.java<br>p102x3/Ne.java<br>p102x3/Pe.java<br>p102x3/Qe.java<br>p102x3/Re.java<br>p102x3/We.java<br>p102x3/Ye.java |
| `AbstractC2745x2` | renamed: x3, a | p102x3/AbstractC2745x2.java<br>p102x3/Db.java<br>p102x3/Lb.java<br>p102x3/Pb.java<br>p102x3/Rb.java |
| `AbstractC2758y` | renamed: x3, a | p102x3/AbstractC2583n.java<br>p102x3/AbstractC2758y.java |
| `AbstractC2762y3` | renamed: x3, a | p102x3/AbstractC2762y3.java<br>p102x3/cf.java<br>p102x3/df.java |
| `AbstractC2777z2` | renamed: x3, a | p102x3/AbstractC2777z2.java<br>p102x3/C2436dc.java |
| `AbstractC2782z7` | trace: com.notescrafter.ui.screens.CompressStepItem (PdfCompressScreen.kt:1154); com.notes... | p083t3/L.java<br>p102x3/AbstractC2782z7.java<br>p102x3/C2559l7.java<br>p102x3/C2623p7.java<br>p102x3/J0.java<br>p102x3/J5.java<br>p102x3/K5.java |
| `AbstractC2783z8` | trace: com.notescrafter.ui.screens.PdfInvertScreen (PdfInvertScreen.kt:62); com.notescraft... | p083t3/L.java<br>p102x3/AbstractC2783z8.java<br>p102x3/C2425d1.java<br>p102x3/C2464f8.java<br>p102x3/C2528j8.java<br>p102x3/C2592n8.java<br>p102x3/C2608o8.java<br>p102x3/C2640q8.java<br>p102x3/C2719v8.java<br>p102x3/C2751x8.java<br>p102x3/J5.java<br>p102x3/K5.java<br>p102x3/L7.java |
| `AC` | trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anony... | p033h3/r.java |
| `AnalyticsManager` | **[KNOWN]** AnalyticsManager (logCtaClick) | com/notescrafter/MainActivity.java<br>p083t3/C2290i.java<br>p083t3/C2306q.java<br>p083t3/C2311t.java<br>p083t3/J.java<br>p083t3/L.java<br>p083t3/O.java<br>p102x3/B5.java<br>p102x3/E4.java |
| `b` | renamed: a | com/notescrafter/service/PDFProcessor.java<br>p009b3/c.java<br>p009b3/f.java<br>p009b3/g.java<br>p009b3/j.java<br>p010c/j.java<br>p010c/k.java<br>p010c/m.java<br>p011c0/d.java<br>p012c1/d.java<br>p014c3/a.java<br>p019e0/d.java<br>p020e1/n.java<br>p020e1/p.java<br>p028g2/U.java<br>... +344 more |
| `B0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-7... | p010c/C0695h.java<br>p010c/m.java<br>p028g2/C2142j.java<br>p036i2/e.java<br>p074r0/b.java<br>p082t2/C2227c.java<br>p082t2/C2243k.java<br>p082t2/q1.java<br>p082t2/r1.java<br>p082t2/Y.java<br>p083t3/S.java<br>p090v1/C2358m.java |
| `b1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-9.<anon... | p102x3/AbstractC2595nb.java |
| `B2` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-10.<ano... | p090v1/u0.java |
| `B6` | **[KNOWN]** Shape enum (RECTANGLE, CIRCLE) renamed: o | p083t3/C2306q.java<br>p083t3/I.java |
| `C` | renamed: a, b | com/notescrafter/PrintOrderViewModel.java<br>p003a2/b.java<br>p005b/a.java<br>p010c/j.java<br>p010c/k.java<br>p010c/m.java<br>p012c1/a.java<br>p012c1/d.java<br>p014c3/a.java<br>p020e1/h.java<br>p020e1/l.java<br>p033h3/f.java<br>p033h3/m.java<br>p036i2/e.java<br>p039j0/d.java<br>... +55 more |
| `c0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-8... | p010c/m.java<br>p028g2/C2142j.java<br>p074r0/b.java<br>p082t2/C2227c.java<br>p082t2/P.java<br>p083t3/S.java |
| `C0688a` | renamed: c, a | p010c/C0688a.java<br>p010c/C0689b.java |
| `C0689b` | renamed: c, a | p010c/A.java<br>p010c/C0689b.java<br>p010c/v.java<br>p010c/w.java<br>p015d/o.java |
| `C0692e` | renamed: c, o | p010c/C0692e.java<br>p010c/m.java<br>p074r0/f.java |
| `C0693f` | renamed: c, o | p010c/C0693f.java<br>p010c/l.java |
| `C0694g` | renamed: c, a | p010c/C0693f.java<br>p010c/C0694g.java |
| `C0695h` | renamed: c, a | p010c/C0695h.java<br>p010c/m.java<br>p074r0/b.java |
| `C1` | renamed: a, b | p082t2/C2236g0.java |
| `C2` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-11.<ano... | p090v1/u0.java |
| `C2134b` | renamed: g2 | p028g2/C2134b.java<br>p028g2/C2145m.java<br>p028g2/EnumC2135c.java |
| `C2136d` | renamed: g2 | p028g2/C2136d.java<br>p028g2/C2153v.java<br>p028g2/EnumC2137e.java |
| `C2138f` | renamed: g2, o | ; ui: PaymentScreen | p028g2/C2138f.java<br>p028g2/C2153v.java<br>p028g2/U.java |
| `C2139g` | renamed: g2, o | p028g2/C2139g.java<br>p028g2/C2152u.java<br>p028g2/U.java |
| `C2140h` | renamed: g2, o | p028g2/C2139g.java<br>p028g2/C2140h.java<br>p028g2/U.java |
| `C2141i` | renamed: g2, o | p028g2/C2141i.java<br>p028g2/C2152u.java<br>p028g2/U.java |
| `C2142j` | renamed: g2, o | p028g2/C2142j.java<br>p028g2/C2152u.java<br>p028g2/U.java |
| `C2143k` | renamed: g2, o | p028g2/C2143k.java<br>p028g2/C2152u.java<br>p028g2/U.java |
| `C2145m` | renamed: g2, o | p028g2/C2145m.java<br>p028g2/C2153v.java<br>p028g2/U.java |
| `C2146n` | renamed: g2 | p028g2/C2146n.java<br>p028g2/C2147o.java<br>p028g2/C2155x.java<br>p028g2/U.java |
| `C2147o` | renamed: g2, o | p028g2/C2147o.java<br>p028g2/C2155x.java<br>p028g2/U.java |
| `C2149q` | renamed: g2 | p028g2/C2143k.java<br>p028g2/C2149q.java<br>p028g2/r.java<br>p028g2/U.java |
| `C2150s` | renamed: g2, o | p028g2/C2138f.java<br>p028g2/C2150s.java<br>p028g2/C2153v.java<br>p028g2/U.java |
| `C2151t` | renamed: g2, o | p028g2/C2138f.java<br>p028g2/C2151t.java<br>p028g2/C2153v.java<br>p028g2/U.java |
| `C2152u` | renamed: g2, o | p028g2/C2152u.java |
| `C2153v` | renamed: g2, A | ; ui: PaymentScreen | p028g2/C2153v.java |
| `C2154w` | renamed: g2, o | p028g2/C2153v.java<br>p028g2/C2154w.java |
| `C2155x` | renamed: g2, o | p028g2/C2153v.java<br>p028g2/C2155x.java<br>p064o2/C2202e.java |
| `C2156y` | renamed: g2, o | p028g2/C2153v.java<br>p028g2/C2156y.java |
| `C2157z` | renamed: g2 | p028g2/A.java<br>p028g2/C2154w.java<br>p028g2/C2155x.java<br>p028g2/C2157z.java |
| `C2159a` | renamed: h3, a | p033h3/C2159a.java<br>p033h3/o.java |
| `C2160b` | renamed: h3, a | p033h3/C2160b.java<br>p033h3/o.java |
| `C2161c` | renamed: h3, a | p033h3/C2161c.java<br>p033h3/o.java |
| `C2170a` | renamed: l, o | p047l/C2170a.java<br>p047l/C2171b.java<br>p047l/C2173d.java<br>p047l/C2175f.java<br>p082t2/q1.java |
| `C2171b` | renamed: l, o | p047l/C2171b.java<br>p047l/C2174e.java<br>p082t2/C2258s.java<br>p082t2/q1.java<br>p082t2/r1.java |
| `C2172c` | renamed: l, o | p047l/C2172c.java |
| `C2173d` | renamed: l, o | p047l/C2173d.java<br>p047l/C2174e.java |
| `C2174e` | renamed: l, r | com/notescrafter/service/NotesCrafterFCMService.java<br>p033h3/f.java<br>p033h3/j.java<br>p033h3/q.java<br>p033h3/w.java<br>p047l/C2170a.java<br>p047l/C2171b.java<br>p047l/C2172c.java<br>p047l/C2173d.java<br>p047l/C2174e.java<br>p082t2/C2227c.java<br>p082t2/C2243k.java<br>p082t2/C2258s.java<br>p082t2/j1.java<br>p082t2/q1.java<br>... +7 more |
| `C2175f` | renamed: l, o | p047l/AbstractC2190v.java<br>p047l/C2170a.java<br>p047l/C2175f.java<br>p098x/k.java |
| `C2179j` | renamed: l, a | p047l/C2179j.java |
| `C2189u` | renamed: l, o | p030h/b.java<br>p047l/C2189u.java |
| `C2191w` | renamed: l, a | p047l/C2191w.java<br>p108z/k.java |
| `C2192x` | renamed: l | p047l/C2192x.java |
| `C2193y` | renamed: l, a | p047l/C2193y.java |
| `C2194z` | renamed: l | p047l/AbstractC2181l.java<br>p047l/C2194z.java |
| `C2199b` | renamed: o2, o | p028g2/C2153v.java<br>p064o2/C2199b.java |
| `C2200c` | renamed: o2 | p028g2/C2143k.java<br>p064o2/C2200c.java |
| `C2202e` | renamed: o2, o | p028g2/C2153v.java<br>p064o2/C2202e.java |
| `C2203f` | renamed: o2, o | p064o2/C2203f.java<br>p064o2/k0.java<br>p064o2/n0.java |
| `C2204g` | renamed: o2, o | p064o2/C2204g.java<br>p064o2/C2215s.java |
| `C2206i` | renamed: o2, o | p064o2/AbstractC2210m.java<br>p064o2/AbstractC2212o.java<br>p064o2/AbstractC2216t.java<br>p064o2/C2206i.java<br>p064o2/C2215s.java<br>p064o2/D.java |
| `C2208k` | renamed: o2, r | p064o2/AbstractC2210m.java<br>p064o2/C2208k.java |
| `C2209l` | renamed: o2, r | p064o2/AbstractC2210m.java<br>p064o2/C2209l.java |
| `C2214q` | renamed: o2 | p064o2/C2214q.java<br>p064o2/r.java |
| `C2215s` | renamed: o2, r | p028g2/C2142j.java<br>p064o2/AbstractC2198a.java<br>p064o2/AbstractC2211n.java<br>p064o2/C2215s.java<br>p064o2/e0.java<br>p064o2/r.java |
| `C2217u` | renamed: o2, o | p064o2/C2217u.java<br>p064o2/D.java |
| `C2219w` | renamed: o2, o | p064o2/AbstractC2198a.java<br>p064o2/AbstractC2216t.java<br>p064o2/B.java<br>p064o2/C2215s.java<br>p064o2/C2219w.java |
| `C2221y` | renamed: o2, s | p064o2/AbstractC2210m.java<br>p064o2/AbstractC2216t.java<br>p064o2/C2215s.java<br>p064o2/C2221y.java<br>p064o2/Z.java |
| `C2222z` | renamed: o2, w | p064o2/AbstractC2211n.java<br>p064o2/AbstractC2212o.java<br>p064o2/C2222z.java<br>p064o2/m0.java<br>p064o2/p0.java |
| `C2223a` | renamed: t2, a | p082t2/C2223a.java<br>p082t2/C2267w0.java |
| `C2227c` | renamed: t2, a | p082t2/C2227c.java<br>p082t2/q1.java<br>p082t2/r1.java |
| `C2229d` | renamed: t2, a | p082t2/C2229d.java<br>p082t2/C2231e.java<br>p082t2/C2239i.java<br>p082t2/C2264v.java<br>p082t2/d1.java<br>p082t2/k1.java<br>p082t2/o1.java<br>p082t2/r.java |
| `C2231e` | renamed: t2, o | p082t2/BinderC2238h0.java<br>p082t2/C2229d.java<br>p082t2/C2231e.java<br>p082t2/C2243k.java<br>p082t2/G.java<br>p082t2/I.java<br>p082t2/j1.java<br>p082t2/n1.java<br>p082t2/O0.java<br>p082t2/P0.java<br>p082t2/RunnableC2273z0.java |
| `C2233f` | renamed: t2, a | p082t2/AbstractC2268x.java<br>p082t2/C2233f.java<br>p082t2/C2236g0.java |
| `C2235g` | renamed: t2, b | p082t2/C2227c.java<br>p082t2/C2235g.java<br>p082t2/C2236g0.java<br>p082t2/C2243k.java<br>p082t2/C2267w0.java<br>p082t2/j1.java<br>p082t2/M.java<br>p082t2/n1.java<br>p082t2/O0.java<br>p082t2/P.java<br>p082t2/r1.java<br>p082t2/RunnableC2240i0.java<br>p082t2/RunnableC2269x0.java<br>p082t2/U0.java<br>p082t2/Y0.java |
| `C2236g0` | renamed: t2, I | p033h3/k.java<br>p042j3/c.java |
| `C2239i` | renamed: t2, o | p082t2/BinderC2238h0.java<br>p082t2/C2229d.java<br>p082t2/C2236g0.java<br>p082t2/C2239i.java<br>p082t2/G.java<br>p082t2/I.java |
| `C2243k` | renamed: t2, f | p082t2/C2243k.java<br>p082t2/C2247m.java<br>p082t2/CallableC2246l0.java<br>p082t2/f1.java<br>p082t2/j1.java<br>p082t2/q1.java<br>p082t2/RunnableC2240i0.java<br>p082t2/Y.java<br>p082t2/Z.java |
| `C2245l` | renamed: t2, a | p082t2/C2243k.java<br>p082t2/C2245l.java<br>p082t2/j1.java |
| `C2247m` | renamed: t2, o | p082t2/C2243k.java<br>p082t2/C2247m.java<br>p082t2/J.java |
| `C2251o` | renamed: t2, f | p082t2/C2236g0.java<br>p082t2/C2251o.java<br>p082t2/C2267w0.java<br>p082t2/j1.java<br>p082t2/O0.java<br>p082t2/RunnableC2240i0.java |
| `C2253p` | renamed: t2, a | p082t2/C2243k.java<br>p082t2/C2253p.java<br>p082t2/j1.java |
| `C2255q` | renamed: t2, c | p082t2/C2236g0.java<br>p082t2/C2255q.java<br>p082t2/j1.java<br>p082t2/P.java |
| `C2258s` | renamed: t2, b | p033h3/k.java<br>p082t2/b1.java<br>p082t2/C2236g0.java<br>p082t2/C2258s.java<br>p082t2/K0.java<br>p082t2/RunnableC2225b.java<br>p082t2/RunnableC2270y.java |
| `C2260t` | renamed: t2, a | p082t2/C2227c.java<br>p082t2/C2243k.java<br>p082t2/C2260t.java<br>p082t2/j1.java<br>p082t2/q1.java |
| `C2262u` | renamed: t2, o | p082t2/C2262u.java<br>p082t2/j1.java<br>p082t2/r.java |
| `C2264v` | renamed: t2, o | p082t2/BinderC2238h0.java<br>p082t2/C2229d.java<br>p082t2/C2231e.java<br>p082t2/C2243k.java<br>p082t2/C2264v.java<br>p082t2/C2267w0.java<br>p082t2/G.java<br>p082t2/I.java<br>p082t2/j1.java<br>p082t2/K.java<br>p082t2/n1.java<br>p082t2/O0.java<br>p082t2/P.java<br>p082t2/P0.java |
| `C2267w0` | renamed: t2, c | ; ui: SettingsScreen | p033h3/k.java |
| `C2272z` | renamed: t2, a | p082t2/AbstractC2268x.java<br>p082t2/C2272z.java |
| `C2274a` | **[KNOWN]** MainActivity composable lambda 1 (MainActivity.kt:1107) trace: com.notescrafte... | p083t3/AbstractC2278c.java<br>p083t3/C2274a.java |
| `C2275a0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java<br>p092v3/s.java<br>p102x3/Oc.java |
| `C2276b` | **[KNOWN]** MainActivity composable lambda 2 (MainActivity.kt:1144) trace: com.notescrafte... | p083t3/AbstractC2278c.java<br>p083t3/C2276b.java |
| `C2277b0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | com/notescrafter/PrintOrderViewModel.java<br>p042j3/c.java<br>p102x3/C2421cd.java<br>p102x3/Gb.java<br>p102x3/Gd.java |
| `C2279c0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java |
| `C2280d` | renamed: t3, o | ; related: MainActivity.kt | com/notescrafter/MainActivity.java<br>p083t3/C2280d.java |
| `C2281d0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p102x3/Fd.java |
| `C2282e` | renamed: t3, o | ; related: MainActivity.kt; PrintOrderViewModel ; ui: PaymentScreen; Paym... | com/notescrafter/MainActivity.java<br>p083t3/C2282e.java |
| `C2283e0` | renamed: t3, a | p102x3/Ec.java<br>p102x3/Gd.java |
| `C2284f` | trace: com.notescrafter.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:192... | com/notescrafter/MainActivity.java<br>p083t3/C2284f.java |
| `C2286g` | renamed: t3, o | ; related: MainActivity.kt | com/notescrafter/MainActivity.java<br>p083t3/C2286g.java<br>p090v1/C2358m.java |
| `C2288h` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p083t3/C2288h.java<br>p083t3/S.java<br>p102x3/Gd.java<br>p102x3/Kd.java<br>p102x3/X3.java |
| `C2289h0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java |
| `C2290i` | renamed: t3, o | ; related: AnalyticsManager; PrintOrderViewModel ; ui: PrintFlow | p083t3/C2290i.java<br>p083t3/L.java<br>p083t3/S.java<br>p097w3/d.java<br>p102x3/AbstractC2588n4.java<br>p102x3/AbstractC2595nb.java<br>p102x3/C2467fb.java<br>p102x3/C2486ge.java<br>p102x3/C2654r7.java<br>p102x3/C2670s7.java<br>p102x3/C2704u9.java<br>p102x3/C2765y6.java<br>p102x3/C2786zb.java<br>p102x3/C2788zd.java<br>p102x3/Cc.java<br>... +8 more |
| `C2291i0` | renamed: t3, o | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>p042j3/c.java<br>p102x3/AbstractC2494h6.java<br>p102x3/Ec.java<br>p102x3/Q8.java |
| `C2292j` | **[KNOWN]** FeatureCard updateScope lambda (LandingScreen.kt) renamed: t3, o | p083t3/C2292j.java<br>p083t3/S.java<br>p097w3/h.java<br>p102x3/A6.java<br>p102x3/AbstractC2574m6.java<br>p102x3/AbstractC2583n.java<br>p102x3/D5.java<br>p102x3/r.java<br>p102x3/Rb.java<br>p102x3/Ud.java |
| `C2294k` | renamed: t3, o | ; related: GlobalHomeScreen.kt; GlobalHomeScreen-adjacent (x3); PDFProces... | p083t3/C2294k.java<br>p083t3/S.java<br>p102x3/AbstractC2588n4.java<br>p102x3/AbstractC2595nb.java<br>p102x3/AbstractC2684t5.java<br>p102x3/Gd.java<br>p102x3/Z4.java |
| `C2298m` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p083t3/C2298m.java<br>p083t3/S.java |
| `C2300n` | renamed: t3, o | p083t3/C2300n.java<br>p083t3/S.java |
| `C2301n0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p102x3/Vb.java |
| `C2302o` | renamed: t3, o | p083t3/C2302o.java<br>p083t3/C2304p.java |
| `C2303o0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p102x3/M4.java |
| `C2304p` | renamed: t3, o | ; related: NetworkUtils | p083t3/C2304p.java<br>p083t3/S.java |
| `C2305p0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/PrintOrderViewModel.java |
| `C2306q` | **[KNOWN]** LogoSelectionScreen confirm lambda (LogoSelectionScreen.kt) renamed: t3, o | p083t3/C2306q.java<br>p083t3/C2309s.java<br>p083t3/F.java<br>p083t3/O0.java<br>p083t3/P0.java<br>p102x3/A6.java<br>p102x3/AbstractC2406be.java<br>p102x3/AbstractC2595nb.java<br>p102x3/C2579mb.java<br>p102x3/C2581md.java<br>p102x3/C2594na.java<br>p102x3/C2596nc.java<br>p102x3/I4.java<br>p102x3/J4.java<br>p102x3/Ye.java<br>... +1 more |
| `C2308r0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p102x3/Gb.java<br>p102x3/Vb.java |
| `C2309s` | renamed: t3, o | ; related: LogoSelectionScreen confirm lambda | p083t3/C2309s.java<br>p083t3/S.java |
| `C2311t` | renamed: t3, o | ; related: AnalyticsManager ; ui: ContactScreen; PrintFlow; SettingsScree... | p083t3/C2311t.java<br>p083t3/S.java |
| `C2312t0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p102x3/C2597nd.java |
| `C2313u` | **[KNOWN]** flow-step nav helper (FLOW card tap -> "flow" + step 0) renamed: t3, o | p083t3/C2313u.java<br>p083t3/C2319x.java<br>p083t3/L.java |
| `C2315v` | **[KNOWN]** route lambdas table ("flow","how-to-print","tools","contact-us",...) renamed: ... | p083t3/C2315v.java<br>p083t3/C2319x.java<br>p083t3/L.java |
| `C2317w` | renamed: t3, o | p083t3/C2317w.java<br>p083t3/C2319x.java<br>p083t3/L.java |
| `C2319x` | **[KNOWN]** TopBar (cart/downloads icons -> step -1 DownloadsScreen) trace: com.notescraft... | p083t3/C2319x.java<br>p083t3/M.java |
| `C2321y` | renamed: t3, o | ; related: ToDo list state (x3) | p083t3/C2321y.java<br>p083t3/C2323z.java<br>p083t3/F.java<br>p083t3/I0.java<br>p083t3/J0.java<br>p083t3/L.java<br>p102x3/A6.java<br>p102x3/AbstractC2595nb.java<br>p102x3/C2466fa.java<br>p102x3/C2467fb.java<br>p102x3/C2594na.java<br>p102x3/C2670s7.java<br>p102x3/C2720v9.java<br>p102x3/D5.java<br>p102x3/Ga.java<br>... +4 more |
| `C2323z` | trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:514) ... | p083t3/C2323z.java<br>p083t3/M.java |
| `C2324z0` | renamed: t3, o | ; related: PrintOrderViewModel ; ui: PrintFlow | p102x3/C2419cb.java |
| `C2336b` | renamed: v1, b | p090v1/C2336b.java |
| `C2338c` | renamed: v1, b | p090v1/C2338c.java |
| `C2340d` | renamed: v1, b | p090v1/C2340d.java |
| `C2342e` | renamed: v1, b | p090v1/C2342e.java |
| `C2344f` | renamed: v1, b | p090v1/C2344f.java |
| `C2346g` | renamed: v1, b | p090v1/C2346g.java |
| `C2348h` | renamed: v1, b | p090v1/C2348h.java |
| `C2350i` | renamed: v1, b | p090v1/C2350i.java |
| `C2352j` | renamed: v1, b | p067p1/b.java<br>p090v1/C2352j.java |
| `C2354k` | renamed: v1, b | p090v1/C2354k.java |
| `C2356l` | renamed: v1, b | p090v1/C2356l.java |
| `C2358m` | renamed: v1, o | ; related: MainActivity.kt; PrintOrderViewModel ; ui: PrintFlow | com/notescrafter/MainActivity.java<br>p043k/d.java<br>p067p1/b.java<br>p082t2/Y.java<br>p090v1/AbstractC2360n.java<br>p090v1/C2336b.java<br>p090v1/C2338c.java<br>p090v1/C2344f.java<br>p090v1/C2346g.java<br>p090v1/C2348h.java<br>p090v1/C2350i.java<br>p090v1/C2352j.java<br>p090v1/C2354k.java<br>p090v1/C2356l.java<br>p090v1/C2358m.java<br>... +3 more |
| `C2362o` | renamed: v1, f | p067p1/b.java<br>p067p1/h.java<br>p067p1/m.java<br>p085u1/d.java<br>p085u1/g.java<br>p090v1/AbstractC2360n.java<br>p090v1/C2358m.java<br>p090v1/C2362o.java<br>p090v1/L0.java<br>p090v1/M0.java<br>p100x1/c.java<br>p105y1/C2800k.java<br>p105y1/F.java |
| `C2366q` | renamed: v1, d | p042j3/c.java<br>p046k2/h.java<br>p067p1/c.java<br>p067p1/h.java<br>p085u1/d.java<br>p090v1/C2336b.java<br>p090v1/C2338c.java<br>p090v1/C2352j.java<br>p090v1/C2354k.java<br>p090v1/C2358m.java<br>p090v1/C2366q.java<br>p090v1/u0.java<br>p100x1/c.java<br>p100x1/l.java<br>p100x1/n.java<br>... +9 more |
| `C2367s` | renamed: v1 | p090v1/C2367s.java |
| `C2369u` | renamed: v1 | p090v1/C2369u.java |
| `C2372x` | renamed: v1 | p090v1/C2372x.java |
| `C2374z` | renamed: v1 | p090v1/C2374z.java |
| `C2375a` | renamed: x3, o | p102x3/AbstractC2471g.java<br>p102x3/AbstractC2493h5.java<br>p102x3/C2375a.java<br>p102x3/Rb.java<br>p102x3/Ye.java |
| `C2391b` | renamed: x3, o | p102x3/AbstractC2471g.java<br>p102x3/C2391b.java<br>p102x3/ef.java |
| `C2407c` | renamed: x3, o | p102x3/AbstractC2471g.java<br>p102x3/C2407c.java<br>p102x3/F5.java |
| `C2417c9` | renamed: x3, o | ; related: PrintOrderViewModel ; ui: PrintFlow; SettingsScreen | p083t3/F.java |
| `C2423d` | trace: com.notescrafter.ui.screens.StatCard.<anonymous> (AboutUsScreen.kt:273) renamed: x3... | p102x3/AbstractC2471g.java<br>p102x3/C2423d.java |
| `C2435db` | renamed: x3, o | p083t3/F.java<br>p083t3/F0.java |
| `C2438de` | renamed: x3, a | p083t3/C2291i0.java |
| `C2439e` | trace: com.notescrafter.ui.screens.TechItem.<anonymous> (AboutUsScreen.kt:258) renamed: x3... | p102x3/AbstractC2471g.java<br>p102x3/C2439e.java |
| `C2445e5` | renamed: x3, o | ; related: ExamItem; LandingScreen.kt; StepItem data class (LandingScreen... | p107y3/b.java |
| `C2455f` | trace: com.notescrafter.ui.screens.ValueItem.<anonymous> (AboutUsScreen.kt:299) renamed: x... | p102x3/AbstractC2471g.java<br>p102x3/C2455f.java |
| `C2477g5` | renamed: x3, o | ; ui: SettingsScreen | p097w3/g.java |
| `C2487h` | renamed: x3, a | p102x3/C2487h.java<br>p102x3/Kd.java |
| `C2492h4` | renamed: x3, o | p083t3/C2322y0.java<br>p083t3/C2324z0.java |
| `C2502he` | renamed: x3, o | p083t3/N.java |
| `C2503i` | renamed: x3, a | p102x3/AbstractC2535k.java<br>p102x3/C2503i.java<br>p102x3/C2519j.java<br>p102x3/D5.java |
| `C2519j` | renamed: x3, o | ; related: ToDo list state (x3) | p102x3/AbstractC2452ec.java<br>p102x3/AbstractC2535k.java<br>p102x3/C2519j.java<br>p102x3/Gd.java<br>p102x3/Z4.java |
| `C2551l` | renamed: x3, o | p102x3/AbstractC2583n.java<br>p102x3/C2551l.java<br>p102x3/Kd.java |
| `C2567m` | renamed: x3, o | ; related: GlobalHomeScreen.kt; GlobalHomeScreen-adjacent (x3); PrintOrde... | p102x3/A6.java<br>p102x3/AbstractC2583n.java<br>p102x3/AbstractC2595nb.java<br>p102x3/AbstractC2684t5.java<br>p102x3/C2567m.java<br>p102x3/X3.java |
| `C2590n6` | renamed: x3, o | p003a2/a.java |
| `C2599o` | renamed: x3, o | ; related: LandingScreen.kt | p102x3/AbstractC2574m6.java<br>p102x3/C2599o.java<br>p102x3/r.java |
| `C2606o6` | trace: com.notescrafter.ui.screens.LiveChatScreen.<anonymous>.<anonymous> (LiveChatScreen.... | p003a2/a.java |
| `C2622p6` | renamed: x3, o | ; ui: AddressScreen | p083t3/C0.java |
| `C2627pb` | renamed: x3, a | ; ui: PrintFlow | p083t3/C2292j.java |
| `C2631q` | trace: com.notescrafter.ui.screens.SocialCard.<anonymous> (CommunityScreen.kt:315) renamed... | p102x3/C2631q.java<br>p102x3/r.java |
| `C2646qe` | renamed: x3, a | p083t3/C2290i.java<br>p083t3/C2292j.java |
| `C2662s` | renamed: x3, a | p102x3/AbstractC2583n.java<br>p102x3/C2662s.java |
| `C2678t` | trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-1.<anonymou... | p102x3/AbstractC2710v.java<br>p102x3/C2678t.java |
| `C2694u` | trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-2.<anonymou... | p102x3/AbstractC2710v.java<br>p102x3/C2694u.java |
| `C2726w` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-1.<an... | p102x3/AbstractC2758y.java<br>p102x3/C2726w.java |
| `C2742x` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-2.<an... | p102x3/AbstractC2758y.java<br>p102x3/C2742x.java |
| `C2774z` | trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityScreenKt.lambda-1.<anonym... | p102x3/B.java<br>p102x3/C2774z.java |
| `C2790a` | renamed: y1, a | p085u1/k.java<br>p105y1/C2790a.java |
| `C2796g` | renamed: y1, a | ; ui: HistoryScreen | p100x1/g.java<br>p105y1/C2796g.java<br>p105y1/DialogInterfaceOnClickListenerC2794e.java<br>p105y1/RunnableC2791b.java |
| `C2799j` | renamed: y1, a | p085u1/k.java<br>p105y1/BinderC2797h.java<br>p105y1/C2796g.java<br>p105y1/C2799j.java<br>p105y1/RunnableC2791b.java |
| `C2800k` | renamed: y1, r | p105y1/C2800k.java<br>p105y1/t.java |
| `C4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/C.java |
| `C9` | trace: com.notescrafter.ui.screens.PdfSplitScreen (PdfSplitScreen.kt:62); com.notescrafter... | p083t3/L.java |
| `CallableC2246l0` | renamed: t2, a | p082t2/BinderC2238h0.java<br>p082t2/CallableC2246l0.java |
| `CC` | trace: com.notescrafter.ui.screens.PdfSourcePickerDialog.<anonymous> (PrintOrderScreens.kt... | p033h3/r.java<br>p090v1/C2358m.java |
| `d` | renamed: a, b | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>com/notescrafter/service/PDFProcessor.java<br>com/notescrafter/utils/ToDoManager.java<br>p006b0/b.java<br>p010c/k.java<br>p014c3/a.java<br>p020e1/j.java<br>p020e1/k.java<br>p020e1/n.java<br>p028g2/U.java<br>p033h3/f.java<br>p033h3/m.java<br>p033h3/o.java<br>... +57 more |
| `D0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-9... | p028g2/C2142j.java<br>p067p1/h.java |
| `D2` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-13.<ano... | p090v1/u0.java |
| `D4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/C2272z.java |
| `D5` | trace: com.notescrafter.ui.screens.FAQCard (HelpCenterScreen.kt:334); com.notescrafter.ui.... | p083t3/C2292j.java<br>p083t3/L.java |
| `D7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p090v1/u0.java |
| `D8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `e` | renamed: o, a | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>com/notescrafter/service/PDFProcessor.java<br>p003a2/a.java<br>p003a2/b.java<br>p007b1/a.java<br>p010c/C0692e.java<br>p010c/k.java<br>p010c/m.java<br>p014c3/a.java<br>p015d/a.java<br>p015d/b.java<br>p015d/c.java<br>p015d/l.java<br>... +70 more |
| `E0` | renamed: a, b | com/notescrafter/PrintOrderViewModel.java<br>p014c3/a.java<br>p028g2/C2142j.java<br>p082t2/C2243k.java<br>p082t2/C2247m.java<br>p082t2/O0.java<br>p085u1/k.java |
| `E1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-2.<anonymo... | p082t2/C2236g0.java<br>p082t2/P.java |
| `E3` | trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (Co... | p082t2/C2267w0.java<br>p082t2/C2272z.java |
| `E6` | renamed: o | p083t3/C2290i.java |
| `E7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p085u1/j.java<br>p090v1/A0.java<br>p090v1/u0.java |
| `E8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `EC` | renamed: o, r | ; related: PrintOrderViewModel ; ui: AddressScreen; PrintFlow | p033h3/r.java |
| `Ee` | trace: com.notescrafter.ui.screens.SizeInfo (SuccessScreen.kt:663); com.notescrafter.ui.sc... | p083t3/L.java |
| `ef` | trace: com.notescrafter.ui.screens.FeatureTile (UploadScreen.kt:344); com.notescrafter.ui.... | p083t3/L.java |
| `EnumC2135c` | renamed: g2, o | p028g2/C2145m.java<br>p028g2/EnumC2135c.java |
| `EnumC2137e` | renamed: g2, o | p028g2/C2153v.java<br>p028g2/EnumC2137e.java |
| `EnumC2148p` | renamed: g2, o | p028g2/C2147o.java<br>p028g2/EnumC2148p.java |
| `EnumC2241j` | renamed: t2, o | p082t2/EnumC2241j.java<br>p082t2/j1.java<br>p082t2/P.java |
| `EnumC2256q0` | renamed: t2, o | p082t2/C2251o.java<br>p082t2/C2259s0.java<br>p082t2/C2267w0.java<br>p082t2/EnumC2256q0.java<br>p082t2/j1.java |
| `EnumC2257r0` | renamed: t2, o | p082t2/C2236g0.java<br>p082t2/C2251o.java<br>p082t2/C2259s0.java<br>p082t2/C2267w0.java<br>p082t2/EnumC2256q0.java<br>p082t2/EnumC2257r0.java<br>p082t2/H.java<br>p082t2/j1.java<br>p082t2/P.java<br>p082t2/RunnableC2240i0.java<br>p082t2/Y.java |
| `EnumC2380a4` | renamed: x3, o | p083t3/I.java<br>p102x3/AbstractC2588n4.java<br>p102x3/C2460f4.java<br>p102x3/C2524j4.java<br>p102x3/C2572m4.java<br>p102x3/EnumC2380a4.java |
| `EnumC2386aa` | renamed: x3, o | p102x3/C2721va.java<br>p102x3/C2769ya.java<br>p102x3/EnumC2386aa.java<br>p102x3/Ja.java<br>p102x3/T5.java |
| `EnumC2422ce` | renamed: x3, o | p083t3/I.java<br>p102x3/A6.java<br>p102x3/C2567m.java<br>p102x3/C2717v6.java<br>p102x3/EnumC2422ce.java |
| `EnumC2454ee` | renamed: x3, o | p102x3/AbstractC2588n4.java<br>p102x3/C2412c4.java<br>p102x3/C2476g4.java<br>p102x3/C2492h4.java<br>p102x3/EnumC2454ee.java |
| `EnumC2604o4` | renamed: x3, o | p083t3/I.java<br>p102x3/AbstractC2588n4.java<br>p102x3/C2460f4.java<br>p102x3/C2524j4.java<br>p102x3/C2572m4.java<br>p102x3/EnumC2604o4.java |
| `EnumC2614oe` | renamed: x3, o | p083t3/C2290i.java<br>p102x3/AbstractC2782z7.java<br>p102x3/C2670s7.java<br>p102x3/C2702u7.java<br>p102x3/EnumC2614oe.java |
| `EnumC2677se` | renamed: x3, o | p083t3/C2290i.java<br>p102x3/C2704u9.java<br>p102x3/C2720v9.java<br>p102x3/C9.java<br>p102x3/EnumC2677se.java |
| `EnumC2778z3` | renamed: x3, o | p083t3/C2290i.java<br>p102x3/AbstractC2782z7.java<br>p102x3/C2654r7.java<br>p102x3/C2670s7.java<br>p102x3/C2702u7.java<br>p102x3/C2718v7.java<br>p102x3/EnumC2778z3.java |
| `ExamItem` | **[KNOWN]** ExamItem model | p083t3/C2306q.java<br>p102x3/C2445e5.java<br>p102x3/Le.java<br>p102x3/Na.java<br>p102x3/Se.java<br>p102x3/Ye.java |
| `F` | renamed: r, s | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>p003a2/a.java<br>p010c/m.java<br>p011c0/d.java<br>p012c1/d.java<br>p013c2/g.java<br>p014c3/a.java<br>p015d/f.java<br>p020e1/n.java<br>p023f0/a.java<br>p028g2/U.java<br>p033h3/d.java<br>p033h3/m.java<br>... +40 more |
| `F0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-1.<anon... | p028g2/C2142j.java<br>p082t2/Y.java |
| `F3` | trace: com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339); com.notescr... | p082t2/C.java<br>p082t2/C2267w0.java<br>p082t2/J0.java<br>p082t2/j1.java<br>p083t3/J.java<br>p083t3/L.java<br>p097w3/a.java |
| `F5` | trace: com.notescrafter.ui.screens.InfoPageScreen (InfoPages.kt:19) | p083t3/L.java |
| `F7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p036i2/e.java<br>p090v1/C2358m.java<br>p105y1/F.java |
| `F8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `FC` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p033h3/r.java<br>p090v1/C2358m.java |
| `g` | renamed: r | com/notescrafter/MainActivity.java<br>p002a1/c.java<br>p002a1/e.java<br>p003a2/a.java<br>p010c/k.java<br>p010c/m.java<br>p012c1/d.java<br>p013c2/g.java<br>p015d/k.java<br>p020e1/h.java<br>p028g2/a0.java<br>p028g2/B.java<br>p028g2/C2138f.java<br>p028g2/C2139g.java<br>p028g2/C2140h.java<br>... +101 more |
| `G0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-2.<anon... | p028g2/C2142j.java<br>p082t2/j1.java<br>p085u1/j.java |
| `G3` | renamed: a, b | p082t2/C2272z.java<br>p105y1/C2800k.java<br>p105y1/q.java<br>p105y1/s.java |
| `G4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/C2272z.java |
| `G5` | renamed: o | p083t3/C2290i.java |
| `G7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p043k/c.java<br>p043k/d.java |
| `G8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `Gd` | trace: com.notescrafter.ui.screens.A4CoverPage (PrintOrderScreens.kt:2164); com.notescraft... | p083t3/C2288h.java<br>p083t3/C2290i.java<br>p083t3/C2294k.java<br>p083t3/E0.java<br>p083t3/G0.java<br>p083t3/L.java<br>p097w3/a.java |
| `h` |  | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>p003a2/a.java<br>p012c1/d.java<br>p013c2/f.java<br>p014c3/a.java<br>p020e1/k.java<br>p020e1/p.java<br>p028g2/Q.java<br>p033h3/f.java<br>p033h3/j.java<br>p033h3/m.java<br>p033h3/w.java<br>p035i0/b.java<br>p036i2/e.java<br>... +52 more |
| `H0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-3.<anon... | p028g2/C2142j.java<br>p082t2/j1.java |
| `H1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-5.<anonymo... | com/notescrafter/utils/ReviewHelper.java<br>p033h3/f.java<br>p082t2/C2236g0.java<br>p105y1/t.java |
| `H3` | renamed: a, b | p082t2/C.java<br>p082t2/j1.java<br>p083t3/C2288h.java |
| `H4` | **[KNOWN]** EnhanceScreen.kt anonymous (Remove Logo section, EnhanceScreen.kt:289) trace: ... | p082t2/C2272z.java |
| `H5` | renamed: o | p083t3/C2290i.java |
| `H8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `i` | renamed: s | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>com/notescrafter/utils/ReviewHelper.java<br>p009b3/c.java<br>p009b3/f.java<br>p009b3/g.java<br>p012c1/b.java<br>p012c1/d.java<br>p015d/k.java<br>p020e1/h.java<br>p024f2/b.java<br>p028g2/Q.java<br>p033h3/A.java<br>p033h3/B.java<br>... +43 more |
| `I0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-4.<anon... | p082t2/j1.java<br>p082t2/Y.java |
| `I1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-6.<anonymo... | p082t2/C2236g0.java |
| `I3` | renamed: o, r | ; related: PDFProcessor; PrintOrderViewModel ; ui: PrintFlow | p105y1/C2800k.java<br>p105y1/q.java<br>p105y1/s.java |
| `I4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p085u1/d.java |
| `I8` | trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/C2354k.java |
| `ID` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<ano... | p078s1/c.java |
| `InterfaceC0690c` | renamed: c | p010c/C.java<br>p010c/D.java<br>p010c/InterfaceC0690c.java<br>p010c/v.java |
| `InterfaceC2133a` | renamed: g2 | p028g2/C.java<br>p028g2/C2147o.java<br>p028g2/EnumC2148p.java<br>p028g2/InterfaceC2133a.java |
| `InterfaceC2218v` | renamed: o2 | p064o2/InterfaceC2218v.java |
| `InterfaceC2237h` | renamed: t2 | p082t2/C2233f.java<br>p082t2/C2235g.java<br>p082t2/InterfaceC2237h.java<br>p082t2/Y.java |
| `InterfaceC2254p0` | renamed: t2 | p082t2/AbstractC2249n.java<br>p082t2/AbstractC2252o0.java<br>p082t2/B0.java<br>p082t2/b1.java<br>p082t2/C2236g0.java<br>p082t2/InterfaceC2254p0.java<br>p082t2/j1.java |
| `InterfaceC2334a` | renamed: v1 | p067p1/h.java<br>p090v1/BinderC2364p.java<br>p090v1/C2358m.java<br>p090v1/InterfaceC2334a.java<br>p090v1/s0.java<br>p100x1/c.java<br>p100x1/n.java |
| `InterfaceC2341d0` | renamed: v1 | p090v1/AbstractBinderC2337b0.java<br>p090v1/C2335a0.java<br>p090v1/InterfaceC2341d0.java<br>p105y1/BinderC2797h.java |
| `InterfaceC2347g0` | renamed: v1 | p085u1/j.java<br>p090v1/A0.java<br>p090v1/C2345f0.java<br>p090v1/InterfaceC2347g0.java |
| `InterfaceC2351i0` | renamed: v1 | p090v1/C2349h0.java<br>p090v1/C2353j0.java<br>p090v1/InterfaceC2351i0.java |
| `InterfaceC2357l0` | renamed: v1 | p067p1/h.java<br>p067p1/m.java<br>p085u1/j.java<br>p090v1/A0.java<br>p090v1/C2355k0.java<br>p090v1/InterfaceC2357l0.java<br>p090v1/t0.java |
| `InterfaceC2363o0` | renamed: v1 | p085u1/j.java<br>p090v1/A0.java<br>p090v1/AbstractBinderC2361n0.java<br>p090v1/C2359m0.java<br>p090v1/InterfaceC2363o0.java<br>p090v1/s0.java |
| `InterfaceC2368t` | renamed: v1 | p085u1/j.java<br>p090v1/A0.java<br>p090v1/BinderC2364p.java<br>p090v1/C2367s.java<br>p090v1/InterfaceC2368t.java |
| `InterfaceC2371w` | renamed: v1 | p085u1/g.java<br>p085u1/j.java<br>p090v1/A0.java<br>p090v1/AbstractBinderC2370v.java<br>p090v1/C2369u.java<br>p090v1/H0.java<br>p090v1/InterfaceC2371w.java<br>p090v1/z0.java |
| `InterfaceC2373y` | renamed: v1 | p085u1/j.java<br>p090v1/A0.java<br>p090v1/C2372x.java<br>p090v1/I0.java<br>p090v1/InterfaceC2373y.java |
| `j` | renamed: f, a | com/notescrafter/MainActivity.java<br>p003a2/a.java<br>p012c1/d.java<br>p018d3/d.java<br>p020e1/p.java<br>p028g2/Q.java<br>p033h3/f.java<br>p033h3/m.java<br>p035i0/b.java<br>p036i2/e.java<br>p045k1/d.java<br>p045k1/f.java<br>p045k1/i.java<br>p045k1/j.java<br>p049l1/b.java<br>... +87 more |
| `J0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-5.<anon... | p028g2/C2142j.java<br>p082t2/Y.java<br>p085u1/j.java<br>p102x3/AbstractC2595nb.java |
| `j1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-7.<anonymo... | p042j3/c.java<br>p090v1/C2358m.java |
| `J2` | trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-2.<anon... | p090v1/u0.java |
| `J3` | renamed: o | p067p1/h.java<br>p067p1/o.java<br>p083t3/F.java<br>p083t3/I0.java<br>p083t3/J0.java<br>p090v1/s0.java<br>p105y1/t.java |
| `J4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p090v1/C2358m.java |
| `J5` | renamed: o, r | p067p1/h.java<br>p078s1/d.java |
| `Ja` | trace: com.notescrafter.ui.screens.ControlButton (PomodoroTimerScreen.kt:602); com.notescr... | p083t3/L.java |
| `k` | renamed: a | p003a2/a.java<br>p010c/m.java<br>p012c1/d.java<br>p013c2/g.java<br>p014c3/a.java<br>p015d/c.java<br>p020e1/p.java<br>p022f/e.java<br>p028g2/Q.java<br>p045k1/j.java<br>p046k2/h.java<br>p058n0/i.java<br>p065o3/g.java<br>p082t2/C2236g0.java<br>p082t2/C2267w0.java<br>... +21 more |
| `K0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-6.<anon... | p033h3/k.java<br>p082t2/Y.java |
| `K1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-8.<anonymo... | p082t2/P.java |
| `K3` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.... | p082t2/A.java<br>p082t2/j1.java<br>p100x1/l.java |
| `K4` | renamed: o, r | p082t2/A.java<br>p085u1/d.java |
| `K6` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p033h3/r.java |
| `Kd` | trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen (PrintPriceCalculatorScreen.... | p083t3/C2288h.java<br>p083t3/L.java |
| `KE` | trace: com.notescrafter.ui.screens.AnalogClock.<anonymous> (ToDoScreen.kt:852) renamed: o | p104y0/m.java |
| `l` | renamed: H, A | ; ui: SettingsScreen | p010c/E.java<br>p010c/v.java<br>p012c1/d.java<br>p019e0/b.java<br>p028g2/Q.java<br>p033h3/m.java<br>p033h3/n.java<br>p042j3/c.java<br>p045k1/j.java<br>p048l0/b.java<br>p053m0/f.java<br>p065o3/g.java<br>p078s1/d.java<br>p080t0/d.java<br>p082t2/Y.java<br>... +51 more |
| `L0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-7.<anon... | p033h3/k.java<br>p067p1/c.java<br>p082t2/Y.java |
| `L3` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.... | p082t2/C.java<br>p082t2/C2235g.java<br>p082t2/j1.java<br>p100x1/l.java<br>p105y1/C2800k.java |
| `L4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/A.java<br>p085u1/d.java |
| `L6` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p033h3/r.java |
| `L7` | renamed: o, r | p085u1/i.java<br>p085u1/j.java |
| `m` | renamed: o | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>p010c/m.java<br>p013c2/e.java<br>p014c3/a.java<br>p020e1/h.java<br>p028g2/Q.java<br>p042j3/c.java<br>p046k2/h.java<br>p049l1/h.java<br>p051l3/d.java<br>p051l3/i.java<br>p065o3/h.java<br>p074r0/b.java<br>... +37 more |
| `M0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-8.<anon... | p013c2/d.java<br>p033h3/k.java<br>p067p1/h.java<br>p082t2/Y.java<br>p085u1/j.java |
| `m1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-1.<anonymo... | p042j3/c.java |
| `M3` | trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous> (DownloadsScreen.kt:316)... | p082t2/A.java |
| `M4` | renamed: o, r | ; related: PrintOrderViewModel ; ui: PrintFlow | p083t3/C2305p0.java<br>p085u1/h.java<br>p085u1/i.java<br>p085u1/j.java |
| `MainActivity` | **[KNOWN]** MainActivity.kt (launcher: adb, razorpay, ads, setContent) renamed: N, H | p036i2/e.java<br>p083t3/C2280d.java<br>p083t3/C2282e.java<br>p083t3/C2284f.java<br>p083t3/C2286g.java<br>p090v1/C2358m.java<br>p092v3/l.java |
| `n` |  | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>p012c1/d.java<br>p014c3/a.java<br>p020e1/h.java<br>p036i2/e.java<br>p042j3/c.java<br>p044k0/b.java<br>p045k1/j.java<br>p046k2/h.java<br>p047l/T.java<br>p065o3/b.java<br>p065o3/e.java<br>p065o3/k.java<br>p078s1/d.java<br>... +25 more |
| `N0` | renamed: a, b | p082t2/j1.java<br>p082t2/P.java<br>p082t2/Y.java<br>p102x3/Za.java |
| `N1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-10.<anonym... | p033h3/k.java<br>p082t2/C2236g0.java<br>p082t2/RunnableC2266w.java |
| `N3` | renamed: o | ; related: ToDoItem | p082t2/C.java |
| `N4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p085u1/g.java<br>p085u1/i.java |
| `N5` | trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p015d/n.java<br>p015d/o.java<br>p015d/p.java<br>p085u1/k.java<br>p090v1/u0.java<br>p101x2/o.java |
| `N8` | renamed: o | p090v1/z0.java |
| `N9` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/z0.java |
| `NetworkUtils` | **[KNOWN]** NetworkUtils | p083t3/C2304p.java<br>p102x3/C2779z4.java |
| `NotesCrafterFCMService` | **[KNOWN]** FCM push service renamed: v | p092v3/h.java<br>p092v3/l.java<br>p092v3/m.java |
| `o` | renamed: a, b | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>com/notescrafter/service/PDFProcessor.java<br>com/notescrafter/utils/AnalyticsManager.java<br>com/notescrafter/utils/ExamItem.java<br>com/notescrafter/utils/NetworkUtils.java<br>com/notescrafter/utils/ReviewHelper.java<br>com/notescrafter/utils/ToDoItem.java<br>com/notescrafter/utils/ToDoManager.java<br>p002a1/b.java<br>p002a1/c.java<br>p003a2/a.java<br>p006b0/b.java<br>p009b3/c.java<br>... +604 more |
| `O0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-1.<anonymou... | p067p1/g.java<br>p067p1/m.java |
| `O1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-2.<anonymo... | p082t2/C2236g0.java |
| `O7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p105y1/D.java |
| `O8` | renamed: o, r | ; related: PDFProcessor | p083t3/C2291i0.java<br>p090v1/z0.java |
| `p` | renamed: a, b | com/notescrafter/MainActivity.java<br>p002a1/d.java<br>p003a2/a.java<br>p006b0/a.java<br>p010c/I.java<br>p010c/l.java<br>p010c/w.java<br>p010c/x.java<br>p013c2/g.java<br>p015d/c.java<br>p015d/d.java<br>p015d/e.java<br>p015d/f.java<br>p015d/g.java<br>p016d0/a.java<br>... +46 more |
| `P0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-2.<anonymou... | p028g2/C2152u.java<br>p085u1/j.java<br>p102x3/Za.java |
| `P4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p082t2/A.java<br>p105y1/C2800k.java<br>p105y1/t.java |
| `P5` | renamed: o | p105y1/D.java |
| `Pa` | renamed: o, r | ; related: GlobalHomeScreen-adjacent (x3) | p083t3/a1.java<br>p083t3/b1.java<br>p083t3/C2291i0.java |
| `PC` | trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anony... | p082t2/j1.java<br>p082t2/n1.java<br>p082t2/q1.java |
| `PDFProcessor` | **[KNOWN]** PDFProcessor (JNI wrapper: processPage, removeLogo, fillRegion, invertRegion, ... | p083t3/C2291i0.java<br>p083t3/C2294k.java<br>p083t3/X.java<br>p083t3/Y.java<br>p092v3/n.java<br>p092v3/o.java<br>p092v3/q.java<br>p102x3/A4.java<br>p102x3/A9.java<br>p102x3/AbstractC2782z7.java<br>p102x3/AbstractC2783z8.java<br>p102x3/B7.java<br>p102x3/C2382a6.java<br>p102x3/C2463f7.java<br>p102x3/C2476g4.java<br>... +24 more |
| `PrintOrderViewModel` | **[KNOWN]** PrintOrderViewModel (unobfuscated twin of p083t3/Y) renamed: f0, A | p042j3/c.java<br>p083t3/A0.java<br>p083t3/a1.java<br>p083t3/B0.java<br>p083t3/b1.java<br>p083t3/c1.java<br>p083t3/C2275a0.java<br>p083t3/C2277b0.java<br>p083t3/C2279c0.java<br>p083t3/C2281d0.java<br>p083t3/C2282e.java<br>p083t3/C2287g0.java<br>p083t3/C2288h.java<br>p083t3/C2289h0.java<br>p083t3/C2290i.java<br>... +89 more |
| `q` | renamed: A, B | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>com/notescrafter/service/NotesCrafterFCMService.java<br>p010c/m.java<br>p012c1/d.java<br>p028g2/C2141i.java<br>p028g2/C2142j.java<br>p028g2/U.java<br>p036i2/e.java<br>p042j3/c.java<br>p051l3/d.java<br>p060n3/e.java<br>p060n3/f.java<br>p065o3/a.java<br>p065o3/c.java<br>... +59 more |
| `Q0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-3.<anonymou... | p082t2/Y.java |
| `Q3` | trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:91) ren... | p082t2/A.java<br>p082t2/j1.java<br>p082t2/n1.java |
| `q4` | trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous> (EnhanceScreen.kt... | p082t2/A.java<br>p082t2/C2272z.java |
| `Q8` | trace: com.notescrafter.ui.screens.MergeStepItem (PdfMergeScreen.kt:1057); com.notescrafte... | p083t3/L.java<br>p090v1/z0.java |
| `Qd` | trace: com.notescrafter.ui.screens.Particle (ProcessingScreen.kt:347); com.notescrafter.ui... | p083t3/L.java<br>p097w3/a.java |
| `R` |  | com/notescrafter/MainActivity.java<br>p003a2/a.java<br>p010c/I.java<br>p010c/m.java<br>p012c1/d.java<br>p030h/a.java<br>p030h/b.java<br>p042j3/c.java<br>p074r0/h.java<br>p082t2/AbstractC2261t0.java<br>p083t3/C2282e.java<br>p083t3/C2290i.java<br>p083t3/C2292j.java<br>p083t3/C2307q0.java<br>p083t3/L.java<br>... +24 more |
| `r0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-4.<anonymou... | p067p1/c.java<br>p067p1/d.java |
| `R3` | renamed: o, r | p033h3/n.java<br>p082t2/C2272z.java |
| `R4` | **[KNOWN]** LogoSelectionScreen confirm lambda (saves logoBox+logoShape, closes dialog) re... | p082t2/A.java<br>p083t3/F.java<br>p083t3/K0.java<br>p083t3/L0.java<br>p083t3/M0.java<br>p083t3/N0.java |
| `R9` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<ano... | p090v1/z0.java |
| `Rb` | trace: com.notescrafter.ui.screens.AnimatedPromoBanner (PrintLandingScreen.kt:289); com.no... | p083t3/C2292j.java<br>p083t3/L.java<br>p097w3/a.java |
| `RD` | renamed: a, b | p012c1/c.java<br>p083t3/C2292j.java<br>p090v1/u0.java<br>p104y0/m.java |
| `ReviewHelper` | **[KNOWN]** ReviewHelper (in-app review) | p033h3/f.java<br>p102x3/C2384a8.java<br>p102x3/C2415c7.java<br>p102x3/C2462f6.java<br>p102x3/C2513i9.java<br>p102x3/C2725ve.java<br>p102x3/C2751x8.java<br>p102x3/P8.java<br>p102x3/X9.java |
| `RunnableC0691d` | renamed: c, o | p010c/l.java<br>p010c/m.java<br>p010c/RunnableC0691d.java<br>p036i2/e.java |
| `RunnableC2225b` | renamed: t2, o | p082t2/C2258s.java<br>p082t2/RunnableC2225b.java |
| `RunnableC2234f0` | renamed: t2, o | p082t2/C2267w0.java<br>p082t2/RunnableC2234f0.java |
| `RunnableC2240i0` | renamed: t2, o | ; ui: SettingsScreen | p082t2/BinderC2238h0.java<br>p082t2/RunnableC2240i0.java |
| `RunnableC2242j0` | renamed: t2, o | p082t2/BinderC2238h0.java<br>p082t2/RunnableC2242j0.java |
| `RunnableC2244k0` | renamed: t2, o | p082t2/BinderC2238h0.java<br>p082t2/C2267w0.java<br>p082t2/RunnableC2244k0.java |
| `RunnableC2248m0` | renamed: t2, o | p082t2/RunnableC2248m0.java |
| `RunnableC2266w` | renamed: t2, o | p082t2/P.java<br>p082t2/RunnableC2266w.java |
| `RunnableC2269x0` | renamed: t2, o | p082t2/C2267w0.java<br>p082t2/RunnableC2269x0.java |
| `RunnableC2270y` | renamed: t2, o | p033h3/k.java<br>p082t2/RunnableC2270y.java |
| `RunnableC2273z0` | renamed: t2, o | p082t2/C2267w0.java<br>p082t2/RunnableC2273z0.java |
| `RunnableC2791b` | renamed: y1, o | p105y1/C2796g.java<br>p105y1/RunnableC2791b.java |
| `RunnableC2798i` | renamed: y1, o | p105y1/C2799j.java<br>p105y1/DialogInterfaceOnClickListenerC2794e.java<br>p105y1/RunnableC2798i.java |
| `s` | renamed: A, B | com/notescrafter/MainActivity.java<br>p012c1/d.java<br>p074r0/b.java<br>p092v3/h.java<br>p092v3/j.java<br>p092v3/k.java<br>p102x3/Ub.java<br>p109z0/l.java |
| `s0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-5.<anonymou... | p067p1/h.java |
| `S1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-6.<anonymo... | p064o2/X.java |
| `S2` |  | p109z0/l.java<br>p111z2/b.java |
| `S3` | trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:160) re... | p082t2/A.java |
| `S6` | trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonym... | p085u1/k.java<br>p090v1/AbstractC2360n.java<br>p090v1/C2358m.java<br>p090v1/C2366q.java<br>p100x1/c.java<br>p105y1/A.java |
| `S7` | trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anon... | p003a2/a.java |
| `S8` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p090v1/z0.java |
| `S9` | trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous> (PdfToJpgScreen.... | p090v1/I0.java |
| `SD` | trace: com.notescrafter.ui.screens.QuickToolsScreen.<anonymous>.<anonymous>.<anonymous>.<a... | p012c1/c.java<br>p104y0/m.java |
| `T` | renamed: a, b | com/notescrafter/MainActivity.java<br>com/notescrafter/PrintOrderViewModel.java<br>p012c1/d.java<br>p014c3/a.java<br>p045k1/j.java<br>p083t3/A0.java<br>p083t3/B0.java<br>p083t3/c1.java<br>p083t3/C2277b0.java<br>p083t3/C2282e.java<br>p083t3/C2287g0.java<br>p083t3/C2289h0.java<br>p083t3/C2293j0.java<br>p083t3/C2295k0.java<br>p083t3/C2299m0.java<br>... +50 more |
| `t0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-6.<anonymou... | p042j3/c.java<br>p067p1/g.java<br>p105y1/BinderC2797h.java |
| `T3` | renamed: o | p082t2/C2272z.java<br>p090v1/u0.java<br>p105y1/t.java |
| `T9` | renamed: o, r | ; ui: AddressScreen; SettingsScreen | p083t3/F.java |
| `ToDoItem` | **[KNOWN]** ToDoItem model | p083t3/C2306q.java<br>p083t3/F.java<br>p102x3/C2525j5.java<br>p102x3/C2546ka.java<br>p102x3/C2562la.java<br>p102x3/C2594na.java<br>p102x3/C2737wa.java<br>p102x3/Da.java<br>p102x3/Ea.java<br>p102x3/Fa.java<br>p102x3/Ja.java<br>p102x3/N3.java<br>p102x3/Ne.java<br>p102x3/Xe.java<br>p102x3/Ye.java |
| `ToDoManager` | **[KNOWN]** ToDoManager (todo storage) | p083t3/C2306q.java<br>p083t3/F.java<br>p102x3/C2463f7.java<br>p102x3/C2546ka.java<br>p102x3/C2562la.java<br>p102x3/C2579mb.java<br>p102x3/C2594na.java<br>p102x3/C2610oa.java<br>p102x3/C2785za.java<br>p102x3/Da.java<br>p102x3/Ea.java<br>p102x3/Fa.java<br>p102x3/Ga.java<br>p102x3/Ja.java<br>p102x3/Ve.java<br>... +3 more |
| `U` |  | p010c/l.java<br>p012c1/d.java<br>p014c3/a.java<br>p033h3/q.java<br>p036i2/e.java<br>p042j3/c.java<br>p045k1/j.java<br>p046k2/h.java<br>p078s1/a.java<br>p078s1/d.java<br>p083t3/L.java<br>p083t3/S.java<br>p083t3/W.java<br>p083t3/X.java<br>p083t3/Y.java<br>... +8 more |
| `u0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-7.<anonymou... | com/notescrafter/utils/ReviewHelper.java<br>p020e1/h.java<br>p082t2/j1.java<br>p109z0/l.java |
| `u4` | renamed: o, r | ; related: PDFProcessor | p082t2/A.java |
| `U7` | renamed: o, r | p042j3/c.java<br>p067p1/c.java<br>p067p1/h.java |
| `U8` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p090v1/z0.java |
| `U9` | renamed: o | p090v1/C2358m.java |
| `Ua` | trace: com.notescrafter.ui.screens.PageThumbnail (PreviewScreen.kt:607); com.notescrafter.... | p083t3/L.java |
| `Ud` | trace: com.notescrafter.ui.screens.QuickToolsScreen (QuickToolsScreen.kt:62); com.notescra... | p083t3/C2292j.java<br>p083t3/L.java |
| `V` |  | p003a2/a.java<br>p012c1/d.java<br>p015d/f.java<br>p015d/h.java<br>p015d/o.java<br>p082t2/n1.java<br>p082t2/RunnableC2248m0.java<br>p083t3/C2290i.java<br>p083t3/C2293j0.java<br>p083t3/C2294k.java<br>p083t3/C2303o0.java<br>p083t3/C2306q.java<br>p083t3/C2316v0.java<br>p083t3/F.java<br>p083t3/J0.java<br>... +13 more |
| `V0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-8.<anonymou... | com/notescrafter/PrintOrderViewModel.java<br>p082t2/j1.java<br>p082t2/P.java |
| `V3` | renamed: o | p083t3/F.java<br>p097w3/g.java |
| `v4` | renamed: o | p082t2/A.java<br>p082t2/C2243k.java<br>p082t2/j1.java |
| `Va` | renamed: o | ; related: GlobalHomeScreen-adjacent (x3) | p083t3/a1.java<br>p083t3/b1.java<br>p083t3/C2291i0.java<br>p083t3/F.java<br>p083t3/O0.java<br>p083t3/P0.java |
| `W` | renamed: b, c | p014c3/a.java<br>p028g2/C2142j.java<br>p036i2/e.java<br>p045k1/j.java<br>p046k2/h.java<br>p062o0/a.java<br>p111z2/b.java |
| `W0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-9.<anonymou... | com/notescrafter/PrintOrderViewModel.java<br>p082t2/q1.java<br>p090v1/u0.java |
| `W3` | renamed: o, r | p082t2/C2233f.java |
| `w4` | renamed: o, r | p082t2/A.java |
| `X` | renamed: a | com/notescrafter/PrintOrderViewModel.java<br>p011c0/d.java<br>p014c3/a.java<br>p019e0/b.java<br>p023f0/b.java<br>p028g2/B.java<br>p028g2/C2141i.java<br>p028g2/C2142j.java<br>p028g2/C2152u.java<br>p028g2/C2154w.java<br>p028g2/P.java<br>p028g2/U.java<br>p028g2/V.java<br>p028g2/W.java<br>p036i2/e.java<br>... +10 more |
| `X0` | renamed: a, b | p082t2/P.java<br>p082t2/q1.java |
| `X1` | trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-1.<an... | p012c1/c.java<br>p082t2/P.java |
| `X3` | **[KNOWN]** DownloadsScreen.kt ("My Downloads", empty state, file list) trace: com.notescr... | p082t2/C2272z.java<br>p083t3/C2288h.java<br>p083t3/L.java |
| `x4` | renamed: o, r | ; related: PDFProcessor | p082t2/A.java |
| `X7` | renamed: A, B | p033h3/r.java |
| `X8` | trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<... | p090v1/z0.java |
| `y` | renamed: a, b | p010c/m.java<br>p014c3/a.java<br>p036i2/e.java<br>p082t2/C2223a.java<br>p082t2/C2267w0.java<br>p083t3/C2280d.java<br>p092v3/u.java |
| `Y0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-1.<anonym... | p033h3/k.java<br>p082t2/q1.java |
| `Y3` | renamed: o | p082t2/C2233f.java<br>p083t3/C2290i.java |
| `Ye` | trace: com.notescrafter.ui.screens.AnalogClock (ToDoScreen.kt:841); com.notescrafter.ui.sc... | p083t3/L.java<br>p097w3/a.java |
| `Z` | renamed: b, a | com/notescrafter/PrintOrderViewModel.java<br>p010c/m.java<br>p011c0/d.java<br>p014c3/a.java<br>p019e0/b.java<br>p023f0/b.java<br>p036i2/e.java<br>p083t3/S.java<br>p102x3/Bc.java<br>p102x3/C2707uc.java<br>p102x3/Gd.java |
| `Z0` | trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-2.<anonym... | p033h3/k.java<br>p042j3/c.java<br>p082t2/P.java<br>p082t2/q1.java |
| `Z3` | renamed: o, r | p082t2/C2272z.java |
| `Z4` | **[KNOWN]** EnhanceScreen.kt composables (SectionTitle:540, FilterToggle:592, DropdownSele... | p083t3/C2294k.java<br>p083t3/L.java |
| `Z9` | trace: com.notescrafter.ui.screens.PdfToJpgScreen (PdfToJpgScreen.kt:73); com.notescrafter... | p083t3/L.java |
| `Ze` | renamed: a, b | p083t3/C2290i.java |
