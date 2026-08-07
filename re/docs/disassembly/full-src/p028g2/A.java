package p028g2;

import W.C0157b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    A EF5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ A[] f11172o = {new A("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<A> CREATOR = new C0157b(21);

    public static A a(String str) throws C2157z {
        for (A a5 : values()) {
            a5.getClass();
            if (str.equals("public-key")) {
                return a5;
            }
        }
        throw new C2157z(a.z("PublicKeyCredentialType ", str, " not supported"));
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f11172o.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString("public-key");
    }
}
