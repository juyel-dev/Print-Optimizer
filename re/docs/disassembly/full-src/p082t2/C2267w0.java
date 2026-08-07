package p082t2;

import A.e;
import D.n;
import J2.a;
import J2.b;
import T1.z;
import Y1.c;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.C0782Oa;
import com.google.android.gms.internal.ads.C1731u1;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.ZF;
import com.google.android.gms.internal.measurement.C1994a0;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.C2117x;
import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p033h3.k;
import p039j0.d;

/* JADX INFO: renamed from: t2.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2267w0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f12873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2117x f12874d;
    public final CopyOnWriteArraySet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12875f;
    public final AtomicReference g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PriorityQueue f12878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2259s0 f12879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f12880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final X f12882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12883o;
    public B0 p;
    public A0 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B0 f12884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f12885s;

    public C2267w0(C2236g0 c2236g0) {
        super(c2236g0);
        this.e = new CopyOnWriteArraySet();
        this.f12876h = new Object();
        this.f12877i = false;
        this.f12883o = true;
        this.f12885s = new e(this, 20);
        this.g = new AtomicReference();
        this.f12879k = C2259s0.f12839c;
        this.f12881m = -1L;
        this.f12880l = new AtomicLong(0L);
        X x4 = new X();
        x4.f12578a = c2236g0;
        this.f12882n = x4;
    }

    public static void F(C2267w0 c2267w0, C2259s0 c2259s0, long j5, boolean z3, boolean z4) {
        c2267w0.h();
        c2267w0.o();
        C2259s0 c2259s0U = c2267w0.f().u();
        long j6 = c2267w0.f12881m;
        int i5 = c2259s0.f12841b;
        if (j5 <= j6 && c2259s0U.f12841b <= i5) {
            c2267w0.j().f12477l.f(c2259s0, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        U uF = c2267w0.f();
        uF.h();
        if (!uF.o(i5)) {
            L lJ = c2267w0.j();
            lJ.f12477l.f(Integer.valueOf(i5), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = uF.s().edit();
        editorEdit.putString("consent_settings", c2259s0.i());
        editorEdit.putInt("consent_source", i5);
        editorEdit.apply();
        c2267w0.f12881m = j5;
        C2236g0 c2236g0 = (C2236g0) c2267w0.f12783a;
        c2236g0.s().v(z3);
        if (z4) {
            c2236g0.s().s(new AtomicReference());
        }
    }

    public static void G(C2267w0 c2267w0, C2259s0 c2259s0, C2259s0 c2259s1) {
        EnumC2257r0 enumC2257r0 = EnumC2257r0.ANALYTICS_STORAGE;
        EnumC2257r0 enumC2257r1 = EnumC2257r0.AD_STORAGE;
        EnumC2257r0[] enumC2257r0Arr = {enumC2257r0, enumC2257r1};
        boolean z3 = false;
        for (int i5 = 0; i5 < 2; i5++) {
            EnumC2257r0 enumC2257r2 = enumC2257r0Arr[i5];
            if (!c2259s1.e(enumC2257r2) && c2259s0.e(enumC2257r2)) {
                z3 = true;
                break;
            }
        }
        boolean zH = c2259s0.h(c2259s1, enumC2257r0, enumC2257r1);
        if (z3 || zH) {
            ((C2236g0) c2267w0.f12783a).p().t();
        }
    }

    public final void A(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j5) {
        String strR;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z5 = !z4 || this.f12874d == null || n1.o0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i5 = 0; i5 < parcelableArr.length; i5++) {
                        if (parcelableArr[i5] instanceof Bundle) {
                            parcelableArr[i5] = new Bundle((Bundle) parcelableArr[i5]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        Object obj2 = list.get(i6);
                        if (obj2 instanceof Bundle) {
                            list.set(i6, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            m().t(new D0(this, str3, str2, j5, bundle3, z4, z5, z3));
            return;
        }
        K0 k0L = l();
        synchronized (k0L.f12469l) {
            try {
                if (!k0L.f12468k) {
                    k0L.j().f12476k.g("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > ((C2236g0) k0L.f12783a).g.l(null, false))) {
                    k0L.j().f12476k.f(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > ((C2236g0) k0L.f12783a).g.l(null, false))) {
                    k0L.j().f12476k.f(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = k0L.g;
                    strR = activity != null ? k0L.r(activity.getClass()) : "Activity";
                } else {
                    strR = string2;
                }
                L0 l5 = k0L.f12462c;
                if (k0L.f12465h && l5 != null) {
                    k0L.f12465h = false;
                    boolean zEquals = Objects.equals(l5.f12481b, strR);
                    boolean zEquals2 = Objects.equals(l5.f12480a, string);
                    if (zEquals && zEquals2) {
                        k0L.j().f12476k.g("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                k0L.j().f12479n.h("Logging screen view with name, class", string == null ? "null" : string, strR == null ? "null" : strR);
                L0 l6 = k0L.f12462c == null ? k0L.f12463d : k0L.f12462c;
                L0 l7 = new L0(string, strR, k0L.g().t0(), true, j5);
                k0L.f12462c = l7;
                k0L.f12463d = l6;
                k0L.f12466i = l7;
                ((C2236g0) k0L.f12783a).f12686n.getClass();
                k0L.m().t(new RunnableC2244k0(k0L, bundle2, l7, l6, SystemClock.elapsedRealtime(), 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(String str, String str2, Object obj, boolean z3) {
        ((C2236g0) this.f12783a).f12686n.getClass();
        C(str, str2, obj, z3, System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final void C(String str, String str2, Object obj, boolean z3, long j5) {
        int i5;
        int iC0;
        e eVar;
        C2236g0 c2236g0;
        int iO;
        Object objI0;
        int length;
        String str3 = str == null ? "app" : str;
        if (!z3) {
            n1 n1VarG = g();
            i5 = 6;
            if (n1VarG.k0("user property", str2)) {
                if (!n1VarG.Z("user property", AbstractC2261t0.e, null, str2)) {
                    iC0 = 15;
                } else if (n1VarG.U("user property", 24, str2)) {
                    i5 = 0;
                }
            }
            eVar = this.f12885s;
            c2236g0 = (C2236g0) this.f12783a;
            if (i5 != 0) {
                g();
                String strY = n1.y(str2, 24, true);
                length = str2 != null ? str2.length() : 0;
                c2236g0.t();
                n1.O(eVar, null, i5, "_ev", strY, length);
                return;
            }
            if (obj != null) {
                m().t(new RunnableC2244k0(this, str3, str2, null, j5, 1));
                return;
            }
            iO = g().o(obj, str2);
            if (iO != 0) {
                objI0 = g().i0(obj, str2);
                if (objI0 != null) {
                    m().t(new RunnableC2244k0(this, str3, str2, objI0, j5, 1));
                    return;
                }
                return;
            }
            g();
            String strY2 = n1.y(str2, 24, true);
            length = (!(obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
            c2236g0.t();
            n1.O(eVar, null, iO, "_ev", strY2, length);
        }
        iC0 = g().c0(str2);
        i5 = iC0;
        eVar = this.f12885s;
        c2236g0 = (C2236g0) this.f12783a;
        if (i5 != 0) {
            g();
            String strY3 = n1.y(str2, 24, true);
            if (str2 != null) {
            }
            c2236g0.t();
            n1.O(eVar, null, i5, "_ev", strY3, length);
            return;
        }
        if (obj != null) {
            m().t(new RunnableC2244k0(this, str3, str2, null, j5, 1));
            return;
        }
        iO = g().o(obj, str2);
        if (iO != 0) {
            objI0 = g().i0(obj, str2);
            if (objI0 != null) {
                m().t(new RunnableC2244k0(this, str3, str2, objI0, j5, 1));
                return;
            }
            return;
        }
        g();
        String strY4 = n1.y(str2, 24, true);
        if (obj instanceof String) {
        }
        c2236g0.t();
        n1.O(eVar, null, iO, "_ev", strY4, length);
    }

    public final void D(C2259s0 c2259s0) {
        h();
        boolean z3 = (c2259s0.e(EnumC2257r0.ANALYTICS_STORAGE) && c2259s0.e(EnumC2257r0.AD_STORAGE)) || ((C2236g0) this.f12783a).s().z();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        C2226b0 c2226b0 = c2236g0.f12682j;
        C2236g0.d(c2226b0);
        c2226b0.h();
        if (z3 != c2236g0.f12670D) {
            C2236g0 c2236g1 = (C2236g0) this.f12783a;
            C2226b0 c2226b1 = c2236g1.f12682j;
            C2236g0.d(c2226b1);
            c2226b1.h();
            c2236g1.f12670D = z3;
            U uF = f();
            uF.h();
            Boolean boolValueOf = uF.s().contains("measurement_enabled_from_api") ? Boolean.valueOf(uF.s().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z3 || boolValueOf == null || boolValueOf.booleanValue()) {
                v(Boolean.valueOf(z3), false);
            }
        }
    }

    public final void E(C2259s0 c2259s0, long j5) {
        C2259s0 c2259s1;
        boolean z3;
        C2259s0 c2259s2;
        boolean z4;
        boolean zH;
        o();
        int i5 = c2259s0.f12841b;
        if (i5 != -10) {
            if (((Boolean) c2259s0.f12840a.get(EnumC2257r0.AD_STORAGE)) == null) {
                if (((Boolean) c2259s0.f12840a.get(EnumC2257r0.ANALYTICS_STORAGE)) == null) {
                    j().f12476k.g("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f12876h) {
            try {
                c2259s1 = this.f12879k;
                z3 = false;
                if (i5 <= c2259s1.f12841b) {
                    zH = c2259s0.h(c2259s1, (EnumC2257r0[]) c2259s0.f12840a.keySet().toArray(new EnumC2257r0[0]));
                    EnumC2257r0 enumC2257r0 = EnumC2257r0.ANALYTICS_STORAGE;
                    if (c2259s0.e(enumC2257r0) && !this.f12879k.e(enumC2257r0)) {
                        z3 = true;
                    }
                    C2259s0 c2259s0G = c2259s0.g(this.f12879k);
                    this.f12879k = c2259s0G;
                    c2259s2 = c2259s0G;
                    z4 = z3;
                    z3 = true;
                } else {
                    c2259s2 = c2259s0;
                    z4 = false;
                    zH = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            j().f12477l.f(c2259s2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f12880l.getAndIncrement();
        if (zH) {
            w(null);
            m().u(new F0(this, c2259s2, j5, andIncrement, z4, c2259s1));
            return;
        }
        G0 g5 = new G0(this, c2259s2, andIncrement, z4, c2259s1);
        if (i5 == 30 || i5 == -10) {
            m().u(g5);
        } else {
            m().t(g5);
        }
    }

    public final void H() {
        h();
        o();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (c2236g0.h()) {
            Boolean boolS = c2236g0.g.s("google_analytics_deferred_deep_link_enabled");
            if (boolS != null && boolS.booleanValue()) {
                j().f12478m.g("Deferred Deep Link feature enabled.");
                C2226b0 c2226b0M = m();
                RunnableC2234f0 runnableC2234f0 = new RunnableC2234f0(1);
                runnableC2234f0.p = this;
                c2226b0M.t(runnableC2234f0);
            }
            O0 o0S = c2236g0.s();
            o0S.h();
            o0S.o();
            o1 o1VarD = o0S.D(true);
            ((C2236g0) o0S.f12783a).q().s(new byte[0], 3);
            o0S.r(new R0(o0S, o1VarD, 0));
            this.f12883o = false;
            U uF = f();
            uF.h();
            String string = uF.s().getString("previous_os_version", null);
            ((C2236g0) uF.f12783a).o().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = uF.s().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c2236g0.o().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            O("auto", "_ou", bundle);
        }
    }

    public final void I() {
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!(c2236g0.f12675a.getApplicationContext() instanceof Application) || this.f12873c == null) {
            return;
        }
        ((Application) c2236g0.f12675a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f12873c);
    }

    public final void J() {
        C2010c4.a();
        if (((C2236g0) this.f12783a).g.t(null, AbstractC2268x.f12893D0)) {
            if (m().v()) {
                j().f12472f.g("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C.b()) {
                j().f12472f.g("Cannot get trigger URIs from main thread");
                return;
            }
            o();
            j().f12479n.g("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C2226b0 c2226b0M = m();
            RunnableC2269x0 runnableC2269x0 = new RunnableC2269x0();
            runnableC2269x0.q = this;
            runnableC2269x0.p = atomicReference;
            c2226b0M.o(atomicReference, 5000L, "get trigger URIs", runnableC2269x0);
            List list = (List) atomicReference.get();
            if (list == null) {
                j().f12472f.g("Timed out waiting for get trigger URIs");
                return;
            }
            C2226b0 c2226b0M2 = m();
            Gp gp = new Gp();
            gp.q = this;
            gp.p = list;
            c2226b0M2.t(gp);
        }
    }

    public final void K() {
        String string;
        int i5;
        int i6;
        int i7;
        String string2;
        int i8;
        int i9;
        int i10;
        Bundle bundle;
        int i11;
        Bundle bundle2;
        h();
        j().f12478m.g("Handle tcf update.");
        SharedPreferences sharedPreferencesR = f().r();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        Boolean boolS = c2236g0.g.s(" google_analytics_tcf_data_enabled");
        boolean zBooleanValue = boolS == null ? true : boolS.booleanValue();
        HashMap map = new HashMap();
        map.put("TcfDataEnabled", zBooleanValue ? "1" : "0");
        try {
            string = sharedPreferencesR.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i5 = sharedPreferencesR.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i5 = -1;
        }
        if (i5 != -1) {
            map.put("gdprApplies", String.valueOf(i5));
        }
        try {
            i6 = sharedPreferencesR.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i6 = -1;
        }
        if (i6 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i6));
        }
        try {
            i7 = sharedPreferencesR.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i7 = -1;
        }
        if (i7 != -1) {
            map.put("PolicyVersion", String.valueOf(i7));
        }
        try {
            string2 = sharedPreferencesR.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i8 = sharedPreferencesR.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i8 = -1;
        }
        if (i8 != -1) {
            map.put("CmpSdkID", String.valueOf(i8));
        }
        c1 c1Var = new c1(map);
        U uF = f();
        uF.h();
        String string3 = uF.s().getString("stored_tcf_param", "");
        String strA = c1Var.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = uF.s().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = c1Var.f12620a;
        if ("1".equals(map2.get("TcfDataEnabled")) && "1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = c1Var.b();
            if (iB < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    Bundle bundle3 = new Bundle();
                    if (str.length() > 0) {
                        bundle3.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str.length() > 3) {
                        i10 = 2;
                        bundle3.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                    } else {
                        i10 = 2;
                    }
                    if (str.length() <= 6 || iB < 4) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        bundle3.putString("ad_user_data", (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
                    }
                    bundle = bundle3;
                }
            }
            bundle = bundle2;
            i9 = 0;
            i10 = 2;
        } else {
            i9 = 0;
            i10 = 2;
            bundle = Bundle.EMPTY;
        }
        if (bundle != Bundle.EMPTY) {
            c2236g0.f12686n.getClass();
            t(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle4 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            String str2 = (String) map2.get("CmpSdkID");
            i11 = !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : -1;
        } catch (NumberFormatException unused7) {
        }
        if (i11 < 0 || i11 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i11 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
        }
        int iB2 = c1Var.b();
        if (iB2 < 0 || iB2 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        if (!"1".equals(map2.get("gdprApplies"))) {
            i10 = i9;
        }
        if ("1".equals(map2.get("TcfDataEnabled"))) {
            i10 |= 4;
        }
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i10 |= 8;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        bundle4.putString("_tcfd", sb.toString());
        O("auto", "_tcf", bundle4);
    }

    public final void L() {
        d1 d1Var;
        h();
        if (M().isEmpty() || this.f12877i || (d1Var = (d1) M().poll()) == null) {
            return;
        }
        n1 n1VarG = g();
        if (n1VarG.f12776f == null) {
            n1VarG.f12776f = d.b(((C2236g0) n1VarG.f12783a).f12675a);
        }
        d dVar = n1VarG.f12776f;
        if (dVar == null) {
            return;
        }
        this.f12877i = true;
        C0782Oa c0782Oa = j().f12479n;
        String str = d1Var.f12624o;
        c0782Oa.f(str, "Registering trigger URI");
        b bVarE = dVar.e(Uri.parse(str));
        if (bVarE == null) {
            this.f12877i = false;
            M().add(d1Var);
            return;
        }
        SparseArray sparseArrayT = f().t();
        sparseArrayT.put(d1Var.q, Long.valueOf(d1Var.p));
        U uF = f();
        int[] iArr = new int[sparseArrayT.size()];
        long[] jArr = new long[sparseArrayT.size()];
        for (int i5 = 0; i5 < sparseArrayT.size(); i5++) {
            iArr[i5] = sparseArrayT.keyAt(i5);
            jArr[i5] = ((Long) sparseArrayT.valueAt(i5)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        uF.f12553o.k(bundle);
        bVarE.a(new a(0, bVarE, new ZF(this, d1Var)), new n(this, 4));
    }

    public final PriorityQueue M() {
        if (this.f12878j == null) {
            this.f12878j = new PriorityQueue(Comparator.comparing(C2265v0.f12871a, C2271y0.f12981o));
        }
        return this.f12878j;
    }

    public final void N() {
        h();
        String strJ = f().f12552n.j();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (strJ != null) {
            if ("unset".equals(strJ)) {
                c2236g0.f12686n.getClass();
                r(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf("true".equals(strJ) ? 1L : 0L);
                c2236g0.f12686n.getClass();
                r(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c2236g0.g() || !this.f12883o) {
            j().f12478m.g("Updating Scion state (FE)");
            O0 o0S = c2236g0.s();
            o0S.h();
            o0S.o();
            o0S.r(new R0(o0S, o0S.D(true), 1));
            return;
        }
        j().f12478m.g("Recording app launch after enabling measurement for the first time (FE)");
        H();
        E3.p.get();
        if (c2236g0.g.t(null, AbstractC2268x.f12954l0)) {
            n().e.v();
        }
        m().t(new RunnableC2234f0(this));
    }

    public final void O(String str, String str2, Bundle bundle) {
        h();
        ((C2236g0) this.f12783a).f12686n.getClass();
        x(str, str2, System.currentTimeMillis(), bundle);
    }

    @Override // p082t2.B
    public final boolean q() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    public final void r(long j5, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean zS;
        Object objValueOf = obj;
        z.e(str);
        z.e(str2);
        h();
        o();
        if ("allow_personalized_ads".equals(str2)) {
            if (objValueOf instanceof String) {
                String str4 = (String) objValueOf;
                if (!TextUtils.isEmpty(str4)) {
                    long j6 = "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                    objValueOf = Long.valueOf(j6);
                    f().f12552n.k(j6 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    f().f12552n.k("unset");
                } else {
                    obj2 = objValueOf;
                    str3 = str2;
                }
            } else if (objValueOf == null) {
                f().f12552n.k("unset");
            } else {
                obj2 = objValueOf;
                str3 = str2;
            }
            obj2 = objValueOf;
            str3 = "_npa";
        } else {
            obj2 = objValueOf;
            str3 = str2;
        }
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!c2236g0.g()) {
            j().f12479n.g("User property not set since app measurement is disabled");
            return;
        }
        if (c2236g0.h()) {
            k1 k1Var = new k1(j5, obj2, str3, str);
            O0 o0S = c2236g0.s();
            o0S.h();
            o0S.o();
            J jQ = ((C2236g0) o0S.f12783a).q();
            jQ.getClass();
            Parcel parcelObtain = Parcel.obtain();
            k1Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                jQ.j().g.g("User property too long for local database. Sending directly to service");
                zS = false;
            } else {
                zS = jQ.s(bArrMarshall, 1);
            }
            o0S.r(new P0(o0S, o0S.D(true), zS, k1Var, 0));
        }
    }

    public final void s(long j5, boolean z3) {
        h();
        o();
        j().f12478m.g("Resetting analytics data (FE)");
        Z0 z0N = n();
        z0N.h();
        C1731u1 c1731u1 = z0N.f12594f;
        ((b1) c1731u1.q).a();
        c1731u1.f9259o = 0L;
        c1731u1.p = 0L;
        o4.a();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (c2236g0.g.t(null, AbstractC2268x.f12962q0)) {
            c2236g0.p().t();
        }
        boolean zG = c2236g0.g();
        U uF = f();
        uF.g.b(j5);
        if (!TextUtils.isEmpty(uF.f().f12557w.j())) {
            uF.f12557w.k(null);
        }
        E3.p.get();
        C2236g0 c2236g1 = (C2236g0) uF.f12783a;
        C2235g c2235g = c2236g1.g;
        F f5 = AbstractC2268x.f12954l0;
        if (c2235g.t(null, f5)) {
            uF.q.b(0L);
        }
        uF.f12554r.b(0L);
        Boolean boolS = c2236g1.g.s("firebase_analytics_collection_deactivated");
        if (boolS == null || !boolS.booleanValue()) {
            uF.q(!zG);
        }
        uF.f12558x.k(null);
        uF.f12559y.b(0L);
        uF.f12560z.k(null);
        if (z3) {
            O0 o0S = c2236g0.s();
            o0S.h();
            o0S.o();
            o1 o1VarD = o0S.D(false);
            ((C2236g0) o0S.f12783a).q().t();
            o0S.r(new Q0(o0S, o1VarD, 0));
        }
        E3.p.get();
        if (c2236g0.g.t(null, f5)) {
            n().e.v();
        }
        this.f12883o = !zG;
    }

    public final void t(Bundle bundle, int i5, long j5) {
        String string;
        boolean z3 = false;
        o();
        C2259s0 c2259s0 = C2259s0.f12839c;
        EnumC2257r0[] enumC2257r0Arr = EnumC2256q0.STORAGE.f12822o;
        int length = enumC2257r0Arr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                string = null;
                break;
            }
            EnumC2257r0 enumC2257r0 = enumC2257r0Arr[i6];
            if (bundle.containsKey(enumC2257r0.f12829o) && (string = bundle.getString(enumC2257r0.f12829o)) != null && C2259s0.f(string) == null) {
                break;
            } else {
                i6++;
            }
        }
        if (string != null) {
            j().f12476k.f(string, "Ignoring invalid consent setting");
            j().f12476k.g("Valid consent values are 'granted', 'denied'");
        }
        C2259s0 c2259s0B = C2259s0.b(i5, bundle);
        C2072n3.a();
        if (!((C2236g0) this.f12783a).g.t(null, AbstractC2268x.f12905J0)) {
            E(c2259s0B, j5);
            return;
        }
        Iterator it = c2259s0B.f12840a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                E(c2259s0B, j5);
                break;
            }
        }
        C2251o c2251oA = C2251o.a(i5, bundle);
        Iterator it2 = c2251oA.e.values().iterator();
        while (it2.hasNext()) {
            if (((Boolean) it2.next()) != null) {
                m().t(new Gp(16, this, z3, c2251oA));
                break;
            }
        }
        Boolean boolF = bundle != null ? C2259s0.f(bundle.getString("ad_personalization")) : null;
        if (boolF != null) {
            B(i5 == -30 ? "tcf" : "app", "allow_personalized_ads", boolF.toString(), false);
        }
    }

    public final void u(Bundle bundle, long j5) {
        z.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            j().f12474i.g("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC2261t0.a(bundle2, "app_id", String.class, null);
        AbstractC2261t0.a(bundle2, "origin", String.class, null);
        AbstractC2261t0.a(bundle2, "name", String.class, null);
        AbstractC2261t0.a(bundle2, "value", Object.class, null);
        AbstractC2261t0.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC2261t0.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC2261t0.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC2261t0.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC2261t0.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC2261t0.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC2261t0.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC2261t0.a(bundle2, "expired_event_name", String.class, null);
        AbstractC2261t0.a(bundle2, "expired_event_params", Bundle.class, null);
        z.e(bundle2.getString("name"));
        z.e(bundle2.getString("origin"));
        z.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j5);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iC0 = g().c0(string);
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (iC0 != 0) {
            L lJ = j();
            lJ.f12472f.f(c2236g0.f12685m.g(string), "Invalid conditional user property name");
            return;
        }
        if (g().o(obj, string) != 0) {
            L lJ2 = j();
            lJ2.f12472f.h("Invalid conditional user property value", c2236g0.f12685m.g(string), obj);
            return;
        }
        Object objI0 = g().i0(obj, string);
        if (objI0 == null) {
            L lJ3 = j();
            lJ3.f12472f.h("Unable to normalize conditional user property value", c2236g0.f12685m.g(string), obj);
            return;
        }
        AbstractC2261t0.f(bundle2, objI0);
        long j6 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j6 > 15552000000L || j6 < 1)) {
            L lJ4 = j();
            lJ4.f12472f.h("Invalid conditional user property timeout", c2236g0.f12685m.g(string), Long.valueOf(j6));
            return;
        }
        long j7 = bundle2.getLong("time_to_live");
        if (j7 <= 15552000000L && j7 >= 1) {
            m().t(new Gp(14, (Object) this, false, (Object) bundle2));
            return;
        }
        L lJ5 = j();
        lJ5.f12472f.h("Invalid conditional user property time to live", c2236g0.f12685m.g(string), Long.valueOf(j7));
    }

    public final void v(Boolean bool, boolean z3) {
        h();
        o();
        j().f12478m.f(bool, "Setting app measurement enabled (FE)");
        U uF = f();
        uF.h();
        SharedPreferences.Editor editorEdit = uF.s().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z3) {
            U uF2 = f();
            uF2.h();
            SharedPreferences.Editor editorEdit2 = uF2.s().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        C2226b0 c2226b0 = c2236g0.f12682j;
        C2236g0.d(c2226b0);
        c2226b0.h();
        if (c2236g0.f12670D || !(bool == null || bool.booleanValue())) {
            N();
        }
    }

    public final void w(String str) {
        this.g.set(str);
    }

    public final void x(String str, String str2, long j5, Bundle bundle) {
        h();
        y(str, str2, j5, bundle, true, this.f12874d == null || n1.o0(str2), true);
    }

    public final void y(String str, String str2, long j5, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean zB;
        long j6;
        C2236g0 c2236g0;
        int i5;
        boolean zS;
        Bundle[] bundleArr;
        z.e(str);
        z.i(bundle);
        h();
        o();
        C2236g0 c2236g1 = (C2236g0) this.f12783a;
        if (!c2236g1.g()) {
            j().f12478m.g("Event not sent since app measurement is disabled");
            return;
        }
        List list = c2236g1.p().f12446i;
        if (list != null && !list.contains(str2)) {
            j().f12478m.h("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f12875f) {
            this.f12875f = true;
            try {
                boolean z7 = c2236g1.e;
                Context context = c2236g1.f12675a;
                try {
                    (!z7 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    j().f12474i.f(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                j().f12477l.g("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "_cmp".equals(str2);
        C2235g c2235g = c2236g1.g;
        Y1.a aVar = c2236g1.f12686n;
        if (zEquals) {
            if (bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                aVar.getClass();
                r(System.currentTimeMillis(), string, "auto", "_lgclid");
            }
            F3.a();
            if (c2235g.t(0, AbstractC2268x.f12919Q0) && bundle.containsKey("gbraid")) {
                String string2 = bundle.getString("gbraid");
                aVar.getClass();
                r(System.currentTimeMillis(), string2, "auto", "_gbraid");
            }
        } else {
            aVar = aVar;
            c2235g = c2235g;
        }
        if (z3 && !n1.f12773j[0].equals(str2)) {
            g().C(bundle, f().f12560z.h());
        }
        K k3 = c2236g1.f12685m;
        e eVar = this.f12885s;
        if (!z5 && !"_iap".equals(str2)) {
            n1 n1Var = c2236g1.f12684l;
            C2236g0.f(n1Var);
            int i6 = 2;
            if (n1Var.k0("event", str2)) {
                if (!n1Var.Z("event", AbstractC2261t0.f12851a, AbstractC2261t0.f12852b, str2)) {
                    i6 = 13;
                } else if (n1Var.U("event", 40, str2)) {
                    i6 = 0;
                }
            }
            if (i6 != 0) {
                j().f12473h.f(k3.b(str2), "Invalid public event name. Event will not be logged (FE)");
                c2236g1.t();
                String strY = n1.y(str2, 40, true);
                int length = str2 != null ? str2.length() : 0;
                c2236g1.t();
                n1.O(eVar, null, i6, "_ev", strY, length);
                return;
            }
        }
        L0 l0S = l().s(false);
        if (l0S != null && !bundle.containsKey("_sc")) {
            l0S.f12483d = true;
        }
        n1.N(l0S, bundle, z3 && !z5);
        boolean zEquals2 = "am".equals(str);
        boolean zO0 = n1.o0(str2);
        if (z3 && this.f12874d != null && !zO0 && !zEquals2) {
            j().f12478m.h("Passing event to registered event handler (FE)", k3.b(str2), k3.a(bundle));
            z.i(this.f12874d);
            C2117x c2117x = this.f12874d;
            c2117x.getClass();
            try {
                C1994a0 c1994a0 = (C1994a0) ((Y) c2117x.p);
                Parcel parcelB0 = c1994a0.b0();
                parcelB0.writeString(str);
                parcelB0.writeString(str2);
                I.c(parcelB0, bundle);
                parcelB0.writeLong(j5);
                c1994a0.P2(parcelB0, 1);
                return;
            } catch (RemoteException e3) {
                C2236g0 c2236g2 = ((AppMeasurementDynamiteService) c2117x.q).f10828o;
                if (c2236g2 != null) {
                    L l5 = c2236g2.f12681i;
                    C2236g0.d(l5);
                    l5.f12474i.f(e3, "Event interceptor threw exception");
                    return;
                }
                return;
            }
        }
        if (c2236g1.h()) {
            int iP = g().p(str2);
            if (iP != 0) {
                j().f12473h.f(k3.b(str2), "Invalid event name. Event will not be logged (FE)");
                g();
                String strY2 = n1.y(str2, 40, true);
                int length2 = str2 != null ? str2.length() : 0;
                c2236g1.t();
                n1.O(eVar, null, iP, "_ev", strY2, length2);
                return;
            }
            String str3 = "_o";
            Bundle bundleV = g().v(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z5);
            z.i(bundleV);
            if (l().s(false) == null || !"_ae".equals(str2)) {
                z6 = zEquals2;
            } else {
                C1731u1 c1731u1 = n().f12594f;
                ((C2236g0) ((Z0) c1731u1.f9260r).f12783a).f12686n.getClass();
                z6 = zEquals2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = jElapsedRealtime - c1731u1.p;
                c1731u1.p = jElapsedRealtime;
                if (j7 > 0) {
                    g().B(bundleV, j7);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                n1 n1VarG = g();
                String string3 = bundleV.getString("_ffr");
                int i7 = c.f1857a;
                if (string3 == null || string3.trim().isEmpty()) {
                    string3 = null;
                } else if (string3 != null) {
                    string3 = string3.trim();
                }
                if (Objects.equals(string3, n1VarG.f().f12557w.j())) {
                    n1VarG.j().f12478m.g("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                n1VarG.f().f12557w.k(string3);
            } else if ("_ae".equals(str2)) {
                String strJ = g().f().f12557w.j();
                if (!TextUtils.isEmpty(strJ)) {
                    bundleV.putString("_ffr", strJ);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleV);
            if (c2235g.t(null, AbstractC2268x.f12901H0)) {
                Z0 z0N = n();
                z0N.h();
                zB = z0N.f12593d;
            } else {
                zB = f().t.b();
            }
            if (f().q.a() > 0 && f().p(j5) && zB) {
                j().f12479n.g("Current session is expired, remove the session number, ID, and engagement time");
                aVar.getClass();
                j6 = 0;
                r(System.currentTimeMillis(), null, "auto", "_sid");
                aVar.getClass();
                r(System.currentTimeMillis(), null, "auto", "_sno");
                aVar.getClass();
                r(System.currentTimeMillis(), null, "auto", "_se");
                f().f12554r.b(0L);
            } else {
                j6 = 0;
            }
            if (bundleV.getLong("extend_session", j6) == 1) {
                j().f12479n.g("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c2236g0 = c2236g1;
                Z0 z8 = c2236g0.f12683k;
                C2236g0.c(z8);
                i5 = 1;
                z8.e.w(j5, true);
            } else {
                c2236g0 = c2236g1;
                i5 = 1;
            }
            ArrayList arrayList2 = new ArrayList(bundleV.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8 += i5;
                String str4 = (String) obj;
                if (str4 != null) {
                    g();
                    Object obj2 = bundleV.get(str4);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleV.putParcelableArray(str4, bundleArr);
                    }
                }
                i5 = 1;
            }
            int i9 = 0;
            while (i9 < arrayList.size()) {
                Bundle bundleU = (Bundle) arrayList.get(i9);
                String str5 = i9 != 0 ? "_ep" : str2;
                String str6 = str3;
                bundleU.putString(str6, str);
                if (z4) {
                    bundleU = g().u(bundleU);
                }
                Bundle bundle2 = bundleU;
                ArrayList arrayList4 = arrayList;
                C2264v c2264v = new C2264v(str5, new r(bundle2), str, j5);
                O0 o0S = c2236g0.s();
                o0S.getClass();
                o0S.h();
                o0S.o();
                J jQ = ((C2236g0) o0S.f12783a).q();
                jQ.getClass();
                Parcel parcelObtain = Parcel.obtain();
                c2264v.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    jQ.j().g.g("Event is too long for local database. Sending event directly to service");
                    zS = false;
                } else {
                    zS = jQ.s(bArrMarshall, 0);
                }
                o0S.r(new P0(o0S, o0S.D(true), zS, c2264v, 2));
                if (!z6) {
                    for (C2223a c2223a : this.e) {
                        Bundle bundle3 = new Bundle(bundle2);
                        c2223a.getClass();
                        try {
                            C1994a0 c1994a1 = (C1994a0) c2223a.f12595a;
                            Parcel parcelB1 = c1994a1.b0();
                            parcelB1.writeString(str);
                            parcelB1.writeString(str2);
                            I.c(parcelB1, bundle3);
                            parcelB1.writeLong(j5);
                            c1994a1.P2(parcelB1, 1);
                        } catch (RemoteException e5) {
                            C2236g0 c2236g3 = c2223a.f12596b.f10828o;
                            if (c2236g3 != null) {
                                L l6 = c2236g3.f12681i;
                                C2236g0.d(l6);
                                l6.f12474i.f(e5, "Event listener threw exception");
                            }
                        }
                    }
                }
                i9++;
                arrayList = arrayList4;
                str3 = str6;
            }
            if (l().s(false) == null || !"_ae".equals(str2)) {
                return;
            }
            Z0 z0N2 = n();
            aVar.getClass();
            z0N2.f12594f.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void z(String str, String str2, Bundle bundle) {
        ((C2236g0) this.f12783a).f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        z.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m().t(new RunnableC2273z0(this, bundle2));
    }
}
