package p020e1;

import C3.I;
import C3.v;
import I.d;
import N.b;
import P1.k;
import P1.l;
import W.P;
import Y2.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.text.modifiers.a;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.C1846wl;
import g4.c;
import g4.m;
import g4.n;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import n4.i;
import p013c2.g;
import p090v1.u0;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11068d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11069f;
    public Object g;

    public /* synthetic */ h() {
        this.f11065a = 0;
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public i b() {
        String strL = ((String) this.f11066b) == null ? " transportName" : "";
        if (((l) this.f11068d) == null) {
            strL = strL.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            strL = a.l(strL, " eventMillis");
        }
        if (((Long) this.f11069f) == null) {
            strL = a.l(strL, " uptimeMillis");
        }
        if (((HashMap) this.g) == null) {
            strL = a.l(strL, " autoMetadata");
        }
        if (strL.isEmpty()) {
            return new i((String) this.f11066b, (Integer) this.f11067c, (l) this.f11068d, ((Long) this.e).longValue(), ((Long) this.f11069f).longValue(), (HashMap) this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public c c() {
        c cVar = (c) this.g;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f11266n;
        c cVarU = p000a.a.u((m) this.f11068d);
        this.g = cVarU;
        return cVarU;
    }

    public o d(o oVar) {
        return oVar.i(new d(0), new b(this, 10));
    }

    public M0.b e() {
        M0.b bVar = new M0.b();
        bVar.f657s = new LinkedHashMap();
        bVar.f655o = (n) this.f11067c;
        bVar.p = (String) this.f11066b;
        bVar.f656r = (g) this.e;
        Map map = (Map) this.f11069f;
        bVar.f657s = map.isEmpty() ? new LinkedHashMap() : I.S(map);
        bVar.q = ((m) this.f11068d).k();
        return bVar;
    }

    public void f(String str, String str2, Bundle bundle) {
        int i5;
        String str3;
        String strEncodeToString;
        boolean zG;
        int i6;
        PackageInfo packageInfoK;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        K2.g gVar = (K2.g) this.f11066b;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f609c.f619b);
        C1846wl c1846wl = (C1846wl) this.f11067c;
        synchronized (c1846wl) {
            try {
                if (c1846wl.f9607o == 0 && (packageInfoK = c1846wl.k("com.google.android.gms")) != null) {
                    c1846wl.f9607o = packageInfoK.versionCode;
                }
                i5 = c1846wl.f9607o;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i5));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C1846wl) this.f11067c).f());
        C1846wl c1846wl2 = (C1846wl) this.f11067c;
        synchronized (c1846wl2) {
            try {
                if (((String) c1846wl2.f9608r) == null) {
                    c1846wl2.m();
                }
                str3 = (String) c1846wl2.f9608r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        K2.g gVar2 = (K2.g) this.f11066b;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f608b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((p009b3.a) p000a.a.b(((p009b3.c) ((p009b3.d) this.g)).d())).f2410a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e3) {
            e = e3;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) p000a.a.b(((p009b3.c) ((p009b3.d) this.g)).c()));
        bundle.putString("cliv", "fcm-23.4.1");
        f fVar = (f) ((p004a3.a) this.f11069f).get();
        p042j3.b bVar = (p042j3.b) ((p004a3.a) this.e).get();
        if (fVar == null || bVar == null) {
            return;
        }
        Y2.c cVar = (Y2.c) fVar;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Y2.g gVar3 = (Y2.g) cVar.f1865a.get();
            synchronized (gVar3) {
                zG = gVar3.g(jCurrentTimeMillis);
            }
            if (zG) {
                synchronized (gVar3) {
                    String strD = gVar3.d(System.currentTimeMillis());
                    gVar3.f1870a.edit().putString("last-used-date", strD).commit();
                    gVar3.f(strD);
                }
                i6 = 3;
            } else {
                i6 = 1;
            }
        }
        if (i6 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(P.b(i6)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public o g(String str, String str2, Bundle bundle) {
        int i5;
        try {
            f(str, str2, bundle);
            P1.a aVar = (P1.a) this.f11068d;
            P1.m mVar = aVar.f859c;
            int iA = mVar.a();
            P1.n nVar = P1.n.f885o;
            if (iA < 12000000) {
                return mVar.b() != 0 ? aVar.a(bundle).j(nVar, new u0(3, aVar, bundle)) : p000a.a.n(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            l lVarB = l.b(aVar.f858b);
            synchronized (lVarB) {
                i5 = lVarB.f879b;
                lVarB.f879b = i5 + 1;
            }
            return lVarB.e(new k(i5, 1, bundle, 1)).i(nVar, P1.b.f862o);
        } catch (InterruptedException | ExecutionException e) {
            return p000a.a.n(e);
        }
    }

    public String toString() {
        switch (this.f11065a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f11066b);
                sb.append(", url=");
                sb.append((n) this.f11067c);
                m mVar = (m) this.f11068d;
                if (mVar.size() != 0) {
                    sb.append(", headers=[");
                    int i5 = 0;
                    for (Object obj : mVar) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            v.X();
                            throw null;
                        }
                        B3.h hVar = (B3.h) obj;
                        String str = (String) hVar.f148o;
                        String str2 = (String) hVar.p;
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i5 = i6;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f11069f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String string = sb.toString();
                kotlin.jvm.internal.o.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public h(Context context, String str) {
        String strConcat;
        this.f11065a = 4;
        this.f11067c = context.getApplicationContext();
        this.f11066b = str;
        this.f11068d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + p003a2.c.a(context).c(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC1223ib.q("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.g = strConcat;
    }

    public h(n url, String method, m mVar, g gVar, Map map) {
        this.f11065a = 1;
        kotlin.jvm.internal.o.f(url, "url");
        kotlin.jvm.internal.o.f(method, "method");
        this.f11067c = url;
        this.f11066b = method;
        this.f11068d = mVar;
        this.e = gVar;
        this.f11069f = map;
    }

    public h(K2.g gVar, C1846wl c1846wl, p004a3.a aVar, p004a3.a aVar2, p009b3.d dVar) {
        this.f11065a = 2;
        gVar.a();
        P1.a aVar3 = new P1.a(gVar.f607a);
        this.f11066b = gVar;
        this.f11067c = c1846wl;
        this.f11068d = aVar3;
        this.e = aVar;
        this.f11069f = aVar2;
        this.g = dVar;
    }

    public h(j4.d taskRunner) {
        this.f11065a = 3;
        kotlin.jvm.internal.o.f(taskRunner, "taskRunner");
        this.f11067c = taskRunner;
        this.g = i.f11982a;
    }
}
