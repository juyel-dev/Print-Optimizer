package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: renamed from: v1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2370v extends AbstractBinderC1911y5 implements InterfaceC2371w {
    public AbstractBinderC2370v() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        switch (i5) {
            case 1:
                i();
                break;
            case 2:
                int i6 = parcel.readInt();
                AbstractC1955z5.b(parcel);
                A(i6);
                break;
            case 3:
                break;
            case 4:
                f();
                break;
            case 5:
                j();
                break;
            case 6:
                l();
                break;
            case 7:
                h();
                break;
            case 8:
                t0 t0Var = (t0) AbstractC1955z5.a(parcel, t0.CREATOR);
                AbstractC1955z5.b(parcel);
                a(t0Var);
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
