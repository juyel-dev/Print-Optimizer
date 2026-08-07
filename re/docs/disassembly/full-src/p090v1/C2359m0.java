package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: renamed from: v1.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2359m0 extends AbstractC1867x5 implements InterfaceC2363o0 {
    public C2359m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 0);
    }

    @Override // p090v1.InterfaceC2363o0
    public final void C2(C2365p0 c2365p0) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, c2365p0);
        L3(parcelX1, 8);
    }

    @Override // p090v1.InterfaceC2363o0
    public final float b() {
        throw null;
    }

    @Override // p090v1.InterfaceC2363o0
    public final float c() {
        throw null;
    }

    @Override // p090v1.InterfaceC2363o0
    public final C2365p0 f() {
        C2365p0 c2365p0;
        Parcel parcelO3 = o3(X1(), 11);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2365p0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c2365p0 = iInterfaceQueryLocalInterface instanceof C2365p0 ? (C2365p0) iInterfaceQueryLocalInterface : new C2365p0(strongBinder);
        }
        parcelO3.recycle();
        return c2365p0;
    }

    @Override // p090v1.InterfaceC2363o0
    public final float h() {
        throw null;
    }
}
