package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.S9;
import p067p1.p;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractBinderC1911y5 implements InterfaceC2373y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f13395o;
    public final S9 p;

    public I0(p pVar, S9 s9) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.f13395o = pVar;
        this.p = s9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            l();
        } else {
            if (i5 != 2) {
                return false;
            }
            t0 t0Var = (t0) AbstractC1955z5.a(parcel, t0.CREATOR);
            AbstractC1955z5.b(parcel);
            s1(t0Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p090v1.InterfaceC2373y
    public final void l() {
        S9 s9;
        p pVar = this.f13395o;
        if (pVar == null || (s9 = this.p) == null) {
            return;
        }
        pVar.b(s9);
    }

    @Override // p090v1.InterfaceC2373y
    public final void s1(t0 t0Var) {
        p pVar = this.f13395o;
        if (pVar != null) {
            pVar.a(t0Var.i());
        }
    }
}
