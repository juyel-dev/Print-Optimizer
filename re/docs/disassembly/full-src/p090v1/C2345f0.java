package p090v1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: renamed from: v1.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2345f0 extends AbstractC1867x5 implements InterfaceC2347g0 {
    public C2345f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 0);
    }

    @Override // p090v1.InterfaceC2347g0
    public final void N2(N0 n1) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, n1);
        L3(parcelX1, 1);
    }

    @Override // p090v1.InterfaceC2347g0
    public final boolean c() {
        Parcel parcelO3 = o3(X1(), 2);
        ClassLoader classLoader = AbstractC1955z5.f10260a;
        boolean z3 = parcelO3.readInt() != 0;
        parcelO3.recycle();
        return z3;
    }
}
