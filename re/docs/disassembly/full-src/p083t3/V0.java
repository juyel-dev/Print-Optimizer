package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.D;
import X3.H;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class V0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13117o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(PrintOrderViewModel printOrderViewModel, d dVar) {
        super(2, dVar);
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        V0 v4 = new V0(this.p, dVar);
        v4.f13117o = obj;
        return v4;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        V0 v4 = (V0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        v4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        InterfaceC0200y interfaceC0200y = (InterfaceC0200y) this.f13117o;
        PrintOrderViewModel printOrderViewModel = this.p;
        D d4 = printOrderViewModel.e;
        if (d4 != null) {
            d4.cancel(null);
        }
        e4.e eVar = H.f1766a;
        printOrderViewModel.e = A.t(interfaceC0200y, e4.d.f11107o, null, new U0(printOrderViewModel, null), 2);
        return o.f154a;
    }
}
