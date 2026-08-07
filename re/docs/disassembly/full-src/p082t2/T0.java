package p082t2;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12541o;
    public final /* synthetic */ S0 p;

    public /* synthetic */ T0(S0 s2, int i5) {
        this.f12541o = i5;
        this.p = s2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12541o) {
            case 0:
                S0 s2 = this.p;
                O0 o5 = s2.q;
                ComponentName componentName = new ComponentName(((C2236g0) s2.q.f12783a).f12675a, "com.google.android.gms.measurement.AppMeasurementService");
                o5.h();
                if (o5.f12492d != null) {
                    o5.f12492d = null;
                    o5.j().f12479n.f(componentName, "Disconnected from device MeasurementService");
                    o5.h();
                    o5.w();
                }
                break;
            default:
                O0 o6 = this.p.q;
                o6.f12492d = null;
                o6.B();
                break;
        }
    }
}
