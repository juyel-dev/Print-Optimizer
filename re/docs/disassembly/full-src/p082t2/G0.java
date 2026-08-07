package p082t2;

import com.google.android.gms.internal.measurement.o4;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12439o = 1;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12441s;
    public final /* synthetic */ B t;

    public G0(C2267w0 c2267w0, C2259s0 c2259s0, long j5, boolean z3, C2259s0 c2259s1) {
        this.f12440r = c2259s0;
        this.p = j5;
        this.q = z3;
        this.f12441s = c2259s1;
        this.t = c2267w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12439o) {
            case 0:
                C2259s0 c2259s0 = (C2259s0) this.f12440r;
                C2267w0 c2267w0 = (C2267w0) this.t;
                c2267w0.D(c2259s0);
                C2267w0.F((C2267w0) this.t, c2259s0, this.p, false, this.q);
                o4.a();
                if (((C2236g0) c2267w0.f12783a).g.t(null, AbstractC2268x.f12962q0)) {
                    C2267w0.G(c2267w0, c2259s0, (C2259s0) this.f12441s);
                }
                break;
            default:
                ((K0) this.t).v((L0) this.f12440r, (L0) this.f12441s, this.p, this.q, null);
                break;
        }
    }

    public G0(K0 k3, L0 l5, L0 l6, long j5, boolean z3) {
        this.f12440r = l5;
        this.f12441s = l6;
        this.p = j5;
        this.q = z3;
        this.t = k3;
    }
}
