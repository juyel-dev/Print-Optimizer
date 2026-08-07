package p090v1;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import p003a2.a;

/* JADX INFO: renamed from: v1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2339c0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13442a;

    public /* synthetic */ C2339c0(int i5) {
        this.f13442a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13442a) {
            case 0:
                int iK = a.K(parcel);
                String strL = null;
                String strL2 = null;
                while (parcel.dataPosition() < iK) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        strL = a.l(parcel, i5);
                    } else if (c5 != 2) {
                        a.I(parcel, i5);
                    } else {
                        strL2 = a.l(parcel, i5);
                    }
                }
                a.t(parcel, iK);
                return new M(strL, strL2);
            case 1:
                int iK2 = a.K(parcel);
                int iF = 0;
                while (parcel.dataPosition() < iK2) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 2) {
                        a.I(parcel, i6);
                    } else {
                        iF = a.F(parcel, i6);
                    }
                }
                a.t(parcel, iK2);
                return new q0(iF);
            case 2:
                int iK3 = a.K(parcel);
                String strL3 = null;
                int iF2 = 0;
                int iF3 = 0;
                while (parcel.dataPosition() < iK3) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iF2 = a.F(parcel, i7);
                    } else if (c6 == 2) {
                        iF3 = a.F(parcel, i7);
                    } else if (c6 != 3) {
                        a.I(parcel, i7);
                    } else {
                        strL3 = a.l(parcel, i7);
                    }
                }
                a.t(parcel, iK3);
                return new x0(iF2, iF3, strL3);
            case 3:
                int iK4 = a.K(parcel);
                String strL4 = null;
                String strL5 = null;
                t0 t0Var = null;
                IBinder iBinderE = null;
                int iF4 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        iF4 = a.F(parcel, i8);
                    } else if (c7 == 2) {
                        strL4 = a.l(parcel, i8);
                    } else if (c7 == 3) {
                        strL5 = a.l(parcel, i8);
                    } else if (c7 == 4) {
                        t0Var = (t0) a.k(parcel, i8, t0.CREATOR);
                    } else if (c7 != 5) {
                        a.I(parcel, i8);
                    } else {
                        iBinderE = a.E(parcel, i8);
                    }
                }
                a.t(parcel, iK4);
                return new t0(iF4, strL4, strL5, t0Var, iBinderE);
            case 4:
                int iK5 = a.K(parcel);
                int iF5 = 0;
                int iF6 = 0;
                while (parcel.dataPosition() < iK5) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        iF5 = a.F(parcel, i9);
                    } else if (c8 != 2) {
                        a.I(parcel, i9);
                    } else {
                        iF6 = a.F(parcel, i9);
                    }
                }
                a.t(parcel, iK5);
                return new E0(iF5, iF6);
            case 5:
                int iK6 = a.K(parcel);
                String strL6 = null;
                while (parcel.dataPosition() < iK6) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 15) {
                        a.I(parcel, i10);
                    } else {
                        strL6 = a.l(parcel, i10);
                    }
                }
                a.t(parcel, iK6);
                return new F0(strL6);
            case 6:
                int iK7 = a.K(parcel);
                boolean zD = false;
                boolean zD2 = false;
                boolean zD3 = false;
                while (parcel.dataPosition() < iK7) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        zD = a.D(parcel, i11);
                    } else if (c9 == 3) {
                        zD2 = a.D(parcel, i11);
                    } else if (c9 != 4) {
                        a.I(parcel, i11);
                    } else {
                        zD3 = a.D(parcel, i11);
                    }
                }
                a.t(parcel, iK7);
                return new G0(zD, zD2, zD3);
            case 7:
                int iK8 = a.K(parcel);
                int iF7 = 0;
                int iF8 = 0;
                boolean zD4 = false;
                int iF9 = 0;
                boolean zD5 = false;
                boolean zD6 = false;
                int iF10 = 0;
                int iF11 = 0;
                int iF12 = 0;
                Bundle bundleH = null;
                ArrayList arrayListN = null;
                String strL7 = null;
                F0 f5 = null;
                Location location = null;
                String strL8 = null;
                Bundle bundleH2 = null;
                Bundle bundleH3 = null;
                ArrayList arrayListN2 = null;
                String strL9 = null;
                String strL10 = null;
                M m5 = null;
                String strL11 = null;
                ArrayList arrayListN3 = null;
                String strL12 = null;
                long jG = 0;
                while (parcel.dataPosition() < iK8) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iF7 = a.F(parcel, i12);
                            break;
                        case 2:
                            jG = a.G(parcel, i12);
                            break;
                        case 3:
                            bundleH = a.h(parcel, i12);
                            break;
                        case 4:
                            iF8 = a.F(parcel, i12);
                            break;
                        case 5:
                            arrayListN = a.n(parcel, i12);
                            break;
                        case 6:
                            zD4 = a.D(parcel, i12);
                            break;
                        case 7:
                            iF9 = a.F(parcel, i12);
                            break;
                        case '\b':
                            zD5 = a.D(parcel, i12);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            strL7 = a.l(parcel, i12);
                            break;
                        case '\n':
                            f5 = (F0) a.k(parcel, i12, F0.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            location = (Location) a.k(parcel, i12, Location.CREATOR);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            strL8 = a.l(parcel, i12);
                            break;
                        case Matrix.TranslateY /* 13 */:
                            bundleH2 = a.h(parcel, i12);
                            break;
                        case Matrix.TranslateZ /* 14 */:
                            bundleH3 = a.h(parcel, i12);
                            break;
                        case 15:
                            arrayListN2 = a.n(parcel, i12);
                            break;
                        case 16:
                            strL9 = a.l(parcel, i12);
                            break;
                        case 17:
                            strL10 = a.l(parcel, i12);
                            break;
                        case 18:
                            zD6 = a.D(parcel, i12);
                            break;
                        case 19:
                            m5 = (M) a.k(parcel, i12, M.CREATOR);
                            break;
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                            iF10 = a.F(parcel, i12);
                            break;
                        case 21:
                            strL11 = a.l(parcel, i12);
                            break;
                        case 22:
                            arrayListN3 = a.n(parcel, i12);
                            break;
                        case 23:
                            iF11 = a.F(parcel, i12);
                            break;
                        case 24:
                            strL12 = a.l(parcel, i12);
                            break;
                        case 25:
                            iF12 = a.F(parcel, i12);
                            break;
                        default:
                            a.I(parcel, i12);
                            break;
                    }
                }
                a.t(parcel, iK8);
                return new J0(iF7, jG, bundleH, iF8, arrayListN, zD4, iF9, zD5, strL7, f5, location, strL8, bundleH2, bundleH3, arrayListN2, strL9, strL10, zD6, m5, iF10, strL11, arrayListN3, iF11, strL12, iF12);
            case 8:
                int iK9 = a.K(parcel);
                int iF13 = 0;
                int iF14 = 0;
                boolean zD7 = false;
                int iF15 = 0;
                int iF16 = 0;
                boolean zD8 = false;
                boolean zD9 = false;
                boolean zD10 = false;
                boolean zD11 = false;
                boolean zD12 = false;
                boolean zD13 = false;
                boolean zD14 = false;
                boolean zD15 = false;
                String strL13 = null;
                M0[] m0Arr = null;
                while (parcel.dataPosition() < iK9) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strL13 = a.l(parcel, i13);
                            break;
                        case 3:
                            iF13 = a.F(parcel, i13);
                            break;
                        case 4:
                            iF14 = a.F(parcel, i13);
                            break;
                        case 5:
                            zD7 = a.D(parcel, i13);
                            break;
                        case 6:
                            iF15 = a.F(parcel, i13);
                            break;
                        case 7:
                            iF16 = a.F(parcel, i13);
                            break;
                        case '\b':
                            m0Arr = (M0[]) a.o(parcel, i13, M0.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            zD8 = a.D(parcel, i13);
                            break;
                        case '\n':
                            zD9 = a.D(parcel, i13);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            zD10 = a.D(parcel, i13);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            zD11 = a.D(parcel, i13);
                            break;
                        case Matrix.TranslateY /* 13 */:
                            zD12 = a.D(parcel, i13);
                            break;
                        case Matrix.TranslateZ /* 14 */:
                            zD13 = a.D(parcel, i13);
                            break;
                        case 15:
                            zD14 = a.D(parcel, i13);
                            break;
                        case 16:
                            zD15 = a.D(parcel, i13);
                            break;
                        default:
                            a.I(parcel, i13);
                            break;
                    }
                }
                a.t(parcel, iK9);
                return new M0(strL13, iF13, iF14, zD7, iF15, iF16, m0Arr, zD8, zD9, zD10, zD11, zD12, zD13, zD14, zD15);
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                int iK10 = a.K(parcel);
                long jG2 = 0;
                String strL14 = null;
                int iF17 = 0;
                int iF18 = 0;
                while (parcel.dataPosition() < iK10) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iF17 = a.F(parcel, i14);
                    } else if (c10 == 2) {
                        iF18 = a.F(parcel, i14);
                    } else if (c10 == 3) {
                        strL14 = a.l(parcel, i14);
                    } else if (c10 != 4) {
                        a.I(parcel, i14);
                    } else {
                        jG2 = a.G(parcel, i14);
                    }
                }
                a.t(parcel, iK10);
                return new N0(iF17, iF18, jG2, strL14);
            case 10:
                int iK11 = a.K(parcel);
                String strL15 = null;
                t0 t0Var2 = null;
                Bundle bundleH4 = null;
                String strL16 = null;
                String strL17 = null;
                String strL18 = null;
                String strL19 = null;
                long jG3 = 0;
                while (parcel.dataPosition() < iK11) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strL15 = a.l(parcel, i15);
                            break;
                        case 2:
                            jG3 = a.G(parcel, i15);
                            break;
                        case 3:
                            t0Var2 = (t0) a.k(parcel, i15, t0.CREATOR);
                            break;
                        case 4:
                            bundleH4 = a.h(parcel, i15);
                            break;
                        case 5:
                            strL16 = a.l(parcel, i15);
                            break;
                        case 6:
                            strL17 = a.l(parcel, i15);
                            break;
                        case 7:
                            strL18 = a.l(parcel, i15);
                            break;
                        case '\b':
                            strL19 = a.l(parcel, i15);
                            break;
                        default:
                            a.I(parcel, i15);
                            break;
                    }
                }
                a.t(parcel, iK11);
                return new O0(strL15, jG3, t0Var2, bundleH4, strL16, strL17, strL18, strL19);
            default:
                int iK12 = a.K(parcel);
                int iF19 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        a.I(parcel, i16);
                    } else {
                        iF19 = a.F(parcel, i16);
                    }
                }
                a.t(parcel, iK12);
                return new P0(iF19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f13442a) {
            case 0:
                return new M[i5];
            case 1:
                return new q0[i5];
            case 2:
                return new x0[i5];
            case 3:
                return new t0[i5];
            case 4:
                return new E0[i5];
            case 5:
                return new F0[i5];
            case 6:
                return new G0[i5];
            case 7:
                return new J0[i5];
            case 8:
                return new M0[i5];
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                return new N0[i5];
            case 10:
                return new O0[i5];
            default:
                return new P0[i5];
        }
    }
}
