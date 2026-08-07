package p043k;

import D.a;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.internal.ads.G7;
import com.google.android.gms.internal.ads.Gp;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f11608o;
    public final /* synthetic */ G7 p;

    public c(G7 g7) {
        this.p = g7;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f11608o = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
        Bundle bundleB;
        if (i5 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        Handler handler = this.f11608o;
        G7 g7 = this.p;
        switch (i5) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int i7 = parcel.readInt();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (g7 != null) {
                    handler.post(new a(this, i7, bundleB));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string = parcel.readString();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (g7 != null) {
                    handler.post(new a(this, string, bundleB));
                }
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (g7 != null) {
                    handler.post(new a(this, bundleB));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String string2 = parcel.readString();
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (g7 != null) {
                    handler.post(new Gp(this, string2, bundleB, 9));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int i8 = parcel.readInt();
                Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                boolean z3 = parcel.readInt() != 0;
                bundleB = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                if (g7 != null) {
                    handler.post(new b(this, i8, uri, z3, bundleB));
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                bundleB = g7 != null ? g7.b() : null;
                parcel2.writeNoException();
                if (bundleB != null) {
                    parcel2.writeInt(1);
                    bundleB.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            default:
                return super.onTransact(i5, parcel, parcel2, i6);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
