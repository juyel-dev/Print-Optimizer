package p090v1;

import android.content.Context;
import com.google.android.gms.internal.ads.C1038e9;
import p008b2.b;

/* JADX INFO: renamed from: v1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2348h extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0 f13456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13457d;
    public final /* synthetic */ C2358m e;

    public C2348h(C2358m c2358m, Context context, M0 m5, String str) {
        this.f13455b = context;
        this.f13456c = m5;
        this.f13457d = str;
        this.e = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13455b, "search");
        return new A0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.G1(new b(this.f13455b), this.f13456c, this.f13457d, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((C1038e9) this.e.f13471o).f(this.f13455b, this.f13456c, this.f13457d, null, 3);
    }
}
