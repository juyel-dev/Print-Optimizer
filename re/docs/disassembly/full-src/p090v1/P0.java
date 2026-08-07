package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends a {
    public static final Parcelable.Creator<P0> CREATOR = new C2339c0(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13437o;

    public P0(int i5) {
        this.f13437o = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.f13437o);
        g.H(parcel, iE);
    }
}
