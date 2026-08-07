package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.material3.SnackbarHostState;

/* JADX INFO: renamed from: t3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2309s extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p036i2.e f13213o;
    public final /* synthetic */ InterfaceC0200y p;
    public final /* synthetic */ SnackbarHostState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2309s(p036i2.e eVar, InterfaceC0200y interfaceC0200y, SnackbarHostState snackbarHostState, d dVar) {
        super(2, dVar);
        this.f13213o = eVar;
        this.p = interfaceC0200y;
        this.q = snackbarHostState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2309s(this.f13213o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2309s c2309s = (C2309s) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2309s.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        InterfaceC0200y interfaceC0200y = this.p;
        SnackbarHostState snackbarHostState = this.q;
        p036i2.e eVar = this.f13213o;
        eVar.q = new C2306q(interfaceC0200y, snackbarHostState, eVar, 0);
        return o.f154a;
    }
}
