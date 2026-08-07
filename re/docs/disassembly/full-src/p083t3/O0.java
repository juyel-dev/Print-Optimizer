package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p102x3.Va;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13090o;
    public final /* synthetic */ C2306q p;
    public final /* synthetic */ Va q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(k kVar, C2306q c2306q, Va va, d dVar) {
        super(2, dVar);
        this.f13090o = kVar;
        this.p = c2306q;
        this.q = va;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new O0(this.f13090o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        O0 o5 = (O0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        o5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13090o.f150o;
        if (!(obj2 instanceof B3.j)) {
            this.p.invoke();
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to send OTP";
            }
            this.q.invoke(message);
        }
        return o.f154a;
    }
}
