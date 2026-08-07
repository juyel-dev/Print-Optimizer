package p078s1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends U1.a {
    public static final Parcelable.Creator<a> CREATOR = new U(18);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12341o;
    public final IBinder p;

    public a(boolean z3, IBinder iBinder) {
        this.f12341o = z3;
        this.p = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f12341o ? 1 : 0);
        g.w(parcel, 2, this.p);
        g.H(parcel, iE);
    }
}
