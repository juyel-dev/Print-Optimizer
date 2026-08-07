package p095w1;

import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends U1.a {
    public static final Parcelable.Creator<a> CREATOR = new U(24);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13593o;
    public final String p;
    public final String q;

    public a(String str, String str2, String str3) {
        this.f13593o = str;
        this.p = str2;
        this.q = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f13593o);
        g.y(parcel, 2, this.p);
        g.y(parcel, 3, this.q);
        g.H(parcel, iE);
    }
}
