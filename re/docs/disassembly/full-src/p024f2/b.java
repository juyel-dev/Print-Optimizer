package p024f2;

import J1.c;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import p036i2.a;
import p064o2.AbstractC2207j;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Binder implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11150o;
    public final /* synthetic */ Object p;

    public b(i iVar, int i5) {
        this.f11150o = i5;
        switch (i5) {
            case 1:
                this.p = iVar;
                attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
                break;
            default:
                this.p = iVar;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i5 = this.f11150o;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
        p062o0.b bVar = null;
        p062o0.b bVar2 = null;
        int i7 = 0;
        switch (this.f11150o) {
            case 0:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i6)) {
                    return true;
                }
                if (i5 == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i8 = AbstractC2207j.f12139a;
                    Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC1421mz.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    K2.b.r(statusCreateFromParcel, pendingIntent, (i) this.p);
                    i7 = 1;
                }
                return i7;
            case 1:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i6)) {
                    return true;
                }
                if (i5 == 1) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i9 = a.f11533a;
                    Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                    K2.b.r(statusCreateFromParcel2, cVarCreateFromParcel != null ? new J1.b(cVarCreateFromParcel.f584o, cVarCreateFromParcel.p) : null, (i) this.p);
                    i7 = 1;
                }
                return i7;
            default:
                if (i5 == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p062o0.b)) {
                            bVar2 = new p062o0.b();
                            bVar2.f12056o = strongBinder;
                        } else {
                            bVar2 = (p062o0.b) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string = parcel.readString();
                    if (string != null) {
                        synchronized (((MultiInstanceInvalidationService) this.p).q) {
                            try {
                                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.p;
                                int i10 = multiInstanceInvalidationService.f2365o + 1;
                                multiInstanceInvalidationService.f2365o = i10;
                                if (multiInstanceInvalidationService.q.register(bVar2, Integer.valueOf(i10))) {
                                    ((MultiInstanceInvalidationService) this.p).p.put(Integer.valueOf(i10), string);
                                    i7 = i10;
                                } else {
                                    ((MultiInstanceInvalidationService) this.p).f2365o--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i7);
                    return true;
                }
                if (i5 == 2) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof p062o0.b)) {
                            bVar = new p062o0.b();
                            bVar.f12056o = strongBinder2;
                        } else {
                            bVar = (p062o0.b) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i11 = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.p).q) {
                        ((MultiInstanceInvalidationService) this.p).q.unregister(bVar);
                        ((MultiInstanceInvalidationService) this.p).p.remove(Integer.valueOf(i11));
                        break;
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i5 != 3) {
                    if (i5 != 1598968902) {
                        return super.onTransact(i5, parcel, parcel2, i6);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int i12 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                synchronized (((MultiInstanceInvalidationService) this.p).q) {
                    try {
                        String str = (String) ((MultiInstanceInvalidationService) this.p).p.get(Integer.valueOf(i12));
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = ((MultiInstanceInvalidationService) this.p).q.beginBroadcast();
                        while (i7 < iBeginBroadcast) {
                            try {
                                Integer num = (Integer) ((MultiInstanceInvalidationService) this.p).q.getBroadcastCookie(i7);
                                int iIntValue = num.intValue();
                                String str2 = (String) ((MultiInstanceInvalidationService) this.p).p.get(num);
                                if (i12 != iIntValue && str.equals(str2)) {
                                    try {
                                        ((p062o0.b) ((MultiInstanceInvalidationService) this.p).q.getBroadcastItem(i7)).b0(strArrCreateStringArray);
                                    } catch (RemoteException e) {
                                        Log.w("ROOM", "Error invoking a remote callback", e);
                                    }
                                }
                                i7++;
                            } catch (Throwable th2) {
                                ((MultiInstanceInvalidationService) this.p).q.finishBroadcast();
                                throw th2;
                            }
                        }
                        ((MultiInstanceInvalidationService) this.p).q.finishBroadcast();
                        return true;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }

    public b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f11150o = 2;
        this.p = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
