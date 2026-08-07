package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends a {
    public static final Parcelable.Creator<S> CREATOR = new C0157b(24);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11189o;

    public S(String str) {
        this.f11189o = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return z.m(this.f11189o, ((S) obj).f11189o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11189o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f11189o);
        g.H(parcel, iE);
    }
}
