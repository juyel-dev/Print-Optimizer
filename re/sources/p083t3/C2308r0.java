package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O1.i;
import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.t;

/* JADX INFO: renamed from: t3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2308r0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13212o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2308r0(PrintOrderViewModel printOrderViewModel, d dVar) {
        super(2, dVar);
        this.f13212o = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2308r0(this.f13212o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2308r0 c2308r0 = (C2308r0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2308r0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13212o;
        C2117x c2117x = printOrderViewModel.f10891c;
        C2277b0 c2277b0 = new C2277b0(printOrderViewModel, 6);
        c2117x.getClass();
        b bVarC = c2117x.c("https://notescrafter.com/api/print/status");
        bVarC.g();
        ((t) c2117x.q).a(bVarC.d()).e(new i(c2277b0, 22));
        return o.f154a;
    }
}
