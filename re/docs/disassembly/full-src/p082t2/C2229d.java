package p082t2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import p003a2.a;

/* JADX INFO: renamed from: t2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2229d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12621a;

    public /* synthetic */ C2229d(int i5) {
        this.f12621a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12621a) {
            case 0:
                int iK = a.K(parcel);
                String strL = null;
                String strL2 = null;
                k1 k1Var = null;
                String strL3 = null;
                C2264v c2264v = null;
                C2264v c2264v2 = null;
                C2264v c2264v3 = null;
                long jG = 0;
                long jG2 = 0;
                long jG3 = 0;
                boolean zD = false;
                while (parcel.dataPosition() < iK) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strL = a.l(parcel, i5);
                            break;
                        case 3:
                            strL2 = a.l(parcel, i5);
                            break;
                        case 4:
                            k1Var = (k1) a.k(parcel, i5, k1.CREATOR);
                            break;
                        case 5:
                            jG = a.G(parcel, i5);
                            break;
                        case 6:
                            zD = a.D(parcel, i5);
                            break;
                        case 7:
                            strL3 = a.l(parcel, i5);
                            break;
                        case '\b':
                            c2264v = (C2264v) a.k(parcel, i5, C2264v.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            jG2 = a.G(parcel, i5);
                            break;
                        case '\n':
                            c2264v2 = (C2264v) a.k(parcel, i5, C2264v.CREATOR);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            jG3 = a.G(parcel, i5);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            c2264v3 = (C2264v) a.k(parcel, i5, C2264v.CREATOR);
                            break;
                        default:
                            a.I(parcel, i5);
                            break;
                    }
                }
                a.t(parcel, iK);
                return new C2231e(strL, strL2, k1Var, jG, zD, strL3, c2264v, jG2, c2264v2, jG3, c2264v3);
            case 1:
                int iK2 = a.K(parcel);
                Bundle bundleH = null;
                while (parcel.dataPosition() < iK2) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        a.I(parcel, i6);
                    } else {
                        bundleH = a.h(parcel, i6);
                    }
                }
                a.t(parcel, iK2);
                return new C2239i(bundleH);
            case 2:
                int iK3 = a.K(parcel);
                Bundle bundleH2 = null;
                while (parcel.dataPosition() < iK3) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        a.I(parcel, i7);
                    } else {
                        bundleH2 = a.h(parcel, i7);
                    }
                }
                a.t(parcel, iK3);
                return new r(bundleH2);
            case 3:
                int iK4 = a.K(parcel);
                String strL4 = null;
                r rVar = null;
                String strL5 = null;
                long jG4 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        strL4 = a.l(parcel, i8);
                    } else if (c5 == 3) {
                        rVar = (r) a.k(parcel, i8, r.CREATOR);
                    } else if (c5 == 4) {
                        strL5 = a.l(parcel, i8);
                    } else if (c5 != 5) {
                        a.I(parcel, i8);
                    } else {
                        jG4 = a.G(parcel, i8);
                    }
                }
                a.t(parcel, iK4);
                return new C2264v(strL4, rVar, strL5, jG4);
            case 4:
                int iK5 = a.K(parcel);
                String strL6 = null;
                long jG5 = 0;
                int iF = 0;
                while (parcel.dataPosition() < iK5) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        strL6 = a.l(parcel, i9);
                    } else if (c6 == 2) {
                        jG5 = a.G(parcel, i9);
                    } else if (c6 != 3) {
                        a.I(parcel, i9);
                    } else {
                        iF = a.F(parcel, i9);
                    }
                }
                a.t(parcel, iK5);
                return new d1(strL6, jG5, iF);
            case 5:
                int iK6 = a.K(parcel);
                String strL7 = null;
                String strL8 = null;
                String strL9 = null;
                String strL10 = null;
                String strL11 = null;
                String strL12 = null;
                String strL13 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListN = null;
                String strL14 = null;
                String strL15 = null;
                String strL16 = null;
                long jG6 = 0;
                long jG7 = 0;
                long jG8 = 0;
                long jG9 = 0;
                long jG10 = 0;
                long jG11 = 0;
                long jG12 = 0;
                boolean zD2 = true;
                boolean zD3 = true;
                boolean zD4 = false;
                int iF2 = 0;
                boolean zD5 = false;
                boolean zD6 = false;
                int iF3 = 0;
                long jG13 = -2147483648L;
                String strL17 = "";
                String strL18 = strL17;
                String strL19 = strL18;
                int iF4 = 100;
                while (parcel.dataPosition() < iK6) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strL7 = a.l(parcel, i10);
                            break;
                        case 3:
                            strL8 = a.l(parcel, i10);
                            break;
                        case 4:
                            strL9 = a.l(parcel, i10);
                            break;
                        case 5:
                            strL10 = a.l(parcel, i10);
                            break;
                        case 6:
                            jG6 = a.G(parcel, i10);
                            break;
                        case 7:
                            jG7 = a.G(parcel, i10);
                            break;
                        case '\b':
                            strL11 = a.l(parcel, i10);
                            break;
                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                            zD2 = a.D(parcel, i10);
                            break;
                        case '\n':
                            zD4 = a.D(parcel, i10);
                            break;
                        case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                            jG13 = a.G(parcel, i10);
                            break;
                        case Matrix.TranslateX /* 12 */:
                            strL12 = a.l(parcel, i10);
                            break;
                        case Matrix.TranslateY /* 13 */:
                            jG8 = a.G(parcel, i10);
                            break;
                        case Matrix.TranslateZ /* 14 */:
                            jG9 = a.G(parcel, i10);
                            break;
                        case 15:
                            iF2 = a.F(parcel, i10);
                            break;
                        case 16:
                            zD3 = a.D(parcel, i10);
                            break;
                        case 17:
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                        default:
                            a.I(parcel, i10);
                            break;
                        case 18:
                            zD5 = a.D(parcel, i10);
                            break;
                        case 19:
                            strL13 = a.l(parcel, i10);
                            break;
                        case 21:
                            int iH = a.H(parcel, i10);
                            if (iH != 0) {
                                a.M(parcel, iH, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jG10 = a.G(parcel, i10);
                            break;
                        case 23:
                            arrayListN = a.n(parcel, i10);
                            break;
                        case 24:
                            strL14 = a.l(parcel, i10);
                            break;
                        case 25:
                            strL17 = a.l(parcel, i10);
                            break;
                        case 26:
                            strL18 = a.l(parcel, i10);
                            break;
                        case 27:
                            strL15 = a.l(parcel, i10);
                            break;
                        case 28:
                            zD6 = a.D(parcel, i10);
                            break;
                        case 29:
                            jG11 = a.G(parcel, i10);
                            break;
                        case 30:
                            iF4 = a.F(parcel, i10);
                            break;
                        case 31:
                            strL19 = a.l(parcel, i10);
                            break;
                        case ' ':
                            iF3 = a.F(parcel, i10);
                            break;
                        case '\"':
                            jG12 = a.G(parcel, i10);
                            break;
                        case '#':
                            strL16 = a.l(parcel, i10);
                            break;
                    }
                }
                a.t(parcel, iK6);
                return new o1(strL7, strL8, strL9, strL10, jG6, jG7, strL11, zD2, zD4, jG13, strL12, jG8, jG9, iF2, zD3, zD5, strL13, boolValueOf, jG10, arrayListN, strL14, strL17, strL18, strL15, zD6, jG11, iF4, strL19, iF3, jG12, strL16);
            default:
                int iK7 = a.K(parcel);
                int iF5 = 0;
                String strL20 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strL21 = null;
                String strL22 = null;
                Double dValueOf = null;
                long jG14 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iF5 = a.F(parcel, i11);
                            break;
                        case 2:
                            strL20 = a.l(parcel, i11);
                            break;
                        case 3:
                            jG14 = a.G(parcel, i11);
                            break;
                        case 4:
                            int iH2 = a.H(parcel, i11);
                            if (iH2 != 0) {
                                a.M(parcel, iH2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 5:
                            int iH3 = a.H(parcel, i11);
                            if (iH3 != 0) {
                                a.M(parcel, iH3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strL21 = a.l(parcel, i11);
                            break;
                        case 7:
                            strL22 = a.l(parcel, i11);
                            break;
                        case '\b':
                            int iH4 = a.H(parcel, i11);
                            if (iH4 != 0) {
                                a.M(parcel, iH4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            a.I(parcel, i11);
                            break;
                    }
                }
                a.t(parcel, iK7);
                return new k1(iF5, strL20, jG14, lValueOf, fValueOf, strL21, strL22, dValueOf);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f12621a) {
            case 0:
                return new C2231e[i5];
            case 1:
                return new C2239i[i5];
            case 2:
                return new r[i5];
            case 3:
                return new C2264v[i5];
            case 4:
                return new d1[i5];
            case 5:
                return new o1[i5];
            default:
                return new k1[i5];
        }
    }
}
