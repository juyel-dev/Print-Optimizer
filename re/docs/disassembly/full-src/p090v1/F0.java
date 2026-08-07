package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 extends a {
    public static final Parcelable.Creator<F0> CREATOR = new C2339c0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13392o;

    public F0(String str) {
        this.f13392o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 15, this.f13392o);
        g.H(parcel, iE);
    }
}
