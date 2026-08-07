package p082t2;

import A.e;
import T1.z;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.measurement.AbstractC2008c2;
import com.google.android.gms.internal.measurement.AbstractC2020e2;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.C1995a1;
import com.google.android.gms.internal.measurement.C2001b1;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.gms.internal.measurement.C2011d;
import com.google.android.gms.internal.measurement.C2013d1;
import com.google.android.gms.internal.measurement.C2019e1;
import com.google.android.gms.internal.measurement.C2037h1;
import com.google.android.gms.internal.measurement.C2043i1;
import com.google.android.gms.internal.measurement.C2049j1;
import com.google.android.gms.internal.measurement.C2065m1;
import com.google.android.gms.internal.measurement.C2067m3;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.C2075o1;
import com.google.android.gms.internal.measurement.C2076o2;
import com.google.android.gms.internal.measurement.C2080p1;
import com.google.android.gms.internal.measurement.C2085q1;
import com.google.android.gms.internal.measurement.C2118x0;
import com.google.android.gms.internal.measurement.C2128z0;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.InterfaceC2061l2;
import com.google.android.gms.internal.measurement.InterfaceC2066m2;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.N0;
import com.google.android.gms.internal.measurement.V0;
import com.google.android.gms.internal.measurement.X0;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.internal.measurement.o4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p103y.b;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(j1 j1Var, int i5) {
        super(j1Var);
        this.f12496d = i5;
    }

    public static ArrayList A(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            long j5 = 0;
            for (int i6 = 0; i6 < 64; i6++) {
                int i7 = (i5 << 6) + i6;
                if (i7 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i7)) {
                    j5 |= 1 << i6;
                }
            }
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    public static HashMap B(Bundle bundle, boolean z3) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z4 = obj instanceof Parcelable[];
            if (z4 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(B((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList2.get(i5);
                            i5++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(B((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(B((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static C2264v D(C2011d c2011d) {
        Object obj;
        Bundle bundleU = u(c2011d.f10648c, true);
        String string = (!bundleU.containsKey("_o") || (obj = bundleU.get("_o")) == null) ? "app" : obj.toString();
        String strC = AbstractC2261t0.c(c2011d.f10646a, AbstractC2261t0.f12851a, AbstractC2261t0.f12853c);
        if (strC == null) {
            strC = c2011d.f10646a;
        }
        return new C2264v(strC, new r(bundleU), string, c2011d.f10647b);
    }

    public static void G(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void H(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                G(builder, str3, string, set);
            }
        }
    }

    public static void I(C1995a1 c1995a1, String str, Long l5) {
        List listL = c1995a1.l();
        int i5 = 0;
        while (true) {
            if (i5 >= listL.size()) {
                i5 = -1;
                break;
            } else if (str.equals(((C2019e1) listL.get(i5)).E())) {
                break;
            } else {
                i5++;
            }
        }
        C2013d1 c2013d1D = C2019e1.D();
        c2013d1D.f(str);
        if (l5 != null) {
            c2013d1D.e(l5.longValue());
        }
        if (i5 < 0) {
            c1995a1.e(c2013d1D);
        } else {
            c1995a1.c();
            C2001b1.u((C2001b1) c1995a1.p, i5, (C2019e1) c2013d1D.a());
        }
    }

    public static void M(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append("  ");
        }
    }

    public static void P(StringBuilder sb, int i5, String str, C2128z0 c2128z0) {
        String str2;
        if (c2128z0 == null) {
            return;
        }
        M(sb, i5);
        sb.append(str);
        sb.append(" {\n");
        if (c2128z0.v()) {
            int iP = c2128z0.p();
            if (iP == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iP == 2) {
                str2 = "LESS_THAN";
            } else if (iP == 3) {
                str2 = "GREATER_THAN";
            } else if (iP == 4) {
                str2 = "EQUAL";
            } else {
                if (iP != 5) {
                    throw null;
                }
                str2 = "BETWEEN";
            }
            Q(sb, i5, "comparison_type", str2);
        }
        if (c2128z0.x()) {
            Q(sb, i5, "match_as_float", Boolean.valueOf(c2128z0.u()));
        }
        if (c2128z0.w()) {
            Q(sb, i5, "comparison_value", c2128z0.r());
        }
        if (c2128z0.z()) {
            Q(sb, i5, "min_comparison_value", c2128z0.t());
        }
        if (c2128z0.y()) {
            Q(sb, i5, "max_comparison_value", c2128z0.s());
        }
        M(sb, i5);
        sb.append("}\n");
    }

    public static void Q(StringBuilder sb, int i5, String str, Object obj) {
        if (obj == null) {
            return;
        }
        M(sb, i5 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void R(StringBuilder sb, String str, C2065m1 c2065m1) {
        if (c2065m1 == null) {
            return;
        }
        M(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c2065m1.s() != 0) {
            M(sb, 4);
            sb.append("results: ");
            int i5 = 0;
            for (Long l5 : c2065m1.E()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l5);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (c2065m1.y() != 0) {
            M(sb, 4);
            sb.append("status: ");
            int i7 = 0;
            for (Long l6 : c2065m1.G()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(l6);
                i7 = i8;
            }
            sb.append('\n');
        }
        if (c2065m1.p() != 0) {
            M(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i9 = 0;
            for (Z0 z3 : c2065m1.D()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(z3.v() ? Integer.valueOf(z3.p()) : null);
                sb.append(":");
                sb.append(z3.u() ? Long.valueOf(z3.s()) : null);
                i9 = i10;
            }
            sb.append("}\n");
        }
        if (c2065m1.v() != 0) {
            M(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i11 = 0;
            for (C2075o1 c2075o1 : c2065m1.F()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(c2075o1.w() ? Integer.valueOf(c2075o1.t()) : null);
                sb.append(": [");
                Iterator it = c2075o1.v().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i13 = i14;
                }
                sb.append("]");
                i11 = i12;
            }
            sb.append("}\n");
        }
        M(sb, 3);
        sb.append("}\n");
    }

    public static boolean T(InterfaceC2066m2 interfaceC2066m2, int i5) {
        if (i5 < (interfaceC2066m2.size() << 6)) {
            return ((1 << (i5 % 64)) & ((Long) interfaceC2066m2.get(i5 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static byte[] U(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[Fields.RotationZ];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static Bundle V(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2019e1 c2019e1 = (C2019e1) it.next();
            String strE = c2019e1.E();
            if (c2019e1.H()) {
                bundle.putString(strE, String.valueOf(c2019e1.p()));
            } else if (c2019e1.I()) {
                bundle.putString(strE, String.valueOf(c2019e1.w()));
            } else if (c2019e1.L()) {
                bundle.putString(strE, c2019e1.F());
            } else if (c2019e1.J()) {
                bundle.putString(strE, String.valueOf(c2019e1.B()));
            }
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable W(C2001b1 c2001b1, String str) {
        C2019e1 c2019e1W = w(c2001b1, str);
        if (c2019e1W == null) {
            return null;
        }
        if (c2019e1W.L()) {
            return c2019e1W.F();
        }
        if (c2019e1W.J()) {
            return Long.valueOf(c2019e1W.B());
        }
        if (c2019e1W.H()) {
            return Double.valueOf(c2019e1W.p());
        }
        if (c2019e1W.z() <= 0) {
            return null;
        }
        List<C2019e1> listG = c2019e1W.G();
        ArrayList arrayList = new ArrayList();
        for (C2019e1 c2019e1 : listG) {
            if (c2019e1 != null) {
                Bundle bundle = new Bundle();
                for (C2019e1 c2019e2 : c2019e1.G()) {
                    if (c2019e2.L()) {
                        bundle.putString(c2019e2.E(), c2019e2.F());
                    } else if (c2019e2.J()) {
                        bundle.putLong(c2019e2.E(), c2019e2.B());
                    } else if (c2019e2.H()) {
                        bundle.putDouble(c2019e2.E(), c2019e2.p());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean X(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle Z(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2085q1 c2085q1 = (C2085q1) it.next();
            String strC = c2085q1.C();
            if (c2085q1.E()) {
                bundle.putString(strC, String.valueOf(c2085q1.p()));
            } else if (c2085q1.F()) {
                bundle.putString(strC, String.valueOf(c2085q1.u()));
            } else if (c2085q1.I()) {
                bundle.putString(strC, c2085q1.D());
            } else if (c2085q1.G()) {
                bundle.putString(strC, String.valueOf(c2085q1.y()));
            }
        }
        return bundle;
    }

    public static int r(C2043i1 c2043i1, String str) {
        for (int i5 = 0; i5 < ((C2049j1) c2043i1.p).h1(); i5++) {
            if (str.equals(((C2049j1) c2043i1.p).c0(i5).C())) {
                return i5;
            }
        }
        return -1;
    }

    public static Bundle t(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2019e1 c2019e1 = (C2019e1) it.next();
            String strE = c2019e1.E();
            if (c2019e1.H()) {
                bundle.putDouble(strE, c2019e1.p());
            } else if (c2019e1.I()) {
                bundle.putFloat(strE, c2019e1.w());
            } else if (c2019e1.L()) {
                bundle.putString(strE, c2019e1.F());
            } else if (c2019e1.J()) {
                bundle.putLong(strE, c2019e1.B());
            }
        }
        return bundle;
    }

    public static Bundle u(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z3) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    arrayList2.add(u((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static C2019e1 w(C2001b1 c2001b1, String str) {
        for (C2019e1 c2019e1 : c2001b1.E()) {
            if (c2019e1.E().equals(str)) {
                return c2019e1;
            }
        }
        return null;
    }

    public static AbstractC2020e2 x(AbstractC2020e2 abstractC2020e2, byte[] bArr) throws C2076o2 {
        X1 x1C;
        X1 x4 = X1.f10612b;
        if (x4 == null) {
            synchronized (X1.class) {
                try {
                    x1C = X1.f10612b;
                    if (x1C == null) {
                        x1C = AbstractC2008c2.c();
                        X1.f10612b = x1C;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            x4 = x1C;
        }
        if (x4 != null) {
            abstractC2020e2.getClass();
            abstractC2020e2.d(bArr, bArr.length, x4);
            return abstractC2020e2;
        }
        abstractC2020e2.getClass();
        abstractC2020e2.d(bArr, bArr.length, X1.f10613c);
        return abstractC2020e2;
    }

    public static String z(boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder();
        if (z3) {
            sb.append("Dynamic ");
        }
        if (z4) {
            sb.append("Sequence ");
        }
        if (z5) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public List C(InterfaceC2066m2 interfaceC2066m2, List list) {
        int i5;
        ArrayList arrayList = new ArrayList(interfaceC2066m2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                j().f12474i.f(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    j().f12474i.h("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i6 = size2;
            i5 = size;
            size = i6;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i5);
    }

    public d1 E(String str, C2043i1 c2043i1, C1995a1 c1995a1, String str2) {
        int iIndexOf;
        C2010c4.a();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!c2236g0.g.t(str, AbstractC2268x.f12891C0)) {
            return null;
        }
        c2236g0.f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        F f5 = AbstractC2268x.f12940d0;
        C2235g c2235g = c2236g0.g;
        Set setE = AbstractC2261t0.e(c2235g.r(str, f5).split(","));
        Uri.Builder builderO = this.f12662b.f12724j.o(str);
        G(builderO, "gmp_app_id", ((C2049j1) c2043i1.p).I(), setE);
        G(builderO, "gmp_version", "84002", setE);
        String strV1 = ((C2049j1) c2043i1.p).V1();
        F f6 = AbstractC2268x.f12897F0;
        String str3 = "";
        if (c2235g.t(str, f6) && n().E(str)) {
            strV1 = "";
        }
        G(builderO, "app_instance_id", strV1, setE);
        G(builderO, "rdid", ((C2049j1) c2043i1.p).M(), setE);
        G(builderO, "bundle_id", c2043i1.T(), setE);
        String strK = c1995a1.k();
        String strC = AbstractC2261t0.c(strK, AbstractC2261t0.f12853c, AbstractC2261t0.f12851a);
        if (!TextUtils.isEmpty(strC)) {
            strK = strC;
        }
        G(builderO, "app_event_name", strK, setE);
        G(builderO, "app_version", String.valueOf(((C2049j1) c2043i1.p).b0()), setE);
        String strK2 = ((C2049j1) c2043i1.p).K();
        if (!c2235g.t(str, f6) || !n().F(str)) {
            str3 = strK2;
        } else if (c2235g.t(str, AbstractC2268x.f12968u0)) {
            if (!TextUtils.isEmpty(strK2) && (iIndexOf = strK2.indexOf(".")) != -1) {
                strK2 = strK2.substring(0, iIndexOf);
            }
            str3 = strK2;
        }
        G(builderO, "os_version", str3, setE);
        G(builderO, "timestamp", String.valueOf(c1995a1.j()), setE);
        if (((C2049j1) c2043i1.p).U()) {
            G(builderO, "lat", "1", setE);
        }
        G(builderO, "privacy_sandbox_version", String.valueOf(((C2049j1) c2043i1.p).p()), setE);
        G(builderO, "trigger_uri_source", "1", setE);
        G(builderO, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setE);
        G(builderO, "request_uuid", str2, setE);
        H(builderO, c2235g.r(str, AbstractC2268x.f12938c0).split("\\|"), V(c1995a1.l()), setE);
        H(builderO, c2235g.r(str, AbstractC2268x.f12936b0).split("\\|"), Z(Collections.unmodifiableList(((C2049j1) c2043i1.p).R())), setE);
        if (c2235g.t(null, AbstractC2268x.f12907K0)) {
            G(builderO, "dma", ((C2049j1) c2043i1.p).T() ? "1" : "0", setE);
            if (!((C2049j1) c2043i1.p).E().isEmpty()) {
                G(builderO, "dma_cps", ((C2049j1) c2043i1.p).E(), setE);
            }
        }
        return new d1(builderO.build().toString(), jCurrentTimeMillis, 1);
    }

    public d1 F(String str, C2049j1 c2049j1, C1995a1 c1995a1, String str2) {
        int iIndexOf;
        C2010c4.a();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!c2236g0.g.t(str, AbstractC2268x.f12891C0)) {
            return null;
        }
        c2236g0.f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        F f5 = AbstractC2268x.f12940d0;
        C2235g c2235g = c2236g0.g;
        Set setE = AbstractC2261t0.e(c2235g.r(str, f5).split(","));
        Uri.Builder builderO = this.f12662b.f12724j.o(str);
        G(builderO, "gmp_app_id", c2049j1.I(), setE);
        G(builderO, "gmp_version", "84002", setE);
        String strV1 = c2049j1.V1();
        F f6 = AbstractC2268x.f12897F0;
        String str3 = "";
        if (c2235g.t(str, f6) && n().E(str)) {
            strV1 = "";
        }
        G(builderO, "app_instance_id", strV1, setE);
        G(builderO, "rdid", c2049j1.M(), setE);
        G(builderO, "bundle_id", c2049j1.U1(), setE);
        String strK = c1995a1.k();
        String strC = AbstractC2261t0.c(strK, AbstractC2261t0.f12853c, AbstractC2261t0.f12851a);
        if (!TextUtils.isEmpty(strC)) {
            strK = strC;
        }
        G(builderO, "app_event_name", strK, setE);
        G(builderO, "app_version", String.valueOf(c2049j1.b0()), setE);
        String strK2 = c2049j1.K();
        if (!c2235g.t(str, f6) || !n().F(str)) {
            str3 = strK2;
        } else if (c2235g.t(str, AbstractC2268x.f12968u0)) {
            if (!TextUtils.isEmpty(strK2) && (iIndexOf = strK2.indexOf(".")) != -1) {
                strK2 = strK2.substring(0, iIndexOf);
            }
            str3 = strK2;
        }
        G(builderO, "os_version", str3, setE);
        G(builderO, "timestamp", String.valueOf(c1995a1.j()), setE);
        if (c2049j1.U()) {
            G(builderO, "lat", "1", setE);
        }
        G(builderO, "privacy_sandbox_version", String.valueOf(c2049j1.p()), setE);
        G(builderO, "trigger_uri_source", "1", setE);
        G(builderO, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setE);
        G(builderO, "request_uuid", str2, setE);
        H(builderO, c2235g.r(str, AbstractC2268x.f12938c0).split("\\|"), V(c1995a1.l()), setE);
        H(builderO, c2235g.r(str, AbstractC2268x.f12936b0).split("\\|"), Z(c2049j1.R()), setE);
        if (c2235g.t(null, AbstractC2268x.f12907K0)) {
            G(builderO, "dma", c2049j1.T() ? "1" : "0", setE);
            if (!c2049j1.E().isEmpty()) {
                G(builderO, "dma_cps", c2049j1.E(), setE);
            }
        }
        return new d1(builderO.build().toString(), jCurrentTimeMillis, 1);
    }

    public void J(C2013d1 c2013d1, Object obj) {
        c2013d1.c();
        C2019e1.v((C2019e1) c2013d1.p);
        c2013d1.c();
        C2019e1.x((C2019e1) c2013d1.p);
        c2013d1.c();
        C2019e1.A((C2019e1) c2013d1.p);
        c2013d1.c();
        C2019e1.C((C2019e1) c2013d1.p);
        if (obj instanceof String) {
            c2013d1.g((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2013d1.e(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c2013d1.c();
            C2019e1.q((C2019e1) c2013d1.p, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            j().f12472f.f(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C2013d1 c2013d1D = C2019e1.D();
                for (String str : bundle.keySet()) {
                    C2013d1 c2013d1D2 = C2019e1.D();
                    c2013d1D2.f(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c2013d1D2.e(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c2013d1D2.g((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c2013d1D2.c();
                        C2019e1.q((C2019e1) c2013d1D2.p, dDoubleValue2);
                    }
                    c2013d1D.c();
                    C2019e1.s((C2019e1) c2013d1D.p, (C2019e1) c2013d1D2.a());
                }
                if (((C2019e1) c2013d1D.p).z() > 0) {
                    arrayList.add((C2019e1) c2013d1D.a());
                }
            }
        }
        c2013d1.c();
        C2019e1.u((C2019e1) c2013d1.p, arrayList);
    }

    public void K(C2043i1 c2043i1) {
        j().f12479n.g("Checking account type status for ad personalization signals");
        if (a0(c2043i1.T())) {
            j().f12478m.g("Turning off ad personalization due to account type");
            C2080p1 c2080p1B = C2085q1.B();
            c2080p1B.c();
            C2085q1.s((C2085q1) c2080p1B.p, "_npa");
            C2236g0 c2236g0 = (C2236g0) this.f12783a;
            C2255q c2255qO = c2236g0.o();
            c2255qO.h();
            long j5 = c2255qO.g;
            c2080p1B.c();
            C2085q1.r((C2085q1) c2080p1B.p, j5);
            c2080p1B.c();
            C2085q1.w((C2085q1) c2080p1B.p, 1L);
            C2085q1 c2085q1 = (C2085q1) c2080p1B.a();
            int i5 = 0;
            while (true) {
                if (i5 >= ((C2049j1) c2043i1.p).h1()) {
                    c2043i1.c();
                    C2049j1.x((C2049j1) c2043i1.p, c2085q1);
                    break;
                } else {
                    if ("_npa".equals(((C2049j1) c2043i1.p).c0(i5).C())) {
                        c2043i1.c();
                        C2049j1.t((C2049j1) c2043i1.p, i5, c2085q1);
                        break;
                    }
                    i5++;
                }
            }
            C2072n3.a();
            if (c2236g0.g.t(null, AbstractC2268x.f12907K0)) {
                e eVarK = e.k(((C2049j1) c2043i1.p).C());
                eVarK.r(EnumC2257r0.AD_PERSONALIZATION, EnumC2241j.CHILD_ACCOUNT);
                String string = eVarK.toString();
                c2043i1.c();
                C2049j1.b1((C2049j1) c2043i1.p, string);
            }
        }
    }

    public void L(C2080p1 c2080p1, Object obj) {
        z.i(obj);
        c2080p1.c();
        C2085q1.t((C2085q1) c2080p1.p);
        c2080p1.c();
        C2085q1.v((C2085q1) c2080p1.p);
        c2080p1.c();
        C2085q1.z((C2085q1) c2080p1.p);
        if (obj instanceof String) {
            c2080p1.c();
            C2085q1.x((C2085q1) c2080p1.p, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c2080p1.c();
            C2085q1.w((C2085q1) c2080p1.p, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                j().f12472f.f(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            c2080p1.c();
            C2085q1.q((C2085q1) c2080p1.p, dDoubleValue);
        }
    }

    public void N(StringBuilder sb, int i5, C2118x0 c2118x0) {
        String str;
        if (c2118x0 == null) {
            return;
        }
        M(sb, i5);
        sb.append("filter {\n");
        if (c2118x0.v()) {
            Q(sb, i5, "complement", Boolean.valueOf(c2118x0.u()));
        }
        if (c2118x0.x()) {
            Q(sb, i5, "param_name", ((C2236g0) this.f12783a).f12685m.f(c2118x0.t()));
        }
        if (c2118x0.y()) {
            int i6 = i5 + 1;
            C0 c0S = c2118x0.s();
            if (c0S != null) {
                M(sb, i6);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c0S.x()) {
                    switch (c0S.q()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        case 7:
                            str = "IN_LIST";
                            break;
                        default:
                            throw null;
                    }
                    Q(sb, i6, "match_type", str);
                }
                if (c0S.w()) {
                    Q(sb, i6, "expression", c0S.s());
                }
                if (c0S.v()) {
                    Q(sb, i6, "case_sensitive", Boolean.valueOf(c0S.u()));
                }
                if (c0S.p() > 0) {
                    M(sb, i5 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : c0S.t()) {
                        M(sb, i5 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                M(sb, i6);
                sb.append("}\n");
            }
        }
        if (c2118x0.w()) {
            P(sb, i5 + 1, "number_filter", c2118x0.r());
        }
        M(sb, i5);
        sb.append("}\n");
    }

    public void O(StringBuilder sb, int i5, InterfaceC2061l2 interfaceC2061l2) {
        if (interfaceC2061l2 == null) {
            return;
        }
        int i6 = i5 + 1;
        Iterator it = interfaceC2061l2.iterator();
        while (it.hasNext()) {
            C2019e1 c2019e1 = (C2019e1) it.next();
            if (c2019e1 != null) {
                M(sb, i6);
                sb.append("param {\n");
                Q(sb, i6, "name", c2019e1.K() ? ((C2236g0) this.f12783a).f12685m.f(c2019e1.E()) : null);
                Q(sb, i6, "string_value", c2019e1.L() ? c2019e1.F() : null);
                Q(sb, i6, "int_value", c2019e1.J() ? Long.valueOf(c2019e1.B()) : null);
                Q(sb, i6, "double_value", c2019e1.H() ? Double.valueOf(c2019e1.p()) : null);
                if (c2019e1.z() > 0) {
                    O(sb, i6, (InterfaceC2061l2) c2019e1.G());
                }
                M(sb, i6);
                sb.append("}\n");
            }
        }
    }

    public boolean S(long j5, long j6) {
        if (j5 == 0 || j6 <= 0) {
            return true;
        }
        ((C2236g0) this.f12783a).f12686n.getClass();
        return Math.abs(System.currentTimeMillis() - j5) > j6;
    }

    public byte[] Y(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            j().f12472f.f(e, "Failed to gzip content");
            throw e;
        }
    }

    public boolean a0(String str) {
        boolean zBooleanValue;
        C2067m3.p.get();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (c2236g0.g.t(null, AbstractC2268x.f12923S0)) {
            return false;
        }
        z.i(str);
        S sY = l().Y(str);
        if (sY == null) {
            return false;
        }
        C2255q c2255qO = c2236g0.o();
        c2255qO.h();
        C2236g0 c2236g1 = (C2236g0) c2255qO.f12783a;
        c2236g1.f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c2255qO.g > CalendarModelKt.MillisecondsIn24Hours) {
            c2255qO.f12820f = null;
        }
        Boolean bool = c2255qO.f12820f;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = c2236g1.f12675a;
            if (b.a(context, "android.permission.GET_ACCOUNTS") != 0) {
                c2255qO.j().f12475j.g("Permission error checking for dasher/unicorn accounts");
                c2255qO.g = jCurrentTimeMillis;
                c2255qO.f12820f = Boolean.FALSE;
            } else {
                if (c2255qO.e == null) {
                    c2255qO.e = AccountManager.get(context);
                }
                try {
                    Account[] result = c2255qO.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result == null || result.length <= 0) {
                        Account[] result2 = c2255qO.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                        if (result2 != null && result2.length > 0) {
                            c2255qO.f12820f = Boolean.TRUE;
                            c2255qO.g = jCurrentTimeMillis;
                        }
                        c2255qO.g = jCurrentTimeMillis;
                        c2255qO.f12820f = Boolean.FALSE;
                    } else {
                        c2255qO.f12820f = Boolean.TRUE;
                        c2255qO.g = jCurrentTimeMillis;
                    }
                    zBooleanValue = true;
                } catch (AuthenticatorException e) {
                    e = e;
                    c2255qO.j().g.f(e, "Exception checking account types");
                } catch (OperationCanceledException e3) {
                    e = e3;
                    c2255qO.j().g.f(e, "Exception checking account types");
                } catch (IOException e5) {
                    e = e5;
                    c2255qO.j().g.f(e, "Exception checking account types");
                }
            }
            zBooleanValue = false;
        }
        if (zBooleanValue && sY.h()) {
            Y yN = n();
            yN.h();
            N0 n0B = yN.B(str);
            if (n0B == null ? false : n0B.F()) {
                return true;
            }
        }
        return false;
    }

    public byte[] b0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[Fields.RotationZ];
            while (true) {
                int i5 = gZIPInputStream.read(bArr2);
                if (i5 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i5);
            }
        } catch (IOException e) {
            j().f12472f.f(e, "Failed to ungzip content");
            throw e;
        }
    }

    public ArrayList c0() {
        Context context = this.f12662b.f12726l.f12675a;
        List list = AbstractC2268x.f12933a;
        E1 e1A = E1.a(context.getContentResolver(), K1.a("com.google.android.gms.measurement"), RunnableC2266w.f12872o);
        Map mapEmptyMap = e1A == null ? Collections.emptyMap() : e1A.b();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) AbstractC2268x.f12918Q.a(null)).intValue();
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i5 = Integer.parseInt((String) entry.getValue());
                    if (i5 != 0) {
                        arrayList.add(Integer.valueOf(i5));
                        if (arrayList.size() >= iIntValue) {
                            j().f12474i.f(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    j().f12474i.f(e, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public boolean d0() {
        o();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C2236g0) this.f12783a).f12675a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // p082t2.h1
    public final boolean q() {
        switch (this.f12496d) {
        }
        return false;
    }

    public long s(byte[] bArr) {
        z.i(bArr);
        g().h();
        MessageDigest messageDigestV0 = n1.v0();
        if (messageDigestV0 != null) {
            return n1.s(messageDigestV0.digest(bArr));
        }
        j().f12472f.g("Failed to get MD5");
        return 0L;
    }

    public Parcelable v(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (U1.b unused) {
            j().f12472f.g("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public String y(C2037h1 c2037h1) {
        V0 v0R1;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C2049j1 c2049j1 : c2037h1.t()) {
            if (c2049j1 != null) {
                M(sb, 1);
                sb.append("bundle {\n");
                if (c2049j1.t0()) {
                    Q(sb, 1, "protocol_version", Integer.valueOf(c2049j1.R0()));
                }
                o4.a();
                C2236g0 c2236g0 = (C2236g0) this.f12783a;
                if (c2236g0.g.t(c2049j1.U1(), AbstractC2268x.f12964r0) && c2049j1.w0()) {
                    Q(sb, 1, "session_stitching_token", c2049j1.N());
                }
                Q(sb, 1, "platform", c2049j1.L());
                if (c2049j1.o0()) {
                    Q(sb, 1, "gmp_version", Long.valueOf(c2049j1.C1()));
                }
                if (c2049j1.B0()) {
                    Q(sb, 1, "uploading_gmp_version", Long.valueOf(c2049j1.P1()));
                }
                if (c2049j1.m0()) {
                    Q(sb, 1, "dynamite_version", Long.valueOf(c2049j1.u1()));
                }
                if (c2049j1.Z()) {
                    Q(sb, 1, "config_version", Long.valueOf(c2049j1.m1()));
                }
                Q(sb, 1, "gmp_app_id", c2049j1.I());
                Q(sb, 1, "admob_app_id", c2049j1.T1());
                Q(sb, 1, "app_id", c2049j1.U1());
                Q(sb, 1, "app_version", c2049j1.B());
                if (c2049j1.W()) {
                    Q(sb, 1, "app_version_major", Integer.valueOf(c2049j1.b0()));
                }
                Q(sb, 1, "firebase_instance_id", c2049j1.H());
                if (c2049j1.l0()) {
                    Q(sb, 1, "dev_cert_hash", Long.valueOf(c2049j1.q1()));
                }
                Q(sb, 1, "app_store", c2049j1.W1());
                if (c2049j1.A0()) {
                    Q(sb, 1, "upload_timestamp_millis", Long.valueOf(c2049j1.N1()));
                }
                if (c2049j1.x0()) {
                    Q(sb, 1, "start_timestamp_millis", Long.valueOf(c2049j1.J1()));
                }
                if (c2049j1.n0()) {
                    Q(sb, 1, "end_timestamp_millis", Long.valueOf(c2049j1.y1()));
                }
                if (c2049j1.s0()) {
                    Q(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2049j1.H1()));
                }
                if (c2049j1.r0()) {
                    Q(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2049j1.F1()));
                }
                Q(sb, 1, "app_instance_id", c2049j1.V1());
                Q(sb, 1, "resettable_device_id", c2049j1.M());
                Q(sb, 1, "ds_id", c2049j1.G());
                if (c2049j1.q0()) {
                    Q(sb, 1, "limited_ad_tracking", Boolean.valueOf(c2049j1.U()));
                }
                Q(sb, 1, "os_version", c2049j1.K());
                Q(sb, 1, "device_model", c2049j1.F());
                Q(sb, 1, "user_default_language", c2049j1.O());
                if (c2049j1.z0()) {
                    Q(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c2049j1.c1()));
                }
                if (c2049j1.Y()) {
                    Q(sb, 1, "bundle_sequential_index", Integer.valueOf(c2049j1.C0()));
                }
                if (c2049j1.v0()) {
                    Q(sb, 1, "service_upload", Boolean.valueOf(c2049j1.V()));
                }
                Q(sb, 1, "health_monitor", c2049j1.J());
                if (c2049j1.u0()) {
                    Q(sb, 1, "retry_counter", Integer.valueOf(c2049j1.X0()));
                }
                if (c2049j1.j0()) {
                    Q(sb, 1, "consent_signals", c2049j1.D());
                }
                if (c2049j1.p0()) {
                    Q(sb, 1, "is_dma_region", Boolean.valueOf(c2049j1.T()));
                }
                if (c2049j1.k0()) {
                    Q(sb, 1, "core_platform_services", c2049j1.E());
                }
                if (c2049j1.a0()) {
                    Q(sb, 1, "consent_diagnostics", c2049j1.C());
                }
                if (c2049j1.y0()) {
                    Q(sb, 1, "target_os_version", Long.valueOf(c2049j1.L1()));
                }
                C2010c4.a();
                if (c2236g0.g.t(c2049j1.U1(), AbstractC2268x.f12891C0)) {
                    Q(sb, 1, "ad_services_version", Integer.valueOf(c2049j1.p()));
                    if (c2049j1.X() && (v0R1 = c2049j1.R1()) != null) {
                        M(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Q(sb, 2, "eligible", Boolean.valueOf(v0R1.z()));
                        Q(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(v0R1.C()));
                        Q(sb, 2, "pre_r", Boolean.valueOf(v0R1.D()));
                        Q(sb, 2, "r_extensions_too_old", Boolean.valueOf(v0R1.E()));
                        Q(sb, 2, "adservices_extension_too_old", Boolean.valueOf(v0R1.x()));
                        Q(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(v0R1.v()));
                        Q(sb, 2, "measurement_manager_disabled", Boolean.valueOf(v0R1.B()));
                        M(sb, 2);
                        sb.append("}\n");
                    }
                }
                InterfaceC2061l2<C2085q1> interfaceC2061l2R = c2049j1.R();
                K k3 = c2236g0.f12685m;
                if (interfaceC2061l2R != null) {
                    for (C2085q1 c2085q1 : interfaceC2061l2R) {
                        if (c2085q1 != null) {
                            M(sb, 2);
                            sb.append("user_property {\n");
                            Q(sb, 2, "set_timestamp_millis", c2085q1.H() ? Long.valueOf(c2085q1.A()) : null);
                            Q(sb, 2, "name", k3.g(c2085q1.C()));
                            Q(sb, 2, "string_value", c2085q1.D());
                            Q(sb, 2, "int_value", c2085q1.G() ? Long.valueOf(c2085q1.y()) : null);
                            Q(sb, 2, "double_value", c2085q1.E() ? Double.valueOf(c2085q1.p()) : null);
                            M(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC2061l2<X0> interfaceC2061l2P = c2049j1.P();
                if (interfaceC2061l2P != null) {
                    for (X0 x4 : interfaceC2061l2P) {
                        if (x4 != null) {
                            M(sb, 2);
                            sb.append("audience_membership {\n");
                            if (x4.y()) {
                                Q(sb, 2, "audience_id", Integer.valueOf(x4.p()));
                            }
                            if (x4.z()) {
                                Q(sb, 2, "new_audience", Boolean.valueOf(x4.x()));
                            }
                            R(sb, "current_data", x4.v());
                            if (x4.A()) {
                                R(sb, "previous_data", x4.w());
                            }
                            M(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC2061l2<C2001b1> interfaceC2061l2Q = c2049j1.Q();
                if (interfaceC2061l2Q != null) {
                    for (C2001b1 c2001b1 : interfaceC2061l2Q) {
                        if (c2001b1 != null) {
                            M(sb, 2);
                            sb.append("event {\n");
                            Q(sb, 2, "name", k3.b(c2001b1.D()));
                            if (c2001b1.H()) {
                                Q(sb, 2, "timestamp_millis", Long.valueOf(c2001b1.B()));
                            }
                            if (c2001b1.G()) {
                                Q(sb, 2, "previous_timestamp_millis", Long.valueOf(c2001b1.A()));
                            }
                            if (c2001b1.F()) {
                                Q(sb, 2, "count", Integer.valueOf(c2001b1.p()));
                            }
                            if (c2001b1.y() != 0) {
                                O(sb, 2, c2001b1.E());
                            }
                            M(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                M(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
}
