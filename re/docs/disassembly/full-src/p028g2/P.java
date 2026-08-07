package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;
import p064o2.X;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends a {
    public static final Parcelable.Creator<P> CREATOR = new C0157b(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f11186o;
    public final X p;
    public final X q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11187r;

    public P(X x4, X x5, X x6, int i5) {
        this.f11186o = x4;
        this.p = x5;
        this.q = x6;
        this.f11187r = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return z.m(this.f11186o, p.f11186o) && z.m(this.p, p.p) && z.m(this.q, p.q) && this.f11187r == p.f11187r;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f11187r);
        return Arrays.hashCode(new Object[]{this.f11186o, this.p, this.q, numValueOf});
    }

    public final String toString() {
        X x4 = this.f11186o;
        String strF = b.f(x4 == null ? null : x4.t());
        X x5 = this.p;
        String strF2 = b.f(x5 == null ? null : x5.t());
        X x6 = this.q;
        String strF3 = b.f(x6 != null ? x6.t() : null);
        StringBuilder sbR = p035i0.a.r("HmacSecretExtension{coseKeyAgreement=", strF, ", saltEnc=", strF2, ", saltAuth=");
        sbR.append(strF3);
        sbR.append(", getPinUvAuthProtocol=");
        return androidx.compose.foundation.text.modifiers.a.o(sbR, this.f11187r, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        X x4 = this.f11186o;
        g.v(parcel, 1, x4 == null ? null : x4.t());
        X x5 = this.p;
        g.v(parcel, 2, x5 == null ? null : x5.t());
        X x6 = this.q;
        g.v(parcel, 3, x6 != null ? x6.t() : null);
        g.I(parcel, 4, 4);
        parcel.writeInt(this.f11187r);
        g.H(parcel, iE);
    }
}
