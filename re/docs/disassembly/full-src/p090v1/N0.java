package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends a {
    public static final Parcelable.Creator<N0> CREATOR = new C2339c0(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13431o;
    public final int p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13432r;

    public N0(int i5, int i6, long j5, String str) {
        this.f13431o = i5;
        this.p = i6;
        this.q = str;
        this.f13432r = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13431o);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.p);
        g.y(parcel, 3, this.q);
        g.I(parcel, 4, 8);
        parcel.writeLong(this.f13432r);
        g.H(parcel, iE);
    }
}
