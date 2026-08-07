package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import androidx.compose.runtime.State;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: renamed from: t3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2298m extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13196o;
    public final /* synthetic */ State p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2298m(PrintOrderViewModel printOrderViewModel, State state, d dVar) {
        super(2, dVar);
        this.f13196o = printOrderViewModel;
        this.p = state;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2298m(this.f13196o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2298m c2298m = (C2298m) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2298m.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        if (((Boolean) this.p.getValue()).booleanValue()) {
            PrintOrderViewModel printOrderViewModel = this.f13196o;
            printOrderViewModel.getClass();
            p019e0.a aVarH = Q.h(printOrderViewModel);
            e4.e eVar = H.f1766a;
            A.t(aVarH, e4.d.f11107o, null, new C2312t0(printOrderViewModel, null), 2);
            printOrderViewModel.g();
        }
        return o.f154a;
    }
}
