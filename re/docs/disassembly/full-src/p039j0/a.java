package p039j0;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import p048l0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11561o;
    public final /* synthetic */ d p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, d dVar2) {
        super(2, dVar2);
        this.p = dVar;
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
    public final Object invokeSuspend(Object obj) {
        G3.a aVar = G3.a.f448o;
        int i5 = this.f11561o;
        if (i5 == 0) {
            o4.d.y(obj);
            b bVar = this.p.f11565a;
            this.f11561o = 1;
            obj = bVar.b(this);
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
