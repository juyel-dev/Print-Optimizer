package p090v1;

import U1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends a {
    public static final Parcelable.Creator<O0> CREATOR = new C2339c0(10);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13433o;
    public long p;
    public t0 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f13434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13435s;
    public final String t;
    public final String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f13436v;

    public O0(String str, long j5, t0 t0Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f13433o = str;
        this.p = j5;
        this.q = t0Var;
        this.f13434r = bundle;
        this.f13435s = str2;
        this.t = str3;
        this.u = str4;
        this.f13436v = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f13433o);
        long j5 = this.p;
        g.I(parcel, 2, 8);
        parcel.writeLong(j5);
        g.x(parcel, 3, this.q, i5);
        g.u(parcel, 4, this.f13434r);
        g.y(parcel, 5, this.f13435s);
        g.y(parcel, 6, this.t);
        g.y(parcel, 7, this.u);
        g.y(parcel, 8, this.f13436v);
        g.H(parcel, iE);
    }
}
