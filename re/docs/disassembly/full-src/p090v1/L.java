package p090v1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC1867x5 implements N {
    public L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 0);
    }

    @Override // p090v1.N
    public final void e3(String str, String str2) {
        Parcel parcelX1 = X1();
        parcelX1.writeString(str);
        parcelX1.writeString(str2);
        L3(parcelX1, 1);
    }
}
