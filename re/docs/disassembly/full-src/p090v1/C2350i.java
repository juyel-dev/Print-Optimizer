package p090v1;

import android.content.Context;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C1038e9;
import p008b2.b;

/* JADX INFO: renamed from: v1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2350i extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0 f13459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13460d;
    public final /* synthetic */ BinderC1923ya e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2358m f13461f;

    public C2350i(C2358m c2358m, Context context, M0 m5, String str, BinderC1923ya binderC1923ya) {
        this.f13458b = context;
        this.f13459c = m5;
        this.f13460d = str;
        this.e = binderC1923ya;
        this.f13461f = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13458b, "interstitial");
        return new A0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.K3(new b(this.f13458b), this.f13459c, this.f13460d, this.e, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object c() {
        C1038e9 c1038e9 = (C1038e9) this.f13461f.f13471o;
        BinderC1923ya binderC1923ya = this.e;
        return c1038e9.f(this.f13458b, this.f13459c, this.f13460d, binderC1923ya, 2);
    }
}
