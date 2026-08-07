package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2150s extends a {
    public static final Parcelable.Creator<C2150s> CREATOR = new U(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11231o;

    public C2150s(String str) {
        z.i(str);
        this.f11231o = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2150s) {
            return this.f11231o.equals(((C2150s) obj).f11231o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11231o});
    }

    public final String toString() {
        return p035i0.a.p(new StringBuilder("FidoAppIdExtension{appid='"), this.f11231o, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f11231o);
        g.H(parcel, iE);
    }
}
