package p082t2;

import T1.z;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.C1731u1;
import com.google.android.gms.internal.ads.Gp;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile L0 f12462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile L0 f12463d;
    public L0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f12464f;
    public Activity g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f12465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile L0 f12466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public L0 f12467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f12469l;

    public K0(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12469l = new Object();
        this.f12464f = new ConcurrentHashMap();
    }

    @Override // p082t2.B
    public final boolean q() {
        return false;
    }

    public final String r(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        return length > c2236g0.g.l(null, false) ? str.substring(0, c2236g0.g.l(null, false)) : str;
    }

    public final L0 s(boolean z3) {
        o();
        h();
        if (!z3) {
            return this.e;
        }
        L0 l5 = this.e;
        return l5 != null ? l5 : this.f12467j;
    }

    public final void t(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C2236g0) this.f12783a).g.w() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f12464f.put(activity, new L0(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void u(Activity activity, L0 l5, boolean z3) {
        L0 l6;
        L0 l7 = this.f12462c == null ? this.f12463d : this.f12462c;
        if (l5.f12481b == null) {
            l6 = new L0(l5.f12480a, activity != null ? r(activity.getClass()) : null, l5.f12482c, l5.e, l5.f12484f);
        } else {
            l6 = l5;
        }
        this.f12463d = this.f12462c;
        this.f12462c = l6;
        ((C2236g0) this.f12783a).f12686n.getClass();
        m().t(new G0(this, l6, l7, SystemClock.elapsedRealtime(), z3));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    public final void v(L0 l5, L0 l6, long j5, boolean z3, Bundle bundle) {
        boolean z4;
        long j6;
        h();
        boolean z5 = false;
        if (l6 != null) {
            if (l6.f12482c == l5.f12482c && Objects.equals(l6.f12481b, l5.f12481b) && Objects.equals(l6.f12480a, l5.f12480a)) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = true;
        }
        if (z3 && this.e != null) {
            z5 = true;
        }
        boolean z6 = l5.e;
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (z4) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            n1.N(l5, bundle2, true);
            if (l6 != null) {
                String str = l6.f12480a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = l6.f12481b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", l6.f12482c);
            }
            if (z5) {
                C1731u1 c1731u1 = n().f12594f;
                long j7 = j5 - c1731u1.p;
                c1731u1.p = j5;
                if (j7 > 0) {
                    g().B(bundle2, j7);
                }
            }
            if (!c2236g0.g.w()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = z6 ? "app" : "auto";
            c2236g0.f12686n.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z6) {
                long j8 = l5.f12484f;
                if (j8 != 0) {
                    j6 = j8;
                } else {
                    j6 = jCurrentTimeMillis;
                }
            } else {
                j6 = jCurrentTimeMillis;
            }
            k().x(str3, "_vs", j6, bundle2);
        }
        if (z5) {
            w(this.e, true, j5);
        }
        this.e = l5;
        if (z6) {
            this.f12467j = l5;
        }
        O0 o0S = c2236g0.s();
        o0S.h();
        o0S.o();
        o0S.r(new Gp(17, (Object) o0S, false, (Object) l5));
    }

    public final void w(L0 l5, boolean z3, long j5) {
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        C2258s c2258sN = c2236g0.n();
        c2236g0.f12686n.getClass();
        c2258sN.o(SystemClock.elapsedRealtime());
        if (!n().f12594f.a(j5, l5 != null && l5.f12483d, z3) || l5 == null) {
            return;
        }
        l5.f12483d = false;
    }

    public final L0 x(Activity activity) {
        z.i(activity);
        L0 l5 = (L0) this.f12464f.get(activity);
        if (l5 == null) {
            L0 l6 = new L0(null, r(activity.getClass()), g().t0());
            this.f12464f.put(activity, l6);
            l5 = l6;
        }
        return this.f12466i != null ? this.f12466i : l5;
    }
}
