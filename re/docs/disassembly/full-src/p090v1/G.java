package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.InterfaceC0905b6;
import p008b2.a;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC1867x5 implements I {
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 0);
    }

    @Override // p090v1.I
    public final void B0(InterfaceC2347g0 interfaceC2347g0) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, interfaceC2347g0);
        L3(parcelX1, 42);
    }

    @Override // p090v1.I
    public final void F() {
        L3(X1(), 6);
    }

    @Override // p090v1.I
    public final boolean F2(J0 j5) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, j5);
        Parcel parcelO3 = o3(parcelX1, 4);
        boolean z3 = parcelO3.readInt() != 0;
        parcelO3.recycle();
        return z3;
    }

    @Override // p090v1.I
    public final void J2(N n5) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, n5);
        L3(parcelX1, 8);
    }

    @Override // p090v1.I
    public final void K1(a aVar) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        L3(parcelX1, 44);
    }

    @Override // p090v1.I
    public final void N0() {
        L3(X1(), 5);
    }

    @Override // p090v1.I
    public final void Q3(boolean z3) {
        Parcel parcelX1 = X1();
        ClassLoader classLoader = AbstractC1955z5.f10260a;
        parcelX1.writeInt(0);
        L3(parcelX1, 22);
    }

    @Override // p090v1.I
    public final void U1(InterfaceC2368t interfaceC2368t) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, interfaceC2368t);
        L3(parcelX1, 20);
    }

    @Override // p090v1.I
    public final void V1(J0 j5, InterfaceC2373y interfaceC2373y) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, j5);
        AbstractC1955z5.e(parcelX1, interfaceC2373y);
        L3(parcelX1, 43);
    }

    @Override // p090v1.I
    public final void a2(T t) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, t);
        L3(parcelX1, 45);
    }

    @Override // p090v1.I
    public final void d2(P0 p5) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, p5);
        L3(parcelX1, 39);
    }

    @Override // p090v1.I
    public final void f3(boolean z3) {
        Parcel parcelX1 = X1();
        ClassLoader classLoader = AbstractC1955z5.f10260a;
        parcelX1.writeInt(z3 ? 1 : 0);
        L3(parcelX1, 34);
    }

    @Override // p090v1.I
    public final M0 h() {
        Parcel parcelO3 = o3(X1(), 12);
        M0 m5 = (M0) AbstractC1955z5.a(parcelO3, M0.CREATOR);
        parcelO3.recycle();
        return m5;
    }

    @Override // p090v1.I
    public final void h3(G0 g5) {
        throw null;
    }

    @Override // p090v1.I
    public final InterfaceC2357l0 k() {
        InterfaceC2357l0 c2355k0;
        Parcel parcelO3 = o3(X1(), 41);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2355k0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c2355k0 = iInterfaceQueryLocalInterface instanceof InterfaceC2357l0 ? (InterfaceC2357l0) iInterfaceQueryLocalInterface : new C2355k0(strongBinder);
        }
        parcelO3.recycle();
        return c2355k0;
    }

    @Override // p090v1.I
    public final InterfaceC2363o0 m() {
        InterfaceC2363o0 c2359m0;
        Parcel parcelO3 = o3(X1(), 26);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2359m0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c2359m0 = iInterfaceQueryLocalInterface instanceof InterfaceC2363o0 ? (InterfaceC2363o0) iInterfaceQueryLocalInterface : new C2359m0(strongBinder);
        }
        parcelO3.recycle();
        return c2359m0;
    }

    @Override // p090v1.I
    public final a n() {
        return b.i(o3(X1(), 1));
    }

    @Override // p090v1.I
    public final void o1(M0 m5) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.c(parcelX1, m5);
        L3(parcelX1, 13);
    }

    @Override // p090v1.I
    public final void v1(InterfaceC0905b6 interfaceC0905b6) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, interfaceC0905b6);
        L3(parcelX1, 40);
    }

    @Override // p090v1.I
    public final String w() {
        Parcel parcelO3 = o3(X1(), 31);
        String string = parcelO3.readString();
        parcelO3.recycle();
        return string;
    }

    @Override // p090v1.I
    public final void x() {
        L3(X1(), 2);
    }

    @Override // p090v1.I
    public final void y3(InterfaceC2371w interfaceC2371w) {
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, interfaceC2371w);
        L3(parcelX1, 7);
    }
}
