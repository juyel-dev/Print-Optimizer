package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2138f extends a {
    public static final Parcelable.Creator<C2138f> CREATOR = new U(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2150s f11199o;
    public final Y p;
    public final I q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f11200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final M f11201s;
    public final N t;
    public final Z u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O f11202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C2151t f11203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q f11204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S f11205y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final P f11206z;

    public C2138f(C2150s c2150s, Y y4, I i5, a0 a0Var, M m5, N n5, Z z3, O o5, C2151t c2151t, Q q, S s2, P p) {
        this.f11199o = c2150s;
        this.q = i5;
        this.p = y4;
        this.f11200r = a0Var;
        this.f11201s = m5;
        this.t = n5;
        this.u = z3;
        this.f11202v = o5;
        this.f11203w = c2151t;
        this.f11204x = q;
        this.f11205y = s2;
        this.f11206z = p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2138f)) {
            return false;
        }
        C2138f c2138f = (C2138f) obj;
        return z.m(this.f11199o, c2138f.f11199o) && z.m(this.p, c2138f.p) && z.m(this.q, c2138f.q) && z.m(this.f11200r, c2138f.f11200r) && z.m(this.f11201s, c2138f.f11201s) && z.m(this.t, c2138f.t) && z.m(this.u, c2138f.u) && z.m(this.f11202v, c2138f.f11202v) && z.m(this.f11203w, c2138f.f11203w) && z.m(this.f11204x, c2138f.f11204x) && z.m(this.f11205y, c2138f.f11205y) && z.m(this.f11206z, c2138f.f11206z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11199o, this.p, this.q, this.f11200r, this.f11201s, this.t, this.u, this.f11202v, this.f11203w, this.f11204x, this.f11205y, this.f11206z});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11199o);
        String strValueOf2 = String.valueOf(this.p);
        String strValueOf3 = String.valueOf(this.q);
        String strValueOf4 = String.valueOf(this.f11200r);
        String strValueOf5 = String.valueOf(this.f11201s);
        String strValueOf6 = String.valueOf(this.t);
        String strValueOf7 = String.valueOf(this.u);
        String strValueOf8 = String.valueOf(this.f11202v);
        String strValueOf9 = String.valueOf(this.f11203w);
        String strValueOf10 = String.valueOf(this.f11204x);
        String strValueOf11 = String.valueOf(this.f11205y);
        StringBuilder sbR = p035i0.a.r("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        p061o.a.g(sbR, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        p061o.a.g(sbR, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        p061o.a.g(sbR, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        p061o.a.g(sbR, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return p035i0.a.p(sbR, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.x(parcel, 2, this.f11199o, i5);
        g.x(parcel, 3, this.p, i5);
        g.x(parcel, 4, this.q, i5);
        g.x(parcel, 5, this.f11200r, i5);
        g.x(parcel, 6, this.f11201s, i5);
        g.x(parcel, 7, this.t, i5);
        g.x(parcel, 8, this.u, i5);
        g.x(parcel, 9, this.f11202v, i5);
        g.x(parcel, 10, this.f11203w, i5);
        g.x(parcel, 11, this.f11204x, i5);
        g.x(parcel, 12, this.f11205y, i5);
        g.x(parcel, 13, this.f11206z, i5);
        g.H(parcel, iE);
    }
}
