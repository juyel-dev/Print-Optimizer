package p015d;

import B3.o;
import androidx.compose.runtime.DisposableEffectResult;
import p022f.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10936b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f10935a = i5;
        this.f10936b = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        o oVar;
        switch (this.f10935a) {
            case 0:
                e eVar = ((a) this.f10936b).f10934a;
                if (eVar != null) {
                    eVar.K();
                    oVar = o.f154a;
                } else {
                    oVar = null;
                }
                if (oVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 1:
                ((h) this.f10936b).e();
                return;
            default:
                ((o) this.f10936b).e();
                return;
        }
    }
}
