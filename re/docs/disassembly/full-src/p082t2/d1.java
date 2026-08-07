package p082t2;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends a {
    public static final Parcelable.Creator<d1> CREATOR = new C2229d(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12624o;
    public final long p;
    public final int q;

    public d1(String str, long j5, int i5) {
        this.f12624o = str;
        this.p = j5;
        this.q = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f12624o);
        g.I(parcel, 2, 8);
        parcel.writeLong(this.p);
        g.I(parcel, 3, 4);
        parcel.writeInt(this.q);
        g.H(parcel, iE);
    }
}
