package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;

/* JADX INFO: renamed from: x3.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2738wb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15696o;
    public final /* synthetic */ PagerState p;
    public final /* synthetic */ List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2738wb(PagerState pagerState, List list, d dVar) {
        super(2, dVar);
        this.p = pagerState;
        this.q = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2738wb(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        ((C2738wb) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
        return a.f448o;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:11:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            G3.a r0 = G3.a.f448o
            int r1 = r12.f15696o
            androidx.compose.foundation.pager.PagerState r2 = r12.p
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L1b
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            o4.d.y(r13)
            goto L32
        L1b:
            o4.d.y(r13)
        L1e:
            int r13 = r2.getCurrentPage()
            if (r13 != 0) goto L27
            r5 = 8500(0x2134, double:4.1996E-320)
            goto L29
        L27:
            r5 = 3000(0xbb8, double:1.482E-320)
        L29:
            r12.f15696o = r4
            java.lang.Object r13 = X3.A.g(r5, r12)
            if (r13 != r0) goto L32
            return r0
        L32:
            int r13 = r2.getCurrentPage()
            int r13 = r13 + r4
            java.util.List r1 = r12.q
            int r1 = r1.size()
            int r1 = r1 + r4
            int r6 = r13 % r1
            r12.f15696o = r3
            r10 = 6
            r11 = 0
            androidx.compose.foundation.pager.PagerState r5 = r12.p
            r7 = 0
            r8 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L1e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2738wb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
