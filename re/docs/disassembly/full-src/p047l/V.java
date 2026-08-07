package p047l;

import B3.o;
import F3.d;
import H3.i;
import O3.e;
import V3.k;

/* JADX INFO: loaded from: classes.dex */
public final class V extends i implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f11755o;
    public long[] p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11757s;
    public int t;
    public long u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ W f11760x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w4, d dVar) {
        super(dVar);
        this.f11760x = w4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        V v4 = new V(this.f11760x, dVar);
        v4.f11759w = obj;
        return v4;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((k) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:22:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:19:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            G3.a r2 = G3.a.f448o
            int r3 = r0.f11758v
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.t
            int r6 = r0.f11757s
            long r7 = r0.u
            int r9 = r0.f11756r
            int r10 = r0.q
            long[] r11 = r0.p
            java.lang.Object[] r12 = r0.f11755o
            java.lang.Object r13 = r0.f11759w
            V3.k r13 = (V3.k) r13
            o4.d.y(r21)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            o4.d.y(r21)
            java.lang.Object r3 = r0.f11759w
            V3.k r3 = (V3.k) r3
            l.W r6 = r0.f11760x
            java.lang.Object[] r7 = r6.f11762b
            long[] r6 = r6.f11761a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L95
            r9 = r4
        L3f:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L91
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L60:
            if (r3 >= r6) goto L8b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L88
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f11759w = r13
            r0.f11755o = r12
            r0.p = r11
            r0.q = r10
            r0.f11756r = r9
            r0.u = r7
            r0.f11757s = r6
            r0.t = r3
            r0.f11758v = r1
            r13.d(r4, r0)
            G3.a r1 = G3.a.f448o
            return r2
        L88:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L60
        L8b:
            if (r6 != r5) goto L95
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L91:
            if (r9 == r8) goto L95
            int r9 = r9 + r1
            goto L3f
        L95:
            B3.o r1 = B3.o.f154a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p047l.V.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
