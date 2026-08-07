package p033h3;

import K2.g;
import M2.a;
import M2.b;
import N.h;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.RunnableC1773v;
import com.google.android.gms.internal.measurement.C2024f0;
import com.google.android.gms.internal.measurement.C2048j0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p082t2.C2236g0;
import p082t2.C2258s;
import p082t2.C2267w0;
import p082t2.K0;
import p082t2.L0;
import p082t2.M0;
import p082t2.RunnableC2270y;
import p082t2.Y0;
import p082t2.Z0;
import p082t2.n1;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11478o;
    public final Object p;

    public k() {
        this.f11478o = 0;
        this.p = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    g gVarB = g.b();
                    gVarB.a();
                    a aVar = (a) gVarB.f610d.a(a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aVar != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        b bVar = (b) aVar;
                        if (!N2.a.f762b.contains("fcm")) {
                            C2024f0 c2024f0 = (C2024f0) bVar.f681a.p;
                            c2024f0.getClass();
                            c2024f0.f(new C2048j0(c2024f0, "fcm", "_ln", string, 3));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        bVar.a("_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            p111z2.b.r("_no", bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f11478o) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent == null || !((Set) this.p).add(intent)) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    new Handler(Looper.getMainLooper()).post(new h(10, this, intent));
                    return;
                } else {
                    a(intent);
                    return;
                }
            default:
                C2267w0 c2267w0 = (C2267w0) this.p;
                try {
                    try {
                        c2267w0.j().f12479n.g("onActivityCreated");
                        Intent intent2 = activity.getIntent();
                        if (intent2 == null) {
                            return;
                        }
                        Uri data = intent2.getData();
                        if (data == null || !data.isHierarchical()) {
                            Bundle extras = intent2.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (TextUtils.isEmpty(string)) {
                                    data = null;
                                } else {
                                    data = Uri.parse(string);
                                }
                            } else {
                                data = null;
                            }
                        }
                        Uri uri = data;
                        if (uri != null && uri.isHierarchical()) {
                            c2267w0.g();
                            c2267w0.m().t(new P1.g(this, bundle == null, uri, n1.R(intent2) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        c2267w0.j().f12472f.f(e, "Throwable caught in onActivityCreated");
                        return;
                    }
                } finally {
                    c2267w0.l().t(activity, bundle);
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f11478o) {
            case 0:
                return;
            default:
                K0 k0L = ((C2267w0) this.p).l();
                synchronized (k0L.f12469l) {
                    try {
                        if (activity == k0L.g) {
                            k0L.g = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (((C2236g0) k0L.f12783a).g.w()) {
                    k0L.f12464f.remove(activity);
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f11478o) {
            case 0:
                if (activity.isFinishing()) {
                    ((Set) this.p).remove(activity.getIntent());
                    return;
                }
                return;
            default:
                K0 k0L = ((C2267w0) this.p).l();
                synchronized (k0L.f12469l) {
                    k0L.f12468k = false;
                    k0L.f12465h = true;
                    break;
                }
                ((C2236g0) k0L.f12783a).f12686n.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (((C2236g0) k0L.f12783a).g.w()) {
                    L0 l0X = k0L.x(activity);
                    k0L.f12463d = k0L.f12462c;
                    k0L.f12462c = null;
                    k0L.m().t(new RunnableC1773v(k0L, l0X, jElapsedRealtime, 4));
                } else {
                    k0L.f12462c = null;
                    k0L.m().t(new RunnableC2270y(k0L, jElapsedRealtime, 1));
                }
                Z0 z0N = ((C2267w0) this.p).n();
                ((C2236g0) z0N.f12783a).f12686n.getClass();
                z0N.m().t(new Y0(z0N, SystemClock.elapsedRealtime(), 1));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f11478o) {
            case 0:
                return;
            default:
                Z0 z0N = ((C2267w0) this.p).n();
                ((C2236g0) z0N.f12783a).f12686n.getClass();
                z0N.m().t(new Y0(z0N, SystemClock.elapsedRealtime(), 0));
                K0 k0L = ((C2267w0) this.p).l();
                synchronized (k0L.f12469l) {
                    k0L.f12468k = true;
                    if (activity != k0L.g) {
                        synchronized (k0L.f12469l) {
                            k0L.g = activity;
                            k0L.f12465h = false;
                            break;
                        }
                        if (((C2236g0) k0L.f12783a).g.w()) {
                            k0L.f12466i = null;
                            k0L.m().t(new M0(k0L, 1));
                        }
                    }
                }
                if (!((C2236g0) k0L.f12783a).g.w()) {
                    k0L.f12462c = k0L.f12466i;
                    k0L.m().t(new M0(k0L, 0));
                    return;
                }
                k0L.u(activity, k0L.x(activity), false);
                C2258s c2258sN = ((C2236g0) k0L.f12783a).n();
                ((C2236g0) c2258sN.f12783a).f12686n.getClass();
                c2258sN.m().t(new RunnableC2270y(c2258sN, SystemClock.elapsedRealtime(), 0));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        L0 l5;
        switch (this.f11478o) {
            case 0:
                break;
            default:
                K0 k0L = ((C2267w0) this.p).l();
                if (((C2236g0) k0L.f12783a).g.w() && bundle != null && (l5 = (L0) k0L.f12464f.get(activity)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", l5.f12482c);
                    bundle2.putString("name", l5.f12480a);
                    bundle2.putString("referrer_name", l5.f12481b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i5 = this.f11478o;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i5 = this.f11478o;
    }

    public k(C2267w0 c2267w0) {
        this.f11478o = 1;
        this.p = c2267w0;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
