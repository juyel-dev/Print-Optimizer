package p046k2;

import Q1.d;
import T1.AbstractC0152i;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC0152i {
    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 12451000;
    }

    @Override // T1.AbstractC0148e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // T1.AbstractC0148e
    public final d[] q() {
        return c.f11642c;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // T1.AbstractC0148e
    public final boolean x() {
        return true;
    }
}
