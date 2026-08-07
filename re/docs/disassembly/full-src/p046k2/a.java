package p046k2;

import K2.b;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Binder implements f, IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11639o;
    public final /* synthetic */ i p;

    public a(i iVar, int i5) {
        this.f11639o = i5;
        this.p = iVar;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p046k2.f
    public final void g3(Status status) {
        switch (this.f11639o) {
            case 0:
                b.r(status, null, this.p);
                break;
            default:
                b.r(status, null, this.p);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i5, parcel, parcel2, i6)) {
            return true;
        }
        if (i5 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i7 = d.f11643a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC1421mz.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        g3(statusCreateFromParcel);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
