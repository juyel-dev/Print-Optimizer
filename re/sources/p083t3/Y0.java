package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import P0.b;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class Y0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13138o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Throwable q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(PrintOrderViewModel printOrderViewModel, String str, Throwable th, d dVar) {
        super(2, dVar);
        this.f13138o = printOrderViewModel;
        this.p = str;
        this.q = th;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Y0(this.f13138o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Y0 y4 = (Y0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        y4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f13138o.r(this.p, new b(this.q, 2));
        return o.f154a;
    }
}
