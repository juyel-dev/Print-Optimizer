package p039j0;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.net.Uri;
import p048l0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11564o;
    public final /* synthetic */ d p;
    public final /* synthetic */ Uri q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, d dVar2) {
        super(2, dVar2);
        this.p = dVar;
        this.q = uri;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new c(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f11564o;
        if (i5 == 0) {
            o4.d.y(obj);
            b bVar = this.p.f11565a;
            this.f11564o = 1;
            if (bVar.d(this.q, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return o.f154a;
    }
}
