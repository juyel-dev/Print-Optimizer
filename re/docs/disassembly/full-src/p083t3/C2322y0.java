package p083t3;

import B3.h;
import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p102x3.C2492h4;

/* JADX INFO: renamed from: t3.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2322y0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13227o;
    public final /* synthetic */ C2492h4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2322y0(k kVar, C2492h4 c2492h4, d dVar) {
        super(2, dVar);
        this.f13227o = kVar;
        this.p = c2492h4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2322y0(this.f13227o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2322y0 c2322y0 = (C2322y0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2322y0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13227o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        C2492h4 c2492h4 = this.p;
        if (!z3) {
            c2492h4.invoke((h) obj2, null);
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Lookup failed";
            }
            c2492h4.invoke(null, message);
        }
        return o.f154a;
    }
}
