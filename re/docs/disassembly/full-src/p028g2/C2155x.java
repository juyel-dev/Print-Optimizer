package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2155x extends a {
    public static final Parcelable.Creator<C2155x> CREATOR = new C0157b(19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A f11247o;
    public final C2147o p;

    public C2155x(String str, int i5) {
        z.i(str);
        try {
            this.f11247o = A.a(str);
            try {
                this.p = C2147o.a(i5);
            } catch (C2146n e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C2157z e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2155x)) {
            return false;
        }
        C2155x c2155x = (C2155x) obj;
        return this.f11247o.equals(c2155x.f11247o) && this.p.equals(c2155x.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11247o, this.p});
    }

    public final String toString() {
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f11247o) + ", \n algorithm=" + String.valueOf(this.p) + "\n }";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [g2.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        this.f11247o.getClass();
        g.y(parcel, 2, "public-key");
        int iA = this.p.f11219o.a();
        g.I(parcel, 3, 4);
        parcel.writeInt(iA);
        g.H(parcel, iE);
    }
}
