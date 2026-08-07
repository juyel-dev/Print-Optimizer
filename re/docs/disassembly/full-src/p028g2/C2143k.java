package p028g2;

import T1.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;
import p036i2.e;
import p064o2.C2200c;

/* JADX INFO: renamed from: g2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2143k extends AbstractC2144l {
    public static final Parcelable.Creator<C2143k> CREATOR = new U(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f11216o;
    public final String p;
    public final int q;

    public C2143k(int i5, String str, int i6) {
        try {
            this.f11216o = r.a(i5);
            this.p = str;
            this.q = i6;
        } catch (C2149q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2143k)) {
            return false;
        }
        C2143k c2143k = (C2143k) obj;
        return z.m(this.f11216o, c2143k.f11216o) && z.m(this.p, c2143k.p) && z.m(Integer.valueOf(this.q), Integer.valueOf(c2143k.q));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11216o, this.p, Integer.valueOf(this.q)});
    }

    public final String toString() {
        e eVar = new e(getClass().getSimpleName(), 22);
        String strValueOf = String.valueOf(this.f11216o.f11230o);
        C2200c c2200c = new C2200c(21, false);
        ((e) eVar.f11537r).f11537r = c2200c;
        eVar.f11537r = c2200c;
        c2200c.q = strValueOf;
        c2200c.p = "errorCode";
        String str = this.p;
        if (str != null) {
            eVar.B(str, "errorMessage");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        int i6 = this.f11216o.f11230o;
        g.I(parcel, 2, 4);
        parcel.writeInt(i6);
        g.y(parcel, 3, this.p);
        g.I(parcel, 4, 4);
        parcel.writeInt(this.q);
        g.H(parcel, iE);
    }
}
