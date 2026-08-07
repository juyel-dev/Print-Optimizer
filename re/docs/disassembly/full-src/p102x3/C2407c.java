package p102x3;

import B3.o;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* JADX INFO: renamed from: x3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2407c implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14852o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Modifier f14853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14854s;

    public /* synthetic */ C2407c(String str, String str2, Modifier modifier, int i5, int i6) {
        this.f14852o = i6;
        this.p = str;
        this.q = str2;
        this.f14853r = modifier;
        this.f14854s = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f14852o;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC2471g.b(this.p, this.q, this.f14853r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14854s | 1));
                break;
            case 1:
                AbstractC2471g.c(this.p, this.q, this.f14853r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14854s | 1));
                break;
            default:
                F5.a(this.p, this.q, this.f14853r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14854s | 1));
                break;
        }
        return o.f154a;
    }
}
