package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2145m extends a {
    public static final Parcelable.Creator<C2145m> CREATOR = new U(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC2135c f11217o;
    public final Boolean p;
    public final J q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E f11218r;

    public C2145m(String str, Boolean bool, String str2, String str3) {
        EnumC2135c enumC2135cA;
        E eA = null;
        if (str == null) {
            enumC2135cA = null;
        } else {
            try {
                enumC2135cA = EnumC2135c.a(str);
            } catch (D | T | C2134b e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f11217o = enumC2135cA;
        this.p = bool;
        this.q = str2 == null ? null : J.a(str2);
        if (str3 != null) {
            eA = E.a(str3);
        }
        this.f11218r = eA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2145m)) {
            return false;
        }
        C2145m c2145m = (C2145m) obj;
        return z.m(this.f11217o, c2145m.f11217o) && z.m(this.p, c2145m.p) && z.m(this.q, c2145m.q) && z.m(g(), c2145m.g());
    }

    public final E g() {
        E e = this.f11218r;
        if (e != null) {
            return e;
        }
        Boolean bool = this.p;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return E.RESIDENT_KEY_REQUIRED;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11217o, this.p, this.q, g()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11217o);
        String strValueOf2 = String.valueOf(this.q);
        String strValueOf3 = String.valueOf(this.f11218r);
        StringBuilder sbK = AbstractC1421mz.k("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbK.append(this.p);
        sbK.append(", \n requireUserVerification=");
        sbK.append(strValueOf2);
        sbK.append(", \n residentKeyRequirement=");
        return p035i0.a.p(sbK, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        EnumC2135c enumC2135c = this.f11217o;
        g.y(parcel, 2, enumC2135c == null ? null : enumC2135c.f11197o);
        Boolean bool = this.p;
        if (bool != null) {
            g.I(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        J j5 = this.q;
        g.y(parcel, 4, j5 == null ? null : j5.f11180o);
        E eG = g();
        g.y(parcel, 5, eG != null ? eG.f11176o : null);
        g.H(parcel, iE);
    }
}
