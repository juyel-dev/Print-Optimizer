package p005b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p043k.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IBinder f2400o;

    public final boolean R1() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeLong(0L);
            if (!this.f2400o.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i5 = b.f2401o;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2400o;
    }

    public final boolean b0(c cVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongBinder(cVar);
            if (!this.f2400o.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i5 = b.f2401o;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final int c0(c cVar, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongBinder(cVar);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.f2400o.transact(8, parcelObtain, parcelObtain2, 0)) {
                int i5 = b.f2401o;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean i0(c cVar, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongBinder(cVar);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f2400o.transact(7, parcelObtain, parcelObtain2, 0)) {
                int i5 = b.f2401o;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
