package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import p102x3.Pa;
import p102x3.Va;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13150o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Pa f13151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Va f13152s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(PrintOrderViewModel printOrderViewModel, String str, String str2, Pa pa, Va va, d dVar) {
        super(2, dVar);
        this.f13150o = printOrderViewModel;
        this.p = str;
        this.q = str2;
        this.f13151r = pa;
        this.f13152s = va;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        Pa pa = this.f13151r;
        Va va = this.f13152s;
        return new b1(this.f13150o, this.p, this.q, pa, va, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        b1 b1Var = (b1) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        b1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13150o;
        C2117x c2117x = printOrderViewModel.f10891c;
        Pa pa = this.f13151r;
        String str = this.p;
        c2117x.o(str, this.q, new C2291i0(printOrderViewModel, pa, str, this.f13152s, 2));
        return o.f154a;
    }
}
