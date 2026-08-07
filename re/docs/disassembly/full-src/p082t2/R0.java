package p082t2;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class R0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12504o;
    public final /* synthetic */ o1 p;
    public final /* synthetic */ O0 q;

    public /* synthetic */ R0(O0 o5, o1 o1Var, int i5) {
        this.f12504o = i5;
        this.p = o1Var;
        this.q = o5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f12504o) {
            case 0:
                o1 o1Var = this.p;
                O0 o5 = this.q;
                G g = o5.f12492d;
                if (g == null) {
                    o5.j().f12472f.g("Discarding data. Failed to send app launch");
                } else {
                    try {
                        g.R0(o1Var);
                        ((C2236g0) o5.f12783a).q().u();
                        o5.u(g, null, o1Var);
                        o5.C();
                    } catch (RemoteException e) {
                        o5.j().f12472f.f(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                o1 o1Var2 = this.p;
                O0 o6 = this.q;
                G g5 = o6.f12492d;
                if (g5 == null) {
                    o6.j().f12472f.g("Failed to send measurementEnabled to service");
                } else {
                    try {
                        g5.j3(o1Var2);
                        o6.C();
                    } catch (RemoteException e3) {
                        o6.j().f12472f.f(e3, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
