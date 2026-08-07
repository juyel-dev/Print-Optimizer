package p111z2;

import B3.l;
import C3.AbstractC0131k;
import C3.C;
import M0.f;
import O3.a;
import V3.j;
import W.P;
import W0.c;
import W3.q;
import X3.H;
import Z0.i;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1722tt;
import com.google.android.gms.internal.ads.C1844wj;
import com.google.android.gms.internal.ads.Rs;
import com.google.android.gms.internal.ads.Ss;
import g4.p;
import g4.u;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p085u1.k;
import p090v1.C2366q;
import p102x3.S2;
import p104y0.d;
import p104y0.e;
import t4.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f16085a;

    public static final double A(long j5) {
        return ((j5 >>> 11) * ((double) Fields.CameraDistance)) + (j5 & 2047);
    }

    public static Bundle B(Context context, String str) {
        JSONArray jSONArray;
        int i5;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                AbstractC1223ib.o("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i5 = 1;
            } else if (iOptInt != 1) {
                i5 = iOptInt != 2 ? 0 : 3;
            } else {
                i5 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i5 != 0) {
                List listT = C1844wj.s(new C1722tt('/')).t(strOptString2);
                if (listT.size() > 2 || listT.isEmpty()) {
                    obj = null;
                } else {
                    if (listT.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listT.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listT.get(0), 0);
                        str2 = (String) listT.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i7 = i5 - 1;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void C(Context context) {
        C1693t7 c1693t7 = AbstractC1869x7.s5;
        C2366q c2366q = C2366q.f13480d;
        if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            Rs rsF = Rs.f(context);
            Ss ssF = Ss.f(context);
            rsF.getClass();
            synchronized (Rs.class) {
                rsF.d(false);
            }
            synchronized (Rs.class) {
                rsF.d(true);
            }
            ssF.g();
            if (((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9679B2)).booleanValue()) {
                ssF.f5493f.K("paidv2_publisher_option");
            }
            if (((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9684C2)).booleanValue()) {
                ssF.f5493f.K("paidv2_user_option");
            }
        } catch (IOException e) {
            k.f13311A.g.g("clearStorageOnIdlessMode", e);
        }
    }

    public static final boolean a(Object[] objArr, int i5, int i6, List list) {
        if (i6 != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!o.b(objArr[i5 + i7], list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static final String b(Object[] objArr, int i5, int i6, AbstractC0131k abstractC0131k) {
        StringBuilder sb = new StringBuilder((i6 * 3) + 2);
        sb.append("[");
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i5 + i7];
            if (obj == abstractC0131k) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        o.e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static e d(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e;
        e eVar = new e();
        if (bArr == null) {
            return eVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i5 = objectInputStream.readInt(); i5 > 0; i5--) {
                            eVar.f15849a.add(new d(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e9) {
                objectInputStream = null;
                e = e9;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return eVar;
    }

    public static void h(int i5, Object[] objArr) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (objArr[i6] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i6);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final M0.k j(Context context) {
        final p036i2.e eVar = new p036i2.e(context, 5);
        final int i5 = 0;
        l lVarO = g.o(new a() { // from class: M0.e
            @Override // O3.a
            public final Object invoke() {
                int largeMemoryClass;
                P0.k kVarA;
                int i6 = 0;
                switch (i5) {
                    case 0:
                        Context context2 = (Context) eVar.p;
                        Bitmap.Config config = Z0.e.f1884a;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            o.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        D.j jVar = new D.j(1, false);
                        if (d4 > 0.0d) {
                            Bitmap.Config config2 = Z0.e.f1884a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                o.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = Fields.RotationX;
                            }
                            double d5 = d4 * ((double) largeMemoryClass);
                            double d6 = Fields.RotationZ;
                            i6 = (int) (d5 * d6 * d6);
                            break;
                        }
                        return new U0.c(i6 > 0 ? new C0789Pb(i6, jVar) : new A.e(jVar, 4), jVar);
                    default:
                        p036i2.e eVar2 = eVar;
                        Z0.k kVar = Z0.k.f1896o;
                        Context context3 = (Context) eVar2.p;
                        synchronized (kVar) {
                            try {
                                kVarA = Z0.k.p;
                                if (kVarA == null) {
                                    P0.a aVar = new P0.a();
                                    aVar.f820b = t4.l.f13261a;
                                    aVar.f821c = 0.02d;
                                    aVar.f822d = 10485760L;
                                    aVar.e = 262144000L;
                                    e4.e eVar3 = H.f1766a;
                                    aVar.f823f = e4.d.f11107o;
                                    Bitmap.Config config3 = Z0.e.f1884a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileZ = M3.a.z(cacheDir);
                                    String str = w.p;
                                    aVar.f819a = p046k2.h.o(fileZ);
                                    kVarA = aVar.a();
                                    Z0.k.p = kVarA;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return kVarA;
                }
            }
        });
        final int i6 = 1;
        l lVarO2 = g.o(new a() { // from class: M0.e
            @Override // O3.a
            public final Object invoke() {
                int largeMemoryClass;
                P0.k kVarA;
                int i7 = 0;
                switch (i6) {
                    case 0:
                        Context context2 = (Context) eVar.p;
                        Bitmap.Config config = Z0.e.f1884a;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            o.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        D.j jVar = new D.j(1, false);
                        if (d4 > 0.0d) {
                            Bitmap.Config config2 = Z0.e.f1884a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                o.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = Fields.RotationX;
                            }
                            double d5 = d4 * ((double) largeMemoryClass);
                            double d6 = Fields.RotationZ;
                            i7 = (int) (d5 * d6 * d6);
                            break;
                        }
                        return new U0.c(i7 > 0 ? new C0789Pb(i7, jVar) : new A.e(jVar, 4), jVar);
                    default:
                        p036i2.e eVar2 = eVar;
                        Z0.k kVar = Z0.k.f1896o;
                        Context context3 = (Context) eVar2.p;
                        synchronized (kVar) {
                            try {
                                kVarA = Z0.k.p;
                                if (kVarA == null) {
                                    P0.a aVar = new P0.a();
                                    aVar.f820b = t4.l.f13261a;
                                    aVar.f821c = 0.02d;
                                    aVar.f822d = 10485760L;
                                    aVar.e = 262144000L;
                                    e4.e eVar3 = H.f1766a;
                                    aVar.f823f = e4.d.f11107o;
                                    Bitmap.Config config3 = Z0.e.f1884a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileZ = M3.a.z(cacheDir);
                                    String str = w.p;
                                    aVar.f819a = p046k2.h.o(fileZ);
                                    kVarA = aVar.a();
                                    Z0.k.p = kVarA;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return kVarA;
                }
            }
        });
        l lVarO3 = g.o(new f(0));
        C c5 = C.f167o;
        return new M0.k((Context) eVar.p, (c) eVar.q, lVarO, lVarO2, lVarO3, new M0.c(c5, c5, c5, c5, c5), (i) eVar.f11537r);
    }

    public static p k(String str) {
        o.f(str, "<this>");
        Matcher matcher = p.f11330d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        o.e(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        o.e(US, "US");
        String lowerCase = strGroup.toLowerCase(US);
        o.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        o.e(strGroup2, "typeSubtype.group(2)");
        o.e(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = p.e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                o.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(p035i0.a.o(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (q.Y(strGroup4, "'", false) && q.S(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    o.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new p(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static final String l(C2167f c2167f) {
        String str;
        Class jClass = c2167f.f11699o;
        o.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap map = C2167f.q;
        if (!zIsArray) {
            String str2 = (String) map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public static int m(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(p035i0.a.k("Could not convert ", i5, " to BackoffPolicy"));
    }

    public static int n(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i5 != 5) {
            throw new IllegalArgumentException(p035i0.a.k("Could not convert ", i5, " to NetworkType"));
        }
        return 6;
    }

    public static int o(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(p035i0.a.k("Could not convert ", i5, " to OutOfQuotaPolicy"));
    }

    public static int p(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (i5 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(p035i0.a.k("Could not convert ", i5, " to State"));
    }

    public static j q(O3.e eVar) {
        j jVar = new j();
        jVar.q = o4.l.g(jVar, jVar, eVar);
        return jVar;
    }

    public static void r(String str, Bundle bundle) {
        try {
            K2.g.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = O1.i.x(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            K2.g gVarB = K2.g.b();
            gVarB.a();
            M2.a aVar = (M2.a) gVarB.f610d.a(M2.a.class);
            if (aVar != null) {
                ((M2.b) aVar).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static W1.a s(String statusLine) {
        int i5;
        String strSubstring;
        o.f(statusLine, "statusLine");
        boolean zY = q.Y(statusLine, "HTTP/1.", false);
        u uVar = u.HTTP_1_0;
        if (zY) {
            i5 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                uVar = u.HTTP_1_1;
            }
        } else {
            if (!q.Y(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i5 = 4;
        }
        int i6 = i5 + 3;
        if (statusLine.length() < i6) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i5, i6);
            o.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i7 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i6) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i6) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i5 + 4);
                o.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new W1.a(uVar, i7, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    public static T.b v(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j5;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i5 = byteBufferDuplicate.getShort() & 65535;
        if (i5 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                j5 = -1;
                break;
            }
            int i7 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i7) {
                break;
            }
            i6++;
        }
        if (j5 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j5 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j6 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i8 = 0; i8 < j6; i8++) {
                int i9 = byteBufferDuplicate.getInt();
                long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i9 || 1701669481 == i9) {
                    byteBufferDuplicate.position((int) (j7 + j5));
                    T.b bVar = new T.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f253r = byteBufferDuplicate;
                    bVar.f252o = iPosition;
                    int i10 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.p = i10;
                    bVar.q = ((ByteBuffer) bVar.f253r).getShort(i10);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void w(Object[] objArr, int i5, int i6) {
        o.f(objArr, "<this>");
        while (i5 < i6) {
            objArr[i5] = null;
            i5++;
        }
    }

    public static boolean y(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int z(int i5) {
        int iB = P.b(i5);
        if (iB == 0) {
            return 0;
        }
        int i6 = 1;
        if (iB != 1) {
            i6 = 2;
            if (iB != 2) {
                i6 = 3;
                if (iB != 3) {
                    i6 = 4;
                    if (iB != 4) {
                        if (iB == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + S2.d(i5) + " to int");
                    }
                }
            }
        }
        return i6;
    }

    public abstract boolean e(p088v.g gVar, p088v.c cVar, p088v.c cVar2);

    public abstract boolean f(p088v.g gVar, Object obj, Object obj2);

    public abstract boolean g(p088v.g gVar, p088v.f fVar, p088v.f fVar2);

    public abstract void t(p088v.f fVar, p088v.f fVar2);

    public abstract void u(p088v.f fVar, Thread thread);

    public abstract void x(p010c.H h5, p010c.H h6, Window window, View view, boolean z3, boolean z4);

    public void c(Window window) {
    }
}
