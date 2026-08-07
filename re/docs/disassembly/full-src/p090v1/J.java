package p090v1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.InterfaceC0697Aa;
import p008b2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC1867x5 {
    public J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 0);
    }

    public final IBinder S3(b bVar, M0 m5, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, bVar);
        AbstractC1955z5.c(parcelX1, m5);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        parcelX1.writeInt(i5);
        Parcel parcelO3 = o3(parcelX1, 2);
        IBinder strongBinder = parcelO3.readStrongBinder();
        parcelO3.recycle();
        return strongBinder;
    }
}
