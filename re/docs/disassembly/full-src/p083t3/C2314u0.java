package p083t3;

import B3.h;
import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: renamed from: t3.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2314u0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13218o;
    public final /* synthetic */ k p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314u0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13218o = printOrderViewModel;
        this.p = kVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2314u0(this.p, dVar, this.f13218o);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2314u0 c2314u0 = (C2314u0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2314u0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13218o;
        T t = printOrderViewModel.f10868G;
        Boolean bool = Boolean.FALSE;
        t.getClass();
        t.j(null, bool);
        Object obj2 = this.p.f150o;
        boolean z3 = obj2 instanceof B3.j;
        T t5 = printOrderViewModel.f10910y;
        if (!z3) {
            t5.i((h) obj2);
        }
        if (k.a(obj2) != null) {
            t5.i(null);
        }
        return o.f154a;
    }
}
