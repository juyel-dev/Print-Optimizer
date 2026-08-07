package p028g2;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends a {
    public static final Parcelable.Creator<L> CREATOR = new U(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11182o;
    public final short p;
    public final short q;

    public L(int i5, short s2, short s5) {
        this.f11182o = i5;
        this.p = s2;
        this.q = s5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l5 = (L) obj;
        return this.f11182o == l5.f11182o && this.p == l5.p && this.q == l5.q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11182o), Short.valueOf(this.p), Short.valueOf(this.q)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11182o);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.p);
        g.I(parcel, 3, 4);
        parcel.writeInt(this.q);
        g.H(parcel, iE);
    }
}
