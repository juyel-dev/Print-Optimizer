package p082t2;

import android.os.Bundle;
import java.util.Iterator;
import p047l.C2171b;
import p047l.C2174e;

/* JADX INFO: renamed from: t2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2258s extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2174e f12836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2174e f12837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12838d;

    public C2258s(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12837c = new C2174e(0);
        this.f12836b = new C2174e(0);
    }

    public final void o(long j5) {
        L0 l0S = l().s(false);
        C2174e c2174e = this.f12836b;
        for (String str : (C2171b) c2174e.keySet()) {
            r(str, j5 - ((Long) c2174e.get(str)).longValue(), l0S);
        }
        if (!c2174e.isEmpty()) {
            p(j5 - this.f12838d, l0S);
        }
        s(j5);
    }

    public final void p(long j5, L0 l5) {
        if (l5 == null) {
            j().f12479n.g("Not logging ad exposure. No active activity");
            return;
        }
        if (j5 < 1000) {
            L lJ = j();
            lJ.f12479n.f(Long.valueOf(j5), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j5);
            n1.N(l5, bundle, true);
            k().O("am", "_xa", bundle);
        }
    }

    public final void q(String str, long j5) {
        if (str == null || str.length() == 0) {
            j().f12472f.g("Ad unit id must be a non-empty string");
        } else {
            m().t(new RunnableC2225b(this, str, j5, 0));
        }
    }

    public final void r(String str, long j5, L0 l5) {
        if (l5 == null) {
            j().f12479n.g("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j5 < 1000) {
            L lJ = j();
            lJ.f12479n.f(Long.valueOf(j5), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j5);
            n1.N(l5, bundle, true);
            k().O("am", "_xu", bundle);
        }
    }

    public final void s(long j5) {
        C2174e c2174e = this.f12836b;
        Iterator it = ((C2171b) c2174e.keySet()).iterator();
        while (it.hasNext()) {
            c2174e.put((String) it.next(), Long.valueOf(j5));
        }
        if (c2174e.isEmpty()) {
            return;
        }
        this.f12838d = j5;
    }

    public final void t(String str, long j5) {
        if (str == null || str.length() == 0) {
            j().f12472f.g("Ad unit id must be a non-empty string");
        } else {
            m().t(new RunnableC2225b(this, str, j5, 1));
        }
    }
}
