package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2675sc extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15535o;
    public final /* synthetic */ String p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15536r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2675sc(String str, MutableState mutableState, MutableState mutableState2, d dVar) {
        super(2, dVar);
        this.p = str;
        this.q = mutableState;
        this.f15536r = mutableState2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2675sc(this.p, this.q, this.f15536r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2675sc) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15535o;
        o oVar = o.f154a;
        if (i5 == 0) {
            o4.d.y(obj);
            String str = this.p;
            MutableState mutableState = this.q;
            if (str == null || str.length() == 0) {
                mutableState.setValue(Boolean.FALSE);
                return oVar;
            }
            mutableState.setValue(Boolean.TRUE);
            e4.e eVar = H.f1766a;
            e4.d dVar = e4.d.f11107o;
            C2659rc c2659rc = new C2659rc(str, this.f15536r, mutableState, null);
            this.f15535o = 1;
            if (A.C(dVar, c2659rc, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return oVar;
    }
}
