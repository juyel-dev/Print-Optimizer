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
import android.util.Log;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: renamed from: t3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2287g0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13171o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2287g0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13171o = kVar;
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2287g0(this.f13171o, dVar, this.p);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2287g0 c2287g0 = (C2287g0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2287g0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13171o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        PrintOrderViewModel printOrderViewModel = this.p;
        if (!z3) {
            h hVar = (h) obj2;
            printOrderViewModel.f10902m.i(hVar.f148o);
            printOrderViewModel.f10904o.i(hVar.p);
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            T t = printOrderViewModel.f10902m;
            Double d4 = new Double(0.0d);
            t.getClass();
            t.j(null, d4);
            Double d5 = new Double(0.0d);
            T t5 = printOrderViewModel.f10904o;
            t5.getClass();
            t5.j(null, d5);
            Log.e("PrintOrderViewModel", "Failed to calculate shipping cost via backend", thA);
        }
        return o.f154a;
    }
}
