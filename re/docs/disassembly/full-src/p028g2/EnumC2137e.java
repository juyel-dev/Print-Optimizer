package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: renamed from: g2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2137e implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC2137e> CREATOR = new C0157b(27);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11198o;

    EnumC2137e(String str) {
        this.f11198o = str;
    }

    public static EnumC2137e a(String str) throws C2136d {
        for (EnumC2137e enumC2137e : values()) {
            if (str.equals(enumC2137e.f11198o)) {
                return enumC2137e;
            }
        }
        throw new C2136d(a.z("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11198o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11198o);
    }
}
