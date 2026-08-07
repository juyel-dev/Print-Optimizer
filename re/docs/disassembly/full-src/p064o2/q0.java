package p064o2;

import Q1.d;
import T1.AbstractC0152i;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import d2.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends AbstractC0152i {
    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 13000000;
    }

    @Override // T1.AbstractC0148e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof r0 ? (r0) iInterfaceQueryLocalInterface : new r0(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // T1.AbstractC0148e
    public final d[] q() {
        return new d[]{a.f11023b, a.f11022a};
    }

    @Override // T1.AbstractC0148e
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // T1.AbstractC0148e
    public final boolean x() {
        return true;
    }
}
