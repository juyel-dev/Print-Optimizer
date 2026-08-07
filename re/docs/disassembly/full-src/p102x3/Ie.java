package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final class Ie extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14098o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Ie(this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        ((Ie) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
        return a.f448o;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14098o;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o4.d.y(obj);
        do {
            this.p.setValue(Long.valueOf(System.currentTimeMillis()));
            this.f14098o = 1;
        } while (A.g(16L, this) != aVar);
        return aVar;
    }
}
