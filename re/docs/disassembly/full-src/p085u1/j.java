package p085u1;

import E1.k;
import J2.b;
import T1.z;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C1705tc;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.InterfaceC0905b6;
import com.google.android.gms.internal.ads.L7;
import com.google.android.gms.internal.ads.M4;
import java.util.Iterator;
import java.util.TreeMap;
import p008b2.a;
import p020e1.h;
import p090v1.G0;
import p090v1.H;
import p090v1.InterfaceC2347g0;
import p090v1.InterfaceC2357l0;
import p090v1.InterfaceC2363o0;
import p090v1.InterfaceC2368t;
import p090v1.InterfaceC2371w;
import p090v1.InterfaceC2373y;
import p090v1.J0;
import p090v1.M0;
import p090v1.N;
import p090v1.P0;
import p090v1.Q;
import p090v1.T;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends H {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0785Od f13306o;
    public final M0 p;
    public final b q = AbstractC0803Rd.f5534a.g(new k(this, 4));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f13307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f13308s;
    public WebView t;
    public InterfaceC2371w u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public M4 f13309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AsyncTask f13310w;

    public j(Context context, M0 m5, String str, C0785Od c0785Od) {
        this.f13307r = context;
        this.f13306o = c0785Od;
        this.p = m5;
        this.t = new WebView(context);
        this.f13308s = new h(context, str);
        S3(0);
        this.t.setVerticalScrollBarEnabled(false);
        this.t.getSettings().setJavaScriptEnabled(true);
        this.t.setWebViewClient(new g(this));
        this.t.setOnTouchListener(new h(this));
    }

    @Override // p090v1.I
    public final void D() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void F() {
        z.d("resume must be called on the main UI thread.");
    }

    @Override // p090v1.I
    public final boolean F2(J0 j5) {
        TreeMap treeMap;
        z.j(this.t, "This Search Ad has already been torn down");
        h hVar = this.f13308s;
        hVar.getClass();
        hVar.e = j5.f13414x.f13392o;
        Bundle bundle = j5.f13396A;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) L7.f4717c.p();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                treeMap = (TreeMap) hVar.f11068d;
                if (!zHasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    hVar.f11069f = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f13306o.f5227o);
            if (((Boolean) L7.f4715a.p()).booleanValue()) {
                Bundle bundleB = p111z2.b.B((Context) hVar.f11067c, (String) L7.f4716b.p());
                for (String str2 : bundleB.keySet()) {
                    treeMap.put(str2, bundleB.get(str2).toString());
                }
            }
        }
        this.f13310w = new i(this).execute(new Void[0]);
        return true;
    }

    @Override // p090v1.I
    public final boolean G3() {
        return false;
    }

    @Override // p090v1.I
    public final String H() {
        return null;
    }

    @Override // p090v1.I
    public final void I() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final String J() {
        return null;
    }

    @Override // p090v1.I
    public final void J2(N n5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void L0(E7 e7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void N0() {
        z.d("pause must be called on the main UI thread.");
    }

    public final void S3(int i5) {
        if (this.t == null) {
            return;
        }
        this.t.setLayoutParams(new ViewGroup.LayoutParams(-1, i5));
    }

    @Override // p090v1.I
    public final void U1(InterfaceC2368t interfaceC2368t) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void X() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void X2(C1705tc c1705tc) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void a1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void d0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void d2(P0 p5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final InterfaceC2371w f() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // p090v1.I
    public final void f0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void f3(boolean z3) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final M0 h() {
        return this.p;
    }

    @Override // p090v1.I
    public final void h3(G0 g5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final Bundle i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final N j() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // p090v1.I
    public final InterfaceC2357l0 k() {
        return null;
    }

    @Override // p090v1.I
    public final boolean k0() {
        return false;
    }

    @Override // p090v1.I
    public final InterfaceC2363o0 m() {
        return null;
    }

    @Override // p090v1.I
    public final void m0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final a n() {
        z.d("getAdFrame must be called on the main UI thread.");
        return new p008b2.b(this.t);
    }

    @Override // p090v1.I
    public final void o0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void o1(M0 m5) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final String t() {
        String str = (String) this.f13308s.f11069f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return androidx.compose.foundation.text.modifiers.a.z("https://", str, (String) L7.f4718d.p());
    }

    @Override // p090v1.I
    public final void t3(Q q) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final void v1(InterfaceC0905b6 interfaceC0905b6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p090v1.I
    public final String w() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // p090v1.I
    public final void x() {
        z.d("destroy must be called on the main UI thread.");
        this.f13310w.cancel(true);
        this.q.cancel(true);
        this.t.destroy();
        this.t = null;
    }

    @Override // p090v1.I
    public final void y3(InterfaceC2371w interfaceC2371w) {
        this.u = interfaceC2371w;
    }

    @Override // p090v1.I
    public final void B0(InterfaceC2347g0 interfaceC2347g0) {
    }

    @Override // p090v1.I
    public final void K1(a aVar) {
    }

    @Override // p090v1.I
    public final void Q3(boolean z3) {
    }

    @Override // p090v1.I
    public final void a2(T t) {
    }

    @Override // p090v1.I
    public final void V1(J0 j5, InterfaceC2373y interfaceC2373y) {
    }
}
