package p082t2;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C1731u1;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends AbstractC2249n {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, InterfaceC2254p0 interfaceC2254p0, int i5) {
        super(interfaceC2254p0);
        this.e = i5;
        this.f12609f = obj;
    }

    @Override // p082t2.AbstractC2249n
    public final void c() {
        switch (this.e) {
            case 0:
                C1731u1 c1731u1 = (C1731u1) this.f12609f;
                ((Z0) c1731u1.f9260r).h();
                Z0 z3 = (Z0) c1731u1.f9260r;
                ((C2236g0) z3.f12783a).f12686n.getClass();
                c1731u1.a(SystemClock.elapsedRealtime(), false, false);
                C2236g0 c2236g0 = (C2236g0) z3.f12783a;
                C2258s c2258sN = c2236g0.n();
                c2236g0.f12686n.getClass();
                c2258sN.o(SystemClock.elapsedRealtime());
                break;
            default:
                e1 e1Var = (e1) this.f12609f;
                e1Var.r();
                e1Var.j().f12479n.g("Starting upload from DelayedRunnable");
                e1Var.f12662b.X();
                break;
        }
    }
}
