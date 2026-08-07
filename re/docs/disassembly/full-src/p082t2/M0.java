package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12488o;
    public final /* synthetic */ K0 p;

    public /* synthetic */ M0(K0 k3, int i5) {
        this.f12488o = i5;
        this.p = k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12488o) {
            case 0:
                K0 k3 = this.p;
                k3.e = k3.f12467j;
                break;
            default:
                this.p.f12467j = null;
                break;
        }
    }
}
