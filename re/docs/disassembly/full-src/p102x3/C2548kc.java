package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.State;
import p087u3.q;

/* JADX INFO: renamed from: x3.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2548kc extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f15253o;
    public final /* synthetic */ State p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2548kc(q qVar, State state, d dVar) {
        super(2, dVar);
        this.f15253o = qVar;
        this.p = state;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2548kc(this.f15253o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2548kc c2548kc = (C2548kc) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2548kc.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        q qVar = this.f15253o;
        if (qVar.getPostalCode().length() == 6) {
            ((c) this.p.getValue()).invoke(qVar.getPostalCode());
        }
        return o.f154a;
    }
}
