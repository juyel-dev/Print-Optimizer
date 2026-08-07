package p067p1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.C0807Sb;
import com.google.android.gms.internal.ads.J3;
import p090v1.I;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12279o;
    public final /* synthetic */ h p;

    public /* synthetic */ o(h hVar, int i5) {
        this.f12279o = i5;
        this.p = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12279o) {
            case 0:
                h hVar = this.p;
                try {
                    J3 j5 = hVar.f12273o;
                    j5.getClass();
                    try {
                        I i5 = (I) j5.f4309i;
                        if (i5 != null) {
                            i5.F();
                        }
                    } catch (RemoteException e) {
                        AbstractC1223ib.u("#007 Could not call remote method.", e);
                        return;
                    }
                } catch (IllegalStateException e3) {
                    C0807Sb.f(hVar.getContext()).b("BaseAdView.resume", e3);
                    return;
                }
                C0807Sb.f(hVar.getContext()).b("BaseAdView.resume", e3);
                break;
            case 1:
                h hVar2 = this.p;
                try {
                    J3 j6 = hVar2.f12273o;
                    j6.getClass();
                    try {
                        I i6 = (I) j6.f4309i;
                        if (i6 != null) {
                            i6.x();
                        }
                    } catch (RemoteException e5) {
                        AbstractC1223ib.u("#007 Could not call remote method.", e5);
                        return;
                    }
                } catch (IllegalStateException e6) {
                    C0807Sb.f(hVar2.getContext()).b("BaseAdView.destroy", e6);
                    return;
                }
                C0807Sb.f(hVar2.getContext()).b("BaseAdView.destroy", e6);
                break;
            default:
                h hVar3 = this.p;
                try {
                    J3 j7 = hVar3.f12273o;
                    j7.getClass();
                    try {
                        I i7 = (I) j7.f4309i;
                        if (i7 != null) {
                            i7.N0();
                        }
                    } catch (RemoteException e7) {
                        AbstractC1223ib.u("#007 Could not call remote method.", e7);
                        return;
                    }
                } catch (IllegalStateException e8) {
                    C0807Sb.f(hVar3.getContext()).b("BaseAdView.pause", e8);
                }
                C0807Sb.f(hVar3.getContext()).b("BaseAdView.pause", e8);
                break;
        }
    }
}
