package p033h3;

import A.e;
import I.d;
import S.k;
import Z1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p101x2.i;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ExecutorService f11468o;
    public A p;
    public final Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11470s;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11468o = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.q = new Object();
        this.f11470s = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            z.b(intent);
        }
        synchronized (this.q) {
            try {
                int i5 = this.f11470s - 1;
                this.f11470s = i5;
                if (i5 == 0) {
                    stopSelfResult(this.f11469r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.p == null) {
                this.p = new A(new e(this, 10));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f11468o.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        synchronized (this.q) {
            this.f11469r = i6;
            this.f11470s++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) r.h().f11488r).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        i iVar = new i();
        this.f11468o.execute(new k(this, intent2, iVar, 1));
        o oVar = iVar.f13713a;
        if (oVar.f()) {
            a(intent);
            return 2;
        }
        oVar.a(new d(0), new f(0, this, intent));
        return 3;
    }
}
