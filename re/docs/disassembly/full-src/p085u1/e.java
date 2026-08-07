package p085u1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new U(20);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13298o;
    public final boolean p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f13300s;
    public final int t;
    public final boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13301v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13302w;

    public e(boolean z3, boolean z4, String str, boolean z5, float f5, int i5, boolean z6, boolean z7, boolean z8) {
        this.f13298o = z3;
        this.p = z4;
        this.q = str;
        this.f13299r = z5;
        this.f13300s = f5;
        this.t = i5;
        this.u = z6;
        this.f13301v = z7;
        this.f13302w = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.f13298o ? 1 : 0);
        g.I(parcel, 3, 4);
        parcel.writeInt(this.p ? 1 : 0);
        g.y(parcel, 4, this.q);
        g.I(parcel, 5, 4);
        parcel.writeInt(this.f13299r ? 1 : 0);
        g.I(parcel, 6, 4);
        parcel.writeFloat(this.f13300s);
        g.I(parcel, 7, 4);
        parcel.writeInt(this.t);
        g.I(parcel, 8, 4);
        parcel.writeInt(this.u ? 1 : 0);
        g.I(parcel, 9, 4);
        parcel.writeInt(this.f13301v ? 1 : 0);
        g.I(parcel, 10, 4);
        parcel.writeInt(this.f13302w ? 1 : 0);
        g.H(parcel, iE);
    }

    public e(boolean z3, boolean z4, boolean z5, float f5, boolean z6, boolean z7, boolean z8) {
        this(z3, z4, null, z5, f5, -1, z6, z7, z8);
    }
}
