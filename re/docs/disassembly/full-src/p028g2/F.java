package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX INFO: loaded from: classes2.dex */
public enum F implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<F> CREATOR = new C0157b(25);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11177o;

    F(String str) {
        this.f11177o = str;
    }

    public static F a(String str) throws G {
        for (F f5 : values()) {
            if (str.equals(f5.f11177o)) {
                return f5;
            }
        }
        throw new G(a.z("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11177o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f11177o);
    }
}
