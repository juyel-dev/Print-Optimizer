package p028g2;

import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new C0157b(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11196o;

    public a0(boolean z3) {
        this.f11196o = Boolean.valueOf(z3).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && this.f11196o == ((a0) obj).f11196o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11196o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11196o ? 1 : 0);
        g.H(parcel, iE);
    }
}
