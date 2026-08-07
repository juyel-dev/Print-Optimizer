package p032h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBinder f11441o;

    public b(IBinder iBinder) {
        this.f11441o = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11441o;
    }

    public final Parcel b0(Parcel parcel, int i5) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11441o.transact(i5, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
