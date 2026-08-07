package p082t2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f12426o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f12427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f12428s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2267w0 f12429v;

    public D0(C2267w0 c2267w0, String str, String str2, long j5, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        this.f12426o = str;
        this.p = str2;
        this.q = j5;
        this.f12427r = bundle;
        this.f12428s = z3;
        this.t = z4;
        this.u = z5;
        this.f12429v = c2267w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12429v.y(this.f12426o, this.p, this.q, this.f12427r, this.f12428s, this.t, this.u);
    }
}
