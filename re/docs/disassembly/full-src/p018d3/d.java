package p018d3;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p009b3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11035d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11038c;

    public d() {
        if (Y2.d.q == null) {
            Pattern pattern = j.f2431c;
            Y2.d.q = new Y2.d(26);
        }
        Y2.d dVar = Y2.d.q;
        if (j.f2432d == null) {
            j.f2432d = new j(dVar);
        }
        this.f11036a = j.f2432d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z3;
        if (this.f11038c != 0) {
            this.f11036a.f2433a.getClass();
            if (System.currentTimeMillis() > this.f11037b) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        return z3;
    }

    public final synchronized void b(int i5) {
        long jMin;
        if ((i5 >= 200 && i5 < 300) || i5 == 401 || i5 == 404) {
            synchronized (this) {
                this.f11038c = 0;
            }
            return;
        }
        this.f11038c++;
        synchronized (this) {
            try {
                if (i5 == 429 || (i5 >= 500 && i5 < 600)) {
                    double dPow = Math.pow(2.0d, this.f11038c);
                    this.f11036a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
                } else {
                    jMin = f11035d;
                }
                this.f11036a.f2433a.getClass();
                this.f11037b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
