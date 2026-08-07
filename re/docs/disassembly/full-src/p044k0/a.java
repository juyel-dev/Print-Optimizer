package p044k0;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p053m0.f;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11611o;
    public final /* synthetic */ b p;
    public final /* synthetic */ p053m0.a q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p053m0.a aVar, d dVar) {
        super(2, dVar);
        this.p = bVar;
        this.q = aVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new a(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        G3.a aVar = G3.a.f448o;
        int i5 = this.f11611o;
        if (i5 == 0) {
            o4.d.y(obj);
            f fVar = this.p.f11612a;
            this.f11611o = 1;
            obj = fVar.b(this.q, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return obj;
    }
}
