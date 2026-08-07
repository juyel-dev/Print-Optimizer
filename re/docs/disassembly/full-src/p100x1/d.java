package p100x1;

import U1.a;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p008b2.b;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new U(26);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13696o;
    public final String p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f13697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13698s;
    public final String t;
    public final String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Intent f13699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f13700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f13701x;

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z3) {
        this.f13696o = str;
        this.p = str2;
        this.q = str3;
        this.f13697r = str4;
        this.f13698s = str5;
        this.t = str6;
        this.u = str7;
        this.f13699v = intent;
        this.f13700w = (m) b.o3(b.P2(iBinder));
        this.f13701x = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f13696o);
        g.y(parcel, 3, this.p);
        g.y(parcel, 4, this.q);
        g.y(parcel, 5, this.f13697r);
        g.y(parcel, 6, this.f13698s);
        g.y(parcel, 7, this.t);
        g.y(parcel, 8, this.u);
        g.x(parcel, 9, this.f13699v, i5);
        g.w(parcel, 10, new b(this.f13700w));
        g.I(parcel, 11, 4);
        parcel.writeInt(this.f13701x ? 1 : 0);
        g.H(parcel, iE);
    }

    public d(Intent intent, m mVar) {
        this(null, null, null, null, null, null, null, intent, new b(mVar), false);
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, m mVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(mVar), false);
    }
}
