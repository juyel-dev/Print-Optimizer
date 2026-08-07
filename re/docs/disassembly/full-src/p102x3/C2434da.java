package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* JADX INFO: renamed from: x3.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2434da extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14931o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14932r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2434da(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.p = mutableState;
        this.q = mutableState2;
        this.f14932r = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2434da(this.p, this.q, this.f14932r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2434da) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14931o;
        MutableState mutableState = this.p;
        MutableState mutableState2 = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            List list = AbstractC2642qa.f15449c;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState2.setValue(15);
                List list2 = AbstractC2642qa.f15449c;
                if (((Number) mutableState2.getValue()).intValue() <= 0) {
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    this.f14932r.setValue(Boolean.TRUE);
                    mutableState.setValue(Boolean.FALSE);
                }
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
            List list3 = AbstractC2642qa.f15449c;
            mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() - 1));
            List list4 = AbstractC2642qa.f15449c;
            if (((Number) mutableState2.getValue()).intValue() <= 0 && ((Boolean) mutableState.getValue()).booleanValue()) {
                this.f14931o = 1;
                if (A.g(1000L, this) == aVar) {
                    return aVar;
                }
                List list5 = AbstractC2642qa.f15449c;
                mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() - 1));
                List list6 = AbstractC2642qa.f15449c;
                if (((Number) mutableState2.getValue()).intValue() <= 0) {
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    this.f14932r.setValue(Boolean.TRUE);
                    mutableState.setValue(Boolean.FALSE);
                }
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                this.f14932r.setValue(Boolean.TRUE);
                mutableState.setValue(Boolean.FALSE);
            }
        }
        return o.f154a;
    }
}
