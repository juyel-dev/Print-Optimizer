package p028g2;

import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends a {
    public static final Parcelable.Creator<I> CREATOR = new C0157b(28);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11179o;

    public I(boolean z3) {
        this.f11179o = z3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof I) && this.f11179o == ((I) obj).f11179o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11179o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11179o ? 1 : 0);
        g.H(parcel, iE);
    }
}
