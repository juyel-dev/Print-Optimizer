package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;

/* JADX INFO: renamed from: x3.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2509i5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15177o;
    public final /* synthetic */ ImageVector p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Modifier f15179s;
    public final /* synthetic */ int t;

    public /* synthetic */ C2509i5(ImageVector imageVector, String str, String str2, Modifier modifier, int i5, int i6) {
        this.f15177o = i6;
        this.p = imageVector;
        this.q = str;
        this.f15178r = str2;
        this.f15179s = modifier;
        this.t = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15177o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.t | 1);
                String str = this.q;
                String str2 = this.f15178r;
                Modifier modifier = this.f15179s;
                AbstractC2684t5.a(this.p, str, str2, modifier, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.t | 1);
                String str3 = this.q;
                String str4 = this.f15178r;
                Modifier modifier2 = this.f15179s;
                ef.a(this.p, str3, str4, modifier2, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return o.f154a;
    }
}
