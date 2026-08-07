package p082t2;

import B0.d;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: t2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2248m0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12766o;
    public final /* synthetic */ V p;
    public final /* synthetic */ AppMeasurementDynamiteService q;

    public /* synthetic */ RunnableC2248m0(AppMeasurementDynamiteService appMeasurementDynamiteService, V v4, int i5) {
        this.f12766o = i5;
        this.p = v4;
        this.q = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12766o) {
            case 0:
                O0 o0S = this.q.f10828o.s();
                o0S.h();
                o0S.o();
                o0S.r(new d(13, o0S, o0S.D(false), this.p, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.q;
                n1 n1Var = appMeasurementDynamiteService.f10828o.f12684l;
                C2236g0.f(n1Var);
                C2236g0 c2236g0 = appMeasurementDynamiteService.f10828o;
                n1Var.J(this.p, c2236g0.f12667A != null && c2236g0.f12667A.booleanValue());
                break;
        }
    }
}
