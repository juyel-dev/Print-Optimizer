package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2769ya extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15782o;
    public final /* synthetic */ int p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15784s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2769ya(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, d dVar) {
        super(2, dVar);
        this.p = i5;
        this.q = mutableState;
        this.f15783r = mutableState2;
        this.f15784s = mutableState3;
        this.t = mutableState4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2769ya(this.p, this.q, this.f15783r, this.f15784s, this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2769ya) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:16:0x0039). Please report as a decompilation issue!!! */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        int iE;
        a aVar = a.f448o;
        int i5 = this.f15782o;
        MutableState mutableState = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            iE = Ja.e(mutableState);
            MutableState mutableState2 = this.f15783r;
            if (iE > 0 || ((Boolean) mutableState2.getValue()).booleanValue()) {
                if (((Number) mutableState.getValue()).intValue() == 0 && !((Boolean) mutableState2.getValue()).booleanValue()) {
                    MutableState mutableState3 = this.f15784s;
                    EnumC2386aa enumC2386aa = (EnumC2386aa) mutableState3.getValue();
                    MutableState mutableState4 = this.t;
                    Ja.g(enumC2386aa, ((Number) mutableState4.getValue()).intValue(), this.p, new C2721va(1, mutableState3, mutableState4));
                }
                return o.f154a;
            }
            this.f15782o = 1;
            if (A.g(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        mutableState.setValue(Integer.valueOf(Ja.e(mutableState) - 1));
        iE = Ja.e(mutableState);
        MutableState mutableState5 = this.f15783r;
        if (iE > 0) {
        }
        if (((Number) mutableState.getValue()).intValue() == 0) {
            MutableState mutableState6 = this.f15784s;
            EnumC2386aa enumC2386aa2 = (EnumC2386aa) mutableState6.getValue();
            MutableState mutableState7 = this.t;
            Ja.g(enumC2386aa2, ((Number) mutableState7.getValue()).intValue(), this.p, new C2721va(1, mutableState6, mutableState7));
        }
        return o.f154a;
    }
}
