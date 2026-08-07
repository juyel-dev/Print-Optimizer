package p088v;

import J2.b;
import androidx.compose.foundation.text.modifiers.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f13381r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f13382s = Logger.getLogger(g.class.getName());
    public static final p111z2.b t;
    public static final Object u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Object f13383o;
    public volatile c p;
    public volatile f q;

    static {
        p111z2.b eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "q"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "p"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        t = eVar;
        if (th != null) {
            f13382s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        u = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.q;
        } while (!t.g(gVar, fVar, f.f13378c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f13379a;
            if (thread != null) {
                fVar.f13379a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f13380b;
        }
        gVar.c();
        do {
            cVar2 = gVar.p;
        } while (!t.e(gVar, cVar2, c.f13370d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f13373c;
            cVar.f13373c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f13373c;
            e(cVar3.f13371a, cVar3.f13372b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f13382s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f13368b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f13369a);
        }
        if (obj == u) {
            return null;
        }
        return obj;
    }

    public static Object g(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // J2.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.p;
        c cVar2 = c.f13370d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f13373c = cVar;
                if (t.e(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.p;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        a aVar;
        Object obj = this.f13383o;
        if (obj != null) {
            return false;
        }
        if (f13381r) {
            aVar = new a(z3, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z3 ? a.f13365c : a.f13366d;
        }
        if (!t.f(this, obj, aVar)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13383o;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.q;
            f fVar2 = f.f13378c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                while (true) {
                    p111z2.b bVar = t;
                    bVar.t(fVar3, fVar);
                    if (bVar.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13383o;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(fVar3);
                        break;
                    }
                    fVar = this.q;
                    if (fVar == fVar2) {
                    }
                }
            }
            return f(this.f13383o);
        }
        while (nanos > 0) {
            Object obj3 = this.f13383o;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strL = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strL2 = a.l(strL, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z3 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strL3 = strL2 + jConvert + " " + lowerCase;
                if (z3) {
                    strL3 = a.l(strL3, ",");
                }
                strL2 = a.l(strL3, " ");
            }
            if (z3) {
                strL2 = strL2 + nanos2 + " nanoseconds ";
            }
            strL = a.l(strL2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.l(strL, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a.m(strL, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(f fVar) {
        fVar.f13379a = null;
        while (true) {
            f fVar2 = this.q;
            if (fVar2 == f.f13378c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f13380b;
                if (fVar2.f13379a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f13380b = fVar4;
                    if (fVar3.f13379a == null) {
                    }
                } else if (!t.g(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13383o instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f13383o != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = u;
        }
        if (!t.f(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!t.f(this, null, new b(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f13383o instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e) {
                strH = "Exception thrown from implementation: " + e.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f13383o;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar = this.q;
            f fVar2 = f.f13378c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    p111z2.b bVar = t;
                    bVar.t(fVar3, fVar);
                    if (bVar.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f13383o;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar = this.q;
                } while (fVar != fVar2);
            }
            return f(this.f13383o);
        }
        throw new InterruptedException();
    }
}
