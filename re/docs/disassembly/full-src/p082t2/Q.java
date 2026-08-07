package p082t2;

import L0.a;
import T1.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f12500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12502c;

    public Q(j1 j1Var) {
        z.i(j1Var);
        this.f12500a = j1Var;
    }

    public final void a() {
        j1 j1Var = this.f12500a;
        j1Var.W();
        j1Var.m().h();
        j1Var.m().h();
        if (this.f12501b) {
            j1Var.j().f12479n.g("Unregistering connectivity change receiver");
            this.f12501b = false;
            this.f12502c = false;
            try {
                j1Var.f12726l.f12675a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                j1Var.j().f12472f.f(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j1 j1Var = this.f12500a;
        j1Var.W();
        String action = intent.getAction();
        j1Var.j().f12479n.f(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            j1Var.j().f12474i.f(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        P p = j1Var.f12718b;
        j1.w(p);
        boolean zD0 = p.d0();
        if (this.f12502c != zD0) {
            this.f12502c = zD0;
            j1Var.m().t(new a(this, zD0));
        }
    }
}
