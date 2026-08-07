package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import com.notescrafter.PrintOrderViewModel;

/* JADX INFO: renamed from: x3.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2499hb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15158o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2499hb(PrintOrderViewModel printOrderViewModel, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = printOrderViewModel;
        this.q = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2499hb(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2499hb) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15158o;
        MutableState mutableState = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            mutableState.setValue(Boolean.TRUE);
            this.p.g();
            this.f15158o = 1;
            if (A.g(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        mutableState.setValue(Boolean.FALSE);
        return o.f154a;
    }
}
