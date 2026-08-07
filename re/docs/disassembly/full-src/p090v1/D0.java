package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends AbstractBinderC1911y5 implements InterfaceC2347g0 {
    public D0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static InterfaceC2347g0 S3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2347g0 ? (InterfaceC2347g0) iInterfaceQueryLocalInterface : new C2345f0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            AbstractC1955z5.b(parcel);
            parcel2.writeNoException();
        } else {
            if (i5 != 2) {
                return false;
            }
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC1955z5.f10260a;
            parcel2.writeInt(1);
        }
        return true;
    }

    @Override // p090v1.InterfaceC2347g0
    public final boolean c() {
        return true;
    }

    @Override // p090v1.InterfaceC2347g0
    public final void N2(N0 n1) {
    }
}
