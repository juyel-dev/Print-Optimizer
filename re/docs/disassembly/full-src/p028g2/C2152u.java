package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p064o2.X;
import p064o2.p0;

/* JADX INFO: renamed from: g2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2152u extends a {
    public static final Parcelable.Creator<C2152u> CREATOR = new C0157b(17);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11233o;
    public final String p;
    public final X q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2142j f11234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2141i f11235s;
    public final C2143k t;
    public final C2139g u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11236v;

    public C2152u(String str, String str2, byte[] bArr, C2142j c2142j, C2141i c2141i, C2143k c2143k, C2139g c2139g, String str3) {
        X xS = bArr == null ? null : X.s(bArr, bArr.length);
        boolean z3 = false;
        z.a("Must provide a response object.", (c2142j != null && c2141i == null && c2143k == null) || (c2142j == null && c2141i != null && c2143k == null) || (c2142j == null && c2141i == null && c2143k != null));
        if (c2143k != null || (str != null && xS != null)) {
            z3 = true;
        }
        z.a("Must provide id and rawId if not an error response.", z3);
        this.f11233o = str;
        this.p = str2;
        this.q = xS;
        this.f11234r = c2142j;
        this.f11235s = c2141i;
        this.t = c2143k;
        this.u = c2139g;
        this.f11236v = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2152u)) {
            return false;
        }
        C2152u c2152u = (C2152u) obj;
        return z.m(this.f11233o, c2152u.f11233o) && z.m(this.p, c2152u.p) && z.m(this.q, c2152u.q) && z.m(this.f11234r, c2152u.f11234r) && z.m(this.f11235s, c2152u.f11235s) && z.m(this.t, c2152u.t) && z.m(this.u, c2152u.u) && z.m(this.f11236v, c2152u.f11236v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11233o, this.p, this.q, this.f11235s, this.f11234r, this.t, this.u, this.f11236v});
    }

    public final String toString() {
        X x4 = this.q;
        String strF = b.f(x4 == null ? null : x4.t());
        String strValueOf = String.valueOf(this.f11234r);
        String strValueOf2 = String.valueOf(this.f11235s);
        String strValueOf3 = String.valueOf(this.t);
        String strValueOf4 = String.valueOf(this.u);
        StringBuilder sb = new StringBuilder("PublicKeyCredential{\n id='");
        sb.append(this.f11233o);
        sb.append("', \n type='");
        p061o.a.g(sb, this.p, "', \n rawId=", strF, ", \n registerResponse=");
        p061o.a.g(sb, strValueOf, ", \n signResponse=", strValueOf2, ", \n errorResponse=");
        p061o.a.g(sb, strValueOf3, ", \n extensionsClientOutputs=", strValueOf4, ", \n authenticatorAttachment='");
        return p035i0.a.p(sb, this.f11236v, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        p0.f12151a.mo6685a();
        throw null;
    }
}
