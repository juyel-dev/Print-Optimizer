package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13159o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ C2291i0 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13160r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k kVar, PrintOrderViewModel printOrderViewModel, C2291i0 c2291i0, String str, d dVar) {
        super(2, dVar);
        this.f13159o = kVar;
        this.p = printOrderViewModel;
        this.q = c2291i0;
        this.f13160r = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new d1(this.f13159o, this.p, this.q, this.f13160r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        d1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13159o.f150o;
        boolean z3 = obj2 instanceof B3.j;
        C2291i0 c2291i0 = this.q;
        if (!z3) {
            this.p.m();
            if (c2291i0 != null) {
                ((MutableState) c2291i0.f13180r).setValue(Boolean.FALSE);
                String str = this.f13160r;
                ((MutableState) c2291i0.q).setValue(str);
                ((MutableState) c2291i0.f13181s).setValue(Boolean.TRUE);
                Throwable thA = k.a(str);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "Failed to place order";
                    }
                    ((PrintOrderViewModel) c2291i0.p).f10908w.i(message);
                }
            }
        }
        Throwable thA2 = k.a(obj2);
        if (thA2 != null && c2291i0 != null) {
            B3.j jVarD = o4.d.d(thA2);
            ((MutableState) c2291i0.f13180r).setValue(Boolean.FALSE);
            Throwable thA3 = k.a(jVarD);
            if (thA3 != null) {
                String message2 = thA3.getMessage();
                ((PrintOrderViewModel) c2291i0.p).f10908w.i(message2 != null ? message2 : "Failed to place order");
            }
        }
        return o.f154a;
    }
}
