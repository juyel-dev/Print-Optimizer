package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p087u3.v;
import p102x3.J3;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13031o;
    public final /* synthetic */ v p;
    public final /* synthetic */ J3 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2321y f13032r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(PrintOrderViewModel printOrderViewModel, v vVar, J3 j5, C2321y c2321y, d dVar) {
        super(2, dVar);
        this.f13031o = printOrderViewModel;
        this.p = vVar;
        this.q = j5;
        this.f13032r = c2321y;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        J3 j5 = this.q;
        C2321y c2321y = this.f13032r;
        return new J0(this.f13031o, this.p, j5, c2321y, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        J0 j5 = (J0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        j5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13031o;
        printOrderViewModel.f10891c.k(this.p, new F(printOrderViewModel, this.q, this.f13032r, 4));
        return o.f154a;
    }
}
