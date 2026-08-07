package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;
import p064o2.AbstractC2198a;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends a {
    public static final Parcelable.Creator<H> CREATOR = new C0157b(26);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f11178o;
    public final String p;

    static {
        new H("supported", null);
        new H("not-supported", null);
    }

    public H(String str, String str2) {
        z.i(str);
        try {
            this.f11178o = F.a(str);
            this.p = str2;
        } catch (G e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h5 = (H) obj;
        return AbstractC2198a.h(this.f11178o, h5.f11178o) && AbstractC2198a.h(this.p, h5.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11178o, this.p});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f11178o.f11177o);
        g.y(parcel, 3, this.p);
        g.H(parcel, iE);
    }
}
