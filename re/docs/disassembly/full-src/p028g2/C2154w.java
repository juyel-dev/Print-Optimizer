package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p013c2.g;
import p064o2.AbstractC2198a;
import p064o2.AbstractC2212o;
import p064o2.X;

/* JADX INFO: renamed from: g2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2154w extends a {
    public static final Parcelable.Creator<C2154w> CREATOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A f11246o;
    public final X p;
    public final ArrayList q;

    static {
        AbstractC2212o.o(2, AbstractC2198a.f12124c, AbstractC2198a.f12125d);
        CREATOR = new C0157b(18);
    }

    public C2154w(String str, byte[] bArr, ArrayList arrayList) {
        X x4 = X.q;
        X xS = X.s(bArr, bArr.length);
        z.i(str);
        try {
            this.f11246o = A.a(str);
            this.p = xS;
            this.q = arrayList;
        } catch (C2157z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2154w)) {
            return false;
        }
        C2154w c2154w = (C2154w) obj;
        if (!this.f11246o.equals(c2154w.f11246o) || !z.m(this.p, c2154w.p)) {
            return false;
        }
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = c2154w.q;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11246o, this.p, this.q});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11246o);
        String strF = b.f(this.p.t());
        return p035i0.a.p(p035i0.a.r("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strF, ", \n transports="), String.valueOf(this.q), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        this.f11246o.getClass();
        g.y(parcel, 2, "public-key");
        g.v(parcel, 3, this.p.t());
        g.D(parcel, 4, this.q);
        g.H(parcel, iE);
    }
}
