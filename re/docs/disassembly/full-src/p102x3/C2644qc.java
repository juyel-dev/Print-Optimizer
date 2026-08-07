package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2644qc extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15451o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2644qc(MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f15451o = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2644qc(this.f15451o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2644qc c2644qc = (C2644qc) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2644qc.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.f15451o.setValue(Boolean.FALSE);
        return o.f154a;
    }
}
