package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends AbstractC1867x5 implements Z {
    @Override // p090v1.Z
    public final String b() {
        Parcel parcelO3 = o3(X1(), 1);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }

    @Override // p090v1.Z
    public final String c() {
        Parcel parcelO3 = o3(X1(), 2);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }
}
