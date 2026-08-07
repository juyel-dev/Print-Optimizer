package p065o3;

import W.P;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.razorpay.AppSignatureHelper;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p051l3.e;
import p051l3.f;
import p051l3.i;
import p051l3.j;
import p051l3.p;
import p060n3.h;
import p060n3.k;
import p060n3.l;
import p076s.b;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f12180b = new f(new g(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12181a;

    public /* synthetic */ g(int i5) {
        this.f12181a = i5;
    }

    public static f c(a aVar, int i5) {
        int iB = P.b(i5);
        if (iB == 5) {
            return new j(aVar.J());
        }
        if (iB == 6) {
            return new j(new h(aVar.J()));
        }
        if (iB == 7) {
            return new j(Boolean.valueOf(aVar.B()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(b.D(i5)));
        }
        aVar.H();
        return p051l3.h.f11854o;
    }

    public static void d(p079s3.b bVar, f fVar) throws IOException {
        if (fVar == null || (fVar instanceof p051l3.h)) {
            bVar.y();
            return;
        }
        boolean z3 = fVar instanceof j;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + fVar);
            }
            j jVar = (j) fVar;
            Serializable serializable = jVar.f11856o;
            if (serializable instanceof Number) {
                bVar.D(jVar.c());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.F(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(jVar.g()));
                return;
            } else {
                bVar.E(jVar.g());
                return;
            }
        }
        boolean z4 = fVar instanceof e;
        if (z4) {
            bVar.g();
            if (!z4) {
                throw new IllegalStateException("Not a JSON Array: " + fVar);
            }
            Iterator it = ((e) fVar).f11853o.iterator();
            while (it.hasNext()) {
                d(bVar, (f) it.next());
            }
            bVar.j();
            return;
        }
        boolean z5 = fVar instanceof i;
        if (!z5) {
            throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
        }
        bVar.h();
        if (!z5) {
            throw new IllegalStateException("Not a JSON Object: " + fVar);
        }
        Iterator it2 = ((k) ((i) fVar).f11855o.entrySet()).iterator();
        while (((p060n3.j) it2).hasNext()) {
            l lVarB = ((p060n3.j) it2).b();
            bVar.p((String) lVarB.getKey());
            d(bVar, (f) lVarB.getValue());
        }
        bVar.n();
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        f eVar;
        f eVar2;
        boolean zB;
        switch (this.f12181a) {
            case 0:
                int iL = aVar.L();
                int iB = P.b(iL);
                if (iB == 5 || iB == 6) {
                    return new h(aVar.J());
                }
                if (iB == 8) {
                    aVar.H();
                    return null;
                }
                throw new p051l3.g("Expecting number, got: " + b.D(iL) + "; at path " + aVar.u(false));
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.y()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.D()));
                    } catch (NumberFormatException e) {
                        throw new p051l3.g(e);
                    }
                }
                aVar.j();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.E());
                } catch (NumberFormatException e3) {
                    throw new p051l3.g(e3);
                }
            case 3:
                if (aVar.L() != 9) {
                    return Float.valueOf((float) aVar.C());
                }
                aVar.H();
                return null;
            case 4:
                if (aVar.L() != 9) {
                    return Double.valueOf(aVar.C());
                }
                aVar.H();
                return null;
            case 5:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ = aVar.J();
                if (strJ.length() == 1) {
                    return Character.valueOf(strJ.charAt(0));
                }
                StringBuilder sbK = AbstractC1421mz.k("Expecting character, got: ", strJ, "; at ");
                sbK.append(aVar.u(true));
                throw new p051l3.g(sbK.toString());
            case 6:
                int iL2 = aVar.L();
                if (iL2 != 9) {
                    return iL2 == 8 ? Boolean.toString(aVar.B()) : aVar.J();
                }
                aVar.H();
                return null;
            case 7:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ2 = aVar.J();
                try {
                    return new BigDecimal(strJ2);
                } catch (NumberFormatException e5) {
                    StringBuilder sbK2 = AbstractC1421mz.k("Failed parsing '", strJ2, "' as BigDecimal; at path ");
                    sbK2.append(aVar.u(true));
                    throw new p051l3.g(sbK2.toString(), e5);
                }
            case 8:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ3 = aVar.J();
                try {
                    return new BigInteger(strJ3);
                } catch (NumberFormatException e6) {
                    StringBuilder sbK3 = AbstractC1421mz.k("Failed parsing '", strJ3, "' as BigInteger; at path ");
                    sbK3.append(aVar.u(true));
                    throw new p051l3.g(sbK3.toString(), e6);
                }
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                if (aVar.L() != 9) {
                    return new h(aVar.J());
                }
                aVar.H();
                return null;
            case 10:
                if (aVar.L() != 9) {
                    return new StringBuilder(aVar.J());
                }
                aVar.H();
                return null;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case Matrix.TranslateX /* 12 */:
                if (aVar.L() != 9) {
                    return new StringBuffer(aVar.J());
                }
                aVar.H();
                return null;
            case Matrix.TranslateY /* 13 */:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ4 = aVar.J();
                if ("null".equals(strJ4)) {
                    return null;
                }
                return new URL(strJ4);
            case Matrix.TranslateZ /* 14 */:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                try {
                    String strJ5 = aVar.J();
                    if ("null".equals(strJ5)) {
                        return null;
                    }
                    return new URI(strJ5);
                } catch (URISyntaxException e7) {
                    throw new p051l3.g(e7);
                }
            case 15:
                if (aVar.L() != 9) {
                    return InetAddress.getByName(aVar.J());
                }
                aVar.H();
                return null;
            case 16:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ6 = aVar.J();
                try {
                    return UUID.fromString(strJ6);
                } catch (IllegalArgumentException e8) {
                    StringBuilder sbK4 = AbstractC1421mz.k("Failed parsing '", strJ6, "' as UUID; at path ");
                    sbK4.append(aVar.u(true));
                    throw new p051l3.g(sbK4.toString(), e8);
                }
            case 17:
                String strJ7 = aVar.J();
                try {
                    return Currency.getInstance(strJ7);
                } catch (IllegalArgumentException e9) {
                    StringBuilder sbK5 = AbstractC1421mz.k("Failed parsing '", strJ7, "' as Currency; at path ");
                    sbK5.append(aVar.u(true));
                    throw new p051l3.g(sbK5.toString(), e9);
                }
            case 18:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                aVar.g();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (aVar.L() != 4) {
                    String strF = aVar.F();
                    int iD = aVar.D();
                    if ("year".equals(strF)) {
                        i6 = iD;
                    } else if ("month".equals(strF)) {
                        i7 = iD;
                    } else if ("dayOfMonth".equals(strF)) {
                        i8 = iD;
                    } else if ("hourOfDay".equals(strF)) {
                        i9 = iD;
                    } else if ("minute".equals(strF)) {
                        i10 = iD;
                    } else if ("second".equals(strF)) {
                        i11 = iD;
                    }
                }
                aVar.n();
                return new GregorianCalendar(i6, i7, i8, i9, i10, i11);
            case 19:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.J(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                int iL3 = aVar.L();
                int iB2 = P.b(iL3);
                if (iB2 == 0) {
                    aVar.c();
                    eVar = new e();
                } else if (iB2 != 2) {
                    eVar = null;
                } else {
                    aVar.g();
                    eVar = new i();
                }
                if (eVar == null) {
                    return c(aVar, iL3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.y()) {
                        String strF2 = eVar instanceof i ? aVar.F() : null;
                        int iL4 = aVar.L();
                        int iB3 = P.b(iL4);
                        if (iB3 == 0) {
                            aVar.c();
                            eVar2 = new e();
                        } else if (iB3 != 2) {
                            eVar2 = null;
                        } else {
                            aVar.g();
                            eVar2 = new i();
                        }
                        boolean z3 = eVar2 != null;
                        if (eVar2 == null) {
                            eVar2 = c(aVar, iL4);
                        }
                        if (eVar instanceof e) {
                            ((e) eVar).f11853o.add(eVar2);
                        } else {
                            ((i) eVar).f11855o.put(strF2, eVar2);
                        }
                        if (z3) {
                            arrayDeque.addLast(eVar);
                            eVar = eVar2;
                        }
                    } else {
                        if (eVar instanceof e) {
                            aVar.j();
                        } else {
                            aVar.n();
                        }
                        if (arrayDeque.isEmpty()) {
                            return eVar;
                        }
                        eVar = (f) arrayDeque.removeLast();
                    }
                }
                break;
            case 21:
                BitSet bitSet = new BitSet();
                aVar.c();
                int iL5 = aVar.L();
                int i12 = 0;
                while (iL5 != 2) {
                    int iB4 = P.b(iL5);
                    if (iB4 == 5 || iB4 == 6) {
                        int iD2 = aVar.D();
                        if (iD2 == 0) {
                            zB = false;
                        } else {
                            if (iD2 != 1) {
                                StringBuilder sbJ = AbstractC1421mz.j("Invalid bitset value ", iD2, ", expected 0 or 1; at path ");
                                sbJ.append(aVar.u(true));
                                throw new p051l3.g(sbJ.toString());
                            }
                            zB = true;
                        }
                    } else {
                        if (iB4 != 7) {
                            throw new p051l3.g("Invalid bitset value type: " + b.D(iL5) + "; at path " + aVar.u(false));
                        }
                        zB = aVar.B();
                    }
                    if (zB) {
                        bitSet.set(i12);
                    }
                    i12++;
                    iL5 = aVar.L();
                }
                aVar.j();
                return bitSet;
            case 22:
                int iL6 = aVar.L();
                if (iL6 != 9) {
                    return iL6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.J())) : Boolean.valueOf(aVar.B());
                }
                aVar.H();
                return null;
            case 23:
                if (aVar.L() != 9) {
                    return Boolean.valueOf(aVar.J());
                }
                aVar.H();
                return null;
            case 24:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                try {
                    int iD3 = aVar.D();
                    if (iD3 <= 255 && iD3 >= -128) {
                        return Byte.valueOf((byte) iD3);
                    }
                    StringBuilder sbJ2 = AbstractC1421mz.j("Lossy conversion from ", iD3, " to byte; at path ");
                    sbJ2.append(aVar.u(true));
                    throw new p051l3.g(sbJ2.toString());
                } catch (NumberFormatException e10) {
                    throw new p051l3.g(e10);
                }
            case 25:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                try {
                    int iD4 = aVar.D();
                    if (iD4 <= 65535 && iD4 >= -32768) {
                        return Short.valueOf((short) iD4);
                    }
                    StringBuilder sbJ3 = AbstractC1421mz.j("Lossy conversion from ", iD4, " to short; at path ");
                    sbJ3.append(aVar.u(true));
                    throw new p051l3.g(sbJ3.toString());
                } catch (NumberFormatException e11) {
                    throw new p051l3.g(e11);
                }
            case 26:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.D());
                } catch (NumberFormatException e12) {
                    throw new p051l3.g(e12);
                }
            case 27:
                try {
                    return new AtomicInteger(aVar.D());
                } catch (NumberFormatException e13) {
                    throw new p051l3.g(e13);
                }
            default:
                return new AtomicBoolean(aVar.B());
        }
    }

    @Override // p051l3.p
    public final void b(p079s3.b bVar, Object obj) throws IOException {
        switch (this.f12181a) {
            case 0:
                bVar.D((Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                bVar.g();
                int length = atomicIntegerArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    bVar.C(atomicIntegerArray.get(i5));
                }
                bVar.j();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.y();
                    return;
                } else {
                    bVar.C(number.longValue());
                    return;
                }
            case 3:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.y();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.D(numberValueOf);
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.y();
                    return;
                } else {
                    bVar.B(number2.doubleValue());
                    return;
                }
            case 5:
                Character ch = (Character) obj;
                bVar.E(ch == null ? null : String.valueOf(ch));
                return;
            case 6:
                bVar.E((String) obj);
                return;
            case 7:
                bVar.D((BigDecimal) obj);
                return;
            case 8:
                bVar.D((BigInteger) obj);
                return;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                bVar.D((h) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                bVar.E(sb == null ? null : sb.toString());
                return;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case Matrix.TranslateX /* 12 */:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.E(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case Matrix.TranslateY /* 13 */:
                URL url = (URL) obj;
                bVar.E(url == null ? null : url.toExternalForm());
                return;
            case Matrix.TranslateZ /* 14 */:
                URI uri = (URI) obj;
                bVar.E(uri == null ? null : uri.toASCIIString());
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.E(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 16:
                UUID uuid = (UUID) obj;
                bVar.E(uuid == null ? null : uuid.toString());
                return;
            case 17:
                bVar.E(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    bVar.y();
                    return;
                }
                bVar.h();
                bVar.p("year");
                bVar.C(calendar.get(1));
                bVar.p("month");
                bVar.C(calendar.get(2));
                bVar.p("dayOfMonth");
                bVar.C(calendar.get(5));
                bVar.p("hourOfDay");
                bVar.C(calendar.get(11));
                bVar.p("minute");
                bVar.C(calendar.get(12));
                bVar.p("second");
                bVar.C(calendar.get(13));
                bVar.n();
                return;
            case 19:
                Locale locale = (Locale) obj;
                bVar.E(locale == null ? null : locale.toString());
                return;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                d(bVar, (f) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.g();
                int length2 = bitSet.length();
                for (int i6 = 0; i6 < length2; i6++) {
                    bVar.C(bitSet.get(i6) ? 1L : 0L);
                }
                bVar.j();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.y();
                    return;
                }
                bVar.G();
                bVar.c();
                bVar.f12363o.write(bool.booleanValue() ? "true" : "false");
                return;
            case 23:
                Boolean bool2 = (Boolean) obj;
                bVar.E(bool2 == null ? "null" : bool2.toString());
                return;
            case 24:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    bVar.y();
                    return;
                } else {
                    bVar.C(number3.byteValue());
                    return;
                }
            case 25:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    bVar.y();
                    return;
                } else {
                    bVar.C(number4.shortValue());
                    return;
                }
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    bVar.y();
                    return;
                } else {
                    bVar.C(number5.intValue());
                    return;
                }
            case 27:
                bVar.C(((AtomicInteger) obj).get());
                return;
            default:
                bVar.F(((AtomicBoolean) obj).get());
                return;
        }
    }
}
