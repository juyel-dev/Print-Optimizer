package p082t2;

import L0.a;
import f1.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f12599o;
    public final long p;
    public final /* synthetic */ g q;

    public a1(g gVar, long j5, long j6) {
        this.q = gVar;
        this.f12599o = j5;
        this.p = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2226b0 c2226b0M = ((Z0) this.q.q).m();
        a aVar = new a(13);
        aVar.p = this;
        c2226b0M.t(aVar);
    }
}
