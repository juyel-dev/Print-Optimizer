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
import java.util.List;

/* JADX INFO: renamed from: t3.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2299m0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13197o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299m0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13197o = kVar;
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2299m0(this.f13197o, dVar, this.p);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2299m0 c2299m0 = (C2299m0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2299m0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13197o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        PrintOrderViewModel printOrderViewModel = this.p;
        if (!z3) {
            printOrderViewModel.f10872K.i((List) obj2);
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            Log.e("PrintOrderViewModel", "Failed to fetch orders", thA);
        }
        T t = printOrderViewModel.f10874M;
        Boolean bool = Boolean.FALSE;
        t.getClass();
        t.j(null, bool);
        return o.f154a;
    }
}
