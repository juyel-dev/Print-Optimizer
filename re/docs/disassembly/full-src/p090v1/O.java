package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC0717Db;
import com.google.android.gms.internal.ads.AbstractBinderC0718Dc;
import com.google.android.gms.internal.ads.AbstractBinderC1487od;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C0711Cb;
import com.google.android.gms.internal.ads.C0712Cc;
import com.google.android.gms.internal.ads.C1443nd;
import com.google.android.gms.internal.ads.C1880xb;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.E8;
import com.google.android.gms.internal.ads.F8;
import com.google.android.gms.internal.ads.InterfaceC0697Aa;
import com.google.android.gms.internal.ads.InterfaceC0723Eb;
import com.google.android.gms.internal.ads.InterfaceC0724Ec;
import com.google.android.gms.internal.ads.InterfaceC1531pd;
import com.google.android.gms.internal.ads.InterfaceC1924yb;
import com.google.android.gms.internal.ads.Om;
import p008b2.a;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC1867x5 implements P {
    @Override // p090v1.P
    public final InterfaceC2351i0 C1(a aVar, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        InterfaceC2351i0 c2349h0;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 17);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c2349h0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c2349h0 = iInterfaceQueryLocalInterface instanceof InterfaceC2351i0 ? (InterfaceC2351i0) iInterfaceQueryLocalInterface : new C2349h0(strongBinder);
        }
        parcelO3.recycle();
        return c2349h0;
    }

    @Override // p090v1.P
    public final I G1(a aVar, M0 m5, String str, int i5) {
        I g;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.c(parcelX1, m5);
        parcelX1.writeString(str);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 10);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
        }
        parcelO3.recycle();
        return g;
    }

    @Override // p090v1.P
    public final I K3(a aVar, M0 m5, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        I g;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.c(parcelX1, m5);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 2);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
        }
        parcelO3.recycle();
        return g;
    }

    @Override // p090v1.P
    public final InterfaceC0723Eb L(a aVar) {
        InterfaceC0723Eb c0711Cb;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        Parcel parcelO3 = o3(parcelX1, 8);
        IBinder strongBinder = parcelO3.readStrongBinder();
        int i5 = AbstractBinderC0717Db.f3153o;
        if (strongBinder == null) {
            c0711Cb = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c0711Cb = iInterfaceQueryLocalInterface instanceof InterfaceC0723Eb ? (InterfaceC0723Eb) iInterfaceQueryLocalInterface : new C0711Cb(strongBinder);
        }
        parcelO3.recycle();
        return c0711Cb;
    }

    @Override // p090v1.P
    public final InterfaceC0724Ec N1(a aVar, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        InterfaceC0724Ec c0712Cc;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 12);
        IBinder strongBinder = parcelO3.readStrongBinder();
        int i6 = AbstractBinderC0718Dc.f3154o;
        if (strongBinder == null) {
            c0712Cc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c0712Cc = iInterfaceQueryLocalInterface instanceof InterfaceC0724Ec ? (InterfaceC0724Ec) iInterfaceQueryLocalInterface : new C0712Cc(strongBinder);
        }
        parcelO3.recycle();
        return c0712Cc;
    }

    @Override // p090v1.P
    public final I S2(a aVar, M0 m5, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        I g;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.c(parcelX1, m5);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 13);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
        }
        parcelO3.recycle();
        return g;
    }

    @Override // p090v1.P
    public final InterfaceC1924yb c3(a aVar, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        InterfaceC1924yb c1880xb;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 15);
        IBinder strongBinder = parcelO3.readStrongBinder();
        int i6 = Om.f5257w;
        if (strongBinder == null) {
            c1880xb = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c1880xb = iInterfaceQueryLocalInterface instanceof InterfaceC1924yb ? (InterfaceC1924yb) iInterfaceQueryLocalInterface : new C1880xb(strongBinder);
        }
        parcelO3.recycle();
        return c1880xb;
    }

    @Override // p090v1.P
    public final F8 j2(a aVar, a aVar2) {
        F8 d8;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.e(parcelX1, aVar2);
        Parcel parcelO3 = o3(parcelX1, 5);
        IBinder strongBinder = parcelO3.readStrongBinder();
        int i5 = E8.f3255o;
        if (strongBinder == null) {
            d8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            d8 = iInterfaceQueryLocalInterface instanceof F8 ? (F8) iInterfaceQueryLocalInterface : new D8(strongBinder);
        }
        parcelO3.recycle();
        return d8;
    }

    @Override // p090v1.P
    public final InterfaceC1531pd l1(a aVar, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        InterfaceC1531pd c1443nd;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 14);
        IBinder strongBinder = parcelO3.readStrongBinder();
        int i6 = AbstractBinderC1487od.f8594o;
        if (strongBinder == null) {
            c1443nd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c1443nd = iInterfaceQueryLocalInterface instanceof InterfaceC1531pd ? (InterfaceC1531pd) iInterfaceQueryLocalInterface : new C1443nd(strongBinder);
        }
        parcelO3.recycle();
        return c1443nd;
    }

    @Override // p090v1.P
    public final I n3(a aVar, M0 m5, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        I g;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        AbstractC1955z5.c(parcelX1, m5);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 1);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            g = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
        }
        parcelO3.recycle();
        return g;
    }

    @Override // p090v1.P
    public final E x3(a aVar, String str, InterfaceC0697Aa interfaceC0697Aa, int i5) {
        E c5;
        Parcel parcelX1 = X1();
        AbstractC1955z5.e(parcelX1, aVar);
        parcelX1.writeString(str);
        AbstractC1955z5.e(parcelX1, interfaceC0697Aa);
        parcelX1.writeInt(240304000);
        Parcel parcelO3 = o3(parcelX1, 3);
        IBinder strongBinder = parcelO3.readStrongBinder();
        if (strongBinder == null) {
            c5 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            c5 = iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new C(strongBinder);
        }
        parcelO3.recycle();
        return c5;
    }
}
