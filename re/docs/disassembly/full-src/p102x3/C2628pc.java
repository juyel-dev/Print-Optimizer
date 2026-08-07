package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;

/* JADX INFO: renamed from: x3.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2628pc extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15420o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2628pc(ArrayList arrayList, MutableState mutableState, MutableState mutableState2, d dVar) {
        super(2, dVar);
        this.f15420o = arrayList;
        this.p = mutableState;
        this.q = mutableState2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2628pc(this.f15420o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2628pc c2628pc = (C2628pc) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2628pc.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        this.p.setValue(this.f15420o);
        this.q.setValue(Boolean.FALSE);
        return o.f154a;
    }
}
