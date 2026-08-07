package p082t2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2072n3;

/* JADX INFO: renamed from: t2.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2234f0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12661o;
    public /* synthetic */ C2267w0 p;

    public /* synthetic */ RunnableC2234f0(int i5) {
        this.f12661o = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12661o) {
            case 0:
                this.p.J();
                break;
            case 1:
                C2267w0 c2267w0 = this.p;
                c2267w0.h();
                if (c2267w0.f().u.b()) {
                    c2267w0.j().f12478m.g("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    long jA = c2267w0.f().f12556v.a();
                    c2267w0.f().f12556v.b(1 + jA);
                    if (jA >= 5) {
                        c2267w0.j().f12474i.g("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c2267w0.f().u.a(true);
                    } else {
                        C2072n3.a();
                        C2236g0 c2236g0 = (C2236g0) c2267w0.f12783a;
                        if (c2236g0.g.t(null, AbstractC2268x.f12909L0)) {
                            if (c2267w0.p == null) {
                                c2267w0.p = new B0(c2267w0, c2236g0, 1);
                            }
                            c2267w0.p.b(0L);
                        } else {
                            c2236g0.k();
                        }
                    }
                }
                break;
            case 2:
                X x4 = this.p.f12882n;
                C2236g0 c2236g1 = x4.f12578a;
                C2226b0 c2226b0 = c2236g1.f12682j;
                C2236g0.d(c2226b0);
                c2226b0.h();
                if (x4.c()) {
                    boolean zD = x4.d();
                    C2267w0 c2267w1 = c2236g1.p;
                    U u = c2236g1.f12680h;
                    if (zD) {
                        C2236g0.f(u);
                        u.f12558x.k(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C2236g0.c(c2267w1);
                        c2267w1.O("auto", "_cmpx", bundle);
                    } else {
                        C2236g0.f(u);
                        String strJ = u.f12558x.j();
                        if (TextUtils.isEmpty(strJ)) {
                            L l5 = c2236g1.f12681i;
                            C2236g0.d(l5);
                            l5.g.g("Cache still valid but referrer not found");
                        } else {
                            C2236g0.f(u);
                            long jA2 = ((u.f12559y.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strJ);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C2236g0.c(c2267w1);
                            c2267w1.O(str2, "_cmp", (Bundle) pair.second);
                        }
                        C2236g0.f(u);
                        u.f12558x.k(null);
                    }
                    C2236g0.f(u);
                    u.f12559y.b(0L);
                    break;
                }
                break;
            default:
                this.p.J();
                break;
        }
    }

    public RunnableC2234f0(C2267w0 c2267w0) {
        this.f12661o = 2;
        this.p = c2267w0;
    }
}
