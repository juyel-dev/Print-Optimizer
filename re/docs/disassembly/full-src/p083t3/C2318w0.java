package p083t3;

import B3.h;
import B3.k;
import B3.o;
import C3.I;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import android.util.Log;
import com.notescrafter.PrintOrderViewModel;
import java.util.Map;
import p087u3.l;

/* JADX INFO: renamed from: t3.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2318w0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13222o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2318w0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel, String str) {
        super(2, dVar);
        this.f13222o = kVar;
        this.p = printOrderViewModel;
        this.q = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2318w0(this.f13222o, dVar, this.p, this.q);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2318w0 c2318w0 = (C2318w0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2318w0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13222o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        String str = this.q;
        PrintOrderViewModel printOrderViewModel = this.p;
        if (!z3) {
            T t = printOrderViewModel.f10880S;
            Map mapM = I.M((Map) t.getValue(), new h(str, (l) obj2));
            t.getClass();
            t.j(null, mapM);
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            Log.e("PrintOrderViewModel", "Failed to load live tracking for ".concat(str), thA);
        }
        T t5 = printOrderViewModel.f10882U;
        Map mapM2 = I.M((Map) t5.getValue(), new h(str, Boolean.FALSE));
        t5.getClass();
        t5.j(null, mapM2);
        return o.f154a;
    }
}
