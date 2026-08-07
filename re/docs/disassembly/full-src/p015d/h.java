package p015d;

import O3.a;
import androidx.compose.runtime.State;
import p010c.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ State f10947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z3, State state) {
        super(z3);
        this.f10947d = state;
    }

    @Override // p010c.v
    public final void b() {
        ((a) this.f10947d.getValue()).invoke();
    }
}
