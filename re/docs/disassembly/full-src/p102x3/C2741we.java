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

/* JADX INFO: renamed from: x3.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2741we extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15699o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15700r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2741we(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.p = mutableState;
        this.q = mutableState2;
        this.f15700r = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2741we(this.p, this.q, this.f15700r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2741we) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15699o;
        MutableState mutableState = this.p;
        MutableState mutableState2 = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            List list = Ee.f13941a;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState2.setValue(15);
                List list2 = Ee.f13941a;
                if (((Number) mutableState2.getValue()).intValue() <= 0) {
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    this.f15700r.setValue(Boolean.TRUE);
                    mutableState.setValue(Boolean.FALSE);
                }
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
            List list3 = Ee.f13941a;
            mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() - 1));
            List list4 = Ee.f13941a;
            if (((Number) mutableState2.getValue()).intValue() <= 0 && ((Boolean) mutableState.getValue()).booleanValue()) {
                this.f15699o = 1;
                if (A.g(1000L, this) == aVar) {
                    return aVar;
                }
                List list5 = Ee.f13941a;
                mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() - 1));
                List list6 = Ee.f13941a;
                if (((Number) mutableState2.getValue()).intValue() <= 0) {
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    this.f15700r.setValue(Boolean.TRUE);
                    mutableState.setValue(Boolean.FALSE);
                }
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                this.f15700r.setValue(Boolean.TRUE);
                mutableState.setValue(Boolean.FALSE);
            }
        }
        return o.f154a;
    }
}
