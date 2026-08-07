package p090v1;

import P1.l;
import U1.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p067p1.i;
import p067p1.m;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends a {
    public static final Parcelable.Creator<t0> CREATOR = new C2339c0(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13495o;
    public final String p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t0 f13496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IBinder f13497s;

    public t0(int i5, String str, String str2, t0 t0Var, IBinder iBinder) {
        this.f13495o = i5;
        this.p = str;
        this.q = str2;
        this.f13496r = t0Var;
        this.f13497s = iBinder;
    }

    public final l g() {
        t0 t0Var = this.f13496r;
        return new l(this.f13495o, this.p, this.q, t0Var != null ? new l(t0Var.f13495o, t0Var.p, t0Var.q, null) : null);
    }

    public final i i() {
        l lVar;
        InterfaceC2357l0 c2355k0;
        t0 t0Var = this.f13496r;
        if (t0Var == null) {
            lVar = null;
        } else {
            lVar = new l(t0Var.f13495o, t0Var.p, t0Var.q, null);
        }
        IBinder iBinder = this.f13497s;
        if (iBinder == null) {
            c2355k0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c2355k0 = iInterfaceQueryLocalInterface instanceof InterfaceC2357l0 ? (InterfaceC2357l0) iInterfaceQueryLocalInterface : new C2355k0(iBinder);
        }
        return new i(this.f13495o, this.p, this.q, lVar, c2355k0 != null ? new m(c2355k0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13495o);
        g.y(parcel, 2, this.p);
        g.y(parcel, 3, this.q);
        g.x(parcel, 4, this.f13496r, i5);
        g.w(parcel, 5, this.f13497s);
        g.H(parcel, iE);
    }
}
