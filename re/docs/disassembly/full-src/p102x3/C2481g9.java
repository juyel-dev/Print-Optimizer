package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* JADX INFO: renamed from: x3.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2481g9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15086o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15087r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2481g9(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.f15086o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15087r = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2481g9(this.f15086o, this.p, this.q, this.f15087r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2481g9 c2481g9 = (C2481g9) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2481g9.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        int i5 = this.f15086o;
        MutableState mutableState = this.p;
        this.q.setValue(p035i0.a.l("Processing page ", i5 + 1, " of ", ((List) mutableState.getValue()).size(), "..."));
        this.f15087r.setValue(Float.valueOf(i5 / ((List) mutableState.getValue()).size()));
        return o.f154a;
    }
}
