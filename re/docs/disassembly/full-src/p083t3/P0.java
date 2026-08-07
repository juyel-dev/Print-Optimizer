package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p102x3.Va;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13092o;
    public final /* synthetic */ String p;
    public final /* synthetic */ C2306q q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Va f13093r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(PrintOrderViewModel printOrderViewModel, String str, C2306q c2306q, Va va, d dVar) {
        super(2, dVar);
        this.f13092o = printOrderViewModel;
        this.p = str;
        this.q = c2306q;
        this.f13093r = va;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        C2306q c2306q = this.q;
        Va va = this.f13093r;
        return new P0(this.f13092o, this.p, c2306q, va, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        P0 p5 = (P0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        p5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13092o;
        printOrderViewModel.f10891c.m(this.p, new F(printOrderViewModel, this.q, this.f13093r, 6));
        return o.f154a;
    }
}
