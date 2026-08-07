package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;

/* JADX INFO: renamed from: x3.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589n5 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15351o;
    public final /* synthetic */ PagerState p;
    public final /* synthetic */ List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2589n5(PagerState pagerState, List list, d dVar) {
        super(2, dVar);
        this.p = pagerState;
        this.q = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2589n5(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        ((C2589n5) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
        return a.f448o;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:11:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0008
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            G3.a r0 = G3.a.f448o
            int r1 = r11.f15351o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L19
        Ld:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L15:
            o4.d.y(r12)
            goto L27
        L19:
            o4.d.y(r12)
        L1c:
            r11.f15351o = r3
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r12 = X3.A.g(r4, r11)
            if (r12 != r0) goto L27
            return r0
        L27:
            androidx.compose.foundation.pager.PagerState r12 = r11.p
            int r12 = r12.getCurrentPage()
            int r12 = r12 + r3
            java.util.List r1 = r11.q
            int r1 = r1.size()
            int r5 = r12 % r1
            r11.f15351o = r2
            r9 = 6
            r10 = 0
            androidx.compose.foundation.pager.PagerState r4 = r11.p
            r6 = 0
            r7 = 0
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L1c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2589n5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
