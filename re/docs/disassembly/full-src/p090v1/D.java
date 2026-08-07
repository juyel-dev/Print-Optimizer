package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.compose.ui.graphics.Matrix;
import com.google.android.gms.internal.ads.AbstractBinderC1911y5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C1694t8;
import com.google.android.gms.internal.ads.N8;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.P8;
import com.google.android.gms.internal.ads.Q8;
import com.google.android.gms.internal.ads.R8;
import com.google.android.gms.internal.ads.R9;
import com.google.android.gms.internal.ads.S8;
import com.google.android.gms.internal.ads.U8;
import com.google.android.gms.internal.ads.V8;
import com.google.android.gms.internal.ads.X8;
import com.razorpay.AppSignatureHelper;
import p078s1.a;
import p078s1.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends AbstractBinderC1911y5 implements E {
    public D() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1911y5
    public final boolean R3(int i5, Parcel parcel, Parcel parcel2) {
        S8 r8;
        InterfaceC2371w c2369u = null;
        R9 r9 = null;
        X8 v8 = null;
        U8 u8 = null;
        Q q = null;
        Q8 p8 = null;
        O8 o8 = null;
        N8 n8 = null;
        switch (i5) {
            case 1:
                B b5 = b();
                parcel2.writeNoException();
                AbstractC1955z5.e(parcel2, b5);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c2369u = iInterfaceQueryLocalInterface instanceof InterfaceC2371w ? (InterfaceC2371w) iInterfaceQueryLocalInterface : new C2369u(strongBinder);
                }
                AbstractC1955z5.b(parcel);
                X0(c2369u);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    n8 = iInterfaceQueryLocalInterface2 instanceof N8 ? (N8) iInterfaceQueryLocalInterface2 : new N8(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 0);
                }
                AbstractC1955z5.b(parcel);
                N3(n8);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    o8 = iInterfaceQueryLocalInterface3 instanceof O8 ? (O8) iInterfaceQueryLocalInterface3 : new O8(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 0);
                }
                AbstractC1955z5.b(parcel);
                f2(o8);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    r8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    r8 = iInterfaceQueryLocalInterface4 instanceof S8 ? (S8) iInterfaceQueryLocalInterface4 : new R8(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 0);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    p8 = iInterfaceQueryLocalInterface5 instanceof Q8 ? (Q8) iInterfaceQueryLocalInterface5 : new P8(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 0);
                }
                AbstractC1955z5.b(parcel);
                y2(string, r8, p8);
                parcel2.writeNoException();
                return true;
            case 6:
                C1694t8 c1694t8 = (C1694t8) AbstractC1955z5.a(parcel, C1694t8.CREATOR);
                AbstractC1955z5.b(parcel);
                r1(c1694t8);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    q = iInterfaceQueryLocalInterface6 instanceof Q ? (Q) iInterfaceQueryLocalInterface6 : new Q(strongBinder6);
                }
                AbstractC1955z5.b(parcel);
                Z0(q);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    u8 = iInterfaceQueryLocalInterface7 instanceof U8 ? (U8) iInterfaceQueryLocalInterface7 : new U8(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 0);
                }
                M0 m5 = (M0) AbstractC1955z5.a(parcel, M0.CREATOR);
                AbstractC1955z5.b(parcel);
                Y2(u8, m5);
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                d dVar = (d) AbstractC1955z5.a(parcel, d.CREATOR);
                AbstractC1955z5.b(parcel);
                U0(dVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    v8 = iInterfaceQueryLocalInterface8 instanceof X8 ? (X8) iInterfaceQueryLocalInterface8 : new V8(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 0);
                }
                AbstractC1955z5.b(parcel);
                g2(v8);
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
            case Matrix.TranslateX /* 12 */:
            default:
                return false;
            case Matrix.TranslateY /* 13 */:
                N9 n9 = (N9) AbstractC1955z5.a(parcel, N9.CREATOR);
                AbstractC1955z5.b(parcel);
                P3(n9);
                parcel2.writeNoException();
                return true;
            case Matrix.TranslateZ /* 14 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    r9 = iInterfaceQueryLocalInterface9 instanceof R9 ? (R9) iInterfaceQueryLocalInterface9 : new R9(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 0);
                }
                AbstractC1955z5.b(parcel);
                B2(r9);
                parcel2.writeNoException();
                return true;
            case 15:
                a aVar = (a) AbstractC1955z5.a(parcel, a.CREATOR);
                AbstractC1955z5.b(parcel);
                Q2(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
