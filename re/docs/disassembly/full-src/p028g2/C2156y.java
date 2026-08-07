package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2156y extends a {
    public static final Parcelable.Creator<C2156y> CREATOR = new C0157b(20);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11248o;
    public final String p;
    public final String q;

    public C2156y(String str, String str2, String str3) {
        z.i(str);
        this.f11248o = str;
        z.i(str2);
        this.p = str2;
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2156y)) {
            return false;
        }
        C2156y c2156y = (C2156y) obj;
        return z.m(this.f11248o, c2156y.f11248o) && z.m(this.p, c2156y.p) && z.m(this.q, c2156y.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11248o, this.p, this.q});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.f11248o);
        sb.append("', \n name='");
        sb.append(this.p);
        sb.append("', \n icon='");
        return p035i0.a.p(sb, this.q, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f11248o);
        g.y(parcel, 3, this.p);
        g.y(parcel, 4, this.q);
        g.H(parcel, iE);
    }
}
