package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;

/* JADX INFO: renamed from: v1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2364p extends AbstractBinderC1911y5 implements InterfaceC2368t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2334a f13479o;

    public BinderC2364p(InterfaceC2334a interfaceC2334a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f13479o = interfaceC2334a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        o();
        parcel2.writeNoException();
        return true;
    }

    @Override // p090v1.InterfaceC2368t
    public final void o() {
        this.f13479o.I();
    }
}
