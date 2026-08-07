package p082t2;

import T1.z;
import android.content.ContentValues;
import com.google.android.gms.internal.measurement.C2072n3;

/* JADX INFO: renamed from: t2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2240i0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12698o;
    public final /* synthetic */ o1 p;
    public final /* synthetic */ BinderC2238h0 q;

    public /* synthetic */ RunnableC2240i0(BinderC2238h0 binderC2238h0, o1 o1Var, int i5) {
        this.f12698o = i5;
        this.p = o1Var;
        this.q = binderC2238h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12698o) {
            case 0:
                BinderC2238h0 binderC2238h0 = this.q;
                binderC2238h0.f12695o.V();
                binderC2238h0.f12695o.M(this.p);
                break;
            default:
                BinderC2238h0 binderC2238h1 = this.q;
                binderC2238h1.f12695o.V();
                j1 j1Var = binderC2238h1.f12695o;
                j1Var.m().h();
                j1Var.W();
                o1 o1Var = this.p;
                z.e(o1Var.f12803o);
                C2072n3.a();
                C2235g c2235gP = j1Var.P();
                F f5 = AbstractC2268x.f12907K0;
                C2259s0 c2259s0C = C2259s0.c(c2235gP.t(null, f5) ? o1Var.f12798O : 100, o1Var.f12793J);
                String str = o1Var.f12803o;
                C2259s0 c2259s0F = j1Var.F(str);
                j1Var.j().f12479n.h("Setting consent, package, consent", str, c2259s0C);
                j1Var.q(str, c2259s0C);
                if (c2259s0C.h(c2259s0F, (EnumC2257r0[]) c2259s0C.f12840a.keySet().toArray(new EnumC2257r0[0]))) {
                    j1Var.O(o1Var);
                }
                C2072n3.a();
                if (j1Var.P().t(null, f5)) {
                    C2251o c2251oB = C2251o.b(o1Var.f12799P);
                    if (!C2251o.f12778f.equals(c2251oB)) {
                        j1Var.j().f12479n.h("Setting DMA consent. package, consent", str, c2251oB);
                        j1Var.m().h();
                        j1Var.W();
                        C2072n3.a();
                        j1Var.f12712C.put(str, c2251oB);
                        C2243k c2243k = j1Var.f12719c;
                        j1.w(c2243k);
                        C2072n3.a();
                        if (((C2236g0) c2243k.f12783a).g.t(null, f5)) {
                            z.i(c2251oB);
                            c2243k.h();
                            c2243k.o();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("dma_consent_settings", c2251oB.f12780b);
                            c2243k.D(contentValues);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
