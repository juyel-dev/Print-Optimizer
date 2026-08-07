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
import androidx.compose.runtime.State;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import p083t3.C2277b0;
import p083t3.C2308r0;

/* JADX INFO: loaded from: classes2.dex */
public final class Gb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f14003o;
    public final /* synthetic */ State p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(PrintOrderViewModel printOrderViewModel, State state, d dVar) {
        super(2, dVar);
        this.f14003o = printOrderViewModel;
        this.p = state;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Gb(this.f14003o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Gb gb = (Gb) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        gb.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f14003o;
        printOrderViewModel.getClass();
        p019e0.a aVarH = Q.h(printOrderViewModel);
        e4.e eVar = H.f1766a;
        A.t(aVarH, e4.d.f11107o, null, new C2308r0(printOrderViewModel, null), 2);
        if (((Boolean) this.p.getValue()).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            T t = printOrderViewModel.f10868G;
            t.getClass();
            t.j(null, bool);
            Boolean bool2 = Boolean.FALSE;
            T t5 = printOrderViewModel.f10866E;
            t5.getClass();
            t5.j(null, bool2);
            printOrderViewModel.f10910y.i(null);
            printOrderViewModel.f10862A.i(null);
            printOrderViewModel.f10864C.i(null);
            printOrderViewModel.f10891c.e(new C2277b0(printOrderViewModel, 3));
        }
        return o.f154a;
    }
}
