package p082t2;

import com.google.android.gms.internal.ads.C1731u1;
import f1.g;
import p042j3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Y0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12588o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Z0 q;

    public /* synthetic */ Y0(Z0 z3, long j5, int i5) {
        this.f12588o = i5;
        this.p = j5;
        this.q = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12588o) {
            case 0:
                Z0 z3 = this.q;
                z3.h();
                z3.r();
                L lJ = z3.j();
                long j5 = this.p;
                lJ.f12479n.f(Long.valueOf(j5), "Activity resumed, time");
                C2236g0 c2236g0 = (C2236g0) z3.f12783a;
                boolean zT = c2236g0.g.t(null, AbstractC2268x.f12901H0);
                C2235g c2235g = c2236g0.g;
                C1731u1 c1731u1 = z3.f12594f;
                if (zT) {
                    if (c2235g.w() || z3.f12593d) {
                        ((Z0) c1731u1.f9260r).h();
                        ((b1) c1731u1.q).a();
                        c1731u1.f9259o = j5;
                        c1731u1.p = j5;
                    }
                } else if (c2235g.w() || z3.f().t.b()) {
                    ((Z0) c1731u1.f9260r).h();
                    ((b1) c1731u1.q).a();
                    c1731u1.f9259o = j5;
                    c1731u1.p = j5;
                }
                g gVar = z3.g;
                Z0 z4 = (Z0) gVar.q;
                z4.h();
                a1 a1Var = (a1) gVar.p;
                if (a1Var != null) {
                    z4.f12592c.removeCallbacks(a1Var);
                }
                z4.f().t.a(false);
                z4.h();
                z4.f12593d = false;
                c cVar = z3.e;
                ((Z0) cVar.p).h();
                Z0 z5 = (Z0) cVar.p;
                if (((C2236g0) z5.f12783a).g()) {
                    ((C2236g0) z5.f12783a).f12686n.getClass();
                    cVar.w(System.currentTimeMillis(), false);
                }
                break;
            default:
                Z0 z6 = this.q;
                z6.h();
                z6.r();
                L lJ2 = z6.j();
                long j6 = this.p;
                lJ2.f12479n.f(Long.valueOf(j6), "Activity paused, time");
                g gVar2 = z6.g;
                Z0 z7 = (Z0) gVar2.q;
                ((C2236g0) z7.f12783a).f12686n.getClass();
                a1 a1Var2 = new a1(gVar2, System.currentTimeMillis(), j6);
                gVar2.p = a1Var2;
                z7.f12592c.postDelayed(a1Var2, 2000L);
                if (((C2236g0) z6.f12783a).g.w()) {
                    ((b1) z6.f12594f.q).a();
                }
                break;
        }
    }
}
