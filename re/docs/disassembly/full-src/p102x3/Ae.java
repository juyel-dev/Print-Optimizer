package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final class Ae extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13783o;
    public final /* synthetic */ PagerState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(PagerState pagerState, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = pagerState;
        this.q = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Ae(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Ae) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0058
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            G3.a r0 = G3.a.f448o
            int r1 = r11.f13783o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            o4.d.y(r12)
            goto L2f
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            o4.d.y(r12)
            goto L3a
        L1c:
            o4.d.y(r12)
            androidx.compose.runtime.MutableState r12 = r11.q
            java.util.List r1 = p102x3.Ee.f13941a
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L59
        L2f:
            r11.f13783o = r3
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r12 = X3.A.g(r4, r11)
            if (r12 != r0) goto L3a
            return r0
        L3a:
            androidx.compose.foundation.pager.PagerState r12 = r11.p
            int r12 = r12.getCurrentPage()
            int r12 = r12 + r3
            java.util.List r1 = p102x3.Ee.f13941a
            int r1 = r1.size()
            int r5 = r12 % r1
            r11.f13783o = r2
            r9 = 6
            r10 = 0
            androidx.compose.foundation.pager.PagerState r4 = r11.p
            r6 = 0
            r7 = 0
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L2f
            return r0
        L59:
            B3.o r12 = B3.o.f154a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.Ae.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
