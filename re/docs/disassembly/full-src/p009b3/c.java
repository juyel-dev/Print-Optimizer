package p009b3;

import K2.g;
import P2.n;
import Q2.k;
import T1.z;
import W.P;
import Y2.d;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.C0925bj;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.a;
import p014c3.b;
import p101x2.i;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f2414m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p018d3.c f2416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0925bj f2417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f2418d;
    public final n e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2419f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f2420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f2421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f2423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2424l;

    static {
        new AtomicInteger(1);
    }

    public c(g gVar, a aVar, ExecutorService executorService, k kVar) {
        gVar.a();
        p018d3.c cVar = new p018d3.c(gVar.f607a, aVar);
        C0925bj c0925bj = new C0925bj(gVar);
        if (d.q == null) {
            d.q = new d(26);
        }
        d dVar = d.q;
        if (j.f2432d == null) {
            j.f2432d = new j(dVar);
        }
        j jVar = j.f2432d;
        n nVar = new n(new P2.d(gVar, 2));
        h hVar = new h();
        this.g = new Object();
        this.f2423k = new HashSet();
        this.f2424l = new ArrayList();
        this.f2415a = gVar;
        this.f2416b = cVar;
        this.f2417c = c0925bj;
        this.f2418d = jVar;
        this.e = nVar;
        this.f2419f = hVar;
        this.f2420h = executorService;
        this.f2421i = kVar;
    }

    public final void a() {
        b bVarZ;
        synchronized (f2414m) {
            try {
                g gVar = this.f2415a;
                gVar.a();
                C0789Pb c0789PbC = C0789Pb.c(gVar.f607a);
                try {
                    bVarZ = this.f2417c.z();
                    int i5 = bVarZ.f2574b;
                    boolean z3 = true;
                    if (i5 != 2 && i5 != 1) {
                        z3 = false;
                    }
                    if (z3) {
                        String strF = f(bVarZ);
                        C0925bj c0925bj = this.f2417c;
                        p014c3.a aVarA = bVarZ.a();
                        aVarA.f2568a = strF;
                        aVarA.f2569b = 3;
                        bVarZ = aVarA.i();
                        c0925bj.w(bVarZ);
                    }
                    if (c0789PbC != null) {
                        c0789PbC.t();
                    }
                } catch (Throwable th) {
                    if (c0789PbC != null) {
                        c0789PbC.t();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(bVarZ);
        this.f2421i.execute(new b(this, 1));
    }

    public final b b(b bVar) throws e {
        HttpURLConnection httpURLConnectionC;
        p018d3.b bVarF;
        g gVar = this.f2415a;
        gVar.a();
        String str = gVar.f609c.f618a;
        String str2 = bVar.f2573a;
        g gVar2 = this.f2415a;
        gVar2.a();
        String str3 = gVar2.f609c.g;
        String str4 = bVar.f2576d;
        p018d3.c cVar = this.f2416b;
        p018d3.d dVar = cVar.f11034c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = p018d3.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i5 = 0;
        while (true) {
            if (i5 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    p018d3.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = p018d3.c.f(httpURLConnectionC);
                        break;
                    }
                    p018d3.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        W1.a aVarA = p018d3.b.a();
                        aVarA.f1697c = 3;
                        bVarF = aVarA.a();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        W1.a aVarA2 = p018d3.b.a();
                        aVarA2.f1697c = 2;
                        bVarF = aVarA2.a();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i5++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iB = P.b(bVarF.f11030c);
        if (iB == 0) {
            j jVar = this.f2418d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f2433a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            p014c3.a aVarA3 = bVar.a();
            aVarA3.f2570c = bVarF.f11028a;
            aVarA3.f2572f = Long.valueOf(bVarF.f11029b);
            aVarA3.g = Long.valueOf(seconds);
            return aVarA3.i();
        }
        if (iB == 1) {
            p014c3.a aVarA4 = bVar.a();
            aVarA4.e = "BAD CONFIG";
            aVarA4.f2569b = 5;
            return aVarA4.i();
        }
        if (iB != 2) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f2422j = null;
        }
        p014c3.a aVarA5 = bVar.a();
        aVarA5.f2569b = 2;
        return aVarA5.i();
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.f2422j;
        }
        if (str != null) {
            return p000a.a.o(str);
        }
        i iVar = new i();
        g gVar = new g(iVar);
        synchronized (this.g) {
            this.f2424l.add(gVar);
        }
        o oVar = iVar.f13713a;
        this.f2420h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        i iVar = new i();
        f fVar = new f(this.f2418d, iVar);
        synchronized (this.g) {
            this.f2424l.add(fVar);
        }
        this.f2420h.execute(new b(this, 2));
        return iVar.f13713a;
    }

    public final void e() {
        g gVar = this.f2415a;
        gVar.a();
        z.f(gVar.f609c.f619b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z.f(gVar.f609c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        z.f(gVar.f609c.f618a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f609c.f619b;
        Pattern pattern = j.f2431c;
        z.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        z.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f2431c.matcher(gVar.f609c.f618a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:27:0x0058, B:12:0x0031, B:13:0x003a), top: B:34:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:27:0x0058, B:12:0x0031, B:13:0x003a), top: B:34:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(b bVar) {
        p014c3.c cVar;
        String string;
        g gVar = this.f2415a;
        gVar.a();
        if (!gVar.f608b.equals("CHIME_ANDROID_SDK")) {
            g gVar2 = this.f2415a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f608b)) {
                if (bVar.f2574b == 1) {
                    cVar = (p014c3.c) this.e.get();
                    synchronized (cVar.f2579a) {
                        try {
                            synchronized (cVar.f2579a) {
                                string = cVar.f2579a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = cVar.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f2419f.getClass();
                    return h.a();
                }
            }
        } else if (bVar.f2574b == 1) {
            cVar = (p014c3.c) this.e.get();
            synchronized (cVar.f2579a) {
                synchronized (cVar.f2579a) {
                    string = cVar.f2579a.getString("|S|id", null);
                    if (string != null) {
                        string = cVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f2419f.getClass();
                    return h.a();
                }
            }
        }
        this.f2419f.getClass();
        return h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [d3.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d3.a] */
    public final b g(b bVar) throws e {
        String str = bVar.f2573a;
        String string = null;
        if (str != null && str.length() == 11) {
            p014c3.c cVar = (p014c3.c) this.e.get();
            synchronized (cVar.f2579a) {
                try {
                    String[] strArr = p014c3.c.f2578c;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 4) {
                            break;
                        }
                        String str2 = strArr[i5];
                        String string2 = cVar.f2579a.getString("|T|" + cVar.f2580b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p018d3.c cVar2 = this.f2416b;
        g gVar = this.f2415a;
        gVar.a();
        String str3 = gVar.f609c.f618a;
        String str4 = bVar.f2573a;
        g gVar2 = this.f2415a;
        gVar2.a();
        String str5 = gVar2.f609c.g;
        g gVar3 = this.f2415a;
        gVar3.a();
        String str6 = gVar3.f609c.f619b;
        p018d3.d dVar = cVar2.f11034c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = p018d3.c.a("projects/" + str5 + "/installations");
        int i6 = 0;
        p018d3.a aVar = cVar2;
        while (i6 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    p018d3.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        p018d3.a aVarE = p018d3.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            p018d3.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                p018d3.a aVar2 = new p018d3.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i6++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i6++;
                        aVar = aVar;
                    }
                    int iB = P.b(aVar.e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        p014c3.a aVarA = bVar.a();
                        aVarA.e = "BAD CONFIG";
                        aVarA.f2569b = 5;
                        return aVarA.i();
                    }
                    String str7 = aVar.f11025b;
                    String str8 = aVar.f11026c;
                    j jVar = this.f2418d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f2433a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    p018d3.b bVar2 = aVar.f11027d;
                    String str9 = bVar2.f11028a;
                    long j5 = bVar2.f11029b;
                    p014c3.a aVarA2 = bVar.a();
                    aVarA2.f2568a = str7;
                    aVarA2.f2569b = 4;
                    aVarA2.f2570c = str9;
                    aVarA2.f2571d = str8;
                    aVarA2.f2572f = Long.valueOf(j5);
                    aVarA2.g = Long.valueOf(seconds);
                    return aVarA2.i();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f2424l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.f2424l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
