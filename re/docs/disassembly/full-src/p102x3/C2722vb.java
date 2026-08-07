package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2722vb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15653o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2722vb(MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2722vb(this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        ((C2722vb) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
        return a.f448o;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            G3.a r0 = G3.a.f448o
            int r1 = r5.f15653o
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            o4.d.y(r6)
            goto L23
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            o4.d.y(r6)
        L18:
            r5.f15653o = r2
            r3 = 8500(0x2134, double:4.1996E-320)
            java.lang.Object r6 = X3.A.g(r3, r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            androidx.compose.runtime.MutableState r6 = r5.p
            java.lang.Object r1 = r6.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r2
            int r1 = r1 % 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.setValue(r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2722vb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
