package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: renamed from: v1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2337b0 extends AbstractBinderC1911y5 implements InterfaceC2341d0 {
    public AbstractBinderC2337b0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        t0 t0Var = (t0) AbstractC1955z5.a(parcel, t0.CREATOR);
        AbstractC1955z5.b(parcel);
        y0(t0Var);
        parcel2.writeNoException();
        return true;
    }
}
