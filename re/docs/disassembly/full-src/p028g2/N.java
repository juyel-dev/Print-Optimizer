package p028g2;

import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends a {
    public static final Parcelable.Creator<N> CREATOR = new C0157b(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11184o;

    public N(boolean z3) {
        this.f11184o = Boolean.valueOf(z3).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof N) && this.f11184o == ((N) obj).f11184o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11184o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11184o ? 1 : 0);
        g.H(parcel, iE);
    }
}
