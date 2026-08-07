package p101x2;

import T1.z;
import com.google.android.gms.internal.ads.N5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13720a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N5 f13721b = new N5(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13723d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f13724f;

    @Override // p101x2.h
    public final o a(Executor executor, c cVar) {
        this.f13721b.d(new l(executor, cVar));
        p();
        return this;
    }

    @Override // p101x2.h
    public final o b(Executor executor, d dVar) {
        this.f13721b.d(new l(executor, dVar));
        p();
        return this;
    }

    @Override // p101x2.h
    public final o c(Executor executor, e eVar) {
        this.f13721b.d(new l(executor, eVar));
        p();
        return this;
    }

    @Override // p101x2.h
    public final Exception d() {
        Exception exc;
        synchronized (this.f13720a) {
            exc = this.f13724f;
        }
        return exc;
    }

    @Override // p101x2.h
    public final Object e() {
        Object obj;
        synchronized (this.f13720a) {
            try {
                z.k("Task is not yet complete", this.f13722c);
                if (this.f13723d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f13724f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // p101x2.h
    public final boolean f() {
        boolean z3;
        synchronized (this.f13720a) {
            z3 = this.f13722c;
        }
        return z3;
    }

    @Override // p101x2.h
    public final boolean g() {
        boolean z3;
        synchronized (this.f13720a) {
            try {
                z3 = false;
                if (this.f13722c && !this.f13723d && this.f13724f == null) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final o h(c cVar) {
        this.f13721b.d(new l(j.f13714a, cVar));
        p();
        return this;
    }

    public final o i(Executor executor, a aVar) {
        o oVar = new o();
        this.f13721b.d(new k(executor, aVar, oVar, 0));
        p();
        return oVar;
    }

    public final o j(Executor executor, a aVar) {
        o oVar = new o();
        this.f13721b.d(new k(executor, aVar, oVar, 1));
        p();
        return oVar;
    }

    public final o k(Executor executor, g gVar) {
        o oVar = new o();
        this.f13721b.d(new l(executor, gVar, oVar));
        p();
        return oVar;
    }

    public final void l(Exception exc) {
        z.j(exc, "Exception must not be null");
        synchronized (this.f13720a) {
            o();
            this.f13722c = true;
            this.f13724f = exc;
        }
        this.f13721b.e(this);
    }

    public final void m(Object obj) {
        synchronized (this.f13720a) {
            o();
            this.f13722c = true;
            this.e = obj;
        }
        this.f13721b.e(this);
    }

    public final void n() {
        synchronized (this.f13720a) {
            try {
                if (this.f13722c) {
                    return;
                }
                this.f13722c = true;
                this.f13723d = true;
                this.f13721b.e(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        String strConcat;
        if (this.f13722c) {
            int i5 = Z3.o.f1938o;
            if (!f()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
            if (excD != null) {
                strConcat = "failure";
            } else if (g()) {
                strConcat = "result ".concat(String.valueOf(e()));
            } else {
                strConcat = this.f13723d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void p() {
        synchronized (this.f13720a) {
            try {
                if (this.f13722c) {
                    this.f13721b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
