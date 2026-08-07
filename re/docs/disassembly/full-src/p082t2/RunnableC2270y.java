package p082t2;

/* JADX INFO: renamed from: t2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2270y implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12980o;
    public final /* synthetic */ long p;
    public final /* synthetic */ D q;

    public /* synthetic */ RunnableC2270y(D d4, long j5, int i5) {
        this.f12980o = i5;
        this.p = j5;
        this.q = d4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12980o) {
            case 0:
                ((C2258s) this.q).s(this.p);
                break;
            default:
                K0 k3 = (K0) this.q;
                ((C2236g0) k3.f12783a).n().o(this.p);
                k3.e = null;
                break;
        }
    }
}
