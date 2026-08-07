package p082t2;

import U1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new C2229d(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f12826o;

    public r(Bundle bundle) {
        this.f12826o = bundle;
    }

    public final Double g() {
        return Double.valueOf(this.f12826o.getDouble("value"));
    }

    public final Bundle i() {
        return new Bundle(this.f12826o);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2262u c2262u = new C2262u();
        c2262u.f12860o = this.f12826o.keySet().iterator();
        return c2262u;
    }

    public final String k() {
        return this.f12826o.getString("currency");
    }

    public final String toString() {
        return this.f12826o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.u(parcel, 2, i());
        g.H(parcel, iE);
    }
}
