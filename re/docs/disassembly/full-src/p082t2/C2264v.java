package p082t2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: renamed from: t2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2264v extends a {
    public static final Parcelable.Creator<C2264v> CREATOR = new C2229d(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12869o;
    public final r p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f12870r;

    public C2264v(String str, r rVar, String str2, long j5) {
        this.f12869o = str;
        this.p = rVar;
        this.q = str2;
        this.f12870r = j5;
    }

    public final String toString() {
        return "origin=" + this.q + ",name=" + this.f12869o + ",params=" + String.valueOf(this.p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f12869o);
        g.x(parcel, 3, this.p, i5);
        g.y(parcel, 4, this.q);
        g.I(parcel, 5, 8);
        parcel.writeLong(this.f12870r);
        g.H(parcel, iE);
    }

    public C2264v(C2264v c2264v, long j5) {
        z.i(c2264v);
        this.f12869o = c2264v.f12869o;
        this.p = c2264v.p;
        this.q = c2264v.q;
        this.f12870r = j5;
    }
}
