package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2599o implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15361o;
    public final /* synthetic */ a p;
    public final /* synthetic */ Modifier q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15362r;

    public /* synthetic */ C2599o(a aVar, Modifier modifier, int i5, int i6) {
        this.f15361o = i6;
        this.p = aVar;
        this.q = modifier;
        this.f15362r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15361o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                r.a(this.p, this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15362r | 1));
                break;
            default:
                AbstractC2574m6.e(this.p, this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15362r | 1));
                break;
        }
        return o.f154a;
    }
}
