package p046k2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBinder f11644o;

    public e(IBinder iBinder) {
        this.f11644o = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11644o;
    }

    public final void b0(Parcel parcel, int i5) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f11644o.transact(i5, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
