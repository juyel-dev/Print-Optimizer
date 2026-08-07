package p105y1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import p008b2.a;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC1867x5 implements v {
    @Override // p105y1.v
    public final void zze(a aVar) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        L3(parcelX1, 2);
    }

    @Override // p105y1.v
    public final boolean zzf(a aVar, String str, String str2) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        parcelX1.writeString(str);
        parcelX1.writeString(str2);
        Parcel parcelO3 = o3(parcelX1, 1);
        boolean z3 = parcelO3.readInt() != 0;
        parcelO3.recycle();
        return z3;
    }

    @Override // p105y1.v
    public final boolean zzg(a aVar, p095w1.a aVar2) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.c(parcelX1, aVar2);
        Parcel parcelO3 = o3(parcelX1, 3);
        boolean z3 = parcelO3.readInt() != 0;
        parcelO3.recycle();
        return z3;
    }
}
