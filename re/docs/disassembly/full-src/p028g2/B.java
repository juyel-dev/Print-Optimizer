package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import p013c2.g;
import p064o2.X;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends a {
    public static final Parcelable.Creator<B> CREATOR = new C0157b(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f11173o;
    public final String p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11174r;

    public B(String str, String str2, String str3, byte[] bArr) {
        z.i(bArr);
        this.f11173o = X.s(bArr, bArr.length);
        z.i(str);
        this.p = str;
        this.q = str2;
        z.i(str3);
        this.f11174r = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return z.m(this.f11173o, b5.f11173o) && z.m(this.p, b5.p) && z.m(this.q, b5.q) && z.m(this.f11174r, b5.f11174r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11173o, this.p, this.q, this.f11174r});
    }

    public final String toString() {
        StringBuilder sbK = AbstractC1421mz.k("PublicKeyCredentialUserEntity{\n id=", b.f(this.f11173o.t()), ", \n name='");
        sbK.append(this.p);
        sbK.append("', \n icon='");
        sbK.append(this.q);
        sbK.append("', \n displayName='");
        return p035i0.a.p(sbK, this.f11174r, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.v(parcel, 2, this.f11173o.t());
        g.y(parcel, 3, this.p);
        g.y(parcel, 4, this.q);
        g.y(parcel, 5, this.f11174r);
        g.H(parcel, iE);
    }
}
