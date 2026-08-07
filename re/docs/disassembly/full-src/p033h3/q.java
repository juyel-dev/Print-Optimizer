package p033h3;

import O1.i;
import U1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013c2.g;
import p028g2.U;
import p036i2.e;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new U(17);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f11485o;
    public C2174e p;
    public e q;

    public q(Bundle bundle) {
        this.f11485o = bundle;
    }

    public final e g() {
        if (this.q == null) {
            Bundle bundle = this.f11485o;
            if (i.x(bundle)) {
                this.q = new e(new i(bundle));
            }
        }
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.u(parcel, 2, this.f11485o);
        g.H(parcel, iE);
    }
}
