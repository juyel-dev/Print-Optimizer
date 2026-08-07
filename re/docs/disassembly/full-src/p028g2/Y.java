package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends a {
    public static final Parcelable.Creator<Y> CREATOR = new U(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f11195o;

    public Y(ArrayList arrayList) {
        z.i(arrayList);
        this.f11195o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y4 = (Y) obj;
        ArrayList arrayList = y4.f11195o;
        ArrayList arrayList2 = this.f11195o;
        return arrayList2.containsAll(arrayList) && y4.f11195o.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f11195o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.D(parcel, 1, this.f11195o);
        g.H(parcel, iE);
    }
}
