package p090v1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: v1.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2355k0 extends AbstractC1867x5 implements InterfaceC2357l0 {
    public C2355k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 0);
    }

    @Override // p090v1.InterfaceC2357l0
    public final Bundle b() {
        Parcel parcelO3 = o3(X1(), 5);
        Bundle bundle = (Bundle) AbstractC1955z5.a(parcelO3, Bundle.CREATOR);
        parcelO3.recycle();
        return bundle;
    }

    @Override // p090v1.InterfaceC2357l0
    public final O0 c() {
        Parcel parcelO3 = o3(X1(), 4);
        O0 o5 = (O0) AbstractC1955z5.a(parcelO3, O0.CREATOR);
        parcelO3.recycle();
        return o5;
    }

    @Override // p090v1.InterfaceC2357l0
    public final String d() {
        Parcel parcelO3 = o3(X1(), 6);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }

    @Override // p090v1.InterfaceC2357l0
    public final String f() {
        Parcel parcelO3 = o3(X1(), 2);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }

    @Override // p090v1.InterfaceC2357l0
    public final String h() {
        Parcel parcelO3 = o3(X1(), 1);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }

    @Override // p090v1.InterfaceC2357l0
    public final List j() {
        Parcel parcelO3 = o3(X1(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelO3.createTypedArrayList(O0.CREATOR);
        parcelO3.recycle();
        return arrayListCreateTypedArrayList;
    }
}
