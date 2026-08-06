package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p102x3.M4;

/* JADX INFO: renamed from: t3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2305p0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13207o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2305p0(PrintOrderViewModel printOrderViewModel, boolean z3, String str, d dVar) {
        super(2, dVar);
        this.f13207o = printOrderViewModel;
        this.p = z3;
        this.q = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2305p0(this.f13207o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2305p0 c2305p0 = (C2305p0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2305p0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13207o;
        printOrderViewModel.f10891c.e(new M4(printOrderViewModel, this.p, this.q));
        return o.f154a;
    }
}
