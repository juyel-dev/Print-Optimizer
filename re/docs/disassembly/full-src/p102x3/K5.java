package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14124o;
    public final /* synthetic */ String p;
    public final /* synthetic */ ImageVector q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f14125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14126s;
    public final /* synthetic */ int t;

    public /* synthetic */ K5(String str, ImageVector imageVector, String str2, String str3, int i5, int i6) {
        this.f14124o = i6;
        this.p = str;
        this.q = imageVector;
        this.f14125r = str2;
        this.f14126s = str3;
        this.t = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14124o) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC2494h6.b(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC2447e7.d(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC2782z7.a(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC2416c8.c(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC2783z8.c(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                Q8.a(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC2545k9.b(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                C9.b(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                Z9.c(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC2642qa.b(this.p, this.q, this.f14125r, this.f14126s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.t | 1));
                break;
        }
        return o.f154a;
    }
}
