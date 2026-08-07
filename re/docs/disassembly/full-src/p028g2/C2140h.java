package p028g2;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2140h extends a {
    public static final Parcelable.Creator<C2140h> CREATOR = new U(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11210o;

    public C2140h(boolean z3) {
        this.f11210o = z3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2140h) && this.f11210o == ((C2140h) obj).f11210o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11210o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11210o ? 1 : 0);
        g.H(parcel, iE);
    }
}
