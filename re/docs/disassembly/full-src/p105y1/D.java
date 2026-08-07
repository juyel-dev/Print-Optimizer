package p105y1;

import J2.b;
import L0.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C1838wd;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.O7;
import com.google.android.gms.internal.ads.P5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15878b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f15880d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f15881f;
    public SharedPreferences.Editor g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15884j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15877a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15879c = new ArrayList();
    public P5 e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15882h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15885k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15886l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f15887m = "-1";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15888n = "-1";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15889o = -1;
    public C1838wd p = new C1838wd("", 0);
    public long q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15890r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15891s = -1;
    public int t = 0;
    public Set u = Collections.emptySet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public JSONObject f15892v = new JSONObject();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15893w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15894x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f15895y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f15896z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f15872A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f15873B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15874C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15875D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f15876E = 0;

    public final void a(String str) {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.i8)).booleanValue()) {
            m();
            synchronized (this.f15877a) {
                try {
                    if (this.f15873B.equals(str)) {
                        return;
                    }
                    this.f15873B = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(boolean z3) {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.i8)).booleanValue()) {
            m();
            synchronized (this.f15877a) {
                try {
                    if (this.f15872A == z3) {
                        return;
                    }
                    this.f15872A = z3;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z3);
                        this.g.apply();
                    }
                    n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(String str) {
        m();
        synchronized (this.f15877a) {
            try {
                if (TextUtils.equals(this.f15895y, str)) {
                    return;
                }
                this.f15895y = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j5) {
        m();
        synchronized (this.f15877a) {
            try {
                if (this.f15890r == j5) {
                    return;
                }
                this.f15890r = j5;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j5);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z3) {
        m();
        synchronized (this.f15877a) {
            try {
                if (z3 == this.f15885k) {
                    return;
                }
                this.f15885k = z3;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z3);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(boolean z3) {
        m();
        synchronized (this.f15877a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) C2366q.f13480d.f13483c.a(AbstractC1869x7.b9)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z3);
                    this.g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, String str2, boolean z3) {
        m();
        synchronized (this.f15877a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f15892v.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z3 || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i5;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z3);
                    k.f13311A.f13319j.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f15892v.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    AbstractC1223ib.t("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f15892v.toString());
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i5) {
        m();
        synchronized (this.f15877a) {
            try {
                if (this.f15875D == i5) {
                    return;
                }
                this.f15875D = i5;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i5);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(long j5) {
        m();
        synchronized (this.f15877a) {
            try {
                if (this.f15876E == j5) {
                    return;
                }
                this.f15876E = j5;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j5);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j() {
        boolean z3;
        m();
        synchronized (this.f15877a) {
            z3 = this.f15893w;
        }
        return z3;
    }

    public final boolean k() {
        boolean z3;
        m();
        synchronized (this.f15877a) {
            z3 = this.f15894x;
        }
        return z3;
    }

    public final boolean l() {
        boolean z3;
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9869n0)).booleanValue()) {
            return false;
        }
        m();
        synchronized (this.f15877a) {
            z3 = this.f15885k;
        }
        return z3;
    }

    public final void m() {
        b bVar = this.f15880d;
        if (bVar == null || bVar.isDone()) {
            return;
        }
        try {
            this.f15880d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AbstractC1223ib.t("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e3) {
            e = e3;
            AbstractC1223ib.q("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e5) {
            e = e5;
            AbstractC1223ib.q("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e6) {
            e = e6;
            AbstractC1223ib.q("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void n() {
        AbstractC0803Rd.f5534a.execute(new a(this, 23));
    }

    public final P5 o() {
        if (!this.f15878b) {
            return null;
        }
        if ((j() && k()) || !((Boolean) O7.f5173b.p()).booleanValue()) {
            return null;
        }
        synchronized (this.f15877a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.e == null) {
                    this.e = new P5();
                }
                P5 p5 = this.e;
                synchronized (p5.q) {
                    try {
                        if (p5.f5314o) {
                            AbstractC1223ib.m("Content hash thread already started, quitting...");
                        } else {
                            p5.f5314o = true;
                            p5.start();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                AbstractC1223ib.r("start fetching content...");
                return this.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C1838wd p() {
        C1838wd c1838wd;
        m();
        synchronized (this.f15877a) {
            try {
                if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.ha)).booleanValue() && this.p.a()) {
                    Iterator it = this.f15879c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c1838wd = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1838wd;
    }

    public final String q() {
        String str;
        m();
        synchronized (this.f15877a) {
            str = this.f15883i;
        }
        return str;
    }

    public final String r() {
        String str;
        m();
        synchronized (this.f15877a) {
            str = this.f15884j;
        }
        return str;
    }

    public final String s() {
        String str;
        m();
        synchronized (this.f15877a) {
            str = this.f15895y;
        }
        return str;
    }

    public final void t(Context context) {
        synchronized (this.f15877a) {
            try {
                if (this.f15881f != null) {
                    return;
                }
                this.f15880d = AbstractC0803Rd.f5534a.c(new Gp(25, this, context));
                this.f15878b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(String str) {
        m();
        synchronized (this.f15877a) {
            try {
                if (str.equals(this.f15884j)) {
                    return;
                }
                this.f15884j = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.g.apply();
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
