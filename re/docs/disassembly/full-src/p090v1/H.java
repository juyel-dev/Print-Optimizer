package p090v1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C0861a6;
import com.google.android.gms.internal.ads.C1705tc;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.InterfaceC0753Jb;
import com.google.android.gms.internal.ads.InterfaceC0759Kb;
import com.google.android.gms.internal.ads.InterfaceC0905b6;
import com.razorpay.AppSignatureHelper;
import p008b2.a;
import p008b2.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H extends AbstractBinderC1911y5 implements I {
    public H() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        InterfaceC2371w c2369u = null;
        T s2 = null;
        InterfaceC2373y c2372x = null;
        InterfaceC2347g0 c2345f0 = null;
        InterfaceC0905b6 c0861a6 = null;
        C1705tc c1705tc = null;
        Q q = null;
        InterfaceC2368t c2367s = null;
        E7 e7 = null;
        N l5 = null;
        switch (i5) {
            case 1:
                a aVarN = n();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, aVarN);
                return true;
            case 2:
                x();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG3 = G3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1955z5.f10260a;
                parcel2.writeInt(zG3 ? 1 : 0);
                return true;
            case 4:
                J0 j5 = (J0) AbstractC1955z5.a(parcel, J0.CREATOR);
                AbstractC1955z5.b(parcel);
                boolean zF2 = F2(j5);
                parcel2.writeNoException();
                parcel2.writeInt(zF2 ? 1 : 0);
                return true;
            case 5:
                N0();
                parcel2.writeNoException();
                return true;
            case 6:
                F();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c2369u = iInterfaceQueryLocalInterface instanceof InterfaceC2371w ? (InterfaceC2371w) iInterfaceQueryLocalInterface : new C2369u(strongBinder);
                }
                AbstractC1955z5.b(parcel);
                y3(c2369u);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    l5 = iInterfaceQueryLocalInterface2 instanceof N ? (N) iInterfaceQueryLocalInterface2 : new L(strongBinder2);
                }
                AbstractC1955z5.b(parcel);
                J2(l5);
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                a1();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                I();
                parcel2.writeNoException();
                return true;
            case Matrix.TranslateX /* 12 */:
                M0 m0H = h();
                parcel2.writeNoException();
                AbstractC1955z5.d(parcel2, m0H);
                return true;
            case Matrix.TranslateY /* 13 */:
                M0 m5 = (M0) AbstractC1955z5.a(parcel, M0.CREATOR);
                AbstractC1955z5.b(parcel);
                o1(m5);
                parcel2.writeNoException();
                return true;
            case Matrix.TranslateZ /* 14 */:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (iInterfaceQueryLocalInterface3 instanceof InterfaceC0753Jb) {
                    }
                }
                AbstractC1955z5.b(parcel);
                D();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (iInterfaceQueryLocalInterface4 instanceof InterfaceC0759Kb) {
                    }
                }
                parcel.readString();
                AbstractC1955z5.b(parcel);
                m0();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strH = H();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    e7 = iInterfaceQueryLocalInterface5 instanceof E7 ? (E7) iInterfaceQueryLocalInterface5 : new E7(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 0);
                }
                AbstractC1955z5.b(parcel);
                L0(e7);
                parcel2.writeNoException();
                return true;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c2367s = iInterfaceQueryLocalInterface6 instanceof InterfaceC2368t ? (InterfaceC2368t) iInterfaceQueryLocalInterface6 : new C2367s(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 0);
                }
                AbstractC1955z5.b(parcel);
                U1(c2367s);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    q = iInterfaceQueryLocalInterface7 instanceof Q ? (Q) iInterfaceQueryLocalInterface7 : new Q(strongBinder7);
                }
                AbstractC1955z5.b(parcel);
                t3(q);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zF = AbstractC1955z5.f(parcel);
                AbstractC1955z5.b(parcel);
                Q3(zF);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zK0 = k0();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1955z5.f10260a;
                parcel2.writeInt(zK0 ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c1705tc = iInterfaceQueryLocalInterface8 instanceof C1705tc ? (C1705tc) iInterfaceQueryLocalInterface8 : new C1705tc(strongBinder8);
                }
                AbstractC1955z5.b(parcel);
                X2(c1705tc);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                AbstractC1955z5.b(parcel);
                f0();
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC2363o0 interfaceC2363o0M = m();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, interfaceC2363o0M);
                return true;
            case 29:
                G0 g5 = (G0) AbstractC1955z5.a(parcel, G0.CREATOR);
                AbstractC1955z5.b(parcel);
                h3(g5);
                parcel2.writeNoException();
                return true;
            case 30:
                AbstractC1955z5.b(parcel);
                d0();
                parcel2.writeNoException();
                return true;
            case 31:
                String strW = w();
                parcel2.writeNoException();
                parcel2.writeString(strW);
                return true;
            case 32:
                N nJ = j();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, nJ);
                return true;
            case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                InterfaceC2371w interfaceC2371wF = f();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, interfaceC2371wF);
                return true;
            case 34:
                boolean zF3 = AbstractC1955z5.f(parcel);
                AbstractC1955z5.b(parcel);
                f3(zF3);
                parcel2.writeNoException();
                return true;
            case 35:
                String strJ = J();
                parcel2.writeNoException();
                parcel2.writeString(strJ);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (iInterfaceQueryLocalInterface9 instanceof K) {
                    }
                }
                AbstractC1955z5.b(parcel);
                X();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleI = i();
                parcel2.writeNoException();
                AbstractC1955z5.d(parcel2, bundleI);
                return true;
            case 38:
                parcel.readString();
                AbstractC1955z5.b(parcel);
                o0();
                parcel2.writeNoException();
                return true;
            case 39:
                P0 p5 = (P0) AbstractC1955z5.a(parcel, P0.CREATOR);
                AbstractC1955z5.b(parcel);
                d2(p5);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    c0861a6 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0905b6 ? (InterfaceC0905b6) iInterfaceQueryLocalInterface10 : new C0861a6(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 0);
                }
                AbstractC1955z5.b(parcel);
                v1(c0861a6);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC2357l0 interfaceC2357l0K = k();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, interfaceC2357l0K);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c2345f0 = iInterfaceQueryLocalInterface11 instanceof InterfaceC2347g0 ? (InterfaceC2347g0) iInterfaceQueryLocalInterface11 : new C2345f0(strongBinder11);
                }
                AbstractC1955z5.b(parcel);
                B0(c2345f0);
                parcel2.writeNoException();
                return true;
            case 43:
                J0 j6 = (J0) AbstractC1955z5.a(parcel, J0.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c2372x = iInterfaceQueryLocalInterface12 instanceof InterfaceC2373y ? (InterfaceC2373y) iInterfaceQueryLocalInterface12 : new C2372x(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 0);
                }
                AbstractC1955z5.b(parcel);
                V1(j6, c2372x);
                parcel2.writeNoException();
                return true;
            case 44:
                a aVarP2 = b.P2(parcel.readStrongBinder());
                AbstractC1955z5.b(parcel);
                K1(aVarP2);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    s2 = iInterfaceQueryLocalInterface13 instanceof T ? (T) iInterfaceQueryLocalInterface13 : new S(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 0);
                }
                AbstractC1955z5.b(parcel);
                a2(s2);
                parcel2.writeNoException();
                return true;
        }
    }
}
