package p082t2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: t2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2232e0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f12632o;
    public final boolean p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2226b0 f12633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2232e0(C2226b0 c2226b0, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        this.f12633r = c2226b0;
        long andIncrement = C2226b0.f12602k.getAndIncrement();
        this.f12632o = andIncrement;
        this.q = str;
        this.p = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c2226b0.j().f12472f.g("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2232e0 c2232e0 = (C2232e0) obj;
        boolean z3 = c2232e0.p;
        boolean z4 = this.p;
        if (z4 != z3) {
            return z4 ? -1 : 1;
        }
        long j5 = c2232e0.f12632o;
        long j6 = this.f12632o;
        if (j6 < j5) {
            return -1;
        }
        if (j6 > j5) {
            return 1;
        }
        this.f12633r.j().g.f(Long.valueOf(j6), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        L lJ = this.f12633r.j();
        lJ.f12472f.f(th, this.q);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2232e0(C2226b0 c2226b0, Callable callable, boolean z3) {
        super(callable);
        this.f12633r = c2226b0;
        long andIncrement = C2226b0.f12602k.getAndIncrement();
        this.f12632o = andIncrement;
        this.q = "Task exception on worker thread";
        this.p = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c2226b0.j().f12472f.g("Tasks index overflow");
        }
    }
}
