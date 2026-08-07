package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p102x3.R4;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R4 f13085o;
    public final /* synthetic */ Throwable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(R4 r4, Throwable th, d dVar) {
        super(2, dVar);
        this.f13085o = r4;
        this.p = th;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new M0(this.f13085o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        M0 m5 = (M0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        m5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13085o.invoke(Boolean.FALSE, this.p.getMessage());
        return o.f154a;
    }
}
