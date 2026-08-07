# NotesCrafter FULL app-source index (1,937 obfuscated + 11 original files)

> All app-owned decompiled sources (jadx) of com.notescrafter v4.0.8.
> Layout: `full-src/pNNNx/...` = obfuscated app packages (jadx names preserved), `full-src/com/notescrafter/...` = unobfuscated original.
> Stats: 1948 files total; 703 files carry original Kotlin names via compose trace strings; 43 files hand-labeled (verified during RE sessions).
> How to find a page: grep the `trace:` column for `com.notescrafter.ui...` â€” it reveals the true Kotlin file+line of every composable.
> Companion docs: `22-landing-screen-implementation-map.md`, `21-home-screen-re-files.md`, `removeLogo.txt`.

## Package map (identified so far)

| Package | Files | Role (verified / by trace evidence) |
|---|---|---|
| p102x3 | 760 | **ui.screens** â€” LandingScreen, GlobalHomeScreen, DownloadsScreen, EnhanceScreen, LogoSelectionScreen, UploadScreen, ... (all screen composables + lambdas) |
| p083t3 | 101 | **navigation/viewmodel** â€” router L, scaffold S/M, PrintOrderViewModel Y, top bar, route lambdas |
| p097w3 | 16 | **ui.components** â€” BottomNavBar (f), GlassCard (j), shared cards |
| p107y3 | 3 | **ui.theme** â€” DesignTokens (a), NotesCrafterTheme (b) |
| p087u3 | 22 | **data/service layer** â€” FilterSettings (b), output settings, uri helpers |
| p090v1 | 93 | pending - trace column exposes identity per file |
| p082t2 | 121 | pending (see trace column) |
| p064o2 | 68 | pending (see trace column) |
| p028g2 | 52 | pending (see trace column) |
| ... | | all other p-packages: trace column reveals identity |

## Full index

