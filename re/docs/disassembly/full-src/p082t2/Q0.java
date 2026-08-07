package p082t2;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12503o;
    public final /* synthetic */ o1 p;
    public final /* synthetic */ O0 q;

    public /* synthetic */ Q0(O0 o5, o1 o1Var, int i5) {
        this.f12503o = i5;
        this.p = o1Var;
        this.q = o5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12503o) {
            case 0:
                o1 o1Var = this.p;
                O0 o5 = this.q;
                G g = o5.f12492d;
                if (g != null) {
                    try {
                        g.z0(o1Var);
                    } catch (RemoteException e) {
                        o5.j().f12472f.f(e, "Failed to reset data on the service: remote exception");
                    }
                    o5.C();
                } else {
                    o5.j().f12472f.g("Failed to reset data on the service: not connected to service");
                }
                break;
            default:
                o1 o1Var2 = this.p;
                O0 o6 = this.q;
                G g5 = o6.f12492d;
                if (g5 == null) {
                    o6.j().f12472f.g("Failed to send consent settings to service");
                } else {
                    try {
                        g5.E3(o1Var2);
                        o6.C();
                    } catch (RemoteException e3) {
                        o6.j().f12472f.f(e3, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
