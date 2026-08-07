package p036i2;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBinder f11534o;

    public c(IBinder iBinder) {
        this.f11534o = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11534o;
    }
}
