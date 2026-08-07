package p082t2;

/* JADX INFO: renamed from: t2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2250n0 extends AbstractC2252o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12771b;

    public AbstractC2250n0(C2236g0 c2236g0) {
        super(c2236g0);
        ((C2236g0) this.f12783a).f12671E++;
    }

    public final void k() {
        if (!this.f12771b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f12771b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        ((C2236g0) this.f12783a).f12673G.incrementAndGet();
        this.f12771b = true;
    }

    public abstract boolean n();
}
