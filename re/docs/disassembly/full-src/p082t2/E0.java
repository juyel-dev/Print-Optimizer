package p082t2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12430o;
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ C2267w0 q;

    public /* synthetic */ E0(C2267w0 c2267w0, AtomicReference atomicReference, int i5) {
        this.f12430o = i5;
        this.p = atomicReference;
        this.q = c2267w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12430o) {
            case 0:
                synchronized (this.p) {
                    try {
                        try {
                            AtomicReference atomicReference = this.p;
                            C2236g0 c2236g0 = (C2236g0) this.q.f12783a;
                            atomicReference.set(Long.valueOf(c2236g0.g.q(c2236g0.p().r(), AbstractC2268x.f12912N)));
                            this.p.notify();
                        } catch (Throwable th) {
                            this.p.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.p) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.p;
                            C2236g0 c2236g1 = (C2236g0) this.q.f12783a;
                            atomicReference2.set(Double.valueOf(c2236g1.g.k(c2236g1.p().r(), AbstractC2268x.f12916P)));
                            this.p.notify();
                        } catch (Throwable th3) {
                            this.p.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
