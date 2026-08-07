package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2375a implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14760o;
    public final /* synthetic */ Modifier p;
    public final /* synthetic */ int q;

    public /* synthetic */ C2375a(Modifier modifier, int i5, int i6) {
        this.f14760o = i6;
        this.p = modifier;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f14760o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC2471g.a(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 1:
                AbstractC2493h5.b(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 2:
                Rb.a(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            default:
                Ye.a(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
        }
        return o.f154a;
    }
}
