package p082t2;

import T1.z;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: t2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2226b0 extends AbstractC2250n0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f12602k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2230d0 f12603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2230d0 f12604d;
    public final PriorityBlockingQueue e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f12605f;
    public final C2228c0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2228c0 f12606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f12607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f12608j;

    public C2226b0(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12607i = new Object();
        this.f12608j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f12605f = new LinkedBlockingQueue();
        this.g = new C2228c0(this, "Thread death: Uncaught exception on worker thread");
        this.f12606h = new C2228c0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p082t2.AbstractC2252o0
    public final void h() {
        if (Thread.currentThread() != this.f12603c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        return false;
    }

    public final Object o(AtomicReference atomicReference, long j5, String str, Runnable runnable) {
        synchronized (atomicReference) {
            m().t(runnable);
            try {
                atomicReference.wait(j5);
            } catch (InterruptedException unused) {
                j().f12474i.g("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            j().f12474i.g("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final C2232e0 p(Callable callable) {
        k();
        C2232e0 c2232e0 = new C2232e0(this, callable, false);
        if (Thread.currentThread() == this.f12603c) {
            if (!this.e.isEmpty()) {
                j().f12474i.g("Callable skipped the worker queue.");
            }
            c2232e0.run();
        } else {
            q(c2232e0);
        }
        return c2232e0;
    }

    public final void q(C2232e0 c2232e0) {
        synchronized (this.f12607i) {
            try {
                this.e.add(c2232e0);
                C2230d0 c2230d0 = this.f12603c;
                if (c2230d0 == null) {
                    C2230d0 c2230d1 = new C2230d0(this, "Measurement Worker", this.e);
                    this.f12603c = c2230d1;
                    c2230d1.setUncaughtExceptionHandler(this.g);
                    this.f12603c.start();
                } else {
                    synchronized (c2230d0.f12622o) {
                        c2230d0.f12622o.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Runnable runnable) {
        k();
        C2232e0 c2232e0 = new C2232e0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f12607i) {
            try {
                this.f12605f.add(c2232e0);
                C2230d0 c2230d0 = this.f12604d;
                if (c2230d0 == null) {
                    C2230d0 c2230d1 = new C2230d0(this, "Measurement Network", this.f12605f);
                    this.f12604d = c2230d1;
                    c2230d1.setUncaughtExceptionHandler(this.f12606h);
                    this.f12604d.start();
                } else {
                    synchronized (c2230d0.f12622o) {
                        c2230d0.f12622o.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2232e0 s(Callable callable) {
        k();
        C2232e0 c2232e0 = new C2232e0(this, callable, true);
        if (Thread.currentThread() == this.f12603c) {
            c2232e0.run();
        } else {
            q(c2232e0);
        }
        return c2232e0;
    }

    public final void t(Runnable runnable) {
        k();
        z.i(runnable);
        q(new C2232e0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void u(Runnable runnable) {
        k();
        q(new C2232e0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean v() {
        return Thread.currentThread() == this.f12603c;
    }

    public final void w() {
        if (Thread.currentThread() != this.f12604d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }
}
