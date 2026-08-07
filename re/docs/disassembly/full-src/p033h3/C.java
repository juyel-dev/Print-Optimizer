package p033h3;

import N.b;
import N.e;
import Z1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements ServiceConnection {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f11446o;
    public final Intent p;
    public final ScheduledThreadPoolExecutor q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayDeque f11447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public A f11448s;
    public boolean t;

    public C(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f11447r = new ArrayDeque();
        this.t = false;
        Context applicationContext = context.getApplicationContext();
        this.f11446o = applicationContext;
        this.p = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.q = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f11447r.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                A a5 = this.f11448s;
                if (a5 == null || !a5.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11448s.a((B) this.f11447r.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized o b(Intent intent) {
        B b5;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            b5 = new B(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.q;
            b5.f11445b.f13713a.a(scheduledThreadPoolExecutor, new b(scheduledThreadPoolExecutor.schedule(new e(b5, 11), 20L, TimeUnit.SECONDS), 13));
            this.f11447r.add(b5);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return b5.f11445b.f13713a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.t);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.t) {
            return;
        }
        this.t = true;
        try {
            if (X1.a.b().a(this.f11446o, this.p, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f11447r;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((B) arrayDeque.poll()).f11445b.d(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.t = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.t = false;
            if (iBinder instanceof A) {
                this.f11448s = (A) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f11447r;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((B) arrayDeque.poll()).f11445b.d(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
