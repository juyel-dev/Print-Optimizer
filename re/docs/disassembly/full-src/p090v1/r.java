package p090v1;

import A1.j;
import O1.i;
import T1.z;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.Cq;
import com.google.android.gms.internal.ads.InterfaceC0734Ga;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractBinderC1911y5 implements T {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f13485o;

    public r(i iVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f13485o = iVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            t0 t0Var = (t0) AbstractC1955z5.a(parcel, t0.CREATOR);
            AbstractC1955z5.b(parcel);
            V(t0Var);
        } else if (i5 == 2) {
            c();
        } else if (i5 == 3) {
            l();
        } else if (i5 != 4 && i5 != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p090v1.T
    public final void V(t0 t0Var) {
        if (this.f13485o != null) {
            t0Var.g();
        }
    }

    @Override // p090v1.T
    public final void c() {
        i iVar = this.f13485o;
        if (iVar != null) {
            Cq cq = (Cq) ((j) iVar.p);
            cq.getClass();
            z.d("#008 Must be called on the main UI thread.");
            AbstractC1223ib.m("Adapter called onAdOpened.");
            try {
                ((InterfaceC0734Ga) cq.p).v2();
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // p090v1.T
    public final void l() {
        i iVar = this.f13485o;
        if (iVar != null) {
            Cq cq = (Cq) ((j) iVar.p);
            cq.getClass();
            z.d("#008 Must be called on the main UI thread.");
            AbstractC1223ib.m("Adapter called onAdClosed.");
            try {
                ((InterfaceC0734Ga) cq.p).c();
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // p090v1.T
    public final void b() {
    }

    @Override // p090v1.T
    public final void o() {
    }
}
