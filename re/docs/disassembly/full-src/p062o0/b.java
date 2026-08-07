package p062o0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IBinder f12056o;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12056o;
    }

    public final void b0(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f12056o.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
