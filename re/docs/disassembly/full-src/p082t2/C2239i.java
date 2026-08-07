package p082t2;

import U1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: renamed from: t2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2239i extends a {
    public static final Parcelable.Creator<C2239i> CREATOR = new C2229d(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f12697o;

    public C2239i(Bundle bundle) {
        this.f12697o = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.u(parcel, 1, this.f12697o);
        g.H(parcel, iE);
    }
}
