package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13011o;
    public final /* synthetic */ Throwable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(PrintOrderViewModel printOrderViewModel, Throwable th, d dVar) {
        super(2, dVar);
        this.f13011o = printOrderViewModel;
        this.p = th;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new B0(this.f13011o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        B0 b5 = (B0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        b5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        T t = this.f13011o.f10908w;
        String message = this.p.getMessage();
        if (message == null) {
            message = "Invalid or unserviceable pincode";
        }
        t.getClass();
        t.j(null, message);
        return o.f154a;
    }
}
