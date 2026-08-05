package p092v3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import a4.InterfaceC0208g;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f13555A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ List f13556B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p087u3.e f13557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ b f13558D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13559o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13561s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f13565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f13566z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, PDFProcessor pDFProcessor, List list, p087u3.e eVar, b bVar, d dVar) {
        super(2, dVar);
        this.f13566z = str;
        this.f13555A = pDFProcessor;
        this.f13556B = list;
        this.f13557C = eVar;
        this.f13558D = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H3.a
    public final d create(Object obj, d dVar) {
        q qVar = new q(this.f13566z, this.f13555A, this.f13556B, this.f13557C, this.f13558D, dVar);
        qVar.f13565y = obj;
        return qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((InterfaceC0208g) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01f4 -> B:65:0x0203). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            r61 = this;
            r1 = r61
            u3.b r2 = r1.f13558D
            G3.a r3 = G3.a.f448o
            int r4 = r1.f13564x
            r6 = 2
            r7 = 1
            java.lang.String r8 = "Failed to close native writer in finally block"
            java.lang.String r9 = " ("
            java.util.List r10 = r1.f13556B
            com.notescrafter.service.PDFProcessor r11 = r1.f13555A
            java.lang.String r12 = "PDFProcessor"
            u3.e r14 = r1.f13557C
            if (r4 == 0) goto L95
            if (r4 == r7) goto L46
            if (r4 != r6) goto L3e
            int r7 = r1.p
            long r2 = r1.f13559o
            o4.d.y(r62)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L34
            r13 = r1
            r4 = r2
            r24 = r8
            r2 = r11
            r1 = r12
            goto Lce3
        L2b:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r5 = r2
            r3 = r8
            r2 = r11
            r1 = r12
            goto Ld55
        L34:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r22 = r2
            r3 = r8
            r2 = r11
            r1 = r12
            goto Ld4d
        L3e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L46:
            int r4 = r1.f13563w
            int r6 = r1.f13562v
            int r15 = r1.u
            int r13 = r1.t
            int r7 = r1.f13561s
            int r5 = r1.f13560r
            r18 = r4
            int r4 = r1.q
            r19 = r4
            int r4 = r1.p
            r21 = r4
            r20 = r5
            long r4 = r1.f13559o
            r22 = r4
            java.lang.Object r4 = r1.f13565y
            a4.g r4 = (a4.InterfaceC0208g) r4
            o4.d.y(r62)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L8b
            r25 = r2
            r2 = r7
            r24 = r8
            r26 = r9
            r28 = r10
            r29 = r11
            r27 = r12
            r12 = r19
            r11 = r4
            r4 = r18
            r18 = r6
            goto L203
        L7f:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r3 = r8
            r2 = r11
            r1 = r12
            r7 = r21
        L87:
            r5 = r22
            goto Ld55
        L8b:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r3 = r8
            r2 = r11
            r1 = r12
            r7 = r21
            goto Ld4d
        L95:
            o4.d.y(r62)
            java.lang.Object r4 = r1.f13565y
            a4.g r4 = (a4.InterfaceC0208g) r4
            java.lang.String r5 = r1.f13566z
            int r6 = W3.j.h0(r5)
        La2:
            r7 = -1
            if (r7 >= r6) goto Lbd
            char r7 = r5.charAt(r6)
            r13 = 46
            if (r7 != r13) goto Lb0
            int r6 = r6 + (-1)
            goto La2
        Lb0:
            r7 = 1
            int r6 = r6 + r7
            r13 = 0
            java.lang.String r5 = r5.substring(r13, r6)
            java.lang.String r6 = "substring(...)"
            kotlin.jvm.internal.o.e(r5, r6)
            goto Lc0
        Lbd:
            r7 = 1
            java.lang.String r5 = ""
        Lc0:
            java.lang.String r6 = ".pdf"
            boolean r13 = W3.q.S(r5, r6, r7)
            if (r13 != 0) goto Lcc
            java.lang.String r5 = r5.concat(r6)
        Lcc:
            java.io.File r6 = new java.io.File
            android.content.Context r7 = r11.f10916a
            r13 = 0
            java.io.File r7 = r7.getExternalFilesDir(r13)
            java.lang.String r13 = "NotesCrafterFiles"
            r6.<init>(r7, r13)
            boolean r7 = r6.exists()
            if (r7 != 0) goto Le3
            r6.mkdirs()
        Le3:
            java.io.File r7 = new java.io.File
            r7.<init>(r6, r5)
            java.lang.String r13 = W3.j.D0(r5)
            java.lang.String r5 = W3.j.C0(r5)
            r15 = 1
        Lf1:
            boolean r18 = r7.exists()
            if (r18 == 0) goto L121
            java.io.File r7 = new java.io.File
            r62 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            r4.append(r9)
            r4.append(r15)
            r18 = r13
            java.lang.String r13 = ")."
            r4.append(r13)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r7.<init>(r6, r4)
            r4 = 1
            int r15 = r15 + r4
            r4 = r62
            r13 = r18
            goto Lf1
        L121:
            r62 = r4
            java.lang.String r4 = r7.getAbsolutePath()
            java.lang.String r5 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.e(r4, r5)
            long r4 = com.notescrafter.service.PDFProcessor.d(r11, r4)
            r18 = 0
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto Ld67
            int r6 = r10.size()     // Catch: java.lang.Throwable -> Ld43 java.lang.Exception -> Ld48
            u3.a r7 = r14.getDocumentSize()     // Catch: java.lang.Throwable -> Ld43 java.lang.Exception -> Ld48
            u3.a r13 = p087u3.a.ORIGINAL     // Catch: java.lang.Throwable -> Ld43 java.lang.Exception -> Ld48
            if (r7 != r13) goto L144
            r7 = 1
            goto L145
        L144:
            r7 = 0
        L145:
            if (r7 == 0) goto L149
            r13 = 1
            goto L14d
        L149:
            int r13 = r14.getNupRows()     // Catch: java.lang.Throwable -> Ld43 java.lang.Exception -> Ld48
        L14d:
            if (r7 == 0) goto L151
            r15 = 1
            goto L155
        L151:
            int r15 = r14.getNupColumns()     // Catch: java.lang.Throwable -> Ld43 java.lang.Exception -> Ld48
        L155:
            int r18 = r13 * r15
            int r19 = r6 + r18
            r16 = 1
            int r19 = r19 + (-1)
            int r19 = r19 / r18
            r20 = r4
            u3.a r4 = r14.getDocumentSize()     // Catch: java.lang.Throwable -> Ld37 java.lang.Exception -> Ld3d
            u3.c r5 = r14.getOrientation()     // Catch: java.lang.Throwable -> Ld37 java.lang.Exception -> Ld3d
            r22 = r6
            u3.d r6 = r14.getQuality()     // Catch: java.lang.Throwable -> Ld37 java.lang.Exception -> Ld3d
            r23 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld37 java.lang.Exception -> Ld3d
            r7.<init>()     // Catch: java.lang.Throwable -> Ld37 java.lang.Exception -> Ld3d
            r24 = r8
            java.lang.String r8 = "Output Config: Size="
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7.append(r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            java.lang.String r4 = ", Orientation="
            r7.append(r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7.append(r5)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            java.lang.String r4 = ", Rows="
            r7.append(r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7.append(r13)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            java.lang.String r4 = ", Cols="
            r7.append(r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7.append(r15)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            java.lang.String r4 = ", Quality="
            r7.append(r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7.append(r6)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            android.util.Log.d(r12, r4)     // Catch: java.lang.Throwable -> Ld21 java.lang.Exception -> Ld2c
            r7 = r62
            r25 = r2
            r26 = r9
            r28 = r10
            r27 = r12
            r2 = r13
            r9 = r15
            r12 = r18
            r15 = r19
            r4 = r20
            r8 = r22
            r13 = r23
            r6 = 0
            r10 = 0
        L1bf:
            if (r6 >= r15) goto Lcb4
            r29 = r11
            u3.t r11 = new u3.t     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            int r19 = r6 + 1
            java.lang.String r23 = "processing"
            r21 = 1
            r22 = 1
            r18 = r11
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13565y = r7     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13559o = r4     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.p = r10     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.q = r8     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13560r = r13     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13561s = r2     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.t = r9     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.u = r12     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13562v = r15     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r1.f13563w = r6     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            r18 = r2
            r2 = 1
            r1.f13564x = r2     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            java.lang.Object r2 = r7.emit(r11, r1)     // Catch: java.lang.Throwable -> Lc9f java.lang.Exception -> Lca9
            if (r2 != r3) goto L1f4
            return r3
        L1f4:
            r22 = r4
            r4 = r6
            r11 = r7
            r21 = r10
            r20 = r13
            r2 = r18
            r13 = r9
            r18 = r15
            r15 = r12
            r12 = r8
        L203:
            if (r4 <= 0) goto L20c
            int r5 = r4 % 5
            if (r5 != 0) goto L20c
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L20f java.lang.Exception -> L21e
        L20c:
            r10 = r29
            goto L22b
        L20f:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r7 = r21
            r5 = r22
            r3 = r24
            r1 = r27
            r2 = r29
            goto Ld55
        L21e:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r7 = r21
            r3 = r24
            r1 = r27
            r2 = r29
            goto Ld4d
        L22b:
            u3.d r5 = com.notescrafter.service.PDFProcessor.i(r10, r14)     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b
            r9 = r5
            r19 = 0
            r29 = 0
        L234:
            if (r19 != 0) goto Lc75
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b
            r8.<init>()     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b
            r6 = 3
            int[] r5 = p092v3.p.f13554a     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbdf
            int r7 = r9.ordinal()     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbdf
            r5 = r5[r7]     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbdf
            r7 = 1
            if (r5 == r7) goto L291
            r7 = 2
            if (r5 == r7) goto L28d
            if (r5 != r6) goto L250
            r5 = 1068540887(0x3fb0a3d7, float:1.38)
            goto L294
        L250:
            A2.t r5 = new A2.t     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L270
            r5.<init>()     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L270
            throw r5     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L270
        L256:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r2 = r10
            r7 = r21
            r5 = r22
            r3 = r24
            r1 = r27
            goto Ld55
        L264:
            r0 = move-exception
            r4 = r0
            r13 = r1
            r2 = r10
            r7 = r21
            r3 = r24
            r1 = r27
            goto Ld4d
        L270:
            r0 = move-exception
            r5 = r0
            r31 = r3
            r34 = r4
            r3 = r6
            r62 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r45 = r28
            r13 = r1
            r12 = r2
            r14 = r8
            r1 = r9
            r2 = r10
            goto Lbf5
        L28d:
            r5 = 1076971438(0x403147ae, float:2.77)
            goto L294
        L291:
            r5 = 1082465976(0x40851eb8, float:4.16)
        L294:
            int r7 = r4 * r15
            r62 = r11
            r11 = r28
            java.lang.Object r28 = C3.u.s0(r7, r11)     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbcb
            u3.g r28 = (p087u3.g) r28     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbcb
            r6 = 0
            T3.e r30 = Q3.a.T(r6, r15)     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbb1
            java.util.Iterator r6 = r30.iterator()     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lbb1
        L2a9:
            r30 = r6
            T3.d r30 = (T3.d) r30     // Catch: java.lang.Throwable -> Lb8b java.lang.Exception -> Lb92 java.lang.OutOfMemoryError -> Lbb1
            boolean r30 = r30.hasNext()     // Catch: java.lang.Throwable -> Lb8b java.lang.Exception -> Lb92 java.lang.OutOfMemoryError -> Lbb1
            if (r30 == 0) goto L306
            r30 = r6
            C3.G r30 = (C3.G) r30     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L302
            int r30 = r30.a()     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L302
            r31 = r6
            int r6 = r7 + r30
            java.lang.Object r6 = C3.u.s0(r6, r11)     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L302
            u3.g r6 = (p087u3.g) r6     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L302
            if (r6 == 0) goto L2f7
            r30 = r9
            android.net.Uri r9 = r6.getSourceUri()     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L2db
            r32 = r6
            android.net.Uri r6 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L2db
            boolean r6 = kotlin.jvm.internal.o.b(r9, r6)     // Catch: java.lang.Throwable -> L256 java.lang.Exception -> L264 java.lang.OutOfMemoryError -> L2db
            if (r6 != 0) goto L2d8
            goto L2fa
        L2d8:
            r32 = 0
            goto L2fa
        L2db:
            r0 = move-exception
        L2dc:
            r5 = r0
            r31 = r3
            r34 = r4
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r3 = 3
            r13 = r1
            r12 = r2
            r14 = r8
            r2 = r10
            r1 = r30
            goto Lbf5
        L2f7:
            r30 = r9
            goto L2d8
        L2fa:
            if (r32 == 0) goto L2fd
            goto L30a
        L2fd:
            r9 = r30
            r6 = r31
            goto L2a9
        L302:
            r0 = move-exception
            r30 = r9
            goto L2dc
        L306:
            r30 = r9
            r32 = 0
        L30a:
            u3.a r6 = r14.getDocumentSize()     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lb71
            u3.a r9 = p087u3.a.A4     // Catch: java.lang.Throwable -> Lb65 java.lang.Exception -> Lb6b java.lang.OutOfMemoryError -> Lb71
            r31 = r3
            android.content.Context r3 = r10.f10916a
            r33 = r10
            java.lang.String r10 = "openPage(...)"
            r34 = r4
            java.lang.String r4 = "r"
            r1 = 595(0x253, float:8.34E-43)
            if (r6 != r9) goto L376
            u3.c r6 = r14.getOrientation()     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            u3.c r9 = p087u3.c.LANDSCAPE     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            if (r6 != r9) goto L332
            r6 = 842(0x34a, float:1.18E-42)
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r6 = r6 * r5
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r1 = r1 * r5
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            goto L417
        L332:
            r6 = 842(0x34a, float:1.18E-42)
        L334:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r1 = r1 * r5
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            float r6 = r6 * r5
            int r5 = (int) r6     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            r6 = r1
            r1 = r5
            goto L417
        L33e:
            r0 = move-exception
            r13 = r61
            r4 = r0
            r7 = r21
            r5 = r22
            r3 = r24
            r1 = r27
            r2 = r33
            goto Ld55
        L34e:
            r0 = move-exception
            r13 = r61
            r4 = r0
            r7 = r21
            r3 = r24
            r1 = r27
            r2 = r33
            goto Ld4d
        L35c:
            r0 = move-exception
            r5 = r0
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r1 = r30
            r3 = 3
            r13 = r61
            r12 = r2
            r14 = r8
            r2 = r33
            goto Lbf5
        L376:
            r6 = 842(0x34a, float:1.18E-42)
            if (r28 == 0) goto L37f
            android.net.Uri r9 = r28.getSourceUri()     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            goto L380
        L37f:
            r9 = 0
        L380:
            android.net.Uri r1 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            boolean r9 = kotlin.jvm.internal.o.b(r9, r1)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            if (r9 != 0) goto L389
            goto L38b
        L389:
            r28 = r32
        L38b:
            if (r28 == 0) goto L411
            android.net.Uri r9 = r28.getSourceUri()     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            boolean r1 = kotlin.jvm.internal.o.b(r9, r1)     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            if (r1 != 0) goto L411
            android.net.Uri r1 = r28.getSourceUri()     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L407
            android.content.ContentResolver r9 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L407
            android.os.ParcelFileDescriptor r1 = r9.openFileDescriptor(r1, r4)     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L407
            if (r1 == 0) goto L3ff
            android.graphics.pdf.PdfRenderer r9 = new android.graphics.pdf.PdfRenderer     // Catch: java.lang.Throwable -> L3ed
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L3ed
            int r6 = r28.getOriginalPageIndex()     // Catch: java.lang.Throwable -> L3e0
            android.graphics.pdf.PdfRenderer$Page r6 = r9.openPage(r6)     // Catch: java.lang.Throwable -> L3e0
            kotlin.jvm.internal.o.e(r6, r10)     // Catch: java.lang.Throwable -> L3e0
            int r28 = r6.getWidth()     // Catch: java.lang.Throwable -> L3e0
            int r32 = r6.getHeight()     // Catch: java.lang.Throwable -> L3d9
            r6.close()     // Catch: java.lang.Throwable -> L3d4
            r9.close()     // Catch: java.lang.Throwable -> L3cf
            r6 = 0
            Q3.a.l(r1, r6)     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L3ca
            r1 = r28
            goto L403
        L3ca:
            r0 = move-exception
            r6 = r0
            r1 = r28
            goto L40d
        L3cf:
            r0 = move-exception
            r6 = r0
            r35 = r28
            goto L3f3
        L3d4:
            r0 = move-exception
            r6 = r0
            r35 = r28
            goto L3e6
        L3d9:
            r0 = move-exception
            r6 = r0
            r35 = r28
            r32 = 842(0x34a, float:1.18E-42)
            goto L3e6
        L3e0:
            r0 = move-exception
            r6 = r0
            r32 = 842(0x34a, float:1.18E-42)
            r35 = 595(0x253, float:8.34E-43)
        L3e6:
            r9.close()     // Catch: java.lang.Throwable -> L3ea
            throw r6     // Catch: java.lang.Throwable -> L3ea
        L3ea:
            r0 = move-exception
            r6 = r0
            goto L3f3
        L3ed:
            r0 = move-exception
            r6 = r0
            r32 = 842(0x34a, float:1.18E-42)
            r35 = 595(0x253, float:8.34E-43)
        L3f3:
            throw r6     // Catch: java.lang.Throwable -> L3f4
        L3f4:
            r0 = move-exception
            r9 = r0
            Q3.a.l(r1, r6)     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L3fa
            throw r9     // Catch: java.lang.Throwable -> L33e java.lang.OutOfMemoryError -> L35c java.lang.Exception -> L3fa
        L3fa:
            r0 = move-exception
            r6 = r0
            r1 = r35
            goto L40d
        L3ff:
            r1 = 595(0x253, float:8.34E-43)
            r32 = 842(0x34a, float:1.18E-42)
        L403:
            r6 = r32
            goto L334
        L407:
            r0 = move-exception
            r6 = r0
            r1 = 595(0x253, float:8.34E-43)
            r32 = 842(0x34a, float:1.18E-42)
        L40d:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L33e java.lang.Exception -> L34e java.lang.OutOfMemoryError -> L35c
            goto L403
        L411:
            r1 = 595(0x253, float:8.34E-43)
            r6 = 842(0x34a, float:1.18E-42)
            goto L334
        L417:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r6, r1, r5)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            java.lang.String r5 = "createBitmap(...)"
            kotlin.jvm.internal.o.e(r9, r5)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            r8.add(r9)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            r5.<init>(r9)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            r28 = r9
            r9 = -1
            r5.drawColor(r9)     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            u3.c r9 = r14.getOrientation()     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb4f
            r32 = r14
            u3.c r14 = p087u3.c.LANDSCAPE     // Catch: java.lang.Throwable -> Lb2d java.lang.Exception -> Lb33 java.lang.OutOfMemoryError -> Lb39
            if (r9 != r14) goto L43f
            r9 = 1146257408(0x44528000, float:842.0)
            goto L442
        L43f:
            r9 = 1142210560(0x4414c000, float:595.0)
        L442:
            float r9 = r6 / r9
            if (r20 == 0) goto L44b
            r9 = 0
        L447:
            r41 = r5
            r14 = 2
            goto L450
        L44b:
            r14 = 1105382605(0x41e2cccd, float:28.35)
            float r9 = r9 * r14
            goto L447
        L450:
            float r5 = (float) r14
            float r14 = r9 * r5
            float r35 = r6 - r14
            float r1 = (float) r1
            float r14 = r1 - r14
            r42 = r6
            float r6 = (float) r13
            float r6 = r35 / r6
            r43 = r1
            float r1 = (float) r2
            float r14 = r14 / r1
            r1 = 0
        L462:
            if (r1 >= r15) goto La06
            r44 = r15
            int r15 = r7 + r1
            if (r15 >= r12) goto L9f3
            java.lang.Object r15 = r11.get(r15)     // Catch: java.lang.Throwable -> L9cb java.lang.Exception -> L9d2 java.lang.OutOfMemoryError -> L9ed
            u3.g r15 = (p087u3.g) r15     // Catch: java.lang.Throwable -> L9cb java.lang.Exception -> L9d2 java.lang.OutOfMemoryError -> L9ed
            r35 = r7
            int r7 = r1 / r13
            r45 = r11
            int r11 = r1 % r13
            float r11 = (float) r11
            float r11 = r11 * r6
            float r11 = r11 + r9
            float r7 = (float) r7
            float r7 = r7 * r14
            float r7 = r7 + r9
            r46 = r12
            android.net.Uri r12 = r15.getSourceUri()     // Catch: java.lang.Throwable -> L9cb java.lang.Exception -> L9d2 java.lang.OutOfMemoryError -> L9e3
            r47 = r2
            android.net.Uri r2 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> L9cb java.lang.Exception -> L9d2 java.lang.OutOfMemoryError -> L9d9
            boolean r2 = kotlin.jvm.internal.o.b(r12, r2)     // Catch: java.lang.Throwable -> L9cb java.lang.Exception -> L9d2 java.lang.OutOfMemoryError -> L9d9
            if (r2 != 0) goto L70c
            android.net.Uri r2 = r15.getSourceUri()     // Catch: java.lang.Throwable -> L6fa java.lang.Exception -> L6ff java.lang.OutOfMemoryError -> L703
            android.content.ContentResolver r12 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L682 java.lang.Exception -> L68c
            android.os.ParcelFileDescriptor r2 = r12.openFileDescriptor(r2, r4)     // Catch: java.lang.Throwable -> L682 java.lang.Exception -> L68c
            if (r2 == 0) goto L63f
            android.graphics.pdf.PdfRenderer r12 = new android.graphics.pdf.PdfRenderer     // Catch: java.lang.Throwable -> L61b java.lang.Exception -> L627
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L61b java.lang.Exception -> L627
            r36 = r3
            int r3 = r15.getOriginalPageIndex()     // Catch: java.lang.Throwable -> L5db java.lang.Exception -> L5f8
            r37 = r4
            int r4 = r12.getPageCount()     // Catch: java.lang.Throwable -> L5db java.lang.Exception -> L5e5
            if (r3 < r4) goto L504
            int r3 = r15.getOriginalPageIndex()     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L500
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L500
            r4.<init>()     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L500
            r48 = r9
            java.lang.String r9 = "Index "
            r4.append(r9)     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L4fc
            r4.append(r3)     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L4fc
            java.lang.String r3 = " out of bounds."
            r4.append(r3)     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L4fc
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4f8 java.lang.Exception -> L4fc
            r4 = r27
            android.util.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L4de java.lang.Exception -> L4e8
            r39 = r1
            r40 = r7
            r27 = r10
            r38 = r12
            r49 = r13
            r12 = r26
            goto L653
        L4de:
            r0 = move-exception
        L4df:
            r1 = r0
            r38 = r12
            r49 = r13
            r12 = r26
            goto L6ef
        L4e8:
            r0 = move-exception
        L4e9:
            r39 = r1
            r40 = r7
            r27 = r10
            r38 = r12
            r49 = r13
            r12 = r26
        L4f5:
            r1 = r0
            goto L5fe
        L4f8:
            r0 = move-exception
            r4 = r27
            goto L4df
        L4fc:
            r0 = move-exception
        L4fd:
            r4 = r27
            goto L4e9
        L500:
            r0 = move-exception
            r48 = r9
            goto L4fd
        L504:
            r48 = r9
            r4 = r27
            int r3 = r15.getOriginalPageIndex()     // Catch: java.lang.Exception -> L4e8 java.lang.Throwable -> L5d3
            android.graphics.pdf.PdfRenderer$Page r3 = r12.openPage(r3)     // Catch: java.lang.Exception -> L4e8 java.lang.Throwable -> L5d3
            kotlin.jvm.internal.o.e(r3, r10)     // Catch: java.lang.Exception -> L4e8 java.lang.Throwable -> L5d3
            int r9 = (int) r6
            r27 = r10
            int r10 = (int) r14
            r38 = r12
            int r12 = r3.getWidth()     // Catch: java.lang.Throwable -> L5b8
            float r12 = (float) r12
            r49 = r13
            int r13 = r3.getHeight()     // Catch: java.lang.Throwable -> L5ae
            float r13 = (float) r13     // Catch: java.lang.Throwable -> L5ae
            float r12 = r12 / r13
            float r13 = r6 / r14
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L530
            float r10 = (float) r9     // Catch: java.lang.Throwable -> L5ae
            float r10 = r10 / r12
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L5ae
            goto L533
        L530:
            float r9 = (float) r10     // Catch: java.lang.Throwable -> L5ae
            float r9 = r9 * r12
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L5ae
        L533:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L5ae
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r9, r10, r12)     // Catch: java.lang.Throwable -> L5ae
            r8.add(r12)     // Catch: java.lang.Throwable -> L5aa
            r13 = -1
            r12.eraseColor(r13)     // Catch: java.lang.Throwable -> L5aa
            android.graphics.Rect r13 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L5aa
            r39 = r1
            r1 = 0
            r13.<init>(r1, r1, r9, r10)     // Catch: java.lang.Throwable -> L5a6
            r40 = r7
            r1 = 1
            r7 = 0
            r3.render(r12, r13, r7, r1)     // Catch: java.lang.Throwable -> L5a2
            int r1 = r9 / 2
            int r7 = r10 / 2
            int r1 = r12.getPixel(r1, r7)     // Catch: java.lang.Throwable -> L5a2
            int r7 = r15.getOriginalPageIndex()     // Catch: java.lang.Throwable -> L5a2
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L5a2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a2
            r13.<init>()     // Catch: java.lang.Throwable -> L5a2
            r50 = r12
            java.lang.String r12 = "Rendered Page "
            r13.append(r12)     // Catch: java.lang.Throwable -> L59e
            r13.append(r7)     // Catch: java.lang.Throwable -> L59e
            r12 = r26
            r13.append(r12)     // Catch: java.lang.Throwable -> L599
            r13.append(r9)     // Catch: java.lang.Throwable -> L599
            java.lang.String r7 = " x "
            r13.append(r7)     // Catch: java.lang.Throwable -> L599
            r13.append(r10)     // Catch: java.lang.Throwable -> L599
            java.lang.String r7 = "): CenterPixel="
            r13.append(r7)     // Catch: java.lang.Throwable -> L599
            r13.append(r1)     // Catch: java.lang.Throwable -> L599
            java.lang.String r1 = r13.toString()     // Catch: java.lang.Throwable -> L599
            android.util.Log.d(r4, r1)     // Catch: java.lang.Throwable -> L599
            r3.close()     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L596
            goto L655
        L592:
            r0 = move-exception
        L593:
            r1 = r0
            goto L6ef
        L596:
            r0 = move-exception
            goto L4f5
        L599:
            r0 = move-exception
        L59a:
            r7 = r0
            r1 = r50
            goto L5c0
        L59e:
            r0 = move-exception
        L59f:
            r12 = r26
            goto L59a
        L5a2:
            r0 = move-exception
        L5a3:
            r50 = r12
            goto L59f
        L5a6:
            r0 = move-exception
        L5a7:
            r40 = r7
            goto L5a3
        L5aa:
            r0 = move-exception
            r39 = r1
            goto L5a7
        L5ae:
            r0 = move-exception
            r39 = r1
            r40 = r7
        L5b3:
            r12 = r26
            r7 = r0
            r1 = 0
            goto L5c0
        L5b8:
            r0 = move-exception
            r39 = r1
            r40 = r7
            r49 = r13
            goto L5b3
        L5c0:
            if (r1 == 0) goto L5c9
            r1.recycle()     // Catch: java.lang.Throwable -> L5c6
            goto L5c9
        L5c6:
            r0 = move-exception
            r1 = r0
            goto L5cf
        L5c9:
            if (r1 == 0) goto L5ce
            r8.remove(r1)     // Catch: java.lang.Throwable -> L5c6
        L5ce:
            throw r7     // Catch: java.lang.Throwable -> L5c6
        L5cf:
            r3.close()     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L596
            throw r1     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L596
        L5d3:
            r0 = move-exception
            r38 = r12
            r49 = r13
            r12 = r26
            goto L593
        L5db:
            r0 = move-exception
            r38 = r12
            r49 = r13
            r12 = r26
            r4 = r27
            goto L593
        L5e5:
            r0 = move-exception
            r39 = r1
        L5e8:
            r40 = r7
            r48 = r9
            r38 = r12
            r49 = r13
            r12 = r26
            r4 = r27
            r27 = r10
            goto L4f5
        L5f8:
            r0 = move-exception
            r39 = r1
            r37 = r4
            goto L5e8
        L5fe:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            r3.<init>()     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            java.lang.String r7 = "Page Render Failed: "
            r3.append(r7)     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            r3.append(r1)     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            android.util.Log.e(r4, r1)     // Catch: java.lang.Throwable -> L592 java.lang.Exception -> L617
            goto L653
        L617:
            r0 = move-exception
            r1 = r0
            goto L6a2
        L61b:
            r0 = move-exception
            r49 = r13
            r12 = r26
            r4 = r27
            r1 = r0
        L623:
            r38 = 0
            goto L6ef
        L627:
            r0 = move-exception
            r39 = r1
            r36 = r3
            r37 = r4
            r40 = r7
            r48 = r9
            r49 = r13
            r12 = r26
            r4 = r27
            r27 = r10
            r1 = r0
        L63b:
            r38 = 0
            goto L6a2
        L63f:
            r39 = r1
            r36 = r3
            r37 = r4
            r40 = r7
            r48 = r9
            r49 = r13
            r12 = r26
            r4 = r27
            r27 = r10
            r38 = 0
        L653:
            r50 = 0
        L655:
            if (r38 == 0) goto L67c
            r38.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L67c
            goto L67c
        L65b:
            r0 = move-exception
        L65c:
            r13 = r61
        L65e:
            r1 = r4
            r7 = r21
            r5 = r22
            r3 = r24
            r2 = r33
        L667:
            r4 = r0
            goto Ld55
        L66a:
            r0 = move-exception
        L66b:
            r13 = r61
            r5 = r0
            r14 = r8
            r59 = r12
        L671:
            r1 = r30
            r2 = r33
            r12 = r47
            r11 = r49
        L679:
            r3 = 3
            goto Lbf5
        L67c:
            if (r2 == 0) goto L6c6
            r2.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6c6
            goto L6c6
        L682:
            r0 = move-exception
            r49 = r13
            r12 = r26
            r4 = r27
            r1 = r0
            r2 = 0
            goto L623
        L68c:
            r0 = move-exception
            r39 = r1
            r36 = r3
            r37 = r4
            r40 = r7
            r48 = r9
            r49 = r13
            r12 = r26
            r4 = r27
            r27 = r10
            r1 = r0
            r2 = 0
            goto L63b
        L6a2:
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L592
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L592
            r7.<init>()     // Catch: java.lang.Throwable -> L592
            java.lang.String r9 = "Error in usePdfRenderer: "
            r7.append(r9)     // Catch: java.lang.Throwable -> L592
            r7.append(r3)     // Catch: java.lang.Throwable -> L592
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L592
            android.util.Log.e(r4, r3, r1)     // Catch: java.lang.Throwable -> L592
            if (r38 == 0) goto L6bf
            r38.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6bf
        L6bf:
            if (r2 == 0) goto L6c4
            r2.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6c4
        L6c4:
            r50 = 0
        L6c6:
            if (r50 != 0) goto L6ec
            java.lang.String r1 = "Bitmap null after renderer. Using Red Placeholder."
            android.util.Log.e(r4, r1)     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            int r1 = (int) r6     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            int r2 = (int) r14     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            r8.add(r1)     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1.eraseColor(r2)     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
        L6dd:
            r2 = -1
            goto L72d
        L6df:
            r0 = move-exception
        L6e0:
            r13 = r61
        L6e2:
            r1 = r4
            r7 = r21
            r3 = r24
            r2 = r33
        L6e9:
            r4 = r0
            goto Ld4d
        L6ec:
            r1 = r50
            goto L6dd
        L6ef:
            if (r38 == 0) goto L6f4
            r38.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6f4
        L6f4:
            if (r2 == 0) goto L6f9
            r2.close()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6f9
        L6f9:
            throw r1     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
        L6fa:
            r0 = move-exception
            r4 = r27
            goto L65c
        L6ff:
            r0 = move-exception
            r4 = r27
            goto L6e0
        L703:
            r0 = move-exception
            r49 = r13
            r12 = r26
            r4 = r27
            goto L66b
        L70c:
            r39 = r1
            r36 = r3
            r37 = r4
            r40 = r7
            r48 = r9
            r49 = r13
            r12 = r26
            r4 = r27
            r27 = r10
            int r1 = (int) r6
            int r2 = (int) r14
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            r8.add(r1)     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            r2 = -1
            r1.eraseColor(r2)     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
        L72d:
            boolean r3 = r25.getInvertColors()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            if (r3 != 0) goto L754
            boolean r3 = r25.getGrayscale()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            if (r3 != 0) goto L754
            boolean r3 = r25.getClearBackground()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            if (r3 != 0) goto L754
            boolean r3 = r25.getBlackAndWhite()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            if (r3 != 0) goto L754
            boolean r3 = r25.getRemoveLogo()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            if (r3 == 0) goto L752
            android.graphics.RectF r3 = r25.getLogoBox()     // Catch: java.lang.Throwable -> L65b java.lang.OutOfMemoryError -> L66a java.lang.Exception -> L6df
            if (r3 == 0) goto L752
            goto L754
        L752:
            r3 = 0
            goto L755
        L754:
            r3 = 1
        L755:
            java.util.List r7 = r15.getEdits()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L9c5
            if (r3 != 0) goto L76a
            if (r7 != 0) goto L764
            goto L76a
        L764:
            r13 = r61
            r59 = r12
            goto L983
        L76a:
            int r7 = r1.getWidth()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            int r9 = r1.getHeight()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            int r7 = r7 * r9
            int[] r7 = new int[r7]     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            int r53 = r1.getWidth()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            int r56 = r1.getWidth()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            int r57 = r1.getHeight()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            r54 = 0
            r55 = 0
            r52 = 0
            r50 = r1
            r51 = r7
            r50.getPixels(r51, r52, r53, r54, r55, r56, r57)     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            java.util.List r9 = r15.getEdits()     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L65b java.lang.Exception -> L6df java.lang.OutOfMemoryError -> L976
            r13 = r61
            com.notescrafter.service.PDFProcessor r10 = r13.f13555A     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
        L79c:
            boolean r17 = r9.hasNext()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            if (r17 == 0) goto L8dd
            java.lang.Object r17 = r9.next()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            r2 = r17
            u3.h r2 = (p087u3.h) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            r17 = r9
            boolean r9 = r2 instanceof u3.h.b     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            if (r9 == 0) goto L7fe
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            r9 = r2
            u3.h$b r9 = (u3.h.b) r9     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            android.graphics.RectF r9 = r9.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            float r9 = r9.left     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            r38 = r2
            u3.h$b r38 = (u3.h.b) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7fa
            r59 = r12
            android.graphics.RectF r12 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r12 = r12.top     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$b r38 = (u3.h.b) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r56 = r38.width()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            u3.h$b r2 = (u3.h.b) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r2 = r2.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r57 = r2.height()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r10
            r51 = r7
            r54 = r9
            r55 = r12
            com.notescrafter.service.PDFProcessor.e(r50, r51, r52, r53, r54, r55, r56, r57)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            goto L8d0
        L7f0:
            r0 = move-exception
            goto L65e
        L7f3:
            r0 = move-exception
            goto L6e2
        L7f6:
            r0 = move-exception
        L7f7:
            r2 = r0
            goto L97b
        L7fa:
            r0 = move-exception
        L7fb:
            r59 = r12
            goto L7f7
        L7fe:
            r59 = r12
            boolean r9 = r2 instanceof u3.h.d     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r9 == 0) goto L849
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r9 = r2
            u3.h$d r9 = (u3.h.d) r9     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r9 = r9.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r9 = r9.left     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r12 = r2
            u3.h$d r12 = (u3.h.d) r12     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r12 = r12.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r12 = r12.top     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$d r38 = (u3.h.d) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r56 = r38.width()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$d r38 = (u3.h.d) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r57 = r38.height()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            u3.h$d r2 = (u3.h.d) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r58 = r2.getColor()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r10
            r51 = r7
            r54 = r9
            r55 = r12
            com.notescrafter.service.PDFProcessor.a(r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            goto L8d0
        L849:
            boolean r9 = r2 instanceof u3.h.a     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r9 == 0) goto L889
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r9 = r2
            u3.h$a r9 = (u3.h.a) r9     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r9 = r9.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r9 = r9.left     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r12 = r2
            u3.h$a r12 = (u3.h.a) r12     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r12 = r12.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r12 = r12.top     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$a r38 = (u3.h.a) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r56 = r38.width()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            u3.h$a r2 = (u3.h.a) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r2 = r2.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r57 = r2.height()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r10
            r51 = r7
            r54 = r9
            r55 = r12
            com.notescrafter.service.PDFProcessor.f(r50, r51, r52, r53, r54, r55, r56, r57)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            goto L8d0
        L889:
            boolean r9 = r2 instanceof u3.h.c     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r9 == 0) goto L8d7
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r9 = r2
            u3.h$c r9 = (u3.h.c) r9     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r9 = r9.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r9 = r9.left     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r12 = r2
            u3.h$c r12 = (u3.h.c) r12     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r12 = r12.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r12 = r12.top     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$c r38 = (u3.h.c) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r56 = r38.width()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r38 = r2
            u3.h$c r38 = (u3.h.c) r38     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.graphics.RectF r38 = r38.getRect()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r57 = r38.height()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            u3.h$c r2 = (u3.h.c) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r58 = r2.getColor()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r10
            r51 = r7
            r54 = r9
            r55 = r12
            com.notescrafter.service.PDFProcessor.b(r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
        L8d0:
            r9 = r17
            r12 = r59
            r2 = -1
            goto L79c
        L8d7:
            A2.t r2 = new A2.t     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r2.<init>()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            throw r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
        L8dd:
            r59 = r12
            if (r3 == 0) goto L912
            android.net.Uri r2 = r15.getSourceUri()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.net.Uri r3 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r2 != 0) goto L912
            com.notescrafter.service.PDFProcessor r2 = r13.f13555A     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r54 = r25.getInvertColors()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r55 = r25.getGrayscale()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r56 = r25.getClearBackground()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r57 = r25.getBlackAndWhite()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r58 = r25.getBackgroundThreshold()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r2
            r51 = r7
            com.notescrafter.service.PDFProcessor.g(r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
        L912:
            boolean r2 = r25.getRemoveLogo()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r2 == 0) goto L95c
            android.graphics.RectF r2 = r25.getLogoBox()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r2 == 0) goto L95c
            android.net.Uri r2 = r15.getSourceUri()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            android.net.Uri r3 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            if (r2 != 0) goto L95c
            android.graphics.RectF r2 = r25.getLogoBox()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            kotlin.jvm.internal.o.c(r2)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            com.notescrafter.service.PDFProcessor r3 = r13.f13555A     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r52 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r53 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r9 = r2.left     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r10 = r2.top     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r56 = r2.width()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            float r57 = r2.height()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            java.lang.String r2 = r25.getLogoShape()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            java.lang.String r12 = "circle"
            boolean r58 = kotlin.jvm.internal.o.b(r2, r12)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r50 = r3
            r51 = r7
            r54 = r9
            r55 = r10
            com.notescrafter.service.PDFProcessor.h(r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
        L95c:
            int r53 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r56 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            int r57 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            r54 = 0
            r55 = 0
            r52 = 0
            r50 = r1
            r51 = r7
            r50.setPixels(r51, r52, r53, r54, r55, r56, r57)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L7f6
            goto L983
        L976:
            r0 = move-exception
            r13 = r61
            goto L7fb
        L97b:
            java.lang.String r3 = "OOM during page processing. Skipping filters to save crash."
            android.util.Log.e(r4, r3, r2)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
        L983:
            int r2 = r1.getWidth()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            float r2 = r6 - r2
            float r2 = r2 / r5
            float r2 = r2 + r11
            int r3 = r1.getHeight()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            float r3 = r14 - r3
            float r3 = r3 / r5
            float r3 = r3 + r40
            r9 = r41
            r7 = 0
            r9.drawBitmap(r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            r1.recycle()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            r8.remove(r1)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> L9c0
            int r1 = r39 + 1
            r41 = r9
            r10 = r27
            r7 = r35
            r3 = r36
            r15 = r44
            r11 = r45
            r12 = r46
            r2 = r47
            r9 = r48
            r13 = r49
            r26 = r59
            r27 = r4
            r4 = r37
            goto L462
        L9c0:
            r0 = move-exception
        L9c1:
            r5 = r0
            r14 = r8
            goto L671
        L9c5:
            r0 = move-exception
            r13 = r61
            r59 = r12
            goto L9c1
        L9cb:
            r0 = move-exception
            r13 = r61
            r4 = r27
            goto L65e
        L9d2:
            r0 = move-exception
            r13 = r61
            r4 = r27
            goto L6e2
        L9d9:
            r0 = move-exception
        L9da:
            r49 = r13
            r59 = r26
            r4 = r27
            r13 = r61
            goto L9c1
        L9e3:
            r0 = move-exception
            r47 = r2
            goto L9da
        L9e7:
            r0 = move-exception
            r47 = r2
        L9ea:
            r46 = r12
            goto L9da
        L9ed:
            r0 = move-exception
            r47 = r2
            r45 = r11
            goto L9ea
        L9f3:
            r47 = r2
            r48 = r9
            r45 = r11
            r46 = r12
            r49 = r13
        L9fd:
            r59 = r26
            r4 = r27
            r9 = r41
            r13 = r61
            goto La13
        La06:
            r47 = r2
            r48 = r9
            r45 = r11
            r46 = r12
            r49 = r13
            r44 = r15
            goto L9fd
        La13:
            boolean r1 = r32.getAddSeparationLines()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb22
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto La7f
            if (r20 != 0) goto La7f
            android.graphics.Paint r1 = new android.graphics.Paint     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r1.<init>()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r1.setColor(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r1.setStyle(r5)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r1.setStrokeWidth(r2)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r5 = 1
            r1.setAntiAlias(r5)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La79
            r11 = r49
            r5 = 1
        La36:
            if (r5 >= r11) goto La57
            float r7 = (float) r5
            float r7 = r7 * r6
            float r38 = r7 + r48
            float r39 = r43 - r48
            r35 = r9
            r36 = r38
            r37 = r48
            r40 = r1
            r35.drawLine(r36, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La4c
            int r5 = r5 + 1
            goto La36
        La4c:
            r0 = move-exception
            r5 = r0
            r14 = r8
            r1 = r30
            r2 = r33
            r12 = r47
            goto L679
        La57:
            r12 = r47
            r5 = 1
        La5a:
            if (r5 >= r12) goto La83
            float r6 = (float) r5
            float r6 = r6 * r14
            float r39 = r6 + r48
            float r38 = r42 - r48
            r35 = r9
            r36 = r48
            r37 = r39
            r40 = r1
            r35.drawLine(r36, r37, r38, r39, r40)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            int r5 = r5 + 1
            goto La5a
        La70:
            r0 = move-exception
        La71:
            r5 = r0
            r14 = r8
            r1 = r30
            r2 = r33
            goto L679
        La79:
            r0 = move-exception
            r12 = r47
            r11 = r49
            goto La71
        La7f:
            r12 = r47
            r11 = r49
        La83:
            boolean r1 = r32.getAddPageNumbers()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            if (r1 == 0) goto Laae
            android.graphics.Paint r1 = new android.graphics.Paint     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            r1.<init>()     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            r1.setColor(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            r3 = 1106247680(0x41f00000, float:30.0)
            r1.setTextSize(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            android.graphics.Paint$Align r3 = android.graphics.Paint.Align.CENTER     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            r1.setTextAlign(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            r3 = 1
            r1.setAntiAlias(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            int r3 = r34 + 1
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
            float r6 = r42 / r2
            r2 = 1109393408(0x42200000, float:40.0)
            float r2 = r43 - r2
            r9.drawText(r3, r6, r2, r1)     // Catch: java.lang.Throwable -> L7f0 java.lang.Exception -> L7f3 java.lang.OutOfMemoryError -> La70
        Laae:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            r1.<init>()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            r3 = 80
            r9 = r28
            r9.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            com.notescrafter.service.PDFProcessor r5 = r13.f13555A     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            kotlin.jvm.internal.o.c(r1)     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            int r2 = r9.getWidth()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            int r10 = r9.getHeight()     // Catch: java.lang.Throwable -> Lb12 java.lang.Exception -> Lb16 java.lang.OutOfMemoryError -> Lb1a
            r3 = 3
            r6 = r22
            r14 = r8
            r8 = r1
            r15 = r9
            r1 = r30
            r9 = r2
            r2 = r33
            com.notescrafter.service.PDFProcessor.j(r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06 java.lang.OutOfMemoryError -> Lb0e
            r15.recycle()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06 java.lang.OutOfMemoryError -> Lb0e
            r14.remove(r15)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06 java.lang.OutOfMemoryError -> Lb0e
            r9 = r1
            r10 = r2
            r27 = r4
            r2 = r12
            r1 = r13
            r3 = r31
            r14 = r32
            r4 = r34
            r15 = r44
            r28 = r45
            r12 = r46
            r26 = r59
            r19 = 1
        Laf7:
            r13 = r11
            r11 = r62
            goto L234
        Lafc:
            r0 = move-exception
        Lafd:
            r1 = r4
            r7 = r21
            r5 = r22
        Lb02:
            r3 = r24
            goto L667
        Lb06:
            r0 = move-exception
        Lb07:
            r1 = r4
            r7 = r21
        Lb0a:
            r3 = r24
            goto L6e9
        Lb0e:
            r0 = move-exception
        Lb0f:
            r5 = r0
            goto Lbf5
        Lb12:
            r0 = move-exception
        Lb13:
            r2 = r33
            goto Lafd
        Lb16:
            r0 = move-exception
        Lb17:
            r2 = r33
            goto Lb07
        Lb1a:
            r0 = move-exception
            r14 = r8
            r1 = r30
            r2 = r33
        Lb20:
            r3 = 3
            goto Lb0f
        Lb22:
            r0 = move-exception
            r14 = r8
            r1 = r30
            r2 = r33
            r12 = r47
            r11 = r49
            goto Lb20
        Lb2d:
            r0 = move-exception
            r13 = r61
            r4 = r27
            goto Lb13
        Lb33:
            r0 = move-exception
            r13 = r61
            r4 = r27
            goto Lb17
        Lb39:
            r0 = move-exception
            r14 = r8
            r45 = r11
            r46 = r12
            r11 = r13
            r44 = r15
            r59 = r26
            r4 = r27
            r1 = r30
            r3 = 3
            r13 = r61
            r12 = r2
        Lb4c:
            r2 = r33
            goto Lb0f
        Lb4f:
            r0 = move-exception
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r1 = r30
            r3 = 3
            r13 = r61
            r12 = r2
            r14 = r8
            goto Lb4c
        Lb65:
            r0 = move-exception
            r13 = r1
            r2 = r10
            r4 = r27
            goto Lafd
        Lb6b:
            r0 = move-exception
            r13 = r1
            r2 = r10
            r4 = r27
            goto Lb07
        Lb71:
            r0 = move-exception
            r31 = r3
            r34 = r4
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r3 = 3
            r13 = r1
            r12 = r2
            r14 = r8
            r2 = r10
            r1 = r30
            goto Lb0f
        Lb8b:
            r0 = move-exception
            r13 = r1
            r2 = r10
            r4 = r27
            r1 = r0
            goto Lb99
        Lb92:
            r0 = move-exception
            r13 = r1
            r2 = r10
            r4 = r27
            r1 = r0
            goto Lba6
        Lb99:
            r7 = r21
            r5 = r22
            r3 = r24
            r60 = r4
            r4 = r1
            r1 = r60
            goto Ld55
        Lba6:
            r7 = r21
            r3 = r24
            r60 = r4
            r4 = r1
            r1 = r60
            goto Ld4d
        Lbb1:
            r0 = move-exception
            r31 = r3
            r34 = r4
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r3 = 3
        Lbc4:
            r13 = r1
            r12 = r2
            r14 = r8
            r1 = r9
            r2 = r10
            goto Lb0f
        Lbcb:
            r0 = move-exception
            r31 = r3
            r34 = r4
            r3 = r6
            r45 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            goto Lbc4
        Lbdf:
            r0 = move-exception
            r31 = r3
            r34 = r4
            r3 = r6
            r62 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r45 = r28
            goto Lbc4
        Lbf5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r6.<init>()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.lang.String r7 = "OutOfMemoryError caught while processing page "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r7 = r34
            r6.append(r7)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.lang.String r8 = " (Quality: "
            r6.append(r8)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r6.append(r1)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.lang.String r8 = "). Retrying with lower quality..."
            r6.append(r8)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            android.util.Log.e(r4, r6, r5)     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.util.Iterator r6 = r14.iterator()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
        Lc1c:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            if (r8 == 0) goto Lc32
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            boolean r9 = r8.isRecycled()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lc1c
            if (r9 != 0) goto Lc1c
            r8.recycle()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lc1c
            goto Lc1c
        Lc32:
            r14.clear()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            java.lang.System.gc()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            int[] r6 = p092v3.p.f13554a     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r1 = r6[r1]     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r6 = 1
            if (r1 == r6) goto Lc54
            r6 = 2
            if (r1 == r6) goto Lc50
            if (r1 != r3) goto Lc4a
            r9 = 0
            goto Lc57
        Lc4a:
            A2.t r1 = new A2.t     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            r1.<init>()     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            throw r1     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
        Lc50:
            u3.d r1 = p087u3.d.LOW     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
        Lc52:
            r9 = r1
            goto Lc57
        Lc54:
            u3.d r1 = p087u3.d.MEDIUM     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
            goto Lc52
        Lc57:
            if (r9 == 0) goto Lc74
            int r1 = r29 + 1
            if (r1 > r3) goto Lc73
            r29 = r1
            r10 = r2
            r27 = r4
            r4 = r7
            r2 = r12
            r1 = r13
            r3 = r31
            r14 = r32
            r15 = r44
            r28 = r45
            r12 = r46
            r26 = r59
            goto Laf7
        Lc73:
            throw r5     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
        Lc74:
            throw r5     // Catch: java.lang.Throwable -> Lafc java.lang.Exception -> Lb06
        Lc75:
            r31 = r3
            r7 = r4
            r62 = r11
            r46 = r12
            r11 = r13
            r32 = r14
            r44 = r15
            r59 = r26
            r4 = r27
            r45 = r28
            r13 = r1
            r12 = r2
            r2 = r10
            int r6 = r7 + 1
            r7 = r62
            r9 = r11
            r15 = r18
            r13 = r20
            r10 = r21
            r4 = r22
            r8 = r46
            r11 = r2
            r2 = r12
            r12 = r44
            goto L1bf
        Lc9f:
            r0 = move-exception
            r13 = r1
            r1 = r27
            r2 = r29
            r5 = r4
            r7 = r10
            goto Lb02
        Lca9:
            r0 = move-exception
            r13 = r1
            r1 = r27
            r2 = r29
            r22 = r4
            r7 = r10
            goto Lb0a
        Lcb4:
            r13 = r1
            r31 = r3
            r2 = r11
            r1 = r27
            com.notescrafter.service.PDFProcessor.c(r2, r4)     // Catch: java.lang.Throwable -> Ld12 java.lang.Exception -> Ld19
            u3.t r3 = new u3.t     // Catch: java.lang.Throwable -> Ld08 java.lang.Exception -> Ld0d
            java.lang.String r23 = "complete"
            r21 = 1
            r22 = 1
            r18 = r3
            r19 = r15
            r20 = r15
            r18.<init>(r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Ld08 java.lang.Exception -> Ld0d
            r6 = 0
            r13.f13565y = r6     // Catch: java.lang.Throwable -> Ld08 java.lang.Exception -> Ld0d
            r13.f13559o = r4     // Catch: java.lang.Throwable -> Ld08 java.lang.Exception -> Ld0d
            r6 = 1
            r13.p = r6     // Catch: java.lang.Throwable -> Lcf9 java.lang.Exception -> Ld00
            r8 = 2
            r13.f13564x = r8     // Catch: java.lang.Throwable -> Lcf9 java.lang.Exception -> Ld00
            java.lang.Object r3 = r7.emit(r3, r13)     // Catch: java.lang.Throwable -> Lcf9 java.lang.Exception -> Ld00
            r7 = r31
            if (r3 != r7) goto Lce2
            return r7
        Lce2:
            r7 = r6
        Lce3:
            if (r7 != 0) goto Lcf6
            com.notescrafter.service.PDFProcessor.c(r2, r4)     // Catch: java.lang.Exception -> Lce9
            goto Lcf6
        Lce9:
            r0 = move-exception
            r2 = r0
            r3 = r24
            int r1 = android.util.Log.e(r1, r3, r2)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
        Lcf6:
            B3.o r1 = B3.o.f154a
            return r1
        Lcf9:
            r0 = move-exception
            r3 = r24
        Lcfc:
            r7 = r6
            r5 = r4
            goto L667
        Ld00:
            r0 = move-exception
            r3 = r24
        Ld03:
            r22 = r4
            r7 = r6
            goto L6e9
        Ld08:
            r0 = move-exception
            r3 = r24
            r6 = 1
            goto Lcfc
        Ld0d:
            r0 = move-exception
            r3 = r24
            r6 = 1
            goto Ld03
        Ld12:
            r0 = move-exception
            r3 = r24
            r5 = r4
            r7 = r10
            goto L667
        Ld19:
            r0 = move-exception
            r3 = r24
            r22 = r4
            r7 = r10
            goto L6e9
        Ld21:
            r0 = move-exception
            r13 = r1
            r2 = r11
            r1 = r12
            r3 = r24
        Ld27:
            r4 = r0
            r5 = r20
            r7 = 0
            goto Ld55
        Ld2c:
            r0 = move-exception
            r13 = r1
            r2 = r11
            r1 = r12
            r3 = r24
        Ld32:
            r4 = r0
            r22 = r20
            r7 = 0
            goto Ld4d
        Ld37:
            r0 = move-exception
            r13 = r1
        Ld39:
            r3 = r8
            r2 = r11
            r1 = r12
            goto Ld27
        Ld3d:
            r0 = move-exception
            r13 = r1
        Ld3f:
            r3 = r8
            r2 = r11
            r1 = r12
            goto Ld32
        Ld43:
            r0 = move-exception
            r13 = r1
            r20 = r4
            goto Ld39
        Ld48:
            r0 = move-exception
            r13 = r1
            r20 = r4
            goto Ld3f
        Ld4d:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Ld51
            throw r4     // Catch: java.lang.Throwable -> Ld51
        Ld51:
            r0 = move-exception
            r4 = r0
            goto L87
        Ld55:
            if (r7 != 0) goto Ld66
            com.notescrafter.service.PDFProcessor.c(r2, r5)     // Catch: java.lang.Exception -> Ld5b
            goto Ld66
        Ld5b:
            r0 = move-exception
            r2 = r0
            int r1 = android.util.Log.e(r1, r3, r2)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
        Ld66:
            throw r4
        Ld67:
            r13 = r1
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = r7.getAbsolutePath()
            java.lang.String r3 = "Failed to initialize Native PDF Writer at "
            java.lang.String r2 = androidx.compose.foundation.text.modifiers.a.y(r3, r2)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p092v3.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
