package p102x3;

import O3.e;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2721va implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15652o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2721va(int i5, MutableState mutableState, MutableState mutableState2) {
        this.f15652o = i5;
        this.p = mutableState;
        this.q = mutableState2;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15652o;
        EnumC2386aa newPhase = (EnumC2386aa) obj;
        Integer num = (Integer) obj2;
        num.intValue();
        switch (i5) {
            case 0:
                o.f(newPhase, "newPhase");
                this.p.setValue(newPhase);
                this.q.setValue(num);
                break;
            default:
                this.p.setValue(newPhase);
                this.q.setValue(num);
                break;
        }
        return B3.o.f154a;
    }
}
