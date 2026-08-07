package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends AbstractBinderC1911y5 implements Z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13500o;
    public final String p;

    public w0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f13500o = str;
        this.p = str2;
    }

    public static Z S3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof Z ? (Z) iInterfaceQueryLocalInterface : new Y(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f13500o);
        } else {
            if (i5 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.p);
        }
        return true;
    }

    @Override // p090v1.Z
    public final String b() {
        return this.f13500o;
    }

    @Override // p090v1.Z
    public final String c() {
        return this.p;
    }
}
