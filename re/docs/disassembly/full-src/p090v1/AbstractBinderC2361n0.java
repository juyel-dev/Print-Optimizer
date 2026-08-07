package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.compose.ui.graphics.Matrix;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: renamed from: v1.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2361n0 extends AbstractBinderC1911y5 implements InterfaceC2363o0 {
    public AbstractBinderC2361n0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC2363o0 S3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2363o0 ? (InterfaceC2363o0) iInterfaceQueryLocalInterface : new C2359m0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        C2365p0 c2365p0;
        switch (i5) {
            case 1:
                j0();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zF = AbstractC1955z5.f(parcel);
                AbstractC1955z5.b(parcel);
                d1(zF);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zT = t();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1955z5.f10260a;
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 5:
                int iD = d();
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 6:
                float fH = h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 7:
                float fC = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2365p0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c2365p0 = iInterfaceQueryLocalInterface instanceof C2365p0 ? (C2365p0) iInterfaceQueryLocalInterface : new C2365p0(strongBinder);
                }
                AbstractC1955z5.b(parcel);
                C2(c2365p0);
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                float fB = b();
                parcel2.writeNoException();
                parcel2.writeFloat(fB);
                return true;
            case 10:
                boolean zP = p();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1955z5.f10260a;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                C2365p0 c2365p0F = f();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, c2365p0F);
                return true;
            case Matrix.TranslateX /* 12 */:
                boolean zR = r();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC1955z5.f10260a;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case Matrix.TranslateY /* 13 */:
                T();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
