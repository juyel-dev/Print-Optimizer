package p091v2;

import Q1.b;
import T1.s;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new U(23);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13510o;
    public final b p;
    public final s q;

    public f(int i5, b bVar, s sVar) {
        this.f13510o = i5;
        this.p = bVar;
        this.q = sVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13510o);
        g.x(parcel, 2, this.p, i5);
        g.x(parcel, 3, this.q, i5);
        g.H(parcel, iE);
    }
}
