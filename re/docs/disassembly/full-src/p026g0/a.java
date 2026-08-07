package p026g0;

import E1.k;
import O1.d;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.Gp;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {
    public static Handler t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f11169s;
    public volatile int p = 1;
    public final AtomicBoolean q = new AtomicBoolean();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f11168r = new AtomicBoolean();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f11167o = new b(this, new k(this, 1));

    public a(d dVar) {
        this.f11169s = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (t == null) {
                    t = new Handler(Looper.getMainLooper());
                }
                handler = t;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new Gp(8, (Object) this, false, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11169s.b();
    }
}
