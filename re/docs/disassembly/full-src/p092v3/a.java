package p092v3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13511o;
    public final /* synthetic */ h p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, d dVar) {
        super(2, dVar);
        this.p = hVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new a(this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        G3.a aVar = G3.a.f448o;
        int i5 = this.f13511o;
        o oVar = o.f154a;
        if (i5 == 0) {
            o4.d.y(obj);
            this.f13511o = 1;
            h hVar = this.p;
            hVar.getClass();
            e4.e eVar = H.f1766a;
            Object objC = A.C(e4.d.f11107o, new e(hVar, null), this);
            if (objC != aVar) {
                objC = oVar;
            }
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return oVar;
    }
}
