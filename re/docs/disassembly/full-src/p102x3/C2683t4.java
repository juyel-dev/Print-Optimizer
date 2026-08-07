package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* JADX INFO: renamed from: x3.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2683t4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15545o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15546r;

    public /* synthetic */ C2683t4(String str, String str2, int i5, int i6) {
        this.f15545o = i6;
        this.p = str;
        this.q = str2;
        this.f15546r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f15545o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                Z4.c(this.p, this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15546r | 1));
                break;
            default:
                Gd.i(this.p, this.q, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15546r | 1));
                break;
        }
        return o.f154a;
    }
}
