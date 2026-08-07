package p090v1;

import T1.z;
import U1.a;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends a {
    public static final Parcelable.Creator<J0> CREATOR = new C2339c0(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Bundle f13396A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Bundle f13397B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final List f13398C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f13399D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f13400E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f13401F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final M f13402G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f13403H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f13404I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final List f13405J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f13406K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f13407L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f13408M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13409o;
    public final long p;
    public final Bundle q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f13411s;
    public final boolean t;
    public final int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f13413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F0 f13414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Location f13415y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f13416z;

    public J0(int i5, long j5, Bundle bundle, int i6, List list, boolean z3, int i7, boolean z4, String str, F0 f5, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z5, M m5, int i8, String str5, List list3, int i9, String str6, int i10) {
        this.f13409o = i5;
        this.p = j5;
        this.q = bundle == null ? new Bundle() : bundle;
        this.f13410r = i6;
        this.f13411s = list;
        this.t = z3;
        this.u = i7;
        this.f13412v = z4;
        this.f13413w = str;
        this.f13414x = f5;
        this.f13415y = location;
        this.f13416z = str2;
        this.f13396A = bundle2 == null ? new Bundle() : bundle2;
        this.f13397B = bundle3;
        this.f13398C = list2;
        this.f13399D = str3;
        this.f13400E = str4;
        this.f13401F = z5;
        this.f13402G = m5;
        this.f13403H = i8;
        this.f13404I = str5;
        this.f13405J = list3 == null ? new ArrayList() : list3;
        this.f13406K = i9;
        this.f13407L = str6;
        this.f13408M = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j5 = (J0) obj;
        return this.f13409o == j5.f13409o && this.p == j5.p && E.p(this.q, j5.q) && this.f13410r == j5.f13410r && z.m(this.f13411s, j5.f13411s) && this.t == j5.t && this.u == j5.u && this.f13412v == j5.f13412v && z.m(this.f13413w, j5.f13413w) && z.m(this.f13414x, j5.f13414x) && z.m(this.f13415y, j5.f13415y) && z.m(this.f13416z, j5.f13416z) && E.p(this.f13396A, j5.f13396A) && E.p(this.f13397B, j5.f13397B) && z.m(this.f13398C, j5.f13398C) && z.m(this.f13399D, j5.f13399D) && z.m(this.f13400E, j5.f13400E) && this.f13401F == j5.f13401F && this.f13403H == j5.f13403H && z.m(this.f13404I, j5.f13404I) && z.m(this.f13405J, j5.f13405J) && this.f13406K == j5.f13406K && z.m(this.f13407L, j5.f13407L) && this.f13408M == j5.f13408M;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13409o), Long.valueOf(this.p), this.q, Integer.valueOf(this.f13410r), this.f13411s, Boolean.valueOf(this.t), Integer.valueOf(this.u), Boolean.valueOf(this.f13412v), this.f13413w, this.f13414x, this.f13415y, this.f13416z, this.f13396A, this.f13397B, this.f13398C, this.f13399D, this.f13400E, Boolean.valueOf(this.f13401F), Integer.valueOf(this.f13403H), this.f13404I, this.f13405J, Integer.valueOf(this.f13406K), this.f13407L, Integer.valueOf(this.f13408M)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13409o);
        g.I(parcel, 2, 8);
        parcel.writeLong(this.p);
        g.u(parcel, 3, this.q);
        g.I(parcel, 4, 4);
        parcel.writeInt(this.f13410r);
        g.A(parcel, 5, this.f13411s);
        g.I(parcel, 6, 4);
        parcel.writeInt(this.t ? 1 : 0);
        g.I(parcel, 7, 4);
        parcel.writeInt(this.u);
        g.I(parcel, 8, 4);
        parcel.writeInt(this.f13412v ? 1 : 0);
        g.y(parcel, 9, this.f13413w);
        g.x(parcel, 10, this.f13414x, i5);
        g.x(parcel, 11, this.f13415y, i5);
        g.y(parcel, 12, this.f13416z);
        g.u(parcel, 13, this.f13396A);
        g.u(parcel, 14, this.f13397B);
        g.A(parcel, 15, this.f13398C);
        g.y(parcel, 16, this.f13399D);
        g.y(parcel, 17, this.f13400E);
        g.I(parcel, 18, 4);
        parcel.writeInt(this.f13401F ? 1 : 0);
        g.x(parcel, 19, this.f13402G, i5);
        g.I(parcel, 20, 4);
        parcel.writeInt(this.f13403H);
        g.y(parcel, 21, this.f13404I);
        g.A(parcel, 22, this.f13405J);
        g.I(parcel, 23, 4);
        parcel.writeInt(this.f13406K);
        g.y(parcel, 24, this.f13407L);
        g.I(parcel, 25, 4);
        parcel.writeInt(this.f13408M);
        g.H(parcel, iE);
    }
}
