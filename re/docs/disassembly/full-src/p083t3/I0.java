package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p102x3.J3;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13028o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ J3 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2321y f13029r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(k kVar, PrintOrderViewModel printOrderViewModel, J3 j5, C2321y c2321y, d dVar) {
        super(2, dVar);
        this.f13028o = kVar;
        this.p = printOrderViewModel;
        this.q = j5;
        this.f13029r = c2321y;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new I0(this.f13028o, this.p, this.q, this.f13029r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        I0 i1 = (I0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        i1.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13028o.f150o;
        if (!(obj2 instanceof B3.j)) {
            this.p.g();
            this.q.invoke();
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Failed to save address";
            }
            this.f13029r.invoke(message);
        }
        return o.f154a;
    }
}
