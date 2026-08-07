package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends a {
    public static final Parcelable.Creator<E0> CREATOR = new C2339c0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13391o;
    public final int p;

    public E0(int i5, int i6) {
        this.f13391o = i5;
        this.p = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13391o);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.p);
        g.H(parcel, iE);
    }
}
