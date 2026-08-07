package p082t2;

import U1.a;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12497o;
    public final /* synthetic */ o1 p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O0 f12498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f12499s;

    public /* synthetic */ P0(O0 o5, o1 o1Var, boolean z3, a aVar, int i5) {
        this.f12497o = i5;
        this.p = o1Var;
        this.q = z3;
        this.f12499s = aVar;
        this.f12498r = o5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f12497o) {
            case 0:
                O0 o5 = this.f12498r;
                G g = o5.f12492d;
                if (g != null) {
                    o5.u(g, this.q ? null : (k1) this.f12499s, this.p);
                    o5.C();
                } else {
                    o5.j().f12472f.g("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                O0 o6 = this.f12498r;
                G g5 = o6.f12492d;
                if (g5 != null) {
                    o6.u(g5, this.q ? null : (C2231e) this.f12499s, this.p);
                    o6.C();
                } else {
                    o6.j().f12472f.g("Discarding data. Failed to send conditional user property to service");
                }
                break;
            default:
                O0 o7 = this.f12498r;
                G g6 = o7.f12492d;
                if (g6 != null) {
                    C2264v c2264v = (C2264v) this.f12499s;
                    o1 o1Var = this.p;
                    if (this.q) {
                        c2264v = null;
                    }
                    o7.u(g6, c2264v, o1Var);
                    o7.C();
                } else {
                    o7.j().f12472f.g("Discarding data. Failed to send event to service");
                }
                break;
        }
    }

    public P0(O0 o5, o1 o1Var, boolean z3, C2231e c2231e, C2231e c2231e2) {
        this.f12497o = 1;
        this.p = o1Var;
        this.q = z3;
        this.f12499s = c2231e;
        this.f12498r = o5;
    }
}
