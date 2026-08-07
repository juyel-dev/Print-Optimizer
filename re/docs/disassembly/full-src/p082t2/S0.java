package p082t2;

import Q1.b;
import T1.InterfaceC0145b;
import T1.InterfaceC0146c;
import T1.z;
import X1.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0837Xb;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.RunnableC1805vo;

/* JADX INFO: loaded from: classes2.dex */
public final class S0 implements ServiceConnection, InterfaceC0145b, InterfaceC0146c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f12537o;
    public volatile C0837Xb p;
    public final /* synthetic */ O0 q;

    public S0(O0 o5) {
        this.q = o5;
    }

    @Override // T1.InterfaceC0145b
    public final void b0(int i5) {
        z.d("MeasurementServiceConnection.onConnectionSuspended");
        O0 o5 = this.q;
        o5.j().f12478m.g("Service connection suspended");
        o5.m().t(new T0(this, 0));
    }

    @Override // T1.InterfaceC0145b
    public final void c0() {
        z.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                z.i(this.p);
                this.q.m().t(new RunnableC1805vo(18, this, false, (G) this.p.t()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.p = null;
                this.f12537o = false;
            }
        }
    }

    @Override // T1.InterfaceC0146c
    public final void i0(b bVar) {
        z.d("MeasurementServiceConnection.onConnectionFailed");
        L l5 = ((C2236g0) this.q.f12783a).f12681i;
        if (l5 == null || !l5.f12771b) {
            l5 = null;
        }
        if (l5 != null) {
            l5.f12474i.f(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f12537o = false;
            this.p = null;
        }
        this.q.m().t(new T0(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f12537o = false;
                this.q.j().f12472f.g("Service connected with null binder");
                return;
            }
            Object i5 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    i5 = iInterfaceQueryLocalInterface instanceof G ? (G) iInterfaceQueryLocalInterface : new I(iBinder);
                    this.q.j().f12479n.g("Bound to IMeasurementService interface");
                } else {
                    this.q.j().f12472f.f(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.q.j().f12472f.g("Service connect failed to get IMeasurementService");
            }
            if (i5 == null) {
                this.f12537o = false;
                try {
                    a aVarB = a.b();
                    O0 o5 = this.q;
                    aVarB.c(((C2236g0) o5.f12783a).f12675a, o5.f12491c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.q.m().t(new Gp(18, (Object) this, false, i5));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        z.d("MeasurementServiceConnection.onServiceDisconnected");
        O0 o5 = this.q;
        o5.j().f12478m.g("Service disconnected");
        o5.m().t(new RunnableC1805vo(17, this, false, componentName));
    }
}
