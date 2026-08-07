package p105y1;

import android.os.Parcel;
import android.os.Parcelable;
import p003a2.a;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK = a.K(parcel);
        int iF = 0;
        String strL = null;
        while (parcel.dataPosition() < iK) {
            int i5 = parcel.readInt();
            char c5 = (char) i5;
            if (c5 == 1) {
                strL = a.l(parcel, i5);
            } else if (c5 != 2) {
                a.I(parcel, i5);
            } else {
                iF = a.F(parcel, i5);
            }
        }
        a.t(parcel, iK);
        return new m(strL, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new m[i5];
    }
}
