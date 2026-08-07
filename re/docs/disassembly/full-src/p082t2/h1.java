package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h1 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12696c;

    public h1(j1 j1Var) {
        super(j1Var);
        this.f12662b.f12730r++;
    }

    public final void o() {
        if (!this.f12696c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.f12696c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        q();
        this.f12662b.f12731s++;
        this.f12696c = true;
    }

    public abstract boolean q();
}
