package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12413b;

    public B(C2236g0 c2236g0) {
        super(c2236g0);
        ((C2236g0) this.f12783a).f12671E++;
    }

    public final void o() {
        if (!this.f12413b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.f12413b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (q()) {
            return;
        }
        ((C2236g0) this.f12783a).f12673G.incrementAndGet();
        this.f12413b = true;
    }

    public abstract boolean q();
}
