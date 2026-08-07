package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends a {
    public static final Parcelable.Creator<M> CREATOR = new C2339c0(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13419o;
    public final String p;

    public M(String str, String str2) {
        this.f13419o = str;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f13419o);
        g.y(parcel, 2, this.p);
        g.H(parcel, iE);
    }
}
