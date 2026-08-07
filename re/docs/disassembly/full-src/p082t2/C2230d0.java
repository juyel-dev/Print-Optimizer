package p082t2;

import T1.z;
import android.os.Process;
import androidx.compose.foundation.text.modifiers.a;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: t2.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2230d0 extends Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f12622o;
    public final AbstractQueue p;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2226b0 f12623r;

    /* JADX WARN: Multi-variable type inference failed */
    public C2230d0(C2226b0 c2226b0, String str, BlockingQueue blockingQueue) {
        this.f12623r = c2226b0;
        z.i(blockingQueue);
        this.f12622o = new Object();
        this.p = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        L lJ = this.f12623r.j();
        lJ.f12474i.f(interruptedException, a.l(getName(), " was interrupted"));
    }

    public final void b() {
        synchronized (this.f12623r.f12607i) {
            try {
                if (!this.q) {
                    this.f12623r.f12608j.release();
                    this.f12623r.f12607i.notifyAll();
                    C2226b0 c2226b0 = this.f12623r;
                    if (this == c2226b0.f12603c) {
                        c2226b0.f12603c = null;
                    } else if (this == c2226b0.f12604d) {
                        c2226b0.f12604d = null;
                    } else {
                        c2226b0.j().f12472f.g("Current scheduler thread is neither worker nor network");
                    }
                    this.q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        while (!z3) {
            try {
                this.f12623r.f12608j.acquire();
                z3 = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2232e0 c2232e0 = (C2232e0) this.p.poll();
                if (c2232e0 != null) {
                    Process.setThreadPriority(c2232e0.p ? threadPriority : 10);
                    c2232e0.run();
                } else {
                    synchronized (this.f12622o) {
                        if (this.p.peek() == null) {
                            this.f12623r.getClass();
                            try {
                                this.f12622o.wait(30000L);
                            } catch (InterruptedException e3) {
                                a(e3);
                            }
                        }
                    }
                    synchronized (this.f12623r.f12607i) {
                        if (this.p.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
