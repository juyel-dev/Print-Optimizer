package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.a;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import java.util.List;
import p087u3.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Tb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f14458o;
    public final /* synthetic */ l p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14459r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(String str, l lVar, a aVar, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14458o = str;
        this.p = lVar;
        this.q = aVar;
        this.f14459r = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Tb(this.f14458o, this.p, this.q, this.f14459r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Tb tb = (Tb) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        tb.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        G3.a aVar = G3.a.f448o;
        o4.d.y(obj);
        MutableState mutableState = this.f14459r;
        List list = AbstractC2452ec.f14975a;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            String str = this.f14458o;
            if ((str.equals("Shipped") || str.equals("Delivered")) && this.p == null) {
                this.q.invoke();
            }
        }
        return o.f154a;
    }
}
