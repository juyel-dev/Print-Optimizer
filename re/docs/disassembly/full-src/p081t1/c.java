package p081t1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakReference f12385o;
    public final long p;
    public final CountDownLatch q = new CountDownLatch(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12386r = false;

    public c(b bVar, long j5) {
        this.f12385o = new WeakReference(bVar);
        this.p = j5;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f12385o;
        try {
            if (this.q.await(this.p, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f12386r = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f12386r = true;
            }
        }
    }
}
