package p090v1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;

/* JADX INFO: renamed from: v1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2369u extends AbstractC1867x5 implements InterfaceC2371w {
    public C2369u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 0);
    }

    @Override // p090v1.InterfaceC2371w
    public final void A(int i5) {
        Parcel parcelX1 = X1();
        parcelX1.writeInt(i5);
        L3(parcelX1, 2);
    }

    @Override // p090v1.InterfaceC2371w
    public final void a(t0 t0Var) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, t0Var);
        L3(parcelX1, 8);
    }

    @Override // p090v1.InterfaceC2371w
    public final void d() {
        L3(X1(), 3);
    }

    @Override // p090v1.InterfaceC2371w
    public final void f() {
        L3(X1(), 4);
    }

    @Override // p090v1.InterfaceC2371w
    public final void h() {
        L3(X1(), 7);
    }

    @Override // p090v1.InterfaceC2371w
    public final void i() {
        L3(X1(), 1);
    }

    @Override // p090v1.InterfaceC2371w
    public final void j() {
        L3(X1(), 5);
    }

    @Override // p090v1.InterfaceC2371w
    public final void k() {
        L3(X1(), 9);
    }

    @Override // p090v1.InterfaceC2371w
    public final void l() {
        L3(X1(), 6);
    }
}
