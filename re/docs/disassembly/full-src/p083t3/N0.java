package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p087u3.v;
import p102x3.R4;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13088o;
    public final /* synthetic */ v p;
    public final /* synthetic */ R4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(PrintOrderViewModel printOrderViewModel, v vVar, R4 r4, d dVar) {
        super(2, dVar);
        this.f13088o = printOrderViewModel;
        this.p = vVar;
        this.q = r4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new N0(this.f13088o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        N0 n1 = (N0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        n1.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13088o;
        printOrderViewModel.f10891c.k(this.p, new Y3.d(5, printOrderViewModel, this.q));
        return o.f154a;
    }
}
