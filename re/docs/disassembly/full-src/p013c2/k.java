package p013c2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import p008b2.a;
import p008b2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractC1867x5 {
    public final a S3(b bVar, String str, int i5, b bVar2) {
        Parcel parcelX1 = X1();
        p059n2.a.c(parcelX1, bVar);
        parcelX1.writeString(str);
        parcelX1.writeInt(i5);
        p059n2.a.c(parcelX1, bVar2);
        return p076s.b.i(R1(parcelX1, 2));
    }

    public final a T3(b bVar, String str, int i5, b bVar2) {
        Parcel parcelX1 = X1();
        p059n2.a.c(parcelX1, bVar);
        parcelX1.writeString(str);
        parcelX1.writeInt(i5);
        p059n2.a.c(parcelX1, bVar2);
        return p076s.b.i(R1(parcelX1, 3));
    }
}
