package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends AbstractC2249n {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O0 f12490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(O0 o5, C2236g0 c2236g0, int i5) {
        super(c2236g0);
        this.e = i5;
        this.f12490f = o5;
    }

    @Override // p082t2.AbstractC2249n
    public final void c() {
        switch (this.e) {
            case 0:
                O0 o5 = this.f12490f;
                o5.h();
                if (o5.y()) {
                    o5.j().f12479n.g("Inactivity, disconnecting from the service");
                    o5.x();
                }
                break;
            default:
                this.f12490f.j().f12474i.g("Tasks have been queued for a long time");
                break;
        }
    }
}
