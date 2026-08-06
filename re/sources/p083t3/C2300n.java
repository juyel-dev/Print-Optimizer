package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.State;

/* JADX INFO: renamed from: t3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2300n extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f13198o;
    public final /* synthetic */ b p;
    public final /* synthetic */ State q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300n(b bVar, b bVar2, State state, d dVar) {
        super(2, dVar);
        this.f13198o = bVar;
        this.p = bVar2;
        this.q = state;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2300n(this.f13198o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2300n c2300n = (C2300n) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2300n.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        State state = this.q;
        ((Boolean) state.getValue()).booleanValue();
        this.f13198o.j();
        ((Boolean) state.getValue()).booleanValue();
        this.p.j();
        return o.f154a;
    }
}
