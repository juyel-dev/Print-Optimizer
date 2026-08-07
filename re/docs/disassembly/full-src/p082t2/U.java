package p082t2;

import P0.c;
import T1.z;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.C1003da;
import com.google.android.gms.internal.ads.C1006dd;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends AbstractC2250n0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pair f12542A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12544d;
    public SharedPreferences e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1003da f12545f;
    public final W g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f12546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final W f12550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V f12551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f12552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1006dd f12553o;
    public final V p;
    public final W q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W f12554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12555s;
    public final V t;
    public final V u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final W f12556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f12557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f12558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final W f12559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1006dd f12560z;

    public U(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12544d = new Object();
        this.f12550l = new W(this, "session_timeout", 1800000L);
        this.f12551m = new V(this, "start_new_session", true);
        this.q = new W(this, "last_pause_time", 0L);
        this.f12554r = new W(this, "session_id", 0L);
        this.f12552n = new c(this, "non_personalized_ads");
        this.f12553o = new C1006dd(this, "last_received_uri_timestamps_by_source");
        this.p = new V(this, "allow_remote_dynamite", false);
        this.g = new W(this, "first_open_time", 0L);
        z.e("app_install_time");
        this.f12546h = new c(this, "app_instance_id");
        this.t = new V(this, "app_backgrounded", false);
        this.u = new V(this, "deep_link_retrieval_complete", false);
        this.f12556v = new W(this, "deep_link_retrieval_attempts", 0L);
        this.f12557w = new c(this, "firebase_feature_rollouts");
        this.f12558x = new c(this, "deferred_attribution_cache");
        this.f12559y = new W(this, "deferred_attribution_cache_timestamp", 0L);
        this.f12560z = new C1006dd(this, "default_event_parameters");
    }

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        return true;
    }

    public final boolean o(int i5) {
        int i6 = s().getInt("consent_source", 100);
        C2259s0 c2259s0 = C2259s0.f12839c;
        return i5 <= i6;
    }

    public final boolean p(long j5) {
        return j5 - this.f12550l.a() > this.q.a();
    }

    public final void q(boolean z3) {
        h();
        L lJ = j();
        lJ.f12479n.f(Boolean.valueOf(z3), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z3);
        editorEdit.apply();
    }

    public final SharedPreferences r() {
        h();
        k();
        if (this.e == null) {
            synchronized (this.f12544d) {
                try {
                    if (this.e == null) {
                        this.e = ((C2236g0) this.f12783a).f12675a.getSharedPreferences(((C2236g0) this.f12783a).f12675a.getPackageName() + "_preferences", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public final SharedPreferences s() {
        h();
        k();
        z.i(this.f12543c);
        return this.f12543c;
    }

    public final SparseArray t() {
        Bundle bundleH = this.f12553o.h();
        if (bundleH == null) {
            return new SparseArray();
        }
        int[] intArray = bundleH.getIntArray("uriSources");
        long[] longArray = bundleH.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            j().f12472f.g("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i5 = 0; i5 < intArray.length; i5++) {
            sparseArray.put(intArray[i5], Long.valueOf(longArray[i5]));
        }
        return sparseArray;
    }

    public final C2259s0 u() {
        h();
        return C2259s0.c(s().getInt("consent_source", 100), s().getString("consent_settings", "G1"));
    }
}
