package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.t;

/* JADX INFO: renamed from: t3.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2320x0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13225o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320x0(PrintOrderViewModel printOrderViewModel, String str, d dVar) {
        super(2, dVar);
        this.f13225o = printOrderViewModel;
        this.p = str;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2320x0(this.f13225o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2320x0 c2320x0 = (C2320x0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2320x0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13225o;
        C2117x c2117x = printOrderViewModel.f10891c;
        String str = this.p;
        C2275a0 c2275a0 = new C2275a0(printOrderViewModel, str, 4);
        c2117x.getClass();
        b bVarC = c2117x.c("https://notescrafter.com/api/print/orders/" + str + "/tracking");
        bVarC.g();
        ((t) c2117x.q).a(bVarC.d()).e(new A.e(c2275a0, 23));
        return o.f154a;
    }
}
