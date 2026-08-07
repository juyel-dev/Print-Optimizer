package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13015o;
    public final /* synthetic */ Throwable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(PrintOrderViewModel printOrderViewModel, Throwable th, d dVar) {
        super(2, dVar);
        this.f13015o = printOrderViewModel;
        this.p = th;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new D0(this.f13015o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        D0 d4 = (D0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        d4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13015o.f10908w.i(androidx.compose.foundation.text.modifiers.a.y("Pincode lookup failed: ", this.p.getMessage()));
        return o.f154a;
    }
}
