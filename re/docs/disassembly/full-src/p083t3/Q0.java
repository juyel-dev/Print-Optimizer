package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13097o;
    public final /* synthetic */ k p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(k kVar, d dVar, PrintOrderViewModel printOrderViewModel) {
        super(2, dVar);
        this.f13097o = printOrderViewModel;
        this.p = kVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Q0(this.p, dVar, this.f13097o);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Q0 q2 = (Q0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        q2.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13097o;
        T t = printOrderViewModel.f10906s;
        Boolean bool = Boolean.FALSE;
        t.getClass();
        t.j(null, bool);
        Object obj2 = this.p.f150o;
        if (!(obj2 instanceof B3.j)) {
            Boolean bool2 = Boolean.TRUE;
            T t5 = printOrderViewModel.q;
            t5.getClass();
            t5.j(null, bool2);
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to send WhatsApp verification";
            }
            T t6 = printOrderViewModel.f10870I;
            t6.getClass();
            t6.j(null, message);
        }
        return o.f154a;
    }
}
