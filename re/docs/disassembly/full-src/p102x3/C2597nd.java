package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import p083t3.C2312t0;

/* JADX INFO: renamed from: x3.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2597nd extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f15360o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597nd(PrintOrderViewModel printOrderViewModel, d dVar) {
        super(2, dVar);
        this.f15360o = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2597nd(this.f15360o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2597nd c2597nd = (C2597nd) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2597nd.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f15360o;
        printOrderViewModel.getClass();
        p019e0.a aVarH = Q.h(printOrderViewModel);
        e4.e eVar = H.f1766a;
        A.t(aVarH, e4.d.f11107o, null, new C2312t0(printOrderViewModel, null), 2);
        printOrderViewModel.g();
        return o.f154a;
    }
}
