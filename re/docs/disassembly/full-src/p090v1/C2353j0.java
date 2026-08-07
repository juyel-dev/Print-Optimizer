package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.BinderC1923ya;
import p008b2.b;

/* JADX INFO: renamed from: v1.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2353j0 extends AbstractC1867x5 {
    public final InterfaceC2351i0 S3(b bVar, BinderC1923ya binderC1923ya) {
        InterfaceC2351i0 c2349h0;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, bVar);
        AbstractC1955z5.e(parcelX1, binderC1923ya);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 1);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2349h0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c2349h0 = iInterfaceQueryLocalInterface instanceof InterfaceC2351i0 ? (InterfaceC2351i0) iInterfaceQueryLocalInterface : new C2349h0(strongBinder);
        }
        parcelO3.recycle();
        return c2349h0;
    }
}
