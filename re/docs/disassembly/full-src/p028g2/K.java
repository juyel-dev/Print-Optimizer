package p028g2;

import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends a {
    public static final Parcelable.Creator<K> CREATOR = new U(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f11181o;

    public K(ArrayList arrayList) {
        this.f11181o = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        ArrayList arrayList2 = this.f11181o;
        return (arrayList2 == null && k3.f11181o == null) || (arrayList2 != null && (arrayList = k3.f11181o) != null && arrayList2.containsAll(arrayList) && k3.f11181o.containsAll(arrayList2));
    }

    public final JSONArray g() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f11181o;
            if (arrayList != null) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    L l5 = (L) arrayList.get(i5);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l5.q);
                    jSONArray2.put((int) l5.p);
                    jSONArray2.put((int) l5.q);
                    jSONArray.put(i5, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    public final int hashCode() {
        ArrayList arrayList = this.f11181o;
        return Arrays.hashCode(new Object[]{arrayList == null ? null : new HashSet(arrayList)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.D(parcel, 1, this.f11181o);
        g.H(parcel, iE);
    }
}
