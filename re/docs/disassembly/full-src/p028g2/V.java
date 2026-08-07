package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;
import p064o2.X;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends a {
    public static final Parcelable.Creator<V> CREATOR = new U(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f11191o;
    public final X p;

    public V(X x4, X x5) {
        this.f11191o = x4;
        this.p = x5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v4 = (V) obj;
        return z.m(this.f11191o, v4.f11191o) && z.m(this.p, v4.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11191o, this.p});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        X x4 = this.f11191o;
        g.v(parcel, 1, x4 == null ? null : x4.t());
        X x5 = this.p;
        g.v(parcel, 2, x5 != null ? x5.t() : null);
        g.H(parcel, iE);
    }
}
