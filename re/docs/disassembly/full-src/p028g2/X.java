package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends a {
    public static final Parcelable.Creator<X> CREATOR = new U(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11193o;
    public final p064o2.X p;
    public final p064o2.X q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p064o2.X f11194r;

    public X(long j5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        z.i(bArr);
        p064o2.X xS = p064o2.X.s(bArr, bArr.length);
        z.i(bArr2);
        p064o2.X xS2 = p064o2.X.s(bArr2, bArr2.length);
        z.i(bArr3);
        p064o2.X xS3 = p064o2.X.s(bArr3, bArr3.length);
        this.f11193o = j5;
        this.p = xS;
        this.q = xS2;
        this.f11194r = xS3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x4 = (X) obj;
        return this.f11193o == x4.f11193o && z.m(this.p, x4.p) && z.m(this.q, x4.q) && z.m(this.f11194r, x4.f11194r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11193o), this.p, this.q, this.f11194r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 8);
        parcel.writeLong(this.f11193o);
        g.v(parcel, 2, this.p.t());
        g.v(parcel, 3, this.q.t());
        g.v(parcel, 4, this.f11194r.t());
        g.H(parcel, iE);
    }
}
