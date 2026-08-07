package p028g2;

import T1.s;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C0785Od;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import p003a2.a;
import p033h3.q;
import p064o2.X;
import p078s1.d;
import p085u1.e;
import p091v2.b;
import p091v2.f;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11190a;

    public /* synthetic */ U(int i5) {
        this.f11190a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11190a) {
            case 0:
                int iK = a.K(parcel);
                ArrayList arrayListP = null;
                while (parcel.dataPosition() < iK) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        a.I(parcel, i5);
                    } else {
                        arrayListP = a.p(parcel, i5, L.CREATOR);
                    }
                }
                a.t(parcel, iK);
                return new K(arrayListP);
            case 1:
                int iK2 = a.K(parcel);
                int iF = 0;
                short s2 = 0;
                short s5 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iF = a.F(parcel, i6);
                    } else if (c5 == 2) {
                        a.N(parcel, i6, 4);
                        s2 = (short) parcel.readInt();
                    } else if (c5 != 3) {
                        a.I(parcel, i6);
                    } else {
                        a.N(parcel, i6, 4);
                        s5 = (short) parcel.readInt();
                    }
                }
                a.t(parcel, iK2);
                return new L(iF, s2, s5);
            case 2:
                int iK3 = a.K(parcel);
                K k3 = null;
                V v4 = null;
                C2140h c2140h = null;
                W w4 = null;
                String strL = null;
                while (parcel.dataPosition() < iK3) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        k3 = (K) a.k(parcel, i7, K.CREATOR);
                    } else if (c6 == 2) {
                        v4 = (V) a.k(parcel, i7, V.CREATOR);
                    } else if (c6 == 3) {
                        c2140h = (C2140h) a.k(parcel, i7, C2140h.CREATOR);
                    } else if (c6 == 4) {
                        w4 = (W) a.k(parcel, i7, W.CREATOR);
                    } else if (c6 != 5) {
                        a.I(parcel, i7);
                    } else {
                        strL = a.l(parcel, i7);
                    }
                }
                a.t(parcel, iK3);
                return new C2139g(k3, v4, c2140h, w4, strL);
            case 3:
                int iK4 = a.K(parcel);
                C2150s c2150s = null;
                Y y4 = null;
                I i8 = null;
                a0 a0Var = null;
                M m5 = null;
                N n5 = null;
                Z z3 = null;
                O o5 = null;
                C2151t c2151t = null;
                Q q = null;
                S s6 = null;
                P p = null;
                while (parcel.dataPosition() < iK4) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            c2150s = (C2150s) a.k(parcel, i9, C2150s.CREATOR);
                            break;
                        case 3:
                            y4 = (Y) a.k(parcel, i9, Y.CREATOR);
                            break;
                        case 4:
                            i8 = (I) a.k(parcel, i9, I.CREATOR);
                            break;
                        case 5:
                            a0Var = (a0) a.k(parcel, i9, a0.CREATOR);
                            break;
                        case 6:
                            m5 = (M) a.k(parcel, i9, M.CREATOR);
                            break;
                        case 7:
                            n5 = (N) a.k(parcel, i9, N.CREATOR);
                            break;
                        case '\b':
                            z3 = (Z) a.k(parcel, i9, Z.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            o5 = (O) a.k(parcel, i9, O.CREATOR);
                            break;
                        case '\n':
                            c2151t = (C2151t) a.k(parcel, i9, C2151t.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            q = (Q) a.k(parcel, i9, Q.CREATOR);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            s6 = (S) a.k(parcel, i9, S.CREATOR);
                            break;
                        case Matrix.TranslateY /* 13 */:
                            p = (P) a.k(parcel, i9, P.CREATOR);
                            break;
                        default:
                            a.I(parcel, i9);
                            break;
                    }
                }
                a.t(parcel, iK4);
                return new C2138f(c2150s, y4, i8, a0Var, m5, n5, z3, o5, c2151t, q, s6, p);
            case 4:
                int iK5 = a.K(parcel);
                boolean zD = false;
                while (parcel.dataPosition() < iK5) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        a.I(parcel, i10);
                    } else {
                        zD = a.D(parcel, i10);
                    }
                }
                a.t(parcel, iK5);
                return new C2140h(zD);
            case 5:
                int iK6 = a.K(parcel);
                byte[] bArrI = null;
                byte[] bArrI2 = null;
                while (parcel.dataPosition() < iK6) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        bArrI = a.i(parcel, i11);
                    } else if (c7 != 2) {
                        a.I(parcel, i11);
                    } else {
                        bArrI2 = a.i(parcel, i11);
                    }
                }
                a.t(parcel, iK6);
                return new V(bArrI == null ? null : X.s(bArrI, bArrI.length), bArrI2 != null ? X.s(bArrI2, bArrI2.length) : null);
            case 6:
                int iK7 = a.K(parcel);
                boolean zD2 = false;
                byte[] bArrI3 = null;
                while (parcel.dataPosition() < iK7) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        zD2 = a.D(parcel, i12);
                    } else if (c8 != 2) {
                        a.I(parcel, i12);
                    } else {
                        bArrI3 = a.i(parcel, i12);
                    }
                }
                a.t(parcel, iK7);
                return new W(zD2, bArrI3 != null ? X.s(bArrI3, bArrI3.length) : null);
            case 7:
                int iK8 = a.K(parcel);
                byte[] bArrI4 = null;
                byte[] bArrI5 = null;
                byte[] bArrI6 = null;
                byte[] bArrI7 = null;
                byte[] bArrI8 = null;
                while (parcel.dataPosition() < iK8) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 2) {
                        bArrI4 = a.i(parcel, i13);
                    } else if (c9 == 3) {
                        bArrI5 = a.i(parcel, i13);
                    } else if (c9 == 4) {
                        bArrI6 = a.i(parcel, i13);
                    } else if (c9 == 5) {
                        bArrI7 = a.i(parcel, i13);
                    } else if (c9 != 6) {
                        a.I(parcel, i13);
                    } else {
                        bArrI8 = a.i(parcel, i13);
                    }
                }
                a.t(parcel, iK8);
                return new C2141i(bArrI4, bArrI5, bArrI6, bArrI7, bArrI8);
            case 8:
                int iK9 = a.K(parcel);
                byte[] bArrI9 = null;
                byte[] bArrI10 = null;
                byte[] bArrI11 = null;
                String[] strArrM = null;
                while (parcel.dataPosition() < iK9) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        bArrI9 = a.i(parcel, i14);
                    } else if (c10 == 3) {
                        bArrI10 = a.i(parcel, i14);
                    } else if (c10 == 4) {
                        bArrI11 = a.i(parcel, i14);
                    } else if (c10 != 5) {
                        a.I(parcel, i14);
                    } else {
                        strArrM = a.m(parcel, i14);
                    }
                }
                a.t(parcel, iK9);
                return new C2142j(bArrI9, bArrI10, bArrI11, strArrM);
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                int iK10 = a.K(parcel);
                int iF2 = 0;
                String strL2 = null;
                int iF3 = 0;
                while (parcel.dataPosition() < iK10) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        iF2 = a.F(parcel, i15);
                    } else if (c11 == 3) {
                        strL2 = a.l(parcel, i15);
                    } else if (c11 != 4) {
                        a.I(parcel, i15);
                    } else {
                        iF3 = a.F(parcel, i15);
                    }
                }
                a.t(parcel, iK10);
                return new C2143k(iF2, strL2, iF3);
            case 10:
                int iK11 = a.K(parcel);
                String strL3 = null;
                Boolean boolValueOf = null;
                String strL4 = null;
                String strL5 = null;
                while (parcel.dataPosition() < iK11) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 2) {
                        strL3 = a.l(parcel, i16);
                    } else if (c12 == 3) {
                        int iH = a.H(parcel, i16);
                        if (iH == 0) {
                            boolValueOf = null;
                        } else {
                            a.M(parcel, iH, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c12 == 4) {
                        strL4 = a.l(parcel, i16);
                    } else if (c12 != 5) {
                        a.I(parcel, i16);
                    } else {
                        strL5 = a.l(parcel, i16);
                    }
                }
                a.t(parcel, iK11);
                return new C2145m(strL3, boolValueOf, strL4, strL5);
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                try {
                    return C2147o.a(parcel.readInt());
                } catch (C2146n e) {
                    throw new RuntimeException(e);
                }
            case Matrix.TranslateX /* 12 */:
                int iK12 = a.K(parcel);
                byte[] bArrI12 = null;
                byte[] bArrI13 = null;
                byte[] bArrI14 = null;
                long jG = 0;
                while (parcel.dataPosition() < iK12) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        jG = a.G(parcel, i17);
                    } else if (c13 == 2) {
                        bArrI12 = a.i(parcel, i17);
                    } else if (c13 == 3) {
                        bArrI13 = a.i(parcel, i17);
                    } else if (c13 != 4) {
                        a.I(parcel, i17);
                    } else {
                        bArrI14 = a.i(parcel, i17);
                    }
                }
                a.t(parcel, iK12);
                return new X(jG, bArrI12, bArrI13, bArrI14);
            case Matrix.TranslateY /* 13 */:
                int iK13 = a.K(parcel);
                ArrayList arrayListP2 = null;
                while (parcel.dataPosition() < iK13) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        a.I(parcel, i18);
                    } else {
                        arrayListP2 = a.p(parcel, i18, X.CREATOR);
                    }
                }
                a.t(parcel, iK13);
                return new Y(arrayListP2);
            case Matrix.TranslateZ /* 14 */:
                int iK14 = a.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        a.I(parcel, i19);
                    } else {
                        a.D(parcel, i19);
                    }
                }
                a.t(parcel, iK14);
                return new Z();
            case 15:
                try {
                    return r.a(parcel.readInt());
                } catch (C2149q e3) {
                    throw new IllegalArgumentException(e3);
                }
            case 16:
                int iK15 = a.K(parcel);
                String strL6 = null;
                while (parcel.dataPosition() < iK15) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        a.I(parcel, i20);
                    } else {
                        strL6 = a.l(parcel, i20);
                    }
                }
                a.t(parcel, iK15);
                return new C2150s(strL6);
            case 17:
                int iK16 = a.K(parcel);
                Bundle bundleH = null;
                while (parcel.dataPosition() < iK16) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        a.I(parcel, i21);
                    } else {
                        bundleH = a.h(parcel, i21);
                    }
                }
                a.t(parcel, iK16);
                return new q(bundleH);
            case 18:
                int iK17 = a.K(parcel);
                IBinder iBinderE = null;
                boolean zD3 = false;
                while (parcel.dataPosition() < iK17) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        zD3 = a.D(parcel, i22);
                    } else if (c14 != 2) {
                        a.I(parcel, i22);
                    } else {
                        iBinderE = a.E(parcel, i22);
                    }
                }
                a.t(parcel, iK17);
                return new p078s1.a(zD3, iBinderE);
            case 19:
                int iK18 = a.K(parcel);
                IBinder iBinderE2 = null;
                boolean zD4 = false;
                IBinder iBinderE3 = null;
                while (parcel.dataPosition() < iK18) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        zD4 = a.D(parcel, i23);
                    } else if (c15 == 2) {
                        iBinderE2 = a.E(parcel, i23);
                    } else if (c15 != 3) {
                        a.I(parcel, i23);
                    } else {
                        iBinderE3 = a.E(parcel, i23);
                    }
                }
                a.t(parcel, iK18);
                return new d(zD4, iBinderE2, iBinderE3);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                int iK19 = a.K(parcel);
                boolean zD5 = false;
                boolean zD6 = false;
                boolean zD7 = false;
                int iF4 = 0;
                boolean zD8 = false;
                boolean zD9 = false;
                boolean zD10 = false;
                float f5 = 0.0f;
                String strL7 = null;
                while (parcel.dataPosition() < iK19) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            zD5 = a.D(parcel, i24);
                            break;
                        case 3:
                            zD6 = a.D(parcel, i24);
                            break;
                        case 4:
                            strL7 = a.l(parcel, i24);
                            break;
                        case 5:
                            zD7 = a.D(parcel, i24);
                            break;
                        case 6:
                            a.N(parcel, i24, 4);
                            f5 = parcel.readFloat();
                            break;
                        case 7:
                            iF4 = a.F(parcel, i24);
                            break;
                        case '\b':
                            zD8 = a.D(parcel, i24);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            zD9 = a.D(parcel, i24);
                            break;
                        case '\n':
                            zD10 = a.D(parcel, i24);
                            break;
                        default:
                            a.I(parcel, i24);
                            break;
                    }
                }
                a.t(parcel, iK19);
                return new e(zD5, zD6, strL7, zD7, f5, iF4, zD8, zD9, zD10);
            case 21:
                int iK20 = a.K(parcel);
                Intent intent = null;
                int iF5 = 0;
                int iF6 = 0;
                while (parcel.dataPosition() < iK20) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iF5 = a.F(parcel, i25);
                    } else if (c16 == 2) {
                        iF6 = a.F(parcel, i25);
                    } else if (c16 != 3) {
                        a.I(parcel, i25);
                    } else {
                        intent = (Intent) a.k(parcel, i25, Intent.CREATOR);
                    }
                }
                a.t(parcel, iK20);
                return new b(iF5, iF6, intent);
            case 22:
                int iK21 = a.K(parcel);
                ArrayList arrayListN = null;
                String strL8 = null;
                while (parcel.dataPosition() < iK21) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        arrayListN = a.n(parcel, i26);
                    } else if (c17 != 2) {
                        a.I(parcel, i26);
                    } else {
                        strL8 = a.l(parcel, i26);
                    }
                }
                a.t(parcel, iK21);
                return new p091v2.e(strL8, arrayListN);
            case 23:
                int iK22 = a.K(parcel);
                Q1.b bVar = null;
                int iF7 = 0;
                s sVar = null;
                while (parcel.dataPosition() < iK22) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        iF7 = a.F(parcel, i27);
                    } else if (c18 == 2) {
                        bVar = (Q1.b) a.k(parcel, i27, Q1.b.CREATOR);
                    } else if (c18 != 3) {
                        a.I(parcel, i27);
                    } else {
                        sVar = (s) a.k(parcel, i27, s.CREATOR);
                    }
                }
                a.t(parcel, iK22);
                return new f(iF7, bVar, sVar);
            case 24:
                int iK23 = a.K(parcel);
                String strL9 = null;
                String strL10 = null;
                String strL11 = null;
                while (parcel.dataPosition() < iK23) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        strL9 = a.l(parcel, i28);
                    } else if (c19 == 2) {
                        strL10 = a.l(parcel, i28);
                    } else if (c19 != 3) {
                        a.I(parcel, i28);
                    } else {
                        strL11 = a.l(parcel, i28);
                    }
                }
                a.t(parcel, iK23);
                return new p095w1.a(strL9, strL10, strL11);
            case 25:
                return new ParcelImpl(parcel);
            case 26:
                int iK24 = a.K(parcel);
                boolean zD11 = false;
                String strL12 = null;
                String strL13 = null;
                String strL14 = null;
                String strL15 = null;
                String strL16 = null;
                String strL17 = null;
                String strL18 = null;
                Intent intent2 = null;
                IBinder iBinderE4 = null;
                while (parcel.dataPosition() < iK24) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 2:
                            strL12 = a.l(parcel, i29);
                            break;
                        case 3:
                            strL13 = a.l(parcel, i29);
                            break;
                        case 4:
                            strL14 = a.l(parcel, i29);
                            break;
                        case 5:
                            strL15 = a.l(parcel, i29);
                            break;
                        case 6:
                            strL16 = a.l(parcel, i29);
                            break;
                        case 7:
                            strL17 = a.l(parcel, i29);
                            break;
                        case '\b':
                            strL18 = a.l(parcel, i29);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            intent2 = (Intent) a.k(parcel, i29, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderE4 = a.E(parcel, i29);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            zD11 = a.D(parcel, i29);
                            break;
                        default:
                            a.I(parcel, i29);
                            break;
                    }
                }
                a.t(parcel, iK24);
                return new p100x1.d(strL12, strL13, strL14, strL15, strL16, strL17, strL18, intent2, iBinderE4, zD11);
            default:
                int iK25 = a.K(parcel);
                boolean zD12 = false;
                int iF8 = 0;
                int iF9 = 0;
                boolean zD13 = false;
                p100x1.d dVar = null;
                IBinder iBinderE5 = null;
                IBinder iBinderE6 = null;
                IBinder iBinderE7 = null;
                IBinder iBinderE8 = null;
                String strL19 = null;
                String strL20 = null;
                IBinder iBinderE9 = null;
                String strL21 = null;
                C0785Od c0785Od = null;
                String strL22 = null;
                e eVar = null;
                IBinder iBinderE10 = null;
                String strL23 = null;
                String strL24 = null;
                String strL25 = null;
                IBinder iBinderE11 = null;
                IBinder iBinderE12 = null;
                IBinder iBinderE13 = null;
                while (parcel.dataPosition() < iK25) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            dVar = (p100x1.d) a.k(parcel, i30, p100x1.d.CREATOR);
                            break;
                        case 3:
                            iBinderE5 = a.E(parcel, i30);
                            break;
                        case 4:
                            iBinderE6 = a.E(parcel, i30);
                            break;
                        case 5:
                            iBinderE7 = a.E(parcel, i30);
                            break;
                        case 6:
                            iBinderE8 = a.E(parcel, i30);
                            break;
                        case 7:
                            strL19 = a.l(parcel, i30);
                            break;
                        case '\b':
                            zD12 = a.D(parcel, i30);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            strL20 = a.l(parcel, i30);
                            break;
                        case '\n':
                            iBinderE9 = a.E(parcel, i30);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            iF8 = a.F(parcel, i30);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            iF9 = a.F(parcel, i30);
                            break;
                        case Matrix.TranslateY /* 13 */:
                            strL21 = a.l(parcel, i30);
                            break;
                        case Matrix.TranslateZ /* 14 */:
                            c0785Od = (C0785Od) a.k(parcel, i30, C0785Od.CREATOR);
                            break;
                        case 15:
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        default:
                            a.I(parcel, i30);
                            break;
                        case 16:
                            strL22 = a.l(parcel, i30);
                            break;
                        case 17:
                            eVar = (e) a.k(parcel, i30, e.CREATOR);
                            break;
                        case 18:
                            iBinderE10 = a.E(parcel, i30);
                            break;
                        case 19:
                            strL23 = a.l(parcel, i30);
                            break;
                        case 24:
                            strL24 = a.l(parcel, i30);
                            break;
                        case 25:
                            strL25 = a.l(parcel, i30);
                            break;
                        case 26:
                            iBinderE11 = a.E(parcel, i30);
                            break;
                        case 27:
                            iBinderE12 = a.E(parcel, i30);
                            break;
                        case 28:
                            iBinderE13 = a.E(parcel, i30);
                            break;
                        case 29:
                            zD13 = a.D(parcel, i30);
                            break;
                    }
                }
                a.t(parcel, iK25);
                return new AdOverlayInfoParcel(dVar, iBinderE5, iBinderE6, iBinderE7, iBinderE8, strL19, zD12, strL20, iBinderE9, iF8, iF9, strL21, c0785Od, strL22, eVar, iBinderE10, strL23, strL24, strL25, iBinderE11, iBinderE12, iBinderE13, zD13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f11190a) {
            case 0:
                return new K[i5];
            case 1:
                return new L[i5];
            case 2:
                return new C2139g[i5];
            case 3:
                return new C2138f[i5];
            case 4:
                return new C2140h[i5];
            case 5:
                return new V[i5];
            case 6:
                return new W[i5];
            case 7:
                return new C2141i[i5];
            case 8:
                return new C2142j[i5];
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                return new C2143k[i5];
            case 10:
                return new C2145m[i5];
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                return new C2147o[i5];
            case Matrix.TranslateX /* 12 */:
                return new X[i5];
            case Matrix.TranslateY /* 13 */:
                return new Y[i5];
            case Matrix.TranslateZ /* 14 */:
                return new Z[i5];
            case 15:
                return new r[i5];
            case 16:
                return new C2150s[i5];
            case 17:
                return new q[i5];
            case 18:
                return new p078s1.a[i5];
            case 19:
                return new d[i5];
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return new e[i5];
            case 21:
                return new b[i5];
            case 22:
                return new p091v2.e[i5];
            case 23:
                return new f[i5];
            case 24:
                return new p095w1.a[i5];
            case 25:
                return new ParcelImpl[i5];
            case 26:
                return new p100x1.d[i5];
            default:
                return new AdOverlayInfoParcel[i5];
        }
    }
}
