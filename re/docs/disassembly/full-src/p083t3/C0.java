package p083t3;

import B3.h;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p102x3.C2622p6;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2622p6 f13013o;
    public final /* synthetic */ h p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C2622p6 c2622p6, h hVar, d dVar) {
        super(2, dVar);
        this.f13013o = c2622p6;
        this.p = hVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C0(this.f13013o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C0 c5 = (C0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        h hVar = this.p;
        this.f13013o.invoke(hVar.f148o, hVar.p);
        return o.f154a;
    }
}
