package p083t3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: t3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2313u implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13217o;
    public final /* synthetic */ Y p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2313u(Y y4, MutableState mutableState, int i5) {
        this.f13217o = i5;
        this.p = y4;
        this.q = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13217o) {
            case 0:
                this.q.setValue("flow");
                this.p.g(-1);
                break;
            case 1:
                this.q.setValue("flow");
                this.p.g(-1);
                break;
            default:
                this.q.setValue("flow");
                Y y4 = this.p;
                y4.h();
                y4.g(0);
                break;
        }
        return o.f154a;
    }
}
