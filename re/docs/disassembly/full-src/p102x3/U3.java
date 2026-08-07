package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14486o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14487r;

    public /* synthetic */ U3(int i5, MutableState mutableState, MutableState mutableState2, Object obj) {
        this.f14486o = i5;
        this.f14487r = obj;
        this.p = mutableState;
        this.q = mutableState2;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14486o) {
            case 0:
                H3 h5 = (H3) this.f14487r;
                this.p.setValue(h5.f14015b);
                this.q.setValue(h5.f14014a);
                break;
            default:
                this.p.setValue(((m) this.f14487r).getId());
                Gd.w(this.q, true);
                break;
        }
        return o.f154a;
    }
}
