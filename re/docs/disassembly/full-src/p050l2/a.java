package p050l2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11837a = 0;

    static {
        a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC1421mz.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
