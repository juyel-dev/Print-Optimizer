package p047l;

import B3.o;
import F3.d;
import H3.i;
import O3.e;
import V3.g;
import V3.k;

/* JADX INFO: loaded from: classes.dex */
public final class K extends i implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f11729o;
    public M p;
    public long[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11731s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f11734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ M f11735y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f11736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m5, g gVar, d dVar) {
        super(dVar);
        this.f11735y = m5;
        this.f11736z = gVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        K k3 = new K(this.f11735y, this.f11736z, dVar);
        k3.f11734x = obj;
        return k3;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((k) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            G3.a r2 = G3.a.f448o
            int r3 = r0.f11733w
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.u
            int r6 = r0.t
            long r7 = r0.f11732v
            int r9 = r0.f11731s
            int r10 = r0.f11730r
            long[] r11 = r0.q
            l.M r12 = r0.p
            V3.g r13 = r0.f11729o
            java.lang.Object r14 = r0.f11734x
            V3.k r14 = (V3.k) r14
            o4.d.y(r22)
            goto L93
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            o4.d.y(r22)
            java.lang.Object r3 = r0.f11734x
            V3.k r3 = (V3.k) r3
            l.M r6 = r0.f11735y
            long[] r7 = r6.f11761a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            V3.g r9 = r0.f11736z
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r3 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.p = r4
            java.lang.Object[] r5 = r12.f11762b
            r4 = r5[r4]
            r0.f11734x = r14
            r0.f11729o = r13
            r0.p = r12
            r0.q = r11
            r0.f11730r = r10
            r0.f11731s = r9
            r0.f11732v = r7
            r0.t = r6
            r0.u = r3
            r0.f11733w = r1
            r14.d(r4, r0)
            G3.a r1 = G3.a.f448o
            return r2
        L93:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L65
        L96:
            if (r6 != r5) goto La2
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La2
            int r10 = r10 + r1
            goto L42
        La2:
            B3.o r1 = B3.o.f154a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p047l.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
