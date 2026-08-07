package p090v1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.J3;
import f1.g;
import p067p1.a;
import p067p1.i;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f13494o = new Object();
    public a p;
    public final /* synthetic */ J3 q;

    public s0(J3 j5) {
        this.q = j5;
    }

    @Override // p067p1.a, p090v1.InterfaceC2334a
    public final void I() {
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.I();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p067p1.a
    public final void a() {
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p067p1.a
    public final void b(i iVar) {
        J3 j5 = this.q;
        g gVar = (g) j5.f4305c;
        I i5 = (I) j5.f4309i;
        InterfaceC2363o0 interfaceC2363o0M = null;
        if (i5 != null) {
            try {
                interfaceC2363o0M = i5.m();
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
        gVar.a(interfaceC2363o0M);
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.b(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p067p1.a
    public final void e() {
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p067p1.a
    public final void g() {
        J3 j5 = this.q;
        g gVar = (g) j5.f4305c;
        I i5 = (I) j5.f4309i;
        InterfaceC2363o0 interfaceC2363o0M = null;
        if (i5 != null) {
            try {
                interfaceC2363o0M = i5.m();
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
        gVar.a(interfaceC2363o0M);
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p067p1.a
    public final void i() {
        synchronized (this.f13494o) {
            try {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
