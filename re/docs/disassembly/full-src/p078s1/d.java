package p078s1;

import U1.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.J5;
import p013c2.g;
import p028g2.U;
import p090v1.L;
import p090v1.N;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new U(19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12347o;
    public final N p;
    public final IBinder q;

    public d(boolean z3, IBinder iBinder, IBinder iBinder2) {
        N l5;
        this.f12347o = z3;
        if (iBinder != null) {
            int i5 = J5.p;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            l5 = iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new L(iBinder);
        } else {
            l5 = null;
        }
        this.p = l5;
        this.q = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f12347o ? 1 : 0);
        N n5 = this.p;
        g.w(parcel, 2, n5 == null ? null : n5.asBinder());
        g.w(parcel, 3, this.q);
        g.H(parcel, iE);
    }
}
