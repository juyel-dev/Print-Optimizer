package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: loaded from: classes2.dex */
public enum J implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<J> CREATOR = new C0157b(29);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11180o;

    J(String str) {
        this.f11180o = str;
    }

    public static J a(String str) throws T {
        for (J j5 : values()) {
            if (str.equals(j5.f11180o)) {
                return j5;
            }
        }
        throw new T(a.z("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11180o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11180o);
    }
}
