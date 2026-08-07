package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* JADX INFO: renamed from: x3.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2667s4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15518o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;

    public /* synthetic */ C2667s4(String str, int i5, int i6) {
        this.f15518o = i6;
        this.p = str;
        this.q = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15518o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                Z4.i(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
            default:
                Rb.k(this.p, composer, RecomposeScopeImplKt.updateChangedFlags(this.q | 1));
                break;
        }
        return o.f154a;
    }
}