| `com\notescrafter\MainActivity.java` | MainActivity | **[KNOWN]** MainActivity.kt (launcher: adb, razorpay, ads, setContent) renamed: N, H |
| `com\notescrafter\NotesCrafterApp.java` | NotesCrafterApp | **[KNOWN]** NotesCrafterApp (Application class) |
| `com\notescrafter\PrintOrderViewModel.java` | PrintOrderViewModel | **[KNOWN]** PrintOrderViewModel (unobfuscated twin of p083t3/Y) renamed: f0, A |
| `com\notescrafter\service\NotesCrafterFCMService.java` | NotesCrafterFCMService | **[KNOWN]** FCM push service renamed: v |
| `com\notescrafter\service\PDFProcessor.java` | PDFProcessor | **[KNOWN]** PDFProcessor (JNI wrapper: processPage, removeLogo, fillRegion, invertRegion, initPdfWriter, writePageNative...) renamed: a |
| `com\notescrafter\utils\AnalyticsManager.java` | AnalyticsManager | **[KNOWN]** AnalyticsManager (logCtaClick) |
| `com\notescrafter\utils\ExamItem.java` | ExamItem | **[KNOWN]** ExamItem model |
| `com\notescrafter\utils\NetworkUtils.java` | NetworkUtils | **[KNOWN]** NetworkUtils |
| `com\notescrafter\utils\ReviewHelper.java` | ReviewHelper | **[KNOWN]** ReviewHelper (in-app review) |
| `com\notescrafter\utils\ToDoItem.java` | ToDoItem | **[KNOWN]** ToDoItem model |
| `com\notescrafter\utils\ToDoManager.java` | ToDoManager | **[KNOWN]** ToDoManager (todo storage) |
| `p000a\a.java` | a |  |
| `p001a0\a.java` | a |  renamed: a, b |
| `p002a1\a.java` |  |  renamed: a |
| `p002a1\b.java` | b |  renamed: o |
| `p002a1\c.java` | c |  renamed: o, r |
| `p002a1\d.java` | d |  renamed: o |
| `p002a1\e.java` | e |  renamed: a |
| `p003a2\a.java` | a |  trace: com.notescrafter.ui.screens.LiveChatScreen (LiveChatScreen.kt:23) renamed: a, b |
| `p003a2\b.java` | b |  renamed: o |
| `p003a2\c.java` | c |  renamed: b, a |
| `p004a3\a.java` | a |  |
| `p005b\a.java` | a |  renamed: o |
| `p005b\b.java` | b |  renamed: o |
| `p005b\c.java` | c |  |
| `p006b0\a.java` | a |  renamed: o |
| `p006b0\b.java` | b |  renamed: a |
| `p007b1\a.java` | a |  renamed: a, b |
| `p007b1\b.java` | b |  renamed: a |
| `p007b1\c.java` | c |  renamed: a |
| `p007b1\d.java` | d |  renamed: o, r |
| `p007b1\e.java` | e |  |
| `p008b2\a.java` | a |  |
| `p008b2\b.java` | b |  |
| `p008b2\c.java` | c |  |
| `p008b2\d.java` | d |  |
| `p009b3\a.java` | a |  renamed: a, b |
| `p009b3\b.java` |  |  renamed: o |
| `p009b3\c.java` | c |  renamed: m, a |
| `p009b3\d.java` | d |  |
| `p009b3\e.java` | e |  |
| `p009b3\f.java` | f |  renamed: a, b |
| `p009b3\g.java` | g |  renamed: a |
| `p009b3\h.java` | h |  renamed: a, b |
| `p009b3\i.java` | i |  |
| `p009b3\j.java` | j |  renamed: b, c |
| `p010c\A.java` | A |  renamed: a, b |
| `p010c\B.java` | B |  renamed: a |
| `p010c\C.java` | C |  renamed: o, r |
| `p010c\C0688a.java` | C0688a |  renamed: c, a |
| `p010c\C0689b.java` | C0689b |  renamed: c, a |
| `p010c\C0692e.java` |  |  renamed: c, o |
| `p010c\C0693f.java` |  |  renamed: c, o |
| `p010c\C0694g.java` | C0694g |  renamed: c, a |
| `p010c\C0695h.java` | C0695h |  renamed: c, a |
| `p010c\D.java` | D |  renamed: o |
| `p010c\E.java` |  |  renamed: o |
| `p010c\F.java` | F |  renamed: a, b |
| `p010c\G.java` | G |  |
| `p010c\H.java` | H |  renamed: a, b |
| `p010c\I.java` | I |  renamed: o |
| `p010c\InterfaceC0690c.java` | InterfaceC0690c |  renamed: c |
| `p010c\j.java` |  |  renamed: o, r |
| `p010c\k.java` | k |  renamed: a, b |
| `p010c\l.java` | l |  renamed: o |
| `p010c\m.java` | m |  renamed: G, A |
| `p010c\n.java` | n |  |
| `p010c\o.java` | o |  renamed: a |
| `p010c\p.java` | p |  |
| `p010c\q.java` | q |  |
| `p010c\r.java` | r |  |
| `p010c\RunnableC0691d.java` |  |  renamed: c, o |
| `p010c\s.java` | s |  |
| `p010c\t.java` | t |  |
| `p010c\u.java` | u |  renamed: a, b |
| `p010c\v.java` | v |  renamed: a, b |
| `p010c\ViewTreeObserverOnDrawListenerC0696i.java` | ViewTreeObserverOnDrawListenerC0696i |  renamed: c, o |
| `p010c\w.java` | w |  renamed: o |
| `p010c\x.java` | x |  renamed: o |
| `p010c\z.java` | z |  renamed: a |
| `p011c0\a.java` | a |  renamed: b |
| `p011c0\b.java` | b |  |
| `p011c0\c.java` | c |  renamed: a |
| `p011c0\d.java` | d |  renamed: a |
| `p011c0\e.java` | e |  |
| `p011c0\f.java` | f |  renamed: a, b |
| `p012c1\a.java` | a |  renamed: c, d |
| `p012c1\b.java` | b |  renamed: a, b |
| `p012c1\c.java` | c |  renamed: o, l |
| `p012c1\d.java` | d |  renamed: a, b |
| `p013c2\a.java` |  |  |
| `p013c2\b.java` | b |  |
| `p013c2\c.java` | c |  |
| `p013c2\d.java` | d |  renamed: a, b |
| `p013c2\e.java` | e |  renamed: f, h |
| `p013c2\f.java` | f |  renamed: o |
| `p013c2\g.java` | g |  renamed: a, b |
| `p013c2\h.java` | h |  |
| `p013c2\i.java` | i |  renamed: a |
| `p013c2\j.java` | j |  |
| `p013c2\k.java` | k |  |
| `p014c3\a.java` | a |  renamed: a, b |
| `p014c3\b.java` | b |  renamed: a, b |
| `p014c3\c.java` | c |  renamed: c, a |
| `p015d\a.java` | a |  renamed: a |
| `p015d\b.java` | b |  renamed: a, b |
| `p015d\c.java` | c |  renamed: o, r |
| `p015d\d.java` | d |  renamed: r, o |
| `p015d\e.java` | e |  renamed: o |
| `p015d\f.java` | f |  renamed: o, r |
| `p015d\g.java` | g |  renamed: o, r |
| `p015d\h.java` | h |  renamed: d |
| `p015d\i.java` | i |  renamed: a |
| `p015d\j.java` | j |  renamed: a |
| `p015d\k.java` | k |  renamed: a |
| `p015d\l.java` | l |  renamed: c, d |
| `p015d\m.java` | m |  renamed: o |
| `p015d\n.java` | n |  renamed: o, r |
| `p015d\o.java` | o |  renamed: d, f |
| `p015d\p.java` | p |  renamed: o |
| `p016d0\a.java` | a |  renamed: o |
| `p016d0\b.java` | b |  renamed: a |
| `p017d1\a.java` | a |  |
| `p017d1\b.java` | b |  renamed: a, b |
| `p017d1\c.java` | c |  renamed: a, b |
| `p017d1\d.java` | d |  renamed: a, b |
| `p017d1\e.java` | e |  renamed: a, b |
| `p017d1\f.java` | f |  renamed: a, b |
| `p017d1\g.java` | g |  renamed: a, b |
| `p017d1\h.java` | h |  renamed: a, b |
| `p017d1\i.java` | i |  renamed: a |
| `p017d1\j.java` | j |  renamed: a |
| `p017d1\k.java` | k |  renamed: a, b |
| `p017d1\l.java` | l |  renamed: a, b |
| `p017d1\m.java` | m |  renamed: a |
| `p017d1\n.java` | n |  renamed: a, b |
| `p017d1\o.java` | o |  |
| `p017d1\p.java` | p |  renamed: o |
| `p017d1\q.java` | q |  |
| `p017d1\r.java` | r |  |
| `p017d1\s.java` | s |  |
| `p017d1\t.java` | t |  renamed: o |
| `p017d1\u.java` | u |  renamed: o |
| `p017d1\v.java` | v |  |
| `p017d1\w.java` | w |  renamed: o |
| `p018d3\a.java` | a |  renamed: a, b |
| `p018d3\b.java` | b |  renamed: a, b |
| `p018d3\c.java` | c |  renamed: d, a |
| `p018d3\d.java` | d |  renamed: d, a |
| `p019e0\a.java` | a |  renamed: o |
| `p019e0\b.java` | b |  renamed: a |
| `p019e0\c.java` | c |  renamed: a, b |
| `p019e0\d.java` | d |  renamed: o |
| `p020e1\a.java` | a |  renamed: a, b |
| `p020e1\b.java` | b |  renamed: a, b |
| `p020e1\c.java` | c |  renamed: a, b |
| `p020e1\d.java` | d |  renamed: a, b |
| `p020e1\e.java` | e |  renamed: a |
| `p020e1\f.java` | f |  renamed: a, b |
| `p020e1\g.java` | g |  renamed: a, b |
| `p020e1\h.java` | h |  renamed: a, b |
| `p020e1\i.java` | i |  renamed: a, b |
| `p020e1\j.java` | j |  renamed: a, b |
| `p020e1\k.java` | k |  renamed: o, r |
| `p020e1\l.java` | l |  renamed: a, b |
| `p020e1\m.java` | m |  renamed: a |
| `p020e1\n.java` | n |  renamed: a |
| `p020e1\o.java` | o |  renamed: a, b |
| `p020e1\p.java` | p |  renamed: a, b |
| `p021e2\a.java` | a |  |
| `p022f\a.java` | a |  renamed: o |
| `p022f\b.java` | b |  |
| `p022f\c.java` | c |  renamed: a, b |
| `p022f\d.java` | d |  renamed: o |
| `p022f\e.java` | e |  renamed: c, d |
| `p022f\f.java` | f |  |
| `p022f\g.java` | g |  renamed: o, r |
| `p023f0\a.java` | a |  renamed: l, m |
| `p023f0\b.java` | b |  renamed: d, b |
| `p024f2\a.java` | a |  renamed: y |
| `p024f2\b.java` | b |  renamed: o |
| `p025f3\a.java` | a |  renamed: a |
| `p026g0\a.java` | a |  renamed: s, r |
| `p026g0\b.java` | b |  renamed: o |
| `p027g1\a.java` | a |  renamed: o |
| `p027g1\b.java` | b |  |
| `p028g2\A.java` | A |  renamed: o |
| `p028g2\a0.java` | a0 |  renamed: o |
| `p028g2\AbstractC2144l.java` | AbstractC2144l |  renamed: g2 |
| `p028g2\B.java` | B |  renamed: o, r |
| `p028g2\C.java` | C |  renamed: o |
| `p028g2\C2134b.java` | C2134b |  renamed: g2 |
| `p028g2\C2136d.java` | C2136d |  renamed: g2 |
| `p028g2\C2138f.java` | C2138f |  renamed: g2, o |
| `p028g2\C2139g.java` | C2139g |  renamed: g2, o |
| `p028g2\C2140h.java` | C2140h |  renamed: g2, o |
| `p028g2\C2141i.java` | C2141i |  renamed: g2, o |
| `p028g2\C2142j.java` | C2142j |  renamed: g2, o |
| `p028g2\C2143k.java` | C2143k |  renamed: g2, o |
| `p028g2\C2145m.java` | C2145m |  renamed: g2, o |
| `p028g2\C2146n.java` | C2146n |  renamed: g2 |
| `p028g2\C2147o.java` | C2147o |  renamed: g2, o |
| `p028g2\C2149q.java` | C2149q |  renamed: g2 |
| `p028g2\C2150s.java` | C2150s |  renamed: g2, o |
| `p028g2\C2151t.java` | C2151t |  renamed: g2, o |
| `p028g2\C2152u.java` | C2152u |  renamed: g2, o |
| `p028g2\C2153v.java` | C2153v |  renamed: g2, A |
| `p028g2\C2154w.java` | C2154w |  renamed: g2, o |
| `p028g2\C2155x.java` | C2155x |  renamed: g2, o |
| `p028g2\C2156y.java` | C2156y |  renamed: g2, o |
| `p028g2\C2157z.java` | C2157z |  renamed: g2 |
| `p028g2\D.java` | D |  |
| `p028g2\E.java` | E |  renamed: o |
| `p028g2\EnumC2135c.java` | EnumC2135c |  renamed: g2, o |
| `p028g2\EnumC2137e.java` | EnumC2137e |  renamed: g2, o |
| `p028g2\EnumC2148p.java` | EnumC2148p |  renamed: g2, o |
| `p028g2\F.java` | F |  renamed: o |
| `p028g2\G.java` | G |  |
| `p028g2\H.java` | H |  renamed: o |
| `p028g2\I.java` | I |  renamed: o |
| `p028g2\InterfaceC2133a.java` | InterfaceC2133a |  renamed: g2 |
| `p028g2\J.java` | J |  renamed: o |
| `p028g2\K.java` | K |  renamed: o |
| `p028g2\L.java` | L |  renamed: o |
| `p028g2\M.java` | M |  renamed: o |
| `p028g2\N.java` | N |  renamed: o |
| `p028g2\O.java` | O |  renamed: o |
| `p028g2\P.java` | P |  renamed: o, r |
| `p028g2\Q.java` | Q |  renamed: o |
| `p028g2\r.java` | r |  renamed: o |
| `p028g2\S.java` | S |  renamed: o |
| `p028g2\T.java` | T |  |
| `p028g2\U.java` | U |  renamed: a |
| `p028g2\V.java` | V |  renamed: o |
| `p028g2\W.java` | W |  renamed: o |
| `p028g2\X.java` | X |  renamed: o, r |
| `p028g2\Y.java` | Y |  renamed: o |
| `p028g2\Z.java` | Z |  |
| `p029g3\a.java` | a |  renamed: r, s |
| `p030h\a.java` | a |  renamed: a, b |
| `p030h\b.java` | b |  renamed: d, a |
| `p031h0\a.java` | a |  renamed: a |
| `p032h2\a.java` | a |  renamed: a |
| `p032h2\b.java` | b |  renamed: o |
| `p032h2\c.java` | c |  renamed: o |
| `p032h2\d.java` | d |  |
| `p033h3\A.java` | A |  renamed: o |
| `p033h3\B.java` | B |  renamed: a, b |
| `p033h3\C.java` | C |  renamed: o, r |
| `p033h3\C2159a.java` | C2159a |  renamed: h3, a |
| `p033h3\C2160b.java` | C2160b |  renamed: h3, a |
| `p033h3\C2161c.java` | C2161c |  renamed: h3, a |
| `p033h3\d.java` | d |  renamed: a |
| `p033h3\e.java` | e |  renamed: a |
| `p033h3\f.java` |  |  renamed: o |
| `p033h3\g.java` | g |  renamed: o, r |
| `p033h3\j.java` | j |  renamed: c, d |
| `p033h3\k.java` | k |  renamed: o |
| `p033h3\m.java` |  |  renamed: o, r |
| `p033h3\n.java` | n |  renamed: o |
| `p033h3\o.java` | o |  renamed: a |
| `p033h3\q.java` | q |  renamed: o |
| `p033h3\r.java` | r |  renamed: s, o |
| `p033h3\s.java` | s |  renamed: d, a |
| `p033h3\t.java` | t |  renamed: d, a |
| `p033h3\u.java` | u |  renamed: c, a |
| `p033h3\w.java` | w |  renamed: i, j |
| `p033h3\x.java` | x |  renamed: a, b |
| `p033h3\y.java` | y |  renamed: v, o |
| `p033h3\z.java` | z |  renamed: a, b |
| `p034i\a.java` | a |  renamed: o |
| `p034i\b.java` | b |  renamed: a |
| `p034i\c.java` | c |  renamed: o |
| `p035i0\a.java` |  |  |
| `p035i0\b.java` | b |  renamed: o |
| `p036i2\a.java` | a |  renamed: a |
| `p036i2\b.java` | b |  |
| `p036i2\c.java` | c |  renamed: o |
| `p036i2\d.java` | d |  |
| `p036i2\e.java` | e |  renamed: s, o |
| `p036i2\f.java` | f |  renamed: A, y |
| `p037i3\a.java` | a |  renamed: o |
| `p037i3\b.java` | b |  renamed: o |
| `p037i3\c.java` | c |  renamed: o |
| `p037i3\d.java` | d |  renamed: a, b |
| `p037i3\e.java` | e |  renamed: a |
| `p038j\a.java` | a |  renamed: s |
| `p038j\b.java` | b |  renamed: o |
| `p038j\c.java` | c |  renamed: o, r |
| `p038j\d.java` | d |  renamed: o |
| `p038j\e.java` | e |  |
| `p038j\f.java` | f |  renamed: o, r |
| `p039j0\a.java` | a |  renamed: o |
| `p039j0\b.java` | b |  renamed: o, r |
| `p039j0\c.java` | c |  renamed: o |
| `p039j0\d.java` | d |  renamed: a |
| `p040j1\a.java` | a |  renamed: f, a |
| `p040j1\b.java` | b |  |
| `p041j2\a.java` | a |  |
| `p041j2\b.java` | b |  renamed: y, z |
| `p041j2\c.java` | c |  |
| `p041j2\d.java` | d |  renamed: N |
| `p041j2\e.java` | e |  renamed: a, b |
| `p041j2\f.java` | f |  renamed: a |
| `p041j2\g.java` | g |  renamed: a |
| `p041j2\h.java` | h |  renamed: N |
| `p041j2\i.java` | i |  |
| `p041j2\j.java` | j |  renamed: N |
| `p041j2\k.java` | k |  |
| `p041j2\l.java` | l |  |
| `p042j3\a.java` | a |  renamed: a, b |
| `p042j3\b.java` | b |  renamed: a, b |
| `p042j3\c.java` | c |  renamed: o |
| `p043k\a.java` | a |  renamed: o |
| `p043k\b.java` | b |  renamed: o |
| `p043k\c.java` | c |  renamed: o |
| `p043k\d.java` | d |  renamed: a, b |
| `p044k0\a.java` | a |  renamed: o |
| `p044k0\b.java` | b |  renamed: a |
| `p045k1\a.java` |  |  |
| `p045k1\b.java` | b |  renamed: a, b |
| `p045k1\c.java` | c |  renamed: a, b |
| `p045k1\d.java` | d |  renamed: a, b |
| `p045k1\e.java` | e |  renamed: o, r |
| `p045k1\f.java` |  |  renamed: o, r |
| `p045k1\i.java` |  |  renamed: o |
| `p045k1\j.java` | j |  renamed: a, b |
| `p045k1\k.java` | k |  renamed: a, b |
| `p046k2\a.java` | a |  renamed: o |
| `p046k2\b.java` | b |  |
| `p046k2\c.java` | c |  renamed: a, b |
| `p046k2\d.java` | d |  renamed: a |
| `p046k2\e.java` | e |  renamed: o |
| `p046k2\f.java` | f |  |
| `p046k2\g.java` | g |  |
| `p046k2\h.java` |  |  renamed: o |
| `p047l\A.java` | A |  renamed: f |
| `p047l\AbstractC2176g.java` | AbstractC2176g |  renamed: l, a |
| `p047l\AbstractC2177h.java` | AbstractC2177h |  renamed: l, a |
| `p047l\AbstractC2178i.java` | AbstractC2178i |  renamed: l, a |
| `p047l\AbstractC2180k.java` | AbstractC2180k |  renamed: l, a |
| `p047l\AbstractC2181l.java` | AbstractC2181l |  renamed: l, a |
| `p047l\AbstractC2182m.java` | AbstractC2182m |  renamed: l, a |
| `p047l\AbstractC2183n.java` | AbstractC2183n |  renamed: l, a |
| `p047l\AbstractC2184o.java` | AbstractC2184o |  renamed: l, a |
| `p047l\AbstractC2185p.java` | AbstractC2185p |  renamed: l, a |
| `p047l\AbstractC2186q.java` | AbstractC2186q |  renamed: l, a |
| `p047l\AbstractC2187s.java` | AbstractC2187s |  renamed: l, a |
| `p047l\AbstractC2188t.java` | AbstractC2188t |  renamed: l, a |
| `p047l\AbstractC2190v.java` | AbstractC2190v |  renamed: l, a |
| `p047l\B.java` | B |  renamed: a, b |
| `p047l\C.java` | C |  renamed: f |
| `p047l\C2170a.java` | C2170a |  renamed: l, o |
| `p047l\C2171b.java` | C2171b |  renamed: l, o |
| `p047l\C2172c.java` | C2172c |  renamed: l, o |
| `p047l\C2173d.java` | C2173d |  renamed: l, o |
| `p047l\C2174e.java` | C2174e |  renamed: l, r |
| `p047l\C2175f.java` | C2175f |  renamed: l, o |
| `p047l\C2179j.java` | C2179j |  renamed: l, a |
| `p047l\C2189u.java` | C2189u |  renamed: l, o |
| `p047l\C2191w.java` | C2191w |  renamed: l, a |
| `p047l\C2192x.java` | C2192x |  renamed: l |
| `p047l\C2193y.java` | C2193y |  renamed: l, a |
| `p047l\C2194z.java` | C2194z |  renamed: l |
| `p047l\D.java` | D |  renamed: f |
| `p047l\E.java` | E |  renamed: a, b |
| `p047l\F.java` | F |  renamed: f |
| `p047l\G.java` | G |  renamed: f |
| `p047l\H.java` | H |  renamed: a, b |
| `p047l\I.java` | I |  renamed: a, b |
| `p047l\J.java` | J |  renamed: a, b |
| `p047l\K.java` | K |  renamed: o, r |
| `p047l\L.java` | L |  |
| `p047l\M.java` | M |  |
| `p047l\N.java` | N |  renamed: a, b |
| `p047l\O.java` | O |  renamed: a, b |
| `p047l\P.java` | P |  renamed: a |
| `p047l\Q.java` | Q |  renamed: a |
| `p047l\r.java` | r |  renamed: a, b |
| `p047l\S.java` | S |  renamed: o, r |
| `p047l\T.java` | T |  renamed: o |
| `p047l\U.java` | U |  renamed: a |
| `p047l\V.java` | V |  renamed: o, r |
| `p047l\W.java` | W |  renamed: a, b |
| `p047l\X.java` | X |  renamed: a |
| `p047l\Y.java` | Y |  renamed: o |
| `p047l\Z.java` | Z |  renamed: o, a |
| `p048l0\a.java` | a |  |
| `p048l0\b.java` | b |  renamed: a |
| `p048l0\c.java` | c |  |
| `p048l0\d.java` | d |  |
| `p049l1\a.java` | a |  renamed: f, a |
| `p049l1\b.java` | b |  renamed: a, b |
| `p049l1\c.java` | c |  |
| `p049l1\d.java` | d |  |
| `p049l1\e.java` |  |  renamed: o |
| `p049l1\f.java` | f |  |
| `p049l1\g.java` | g |  renamed: a, b |
| `p049l1\h.java` | h |  renamed: o, r |
| `p049l1\i.java` |  |  renamed: a |
| `p049l1\j.java` | j |  renamed: r, s |
| `p050l2\a.java` | a |  renamed: a |
| `p050l2\b.java` | b |  renamed: a, b |
| `p050l2\c.java` | c |  renamed: a |
| `p051l3\a.java` | a |  renamed: a |
| `p051l3\b.java` | b |  renamed: a, b |
| `p051l3\c.java` | c |  renamed: a |
| `p051l3\d.java` | d |  renamed: a, b |
| `p051l3\e.java` | e |  renamed: o |
| `p051l3\f.java` | f |  |
| `p051l3\g.java` | g |  |
| `p051l3\h.java` | h |  renamed: o |
| `p051l3\i.java` | i |  renamed: o |
| `p051l3\j.java` | j |  renamed: o |
| `p051l3\k.java` | k |  |
| `p051l3\o.java` | o |  renamed: o |
| `p051l3\p.java` | p |  |
| `p051l3\q.java` | q |  |
| `p052m\a.java` | a |  renamed: a, b |
| `p053m0\a.java` | a |  renamed: a |
| `p053m0\b.java` | b |  renamed: a |
| `p053m0\c.java` | c |  renamed: a, b |
| `p053m0\d.java` | d |  renamed: b |
| `p053m0\e.java` | e |  renamed: o, r |
| `p053m0\f.java` | f |  renamed: a |
| `p054m1\a.java` | a |  |
| `p054m1\b.java` | b |  |
| `p054m1\c.java` | c |  |
| `p055m2\a.java` | a |  renamed: a |
| `p056m3\a.java` |  |  |
| `p056m3\b.java` |  |  |
| `p057n\a.java` |  |  |
| `p057n\b.java` |  |  |
| `p057n\c.java` |  |  |
| `p057n\d.java` |  |  |
| `p057n\e.java` |  |  |
| `p058n0\a.java` | a |  renamed: a, b |
| `p058n0\b.java` | b |  |
| `p058n0\c.java` | c |  renamed: a, b |
| `p058n0\d.java` |  |  renamed: o |
| `p058n0\e.java` | e |  |
| `p058n0\f.java` | f |  |
| `p058n0\g.java` | g |  |
| `p058n0\h.java` | h |  renamed: a, b |
| `p058n0\i.java` | i |  renamed: a, b |
| `p058n0\j.java` | j |  renamed: a, b |
| `p059n2\a.java` | a |  renamed: a |
| `p060n3\a.java` | a |  renamed: o |
| `p060n3\b.java` | b |  renamed: o |
| `p060n3\c.java` | c |  renamed: o |
| `p060n3\d.java` | d |  renamed: a |
| `p060n3\e.java` | e |  renamed: a, b |
| `p060n3\f.java` | f |  renamed: o |
| `p060n3\g.java` | g |  renamed: a |
| `p060n3\h.java` | h |  renamed: o |
| `p060n3\i.java` | i |  renamed: o |
| `p060n3\j.java` | j |  renamed: o, r |
| `p060n3\k.java` | k |  renamed: o |
| `p060n3\l.java` | l |  renamed: o, r |
| `p060n3\m.java` | m |  renamed: w, o |
| `p060n3\n.java` | n |  |
| `p060n3\o.java` | o |  renamed: b |
| `p060n3\p.java` | p |  |
| `p060n3\q.java` | q |  renamed: a |
| `p060n3\r.java` | r |  renamed: b, c |
| `p060n3\s.java` | s |  renamed: b, c |
| `p060n3\t.java` | t |  renamed: b |
| `p060n3\u.java` | u |  |
| `p060n3\v.java` | v |  renamed: a |
| `p061o\a.java` |  |  |
| `p062o0\a.java` | a |  renamed: a, b |
| `p062o0\b.java` | b |  renamed: o |
| `p062o0\c.java` | c |  |
| `p062o0\d.java` | d |  renamed: j, b |
| `p062o0\e.java` | e |  renamed: a |
| `p062o0\f.java` | f |  renamed: a, b |
| `p062o0\g.java` | g |  renamed: a, b |
| `p062o0\h.java` | h |  renamed: w, o |
| `p062o0\i.java` | i |  |
| `p062o0\j.java` | j |  renamed: a, b |
| `p063o1\a.java` | a |  renamed: a, b |
| `p064o2\A.java` | A |  |
| `p064o2\a0.java` | a0 |  renamed: o |
| `p064o2\AbstractC2198a.java` | AbstractC2198a |  renamed: o2, b |
| `p064o2\AbstractC2201d.java` | AbstractC2201d |  renamed: o2 |
| `p064o2\AbstractC2205h.java` | AbstractC2205h |  renamed: o2, o |
| `p064o2\AbstractC2207j.java` | AbstractC2207j |  renamed: o2, a |
| `p064o2\AbstractC2210m.java` | AbstractC2210m |  renamed: o2, r |
| `p064o2\AbstractC2211n.java` | AbstractC2211n |  renamed: o2, o |
| `p064o2\AbstractC2212o.java` | AbstractC2212o |  renamed: o2 |
| `p064o2\AbstractC2216t.java` | AbstractC2216t |  renamed: o2, r |
| `p064o2\AbstractC2220x.java` | AbstractC2220x |  renamed: o2 |
| `p064o2\B.java` | B |  renamed: o |
| `p064o2\b0.java` | b0 |  renamed: o |
| `p064o2\C.java` | C |  renamed: o |
| `p064o2\c0.java` | c0 |  |
| `p064o2\C2199b.java` | C2199b |  renamed: o2, o |
| `p064o2\C2200c.java` | C2200c |  renamed: o2 |
| `p064o2\C2202e.java` | C2202e |  renamed: o2, o |
| `p064o2\C2203f.java` | C2203f |  renamed: o2, o |
| `p064o2\C2204g.java` | C2204g |  renamed: o2, o |
| `p064o2\C2206i.java` | C2206i |  renamed: o2, o |
| `p064o2\C2208k.java` | C2208k |  renamed: o2, r |
| `p064o2\C2209l.java` | C2209l |  renamed: o2, r |
| `p064o2\C2214q.java` | C2214q |  renamed: o2 |
| `p064o2\C2215s.java` | C2215s |  renamed: o2, r |
| `p064o2\C2217u.java` | C2217u |  renamed: o2, o |
| `p064o2\C2219w.java` | C2219w |  renamed: o2, o |
| `p064o2\C2221y.java` | C2221y |  renamed: o2, s |
| `p064o2\C2222z.java` | C2222z |  renamed: o2, w |
| `p064o2\D.java` | D |  renamed: r |
| `p064o2\d0.java` | d0 |  renamed: o |
| `p064o2\E.java` | E |  |
| `p064o2\e0.java` | e0 |  renamed: o |
| `p064o2\F.java` | F |  |
| `p064o2\f0.java` | f0 |  renamed: o |
| `p064o2\G.java` | G |  |
| `p064o2\g0.java` | g0 |  |
| `p064o2\H.java` | H |  |
| `p064o2\h0.java` | h0 |  |
| `p064o2\I.java` | I |  renamed: o |
| `p064o2\i0.java` | i0 |  renamed: a, b |
| `p064o2\InterfaceC2218v.java` | InterfaceC2218v |  renamed: o2 |
| `p064o2\J.java` | J |  renamed: a |
| `p064o2\j0.java` | j0 |  renamed: o, r |
| `p064o2\K.java` | K |  renamed: a |
| `p064o2\k0.java` | k0 |  renamed: b, a |
| `p064o2\L.java` | L |  renamed: a, b |
| `p064o2\l0.java` | l0 |  |
| `p064o2\M.java` | M |  renamed: o, r |
| `p064o2\m0.java` | m0 |  renamed: a |
| `p064o2\N.java` | N |  renamed: a, b |
| `p064o2\n0.java` | n0 |  renamed: b, a |
| `p064o2\O.java` | O |  |
| `p064o2\o0.java` | o0 |  |
| `p064o2\P.java` | P |  |
| `p064o2\p0.java` | p0 |  renamed: a |
| `p064o2\Q.java` | Q |  renamed: d, a |
| `p064o2\q0.java` | q0 |  |
| `p064o2\r.java` | r |  renamed: r |
| `p064o2\r0.java` | r0 |  renamed: o |
| `p064o2\S.java` |  |  renamed: a |
| `p064o2\T.java` | T |  renamed: o |
| `p064o2\U.java` | U |  renamed: a |
| `p064o2\V.java` | V |  renamed: a |
| `p064o2\W.java` | W |  renamed: r, s |
| `p064o2\X.java` | X |  renamed: o |
| `p064o2\Y.java` | Y |  renamed: a |
| `p064o2\Z.java` | Z |  renamed: o |
| `p065o3\a.java` | a |  renamed: o |
| `p065o3\b.java` | b |  renamed: d, a |
| `p065o3\c.java` | c |  renamed: o |
| `p065o3\d.java` | d |  renamed: b, a |
| `p065o3\e.java` | e |  renamed: a, b |
| `p065o3\f.java` | f |  renamed: o |
| `p065o3\g.java` | g |  renamed: b, a |
| `p065o3\h.java` | h |  renamed: b, a |
| `p065o3\i.java` | i |  renamed: a, b |
| `p065o3\j.java` | j |  renamed: a |
| `p065o3\k.java` | k |  renamed: b |
| `p065o3\l.java` | l |  renamed: b, c |
| `p065o3\m.java` | m |  renamed: o, r |
| `p065o3\n.java` | n |  renamed: a, b |
| `p065o3\o.java` | o |  renamed: o |
| `p065o3\p.java` | p |  renamed: a |
| `p065o3\q.java` | q |  renamed: A, b |
| `p066p0\a.java` | a |  renamed: a, b |
| `p067p1\a.java` | a |  |
| `p067p1\b.java` | b |  renamed: a, b |
| `p067p1\c.java` | c |  renamed: a, b |
| `p067p1\d.java` | d |  renamed: a |
| `p067p1\e.java` | e |  renamed: h, i |
| `p067p1\f.java` | f |  |
| `p067p1\g.java` | g |  renamed: a, b |
| `p067p1\h.java` | h |  renamed: o |
| `p067p1\i.java` | i |  |
| `p067p1\j.java` | j |  |
| `p067p1\k.java` | k |  |
| `p067p1\l.java` | l |  renamed: b, a |
| `p067p1\m.java` | m |  renamed: a, b |
| `p067p1\n.java` | n |  |
| `p067p1\o.java` |  |  renamed: o |
| `p067p1\p.java` | p |  renamed: a, b |
| `p068p2\a.java` | a |  renamed: o |
| `p069p3\a.java` | a |  renamed: a |
| `p070q0\a.java` | a |  renamed: a, b |
| `p070q0\b.java` | b |  renamed: a, b |
| `p070q0\c.java` | c |  renamed: o, r |
| `p070q0\d.java` | d |  renamed: a, b |
| `p070q0\e.java` | e |  renamed: a, b |
| `p071q1\a.java` | a |  |
| `p071q1\b.java` | b |  |
| `p072q3\a.java` | a |  |
| `p072q3\b.java` | b |  renamed: o, r |
| `p072q3\c.java` | c |  renamed: a |
| `p073r\a.java` |  |  |
| `p074r0\a.java` | a |  renamed: a |
| `p074r0\b.java` | b |  renamed: o |
| `p074r0\c.java` | c |  |
| `p074r0\d.java` | d |  |
| `p074r0\e.java` | e |  renamed: b, c |
| `p074r0\f.java` | f |  renamed: a, b |
| `p074r0\g.java` | g |  |
| `p074r0\h.java` | h |  renamed: o |
| `p075r3\a.java` | a |  renamed: c, d |
| `p075r3\b.java` | b |  renamed: a, b |
| `p076s\a.java` |  |  |
| `p076s\b.java` |  |  |
| `p077s0\a.java` | a |  |
| `p077s0\b.java` | b |  |
| `p077s0\c.java` | c |  |
| `p078s1\a.java` | a |  renamed: o |
| `p078s1\b.java` | b |  |
| `p078s1\c.java` | c |  renamed: a, b |
| `p078s1\d.java` | d |  renamed: o |
| `p078s1\e.java` | e |  |
| `p078s1\f.java` | f |  renamed: a |
| `p079s3\a.java` | a |  renamed: B, C |
| `p079s3\b.java` | b |  renamed: w, x |
| `p079s3\c.java` | c |  |
| `p080t0\a.java` | a |  renamed: a |
| `p080t0\b.java` | b |  renamed: o |
| `p080t0\c.java` | c |  renamed: a, b |
| `p080t0\d.java` | d |  renamed: o |
| `p080t0\e.java` | e |  renamed: o, r |
| `p080t0\f.java` | f |  renamed: r |
| `p081t1\a.java` | a |  renamed: a, b |
| `p081t1\b.java` | b |  renamed: a, b |
| `p081t1\c.java` | c |  renamed: o, r |
| `p082t2\A.java` |  |  renamed: a, b |
| `p082t2\A0.java` |  |  renamed: a |
| `p082t2\a1.java` | a1 |  renamed: o |
| `p082t2\AbstractC2224a0.java` |  |  renamed: t2, a |
| `p082t2\AbstractC2249n.java` | AbstractC2249n |  renamed: t2, d |
| `p082t2\AbstractC2250n0.java` | AbstractC2250n0 |  renamed: t2, b |
| `p082t2\AbstractC2252o0.java` | AbstractC2252o0 |  renamed: t2, a |
| `p082t2\AbstractC2261t0.java` | AbstractC2261t0 |  renamed: t2, a |
| `p082t2\AbstractC2268x.java` | AbstractC2268x |  renamed: t2, A |
| `p082t2\B.java` | B |  renamed: b |
| `p082t2\B0.java` | B0 |  renamed: f |
| `p082t2\b1.java` | b1 |  renamed: f |
| `p082t2\BinderC2238h0.java` | BinderC2238h0 |  renamed: t2, o |
| `p082t2\C.java` |  |  renamed: b, c |
| `p082t2\C0.java` | C0 |  renamed: o |
| `p082t2\c1.java` | c1 |  renamed: b, a |
| `p082t2\C2223a.java` | C2223a |  renamed: t2, a |
| `p082t2\C2226b0.java` | C2226b0 |  renamed: t2, k |
| `p082t2\C2227c.java` | C2227c |  renamed: t2, a |
| `p082t2\C2228c0.java` | C2228c0 |  renamed: t2, a |
| `p082t2\C2229d.java` | C2229d |  renamed: t2, a |
| `p082t2\C2230d0.java` | C2230d0 |  renamed: t2, o |
| `p082t2\C2231e.java` | C2231e |  renamed: t2, o |
| `p082t2\C2232e0.java` | C2232e0 |  renamed: t2, o |
| `p082t2\C2233f.java` |  |  renamed: t2, a |
| `p082t2\C2235g.java` | C2235g |  renamed: t2, b |
| `p082t2\C2236g0.java` | C2236g0 |  renamed: t2, I |
| `p082t2\C2239i.java` | C2239i |  renamed: t2, o |
| `p082t2\C2243k.java` | C2243k |  renamed: t2, f |
| `p082t2\C2245l.java` | C2245l |  renamed: t2, a |
| `p082t2\C2247m.java` | C2247m |  renamed: t2, o |
| `p082t2\C2251o.java` | C2251o |  renamed: t2, f |
| `p082t2\C2253p.java` | C2253p |  renamed: t2, a |
| `p082t2\C2255q.java` | C2255q |  renamed: t2, c |
| `p082t2\C2258s.java` | C2258s |  renamed: t2, b |
| `p082t2\C2259s0.java` | C2259s0 |  renamed: t2, c |
| `p082t2\C2260t.java` | C2260t |  renamed: t2, a |
| `p082t2\C2262u.java` | C2262u |  renamed: t2, o |
| `p082t2\C2263u0.java` | C2263u0 |  renamed: t2, a |
| `p082t2\C2264v.java` | C2264v |  renamed: t2, o |
| `p082t2\C2265v0.java` |  |  renamed: t2, a |
| `p082t2\C2267w0.java` | C2267w0 |  renamed: t2, c |
| `p082t2\C2271y0.java` |  |  renamed: t2, o |
| `p082t2\C2272z.java` |  |  renamed: t2, a |
| `p082t2\CallableC2246l0.java` | CallableC2246l0 |  renamed: t2, a |
| `p082t2\D.java` | D |  |
| `p082t2\D0.java` | D0 |  renamed: o, r |
| `p082t2\d1.java` | d1 |  renamed: o |
| `p082t2\E.java` | E |  |
| `p082t2\E0.java` | E0 |  renamed: o |
| `p082t2\e1.java` | e1 |  renamed: d, f |
| `p082t2\EnumC2241j.java` | EnumC2241j |  renamed: t2, o |
| `p082t2\EnumC2256q0.java` | EnumC2256q0 |  renamed: t2, o |
| `p082t2\EnumC2257r0.java` | EnumC2257r0 |  renamed: t2, o |
| `p082t2\F.java` | F |  renamed: a, b |
| `p082t2\F0.java` | F0 |  renamed: o, r |
| `p082t2\f1.java` | f1 |  renamed: b |
| `p082t2\G.java` | G |  renamed: U |
| `p082t2\G0.java` | G0 |  renamed: o, r |
| `p082t2\g1.java` | g1 |  |
| `p082t2\H.java` | H |  renamed: c, d |
| `p082t2\H0.java` | H0 |  |
| `p082t2\h1.java` | h1 |  renamed: c |
| `p082t2\I.java` | I |  renamed: U |
| `p082t2\I0.java` | I0 |  |
| `p082t2\i1.java` | i1 |  renamed: a, b |
| `p082t2\InterfaceC2237h.java` | InterfaceC2237h |  renamed: t2 |
| `p082t2\InterfaceC2254p0.java` | InterfaceC2254p0 |  renamed: t2 |
| `p082t2\J.java` | J |  renamed: c, d |
| `p082t2\J0.java` |  |  renamed: o, r |
| `p082t2\j1.java` | j1 |  renamed: H, B |
| `p082t2\K.java` | K |  renamed: b, c |
| `p082t2\K0.java` | K0 |  renamed: c, d |
| `p082t2\k1.java` | k1 |  renamed: o, r |
| `p082t2\L.java` | L |  renamed: c, d |
| `p082t2\L0.java` | L0 |  renamed: a, b |
| `p082t2\l1.java` | l1 |  renamed: a, b |
| `p082t2\M.java` | M |  renamed: o, r |
| `p082t2\M0.java` | M0 |  renamed: o |
| `p082t2\m1.java` | m1 |  |
| `p082t2\N.java` | N |  renamed: a |
| `p082t2\N0.java` | N0 |  renamed: f |
| `p082t2\n1.java` | n1 |  renamed: i, j |
| `p082t2\O.java` | O |  |
| `p082t2\O0.java` | O0 |  renamed: c, d |
| `p082t2\o1.java` | o1 |  renamed: A, B |
| `p082t2\P.java` | P |  renamed: d |
| `p082t2\P0.java` | P0 |  renamed: o, r |
| `p082t2\p1.java` |  |  renamed: a, b |
| `p082t2\Q.java` | Q |  renamed: a, b |
| `p082t2\Q0.java` | Q0 |  renamed: o |
| `p082t2\q1.java` | q1 |  renamed: d, f |
| `p082t2\r.java` | r |  renamed: o |
| `p082t2\R0.java` | R0 |  renamed: o |
| `p082t2\r1.java` | r1 |  renamed: a, b |
| `p082t2\RunnableC2225b.java` | RunnableC2225b |  renamed: t2, o |
| `p082t2\RunnableC2234f0.java` |  |  renamed: t2, o |
| `p082t2\RunnableC2240i0.java` | RunnableC2240i0 |  renamed: t2, o |
| `p082t2\RunnableC2242j0.java` | RunnableC2242j0 |  renamed: t2, o |
| `p082t2\RunnableC2244k0.java` | RunnableC2244k0 |  renamed: t2, o |
| `p082t2\RunnableC2248m0.java` | RunnableC2248m0 |  renamed: t2, o |
| `p082t2\RunnableC2266w.java` |  |  renamed: t2, o |
| `p082t2\RunnableC2269x0.java` |  |  renamed: t2, o |
| `p082t2\RunnableC2270y.java` | RunnableC2270y |  renamed: t2, o |
| `p082t2\RunnableC2273z0.java` |  |  renamed: t2, o |
| `p082t2\S.java` | S |  renamed: A, B |
| `p082t2\S0.java` | S0 |  renamed: o |
| `p082t2\T.java` | T |  renamed: o, r |
| `p082t2\T0.java` | T0 |  renamed: o |
| `p082t2\U.java` | U |  renamed: A, c |
| `p082t2\U0.java` | U0 |  renamed: d, f |
| `p082t2\V.java` | V |  renamed: a, b |
| `p082t2\V0.java` | V0 |  renamed: a, b |
| `p082t2\W.java` | W |  renamed: a, b |
| `p082t2\W0.java` |  |  renamed: o, r |
| `p082t2\X.java` | X |  renamed: a |
| `p082t2\X0.java` | X0 |  |
| `p082t2\Y.java` | Y |  renamed: d, f |
| `p082t2\Y0.java` | Y0 |  renamed: o |
| `p082t2\Z.java` |  |  renamed: a, b |
| `p082t2\Z0.java` | Z0 |  renamed: c, d |
| `p083t3\A.java` | A |  trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:451); com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:997); com.notescrafter.ui.screens.PreviewScreen.<anonymous>.<anonymous>.<anonymous> (PreviewScreen.kt:308) renamed: o |
| `p083t3\A0.java` | A0 |  renamed: o |
| `p083t3\a1.java` | a1 |  renamed: o, r |
| `p083t3\AbstractC2278c.java` | AbstractC2278c |  renamed: t3, a |
| `p083t3\B0.java` | B0 |  renamed: o |
| `p083t3\b1.java` | b1 |  renamed: o, r |
| `p083t3\C0.java` | C0 |  renamed: o |
| `p083t3\c1.java` | c1 |  renamed: o |
| `p083t3\C2274a.java` | C2274a | **[KNOWN]** MainActivity composable lambda 1 (MainActivity.kt:1107) trace: com.notescrafter.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:1107) renamed: t3, o |
| `p083t3\C2275a0.java` |  |  renamed: t3, o |
| `p083t3\C2276b.java` | C2276b | **[KNOWN]** MainActivity composable lambda 2 (MainActivity.kt:1144) trace: com.notescrafter.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:1144) renamed: t3, o |
| `p083t3\C2277b0.java` |  |  renamed: t3, o |
| `p083t3\C2279c0.java` |  |  renamed: t3, o |
| `p083t3\C2280d.java` | C2280d |  renamed: t3, o |
| `p083t3\C2281d0.java` |  |  renamed: t3, o |
| `p083t3\C2282e.java` | C2282e |  renamed: t3, o |
| `p083t3\C2283e0.java` | C2283e0 |  renamed: t3, a |
| `p083t3\C2284f.java` | C2284f |  trace: com.notescrafter.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:192); com.notescrafter.MainActivity.onCreate.<anonymous> (MainActivity.kt:191) renamed: t3, o |
| `p083t3\C2285f0.java` | C2285f0 |  renamed: t3, a |
| `p083t3\C2286g.java` | C2286g |  renamed: t3, o |
| `p083t3\C2287g0.java` | C2287g0 |  renamed: t3, o |
| `p083t3\C2288h.java` |  |  renamed: t3, o |
| `p083t3\C2289h0.java` | C2289h0 |  renamed: t3, o |
| `p083t3\C2290i.java` |  |  renamed: t3, o |
| `p083t3\C2291i0.java` |  |  renamed: t3, o |
| `p083t3\C2292j.java` |  | **[KNOWN]** FeatureCard updateScope lambda (LandingScreen.kt) renamed: t3, o |
| `p083t3\C2293j0.java` | C2293j0 |  renamed: t3, o |
| `p083t3\C2294k.java` |  |  renamed: t3, o |
| `p083t3\C2295k0.java` | C2295k0 |  renamed: t3, o |
| `p083t3\C2297l0.java` | C2297l0 |  renamed: t3, o |
| `p083t3\C2298m.java` | C2298m |  renamed: t3, o |
| `p083t3\C2299m0.java` | C2299m0 |  renamed: t3, o |
| `p083t3\C2300n.java` | C2300n |  renamed: t3, o |
| `p083t3\C2301n0.java` | C2301n0 |  renamed: t3, o |
| `p083t3\C2302o.java` | C2302o |  renamed: t3, o |
| `p083t3\C2303o0.java` | C2303o0 |  renamed: t3, o |
| `p083t3\C2304p.java` | C2304p |  renamed: t3, o |
| `p083t3\C2305p0.java` | C2305p0 |  renamed: t3, o |
| `p083t3\C2306q.java` |  | **[KNOWN]** LogoSelectionScreen confirm lambda (LogoSelectionScreen.kt) renamed: t3, o |
| `p083t3\C2307q0.java` | C2307q0 |  renamed: t3, o |
| `p083t3\C2308r0.java` | C2308r0 |  renamed: t3, o |
| `p083t3\C2309s.java` | C2309s |  renamed: t3, o |
| `p083t3\C2310s0.java` | C2310s0 |  renamed: t3, o |
| `p083t3\C2311t.java` | C2311t |  renamed: t3, o |
| `p083t3\C2312t0.java` | C2312t0 |  renamed: t3, o |
| `p083t3\C2313u.java` |  | **[KNOWN]** flow-step nav helper (FLOW card tap -> "flow" + step 0) renamed: t3, o |
| `p083t3\C2314u0.java` | C2314u0 |  renamed: t3, o |
| `p083t3\C2315v.java` |  | **[KNOWN]** route lambdas table ("flow","how-to-print","tools","contact-us",...) renamed: t3, o |
| `p083t3\C2316v0.java` | C2316v0 |  renamed: t3, o |
| `p083t3\C2317w.java` |  |  renamed: t3, o |
| `p083t3\C2318w0.java` | C2318w0 |  renamed: t3, o |
| `p083t3\C2319x.java` | C2319x | **[KNOWN]** TopBar (cart/downloads icons -> step -1 DownloadsScreen) trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:453) renamed: t3, o |
| `p083t3\C2320x0.java` | C2320x0 |  renamed: t3, o |
| `p083t3\C2321y.java` |  |  renamed: t3, o |
| `p083t3\C2322y0.java` | C2322y0 |  renamed: t3, o |
| `p083t3\C2323z.java` | C2323z |  trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:514) renamed: t3, o |
| `p083t3\C2324z0.java` | C2324z0 |  renamed: t3, o |
| `p083t3\D.java` |  | **[KNOWN]** DownloadedFileItem (download file card) renamed: o |
| `p083t3\D0.java` | D0 |  renamed: o |
| `p083t3\d1.java` | d1 |  renamed: o, r |
| `p083t3\E0.java` | E0 |  renamed: o |
| `p083t3\F.java` |  |  renamed: o, r |
| `p083t3\F0.java` | F0 |  renamed: o, r |
| `p083t3\G0.java` | G0 |  renamed: o |
| `p083t3\H0.java` | H0 |  renamed: o |
| `p083t3\I.java` |  |  renamed: o |
| `p083t3\I0.java` | I0 |  renamed: o, r |
| `p083t3\J.java` |  |  renamed: o |
| `p083t3\J0.java` | J0 |  renamed: o, r |
| `p083t3\K.java` | K |  renamed: o, r |
| `p083t3\K0.java` | K0 |  renamed: o, r |
| `p083t3\L.java` | L | **[KNOWN]** NotesCrafterContent (central router, case "flow"/"home"/...) trace: com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:542) renamed: A, B |
| `p083t3\L0.java` | L0 |  renamed: o |
| `p083t3\M.java` | M | **[KNOWN]** RouterState (initial route "home", M:393) trace: com.notescrafter.NotesCrafterContent.<anonymous> (MainActivity.kt:449) renamed: A, B |
| `p083t3\M0.java` | M0 |  renamed: o |
| `p083t3\N.java` |  |  renamed: o, r |
| `p083t3\N0.java` | N0 |  renamed: o |
| `p083t3\O.java` |  |  renamed: o |
| `p083t3\O0.java` | O0 |  renamed: o |
| `p083t3\P.java` | P |  renamed: o |
| `p083t3\P0.java` | P0 |  renamed: o, r |
| `p083t3\Q.java` | Q |  trace: com.notescrafter.SignInRequiredScreen.<anonymous>.<anonymous> (MainActivity.kt:1251) renamed: o, r strings: [Sign In with Google | Go Back] |
| `p083t3\Q0.java` | Q0 |  renamed: o |
| `p083t3\r.java` | r |  renamed: o |
| `p083t3\R0.java` | R0 |  renamed: o, r |
| `p083t3\S.java` | S | **[KNOWN]** Scaffold + RouteScope trace: com.notescrafter.AppHeader (MainActivity.kt:1068); com.notescrafter.NotesCrafterContent (MainActivity.kt:329); com.notescrafter.SignInRequiredScreen (MainActivity.kt:1235) strings: [NotesCrafter] |
| `p083t3\S0.java` | S0 |  renamed: o, r |
| `p083t3\T.java` | T |  renamed: o, r |
| `p083t3\T0.java` | T0 |  renamed: o |
| `p083t3\U.java` | U |  renamed: o, r |
| `p083t3\U0.java` | U0 |  renamed: o |
| `p083t3\V.java` | V |  renamed: o, r |
| `p083t3\V0.java` | V0 |  renamed: o |
| `p083t3\W.java` | W |  renamed: o |
| `p083t3\W0.java` | W0 |  renamed: o |
| `p083t3\X.java` | X |  renamed: o |
| `p083t3\X0.java` | X0 |  renamed: o |
| `p083t3\Y.java` | Y | **[KNOWN]** PrintOrderViewModel (flow step machine: g()=setStep, h()=reset) renamed: w, b |
| `p083t3\Y0.java` | Y0 |  renamed: o |
| `p083t3\Z.java` | Z |  renamed: a, b |
| `p083t3\Z0.java` | Z0 |  renamed: o |
| `p084u0\a.java` | a |  renamed: d, c |
| `p084u0\b.java` | b |  |
| `p085u1\a.java` | a |  renamed: a, b |
| `p085u1\b.java` | b |  |
| `p085u1\c.java` | c |  renamed: e |
| `p085u1\d.java` | d |  renamed: A, C |
| `p085u1\e.java` | e |  renamed: o, r |
| `p085u1\f.java` | f |  |
| `p085u1\g.java` | g |  renamed: a |
| `p085u1\h.java` | h |  renamed: o |
| `p085u1\i.java` | i |  renamed: a |
| `p085u1\j.java` | j |  renamed: o, r |
| `p085u1\k.java` | k |  renamed: A, b |
| `p086u2\a.java` | a |  renamed: o |
| `p086u2\b.java` | b |  renamed: a |
| `p087u3\a.java` | a |  |
| `p087u3\b.java` | b | **[KNOWN]** FilterSettings data class (invertColors, clearBackground, grayscale, blackAndWhite, backgroundThreshold, removeLogo, logoBox, logoShape) |
| `p087u3\c.java` | c |  |
| `p087u3\d.java` | d |  |
| `p087u3\e.java` | e |  |
| `p087u3\f.java` | f |  |
| `p087u3\g.java` | g |  |
| `p087u3\h.java` | h |  |
| `p087u3\i.java` | i |  |
| `p087u3\j.java` | j |  |
| `p087u3\k.java` | k |  |
| `p087u3\l.java` | l |  |
| `p087u3\m.java` | m |  |
| `p087u3\n.java` | n |  |
| `p087u3\o.java` | o |  |
| `p087u3\p.java` | p |  |
| `p087u3\q.java` | q |  |
| `p087u3\r.java` | r |  |
| `p087u3\s.java` | s |  |
| `p087u3\t.java` | t |  |
| `p087u3\u.java` | u |  |
| `p087u3\v.java` | v |  |
| `p088v\a.java` | a |  renamed: c, d |
| `p088v\b.java` | b |  renamed: a |
| `p088v\c.java` | c |  renamed: d, a |
| `p088v\d.java` | d |  renamed: b, c |
| `p088v\e.java` | e |  |
| `p088v\f.java` | f |  renamed: c, a |
| `p088v\g.java` | g |  renamed: r, s |
| `p088v\h.java` | h |  renamed: a, b |
| `p088v\i.java` | i |  renamed: v |
| `p088v\j.java` | j |  renamed: o |
| `p088v\k.java` | k |  |
| `p089v0\a.java` | a |  |
| `p090v1\A.java` | A |  |
| `p090v1\A0.java` | A0 |  renamed: o |
| `p090v1\AbstractBinderC2337b0.java` | AbstractBinderC2337b0 |  renamed: v1 |
| `p090v1\AbstractBinderC2361n0.java` | AbstractBinderC2361n0 |  renamed: v1 |
| `p090v1\AbstractBinderC2370v.java` | AbstractBinderC2370v |  renamed: v1 |
| `p090v1\AbstractC2360n.java` | AbstractC2360n |  renamed: v1, a |
| `p090v1\B.java` | B |  |
| `p090v1\B0.java` | B0 |  |
| `p090v1\BinderC2364p.java` | BinderC2364p |  renamed: v1, o |
| `p090v1\C.java` | C |  |
| `p090v1\C0.java` | C0 |  |
| `p090v1\C2335a0.java` | C2335a0 |  renamed: v1 |
| `p090v1\C2336b.java` | C2336b |  renamed: v1, b |
| `p090v1\C2338c.java` | C2338c |  renamed: v1, b |
| `p090v1\C2339c0.java` | C2339c0 |  renamed: v1, a |
| `p090v1\C2340d.java` | C2340d |  renamed: v1, b |
| `p090v1\C2342e.java` | C2342e |  renamed: v1, b |
| `p090v1\C2343e0.java` | C2343e0 |  renamed: v1 |
| `p090v1\C2344f.java` | C2344f |  renamed: v1, b |
| `p090v1\C2345f0.java` | C2345f0 |  renamed: v1 |
| `p090v1\C2346g.java` | C2346g |  renamed: v1, b |
| `p090v1\C2348h.java` | C2348h |  renamed: v1, b |
| `p090v1\C2349h0.java` | C2349h0 |  renamed: v1 |
| `p090v1\C2350i.java` | C2350i |  renamed: v1, b |
| `p090v1\C2352j.java` | C2352j |  renamed: v1, b |
| `p090v1\C2353j0.java` | C2353j0 |  renamed: v1 |
| `p090v1\C2354k.java` | C2354k |  renamed: v1, b |
| `p090v1\C2355k0.java` | C2355k0 |  renamed: v1 |
| `p090v1\C2356l.java` | C2356l |  renamed: v1, b |
| `p090v1\C2358m.java` | C2358m |  renamed: v1, o |
| `p090v1\C2359m0.java` | C2359m0 |  renamed: v1 |
| `p090v1\C2362o.java` | C2362o |  renamed: v1, f |
| `p090v1\C2365p0.java` | C2365p0 |  renamed: v1 |
| `p090v1\C2366q.java` | C2366q |  renamed: v1, d |
| `p090v1\C2367s.java` | C2367s |  renamed: v1 |
| `p090v1\C2369u.java` | C2369u |  renamed: v1 |
| `p090v1\C2372x.java` | C2372x |  renamed: v1 |
| `p090v1\C2374z.java` | C2374z |  renamed: v1 |
| `p090v1\D.java` | D |  |
| `p090v1\D0.java` | D0 |  |
| `p090v1\E.java` | E |  |
| `p090v1\E0.java` | E0 |  renamed: o |
| `p090v1\F.java` | F |  |
| `p090v1\F0.java` | F0 |  renamed: o |
| `p090v1\G.java` | G |  |
| `p090v1\G0.java` | G0 |  renamed: o |
| `p090v1\H.java` | H |  |
| `p090v1\H0.java` | H0 |  renamed: o |
| `p090v1\I.java` | I |  |
| `p090v1\I0.java` | I0 |  renamed: o |
| `p090v1\InterfaceC2334a.java` | InterfaceC2334a |  renamed: v1 |
| `p090v1\InterfaceC2341d0.java` | InterfaceC2341d0 |  renamed: v1 |
| `p090v1\InterfaceC2347g0.java` | InterfaceC2347g0 |  renamed: v1 |
| `p090v1\InterfaceC2351i0.java` | InterfaceC2351i0 |  renamed: v1 |
| `p090v1\InterfaceC2357l0.java` | InterfaceC2357l0 |  renamed: v1 |
| `p090v1\InterfaceC2363o0.java` | InterfaceC2363o0 |  renamed: v1 |
| `p090v1\InterfaceC2368t.java` | InterfaceC2368t |  renamed: v1 |
| `p090v1\InterfaceC2371w.java` | InterfaceC2371w |  renamed: v1 |
| `p090v1\InterfaceC2373y.java` | InterfaceC2373y |  renamed: v1 |
| `p090v1\J.java` | J |  |
| `p090v1\J0.java` | J0 |  renamed: A, B |
| `p090v1\K.java` | K |  |
| `p090v1\K0.java` |  |  renamed: o |
| `p090v1\L.java` | L |  |
| `p090v1\L0.java` | L0 |  renamed: a |
| `p090v1\M.java` | M |  renamed: o |
| `p090v1\M0.java` | M0 |  renamed: A, B |
| `p090v1\N.java` | N |  |
| `p090v1\N0.java` | N0 |  renamed: o, r |
| `p090v1\O.java` | O |  |
| `p090v1\O0.java` | O0 |  renamed: o, r |
| `p090v1\P.java` | P |  |
| `p090v1\P0.java` | P0 |  renamed: o |
| `p090v1\Q.java` | Q |  |
| `p090v1\q0.java` | q0 |  renamed: o |
| `p090v1\r.java` | r |  renamed: o |
| `p090v1\r0.java` | r0 |  renamed: a, b |
| `p090v1\S.java` | S |  |
| `p090v1\s0.java` | s0 |  renamed: o |
| `p090v1\T.java` | T |  |
| `p090v1\t0.java` | t0 |  renamed: o, r |
| `p090v1\U.java` | U |  |
| `p090v1\u0.java` | u0 |  renamed: r, o |
| `p090v1\V.java` | V |  |
| `p090v1\v0.java` | v0 |  |
| `p090v1\W.java` | W |  |
| `p090v1\w0.java` | w0 |  renamed: o |
| `p090v1\X.java` | X |  |
| `p090v1\x0.java` | x0 |  renamed: o |
| `p090v1\Y.java` | Y |  |
| `p090v1\y0.java` | y0 |  renamed: o |
| `p090v1\Z.java` | Z |  |
| `p090v1\z0.java` | z0 |  renamed: o |
| `p091v2\a.java` | a |  renamed: N, O |
| `p091v2\b.java` | b |  renamed: o |
| `p091v2\c.java` | c |  |
| `p091v2\d.java` | d |  |
| `p091v2\e.java` | e |  renamed: o |
| `p091v2\f.java` | f |  renamed: o |
| `p092v3\a.java` | a |  renamed: o |
| `p092v3\b.java` | b |  renamed: o |
| `p092v3\c.java` | c |  renamed: o |
| `p092v3\d.java` | d |  renamed: o |
| `p092v3\e.java` | e |  renamed: o |
| `p092v3\f.java` | f |  renamed: o |
| `p092v3\g.java` | g |  renamed: o, r |
| `p092v3\h.java` | h |  renamed: y, z |
| `p092v3\i.java` |  |  |
| `p092v3\j.java` | j |  renamed: o |
| `p092v3\k.java` | k |  renamed: o |
| `p092v3\l.java` | l |  renamed: o, r |
| `p092v3\m.java` | m |  renamed: o, r |
| `p092v3\n.java` | n |  renamed: o, r |
| `p092v3\o.java` | o |  renamed: o |
| `p092v3\p.java` |  |  renamed: a |
| `p092v3\q.java` | q |  renamed: A, B |
| `p092v3\s.java` |  |  renamed: o, r |
| `p092v3\t.java` | t |  |
| `p092v3\u.java` | u |  renamed: c, d |
| `p092v3\v.java` | v |  renamed: c, d |
| `p092v3\w.java` | w |  renamed: o |
| `p092v3\x.java` | x |  renamed: o |
| `p092v3\y.java` |  |  renamed: a |
| `p093w\a.java` | a |  renamed: a, b |
| `p094w0\a.java` | a |  |
| `p095w1\a.java` | a |  renamed: o |
| `p096w2\a.java` | a |  renamed: n, o |
| `p096w2\b.java` | b |  renamed: a |
| `p097w3\a.java` |  |  renamed: o, r |
| `p097w3\b.java` | b |  trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:109) renamed: o |
| `p097w3\c.java` | c |  trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:118) renamed: o |
| `p097w3\d.java` | d |  trace: com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:93) renamed: o |
| `p097w3\e.java` | e |  trace: com.notescrafter.ui.components.BottomNavBar.<anonymous> (BottomNavBar.kt:75) renamed: o |
| `p097w3\f.java` | f | **[KNOWN]** BottomNavBar.kt (5 items: Contact, To-Do, Home, My Orders, Setting) trace: com.notescrafter.ui.components.BottomNavBar (BottomNavBar.kt:65) renamed: a |
| `p097w3\g.java` |  |  renamed: o |
| `p097w3\h.java` | h |  trace: com.notescrafter.ui.components.CinematicBackground (CinematicBackground.kt:25) |
| `p097w3\j.java` | j | **[KNOWN]** GlassCard.kt (glass card, GlassCard.kt:26) trace: com.notescrafter.ui.components.GlassCard (GlassCard.kt:26) |
| `p097w3\l.java` | l |  trace: com.notescrafter.ui.components.GlassDialog.<anonymous>.<anonymous> (GlassDialog.kt:31) renamed: o |
| `p097w3\m.java` | m |  trace: com.notescrafter.ui.components.GlassDialog.<anonymous> (GlassDialog.kt:26) renamed: o |
| `p097w3\n.java` | n |  trace: com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21) |
| `p097w3\p.java` | p |  trace: com.notescrafter.ui.components.GradientButton.<anonymous> (GradientButton.kt:47) renamed: o, r |
| `p097w3\q.java` | q |  trace: com.notescrafter.ui.components.GradientButton (GradientButton.kt:28) |
| `p097w3\r.java` | r |  renamed: a, b |
| `p097w3\t.java` | t |  trace: com.notescrafter.ui.components.StepIndicator (StepIndicator.kt:37) |
| `p098x\a.java` | a |  |
| `p098x\b.java` | b |  |
| `p098x\c.java` | c |  renamed: o |
| `p098x\d.java` | d |  renamed: a |
| `p098x\e.java` | e |  renamed: a, b |
| `p098x\f.java` | f |  |
| `p098x\g.java` | g |  |
| `p098x\h.java` | h |  renamed: f |
| `p098x\i.java` | i |  |
| `p098x\j.java` | j |  |
| `p098x\k.java` | k |  renamed: a, f |
| `p098x\l.java` | l |  renamed: a, b |
| `p098x\m.java` | m |  |
| `p098x\n.java` | n |  renamed: a |
| `p098x\o.java` | o |  renamed: a |
| `p099x0\a.java` | a |  renamed: a, b |
| `p099x0\b.java` | b |  renamed: d, f |
| `p099x0\c.java` | c |  |
| `p100x1\a.java` | a |  |
| `p100x1\b.java` | b |  |
| `p100x1\c.java` | c |  renamed: M, D |
| `p100x1\d.java` | d |  renamed: o, r |
| `p100x1\e.java` | e |  renamed: o |
| `p100x1\f.java` | f |  |
| `p100x1\g.java` | g |  renamed: o |
| `p100x1\h.java` | h |  |
| `p100x1\i.java` | i |  renamed: a |
| `p100x1\j.java` | j |  renamed: a, b |
| `p100x1\k.java` | k |  renamed: o |
| `p100x1\l.java` | l |  renamed: o |
| `p100x1\m.java` | m |  |
| `p100x1\n.java` | n |  renamed: r, s |
| `p101x2\a.java` | a |  |
| `p101x2\b.java` | b |  |
| `p101x2\c.java` | c |  |
| `p101x2\d.java` | d |  |
| `p101x2\e.java` | e |  |
| `p101x2\f.java` | f |  |
| `p101x2\g.java` | g |  |
| `p101x2\h.java` | h |  |
| `p101x2\i.java` | i |  renamed: a |
| `p101x2\j.java` | j |  renamed: a, b |
| `p101x2\k.java` | k |  renamed: o, r |
| `p101x2\l.java` | l |  renamed: o, r |
| `p101x2\m.java` | m |  |
| `p101x2\n.java` | n |  |
| `p101x2\o.java` | o |  renamed: a, b |
| `p102x3\A.java` | A |  trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityScreenKt.lambda-2.<anonymous> (CommunityScreen.kt:298) renamed: o strings: [Contact Us] |
| `p102x3\A0.java` | A0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-6.<anonymous> (PdfAddPageNumbersScreen.kt:742) renamed: o |
| `p102x3\A1.java` | A1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-8.<anonymous> (PdfOrganizeScreen.kt:934) renamed: o |
| `p102x3\A2.java` | A2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-1.<anonymous> (PrintOrderScreens.kt:496) renamed: o |
| `p102x3\A3.java` | A3 |  renamed: o, r |
| `p102x3\A4.java` | A4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:429) renamed: o, r |
| `p102x3\A5.java` | A5 |  trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HelpCenterScreen.kt:228) renamed: o |
| `p102x3\A6.java` | A6 | **[KNOWN]** LogoSelectionScreen.kt (LogoSelectionScreen:80, LogoSelectionOverlay:422, ShapeOption:371, FineTuneControls:479, TinyControlIcon:541) trace: com.notescrafter.ui.screens.FineTuneControls (LogoSelectionScreen.kt:479); com.notescrafter.ui.screens.LogoSelectionOverlay (LogoSelectionScreen.kt:422); com.notescrafter.ui.screens.LogoSelectionScreen (LogoSelectionScreen.kt:80) strings: [Select Logo Region | Logo will be removed from all pages] |
| `p102x3\A7.java` |  |  renamed: A, B |
| `p102x3\A9.java` | A9 |  renamed: A, B |
| `p102x3\Ab.java` | Ab |  trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous> (PrintLandingScreen.kt:1502) renamed: o, r |
| `p102x3\AbstractC2376a0.java` | AbstractC2376a0 |  renamed: x3, a |
| `p102x3\AbstractC2378a2.java` | AbstractC2378a2 |  renamed: x3, a |
| `p102x3\AbstractC2395b3.java` | AbstractC2395b3 |  renamed: x3, a |
| `p102x3\AbstractC2397b5.java` | AbstractC2397b5 |  trace: com.notescrafter.ui.screens.ErrorScreen (ErrorScreen.kt:23) renamed: x3 |
| `p102x3\AbstractC2406be.java` | AbstractC2406be |  trace: com.notescrafter.ui.screens.ReorderScreen (ReorderScreen.kt:50); com.notescrafter.ui.screens.ReorderableItem (ReorderScreen.kt:248) renamed: x3 strings: [Reorder & Merge] |
| `p102x3\AbstractC2416c8.java` | AbstractC2416c8 |  trace: com.notescrafter.ui.screens.PdfCropScreen (PdfCropScreen.kt:64); com.notescrafter.ui.screens.PdfCropStepItem (PdfCropScreen.kt:1149) renamed: x3 |
| `p102x3\AbstractC2443e3.java` | AbstractC2443e3 |  renamed: x3, a |
| `p102x3\AbstractC2447e7.java` | AbstractC2447e7 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen (PdfAddPageNumbersScreen.kt:74); com.notescrafter.ui.screens.PdfAddPageNumbersStepItem (PdfAddPageNumbersScreen.kt:1293) renamed: x3 |
| `p102x3\AbstractC2452ec.java` | AbstractC2452ec |  trace: com.notescrafter.ui.screens.OrderCardItem (PrintMyOrdersScreen.kt:560); com.notescrafter.ui.screens.PrintMyOrdersScreen (PrintMyOrdersScreen.kt:138); com.notescrafter.ui.screens.TabButton (PrintMyOrdersScreen.kt:496) renamed: x3, a strings: [â‚¹ | Refund Status] |
| `p102x3\AbstractC2469fd.java` |  |  renamed: x3, a |
| `p102x3\AbstractC2471g.java` | AbstractC2471g |  trace: com.notescrafter.ui.screens.AboutUsScreen (AboutUsScreen.kt:26); com.notescrafter.ui.screens.StatCard (AboutUsScreen.kt:269); com.notescrafter.ui.screens.TechItem (AboutUsScreen.kt:254) renamed: x3 strings: [About NotesCrafter | What We Do | Powered by Modern Technology | Our Core Values] |
| `p102x3\AbstractC2474g2.java` | AbstractC2474g2 |  renamed: x3, a |
| `p102x3\AbstractC2475g3.java` | AbstractC2475g3 |  renamed: x3, a |
| `p102x3\AbstractC2489h1.java` | AbstractC2489h1 |  renamed: x3, a |
| `p102x3\AbstractC2493h5.java` | AbstractC2493h5 |  trace: com.notescrafter.ui.screens.FeatureCard (FeaturesScreen.kt:83); com.notescrafter.ui.screens.FeaturesScreen (FeaturesScreen.kt:31) renamed: x3 strings: [Features | Everything you need to master your documents] |
| `p102x3\AbstractC2494h6.java` | AbstractC2494h6 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen (JpgToPdfScreen.kt:74); com.notescrafter.ui.screens.JpgToPdfStepItem (JpgToPdfScreen.kt:1128) renamed: x3 |
| `p102x3\AbstractC2535k.java` | AbstractC2535k |  trace: com.notescrafter.ui.screens.CategoryChipItem (CategoryChipItem.kt:32) renamed: x3 |
| `p102x3\AbstractC2539k3.java` | AbstractC2539k3 |  renamed: x3, a |
| `p102x3\AbstractC2545k9.java` | AbstractC2545k9 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen (PdfOrganizeScreen.kt:72); com.notescrafter.ui.screens.PdfOrganizeStepItem (PdfOrganizeScreen.kt:1236) renamed: x3 strings: [Organize PDF | PDF Saved Successfully! | How it works] |
| `p102x3\AbstractC2552l0.java` | AbstractC2552l0 |  renamed: x3, a |
| `p102x3\AbstractC2565ld.java` |  |  renamed: x3, a |
| `p102x3\AbstractC2574m6.java` | AbstractC2574m6 | **[KNOWN]** LandingScreen.kt (LandingScreen, AIBadge, FeatureCard, FeaturesSection, HowItWorksSection, StepItem) trace: com.notescrafter.ui.screens.AIBadge (LandingScreen.kt:212); com.notescrafter.ui.screens.FeatureCard (LandingScreen.kt:406); com.notescrafter.ui.screens.FeaturesSection (LandingScreen.kt:371) renamed: x3 strings: [AI-Inspired Document Processing | Why Choose Us? | How It Works | Free Forever | Start Processing] |
| `p102x3\AbstractC2583n.java` | AbstractC2583n |  trace: com.notescrafter.ui.screens.CommunityPassScreen (CommunityPassScreen.kt:149); com.notescrafter.ui.screens.ComparisonTable (CommunityPassScreen.kt:728); com.notescrafter.ui.screens.PassCard (CommunityPassScreen.kt:561) renamed: x3, a strings: [COMMUNITY PASS | Support NotesCrafter and unlock unlimited processing power. | Compare each Community Pass tier and see what you unlock. | Scroll to compare | PRODUCT] |
| `p102x3\AbstractC2587n3.java` | AbstractC2587n3 |  renamed: x3, a |
| `p102x3\AbstractC2588n4.java` | AbstractC2588n4 |  trace: com.notescrafter.ui.screens.EditPageScreen (EditPageScreen.kt:66); com.notescrafter.ui.screens.HistoryButton (EditPageScreen.kt:715); com.notescrafter.ui.screens.SelectionOverlay (EditPageScreen.kt:518) renamed: x3 strings: [Edit Page  | Selection Tool | Edit Action | History | Draw selections, click Apply to commit changes] |
| `p102x3\AbstractC2595nb.java` | AbstractC2595nb |  trace: com.notescrafter.ui.screens.AddressCard (PrintAddressesScreen.kt:575); com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149); com.notescrafter.ui.screens.AddressFormDialog (PrintAddressesScreen.kt:828) renamed: x3 strings: [DEFAULT | VERIFIED | SET DEFAULT | DELIVERY DESTINATIONS | My Addresses] |
| `p102x3\AbstractC2598ne.java` | AbstractC2598ne |  trace: com.notescrafter.ui.screens.SettingsItem (SettingsScreen.kt:580); com.notescrafter.ui.screens.SettingsScreen (SettingsScreen.kt:44); com.notescrafter.ui.screens.SettingsSection (SettingsScreen.kt:550) renamed: x3 strings: [Settings & Info | Manage your profile, preferences, and view legal guidelines. | Account | NotesCrafter for Android | Â© 2026 NotesCrafter. All rights reserved.] |
| `p102x3\AbstractC2616p0.java` | AbstractC2616p0 |  renamed: x3, a |
| `p102x3\AbstractC2642qa.java` | AbstractC2642qa |  trace: com.notescrafter.ui.screens.PomodoroStepItem (PomodoroSetupScreen.kt:670); com.notescrafter.ui.screens.SettingRow (PomodoroSetupScreen.kt:542) renamed: x3, a |
| `p102x3\AbstractC2647r0.java` | AbstractC2647r0 |  renamed: x3, a |
| `p102x3\AbstractC2648r1.java` | AbstractC2648r1 |  renamed: x3, a |
| `p102x3\AbstractC2649r2.java` | AbstractC2649r2 |  renamed: x3, a |
| `p102x3\AbstractC2684t5.java` | AbstractC2684t5 | **[KNOWN]** GlobalHomeScreen.kt (hero + FLOW/PRINTS/TOOLS cards) trace: com.notescrafter.ui.screens.BrandFeatureBadge (GlobalHomeScreen.kt:552); com.notescrafter.ui.screens.GlobalHomeScreen (GlobalHomeScreen.kt:52); com.notescrafter.ui.screens.ProductContainer (GlobalHomeScreen.kt:337) renamed: x3 strings: [NotesCrafter | Reimagining the Student Learning Experience] |
| `p102x3\AbstractC2710v.java` | AbstractC2710v |  renamed: x3, a |
| `p102x3\AbstractC2730w3.java` | AbstractC2730w3 |  renamed: x3, a |
| `p102x3\AbstractC2745x2.java` | AbstractC2745x2 |  renamed: x3, a |
| `p102x3\AbstractC2758y.java` | AbstractC2758y |  renamed: x3, a |
| `p102x3\AbstractC2762y3.java` | AbstractC2762y3 |  renamed: x3, a |
| `p102x3\AbstractC2777z2.java` | AbstractC2777z2 |  renamed: x3, a |
| `p102x3\AbstractC2782z7.java` | AbstractC2782z7 |  trace: com.notescrafter.ui.screens.CompressStepItem (PdfCompressScreen.kt:1154); com.notescrafter.ui.screens.PdfCompressScreen (PdfCompressScreen.kt:62) renamed: x3 |
| `p102x3\AbstractC2783z8.java` | AbstractC2783z8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen (PdfInvertScreen.kt:62); com.notescrafter.ui.screens.PdfInvertStepItem (PdfInvertScreen.kt:992) renamed: x3 |
| `p102x3\Ac.java` | Ac |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1830) renamed: o strings: [PRICE BREAKDOWN | Total per copy] |
| `p102x3\Ad.java` | Ad |  trace: com.notescrafter.ui.screens.ShippingTextField.<anonymous>.<anonymous> (PrintOrderScreens.kt:3289) renamed: o |
| `p102x3\Ae.java` | Ae |  renamed: o |
| `p102x3\B.java` | B |  renamed: a, b |
| `p102x3\B0.java` | B0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-7.<anonymous> (PdfAddPageNumbersScreen.kt:774) renamed: o strings: [On-Device Processing] |
| `p102x3\B1.java` | B1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-9.<anonymous> (PdfOrganizeScreen.kt:1038) renamed: o |
| `p102x3\B2.java` | B2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-10.<anonymous> (PrintOrderScreens.kt:1729) renamed: o strings: [INCLUDED PRINT SPECS] |
| `p102x3\B5.java` |  |  renamed: o |
| `p102x3\B6.java` | B6 | **[KNOWN]** Shape enum (RECTANGLE, CIRCLE) renamed: o |
| `p102x3\B7.java` |  |  renamed: A, B |
| `p102x3\B8.java` | B8 |  trace: com.notescrafter.ui.screens.MergeStepItem.<anonymous> (PdfMergeScreen.kt:1061) renamed: o, r |
| `p102x3\B9.java` | B9 |  trace: com.notescrafter.ui.screens.SplitStepItem.<anonymous> (PdfSplitScreen.kt:1082) renamed: o, r |
| `p102x3\Ba.java` | Ba |  trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:430); com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:144); com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:108) renamed: o strings: [Clear All] |
| `p102x3\Bb.java` |  |  renamed: o |
| `p102x3\Bc.java` | Bc |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous> (PrintOrderScreens.kt:1314) renamed: o, r strings: [PDF | NOTEBOOK TITLE (ON COVER) | âœ¨ | DIAMOND PASS ACTIVE: MAX DISCOUNT APPLIED] |
| `p102x3\Bd.java` | Bd |  trace: com.notescrafter.ui.screens.WarningBanner.<anonymous> (PrintOrderScreens.kt:1188) renamed: o, r |
| `p102x3\Be.java` | Be |  trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:359) renamed: o |
| `p102x3\bf.java` | bf |  trace: com.notescrafter.ui.screens.FeatureTile.<anonymous> (UploadScreen.kt:348) renamed: o |
| `p102x3\C.java` | C |  trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-1.<anonymous> (ContactUsScreen.kt:108) renamed: o strings: [Start Live Chat] |
| `p102x3\C0.java` | C0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-8.<anonymous> (PdfAddPageNumbersScreen.kt:768) renamed: o |
| `p102x3\C1.java` | C1 |  renamed: a, b |
| `p102x3\C2.java` | C2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-11.<anonymous> (PrintOrderScreens.kt:2556) renamed: o |
| `p102x3\C2375a.java` |  |  renamed: x3, o |
| `p102x3\C2377a1.java` | C2377a1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-3.<anonymous> (PdfInvertScreen.kt:530) renamed: x3, o strings: [Share PDF] |
| `p102x3\C2379a3.java` | C2379a3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintPriceCalculatorScreenKt.lambda-3.<anonymous> (PrintPriceCalculatorScreen.kt:862) renamed: x3, o strings: [Order Print] |
| `p102x3\C2381a5.java` | C2381a5 |  trace: com.notescrafter.ui.screens.ErrorScreen.<anonymous>.<anonymous> (ErrorScreen.kt:34) renamed: x3, o strings: [Processing Failed] |
| `p102x3\C2382a6.java` |  |  renamed: x3, o |
| `p102x3\C2383a7.java` | C2383a7 |  renamed: x3, o |
| `p102x3\C2384a8.java` | C2384a8 |  renamed: x3, A |
| `p102x3\C2385a9.java` | C2385a9 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:1076) renamed: x3, o |
| `p102x3\C2388ac.java` | C2388ac |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:326) renamed: x3, o |
| `p102x3\C2389ad.java` | C2389ad |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2727) renamed: x3, o strings: [Verify] |
| `p102x3\C2390ae.java` | C2390ae |  trace: com.notescrafter.ui.screens.ReorderableItem.<anonymous> (ReorderScreen.kt:252) renamed: x3, o |
| `p102x3\C2391b.java` |  |  renamed: x3, o |
| `p102x3\C2392b0.java` | C2392b0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-1.<anonymous> (JpgToPdfScreen.kt:315) renamed: x3, o |
| `p102x3\C2393b1.java` | C2393b1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-4.<anonymous> (PdfInvertScreen.kt:546) renamed: x3, o strings: [Process Another File] |
| `p102x3\C2394b2.java` | C2394b2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-13.<anonymous> (PreviewScreen.kt:419) renamed: x3, o strings: [Reset] |
| `p102x3\C2398b6.java` | C2398b6 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:998) renamed: x3, o |
| `p102x3\C2399b7.java` | C2399b7 |  renamed: x3, A |
| `p102x3\C2400b8.java` | C2400b8 |  trace: com.notescrafter.ui.screens.PdfCropStepItem.<anonymous> (PdfCropScreen.kt:1153) renamed: x3, o |
| `p102x3\C2401b9.java` | C2401b9 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:1136) renamed: x3, o |
| `p102x3\C2403bb.java` | C2403bb |  trace: com.notescrafter.ui.screens.AddressField.<anonymous>.<anonymous> (PrintAddressesScreen.kt:1162) renamed: x3, o |
| `p102x3\C2404bc.java` | C2404bc |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:357) renamed: x3, o strings: [Place a New Order] |
| `p102x3\C2405bd.java` | C2405bd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2781) renamed: x3, o strings: [Verify Code] |
| `p102x3\C2407c.java` |  |  renamed: x3, o |
| `p102x3\C2408c0.java` | C2408c0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-10.<anonymous> (JpgToPdfScreen.kt:992) renamed: x3, o |
| `p102x3\C2409c1.java` | C2409c1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-5.<anonymous> (PdfInvertScreen.kt:631) renamed: x3, o strings: [How it works] |
| `p102x3\C2410c2.java` | C2410c2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-14.<anonymous> (PreviewScreen.kt:465) renamed: x3, o |
| `p102x3\C2411c3.java` | C2411c3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-1.<anonymous> (ProcessingScreen.kt:103) renamed: x3, o |
| `p102x3\C2412c4.java` |  |  renamed: x3, o |
| `p102x3\C2413c5.java` | C2413c5 |  renamed: x3, a |
| `p102x3\C2414c6.java` | C2414c6 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous> (JpgToPdfScreen.kt:1028) renamed: x3, o |
| `p102x3\C2415c7.java` | C2415c7 |  renamed: x3, A |
| `p102x3\C2417c9.java` | C2417c9 |  renamed: x3, o |
| `p102x3\C2419cb.java` | C2419cb |  renamed: x3, o |
| `p102x3\C2420cc.java` | C2420cc |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:445) renamed: x3, o strings: [Place a New Order] |
| `p102x3\C2421cd.java` | C2421cd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2588) renamed: x3, o strings: [Contact Information | To change contact number, please contact support] |
| `p102x3\C2423d.java` | C2423d |  trace: com.notescrafter.ui.screens.StatCard.<anonymous> (AboutUsScreen.kt:273) renamed: x3, o |
| `p102x3\C2424d0.java` | C2424d0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-2.<anonymous> (JpgToPdfScreen.kt:502) renamed: x3, o strings: [View PDF] |
| `p102x3\C2425d1.java` | C2425d1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-6.<anonymous> (PdfInvertScreen.kt:643) renamed: x3, o |
| `p102x3\C2426d2.java` | C2426d2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-15.<anonymous> (PreviewScreen.kt:491) renamed: x3, o strings: [Reorder Slide] |
| `p102x3\C2427d3.java` | C2427d3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ProcessingScreenKt.lambda-2.<anonymous> (ProcessingScreen.kt:156) renamed: x3, o |
| `p102x3\C2429d5.java` | C2429d5 |  renamed: x3, a |
| `p102x3\C2430d6.java` | C2430d6 |  renamed: x3, o |
| `p102x3\C2431d7.java` | C2431d7 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersStepItem.<anonymous> (PdfAddPageNumbersScreen.kt:1297) renamed: x3, o |
| `p102x3\C2433d9.java` | C2433d9 |  renamed: x3, o |
| `p102x3\C2434da.java` | C2434da |  renamed: x3, o |
| `p102x3\C2435db.java` |  |  renamed: x3, o |
| `p102x3\C2436dc.java` | C2436dc |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous> (PrintMyOrdersScreen.kt:164) renamed: x3, o |
| `p102x3\C2437dd.java` | C2437dd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2585) renamed: x3, o |
| `p102x3\C2438de.java` | C2438de |  renamed: x3, a |
| `p102x3\C2439e.java` | C2439e |  trace: com.notescrafter.ui.screens.TechItem.<anonymous> (AboutUsScreen.kt:258) renamed: x3, o |
| `p102x3\C2440e0.java` | C2440e0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-3.<anonymous> (JpgToPdfScreen.kt:525) renamed: x3, o strings: [Share PDF] |
| `p102x3\C2441e1.java` | C2441e1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-7.<anonymous> (PdfInvertScreen.kt:675) renamed: x3, o strings: [On-Device Inversion] |
| `p102x3\C2442e2.java` | C2442e2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-16.<anonymous> (PreviewScreen.kt:511) renamed: x3, o strings: [Add Blank Slide] |
| `p102x3\C2444e4.java` |  |  renamed: x3, o |
| `p102x3\C2445e5.java` |  |  renamed: x3, o |
| `p102x3\C2446e6.java` | C2446e6 |  renamed: x3, o |
| `p102x3\C2448e8.java` | C2448e8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:306) renamed: x3, o strings: [Invert PDF Colors] |
| `p102x3\C2449e9.java` | C2449e9 |  renamed: x3, o |
| `p102x3\C2450ea.java` | C2450ea |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:130) renamed: x3, o strings: [Pomodoro Focus Timer | Customise your focus session and task checklist] |
| `p102x3\C2451eb.java` | C2451eb |  trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:1127) renamed: x3, o |
| `p102x3\C2453ed.java` |  |  renamed: x3, o |
| `p102x3\C2455f.java` | C2455f |  trace: com.notescrafter.ui.screens.ValueItem.<anonymous> (AboutUsScreen.kt:299) renamed: x3, o |
| `p102x3\C2456f0.java` | C2456f0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-4.<anonymous> (JpgToPdfScreen.kt:540) renamed: x3, o strings: [Create Another PDF] |
| `p102x3\C2457f1.java` | C2457f1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-8.<anonymous> (PdfInvertScreen.kt:669) renamed: x3, o |
| `p102x3\C2458f2.java` | C2458f2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-17.<anonymous> (PreviewScreen.kt:584) renamed: x3, o strings: [Back] |
| `p102x3\C2459f3.java` | C2459f3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$QuickToolsScreenKt.lambda-2.<anonymous> (QuickToolsScreen.kt:102) renamed: x3, o |
| `p102x3\C2460f4.java` |  |  renamed: x3, o |
| `p102x3\C2461f5.java` | C2461f5 |  trace: com.notescrafter.ui.screens.FeatureCard.<anonymous> (FeaturesScreen.kt:87) renamed: x3, o |
| `p102x3\C2462f6.java` | C2462f6 |  renamed: x3, o |
| `p102x3\C2463f7.java` |  |  renamed: x3, o |
| `p102x3\C2464f8.java` | C2464f8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:393) renamed: x3, o strings: [DOCUMENT RECEIPT | SUCCESS | Filename | Page Count | File Size] |
| `p102x3\C2465f9.java` | C2465f9 |  renamed: x3, A |
| `p102x3\C2466fa.java` | C2466fa |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:185) renamed: x3, o |
| `p102x3\C2467fb.java` | C2467fb |  trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:924) renamed: x3, A strings: [PRIMARY CONTACT NUMBER | +91  | VERIFIED | Looking up pincode details... | City and state will auto-fill from pincode.] |
| `p102x3\C2472g0.java` | C2472g0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-5.<anonymous> (JpgToPdfScreen.kt:625) renamed: x3, o strings: [How it works] |
| `p102x3\C2473g1.java` | C2473g1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-9.<anonymous> (PdfInvertScreen.kt:768) renamed: x3, o |
| `p102x3\C2476g4.java` |  |  renamed: x3, o |
| `p102x3\C2477g5.java` | C2477g5 |  renamed: x3, o |
| `p102x3\C2478g6.java` | C2478g6 |  trace: com.notescrafter.ui.screens.JpgToPdfStepItem.<anonymous> (JpgToPdfScreen.kt:1132) renamed: x3, o |
| `p102x3\C2480g8.java` | C2480g8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:342) renamed: x3, o strings: [Colors Inverted!] |
| `p102x3\C2481g9.java` | C2481g9 |  renamed: x3, o |
| `p102x3\C2482ga.java` | C2482ga |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:173) renamed: x3, o strings: [Session Configurations] |
| `p102x3\C2483gb.java` | C2483gb |  trace: com.notescrafter.ui.screens.AddressFormDialog.<anonymous> (PrintAddressesScreen.kt:911) renamed: x3, A |
| `p102x3\C2485gd.java` | C2485gd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2809) renamed: x3, o strings: [Delivery Destination | WHERE TO SHIP YOUR NOTES | Edit Details | NO SHIPPING DESTINATION SELECTED] |
| `p102x3\C2486ge.java` | C2486ge |  trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:126) renamed: x3, o |
| `p102x3\C2487h.java` | C2487h |  renamed: x3, a |
| `p102x3\C2488h0.java` | C2488h0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-6.<anonymous> (JpgToPdfScreen.kt:637) renamed: x3, o |
| `p102x3\C2490h2.java` | C2490h2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-1.<anonymous> (PrintAddressesScreen.kt:152) renamed: x3, o |
| `p102x3\C2491h3.java` | C2491h3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-2.<anonymous> (ReorderScreen.kt:104) renamed: x3, o strings: [Remove] |
| `p102x3\C2492h4.java` |  |  renamed: x3, o |
| `p102x3\C2495h7.java` | C2495h7 |  trace: com.notescrafter.ui.screens.CompressStepItem.<anonymous> (PdfCompressScreen.kt:1158) renamed: x3, o |
| `p102x3\C2496h8.java` | C2496h8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:561) renamed: x3, o strings: [Select PDF to Invert | Choose a single PDF document to invert color space | Choose File] |
| `p102x3\C2497h9.java` | C2497h9 |  renamed: x3, A |
| `p102x3\C2499hb.java` | C2499hb |  renamed: x3, o |
| `p102x3\C2501hd.java` | C2501hd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2805) renamed: x3, o |
| `p102x3\C2502he.java` | C2502he |  renamed: x3, o |
| `p102x3\C2503i.java` | C2503i |  renamed: x3, a |
| `p102x3\C2504i0.java` | C2504i0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-7.<anonymous> (JpgToPdfScreen.kt:669) renamed: x3, o strings: [On-Device Processing] |
| `p102x3\C2505i1.java` | C2505i1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-1.<anonymous> (PdfMergeScreen.kt:257) renamed: x3, o |
| `p102x3\C2506i2.java` | C2506i2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-10.<anonymous> (PrintAddressesScreen.kt:1117) renamed: x3, o strings: [Cancel] |
| `p102x3\C2507i3.java` | C2507i3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-3.<anonymous> (ReorderScreen.kt:151) renamed: x3, o strings: [Add More PDFs] |
| `p102x3\C2508i4.java` | C2508i4 |  renamed: x3, o |
| `p102x3\C2509i5.java` |  |  renamed: x3, o |
| `p102x3\C2510i6.java` |  |  renamed: x3, o |
| `p102x3\C2511i7.java` | C2511i7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:320) renamed: x3, o strings: [Compress PDF] |
| `p102x3\C2512i8.java` | C2512i8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:554) renamed: x3, o |
| `p102x3\C2513i9.java` | C2513i9 |  renamed: x3, o |
| `p102x3\C2514ia.java` | C2514ia |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:255) renamed: x3, o |
| `p102x3\C2515ib.java` | C2515ib |  trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous> (PrintAddressesScreen.kt:207) renamed: x3, o strings: [Add New Address] |
| `p102x3\C2516ic.java` |  |  renamed: x3, o |
| `p102x3\C2517id.java` | C2517id |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3041) renamed: x3, o strings: [ORDER SUMMARY | Shipping | FREE | Enter pincode | Tax] |
| `p102x3\C2518ie.java` | C2518ie |  trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:259) renamed: x3, o strings: [Sync Your Account | Sign In with Google] |
| `p102x3\C2519j.java` |  |  renamed: x3, o |
| `p102x3\C2520j0.java` | C2520j0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-8.<anonymous> (JpgToPdfScreen.kt:663) renamed: x3, o |
| `p102x3\C2521j1.java` | C2521j1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-2.<anonymous> (PdfMergeScreen.kt:456) renamed: x3, o strings: [Share PDF] |
| `p102x3\C2522j2.java` | C2522j2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-2.<anonymous> (PrintAddressesScreen.kt:327) renamed: x3, o strings: [00000 00000] |
| `p102x3\C2523j3.java` | C2523j3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-4.<anonymous> (ReorderScreen.kt:223) renamed: x3, o strings: [Back] |
| `p102x3\C2524j4.java` | C2524j4 |  trace: com.notescrafter.ui.screens.EditPageScreen.<anonymous>.<anonymous> (EditPageScreen.kt:207) renamed: x3, o strings: [No Preview] |
| `p102x3\C2525j5.java` |  |  renamed: x3, o |
| `p102x3\C2526j6.java` |  |  renamed: x3, o |
| `p102x3\C2527j7.java` |  |  renamed: x3, o |
| `p102x3\C2528j8.java` | C2528j8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:714) renamed: x3, o |
| `p102x3\C2529j9.java` | C2529j9 |  trace: com.notescrafter.ui.screens.PdfOrganizeStepItem.<anonymous> (PdfOrganizeScreen.kt:1240) renamed: x3, o |
| `p102x3\C2530ja.java` | C2530ja |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:243) renamed: x3, o strings: [Focus Theme Color] |
| `p102x3\C2531jb.java` | C2531jb |  trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:348) renamed: x3, o |
| `p102x3\C2533jd.java` | C2533jd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3027) renamed: x3, o |
| `p102x3\C2534je.java` | C2534je |  trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:354) renamed: x3, o |
| `p102x3\C2536k0.java` | C2536k0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$JpgToPdfScreenKt.lambda-9.<anonymous> (JpgToPdfScreen.kt:809) renamed: x3, o |
| `p102x3\C2537k1.java` | C2537k1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-3.<anonymous> (PdfMergeScreen.kt:466) renamed: x3, o strings: [Merge More Files] |
| `p102x3\C2538k2.java` | C2538k2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-3.<anonymous> (PrintAddressesScreen.kt:328) renamed: x3, o strings: [+91 ] |
| `p102x3\C2540k4.java` | C2540k4 |  trace: com.notescrafter.ui.screens.HistoryButton.<anonymous> (EditPageScreen.kt:728) renamed: x3, o |
| `p102x3\C2541k5.java` | C2541k5 |  trace: com.notescrafter.ui.screens.BrandFeatureBadge.<anonymous> (GlobalHomeScreen.kt:556) renamed: x3, o |
| `p102x3\C2542k6.java` | C2542k6 |  trace: com.notescrafter.ui.screens.FeatureCard.<anonymous> (LandingScreen.kt:410) renamed: x3, o |
| `p102x3\C2543k7.java` | C2543k7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:419) renamed: x3, o |
| `p102x3\C2544k8.java` | C2544k8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:713) renamed: x3, o |
| `p102x3\C2546ka.java` |  |  renamed: x3, o |
| `p102x3\C2547kb.java` | C2547kb |  trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:379) renamed: x3, o |
| `p102x3\C2548kc.java` | C2548kc |  renamed: x3, o |
| `p102x3\C2549kd.java` | C2549kd |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:2523) renamed: x3, A |
| `p102x3\C2550ke.java` | C2550ke |  trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:396) renamed: x3, o |
| `p102x3\C2551l.java` |  |  renamed: x3, o |
| `p102x3\C2553l1.java` | C2553l1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-4.<anonymous> (PdfMergeScreen.kt:551) renamed: x3, o strings: [How it works] |
| `p102x3\C2554l2.java` | C2554l2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-4.<anonymous> (PrintAddressesScreen.kt:359) renamed: x3, o strings: [000000] |
| `p102x3\C2555l3.java` | C2555l3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$SuccessScreenKt.lambda-1.<anonymous> (SuccessScreen.kt:462) renamed: x3, o strings: [Print & Deliver | Get printed notebooks at your doorstep | â‚¹0.89/page] |
| `p102x3\C2557l5.java` | C2557l5 | **[KNOWN]** FLOW card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:112) renamed: x3, o |
| `p102x3\C2558l6.java` | C2558l6 |  trace: com.notescrafter.ui.screens.StepItem.<anonymous> (LandingScreen.kt:348) renamed: x3, o |
| `p102x3\C2559l7.java` | C2559l7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:439) renamed: x3, o strings: [ORIGINAL SIZE | COMPRESSED SIZE] |
| `p102x3\C2560l8.java` | C2560l8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:779) renamed: x3, o strings: [Page Inversion Preview] |
| `p102x3\C2561l9.java` | C2561l9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:353) renamed: x3, o strings: [Split PDF] |
| `p102x3\C2562la.java` |  |  renamed: x3, o |
| `p102x3\C2563lb.java` | C2563lb |  trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous>.<anonymous> (PrintAddressesScreen.kt:228) renamed: x3, o strings: [Contact Information | Primary delivery contact] |
| `p102x3\C2566le.java` | C2566le |  trace: com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:450) renamed: x3, o |
| `p102x3\C2567m.java` |  |  renamed: x3, o |
| `p102x3\C2568m0.java` | C2568m0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$LiveChatScreenKt.lambda-1.<anonymous> (LiveChatScreen.kt:28) renamed: x3, o strings: [Live Chat Support] |
| `p102x3\C2569m1.java` | C2569m1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-5.<anonymous> (PdfMergeScreen.kt:563) renamed: x3, o |
| `p102x3\C2570m2.java` | C2570m2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-5.<anonymous> (PrintAddressesScreen.kt:555) renamed: x3, o strings: [Delete] |
| `p102x3\C2571m3.java` | C2571m3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$SuccessScreenKt.lambda-2.<anonymous> (SuccessScreen.kt:649) renamed: x3, o strings: [Process Another] |
| `p102x3\C2572m4.java` | C2572m4 |  trace: com.notescrafter.ui.screens.SelectionOverlay.<anonymous> (EditPageScreen.kt:520) renamed: x3, o strings: [Invert | Paint Black] |
| `p102x3\C2573m5.java` |  |  renamed: x3, o |
| `p102x3\C2575m7.java` | C2575m7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:356) renamed: x3, o strings: [Compression Finished! | Your document has been optimized successfully.] |
| `p102x3\C2576m8.java` | C2576m8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:836) renamed: x3, o |
| `p102x3\C2577m9.java` | C2577m9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:389) renamed: x3, o strings: [Split Completed! | OUTPUT DOCUMENTS] |
| `p102x3\C2578ma.java` | C2578ma |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:395) renamed: x3, o strings: [What do you want to accomplish?] |
| `p102x3\C2579mb.java` | C2579mb |  trace: com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous> (PrintAddressesScreen.kt:537); com.notescrafter.ui.screens.ToDoScreen.<anonymous> (ToDoScreen.kt:359) renamed: x3, o |
| `p102x3\C2580mc.java` | C2580mc |  trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:4798) renamed: x3, o strings: [Save Address] |
| `p102x3\C2581md.java` | C2581md |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous> (PrintOrderScreens.kt:2454) renamed: x3, A |
| `p102x3\C2582me.java` | C2582me |  trace: com.notescrafter.ui.screens.SettingsSection.<anonymous>.<anonymous> (SettingsScreen.kt:563) renamed: x3, o |
| `p102x3\C2584n0.java` | C2584n0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$LiveChatScreenKt.lambda-2.<anonymous> (LiveChatScreen.kt:36) renamed: x3, o |
| `p102x3\C2585n1.java` | C2585n1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-6.<anonymous> (PdfMergeScreen.kt:595) renamed: x3, o strings: [On-Device Processing] |
| `p102x3\C2586n2.java` | C2586n2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-6.<anonymous> (PrintAddressesScreen.kt:560) renamed: x3, o strings: [Cancel] |
| `p102x3\C2589n5.java` | C2589n5 |  renamed: x3, o |
| `p102x3\C2590n6.java` |  |  renamed: x3, o |
| `p102x3\C2591n7.java` | C2591n7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:602) renamed: x3, o strings: [Select PDF to Compress | Choose a single PDF document from your device | Choose File] |
| `p102x3\C2592n8.java` | C2592n8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:853) renamed: x3, o |
| `p102x3\C2593n9.java` | C2593n9 |  renamed: x3, o |
| `p102x3\C2594na.java` | C2594na |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:359) renamed: x3, o strings: [No tasks listed. Add some to stay focused!] |
| `p102x3\C2596nc.java` | C2596nc |  trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:4567) renamed: x3, o strings: [Shipping Address | PRIMARY CONTACT NUMBER | +91 | VERIFIED | City and state will auto-fill from pincode.] |
| `p102x3\C2597nd.java` | C2597nd |  renamed: x3, o |
| `p102x3\C2599o.java` |  |  renamed: x3, o |
| `p102x3\C2600o0.java` | C2600o0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$LiveChatScreenKt.lambda-3.<anonymous> (LiveChatScreen.kt:49) renamed: x3, o |
| `p102x3\C2601o1.java` | C2601o1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-7.<anonymous> (PdfMergeScreen.kt:589) renamed: x3, o |
| `p102x3\C2602o2.java` | C2602o2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-7.<anonymous> (PrintAddressesScreen.kt:534) renamed: x3, o strings: [Delete Address] |
| `p102x3\C2603o3.java` | C2603o3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-1.<anonymous> (ToDoScreen.kt:128) renamed: x3, o |
| `p102x3\C2605o5.java` | C2605o5 |  trace: com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:176) renamed: x3, o |
| `p102x3\C2606o6.java` | C2606o6 |  trace: com.notescrafter.ui.screens.LiveChatScreen.<anonymous>.<anonymous> (LiveChatScreen.kt:35); com.notescrafter.ui.screens.LiveChatScreen.<anonymous> (LiveChatScreen.kt:26) renamed: x3, o |
| `p102x3\C2607o7.java` | C2607o7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:595) renamed: x3, o |
| `p102x3\C2608o8.java` | C2608o8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:821) renamed: x3, o |
| `p102x3\C2609o9.java` | C2609o9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:466) renamed: x3, o |
| `p102x3\C2610oa.java` | C2610oa |  trace: com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:345) renamed: x3, o strings: [Focus Task Checklist] |
| `p102x3\C2611ob.java` | C2611ob |  renamed: x3, a |
| `p102x3\C2612oc.java` | C2612oc |  trace: com.notescrafter.ui.screens.AddressBottomSheet.<anonymous> (PrintOrderScreens.kt:4464) renamed: x3, o strings: [Select Destination] |
| `p102x3\C2613od.java` | C2613od |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:182) renamed: x3, o |
| `p102x3\C2617p1.java` | C2617p1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-8.<anonymous> (PdfMergeScreen.kt:633) renamed: x3, o strings: [Arrange Files to Merge] |
| `p102x3\C2618p2.java` | C2618p2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-8.<anonymous> (PrintAddressesScreen.kt:535) renamed: x3, o strings: [Are you sure you want to delete this address?] |
| `p102x3\C2619p3.java` | C2619p3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-2.<anonymous> (ToDoScreen.kt:164) renamed: x3, o |
| `p102x3\C2621p5.java` | C2621p5 | **[KNOWN]** PRINTS card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:151) renamed: x3, o |
| `p102x3\C2622p6.java` |  |  renamed: x3, o |
| `p102x3\C2623p7.java` | C2623p7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:755) renamed: x3, o |
| `p102x3\C2625p9.java` | C2625p9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:565) renamed: x3, o |
| `p102x3\C2626pa.java` | C2626pa |  trace: com.notescrafter.ui.screens.PomodoroStepItem.<anonymous> (PomodoroSetupScreen.kt:674) renamed: x3, o |
| `p102x3\C2627pb.java` | C2627pb |  renamed: x3, a |
| `p102x3\C2628pc.java` | C2628pc |  renamed: x3, o |
| `p102x3\C2629pd.java` | C2629pd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:168) renamed: x3, o strings: [ðŸŽ‰ | FREE SHIPPING UNLOCKED! | Your order ships free â€” 5+ notebooks in cart | SUBTOTAL | Continue] |
| `p102x3\C2630pe.java` | C2630pe |  renamed: x3, a |
| `p102x3\C2631q.java` | C2631q |  trace: com.notescrafter.ui.screens.SocialCard.<anonymous> (CommunityScreen.kt:315) renamed: x3, o strings: [Connect] |
| `p102x3\C2632q0.java` | C2632q0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$LogoSelectionScreenKt.lambda-1.<anonymous> (LogoSelectionScreen.kt:119) renamed: x3, o |
| `p102x3\C2633q1.java` | C2633q1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfMergeScreenKt.lambda-9.<anonymous> (PdfMergeScreen.kt:919) renamed: x3, o strings: [Add More Files] |
| `p102x3\C2634q2.java` | C2634q2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintAddressesScreenKt.lambda-9.<anonymous> (PrintAddressesScreen.kt:945) renamed: x3, o |
| `p102x3\C2635q3.java` | C2635q3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-3.<anonymous> (ToDoScreen.kt:178) renamed: x3, o strings: [Tap to add exams] |
| `p102x3\C2637q5.java` | C2637q5 | **[KNOWN]** TOOLS card content lambda (GlobalHomeScreen) trace: com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:247) renamed: x3, o |
| `p102x3\C2639q7.java` | C2639q7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:754) renamed: x3, o |
| `p102x3\C2640q8.java` | C2640q8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:862) renamed: x3, o |
| `p102x3\C2641q9.java` | C2641q9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:586) renamed: x3, o strings: [Select PDF to Split | Choose a single PDF document from your device | Choose File] |
| `p102x3\C2644qc.java` | C2644qc |  renamed: x3, o |
| `p102x3\C2645qd.java` | C2645qd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:161) renamed: x3, o |
| `p102x3\C2646qe.java` | C2646qe |  renamed: x3, a |
| `p102x3\C2650r3.java` | C2650r3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-4.<anonymous> (ToDoScreen.kt:233) renamed: x3, o strings: [Clear All] |
| `p102x3\C2652r5.java` | C2652r5 |  trace: com.notescrafter.ui.screens.ProductContainer.<anonymous> (GlobalHomeScreen.kt:350) renamed: x3, o strings: [NotesCrafter] |
| `p102x3\C2653r6.java` |  |  renamed: x3, o |
| `p102x3\C2654r7.java` | C2654r7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:819) renamed: x3, o strings: [Compression Mode] |
| `p102x3\C2655r8.java` | C2655r8 |  trace: com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous> (PdfInvertScreen.kt:892) renamed: x3, o |
| `p102x3\C2656r9.java` | C2656r9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:579) renamed: x3, o |
| `p102x3\C2659rc.java` | C2659rc |  renamed: x3, o |
| `p102x3\C2661re.java` | C2661re |  renamed: x3, a |
| `p102x3\C2662s.java` | C2662s |  renamed: x3, a |
| `p102x3\C2663s0.java` | C2663s0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-1.<anonymous> (PdfAddPageNumbersScreen.kt:385) renamed: x3, o |
| `p102x3\C2664s1.java` | C2664s1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-1.<anonymous> (PdfOrganizeScreen.kt:447) renamed: x3, o |
| `p102x3\C2665s2.java` | C2665s2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-1.<anonymous> (PrintLandingScreen.kt:317) renamed: x3, o |
| `p102x3\C2666s3.java` | C2666s3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-6.<anonymous> (ToDoScreen.kt:443) renamed: x3, o strings: [Add Exam] |
| `p102x3\C2667s4.java` |  |  renamed: x3, o |
| `p102x3\C2668s5.java` | C2668s5 |  trace: com.notescrafter.ui.screens.WebStyleCTA.<anonymous> (GlobalHomeScreen.kt:432) renamed: x3, o |
| `p102x3\C2670s7.java` | C2670s7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:887) renamed: x3, o strings: [Select Compression Level: | Compress to under:] |
| `p102x3\C2671s8.java` | C2671s8 |  renamed: x3, o |
| `p102x3\C2672s9.java` | C2672s9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:739) renamed: x3, o |
| `p102x3\C2675sc.java` | C2675sc |  renamed: x3, o |
| `p102x3\C2676sd.java` | C2676sd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:469) renamed: x3, o strings: [Configure Your Print | Upload PDFs and configure your notebooks.] |
| `p102x3\C2678t.java` | C2678t |  trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-1.<anonymous> (AboutUsScreen.kt:60) renamed: x3, o strings: [Our Mission | 100% free. 100% private. Forever.] |
| `p102x3\C2679t0.java` | C2679t0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-11.<anonymous> (PdfAddPageNumbersScreen.kt:1103) renamed: x3, o |
| `p102x3\C2680t1.java` | C2680t1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-10.<anonymous> (PdfOrganizeScreen.kt:1090) renamed: x3, o |
| `p102x3\C2681t2.java` | C2681t2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-2.<anonymous> (PrintLandingScreen.kt:489) renamed: x3, o |
| `p102x3\C2682t3.java` | C2682t3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-7.<anonymous> (ToDoScreen.kt:472) renamed: x3, o |
| `p102x3\C2683t4.java` |  |  renamed: x3, o |
| `p102x3\C2685t6.java` | C2685t6 |  trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelectionScreen.kt:487) renamed: x3, o |
| `p102x3\C2687t8.java` | C2687t8 |  renamed: x3, o |
| `p102x3\C2688t9.java` | C2688t9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:738) renamed: x3, o |
| `p102x3\C2692td.java` | C2692td |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:528) renamed: x3, o |
| `p102x3\C2693te.java` | C2693te | **[KNOWN]** StepItem data class (icon, title, subtitle, index) - LandingScreen.kt renamed: x3, a |
| `p102x3\C2694u.java` | C2694u |  trace: com.notescrafter.ui.screens.ComposableSingletons$AboutUsScreenKt.lambda-2.<anonymous> (AboutUsScreen.kt:164) renamed: x3, o strings: [Our Story] |
| `p102x3\C2695u0.java` | C2695u0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-13.<anonymous> (PdfAddPageNumbersScreen.kt:1122) renamed: x3, o |
| `p102x3\C2696u1.java` | C2696u1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-2.<anonymous> (PdfOrganizeScreen.kt:626) renamed: x3, o strings: [View PDF] |
| `p102x3\C2697u2.java` | C2697u2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-3.<anonymous> (PrintLandingScreen.kt:1772) renamed: x3, o |
| `p102x3\C2698u3.java` | C2698u3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-8.<anonymous> (ToDoScreen.kt:482) renamed: x3, o strings: [Done] |
| `p102x3\C2699u4.java` |  |  renamed: x3, o |
| `p102x3\C2701u6.java` | C2701u6 |  trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:531) renamed: x3, o |
| `p102x3\C2702u7.java` | C2702u7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:1014) renamed: x3, A |
| `p102x3\C2703u8.java` | C2703u8 |  renamed: x3, o |
| `p102x3\C2704u9.java` | C2704u9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:803) renamed: x3, o strings: [Split Mode] |
| `p102x3\C2706ub.java` | C2706ub |  renamed: x3, o |
| `p102x3\C2707uc.java` | C2707uc |  trace: com.notescrafter.ui.screens.NativePDFPageSlider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2333) renamed: x3, o |
| `p102x3\C2708ud.java` | C2708ud |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:539) renamed: x3, o |
| `p102x3\C2711v0.java` | C2711v0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-15.<anonymous> (PdfAddPageNumbersScreen.kt:1141) renamed: x3, o |
| `p102x3\C2712v1.java` | C2712v1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-3.<anonymous> (PdfOrganizeScreen.kt:649) renamed: x3, o strings: [Share PDF] |
| `p102x3\C2713v2.java` | C2713v2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-4.<anonymous> (PrintLandingScreen.kt:1913) renamed: x3, o strings: [Unlock Deal] |
| `p102x3\C2714v3.java` | C2714v3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-9.<anonymous> (ToDoScreen.kt:723) renamed: x3, o |
| `p102x3\C2717v6.java` | C2717v6 |  trace: com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelectionScreen.kt:507) renamed: x3, o |
| `p102x3\C2718v7.java` | C2718v7 |  trace: com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous> (PdfCompressScreen.kt:1044) renamed: x3, o |
| `p102x3\C2719v8.java` | C2719v8 |  renamed: x3, A |
| `p102x3\C2720v9.java` | C2720v9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:872) renamed: x3, o strings: [Split every N pages: | Pages to extract (e.g. 1, 3, 5-8):] |
| `p102x3\C2721va.java` |  |  renamed: x3, o |
| `p102x3\C2722vb.java` | C2722vb |  renamed: x3, o |
| `p102x3\C2724vd.java` | C2724vd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:553) renamed: x3, o |
| `p102x3\C2725ve.java` | C2725ve |  renamed: x3, o |
| `p102x3\C2726w.java` | C2726w |  trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-1.<anonymous> (CommunityPassScreen.kt:415) renamed: x3, o strings: [Why Your Support Matters | Every pass directly funds the mission.] |
| `p102x3\C2727w0.java` | C2727w0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-2.<anonymous> (PdfAddPageNumbersScreen.kt:607) renamed: x3, o strings: [View PDF] |
| `p102x3\C2728w1.java` | C2728w1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-4.<anonymous> (PdfOrganizeScreen.kt:665) renamed: x3, o strings: [Process Another File] |
| `p102x3\C2729w2.java` | C2729w2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-5.<anonymous> (PrintLandingScreen.kt:2613) renamed: x3, o strings: [Get Help & Support] |
| `p102x3\C2731w4.java` |  |  renamed: x3, o |
| `p102x3\C2732w5.java` |  |  renamed: x3, o |
| `p102x3\C2733w6.java` | C2733w6 |  trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:189) renamed: x3, o |
| `p102x3\C2734w7.java` | C2734w7 |  renamed: x3, o |
| `p102x3\C2735w8.java` | C2735w8 |  renamed: x3, o |
| `p102x3\C2737wa.java` |  |  renamed: x3, o |
| `p102x3\C2738wb.java` | C2738wb |  renamed: x3, o |
| `p102x3\C2739wc.java` | C2739wc |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1920) renamed: x3, o strings: [COMMUNITY PASS BENEFIT] |
| `p102x3\C2740wd.java` | C2740wd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:578) renamed: x3, o |
| `p102x3\C2741we.java` | C2741we |  renamed: x3, o |
| `p102x3\C2742x.java` | C2742x |  trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-2.<anonymous> (CommunityPassScreen.kt:500) renamed: x3, o strings: [Important Information | â€¢] |
| `p102x3\C2743x0.java` | C2743x0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-3.<anonymous> (PdfAddPageNumbersScreen.kt:630) renamed: x3, o strings: [Share PDF] |
| `p102x3\C2744x1.java` | C2744x1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-5.<anonymous> (PdfOrganizeScreen.kt:793) renamed: x3, o strings: [On-Device Page Control] |
| `p102x3\C2746x3.java` | C2746x3 |  trace: com.notescrafter.ui.screens.ComposableSingletons$UploadScreenKt.lambda-2.<anonymous> (UploadScreen.kt:270) renamed: x3, o strings: [Subscribe Now] |
| `p102x3\C2747x4.java` | C2747x4 |  trace: com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:659) renamed: x3, o |
| `p102x3\C2748x5.java` | C2748x5 |  trace: com.notescrafter.ui.screens.FAQCard.<anonymous>.<anonymous>.<anonymous> (HelpCenterScreen.kt:363) renamed: x3, o |
| `p102x3\C2749x6.java` | C2749x6 |  trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:203) renamed: x3, o |
| `p102x3\C2750x7.java` | C2750x7 |  renamed: x3, o |
| `p102x3\C2751x8.java` | C2751x8 |  renamed: x3, o |
| `p102x3\C2752x9.java` | C2752x9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:940) renamed: x3, A |
| `p102x3\C2754xb.java` |  |  renamed: x3, o |
| `p102x3\C2755xc.java` | C2755xc |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1430) renamed: x3, o strings: [SYNCING PDF DOCUMENT...] |
| `p102x3\C2756xd.java` | C2756xd |  renamed: x3, o |
| `p102x3\C2759y0.java` | C2759y0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-4.<anonymous> (PdfAddPageNumbersScreen.kt:645) renamed: x3, o strings: [Process Another File] |
| `p102x3\C2760y1.java` | C2760y1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-6.<anonymous> (PdfOrganizeScreen.kt:869) renamed: x3, o strings: [Delete] |
| `p102x3\C2761y2.java` | C2761y2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintMyOrdersScreenKt.lambda-1.<anonymous> (PrintMyOrdersScreen.kt:233) renamed: x3, o |
| `p102x3\C2763y4.java` | C2763y4 |  trace: com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:656) renamed: x3, o |
| `p102x3\C2764y5.java` | C2764y5 |  trace: com.notescrafter.ui.screens.FAQCard.<anonymous> (HelpCenterScreen.kt:340) renamed: x3, o |
| `p102x3\C2765y6.java` | C2765y6 |  trace: com.notescrafter.ui.screens.LogoSelectionScreen.<anonymous>.<anonymous>.<anonymous> (LogoSelectionScreen.kt:135) renamed: x3, o strings: [Shape: | Page:] |
| `p102x3\C2766y7.java` | C2766y7 |  renamed: x3, A |
| `p102x3\C2767y8.java` | C2767y8 |  trace: com.notescrafter.ui.screens.PdfInvertStepItem.<anonymous> (PdfInvertScreen.kt:996) renamed: x3, o |
| `p102x3\C2768y9.java` | C2768y9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous> (PdfSplitScreen.kt:970) renamed: x3, o |
| `p102x3\C2769ya.java` | C2769ya |  renamed: x3, o |
| `p102x3\C2770yb.java` |  |  renamed: x3, o |
| `p102x3\C2771yc.java` | C2771yc |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1482) renamed: x3, o strings: [PDF SYNC VERIFIED | Change] |
| `p102x3\C2772yd.java` | C2772yd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:461) renamed: x3, o |
| `p102x3\C2773ye.java` | C2773ye |  trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:288) renamed: x3, o |
| `p102x3\C2774z.java` | C2774z |  trace: com.notescrafter.ui.screens.ComposableSingletons$CommunityScreenKt.lambda-1.<anonymous> (CommunityScreen.kt:224) renamed: x3, o strings: [Join Our Growing Community | You're Not Alone in Your Journey] |
| `p102x3\C2775z0.java` | C2775z0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-5.<anonymous> (PdfAddPageNumbersScreen.kt:730) renamed: x3, o strings: [How it works] |
| `p102x3\C2776z1.java` | C2776z1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfOrganizeScreenKt.lambda-7.<anonymous> (PdfOrganizeScreen.kt:880) renamed: x3, o strings: [Duplicate] |
| `p102x3\C2779z4.java` |  |  renamed: x3, o |
| `p102x3\C2780z5.java` | C2780z5 |  trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous> (HelpCenterScreen.kt:149); com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous> (PrintAddressesScreen.kt:559) renamed: x3, o |
| `p102x3\C2781z6.java` | C2781z6 |  trace: com.notescrafter.ui.screens.TinyControlIcon.<anonymous> (LogoSelectionScreen.kt:546) renamed: x3, o |
| `p102x3\C2784z9.java` | C2784z9 |  renamed: x3, o |
| `p102x3\C2785za.java` |  |  renamed: x3, o |
| `p102x3\C2786zb.java` | C2786zb |  trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:1534) renamed: x3, o strings: [Tap to Watch] |
| `p102x3\C2787zc.java` | C2787zc |  trace: com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1538) renamed: x3, o strings: [FILE SYNC ERROR | Retry] |
| `p102x3\C2788zd.java` | C2788zd |  trace: com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous> (PrintOrderScreens.kt:156) renamed: x3, A |
| `p102x3\C2789ze.java` | C2789ze |  trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous> (SuccessScreen.kt:208) renamed: x3, o strings: [Review the Notes Before Printing | Enhanced PDF] |
| `p102x3\C3.java` | C3 |  trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (ContactUsScreen.kt:80) renamed: o strings: [Instant Live Support] |
| `p102x3\C4.java` | C4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:449) renamed: o |
| `p102x3\C5.java` | C5 |  trace: com.notescrafter.ui.screens.HelpCenterScreen.<anonymous>.<anonymous>.<anonymous> (HelpCenterScreen.kt:274) renamed: o strings: [Still need help?] |
| `p102x3\C6.java` | C6 |  renamed: a, b |
| `p102x3\C7.java` | C7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:368) renamed: o strings: [Crop PDF] |
| `p102x3\C8.java` | C8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:243) renamed: o strings: [Merge PDF] |
| `p102x3\C9.java` | C9 |  trace: com.notescrafter.ui.screens.PdfSplitScreen (PdfSplitScreen.kt:62); com.notescrafter.ui.screens.SplitStepItem (PdfSplitScreen.kt:1078) |
| `p102x3\Ca.java` | Ca |  trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:469) renamed: o strings: [Add active task...] |
| `p102x3\Cb.java` | Cb |  trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:1756) renamed: o |
| `p102x3\Cc.java` | Cc |  trace: com.notescrafter.ui.screens.PdfSourcePickerDialog.<anonymous> (PrintOrderScreens.kt:776) renamed: o, r strings: [Select PDF Source | NOTESCRAFTER DOWNLOADS | No NotesCrafter downloads found | Choose from Phone Storage] |
| `p102x3\Cd.java` | Cd |  renamed: o |
| `p102x3\Ce.java` | Ce |  trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:342) renamed: o |
| `p102x3\cf.java` | cf |  trace: com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:111) renamed: o, r strings: [Tap button below to browse] |
| `p102x3\D.java` | D |  trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-2.<anonymous> (ContactUsScreen.kt:154) renamed: o strings: [Chat on WhatsApp] |
| `p102x3\D0.java` | D0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-9.<anonymous> (PdfAddPageNumbersScreen.kt:867) renamed: o |
| `p102x3\D1.java` | D1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-1.<anonymous> (PdfSplitScreen.kt:367) renamed: o |
| `p102x3\D2.java` | D2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-13.<anonymous> (PrintOrderScreens.kt:2753) renamed: o strings: [000000] |
| `p102x3\D3.java` | D3 |  trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (ContactUsScreen.kt:190) renamed: o strings: [Get in touch | Address | NotesCrafter\nwww.notescrafter.com] |
| `p102x3\D4.java` | D4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:135) renamed: o |
| `p102x3\D5.java` | D5 |  trace: com.notescrafter.ui.screens.FAQCard (HelpCenterScreen.kt:334); com.notescrafter.ui.screens.HelpCenterScreen (HelpCenterScreen.kt:45) strings: [Help Center] |
| `p102x3\D6.java` | D6 |  renamed: a, b |
| `p102x3\D7.java` | D7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:455) renamed: o, r strings: [DOCUMENT RECEIPT | SUCCESS | Filename | Page Count | File Size] |
| `p102x3\D8.java` | D8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:335) renamed: o strings: [FILE SIZE | TOTAL PAGES] |
| `p102x3\Da.java` | Da |  renamed: o, r |
| `p102x3\Db.java` | Db |  trace: com.notescrafter.ui.screens.NcfGallerySlider.<anonymous> (PrintLandingScreen.kt:1741) renamed: o |
| `p102x3\Dc.java` | Dc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3423) renamed: o strings: [ORDER ID | DELIVERY BY | 3-7 business days | AMOUNT PAID] |
| `p102x3\Dd.java` | Dd |  renamed: o |
| `p102x3\De.java` | De |  trace: com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous> (SuccessScreen.kt:526) renamed: o, r strings: [File downloaded successfully | Enhanced PDF] |
| `p102x3\df.java` | df |  trace: com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:211) renamed: o strings: [Help Us Reach 100K Subscribers! | Every subscription helps us keep NotesCrafter free forever] |
| `p102x3\E.java` | E |  trace: com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-3.<anonymous> (ContactUsScreen.kt:321); com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-1.<anonymous> (DownloadsScreen.kt:127); com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-2.<anonymous> (DownloadsScreen.kt:148) renamed: o, r strings: [Visit Help Center â†’ | Cancel | Rename | Edit Selection | Add Slide] |
| `p102x3\E0.java` | E0 |  renamed: a, b |
| `p102x3\E1.java` | E1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-2.<anonymous> (PdfSplitScreen.kt:572) renamed: o strings: [Split Another File] |
| `p102x3\E2.java` | E2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-15.<anonymous> (PrintOrderScreens.kt:3017) renamed: o strings: [Add Shipping Address] |
| `p102x3\E3.java` | E3 |  trace: com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (ContactUsScreen.kt:308) renamed: o strings: [Looking for quick answers?] |
| `p102x3\E4.java` |  | **[KNOWN]** EnhanceScreen filter-toggle lambdas renamed: o |
| `p102x3\E5.java` | E5 |  trace: com.notescrafter.ui.screens.InfoPageScreen.<anonymous>.<anonymous> (InfoPages.kt:35) renamed: o |
| `p102x3\E6.java` | E6 |  renamed: o |
| `p102x3\E7.java` | E7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:404) renamed: o, r strings: [PDF Cropped!] |
| `p102x3\E8.java` | E8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:275) renamed: o, r strings: [Merged Successfully! | Your combined document is ready to use] |
| `p102x3\Ea.java` | Ea |  renamed: o, r |
| `p102x3\Eb.java` | Eb |  trace: com.notescrafter.ui.screens.PrintFaqAccordionItem.<anonymous> (PrintLandingScreen.kt:1405) renamed: o |
| `p102x3\Ec.java` | Ec |  renamed: o, r |
| `p102x3\Ed.java` | Ed |  renamed: o |
| `p102x3\Ee.java` | Ee |  trace: com.notescrafter.ui.screens.SizeInfo (SuccessScreen.kt:663); com.notescrafter.ui.screens.SuccessScreen (SuccessScreen.kt:99) renamed: a strings: [Custom Printed Notebook | ðŸŽ‰ | Flat 10% OFF | on your first print order | FIRST10] |
| `p102x3\ef.java` | ef |  trace: com.notescrafter.ui.screens.FeatureTile (UploadScreen.kt:344); com.notescrafter.ui.screens.StatItemCompact (UploadScreen.kt:364); com.notescrafter.ui.screens.UploadScreen (UploadScreen.kt:56) strings: [Upload Files | Select PDF files from your device to begin processing.] |
| `p102x3\EnumC2380a4.java` | EnumC2380a4 |  renamed: x3, o |
| `p102x3\EnumC2386aa.java` | EnumC2386aa |  renamed: x3, o |
| `p102x3\EnumC2422ce.java` | EnumC2422ce |  renamed: x3, o |
| `p102x3\EnumC2454ee.java` | EnumC2454ee |  renamed: x3, o |
| `p102x3\EnumC2604o4.java` | EnumC2604o4 |  renamed: x3, o |
| `p102x3\EnumC2614oe.java` | EnumC2614oe |  renamed: x3, o |
| `p102x3\EnumC2677se.java` | EnumC2677se |  renamed: x3, o |
| `p102x3\EnumC2778z3.java` | EnumC2778z3 |  renamed: x3, o |
| `p102x3\F.java` | F | **[KNOWN]** filter toggle lambda (EnhanceScreen) renamed: a, b |
| `p102x3\F0.java` | F0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-1.<anonymous> (PdfCompressScreen.kt:334) renamed: o |
| `p102x3\F1.java` | F1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-3.<anonymous> (PdfSplitScreen.kt:656) renamed: o strings: [How it works] |
| `p102x3\F2.java` | F2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-16.<anonymous> (PrintOrderScreens.kt:3194) renamed: o |
| `p102x3\F3.java` | F3 |  trace: com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339); com.notescrafter.ui.screens.ContactUsScreen (ContactUsScreen.kt:42) strings: [Contact Us] |
| `p102x3\F4.java` | F4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:243) renamed: o |
| `p102x3\F5.java` | F5 |  trace: com.notescrafter.ui.screens.InfoPageScreen (InfoPages.kt:19) |
| `p102x3\F6.java` | F6 |  renamed: o, r |
| `p102x3\F7.java` | F7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:623) renamed: o strings: [Select PDF to Crop | Choose a single PDF document to crop margins | Choose File] |
| `p102x3\F8.java` | F8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:481) renamed: o strings: [Select PDFs to Merge | Choose 2 or more PDF documents from your device | Choose Files] |
| `p102x3\F9.java` | F9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:309) renamed: o strings: [PDF to JPG] |
| `p102x3\Fa.java` | Fa |  renamed: o, r |
| `p102x3\Fb.java` | Fb |  trace: com.notescrafter.ui.screens.PrintFeatureCard.<anonymous> (PrintLandingScreen.kt:972) renamed: o |
| `p102x3\Fc.java` | Fc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3483) renamed: o, r |
| `p102x3\Fd.java` | Fd |  renamed: o, r |
| `p102x3\G.java` | G |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-10.<anonymous> (DownloadsScreen.kt:427) renamed: o strings: [Delete] |
| `p102x3\G0.java` | G0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-2.<anonymous> (PdfCompressScreen.kt:576) renamed: o strings: [Share PDF] |
| `p102x3\G1.java` | G1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-4.<anonymous> (PdfSplitScreen.kt:668) renamed: o |
| `p102x3\G2.java` | G2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-17.<anonymous> (PrintOrderScreens.kt:3578) renamed: o |
| `p102x3\G3.java` | G3 |  renamed: a, b |
| `p102x3\G4.java` | G4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:169) renamed: o, r strings: [ADVANCED FILTERS CONTROL] |
| `p102x3\G5.java` | G5 |  renamed: o |
| `p102x3\G6.java` | G6 |  renamed: a, b |
| `p102x3\G7.java` | G7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:616) renamed: o |
| `p102x3\G8.java` | G8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:474) renamed: o |
| `p102x3\G9.java` | G9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:345) renamed: o strings: [Conversion Successful!] |
| `p102x3\Ga.java` | Ga |  trace: com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:408) renamed: o, r strings: [Focus Checklist] |
| `p102x3\Gb.java` | Gb |  renamed: o |
| `p102x3\Gc.java` | Gc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:3477) renamed: o, r |
| `p102x3\Gd.java` | Gd |  trace: com.notescrafter.ui.screens.A4CoverPage (PrintOrderScreens.kt:2164); com.notescrafter.ui.screens.AddressBottomSheet (PrintOrderScreens.kt:4445); com.notescrafter.ui.screens.EmptyUploadDropZone (PrintOrderScreens.kt:963) strings: [NO COVER TITLE | Loading dynamic preview... | Preview is syncing... | Order Placed! ðŸŽ‰ | Back to Home] |
| `p102x3\H.java` | H |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-11.<anonymous> (DownloadsScreen.kt:436) renamed: o |
| `p102x3\H0.java` | H0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-3.<anonymous> (PdfCompressScreen.kt:587) renamed: o strings: [Compress Another File] |
| `p102x3\H1.java` | H1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-5.<anonymous> (PdfSplitScreen.kt:700) renamed: o strings: [Secure Local Splitting] |
| `p102x3\H2.java` | H2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-18.<anonymous> (PrintOrderScreens.kt:3641) renamed: o |
| `p102x3\H3.java` | H3 |  renamed: a, b |
| `p102x3\H4.java` | H4 | **[KNOWN]** EnhanceScreen.kt anonymous (Remove Logo section, EnhanceScreen.kt:289) trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:289) renamed: o |
| `p102x3\H5.java` | H5 |  renamed: o |
| `p102x3\H7.java` | H7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:776) renamed: o, r |
| `p102x3\H8.java` | H8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:651) renamed: o strings: [FILES | PAGES] |
| `p102x3\Ha.java` | Ha |  renamed: a, b |
| `p102x3\Hb.java` | Hb |  renamed: o |
| `p102x3\Hd.java` | Hd |  trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (PrintPriceCalculatorScreen.kt:281) renamed: o strings: [Configure Print Specs | PAGE COUNT | 10 pgs | 130 pgs | 250 pgs (Limit)] |
| `p102x3\I.java` | I |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-4.<anonymous> (DownloadsScreen.kt:193) renamed: o strings: [Delete] |
| `p102x3\I0.java` | I0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-4.<anonymous> (PdfCompressScreen.kt:672) renamed: o strings: [How it works] |
| `p102x3\I1.java` | I1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-6.<anonymous> (PdfSplitScreen.kt:694) renamed: o |
| `p102x3\I2.java` | I2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-19.<anonymous> (PrintOrderScreens.kt:4265) renamed: o strings: [e.g. FIRST10] |
| `p102x3\I3.java` |  |  renamed: o, r |
| `p102x3\I4.java` | I4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:323) renamed: o |
| `p102x3\I7.java` | I7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:775) renamed: o, r |
| `p102x3\I8.java` | I8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:646) renamed: o |
| `p102x3\I9.java` | I9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:409) renamed: o strings: [ZIP Archive â€¢ ] |
| `p102x3\Ia.java` | Ia |  trace: com.notescrafter.ui.screens.TimerTaskItem.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:584) renamed: o |
| `p102x3\Ib.java` | Ib |  trace: com.notescrafter.ui.screens.PrintLandingScreen.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:192) renamed: o, r strings: [Start Your Order | Sign In with Google] |
| `p102x3\Ic.java` | Ic |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3615) renamed: o strings: [âœ¦ Almost done! | Review & Pay | Your order is secured and ready to be placed.] |
| `p102x3\Id.java` | Id |  trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<anonymous> (PrintPriceCalculatorScreen.kt:430) renamed: o strings: [SPINE THICKNESS SIMULATOR | Notes | INCLUDED BASE COSTS | Golden Wiro Binding | â‚¹50.00] |
| `p102x3\Ie.java` | Ie |  renamed: o |
| `p102x3\J.java` | J |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-5.<anonymous> (DownloadsScreen.kt:215) renamed: o |
| `p102x3\J0.java` | J0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-5.<anonymous> (PdfCompressScreen.kt:684) renamed: o |
| `p102x3\J1.java` | J1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-7.<anonymous> (PdfSplitScreen.kt:793) renamed: o |
| `p102x3\J2.java` | J2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-2.<anonymous> (PrintOrderScreens.kt:589) renamed: o strings: [Add Another notebook] |
| `p102x3\J3.java` |  |  renamed: o |
| `p102x3\J4.java` | J4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:345) renamed: o |
| `p102x3\J5.java` |  |  renamed: o, r |
| `p102x3\J6.java` | J6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:371) renamed: o strings: [Add Page Numbers] |
| `p102x3\J8.java` | J8 |  renamed: o |
| `p102x3\J9.java` | J9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:403) renamed: o |
| `p102x3\Ja.java` | Ja |  trace: com.notescrafter.ui.screens.ControlButton (PomodoroTimerScreen.kt:602); com.notescrafter.ui.screens.PomodoroTimerScreen (PomodoroTimerScreen.kt:65); com.notescrafter.ui.screens.TimerTaskItem (PomodoroTimerScreen.kt:537) |
| `p102x3\Jb.java` | Jb |  trace: com.notescrafter.ui.screens.PrintReviewCard.<anonymous> (PrintLandingScreen.kt:1241) renamed: o strings: [Verified Student | India] |
| `p102x3\Jc.java` | Jc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3788) renamed: o |
| `p102x3\Jd.java` | Jd |  trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintPriceCalculatorScreen.kt:849) renamed: o strings: [Upgrade to ] |
| `p102x3\K.java` | K |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-6.<anonymous> (DownloadsScreen.kt:365) renamed: o |
| `p102x3\K0.java` | K0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-6.<anonymous> (PdfCompressScreen.kt:716) renamed: o strings: [On-Device Compression] |
| `p102x3\K1.java` | K1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfSplitScreenKt.lambda-8.<anonymous> (PdfSplitScreen.kt:897) renamed: o |
| `p102x3\K2.java` | K2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-20.<anonymous> (PrintOrderScreens.kt:4363) renamed: o |
| `p102x3\K3.java` | K3 |  trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DownloadsScreen.kt:401) renamed: o |
| `p102x3\K4.java` |  |  renamed: o, r |
| `p102x3\K5.java` |  |  renamed: o, r |
| `p102x3\K6.java` | K6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:458) renamed: o, r strings: [DOCUMENT RECEIPT | SUCCESS | Filename | Page Count | File Size] |
| `p102x3\K7.java` | K7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:841) renamed: o, r strings: [Page Preview & Margins] |
| `p102x3\K8.java` | K8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:746) renamed: o |
| `p102x3\K9.java` | K9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:591) renamed: o, r |
| `p102x3\Ka.java` |  |  renamed: o, r |
| `p102x3\Kb.java` | Kb |  trace: com.notescrafter.ui.screens.PrintStepCard.<anonymous> (PrintLandingScreen.kt:1066) renamed: o |
| `p102x3\Kc.java` | Kc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3694) renamed: o strings: [Review Your Items] |
| `p102x3\Kd.java` | Kd |  trace: com.notescrafter.ui.screens.PrintPriceCalculatorScreen (PrintPriceCalculatorScreen.kt:115) renamed: a strings: [SINGLE NOTEBOOK ESTIMATOR | Print Pricing Calculator | Simulate specs and see pass savings instantly. | Active Pass | VIP] |
| `p102x3\Ke.java` | Ke |  trace: com.notescrafter.ui.screens.AnalogClock.<anonymous> (ToDoScreen.kt:852) renamed: o |
| `p102x3\L.java` | L |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-7.<anonymous> (DownloadsScreen.kt:379) renamed: o |
| `p102x3\L0.java` | L0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-7.<anonymous> (PdfCompressScreen.kt:710) renamed: o |
| `p102x3\L1.java` | L1 |  renamed: a, b |
| `p102x3\L2.java` | L2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-21.<anonymous> (PrintOrderScreens.kt:4377) renamed: o |
| `p102x3\L3.java` | L3 |  trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DownloadsScreen.kt:395) renamed: o |
| `p102x3\L4.java` | L4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:367) renamed: o |
| `p102x3\L5.java` | L5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:301) renamed: o strings: [JPG to PDF] |
| `p102x3\L6.java` | L6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:407) renamed: o, r strings: [PDF Numbered!] |
| `p102x3\L7.java` |  |  renamed: o, r |
| `p102x3\L8.java` | L8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:908) renamed: o, r |
| `p102x3\L9.java` | L9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:613) renamed: o strings: [Select PDF to Convert | Choose a single PDF document from your device | Choose File] |
| `p102x3\La.java` | La |  trace: com.notescrafter.ui.screens.PageThumbnail.<anonymous>.<anonymous> (PreviewScreen.kt:723) renamed: o |
| `p102x3\Lb.java` | Lb |  trace: com.notescrafter.ui.screens.PrintSupportSection.<anonymous>.<anonymous> (PrintLandingScreen.kt:2584) renamed: o strings: [Still have questions?] |
| `p102x3\Lc.java` | Lc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3680) renamed: o |
| `p102x3\Ld.java` | Ld |  renamed: a, b |
| `p102x3\Le.java` | Le |  trace: com.notescrafter.ui.screens.ExamCardItem.<anonymous> (ToDoScreen.kt:529) renamed: o, r |
| `p102x3\M.java` | M |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-8.<anonymous> (DownloadsScreen.kt:406) renamed: o strings: [Rename] |
| `p102x3\M0.java` | M0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCompressScreenKt.lambda-8.<anonymous> (PdfCompressScreen.kt:809) renamed: o |
| `p102x3\M1.java` | M1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-1.<anonymous> (PdfToJpgScreen.kt:323) renamed: o |
| `p102x3\M2.java` | M2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-22.<anonymous> (PrintOrderScreens.kt:4454) renamed: o |
| `p102x3\M3.java` | M3 |  trace: com.notescrafter.ui.screens.DownloadedFileItem.<anonymous> (DownloadsScreen.kt:316) renamed: o, r |
| `p102x3\M4.java` |  |  renamed: o, r |
| `p102x3\M5.java` |  |  renamed: o |
| `p102x3\M6.java` | M6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:660) renamed: o strings: [Select PDF File | Choose a single PDF document to add numbering | Choose File] |
| `p102x3\M7.java` | M7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:939) renamed: o |
| `p102x3\M8.java` | M8 |  trace: com.notescrafter.ui.screens.PdfMergeScreen.<anonymous> (PdfMergeScreen.kt:958) renamed: o, r |
| `p102x3\M9.java` | M9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:606) renamed: o |
| `p102x3\Ma.java` | Ma |  trace: com.notescrafter.ui.screens.PageThumbnail.<anonymous> (PreviewScreen.kt:615) renamed: o, r strings: [Blank | Slide | Edited] |
| `p102x3\Mb.java` | Mb |  trace: com.notescrafter.ui.screens.UnifiedShippingAndEddCard.<anonymous> (PrintLandingScreen.kt:2235) renamed: o, r strings: [Free Shipping Activated | Calculating estimated delivery... | ðŸ“ No address saved to estimate arrival. | Add Address â†’ | Sign in to see estimated delivery date for your pincode.] |
| `p102x3\Mc.java` | Mc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3832) renamed: o strings: [Delivering to | Verified Phone] |
| `p102x3\Me.java` | Me |  trace: com.notescrafter.ui.screens.ManageExamsContent.<anonymous>.<anonymous> (ToDoScreen.kt:431) renamed: o |
| `p102x3\N.java` | N |  trace: com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-9.<anonymous> (DownloadsScreen.kt:415) renamed: o |
| `p102x3\N0.java` | N0 |  renamed: a, b |
| `p102x3\N1.java` | N1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-10.<anonymous> (PdfToJpgScreen.kt:820) renamed: o |
| `p102x3\N2.java` | N2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-23.<anonymous> (PrintOrderScreens.kt:4538) renamed: o strings: [Add New Address] |
| `p102x3\N3.java` | N3 |  renamed: o |
| `p102x3\N4.java` | N4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:388) renamed: o |
| `p102x3\N5.java` | N5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:388) renamed: o, r strings: [DOCUMENT RECEIPT | SUCCESS | Filename | Page Count | File Size] |
| `p102x3\N6.java` | N6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:653) renamed: o |
| `p102x3\N7.java` | N7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:956) renamed: o |
| `p102x3\N8.java` | N8 |  renamed: o |
| `p102x3\N9.java` | N9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:766) renamed: o, r |
| `p102x3\Na.java` |  |  renamed: o, r |
| `p102x3\Nb.java` | Nb |  renamed: o |
| `p102x3\Ne.java` | Ne |  trace: com.notescrafter.ui.screens.TaskItemMinimal.<anonymous> (ToDoScreen.kt:659) renamed: o, r |
| `p102x3\O.java` | O |  renamed: a, b |
| `p102x3\O0.java` | O0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-1.<anonymous> (PdfCropScreen.kt:382) renamed: o |
| `p102x3\O1.java` | O1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-2.<anonymous> (PdfToJpgScreen.kt:451) renamed: o |
| `p102x3\O2.java` | O2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-24.<anonymous> (PrintOrderScreens.kt:4763) renamed: o strings: [Cancel] |
| `p102x3\O3.java` | O3 |  renamed: o |
| `p102x3\O5.java` | O5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:337) renamed: o, r strings: [PDF Created!] |
| `p102x3\O6.java` |  |  renamed: o |
| `p102x3\O7.java` | O7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:924) renamed: o, r |
| `p102x3\O8.java` | O8 |  renamed: o, r |
| `p102x3\O9.java` | O9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:765) renamed: o, r |
| `p102x3\Oa.java` | Oa |  trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:109) renamed: o, r strings: [Confirm Reorder] |
| `p102x3\Ob.java` | Ob |  trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:670) renamed: o |
| `p102x3\Oc.java` |  |  renamed: o |
| `p102x3\Oe.java` | Oe |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:96) renamed: o strings: [Prepare Today . Win Tomorrow] |
| `p102x3\P.java` | P |  trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-1.<anonymous> (EditPageScreen.kt:117) renamed: o |
| `p102x3\P0.java` | P0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-2.<anonymous> (PdfCropScreen.kt:569) renamed: o strings: [View PDF] |
| `p102x3\P1.java` | P1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-3.<anonymous> (PdfToJpgScreen.kt:478) renamed: o |
| `p102x3\P2.java` | P2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-3.<anonymous> (PrintOrderScreens.kt:617) renamed: o |
| `p102x3\P3.java` |  |  renamed: o, r |
| `p102x3\P4.java` | P4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:414) renamed: o |
| `p102x3\P5.java` |  |  renamed: o |
| `p102x3\P6.java` | P6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:813) renamed: o, r |
| `p102x3\P7.java` | P7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:996) renamed: o |
| `p102x3\P8.java` | P8 |  renamed: o, r |
| `p102x3\P9.java` | P9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:830) renamed: o strings: [Image Quality / Resolution] |
| `p102x3\Pa.java` |  |  renamed: o, r |
| `p102x3\Pb.java` | Pb |  trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:467) renamed: o, r strings: [Lowest Prices of All Time | Every Saturday Â· 11 AM â€“ 11 PM IST | B&W / page | â‚¹1.25 | â‚¹0.79] |
| `p102x3\Pc.java` | Pc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:4288) renamed: o strings: [Apply] |
| `p102x3\Pd.java` | Pd |  renamed: o |
| `p102x3\Pe.java` | Pe |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:116) renamed: o |
| `p102x3\Q.java` | Q |  trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-3.<anonymous> (EditPageScreen.kt:636) renamed: o strings: [Apply] |
| `p102x3\Q0.java` | Q0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-3.<anonymous> (PdfCropScreen.kt:592) renamed: o strings: [Share PDF] |
| `p102x3\Q1.java` | Q1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-4.<anonymous> (PdfToJpgScreen.kt:498) renamed: o strings: [Extracted Images] |
| `p102x3\Q2.java` | Q2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-4.<anonymous> (PrintOrderScreens.kt:799) renamed: o |
| `p102x3\Q3.java` | Q3 |  trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:91) renamed: o strings: [Rename File | Enter new name for the file] |
| `p102x3\Q4.java` | Q4 |  trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous> (EnhanceScreen.kt:94) renamed: A, B strings: [Enhance Document | Apply filters to improve quality and customize layout. | Enhancement | Apply AI-inspired enhancements] |
| `p102x3\Q5.java` | Q5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:555) renamed: o strings: [Select Images to PDF | Choose JPG, PNG or WEBP files | Choose Images] |
| `p102x3\Q6.java` | Q6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:812) renamed: o, r |
| `p102x3\Q7.java` | Q7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:965) renamed: o, r strings: [Crop Margins (mm)] |
| `p102x3\Q8.java` | Q8 |  trace: com.notescrafter.ui.screens.MergeStepItem (PdfMergeScreen.kt:1057); com.notescrafter.ui.screens.PdfMergeScreen (PdfMergeScreen.kt:61) |
| `p102x3\Qa.java` | Qa |  trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:169) renamed: o, r strings: [Reorder Slide | Move a slide to a new position.] |
| `p102x3\Qb.java` | Qb |  trace: com.notescrafter.ui.screens.WeekendFlashSaleDialog.<anonymous> (PrintLandingScreen.kt:447) renamed: o, r |
| `p102x3\Qc.java` | Qc |  renamed: o, r |
| `p102x3\Qd.java` | Qd |  trace: com.notescrafter.ui.screens.Particle (ProcessingScreen.kt:347); com.notescrafter.ui.screens.ProcessingIcon (ProcessingScreen.kt:182); com.notescrafter.ui.screens.ProcessingScreen (ProcessingScreen.kt:45) strings: [Processing Document | Please wait while we enhance your PDF. | Transforming pages into enhanced notes...] |
| `p102x3\Qe.java` | Qe |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:152) renamed: o strings: [Track Your Exam] |
| `p102x3\r.java` | r |  trace: com.notescrafter.ui.screens.CommunityScreen (CommunityScreen.kt:88); com.notescrafter.ui.screens.CommunityStat (CommunityScreen.kt:369); com.notescrafter.ui.screens.SocialCard (CommunityScreen.kt:308) strings: [Have questions or want to get in touch directly?] |
| `p102x3\R0.java` | R0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-4.<anonymous> (PdfCropScreen.kt:608) renamed: o strings: [Process Another File] |
| `p102x3\R1.java` | R1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-5.<anonymous> (PdfToJpgScreen.kt:599) renamed: o strings: [Convert Another File] |
| `p102x3\R2.java` | R2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-5.<anonymous> (PrintOrderScreens.kt:974) renamed: o strings: [PRO TIP] |
| `p102x3\R3.java` |  |  renamed: o, r |
| `p102x3\R4.java` |  | **[KNOWN]** LogoSelectionScreen confirm lambda (saves logoBox+logoShape, closes dialog) renamed: o, r |
| `p102x3\R5.java` | R5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:548) renamed: o |
| `p102x3\R9.java` | R9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:899) renamed: o, r |
| `p102x3\Ra.java` | Ra |  trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:287) renamed: o, r strings: [Add Blank Slide] |
| `p102x3\Rb.java` | Rb |  trace: com.notescrafter.ui.screens.AnimatedPromoBanner (PrintLandingScreen.kt:289); com.notescrafter.ui.screens.NcfGallerySlider (PrintLandingScreen.kt:1451); com.notescrafter.ui.screens.PrintFaqAccordionItem (PrintLandingScreen.kt:1392) strings: [Frequently Asked | Everything you need to know about our premium print service. | Premium by Default | ðŸ’Ž First Order Diamond Deal Applied! | Price Calculator] |
| `p102x3\Rc.java` | Rc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3904) renamed: o, r |
| `p102x3\Rd.java` | Rd |  renamed: a, b |
| `p102x3\Re.java` | Re |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:172) renamed: o |
| `p102x3\S.java` | S |  trace: com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-4.<anonymous> (EditPageScreen.kt:648) renamed: o |
| `p102x3\S0.java` | S0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-5.<anonymous> (PdfCropScreen.kt:693) renamed: o strings: [How it works] |
| `p102x3\S1.java` | S1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-6.<anonymous> (PdfToJpgScreen.kt:683) renamed: o strings: [How it works] |
| `p102x3\S2.java` |  |  |
| `p102x3\S3.java` | S3 |  trace: com.notescrafter.ui.screens.DownloadsScreen.<anonymous> (DownloadsScreen.kt:160) renamed: o strings: [Delete File] |
| `p102x3\S4.java` | S4 | **[KNOWN]** EnhanceScreen.kt:503 anonymous (opens LogoSelectionScreen with current logoBox) trace: com.notescrafter.ui.screens.EnhanceScreen.<anonymous> (EnhanceScreen.kt:503) renamed: o, r |
| `p102x3\S5.java` | S5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:707) renamed: o |
| `p102x3\S6.java` | S6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.MiniPagePositionIndicator (PdfAddPageNumbersScreen.kt:888); com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:877) renamed: o strings: [Position Alignment] |
| `p102x3\S7.java` | S7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:1019) renamed: A, B |
| `p102x3\S8.java` | S8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:523) renamed: o strings: [DOCUMENT RECEIPT | SUCCESS | Filename | Page Count | File Size] |
| `p102x3\S9.java` | S9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous> (PdfToJpgScreen.kt:929) renamed: o, r |
| `p102x3\Sa.java` | Sa |  trace: com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:378) renamed: o, r strings: [Reset Page Edits?] |
| `p102x3\Sc.java` | Sc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:3606) renamed: A, B |
| `p102x3\Sd.java` | Sd |  trace: com.notescrafter.ui.screens.QuickToolsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuickToolsScreen.kt:129) renamed: o |
| `p102x3\Se.java` | Se |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:186) renamed: o |
| `p102x3\T.java` | T |  renamed: a, b |
| `p102x3\T0.java` | T0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-6.<anonymous> (PdfCropScreen.kt:705) renamed: o |
| `p102x3\T1.java` | T1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-7.<anonymous> (PdfToJpgScreen.kt:695) renamed: o |
| `p102x3\T2.java` | T2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-6.<anonymous> (PrintOrderScreens.kt:1025) renamed: o strings: [Select PDF files to print | Tap to browse your device for a PDF file] |
| `p102x3\T3.java` | T3 |  renamed: o |
| `p102x3\T4.java` | T4 |  renamed: o, r |
| `p102x3\T5.java` |  |  renamed: o, r |
| `p102x3\T6.java` | T6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:1025) renamed: o strings: [Number Format Style] |
| `p102x3\T7.java` | T7 |  trace: com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous> (PdfCropScreen.kt:1049) renamed: o, r |
| `p102x3\T8.java` | T8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:684) renamed: o strings: [Select PDF File | Choose a single PDF document to manage pages | Choose File] |
| `p102x3\T9.java` | T9 |  renamed: o, r |
| `p102x3\Ta.java` | Ta |  renamed: o, r |
| `p102x3\Tb.java` | Tb |  renamed: o, r |
| `p102x3\Tc.java` | Tc |  trace: com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous> (PrintOrderScreens.kt:3471) renamed: A, B |
| `p102x3\Td.java` | Td |  trace: com.notescrafter.ui.screens.ToolCard.<anonymous> (QuickToolsScreen.kt:162) renamed: o strings: [Open] |
| `p102x3\Te.java` | Te |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:185) renamed: o |
| `p102x3\U.java` | U |  trace: com.notescrafter.ui.screens.ComposableSingletons$EnhanceScreenKt.lambda-2.<anonymous> (EnhanceScreen.kt:475) renamed: o strings: [Back] |
| `p102x3\U0.java` | U0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-7.<anonymous> (PdfCropScreen.kt:737) renamed: o strings: [On-Device Crop] |
| `p102x3\U1.java` | U1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-8.<anonymous> (PdfToJpgScreen.kt:727) renamed: o strings: [On-Device Image Extraction] |
| `p102x3\U2.java` | U2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-7.<anonymous> (PrintOrderScreens.kt:1356) renamed: o |
| `p102x3\U3.java` | U3 |  renamed: o, r |
| `p102x3\U4.java` | U4 |  renamed: o, r |
| `p102x3\U5.java` | U5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:786) renamed: o |
| `p102x3\U6.java` | U6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:1086) renamed: o strings: [Advanced Styling] |
| `p102x3\U7.java` | U7 |  renamed: o, r |
| `p102x3\U8.java` | U8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:847) renamed: o, r |
| `p102x3\U9.java` | U9 |  renamed: o |
| `p102x3\Ua.java` | Ua |  trace: com.notescrafter.ui.screens.PageThumbnail (PreviewScreen.kt:607); com.notescrafter.ui.screens.PreviewScreen (PreviewScreen.kt:88) strings: [Preview and Edit Pages] |
| `p102x3\Ub.java` | Ub |  trace: com.notescrafter.ui.screens.OrderCardItem.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:809) renamed: o, r strings: [AWB / TRACKING # | EST. DELIVERY | DELIVERING TO] |
| `p102x3\Ud.java` | Ud |  trace: com.notescrafter.ui.screens.QuickToolsScreen (QuickToolsScreen.kt:62); com.notescrafter.ui.screens.ToolCard (QuickToolsScreen.kt:156) renamed: a, b strings: [Everything you need - One tap away] |
| `p102x3\Ue.java` | Ue |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:270) renamed: o strings: [Add a new task...] |
| `p102x3\V.java` | V |  renamed: a, b |
| `p102x3\V0.java` | V0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-8.<anonymous> (PdfCropScreen.kt:731) renamed: o |
| `p102x3\V1.java` | V1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfToJpgScreenKt.lambda-9.<anonymous> (PdfToJpgScreen.kt:721) renamed: o |
| `p102x3\V2.java` | V2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-8.<anonymous> (PrintOrderScreens.kt:1378) renamed: o strings: [UPLOAD SOURCE PDF FILE | Tap to choose a document from your device] |
| `p102x3\V3.java` | V3 |  renamed: o |
| `p102x3\V4.java` | V4 |  renamed: o |
| `p102x3\V5.java` | V5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:798) renamed: o |
| `p102x3\V7.java` | V7 |  renamed: o, r |
| `p102x3\V8.java` | V8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:841) renamed: o, r |
| `p102x3\V9.java` | V9 |  renamed: o, r |
| `p102x3\Va.java` |  |  renamed: o |
| `p102x3\Vb.java` | Vb |  renamed: o |
| `p102x3\Vc.java` | Vc |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2465) renamed: o, r strings: [Continue to Checkout] |
| `p102x3\Vd.java` | Vd |  renamed: a, b |
| `p102x3\Ve.java` | Ve |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:243) renamed: o, r |
| `p102x3\W.java` | W |  trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-1.<anonymous> (HelpCenterScreen.kt:146); com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-10.<anonymous> (PdfAddPageNumbersScreen.kt:1104); com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-12.<anonymous> (PdfAddPageNumbersScreen.kt:1123) renamed: o, r strings: [Search for help... | Font Size | Start From | Skip Pages | From Slide No.] |
| `p102x3\W0.java` | W0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfCropScreenKt.lambda-9.<anonymous> (PdfCropScreen.kt:830) renamed: o |
| `p102x3\W1.java` | W1 |  renamed: a, b |
| `p102x3\W2.java` | W2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-9.<anonymous> (PrintOrderScreens.kt:1633) renamed: o strings: [E.G. SEMESTER 4 NOTES] |
| `p102x3\W3.java` | W3 |  renamed: o, r |
| `p102x3\W4.java` | W4 |  renamed: o, r |
| `p102x3\W5.java` | W5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:720) renamed: o |
| `p102x3\W6.java` | W6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:1163) renamed: A, B |
| `p102x3\W7.java` | W7 |  renamed: o |
| `p102x3\W8.java` | W8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:899) renamed: o, r |
| `p102x3\W9.java` | W9 |  renamed: o, r |
| `p102x3\Wc.java` | Wc |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:2459) renamed: o, r |
| `p102x3\Wd.java` |  |  renamed: o |
| `p102x3\We.java` | We |  trace: com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:205) renamed: o, r strings: [To Do List] |
| `p102x3\X.java` | X |  trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-2.<anonymous> (HelpCenterScreen.kt:147) renamed: o |
| `p102x3\X0.java` | X0 |  renamed: a, b |
| `p102x3\X1.java` | X1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-1.<anonymous> (PomodoroSetupScreen.kt:144) renamed: o |
| `p102x3\X2.java` | X2 |  renamed: a, b |
| `p102x3\X3.java` | X3 | **[KNOWN]** DownloadsScreen.kt ("My Downloads", empty state, file list) trace: com.notescrafter.ui.screens.DownloadedFileItem (DownloadsScreen.kt:309); com.notescrafter.ui.screens.DownloadsScreen (DownloadsScreen.kt:58) strings: [My Downloads | All your processed PDFs are stored here | No downloads yet | Process your first PDF to see it here] |
| `p102x3\X4.java` | X4 |  renamed: o, r |
| `p102x3\X5.java` | X5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:828) renamed: o strings: [Add More Images] |
| `p102x3\X6.java` | X6 |  trace: com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:1193) renamed: o, r |
| `p102x3\X7.java` | X7 |  renamed: A, B |
| `p102x3\X8.java` | X8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:894) renamed: o, r |
| `p102x3\X9.java` | X9 |  renamed: A, o |
| `p102x3\Xa.java` |  |  renamed: o, r |
| `p102x3\Xb.java` | Xb |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:218) renamed: o |
| `p102x3\Xe.java` | Xe |  renamed: o, r |
| `p102x3\Y.java` | Y |  trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-3.<anonymous> (HelpCenterScreen.kt:151) renamed: o |
| `p102x3\Y0.java` | Y0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-1.<anonymous> (PdfInvertScreen.kt:320) renamed: o |
| `p102x3\Y1.java` | Y1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-2.<anonymous> (PomodoroSetupScreen.kt:308) renamed: o strings: [The Pomodoro Technique] |
| `p102x3\Y2.java` | Y2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintPriceCalculatorScreenKt.lambda-1.<anonymous> (PrintPriceCalculatorScreen.kt:264) renamed: o |
| `p102x3\Y3.java` | Y3 |  renamed: o |
| `p102x3\Y4.java` | Y4 |  renamed: o, r |
| `p102x3\Y5.java` | Y5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:850) renamed: o strings: [Page Settings] |
| `p102x3\Y6.java` | Y6 |  renamed: o |
| `p102x3\Y7.java` | Y7 |  renamed: o, r |
| `p102x3\Y8.java` | Y8 |  renamed: o, r |
| `p102x3\Y9.java` | Y9 |  trace: com.notescrafter.ui.screens.PdfToJpgStepItem.<anonymous> (PdfToJpgScreen.kt:1033) renamed: o, r |
| `p102x3\Yb.java` | Yb |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:172) renamed: o strings: [MY PRINTS | Order History | Track all your printed notebooks in one place.] |
| `p102x3\Yc.java` | Yc |  trace: com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2531) renamed: o strings: [Shipping Details | Tell us where to send your order. We'll handle the rest.] |
| `p102x3\Yd.java` | Yd |  trace: com.notescrafter.ui.screens.ReorderScreen.<anonymous> (ReorderScreen.kt:67) renamed: o strings: [Remove PDF?] |
| `p102x3\Ye.java` | Ye |  trace: com.notescrafter.ui.screens.AnalogClock (ToDoScreen.kt:841); com.notescrafter.ui.screens.CalendarWidget (ToDoScreen.kt:735); com.notescrafter.ui.screens.ExamCardItem (ToDoScreen.kt:489) strings: [Track Your Exam | Add New Exam | Your Exams] |
| `p102x3\Z.java` | Z |  trace: com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-4.<anonymous> (HelpCenterScreen.kt:304) renamed: o strings: [Contact Support] |
| `p102x3\Z0.java` | Z0 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PdfInvertScreenKt.lambda-2.<anonymous> (PdfInvertScreen.kt:507) renamed: o strings: [View PDF] |
| `p102x3\Z1.java` | Z1 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PomodoroSetupScreenKt.lambda-3.<anonymous> (PomodoroSetupScreen.kt:492) renamed: o strings: [Cancel] |
| `p102x3\Z2.java` | Z2 |  trace: com.notescrafter.ui.screens.ComposableSingletons$PrintPriceCalculatorScreenKt.lambda-2.<anonymous> (PrintPriceCalculatorScreen.kt:819) renamed: o strings: [Order Print Now] |
| `p102x3\Z3.java` | Z3 |  renamed: o, r |
| `p102x3\Z4.java` | Z4 | **[KNOWN]** EnhanceScreen.kt composables (SectionTitle:540, FilterToggle:592, DropdownSelector:621, LayoutPreview:685, LayoutPageThumbnail:757, LivePreviewComparison:798, EnhanceStatItem:518, ToggleGroup:981, RadioButtonCustom:545) trace: com.notescrafter.ui.screens.DropdownSelector (EnhanceScreen.kt:621); com.notescrafter.ui.screens.EnhanceScreen (EnhanceScreen.kt:69); com.notescrafter.ui.screens.EnhanceStatItem (EnhanceScreen.kt:518) strings: [No pages selected to process | Generating Preview] |
| `p102x3\Z5.java` | Z5 |  trace: com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:922) renamed: o strings: [Orientation] |
| `p102x3\Z6.java` | Z6 |  renamed: o, r |
| `p102x3\Z7.java` | Z7 |  renamed: A, B |
| `p102x3\Z8.java` | Z8 |  trace: com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:1061) renamed: o |
| `p102x3\Z9.java` | Z9 |  trace: com.notescrafter.ui.screens.PdfToJpgScreen (PdfToJpgScreen.kt:73); com.notescrafter.ui.screens.PdfToJpgStepItem (PdfToJpgScreen.kt:1029) |
| `p102x3\Za.java` |  |  renamed: o, r |
| `p102x3\Zb.java` | Zb |  trace: com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:245) renamed: o strings: [No orders yet | Start Your First Order] |
| `p102x3\Zd.java` | Zd |  renamed: o, r |
| `p102x3\Ze.java` | Ze |  renamed: a, b |
| `p103y\a.java` | a |  |
| `p103y\b.java` | b |  renamed: a |
| `p103y\c.java` | c |  renamed: a, b |
| `p104y0\a.java` | a |  renamed: a, b |
| `p104y0\b.java` | b |  renamed: a, b |
| `p104y0\c.java` | c |  renamed: i, b |
| `p104y0\d.java` | d |  renamed: a, b |
| `p104y0\e.java` | e |  renamed: a |
| `p104y0\f.java` | f |  renamed: b, c |
| `p104y0\g.java` | g |  renamed: a, b |
| `p104y0\h.java` | h |  renamed: a |
| `p104y0\i.java` | i |  renamed: a |
| `p104y0\j.java` | j |  |
| `p104y0\k.java` | k |  renamed: a |
| `p104y0\l.java` | l |  |
| `p104y0\m.java` | m |  renamed: o, a |
| `p104y0\n.java` | n |  renamed: a, b |
| `p104y0\o.java` | o |  renamed: c |
| `p104y0\p.java` | p |  |
| `p104y0\q.java` | q |  |
| `p104y0\r.java` | r |  renamed: m, n |
| `p104y0\s.java` | s |  |
| `p104y0\t.java` | t |  renamed: a |
| `p105y1\A.java` | A |  renamed: a, b |
| `p105y1\B.java` | B |  |
| `p105y1\BinderC2797h.java` | BinderC2797h |  renamed: y1, o |
| `p105y1\C.java` | C |  |
| `p105y1\C2790a.java` | C2790a |  renamed: y1, a |
| `p105y1\C2796g.java` | C2796g |  renamed: y1, a |
| `p105y1\C2799j.java` | C2799j |  renamed: y1, a |
| `p105y1\C2800k.java` | C2800k |  renamed: y1, r |
| `p105y1\D.java` | D |  renamed: b, d |
| `p105y1\DialogInterfaceOnClickListenerC2792c.java` |  |  renamed: y1, a |
| `p105y1\DialogInterfaceOnClickListenerC2794e.java` |  |  renamed: y1, a |
| `p105y1\F.java` | F |  renamed: l, h |
| `p105y1\G.java` | G |  |
| `p105y1\H.java` | H |  |
| `p105y1\J.java` | J |  |
| `p105y1\K.java` | K |  |
| `p105y1\l.java` | l |  renamed: o |
| `p105y1\m.java` | m |  renamed: o |
| `p105y1\n.java` | n |  |
| `p105y1\o.java` | o |  renamed: a, b |
| `p105y1\p.java` | p |  renamed: a, b |
| `p105y1\q.java` | q |  renamed: A, B |
| `p105y1\r.java` | r |  |
| `p105y1\RunnableC2791b.java` |  |  renamed: y1, o |
| `p105y1\RunnableC2798i.java` | RunnableC2798i |  renamed: y1, o |
| `p105y1\s.java` | s |  renamed: A, B |
| `p105y1\t.java` | t |  renamed: a, b |
| `p105y1\u.java` | u |  |
| `p105y1\v.java` | v |  |
| `p105y1\w.java` | w |  renamed: b, c |
| `p105y1\x.java` |  |  renamed: a |
| `p105y1\y.java` | y |  renamed: a, b |
| `p105y1\z.java` | z |  renamed: b, a |
| `p106y2\a.java` | a |  renamed: a, b |
| `p106y2\b.java` | b |  renamed: c |
| `p107y3\a.java` | a | **[KNOWN]** DesignTokens (colors: brand gradient #A855F7->#6366F1, white, bg #1A1A24/#1E1E2E) renamed: a, b |
| `p107y3\b.java` | b | **[KNOWN]** NotesCrafterTheme (dark theme wrapper) trace: com.notescrafter.ui.theme.NotesCrafterTheme (Theme.kt:32) renamed: a |
| `p107y3\c.java` | c |  renamed: a |
| `p108z\a.java` | a |  renamed: a, b |
| `p108z\b.java` | b |  renamed: a, b |
| `p108z\c.java` | c |  renamed: a |
| `p108z\d.java` | d |  renamed: a, b |
| `p108z\e.java` | e |  |
| `p108z\f.java` | f |  renamed: a |
| `p108z\g.java` | g |  renamed: a, b |
| `p108z\h.java` | h |  renamed: a, b |
| `p108z\j.java` | j |  |
| `p108z\k.java` | k |  renamed: a |
| `p108z\l.java` | l |  renamed: k, a |
| `p109z0\a.java` | a |  |
| `p109z0\b.java` | b |  renamed: z, r |
| `p109z0\c.java` | c |  |
| `p109z0\d.java` | d |  renamed: a |
| `p109z0\e.java` | e |  renamed: f, a |
| `p109z0\f.java` | f |  |
| `p109z0\g.java` | g |  renamed: c |
| `p109z0\h.java` | h |  renamed: c, d |
| `p109z0\i.java` | i |  renamed: a, b |
| `p109z0\j.java` | j |  renamed: a, b |
| `p109z0\k.java` | k |  renamed: j, k |
| `p109z0\l.java` | l |  renamed: H, A |
| `p110z1\a.java` | a |  |
| `p110z1\b.java` | b |  |
| `p111z2\a.java` | a |  renamed: a, b |
| `p111z2\b.java` | b |  renamed: a |
| `p111z2\c.java` | c |  renamed: a, b |
| `p111z2\d.java` | d |  renamed: a, b |
| `p111z2\e.java` | e |  renamed: o, a |
| `p111z2\f.java` | f |  renamed: r, s |
| `p111z2\g.java` | g |  renamed: r |
| `p111z2\h.java` | h |  |
| `p111z2\i.java` | i |  renamed: s |
| `p111z2\j.java` | j |  renamed: f, a |
| `p111z2\k.java` | k |  renamed: a |


