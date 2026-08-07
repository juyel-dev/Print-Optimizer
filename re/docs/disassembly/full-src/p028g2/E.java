package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: loaded from: classes2.dex */
public enum E implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<E> CREATOR = new C0157b(23);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11176o;

    E(String str) {
        this.f11176o = str;
    }

    public static E a(String str) {
        for (E e : values()) {
            if (str.equals(e.f11176o)) {
                return e;
            }
        }
        throw new D(a.z("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11176o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11176o);
    }
}
