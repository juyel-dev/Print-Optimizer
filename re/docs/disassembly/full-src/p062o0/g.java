package p062o0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p077s0.c;
import p080t0.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f12075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f12076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p077s0.b f12077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f12078d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12079f;
    public ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f12080h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f12081i = new ThreadLocal();

    public g() {
        new ConcurrentHashMap();
        this.f12078d = d();
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f12077c.l().p).inTransaction() && this.f12081i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        b bVarL = this.f12077c.l();
        this.f12078d.c(bVarL);
        bVarL.c();
    }

    public abstract d d();

    public abstract p077s0.b e(a aVar);

    public final void f() {
        this.f12077c.l().n();
        if (((SQLiteDatabase) this.f12077c.l().p).inTransaction()) {
            return;
        }
        d dVar = this.f12078d;
        if (dVar.f12061d.compareAndSet(false, true)) {
            dVar.f12060c.f12076b.execute(dVar.f12064i);
        }
    }

    public final Cursor g(c cVar) {
        a();
        b();
        return this.f12077c.l().y(cVar);
    }

    public final void h() {
        this.f12077c.l().z();
    }
}
