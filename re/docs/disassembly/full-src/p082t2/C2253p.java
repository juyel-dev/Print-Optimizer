package p082t2;

import T1.z;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: t2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2253p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12814d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f12815f;

    public C2253p(C2236g0 c2236g0, String str, String str2, String str3, long j5, Bundle bundle) {
        r rVar;
        z.e(str2);
        z.e(str3);
        this.f12811a = str2;
        this.f12812b = str3;
        this.f12813c = TextUtils.isEmpty(str) ? null : str;
        this.f12814d = j5;
        this.e = 0L;
        if (bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    L l5 = c2236g0.f12681i;
                    C2236g0.d(l5);
                    l5.f12472f.g("Param name can't be null");
                    it.remove();
                } else {
                    n1 n1Var = c2236g0.f12684l;
                    C2236g0.f(n1Var);
                    Object objD0 = n1Var.d0(bundle2.get(next), next);
                    if (objD0 == null) {
                        L l6 = c2236g0.f12681i;
                        C2236g0.d(l6);
                        l6.f12474i.f(c2236g0.f12685m.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        n1 n1Var2 = c2236g0.f12684l;
                        C2236g0.f(n1Var2);
                        n1Var2.D(bundle2, next, objD0);
                    }
                }
            }
            rVar = new r(bundle2);
        }
        this.f12815f = rVar;
    }

    public final C2253p a(C2236g0 c2236g0, long j5) {
        return new C2253p(c2236g0, this.f12813c, this.f12811a, this.f12812b, this.f12814d, j5, this.f12815f);
    }

    public final String toString() {
        return "Event{appId='" + this.f12811a + "', name='" + this.f12812b + "', params=" + String.valueOf(this.f12815f) + "}";
    }

    public C2253p(C2236g0 c2236g0, String str, String str2, String str3, long j5, long j6, r rVar) {
        z.e(str2);
        z.e(str3);
        z.i(rVar);
        this.f12811a = str2;
        this.f12812b = str3;
        this.f12813c = TextUtils.isEmpty(str) ? null : str;
        this.f12814d = j5;
        this.e = j6;
        if (j6 != 0 && j6 > j5) {
            L l5 = c2236g0.f12681i;
            C2236g0.d(l5);
            l5.f12474i.h("Event created with reverse previous/current timestamps. appId, name", L.q(str2), L.q(str3));
        }
        this.f12815f = rVar;
    }
}
