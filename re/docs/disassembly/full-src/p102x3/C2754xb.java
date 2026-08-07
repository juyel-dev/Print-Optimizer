package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: x3.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2754xb implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15736o;
    public final /* synthetic */ int p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2754xb(int i5, int i6, MutableState mutableState) {
        this.f15736o = i6;
        this.p = i5;
        this.q = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15736o) {
            case 0:
                this.q.setValue(Integer.valueOf(this.p));
                break;
            default:
                this.q.setValue(Integer.valueOf(this.p));
                break;
        }
        return o.f154a;
    }
}
