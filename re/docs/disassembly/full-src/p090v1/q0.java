package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends a {
    public static final Parcelable.Creator<q0> CREATOR = new C2339c0(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13484o;

    public q0(int i5) {
        this.f13484o = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.f13484o);
        g.H(parcel, iE);
    }
}
