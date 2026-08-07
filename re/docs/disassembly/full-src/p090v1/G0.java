package p090v1;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C1131gE;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends a {
    public static final Parcelable.Creator<G0> CREATOR = new C2339c0(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13393o;
    public final boolean p;
    public final boolean q;

    public G0(C1131gE c1131gE) {
        this(c1131gE.f7426a, c1131gE.f7427b, c1131gE.f7428c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.f13393o ? 1 : 0);
        g.I(parcel, 3, 4);
        parcel.writeInt(this.p ? 1 : 0);
        g.I(parcel, 4, 4);
        parcel.writeInt(this.q ? 1 : 0);
        g.H(parcel, iE);
    }

    public G0(boolean z3, boolean z4, boolean z5) {
        this.f13393o = z3;
        this.p = z4;
        this.q = z5;
    }
}
