package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J3 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14103o;
    public final /* synthetic */ a p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ J3(a aVar, MutableState mutableState, int i5) {
        this.f14103o = i5;
        this.p = aVar;
        this.q = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14103o) {
            case 0:
                this.q.setValue(Boolean.FALSE);
                this.p.invoke();
                break;
            case 1:
                this.q.setValue(Boolean.FALSE);
                this.p.invoke();
                break;
            default:
                this.q.setValue(Boolean.FALSE);
                this.p.invoke();
                break;
        }
        return o.f154a;
    }
}
