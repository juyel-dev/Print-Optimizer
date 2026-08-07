package p082t2;

import T1.z;
import android.os.Handler;
import com.google.android.gms.internal.ads.Ns;
import com.google.android.gms.internal.ads.RunnableC1805vo;

/* JADX INFO: renamed from: t2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2249n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Ns f12767d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2254p0 f12768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC1805vo f12769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f12770c;

    public AbstractC2249n(InterfaceC2254p0 interfaceC2254p0) {
        z.i(interfaceC2254p0);
        this.f12768a = interfaceC2254p0;
        this.f12769b = new RunnableC1805vo(12, this, false, interfaceC2254p0);
    }

    public final void a() {
        this.f12770c = 0L;
        d().removeCallbacks(this.f12769b);
    }

    public final void b(long j5) {
        a();
        if (j5 >= 0) {
            this.f12768a.e().getClass();
            this.f12770c = System.currentTimeMillis();
            if (d().postDelayed(this.f12769b, j5)) {
                return;
            }
            this.f12768a.j().f12472f.f(Long.valueOf(j5), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        Ns ns;
        if (f12767d != null) {
            return f12767d;
        }
        synchronized (AbstractC2249n.class) {
            try {
                if (f12767d == null) {
                    f12767d = new Ns(this.f12768a.a().getMainLooper(), 1);
                }
                ns = f12767d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ns;
    }
}
