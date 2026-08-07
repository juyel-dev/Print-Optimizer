package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2433d9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14929o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14930r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2433d9(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.f14929o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14930r = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2433d9(this.f14929o, this.p, this.q, this.f14930r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2433d9 c2433d9 = (C2433d9) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2433d9.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        int i5 = this.f14929o;
        MutableState mutableState = this.p;
        this.q.setValue(p035i0.a.l("Loading page ", i5 + 1, " of ", ((Number) mutableState.getValue()).intValue(), "..."));
        this.f14930r.setValue(Float.valueOf(i5 / ((Number) mutableState.getValue()).intValue()));
        return o.f154a;
    }
}
