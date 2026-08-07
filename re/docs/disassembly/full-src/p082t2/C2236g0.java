package p082t2;

import H2.d;
import H2.e;
import H2.f;
import T1.z;
import Y1.a;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import com.google.android.gms.internal.measurement.C1;
import com.google.android.gms.internal.measurement.C2000b0;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.C2101t3;
import com.google.android.gms.internal.measurement.C2115w2;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.N1;
import com.google.android.gms.internal.measurement.O1;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import p033h3.k;
import p042j3.c;
import p081t1.b;

/* JADX INFO: renamed from: t2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2236g0 implements InterfaceC2254p0 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static volatile C2236g0 f12666I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Boolean f12667A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Boolean f12668B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Boolean f12669C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f12670D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f12671E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12672F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f12674H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12678d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f12679f;
    public final C2235g g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U f12680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f12681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2226b0 f12682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z0 f12683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n1 f12684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final K f12685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f12686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K0 f12687o;
    public final C2267w0 p;
    public final C2258s q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I0 f12688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12689s;
    public J t;
    public O0 u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2255q f12690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public H f12691w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f12693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f12694z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12692x = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final AtomicInteger f12673G = new AtomicInteger(0);

    public C2236g0(C2263u0 c2263u0) {
        d eVar;
        Context context;
        Bundle bundle;
        boolean z3 = false;
        Context context2 = c2263u0.f12861a;
        C c5 = new C(11);
        this.f12679f = c5;
        AbstractC2261t0.f12859k = c5;
        this.f12675a = context2;
        this.f12676b = c2263u0.f12862b;
        this.f12677c = c2263u0.f12863c;
        this.f12678d = c2263u0.f12864d;
        this.e = c2263u0.f12866h;
        this.f12667A = c2263u0.e;
        this.f12689s = c2263u0.f12868j;
        this.f12670D = true;
        C2000b0 c2000b0 = c2263u0.g;
        if (c2000b0 != null && (bundle = c2000b0.u) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f12668B = (Boolean) obj;
            }
            Object obj2 = c2000b0.u.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f12669C = (Boolean) obj2;
            }
        }
        if (N1.f10565h == null && context2 != null) {
            Object obj3 = N1.g;
            synchronized (obj3) {
                try {
                    if (N1.f10565h == null) {
                        synchronized (obj3) {
                            C1 c6 = N1.f10565h;
                            Context applicationContext = context2.getApplicationContext();
                            applicationContext = applicationContext == null ? context2 : applicationContext;
                            if (c6 == null || c6.f10432a != applicationContext) {
                                E1.c();
                                O1.a();
                                synchronized (H1.class) {
                                    try {
                                        H1 h5 = H1.f10538r;
                                        if (h5 != null && (context = (Context) h5.p) != null && ((I1) h5.q) != null) {
                                            context.getContentResolver().unregisterContentObserver((I1) H1.f10538r.q);
                                        }
                                        H1.f10538r = null;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                C2115w2 c2115w2 = new C2115w2();
                                c2115w2.f10802o = applicationContext;
                                if (c2115w2 instanceof Serializable) {
                                    eVar = new e(c2115w2);
                                } else {
                                    f fVar = new f();
                                    fVar.f496o = c2115w2;
                                    eVar = fVar;
                                }
                                N1.f10565h = new C1(applicationContext, eVar);
                                N1.f10566i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f12686n = a.f1848a;
        Long l5 = c2263u0.f12867i;
        this.f12674H = l5 != null ? l5.longValue() : System.currentTimeMillis();
        C2235g c2235g = new C2235g(this);
        c2235g.f12664c = "";
        c2235g.f12665d = C2233f.f12641b;
        this.g = c2235g;
        U u = new U(this);
        u.l();
        this.f12680h = u;
        L l6 = new L(this);
        l6.l();
        this.f12681i = l6;
        n1 n1Var = new n1(this);
        n1Var.l();
        this.f12684l = n1Var;
        this.f12685m = new K(new c(this, 23));
        this.q = new C2258s(this);
        K0 k3 = new K0(this);
        k3.p();
        this.f12687o = k3;
        C2267w0 c2267w0 = new C2267w0(this);
        c2267w0.p();
        this.p = c2267w0;
        Z0 z4 = new Z0(this);
        z4.p();
        this.f12683k = z4;
        I0 i1 = new I0(this);
        i1.l();
        this.f12688r = i1;
        C2226b0 c2226b0 = new C2226b0(this);
        c2226b0.l();
        this.f12682j = c2226b0;
        C2000b0 c2000b1 = c2263u0.g;
        if (c2000b1 != null && c2000b1.p != 0) {
            z3 = true;
        }
        if (context2.getApplicationContext() instanceof Application) {
            c(c2267w0);
            if (((C2236g0) c2267w0.f12783a).f12675a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C2236g0) c2267w0.f12783a).f12675a.getApplicationContext();
                if (c2267w0.f12873c == null) {
                    c2267w0.f12873c = new k(c2267w0);
                }
                if (!z3) {
                    application.unregisterActivityLifecycleCallbacks(c2267w0.f12873c);
                    application.registerActivityLifecycleCallbacks(c2267w0.f12873c);
                    c2267w0.j().f12479n.g("Registered activity lifecycle callback");
                }
            }
        } else {
            d(l6);
            l6.f12474i.g("Application context is not an Application");
        }
        c2226b0.t(new RunnableC1805vo(13, this, false, c2263u0));
    }

    public static C2236g0 b(Context context, C2000b0 c2000b0, Long l5) {
        Bundle bundle;
        if (c2000b0 != null && (c2000b0.f10637s == null || c2000b0.t == null)) {
            c2000b0 = new C2000b0(c2000b0.f10635o, c2000b0.p, c2000b0.q, c2000b0.f10636r, null, null, c2000b0.u, null);
        }
        z.i(context);
        z.i(context.getApplicationContext());
        if (f12666I == null) {
            synchronized (C2236g0.class) {
                try {
                    if (f12666I == null) {
                        f12666I = new C2236g0(new C2263u0(context, c2000b0, l5));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (c2000b0 != null && (bundle = c2000b0.u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            z.i(f12666I);
            f12666I.f12667A = Boolean.valueOf(c2000b0.u.getBoolean("dataCollectionDefaultEnabled"));
        }
        z.i(f12666I);
        return f12666I;
    }

    public static void c(B b5) {
        if (b5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b5.f12413b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b5.getClass())));
        }
    }

    public static void d(AbstractC2250n0 abstractC2250n0) {
        if (abstractC2250n0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2250n0.f12771b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2250n0.getClass())));
        }
    }

    public static void f(AbstractC2252o0 abstractC2252o0) {
        if (abstractC2252o0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    @Override // p082t2.InterfaceC2254p0
    public final Context a() {
        return this.f12675a;
    }

    @Override // p082t2.InterfaceC2254p0
    public final a e() {
        return this.f12686n;
    }

    public final boolean g() {
        return l() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    public final boolean h() {
        n1 n1Var;
        boolean z3;
        boolean z4;
        String strS;
        H hP;
        H hP2;
        if (!this.f12692x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C2226b0 c2226b0 = this.f12682j;
        d(c2226b0);
        c2226b0.h();
        Boolean bool = this.f12693y;
        a aVar = this.f12686n;
        if (bool == null || this.f12694z == 0) {
            aVar.getClass();
            this.f12694z = SystemClock.elapsedRealtime();
            n1Var = this.f12684l;
            f(n1Var);
            z3 = true;
            if (n1Var.m0("android.permission.INTERNET") || !n1Var.m0("android.permission.ACCESS_NETWORK_STATE")) {
                z4 = false;
            } else {
                Context context = this.f12675a;
                if (p003a2.c.a(context).d() || this.g.x() || (n1.Q(context) && n1.j0(context))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            this.f12693y = Boolean.valueOf(z4);
            if (z4) {
                strS = p().s();
                hP = p();
                hP.o();
                if (!n1Var.V(strS, hP.f12450m)) {
                    hP2 = p();
                    hP2.o();
                    if (TextUtils.isEmpty(hP2.f12450m)) {
                        z3 = false;
                    }
                }
                this.f12693y = Boolean.valueOf(z3);
            }
        } else if (!bool.booleanValue()) {
            aVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f12694z) > 1000) {
                aVar.getClass();
                this.f12694z = SystemClock.elapsedRealtime();
                n1Var = this.f12684l;
                f(n1Var);
                z3 = true;
                if (n1Var.m0("android.permission.INTERNET")) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                this.f12693y = Boolean.valueOf(z4);
                if (z4) {
                    strS = p().s();
                    hP = p();
                    hP.o();
                    if (!n1Var.V(strS, hP.f12450m)) {
                        hP2 = p();
                        hP2.o();
                        if (TextUtils.isEmpty(hP2.f12450m)) {
                            z3 = false;
                        }
                    }
                    this.f12693y = Boolean.valueOf(z3);
                }
            }
        }
        return this.f12693y.booleanValue();
    }

    @Override // p082t2.InterfaceC2254p0
    public final C i() {
        return this.f12679f;
    }

    @Override // p082t2.InterfaceC2254p0
    public final L j() {
        L l5 = this.f12681i;
        d(l5);
        return l5;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e6  */
    public final boolean k() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C2239i c2239iI1;
        Bundle bundle;
        C2251o c2251oA;
        int i5;
        String str;
        boolean z3;
        String str2;
        C2226b0 c2226b0 = this.f12682j;
        d(c2226b0);
        c2226b0.h();
        I0 i1 = this.f12688r;
        d(i1);
        d(i1);
        String strR = p().r();
        U u = this.f12680h;
        f(u);
        u.h();
        C2101t3.p.get();
        C2236g0 c2236g0 = (C2236g0) u.f12783a;
        URL url = null;
        if (!c2236g0.g.t(null, AbstractC2268x.f12903I0) || u.u().e(EnumC2257r0.AD_STORAGE)) {
            c2236g0.f12686n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (u.f12547i == null || jElapsedRealtime >= u.f12549k) {
                C2235g c2235g = c2236g0.g;
                c2235g.getClass();
                u.f12549k = c2235g.q(strR, AbstractC2268x.f12937c) + jElapsedRealtime;
                try {
                    p081t1.a aVarA = b.a(c2236g0.f12675a);
                    u.f12547i = "";
                    String str3 = aVarA.f12378a;
                    if (str3 != null) {
                        u.f12547i = str3;
                    }
                    u.f12548j = aVarA.f12379b;
                } catch (Exception e) {
                    u.j().f12478m.f(e, "Unable to get advertising id");
                    u.f12547i = "";
                }
                pair = new Pair(u.f12547i, Boolean.valueOf(u.f12548j));
            } else {
                pair = new Pair(u.f12547i, Boolean.valueOf(u.f12548j));
            }
        } else {
            pair = new Pair("", Boolean.FALSE);
        }
        C2235g c2235g2 = this.g;
        Boolean boolS = c2235g2.s("google_analytics_adid_collection_enabled");
        boolean z4 = boolS == null || boolS.booleanValue();
        L l5 = this.f12681i;
        if (!z4 || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            d(l5);
            l5.f12478m.g("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        d(i1);
        i1.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C2236g0) i1.f12783a).f12675a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            d(l5);
            l5.f12474i.g("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        C2072n3.a();
        if (c2235g2.t(null, AbstractC2268x.f12909L0)) {
            O0 o0S = s();
            o0S.h();
            o0S.o();
            if (!o0S.A() || o0S.g().n0() >= 234200) {
                C2267w0 c2267w0 = this.p;
                c(c2267w0);
                c2267w0.h();
                O0 o0S2 = ((C2236g0) c2267w0.f12783a).s();
                o0S2.h();
                o0S2.o();
                G g = o0S2.f12492d;
                if (g == null) {
                    o0S2.w();
                    o0S2.j().f12478m.g("Failed to get consents; not connected to service yet.");
                } else {
                    try {
                        c2239iI1 = g.I1(o0S2.D(false));
                        o0S2.C();
                    } catch (RemoteException e3) {
                        o0S2.j().f12472f.f(e3, "Failed to get consents; remote exception");
                        c2239iI1 = null;
                    }
                    if (c2239iI1 != null) {
                        bundle = c2239iI1.f12697o;
                    } else {
                        bundle = null;
                    }
                    if (bundle == null) {
                        int i6 = this.f12672F;
                        this.f12672F = i6 + 1;
                        z3 = i6 < 10;
                        d(l5);
                        if (z3) {
                            str2 = "Retrying.";
                        } else {
                            str2 = "Skipping.";
                        }
                        l5.f12478m.f(Integer.valueOf(this.f12672F), androidx.compose.foundation.text.modifiers.a.z("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                        return z3;
                    }
                    C2259s0 c2259s0B = C2259s0.b(100, bundle);
                    sb.append("&gcs=");
                    sb.append(c2259s0B.i());
                    c2251oA = C2251o.a(100, bundle);
                    sb.append("&dma=");
                    if (c2251oA.f12781c == Boolean.FALSE) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    sb.append(i5);
                    str = c2251oA.f12782d;
                    if (!TextUtils.isEmpty(str)) {
                        sb.append("&dma_cps=");
                        sb.append(str);
                    }
                    int i7 = C2259s0.f(bundle.getString("ad_personalization")) == Boolean.TRUE ? 0 : 1;
                    sb.append("&npa=");
                    sb.append(i7);
                    d(l5);
                    l5.f12479n.f(sb, "Consent query parameters to Bow");
                }
                c2239iI1 = null;
                if (c2239iI1 != null) {
                    bundle = c2239iI1.f12697o;
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    int i8 = this.f12672F;
                    this.f12672F = i8 + 1;
                    if (i8 < 10) {
                    }
                    d(l5);
                    if (z3) {
                        str2 = "Retrying.";
                    } else {
                        str2 = "Skipping.";
                    }
                    l5.f12478m.f(Integer.valueOf(this.f12672F), androidx.compose.foundation.text.modifiers.a.z("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                    return z3;
                }
                C2259s0 c2259s0B2 = C2259s0.b(100, bundle);
                sb.append("&gcs=");
                sb.append(c2259s0B2.i());
                c2251oA = C2251o.a(100, bundle);
                sb.append("&dma=");
                if (c2251oA.f12781c == Boolean.FALSE) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                sb.append(i5);
                str = c2251oA.f12782d;
                if (!TextUtils.isEmpty(str)) {
                    sb.append("&dma_cps=");
                    sb.append(str);
                }
                if (C2259s0.f(bundle.getString("ad_personalization")) == Boolean.TRUE) {
                }
                sb.append("&npa=");
                sb.append(i7);
                d(l5);
                l5.f12479n.f(sb, "Consent query parameters to Bow");
            }
        }
        n1 n1Var = this.f12684l;
        f(n1Var);
        p();
        String str4 = (String) pair.first;
        long jA = u.f12556v.a() - 1;
        String string = sb.toString();
        try {
            z.e(str4);
            z.e(strR);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v84002." + n1Var.n0()) + "&rdid=" + str4 + "&bundleid=" + strR + "&retry=" + jA;
            if (strR.equals(((C2236g0) n1Var.f12783a).g.n("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!string.isEmpty()) {
                if (string.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(string);
            }
            url = new URL(strConcat);
        } catch (IllegalArgumentException e5) {
            e = e5;
            n1Var.j().f12472f.f(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
        } catch (MalformedURLException e6) {
            e = e6;
            n1Var.j().f12472f.f(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
        }
        if (url != null) {
            d(i1);
            X x4 = new X();
            x4.f12578a = this;
            i1.h();
            i1.k();
            i1.m().r(new B0.d(i1, strR, url, x4));
        }
        return false;
    }

    public final int l() {
        C2226b0 c2226b0 = this.f12682j;
        d(c2226b0);
        c2226b0.h();
        Boolean boolS = this.g.s("firebase_analytics_collection_deactivated");
        if (boolS != null && boolS.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f12669C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C2226b0 c2226b1 = this.f12682j;
        d(c2226b1);
        c2226b1.h();
        if (!this.f12670D) {
            return 8;
        }
        U u = this.f12680h;
        f(u);
        u.h();
        Boolean boolValueOf = u.s().contains("measurement_enabled") ? Boolean.valueOf(u.s().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolS2 = this.g.s("firebase_analytics_collection_enabled");
        if (boolS2 != null) {
            return boolS2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f12668B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f12667A == null || this.f12667A.booleanValue()) ? 0 : 7;
    }

    @Override // p082t2.InterfaceC2254p0
    public final C2226b0 m() {
        C2226b0 c2226b0 = this.f12682j;
        d(c2226b0);
        return c2226b0;
    }

    public final C2258s n() {
        C2258s c2258s = this.q;
        if (c2258s != null) {
            return c2258s;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2255q o() {
        d(this.f12690v);
        return this.f12690v;
    }

    public final H p() {
        c(this.f12691w);
        return this.f12691w;
    }

    public final J q() {
        c(this.t);
        return this.t;
    }

    public final K r() {
        return this.f12685m;
    }

    public final O0 s() {
        c(this.u);
        return this.u;
    }

    public final void t() {
        f(this.f12684l);
    }
}
