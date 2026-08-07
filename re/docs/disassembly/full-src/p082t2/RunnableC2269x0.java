package p082t2;

import E1.b;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: t2.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2269x0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12979o;
    public /* synthetic */ AtomicReference p;
    public /* synthetic */ C2267w0 q;

    public /* synthetic */ RunnableC2269x0() {
        this.f12979o = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12979o) {
            case 0:
                C2267w0 c2267w0 = this.q;
                Bundle bundleH = c2267w0.f().f12553o.h();
                O0 o0S = ((C2236g0) c2267w0.f12783a).s();
                if (bundleH == null) {
                    bundleH = new Bundle();
                }
                o0S.h();
                o0S.o();
                o1 o1VarD = o0S.D(false);
                o0S.r(new b(o0S, this.p, o1VarD, bundleH, 13, false));
                return;
            case 1:
                synchronized (this.p) {
                    try {
                        try {
                            AtomicReference atomicReference = this.p;
                            C2236g0 c2236g0 = (C2236g0) this.q.f12783a;
                            C2235g c2235g = c2236g0.g;
                            String strR = c2236g0.p().r();
                            c2235g.getClass();
                            atomicReference.set(Boolean.valueOf(c2235g.t(strR, AbstractC2268x.f12908L)));
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
            case 2:
                synchronized (this.p) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.p;
                            C2236g0 c2236g1 = (C2236g0) this.q.f12783a;
                            C2235g c2235g2 = c2236g1.g;
                            String strR2 = c2236g1.p().r();
                            c2235g2.getClass();
                            atomicReference2.set(c2235g2.r(strR2, AbstractC2268x.f12910M));
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
            default:
                synchronized (this.p) {
                    try {
                        try {
                            AtomicReference atomicReference3 = this.p;
                            C2236g0 c2236g2 = (C2236g0) this.q.f12783a;
                            atomicReference3.set(Integer.valueOf(c2236g2.g.p(c2236g2.p().r(), AbstractC2268x.f12914O)));
                            this.p.notify();
                        } catch (Throwable th5) {
                            this.p.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC2269x0(C2267w0 c2267w0, AtomicReference atomicReference, int i5) {
        this.f12979o = i5;
        this.p = atomicReference;
        this.q = c2267w0;
    }
}
