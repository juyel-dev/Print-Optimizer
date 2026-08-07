package p091v2;

import A2.d;
import S1.y;
import android.os.Parcel;
import com.razorpay.AppSignatureHelper;
import p050l2.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends d {
    @Override // A2.d
    public final boolean R1(int i5, Parcel parcel, Parcel parcel2) {
        switch (i5) {
            case 3:
                a.b(parcel);
                break;
            case 4:
                a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                a.b(parcel);
                break;
            case 7:
                a.b(parcel);
                break;
            case 8:
                f fVar = (f) a.a(parcel, f.CREATOR);
                a.b(parcel);
                y yVar = (y) this;
                yVar.q.post(new J2.a(8, yVar, false, fVar));
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
