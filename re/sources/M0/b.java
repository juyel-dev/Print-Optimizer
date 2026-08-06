package M0;

import C3.D;
import W3.q;
import a4.AbstractC0211j;
import a4.F;
import a4.T;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.C0898b;
import com.notescrafter.MainActivity;
import g4.m;
import g4.n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.o;
import o4.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p027g1.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f655o;
    public Object p;
    public Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f657s;

    public b(MainActivity mainActivity, String str) {
        Boolean bool = Boolean.FALSE;
        T tB = AbstractC0211j.b(bool);
        this.p = tB;
        this.q = new F(tB);
        T tB2 = AbstractC0211j.b(bool);
        this.f656r = tB2;
        this.f657s = new F(tB2);
        Log.d("AdMobManager", "Ads are disabled — skipping MobileAds SDK initialization");
    }

    public static b f(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        b bVar = new b();
        bVar.f656r = new ArrayDeque();
        bVar.f655o = sharedPreferences;
        bVar.p = "topic_operation_queue";
        bVar.q = ",";
        bVar.f657s = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) bVar.f656r)) {
            try {
                ((ArrayDeque) bVar.f656r).clear();
                String string = ((SharedPreferences) bVar.f655o).getString((String) bVar.p, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) bVar.q)) {
                    String[] strArrSplit = string.split((String) bVar.q, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bVar.f656r).add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public void a(Q0.f fVar, Class cls) {
        ((ArrayList) this.f656r).add(new B3.h(fVar, cls));
    }

    public void b(T0.a aVar, Class cls) {
        ((ArrayList) this.p).add(new B3.h(aVar, cls));
    }

    public void c(String str, String value) {
        o.f(value, "value");
        p042j3.c cVar = (p042j3.c) this.q;
        cVar.getClass();
        l.b(str);
        l.c(value, str);
        cVar.m(str, value);
    }

    public p020e1.h d() {
        Map mapUnmodifiableMap;
        n nVar = (n) this.f655o;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.p;
        m mVarP = ((p042j3.c) this.q).p();
        p013c2.g gVar = (p013c2.g) this.f656r;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f657s;
        byte[] bArr = h4.b.f11523a;
        o.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = D.f168o;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            o.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new p020e1.h(nVar, str, mVarP, gVar, mapUnmodifiableMap);
    }

    public void e(g4.c cacheControl) {
        o.f(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            ((p042j3.c) this.q).t("Cache-Control");
        } else {
            h("Cache-Control", string);
        }
    }

    public void g() {
        i("GET", null);
    }

    @Override // A3.a
    public Object get() {
        return new p040j1.a((Executor) ((A3.a) this.f655o).get(), (f1.f) ((A3.a) this.p).get(), (p045k1.d) ((p036i2.e) this.q).get(), (p049l1.d) ((A3.a) this.f656r).get(), (p054m1.c) ((A3.a) this.f657s).get());
    }

    public void h(String str, String value) {
        o.f(value, "value");
        p042j3.c cVar = (p042j3.c) this.q;
        cVar.getClass();
        l.b(str);
        l.c(value, str);
        cVar.t(str);
        cVar.m(str, value);
    }

    public void i(String method, p013c2.g gVar) {
        o.f(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (gVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.modifiers.a.z("method ", method, " must have a request body.").toString());
            }
        } else if (!l.q(method)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.modifiers.a.z("method ", method, " must not have a request body.").toString());
        }
        this.p = method;
        this.f656r = gVar;
    }

    public void j() {
        this.f655o = null;
        Boolean bool = Boolean.FALSE;
        T t = (T) this.p;
        t.getClass();
        t.j(null, bool);
        T t5 = (T) this.f656r;
        t5.getClass();
        t5.j(null, bool);
        Log.d("AdMobManager", "Premium mode enabled — ads disabled");
    }

    public void k(String url) {
        o.f(url, "url");
        if (q.Y(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            o.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (q.Y(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            o.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        o.f(url, "<this>");
        C0898b c0898b = new C0898b();
        c0898b.c(null, url);
        this.f655o = c0898b.a();
    }

    public b() {
        this.f657s = new LinkedHashMap();
        this.p = "GET";
        this.q = new p042j3.c(12);
    }
}
