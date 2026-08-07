package p028g2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public enum r implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<r> CREATOR = new U(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11230o;

    r(int i5) {
        this.f11230o = i5;
    }

    public static r a(int i5) throws C2149q {
        for (r rVar : values()) {
            if (i5 == rVar.f11230o) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new C2149q(a.k("Error code ", i5, " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f11230o);
    }
}
