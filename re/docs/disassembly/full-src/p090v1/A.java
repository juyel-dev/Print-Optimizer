package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends AbstractBinderC1911y5 implements B {
    public A() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            J0 j5 = (J0) AbstractC1955z5.a(parcel, J0.CREATOR);
            AbstractC1955z5.b(parcel);
            b1(j5);
            parcel2.writeNoException();
        } else if (i5 == 2) {
            String strB = b();
            parcel2.writeNoException();
            parcel2.writeString(strB);
        } else if (i5 == 3) {
            boolean zF = f();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC1955z5.f10260a;
            parcel2.writeInt(zF ? 1 : 0);
        } else if (i5 == 4) {
            String strC = c();
            parcel2.writeNoException();
            parcel2.writeString(strC);
        } else {
            if (i5 != 5) {
                return false;
            }
            J0 j6 = (J0) AbstractC1955z5.a(parcel, J0.CREATOR);
            int i6 = parcel.readInt();
            AbstractC1955z5.b(parcel);
            m3(j6, i6);
            parcel2.writeNoException();
        }
        return true;
    }
}
