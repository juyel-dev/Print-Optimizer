package p036i2;

import Q1.d;
import T1.AbstractC0152i;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0152i {
    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 212800000;
    }

    @Override // T1.AbstractC0148e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // T1.AbstractC0148e
    public final d[] q() {
        return J1.d.f586b;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // T1.AbstractC0148e
    public final boolean w() {
        return true;
    }
}
