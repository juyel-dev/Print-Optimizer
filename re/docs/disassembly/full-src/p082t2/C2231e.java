package p082t2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: renamed from: t2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2231e extends a {
    public static final Parcelable.Creator<C2231e> CREATOR = new C2229d(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12625o;
    public String p;
    public k1 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12627s;
    public String t;
    public final C2264v u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2264v f12629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2264v f12631y;

    public C2231e(String str, String str2, k1 k1Var, long j5, boolean z3, String str3, C2264v c2264v, long j6, C2264v c2264v2, long j7, C2264v c2264v3) {
        this.f12625o = str;
        this.p = str2;
        this.q = k1Var;
        this.f12626r = j5;
        this.f12627s = z3;
        this.t = str3;
        this.u = c2264v;
        this.f12628v = j6;
        this.f12629w = c2264v2;
        this.f12630x = j7;
        this.f12631y = c2264v3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f12625o);
        g.y(parcel, 3, this.p);
        g.x(parcel, 4, this.q, i5);
        long j5 = this.f12626r;
        g.I(parcel, 5, 8);
        parcel.writeLong(j5);
        boolean z3 = this.f12627s;
        g.I(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        g.y(parcel, 7, this.t);
        g.x(parcel, 8, this.u, i5);
        long j6 = this.f12628v;
        g.I(parcel, 9, 8);
        parcel.writeLong(j6);
        g.x(parcel, 10, this.f12629w, i5);
        g.I(parcel, 11, 8);
        parcel.writeLong(this.f12630x);
        g.x(parcel, 12, this.f12631y, i5);
        g.H(parcel, iE);
    }

    public C2231e(C2231e c2231e) {
        z.i(c2231e);
        this.f12625o = c2231e.f12625o;
        this.p = c2231e.p;
        this.q = c2231e.q;
        this.f12626r = c2231e.f12626r;
        this.f12627s = c2231e.f12627s;
        this.t = c2231e.t;
        this.u = c2231e.u;
        this.f12628v = c2231e.f12628v;
        this.f12629w = c2231e.f12629w;
        this.f12630x = c2231e.f12630x;
        this.f12631y = c2231e.f12631y;
    }
}
