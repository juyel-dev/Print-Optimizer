package p082t2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends a {
    public static final Parcelable.Creator<k1> CREATOR = new C2229d(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12750o;
    public final String p;
    public final long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f12751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12752s;
    public final String t;
    public final Double u;

    public k1(int i5, String str, long j5, Long l5, Float f5, String str2, String str3, Double d4) {
        this.f12750o = i5;
        this.p = str;
        this.q = j5;
        this.f12751r = l5;
        if (i5 == 1) {
            this.u = f5 != null ? Double.valueOf(f5.doubleValue()) : null;
        } else {
            this.u = d4;
        }
        this.f12752s = str2;
        this.t = str3;
    }

    public final Object g() {
        Long l5 = this.f12751r;
        if (l5 != null) {
            return l5;
        }
        Double d4 = this.u;
        if (d4 != null) {
            return d4;
        }
        String str = this.f12752s;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f12750o);
        g.y(parcel, 2, this.p);
        g.I(parcel, 3, 8);
        parcel.writeLong(this.q);
        Long l5 = this.f12751r;
        if (l5 != null) {
            g.I(parcel, 4, 8);
            parcel.writeLong(l5.longValue());
        }
        g.y(parcel, 6, this.f12752s);
        g.y(parcel, 7, this.t);
        Double d4 = this.u;
        if (d4 != null) {
            g.I(parcel, 8, 8);
            parcel.writeDouble(d4.doubleValue());
        }
        g.H(parcel, iE);
    }

    public k1(long j5, Object obj, String str, String str2) {
        z.e(str);
        this.f12750o = 2;
        this.p = str;
        this.q = j5;
        this.t = str2;
        if (obj == null) {
            this.f12751r = null;
            this.u = null;
            this.f12752s = null;
            return;
        }
        if (obj instanceof Long) {
            this.f12751r = (Long) obj;
            this.u = null;
            this.f12752s = null;
        } else if (obj instanceof String) {
            this.f12751r = null;
            this.u = null;
            this.f12752s = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f12751r = null;
                this.u = (Double) obj;
                this.f12752s = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k1(l1 l1Var) {
        String str = l1Var.f12763c;
        this(l1Var.f12764d, l1Var.e, str, l1Var.f12762b);
    }
}
