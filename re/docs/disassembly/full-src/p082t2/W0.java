package p082t2;

import O1.i;
import android.app.Service;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ i f12576o;
    public /* synthetic */ int p;
    public /* synthetic */ L q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Intent f12577r;

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f12576o;
        X0 x4 = (X0) ((Service) iVar.p);
        int i5 = this.p;
        if (x4.f(i5)) {
            this.q.f12479n.f(Integer.valueOf(i5), "Local AppMeasurementService processed last upload request. StartId");
            iVar.I().f12479n.g("Completed wakeful intent.");
            x4.a(this.f12577r);
        }
    }
}
