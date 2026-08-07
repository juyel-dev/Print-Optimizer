package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import android.util.Log;
import com.notescrafter.PrintOrderViewModel;
import p087u3.r;

/* JADX INFO: renamed from: t3.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2307q0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13210o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2307q0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13210o = kVar;
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2307q0(this.f13210o, dVar, this.p);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2307q0 c2307q0 = (C2307q0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2307q0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13210o.f150o;
        if (!(obj2 instanceof B3.j)) {
            r rVar = (r) obj2;
            PrintOrderViewModel printOrderViewModel = this.p;
            T t = printOrderViewModel.f10876O;
            Boolean boolValueOf = Boolean.valueOf(rVar.getAcceptingOrders());
            t.getClass();
            t.j(null, boolValueOf);
            if (rVar.getMessage() != null) {
                printOrderViewModel.f10878Q.i(rVar.getMessage());
            }
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            Log.e("PrintOrderViewModel", "Failed to fetch store status", thA);
        }
        return o.f154a;
    }
}
