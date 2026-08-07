package p064o2;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBinder f12153o;
    public final String p;

    public r0(IBinder iBinder, String str) {
        this.f12153o = iBinder;
        this.p = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12153o;
    }
}
