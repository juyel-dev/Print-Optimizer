package p090v1;

import L0.a;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.C0743Hd;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z0 f13502o;

    public /* synthetic */ y0(z0 z0Var) {
        this.f13502o = z0Var;
    }

    @Override // p090v1.B
    public final String b() {
        return null;
    }

    @Override // p090v1.B
    public final void b1(J0 j5) {
        m3(j5, 1);
    }

    @Override // p090v1.B
    public final String c() {
        return null;
    }

    @Override // p090v1.B
    public final boolean f() {
        return false;
    }

    @Override // p090v1.B
    public final void m3(J0 j5, int i5) {
        AbstractC1223ib.p("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C0743Hd.f3898b.post(new a(this, 16));
    }
}
