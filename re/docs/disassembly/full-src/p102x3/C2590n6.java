package p102x3;

import B3.o;
import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* JADX INFO: renamed from: x3.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2590n6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15352o;
    public final /* synthetic */ a p;
    public final /* synthetic */ int q;

    public /* synthetic */ C2590n6(int i5, int i6, a aVar) {
        this.f15352o = i6;
        this.p = aVar;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f15352o) {
            case 0:
                num.intValue();
                p003a2.a.b(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 1:
                num.intValue();
                Rb.n(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            case 2:
                num.intValue();
                Gd.c(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            default:
                num.getClass();
                Ye.f(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
        }
        return o.f154a;
    }
}
