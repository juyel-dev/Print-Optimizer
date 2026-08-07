package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2383a7 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14779o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14780r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2383a7(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.f14779o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14780r = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2383a7(this.f14779o, this.p, this.q, this.f14780r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2383a7 c2383a7 = (C2383a7) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2383a7.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        int i5 = this.f14779o;
        MutableState mutableState = this.p;
        this.q.setValue(p035i0.a.l("Processing page ", i5 + 1, " of ", AbstractC2447e7.b(mutableState), "..."));
        this.f14780r.setValue(Float.valueOf(i5 / ((Number) mutableState.getValue()).intValue()));
        return o.f154a;
    }
}
