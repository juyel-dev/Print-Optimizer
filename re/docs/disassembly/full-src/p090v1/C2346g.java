package p090v1;

import android.content.Context;
import com.google.android.gms.internal.ads.C1038e9;
import com.google.android.gms.internal.ads.InterfaceC0697Aa;
import p008b2.b;

/* JADX INFO: renamed from: v1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2346g extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0 f13452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13453d;
    public final /* synthetic */ InterfaceC0697Aa e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2358m f13454f;

    public C2346g(C2358m c2358m, Context context, M0 m5, String str, InterfaceC0697Aa interfaceC0697Aa) {
        this.f13451b = context;
        this.f13452c = m5;
        this.f13453d = str;
        this.e = interfaceC0697Aa;
        this.f13454f = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13451b, "app_open");
        return new A0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.S2(new b(this.f13451b), this.f13452c, this.f13453d, this.e, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object c() {
        return ((C1038e9) this.f13454f.f13471o).f(this.f13451b, this.f13452c, this.f13453d, this.e, 4);
    }
}
