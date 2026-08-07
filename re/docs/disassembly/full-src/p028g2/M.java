package p028g2;

import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends a {
    public static final Parcelable.Creator<M> CREATOR = new C0157b(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11183o;

    public M(long j5) {
        this.f11183o = Long.valueOf(j5).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M) && this.f11183o == ((M) obj).f11183o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11183o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 8);
        parcel.writeLong(this.f11183o);
        g.H(parcel, iE);
    }
}
