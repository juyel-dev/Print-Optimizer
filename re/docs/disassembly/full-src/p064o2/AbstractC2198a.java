package p064o2;

import J.a;
import androidx.compose.ui.graphics.Matrix;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.google.android.gms.internal.ads.C1521pA;
import com.google.android.gms.internal.ads.ZF;
import com.razorpay.AppSignatureHelper;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p046k2.h;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2198a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f12123b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12122a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f12124c = new f0("id");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f12125d = new f0("type");

    public static int a(int i5, int i6, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i6 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i7 = i5 / i6;
        int i8 = i5 - (i6 * i7);
        if (i8 == 0) {
            return i7;
        }
        int i9 = ((i5 ^ i6) >> 31) | 1;
        switch (S.f12113a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i7;
            case 3:
                if (i9 >= 0) {
                    return i7;
                }
                break;
            case 4:
                break;
            case 5:
                if (i9 <= 0) {
                    return i7;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i8);
                int iAbs2 = iAbs - (Math.abs(i6) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i7 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i7;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i7;
                }
            default:
                throw new AssertionError();
        }
        return i7 + i9;
    }

    public static int b(AbstractC2212o abstractC2212o) {
        Iterator it = abstractC2212o.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length) {
                break;
            }
            Object obj = objArr[i6];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String strM = androidx.compose.foundation.text.modifiers.a.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e);
                    string = "<" + strM + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i6] = string;
            i6++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (iIndexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, iIndexOf);
            sb.append(objArr[i5]);
            i7 = iIndexOf + 2;
            i5++;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i5 < length2) {
            sb.append(" [");
            sb.append(objArr[i5]);
            for (int i8 = i5 + 1; i8 < objArr.length; i8++) {
                sb.append(", ");
                sb.append(objArr[i8]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String d(X x4) {
        StringBuilder sb = new StringBuilder(x4.k());
        for (int i5 = 0; i5 < x4.k(); i5++) {
            byte bC = x4.c(i5);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                        sb.append("\\v");
                        break;
                    case Matrix.TranslateX /* 12 */:
                        sb.append("\\f");
                        break;
                    case Matrix.TranslateY /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void e(int i5, int i6) {
        String strC;
        if (i5 < 0 || i5 >= i6) {
            if (i5 < 0) {
                strC = c("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i6 < 0) {
                    throw new IllegalArgumentException(AbstractC1421mz.h(i6, "negative size: "));
                }
                strC = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(androidx.compose.foundation.text.modifiers.a.z("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb, Iterator it, h hVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(h.x(entry.getKey()));
            sb.append(" : ");
            sb.append(h.x(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(h.x(entry2.getKey()));
                sb.append(" : ");
                sb.append(h.x(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C2219w.f12159o;
            }
        } else {
            if (!(collection instanceof E)) {
                return false;
            }
            objComparator = ((AbstractC2216t) ((E) collection)).f12156r;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        int i5 = 0;
        int length = 0;
        while (true) {
            if (i5 >= bArr.length) {
                break;
            }
            length += bArr[i5].length;
            i5++;
        }
        byte[] bArr2 = new byte[length];
        int i6 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length2);
            i6 += length2;
        }
        return bArr2;
    }

    public static final h0 k(j0 j0Var) throws c0 {
        try {
            i0 i0VarI = j0Var.i();
            if (i0VarI == null) {
                throw new c0("Parser being asked to parse an empty input stream");
            }
            try {
                byte b5 = i0VarI.f12137a;
                byte b6 = i0VarI.f12138b;
                int i5 = 0;
                if (b5 == -128) {
                    long jC = j0Var.c();
                    if (jC > 1000) {
                        throw new c0("Parser being asked to read a large CBOR array");
                    }
                    l(b6, jC);
                    h0[] h0VarArr = new h0[(int) jC];
                    while (i5 < jC) {
                        h0VarArr[i5] = k(j0Var);
                        i5++;
                    }
                    return new Z(AbstractC2210m.t(h0VarArr));
                }
                if (b5 != -96) {
                    if (b5 == -64) {
                        throw new c0("Tags are currently unsupported");
                    }
                    if (b5 == -32) {
                        return new a0(j0Var.j());
                    }
                    if (b5 == 0 || b5 == 32) {
                        long jG = j0Var.g();
                        l(b6, jG > 0 ? jG : ~jG);
                        return new d0(jG);
                    }
                    if (b5 == 64) {
                        j0Var.u((byte) 64);
                        byte[] bArrZ = j0Var.z();
                        int length = bArrZ.length;
                        l(b6, length);
                        return new b0(X.s(bArrZ, length));
                    }
                    if (b5 == 96) {
                        j0Var.u((byte) 96);
                        String str = new String(j0Var.z(), StandardCharsets.UTF_8);
                        l(b6, str.length());
                        return new f0(str);
                    }
                    throw new c0("Unidentifiable major type: " + ((b5 >> 5) & 7));
                }
                long jH = j0Var.h();
                if (jH > 1000) {
                    throw new c0("Parser being asked to read a large CBOR map");
                }
                l(b6, jH);
                int i6 = (int) jH;
                ZF[] zfArr = new ZF[i6];
                h0 h0Var = null;
                int i7 = 0;
                while (i7 < jH) {
                    h0 h0VarK = k(j0Var);
                    if (h0Var != null && h0VarK.compareTo(h0Var) <= 0) {
                        throw new C1521pA("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + h0Var.toString() + "\nCurrent key: " + h0VarK.toString());
                    }
                    zfArr[i7] = new ZF(4, h0VarK, k(j0Var));
                    i7++;
                    h0Var = h0VarK;
                }
                TreeMap treeMap = new TreeMap();
                while (i5 < i6) {
                    ZF zf = zfArr[i5];
                    if (treeMap.containsKey((h0) zf.q)) {
                        throw new C1521pA("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((h0) zf.q, (h0) zf.p);
                    i5++;
                }
                return new e0(C2215s.b(treeMap));
            } catch (IOException e) {
                e = e;
                throw new c0(e);
            } catch (RuntimeException e3) {
                e = e3;
                throw new c0(e);
            }
        } catch (IOException e5) {
            throw new c0(e5);
        }
    }

    public static final void l(byte b5, long j5) throws C1521pA {
        switch (b5) {
            case 24:
                if (j5 >= 24) {
                    return;
                }
                throw new C1521pA("Integer value " + j5 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j5 >= 256) {
                    return;
                }
                throw new C1521pA("Integer value " + j5 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j5 >= 65536) {
                    return;
                }
                throw new C1521pA("Integer value " + j5 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j5 >= 4294967296L) {
                    return;
                }
                throw new C1521pA("Integer value " + j5 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }

    public static void m(int i5, int i6, int i7) {
        String strN;
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            if (i5 < 0 || i5 > i7) {
                strN = n(i5, i7, "start index");
            } else {
                strN = (i6 < 0 || i6 > i7) ? n(i6, i7, "end index") : c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i5, int i6, String str) {
        if (i5 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(AbstractC1421mz.h(i6, "negative size: "));
    }
}
