package p088v;

import J2.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakReference f13389o;
    public final i p = new i(this);

    public j(h hVar) {
        this.f13389o = new WeakReference(hVar);
    }

    @Override // J2.b
    public final void a(Runnable runnable, Executor executor) {
        this.p.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        h hVar = (h) this.f13389o.get();
        boolean zCancel = this.p.cancel(z3);
        if (zCancel && hVar != null) {
            hVar.f13384a = null;
            hVar.f13385b = null;
            hVar.f13386c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.p.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.p.f13383o instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.p.isDone();
    }

    public final String toString() {
        return this.p.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.p.get(j5, timeUnit);
    }
}
