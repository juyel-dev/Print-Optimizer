package p083t3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f13114o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13116s;
    public final /* synthetic */ Y t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y4, d dVar) {
        super(2, dVar);
        this.t = y4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new V(this.t, dVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:30:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00dc -> B:31:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            G3.a r1 = G3.a.f448o
            int r2 = r0.f13116s
            B3.o r3 = B3.o.f154a
            t3.Y r4 = r0.t
            r5 = 0
            r6 = 1
            a4.T r7 = r4.q
            a4.T r8 = r4.e
            if (r2 == 0) goto L2b
            if (r2 != r6) goto L23
            int r2 = r0.q
            long r9 = r0.f13115r
            int r11 = r0.p
            java.util.List r12 = r0.f13114o
            java.util.List r12 = (java.util.List) r12
            o4.d.y(r24)
            goto Ldf
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            o4.d.y(r24)
            a4.T r2 = r4.f13128i
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
            r10 = 0
        L40:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L68
            java.lang.Object r11 = r2.next()
            int r12 = r10 + 1
            if (r10 < 0) goto L64
            u3.g r11 = (p087u3.g) r11
            boolean r11 = r11.isSelected()
            if (r11 == 0) goto L5c
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            goto L5d
        L5c:
            r11 = r5
        L5d:
            if (r11 == 0) goto L62
            r9.add(r11)
        L62:
            r10 = r12
            goto L40
        L64:
            C3.v.X()
            throw r5
        L68:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L10b
            a4.T r2 = r4.g
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L7e
            goto L10b
        L7e:
            java.lang.Integer r2 = new java.lang.Integer
            r10 = 5
            r2.<init>(r10)
            r8.getClass()
            r8.j(r5, r2)
            r2 = 100
            long r10 = (long) r2
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r10
            r11 = r2
            r2 = r6
            r21 = r12
            r12 = r9
            r9 = r21
        L97:
            float r13 = (float) r2
            r14 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r14
            u3.t r15 = new u3.t
            java.lang.String r19 = "Optimizing..."
            r17 = 1
            r18 = 1
            r14 = r15
            r6 = r15
            r15 = r2
            r16 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            a4.T r14 = r4.f13134o
            r14.getClass()
            r14.j(r5, r6)
            u3.u$d r6 = new u3.u$d
            java.lang.String r20 = "Optimizing..."
            r17 = 1
            r18 = 1
            r14 = r6
            r15 = r2
            r16 = r11
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.getClass()
            r7.j(r5, r6)
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            r0.f13114o = r6
            r0.p = r11
            r0.f13115r = r9
            r0.q = r2
            r6 = 1
            r0.f13116s = r6
            java.lang.Object r13 = X3.A.g(r9, r0)
            if (r13 != r1) goto Ldf
            return r1
        Ldf:
            if (r2 == r11) goto Le4
            int r2 = r2 + 1
            goto L97
        Le4:
            u3.u$e r1 = new u3.u$e
            a4.T r2 = r4.f13136s
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            int r2 = r12.size()
            r1.<init>(r9, r2)
            r7.getClass()
            r7.j(r5, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = 6
            r1.<init>(r2)
            r8.getClass()
            r8.j(r5, r1)
        L10b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p083t3.V.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
