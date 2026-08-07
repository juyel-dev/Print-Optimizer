package p013c2;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import p046k2.h;
import t4.C2328d;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2564o = 1;

    public /* synthetic */ f(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f2564o) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C2328d.f13250h;
                ReentrantLock reentrantLock2 = C2328d.f13250h;
                reentrantLock2.lock();
                try {
                    C2328d c2328dJ = h.j();
                    if (c2328dJ == C2328d.f13254l) {
                        C2328d.f13254l = null;
                        reentrantLock2.unlock();
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (c2328dJ != null) {
                            c2328dJ.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
