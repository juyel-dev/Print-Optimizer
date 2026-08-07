package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends a {
    public static final Parcelable.Creator<O> CREATOR = new C0157b(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11185o;

    public O(String str) {
        z.i(str);
        this.f11185o = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            return this.f11185o.equals(((O) obj).f11185o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11185o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 1, this.f11185o);
        g.H(parcel, iE);
    }
}
