package p082t2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12425o;
    public final /* synthetic */ long p;
    public final /* synthetic */ C2267w0 q;

    public /* synthetic */ C0(C2267w0 c2267w0, long j5, int i5) {
        this.f12425o = i5;
        this.p = j5;
        this.q = c2267w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12425o) {
            case 0:
                C2267w0 c2267w0 = this.q;
                W w4 = c2267w0.f().f12550l;
                long j5 = this.p;
                w4.b(j5);
                L lJ = c2267w0.j();
                lJ.f12478m.f(Long.valueOf(j5), "Session timeout duration set");
                break;
            default:
                long j6 = this.p;
                C2267w0 c2267w1 = this.q;
                c2267w1.s(j6, true);
                ((C2236g0) c2267w1.f12783a).s().s(new AtomicReference());
                break;
        }
    }
}
