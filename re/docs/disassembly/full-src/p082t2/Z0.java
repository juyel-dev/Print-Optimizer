package p082t2;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.C1731u1;
import com.google.android.gms.internal.ads.Ns;
import f1.g;
import p042j3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ns f12592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12593d;
    public final c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1731u1 f12594f;
    public final g g;

    public Z0(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12593d = true;
        this.e = new c(this, 24);
        C1731u1 c1731u1 = new C1731u1();
        c1731u1.f9260r = this;
        c1731u1.q = new b1(c1731u1, (C2236g0) this.f12783a, 0);
        ((C2236g0) this.f12783a).f12686n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1731u1.f9259o = jElapsedRealtime;
        c1731u1.p = jElapsedRealtime;
        this.f12594f = c1731u1;
        this.g = new g(this);
    }

    @Override // p082t2.B
    public final boolean q() {
        return false;
    }

    public final void r() {
        h();
        if (this.f12592c == null) {
            this.f12592c = new Ns(Looper.getMainLooper(), 1);
        }
    }
}
