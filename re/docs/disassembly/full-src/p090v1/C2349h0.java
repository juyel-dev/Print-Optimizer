package p090v1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import p008b2.a;

/* JADX INFO: renamed from: v1.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2349h0 extends AbstractC1867x5 implements InterfaceC2351i0 {
    public C2349h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 0);
    }

    @Override // p090v1.InterfaceC2351i0
    public final void B1(String str, a aVar, a aVar2) {
        Parcel parcelX1 = X1();
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.e(parcelX1, aVar2);
        L3(parcelX1, 1);
    }
}
