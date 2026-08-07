package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.InterfaceC0697Aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V extends AbstractBinderC1911y5 implements W {
    public static W asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof W ? (W) iInterfaceQueryLocalInterface : new U(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            x0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC1955z5.d(parcel2, liteSdkVersion);
        } else {
            if (i5 != 2) {
                return false;
            }
            InterfaceC0697Aa adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC1955z5.e(parcel2, adapterCreator);
        }
        return true;
    }
}
