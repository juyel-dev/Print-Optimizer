package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends AbstractC2249n {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2267w0 f12414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(C2267w0 c2267w0, InterfaceC2254p0 interfaceC2254p0, int i5) {
        super(interfaceC2254p0);
        this.e = i5;
        this.f12414f = c2267w0;
    }

    @Override // p082t2.AbstractC2249n
    public final void c() {
        switch (this.e) {
            case 0:
                this.f12414f.K();
                break;
            default:
                C2267w0 c2267w0 = this.f12414f;
                if (((C2236g0) c2267w0.f12783a).k()) {
                    c2267w0.p.b(2000L);
                }
                break;
        }
    }
}
