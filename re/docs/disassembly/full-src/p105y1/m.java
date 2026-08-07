package p105y1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15946o;
    public final int p;

    public m(String str, int i5) {
        this.f15946o = str == null ? "" : str;
        this.p = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f15946o);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.p);
        g.H(parcel, iE);
    }
}
