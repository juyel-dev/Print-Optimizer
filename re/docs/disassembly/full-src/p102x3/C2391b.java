package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2391b implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14807o = 0;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ImageVector f14808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14809s;

    public /* synthetic */ C2391b(ImageVector imageVector, String str, String str2, int i5) {
        this.f14808r = imageVector;
        this.p = str;
        this.q = str2;
        this.f14809s = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f14807o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                AbstractC2471g.d(RecomposeScopeImplKt.updateChangedFlags(this.f14809s | 1), composer, this.f14808r, this.p, this.q);
                break;
            default:
                ef.b(RecomposeScopeImplKt.updateChangedFlags(this.f14809s | 1), composer, this.f14808r, this.p, this.q);
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2391b(String str, String str2, ImageVector imageVector, int i5) {
        this.p = str;
        this.q = str2;
        this.f14808r = imageVector;
        this.f14809s = i5;
    }
}
