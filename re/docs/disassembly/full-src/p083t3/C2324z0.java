package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import com.notescrafter.PrintOrderViewModel;
import p102x3.C2492h4;

/* JADX INFO: renamed from: t3.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2324z0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13229o;
    public final /* synthetic */ String p;
    public final /* synthetic */ C2492h4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2324z0(PrintOrderViewModel printOrderViewModel, String str, C2492h4 c2492h4, d dVar) {
        super(2, dVar);
        this.f13229o = printOrderViewModel;
        this.p = str;
        this.q = c2492h4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2324z0(this.f13229o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2324z0 c2324z0 = (C2324z0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2324z0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13229o;
        printOrderViewModel.f10891c.g(this.p, new Y3.d(4, printOrderViewModel, this.q));
        return o.f154a;
    }
}
