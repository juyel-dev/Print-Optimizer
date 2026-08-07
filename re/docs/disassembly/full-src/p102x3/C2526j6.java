package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* JADX INFO: renamed from: x3.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2526j6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15217o;
    public final /* synthetic */ int p;

    public /* synthetic */ C2526j6(int i5, int i6) {
        this.f15217o = i6;
        this.p = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15217o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                AbstractC2574m6.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 1:
                AbstractC2574m6.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 2:
                AbstractC2574m6.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 3:
                Rb.j(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 4:
                Rb.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 5:
                Rb.l(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 6:
                Rb.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            case 7:
                Rb.h(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
            default:
                Rb.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.p | 1));
                break;
        }
        return o.f154a;
    }
}
