package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import a4.T;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import p083t3.C2301n0;
import p083t3.C2308r0;

/* JADX INFO: loaded from: classes2.dex */
public final class Vb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f14535o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(PrintOrderViewModel printOrderViewModel, d dVar) {
        super(2, dVar);
        this.f14535o = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Vb(this.f14535o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Vb vb = (Vb) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        vb.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f14535o;
        T t = printOrderViewModel.f10874M;
        Boolean bool = Boolean.TRUE;
        t.getClass();
        t.j(null, bool);
        p019e0.a aVarH = Q.h(printOrderViewModel);
        e4.e eVar = H.f1766a;
        e4.d dVar = e4.d.f11107o;
        A.t(aVarH, dVar, null, new C2301n0(printOrderViewModel, null), 2);
        A.t(Q.h(printOrderViewModel), dVar, null, new C2308r0(printOrderViewModel, null), 2);
        return o.f154a;
    }
}
