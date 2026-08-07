package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: renamed from: g2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2135c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC2135c> CREATOR = new C0157b(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11197o;

    EnumC2135c(String str) {
        this.f11197o = str;
    }

    public static EnumC2135c a(String str) {
        for (EnumC2135c enumC2135c : values()) {
            if (str.equals(enumC2135c.f11197o)) {
                return enumC2135c;
            }
        }
        throw new C2134b(a.z("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11197o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11197o);
    }
}
