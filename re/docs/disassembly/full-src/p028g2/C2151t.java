package p028g2;

import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: renamed from: g2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2151t extends a {
    public static final Parcelable.Creator<C2151t> CREATOR = new C0157b(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11232o;

    public C2151t(boolean z3) {
        this.f11232o = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2151t) {
            return this.f11232o == ((C2151t) obj).f11232o;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11232o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11232o ? 1 : 0);
        g.H(parcel, iE);
    }
}
