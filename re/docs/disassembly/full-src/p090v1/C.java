package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C1694t8;
import com.google.android.gms.internal.ads.Q8;
import com.google.android.gms.internal.ads.S8;
import com.google.android.gms.internal.ads.X8;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC1867x5 implements E {
    public C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 0);
    }

    @Override // p090v1.E
    public final void X0(InterfaceC2371w interfaceC2371w) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, interfaceC2371w);
        L3(parcelX1, 2);
    }

    @Override // p090v1.E
    public final B b() {
        B c2374z;
        Parcel parcelO3 = o3(X1(), 1);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2374z = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c2374z = iInterfaceQueryLocalInterface instanceof B ? (B) iInterfaceQueryLocalInterface : new C2374z(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 0);
        }
        parcelO3.recycle();
        return c2374z;
    }

    @Override // p090v1.E
    public final void g2(X8 x8) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, x8);
        L3(parcelX1, 10);
    }

    @Override // p090v1.E
    public final void r1(C1694t8 c1694t8) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, c1694t8);
        L3(parcelX1, 6);
    }

    @Override // p090v1.E
    public final void y2(String str, S8 s8, Q8 q8) {
        Parcel parcelX1 = X1();
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, s8);
        AbstractC1955z5.e(parcelX1, q8);
        L3(parcelX1, 5);
    }
}
