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
import p102x3.Gd;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2291i0 f13017o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C2291i0 c2291i0, String str, d dVar) {
        super(2, dVar);
        this.f13017o = c2291i0;
        this.p = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new E0(this.f13017o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        E0 e3 = (E0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        e3.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        C2291i0 c2291i0 = this.f13017o;
        if (c2291i0 != null) {
            B3.j jVarD = o4.d.d(new Exception(this.p));
            Gd.r((MutableState) c2291i0.f13180r, false);
            Throwable thA = k.a(jVarD);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "Failed to place order";
                }
                ((PrintOrderViewModel) c2291i0.p).p(message);
            }
        }
        return o.f154a;
    }
}
