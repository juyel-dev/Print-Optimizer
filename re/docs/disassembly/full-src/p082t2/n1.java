package p082t2;

import Q1.f;
import T1.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.PC;
import com.google.android.gms.internal.measurement.Q3;
import com.google.android.gms.internal.measurement.V;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p003a2.c;
import p039j0.d;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends AbstractC2250n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f12772i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f12773j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f12774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f12775d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f12776f;
    public Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f12777h;

    public n1(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12777h = null;
        this.f12775d = new AtomicLong(0L);
    }

    public static void A(Bundle bundle, int i5, String str, Object obj) {
        if (f0(i5, bundle)) {
            bundle.putString("_ev", y(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void N(L0 l5, Bundle bundle, boolean z3) {
        if (bundle == null || l5 == null || (bundle.containsKey("_sc") && !z3)) {
            if (bundle != null && l5 == null && z3) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = l5.f12480a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = l5.f12481b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", l5.f12482c);
    }

    public static void O(m1 m1Var, String str, int i5, String str2, String str3, int i6) {
        Bundle bundle = new Bundle();
        f0(i5, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i5 == 6 || i5 == 7 || i5 == 2) {
            bundle.putLong("_el", i6);
        }
        m1Var.b(str, "_err", bundle);
    }

    public static boolean Q(Context context) {
        ActivityInfo receiverInfo;
        z.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean R(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean S(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean X(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            z.i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean Y(String str, String[] strArr) {
        z.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList e0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2231e c2231e = (C2231e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c2231e.f12625o);
            bundle.putString("origin", c2231e.p);
            bundle.putLong("creation_timestamp", c2231e.f12626r);
            bundle.putString("name", c2231e.q.p);
            Object objG = c2231e.q.g();
            z.i(objG);
            AbstractC2261t0.f(bundle, objG);
            bundle.putBoolean("active", c2231e.f12627s);
            String str = c2231e.t;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2264v c2264v = c2231e.u;
            if (c2264v != null) {
                bundle.putString("timed_out_event_name", c2264v.f12869o);
                r rVar = c2264v.p;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.i());
                }
            }
            bundle.putLong("trigger_timeout", c2231e.f12628v);
            C2264v c2264v2 = c2231e.f12629w;
            if (c2264v2 != null) {
                bundle.putString("triggered_event_name", c2264v2.f12869o);
                r rVar2 = c2264v2.p;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.i());
                }
            }
            bundle.putLong("triggered_timestamp", c2231e.q.q);
            bundle.putLong("time_to_live", c2231e.f12630x);
            C2264v c2264v3 = c2231e.f12631y;
            if (c2264v3 != null) {
                bundle.putString("expired_event_name", c2264v3.f12869o);
                r rVar3 = c2264v3.p;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean f0(int i5, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i5);
        return true;
    }

    public static boolean j0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean l0(String str) {
        String str2 = (String) AbstractC2268x.f12934a0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean o0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean q0(String str) {
        z.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long r(r rVar) {
        long length = 0;
        if (rVar == null) {
            return 0L;
        }
        Bundle bundle = rVar.f12826o;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static long s(byte[] bArr) {
        z.i(bArr);
        int i5 = 0;
        z.l(bArr.length > 0);
        long j5 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j5 += (((long) bArr[length]) & 255) << i5;
            i5 += 8;
        }
        return j5;
    }

    public static int s0(String str) {
        if ("_ldl".equals(str)) {
            return Fields.CameraDistance;
        }
        if ("_id".equals(str)) {
            return Fields.RotationX;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    public static MessageDigest v0() {
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static Bundle w(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            String str = k1Var.f12752s;
            String str2 = k1Var.p;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l5 = k1Var.f12751r;
                if (l5 != null) {
                    bundle.putLong(str2, l5.longValue());
                } else {
                    Double d4 = k1Var.u;
                    if (d4 != null) {
                        bundle.putDouble(str2, d4.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static String y(String str, int i5, boolean z3) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i5) {
            return str;
        }
        if (z3) {
            return a.l(str.substring(0, str.offsetByCodePoints(0, i5)), "...");
        }
        return null;
    }

    public final void B(Bundle bundle, long j5) {
        long j6 = bundle.getLong("_et");
        if (j6 != 0) {
            L lJ = j();
            lJ.f12474i.f(Long.valueOf(j6), "Params already contained engagement");
        }
        bundle.putLong("_et", j5 + j6);
    }

    public final void C(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                g().D(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void D(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            j().f12476k.h("Not putting event parameter. Invalid value type. name, type", ((C2236g0) this.f12783a).f12685m.f(str), simpleName);
        }
    }

    public final void E(PC pc, int i5) {
        int i6 = 0;
        for (String str : new TreeSet(((Bundle) pc.f5335s).keySet())) {
            if (q0(str) && (i6 = i6 + 1) > i5) {
                String strK = p035i0.a.k("Event can't contain more than ", i5, " params");
                L lJ = j();
                C2236g0 c2236g0 = (C2236g0) this.f12783a;
                String strB = c2236g0.f12685m.b((String) pc.q);
                Bundle bundle = (Bundle) pc.f5335s;
                lJ.f12473h.h(strK, strB, c2236g0.f12685m.a(bundle));
                f0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void F(V v4, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i5);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning int value to wrapper");
        }
    }

    public final void G(V v4, long j5) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j5);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning long value to wrapper");
        }
    }

    public final void H(V v4, Bundle bundle) {
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning bundle value to wrapper");
        }
    }

    public final void I(V v4, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning bundle list to wrapper");
        }
    }

    public final void J(V v4, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning boolean value to wrapper");
        }
    }

    public final void K(V v4, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning byte array to wrapper");
        }
    }

    public final void L(String str, V v4) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            v4.h0(bundle);
        } catch (RemoteException e) {
            L l5 = ((C2236g0) this.f12783a).f12681i;
            C2236g0.d(l5);
            l5.f12474i.f(e, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    public final void M(String str, String str2, Bundle bundle, List list, boolean z3) {
        int i5;
        int iQ;
        String[] strArr;
        if (bundle == null) {
            return;
        }
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        C2235g c2235g = c2236g0.g;
        c2235g.getClass();
        Q3.p.get();
        String[] strArr2 = null;
        int i6 = (((C2236g0) c2235g.f12783a).g.t(null, AbstractC2268x.f12978z0) && c2235g.g().b0(231100000)) ? 35 : 0;
        int i7 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                int i8 = 14;
                if (z3) {
                    i5 = 0;
                } else if (!k0("event param", str3)) {
                    i5 = 3;
                } else if (!Z("event param", strArr2, strArr2, str3)) {
                    i5 = 14;
                } else if (U("event param", 40, str3)) {
                    i5 = 0;
                } else {
                    i5 = 3;
                }
                if (i5 == 0) {
                    if (!h0("event param", str3)) {
                        i8 = 3;
                    } else if (Z("event param", strArr2, strArr2, str3)) {
                        if (U("event param", 40, str3)) {
                            i8 = 0;
                        } else {
                            i8 = 3;
                        }
                    }
                    i5 = i8;
                }
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                A(bundle, i5, str3, i5 == 3 ? str3 : strArr2);
                bundle.remove(str3);
                i6 = i6;
            } else {
                if (S(bundle.get(str3))) {
                    j().f12476k.i("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iQ = 22;
                } else {
                    iQ = q(str, str3, bundle.get(str3), bundle, list, z3, false);
                }
                if (iQ == 0 || "_ev".equals(str3)) {
                    if (!q0(str3) || Y(str3, AbstractC2261t0.f12858j)) {
                        strArr = null;
                    } else {
                        int i9 = i7 + 1;
                        boolean zB0 = b0(231100000);
                        K k3 = c2236g0.f12685m;
                        if (!zB0) {
                            j().f12473h.h("Item array not supported on client's version of Google Play Services (Android Only)", k3.b(str), k3.a(bundle));
                            f0(23, bundle);
                            bundle.remove(str3);
                            strArr = null;
                        } else if (i9 > i6) {
                            Q3.p.get();
                            strArr = null;
                            if (c2236g0.g.t(null, AbstractC2268x.f12978z0)) {
                                j().f12473h.h(p035i0.a.k("Item can't contain more than ", i6, " item-scoped custom params"), k3.b(str), k3.a(bundle));
                                f0(28, bundle);
                                bundle.remove(str3);
                            } else {
                                j().f12473h.h("Item cannot contain custom parameters", k3.b(str), k3.a(bundle));
                                f0(23, bundle);
                                bundle.remove(str3);
                            }
                        } else {
                            strArr = null;
                        }
                        i7 = i9;
                    }
                    i6 = i6;
                    strArr2 = strArr;
                } else {
                    A(bundle, iQ, str3, bundle.get(str3));
                    bundle.remove(str3);
                }
            }
            i6 = i6;
            strArr2 = null;
        }
    }

    public final void P(Parcelable[] parcelableArr, int i5, boolean z3) {
        z.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i6 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (q0(str) && !Y(str, AbstractC2261t0.f12858j) && (i6 = i6 + 1) > i5) {
                    C2236g0 c2236g0 = (C2236g0) this.f12783a;
                    if (z3) {
                        j().f12473h.h(p035i0.a.k("Param can't contain more than ", i5, " item-scoped custom parameters"), c2236g0.f12685m.f(str), c2236g0.f12685m.a(bundle));
                        f0(28, bundle);
                    } else {
                        j().f12473h.h("Param cannot contain item-scoped custom parameters", c2236g0.f12685m.f(str), c2236g0.f12685m.a(bundle));
                        f0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean T(String str, double d4) {
        try {
            SharedPreferences.Editor editorEdit = ((C2236g0) this.f12783a).f12675a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d4));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            j().f12472f.f(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean U(String str, int i5, String str2) {
        if (str2 == null) {
            j().f12473h.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i5) {
            return true;
        }
        L lJ = j();
        lJ.f12473h.i("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i5), str2);
        return false;
    }

    public final boolean V(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!zIsEmpty) {
            z.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c2236g0.f12676b)) {
                L lJ = j();
                lJ.f12473h.f(L.q(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(c2236g0.f12676b)) {
                j().f12473h.g("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        z.i(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        L lJ2 = j();
        lJ2.f12473h.f(L.q(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean W(String str, String str2, int i5, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i5) {
                L lJ = j();
                lJ.f12476k.i("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean Z(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            j().f12473h.f(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f12772i;
        for (int i5 = 0; i5 < 3; i5++) {
            if (str2.startsWith(strArr3[i5])) {
                j().f12473h.h("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Y(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Y(str2, strArr2)) {
            return true;
        }
        j().f12473h.h("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean b0(int i5) {
        Boolean bool = ((C2236g0) this.f12783a).s().e;
        if (n0() < i5 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int c0(String str) {
        if (!h0("user property", str)) {
            return 6;
        }
        if (Z("user property", AbstractC2261t0.e, null, str)) {
            return !U("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final Object d0(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (zEquals) {
            return x(Math.max(c2236g0.g.l(null, false), Fields.RotationX), obj, true, true);
        }
        return x(o0(str) ? Math.max(c2236g0.g.l(null, false), Fields.RotationX) : c2236g0.g.l(null, false), obj, false, true);
    }

    public final boolean g0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoC = c.a(context).c(64, str);
            if (packageInfoC == null || (signatureArr = packageInfoC.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            j().f12472f.f(e, "Package name not found");
            return true;
        } catch (CertificateException e3) {
            j().f12472f.f(e3, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean h0(String str, String str2) {
        if (str2 == null) {
            j().f12473h.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            j().f12473h.f(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            j().f12473h.h("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                j().f12473h.h("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object i0(Object obj, String str) {
        return "_ldl".equals(str) ? x(s0(str), obj, true, false) : x(s0(str), obj, false, false);
    }

    public final boolean k0(String str, String str2) {
        if (str2 == null) {
            j().f12473h.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            j().f12473h.f(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            j().f12473h.h("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                j().f12473h.h("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean m0(String str) {
        h();
        if (c.a(((C2236g0) this.f12783a).f12675a).f1954o.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        j().f12478m.f(str, "Permission not granted");
        return false;
    }

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        return true;
    }

    public final int n0() {
        if (this.f12777h == null) {
            f fVar = f.f969b;
            Context context = ((C2236g0) this.f12783a).f12675a;
            fVar.getClass();
            this.f12777h = Integer.valueOf(f.a(context) / 1000);
        }
        return this.f12777h.intValue();
    }

    public final int o(Object obj, String str) {
        return "_ldl".equals(str) ? W("user property referrer", str, s0(str), obj) : W("user property", str, s0(str), obj) ? 0 : 7;
    }

    public final int p(String str) {
        if (!h0("event", str)) {
            return 2;
        }
        if (Z("event", AbstractC2261t0.f12851a, AbstractC2261t0.f12852b, str)) {
            return !U("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final long p0() {
        long j5;
        Integer num;
        h();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        if (!l0(c2236g0.p().r())) {
            return 0L;
        }
        int i5 = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        Integer num2 = null;
        if (i5 < 30) {
            j5 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j5 = 8;
        } else {
            j5 = ((i5 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) AbstractC2268x.f12929W.a(null)).intValue() ? 16L : 0L;
        }
        if (!m0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j5 |= 2;
        }
        if (j5 == 0) {
            if (this.g != null) {
                zBooleanValue = this.g.booleanValue();
            } else {
                if (this.f12776f == null) {
                    this.f12776f = d.b(c2236g0.f12675a);
                }
                d dVar = this.f12776f;
                if (dVar != null) {
                    try {
                        num = (Integer) dVar.c().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e) {
                                e = e;
                                num2 = num;
                                j().f12474i.f(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                                num = num2;
                            } catch (CancellationException e3) {
                                e = e3;
                                num2 = num;
                                j().f12474i.f(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                                num = num2;
                            } catch (ExecutionException e5) {
                                e = e5;
                                num2 = num;
                                j().f12474i.f(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                                num = num2;
                            } catch (TimeoutException e6) {
                                e = e6;
                                num2 = num;
                                j().f12474i.f(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException e7) {
                        e = e7;
                    } catch (CancellationException e8) {
                        e = e8;
                    } catch (ExecutionException e9) {
                        e = e9;
                    } catch (TimeoutException e10) {
                        e = e10;
                    }
                    j().f12479n.f(num, "Measurement manager api status result");
                    zBooleanValue = this.g.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j5 |= 64;
            }
        }
        if (j5 == 0) {
            return 1L;
        }
        return j5;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    public final int q(String str, String str2, Object obj, Bundle bundle, List list, boolean z3, boolean z4) {
        int i5;
        int size;
        h();
        boolean zS = S(obj);
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        int i6 = 0;
        if (!zS) {
            i5 = 0;
        } else {
            if (!z4) {
                return 21;
            }
            if (!Y(str2, AbstractC2261t0.f12857i)) {
                return 20;
            }
            O0 o0S = c2236g0.s();
            o0S.h();
            o0S.o();
            if (o0S.A() && o0S.g().n0() < 200900) {
                return 25;
            }
            boolean z5 = obj instanceof Parcelable[];
            if (z5) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i5 = 0;
            }
            if (size > 200) {
                j().f12476k.i("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                if (z5) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, ComposerKt.invocationKey));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, ComposerKt.invocationKey)));
                    }
                }
                i5 = 17;
            } else {
                i5 = 0;
            }
        }
        if (W("param", str2, (o0(str) || o0(str2)) ? Math.max(c2236g0.g.l(null, false), Fields.RotationX) : c2236g0.g.l(null, false), obj)) {
            return i5;
        }
        if (!z4) {
            return 4;
        }
        if (obj instanceof Bundle) {
            M(str, str2, (Bundle) obj, list, z3);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    j().f12476k.h("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                    return 4;
                }
                M(str, str2, (Bundle) parcelable, list, z3);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            while (i6 < size2) {
                Object obj2 = arrayList2.get(i6);
                int i7 = i6 + 1;
                if (!(obj2 instanceof Bundle)) {
                    j().f12476k.h("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                    return 4;
                }
                M(str, str2, (Bundle) obj2, list, z3);
                i6 = i7;
            }
        }
        return i5;
    }

    public final boolean r0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((C2236g0) this.f12783a).f12675a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public final Bundle t(Uri uri, boolean z3, boolean z4) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z4 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = z3 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z4 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && (!z3 || TextUtils.isEmpty(queryParameter9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z4 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("term", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("content", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("aclid", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("cp1", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("anid", queryParameter14);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter15 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("source_platform", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("creative_format", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("marketing_tactic", queryParameter17);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (z3 && !TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            j().f12474i.f(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final long t0() {
        long andIncrement;
        long j5;
        if (this.f12775d.get() != 0) {
            synchronized (this.f12775d) {
                this.f12775d.compareAndSet(-1L, 1L);
                andIncrement = this.f12775d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f12775d) {
            long jNanoTime = System.nanoTime();
            ((C2236g0) this.f12783a).f12686n.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i5 = this.e + 1;
            this.e = i5;
            j5 = jNextLong + ((long) i5);
        }
        return j5;
    }

    public final Bundle u(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objD0 = d0(bundle.get(str), str);
                if (objD0 == null) {
                    L lJ = j();
                    lJ.f12476k.f(((C2236g0) this.f12783a).f12685m.f(str), "Param value can't be null");
                } else {
                    D(bundle2, str, objD0);
                }
            }
        }
        return bundle2;
    }

    public final String u0() {
        byte[] bArr = new byte[16];
        w0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    public final Bundle v(String str, Bundle bundle, List list, boolean z3) {
        int i5;
        int i6;
        n1 n1Var = this;
        boolean zY = Y(str, AbstractC2261t0.f12854d);
        String[] strArr = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C2236g0 c2236g0 = (C2236g0) n1Var.f12783a;
        int i7 = c2236g0.g.g().b0(201500000) ? 100 : 25;
        int i8 = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str2)) {
                int i9 = 14;
                if (z3) {
                    i5 = 0;
                } else if (!n1Var.k0("event param", str2)) {
                    i5 = 3;
                } else if (!n1Var.Z("event param", strArr, strArr, str2)) {
                    i5 = 14;
                } else if (n1Var.U("event param", 40, str2)) {
                    i5 = 0;
                } else {
                    i5 = 3;
                }
                if (i5 == 0) {
                    if (!n1Var.h0("event param", str2)) {
                        i9 = 3;
                    } else if (n1Var.Z("event param", strArr, strArr, str2)) {
                        if (n1Var.U("event param", 40, str2)) {
                            i9 = 0;
                        } else {
                            i9 = 3;
                        }
                    }
                    i5 = i9;
                }
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                A(bundle2, i5, str2, i5 == 3 ? str2 : strArr);
                bundle2.remove(str2);
                i6 = i7;
            } else {
                i6 = i7;
                int iQ = q(str, str2, bundle.get(str2), bundle2, list, z3, zY);
                if (iQ == 17) {
                    A(bundle2, iQ, str2, Boolean.FALSE);
                } else if (iQ != 0 && !"_ev".equals(str2)) {
                    A(bundle2, iQ, iQ == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (q0(str2)) {
                    int i10 = i8 + 1;
                    if (i10 > i6) {
                        String strK = p035i0.a.k("Event can't contain more than ", i6, " params");
                        L lJ = j();
                        K k3 = c2236g0.f12685m;
                        lJ.f12473h.h(strK, k3.b(str), k3.a(bundle));
                        f0(5, bundle2);
                        bundle2.remove(str2);
                        strArr = null;
                        i8 = i10;
                    } else {
                        i8 = i10;
                    }
                }
                i7 = i6;
                n1Var = this;
            }
            strArr = null;
            i7 = i6;
            n1Var = this;
        }
        return bundle2;
    }

    public final SecureRandom w0() {
        h();
        if (this.f12774c == null) {
            this.f12774c = new SecureRandom();
        }
        return this.f12774c;
    }

    public final Object x(int i5, Object obj, boolean z3, boolean z4) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return y(String.valueOf(obj), i5, z3);
        }
        if (!z4 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleU = u((Bundle) parcelable);
                if (!bundleU.isEmpty()) {
                    arrayList.add(bundleU);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final C2264v z(String str, Bundle bundle, String str2, long j5, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (p(str) != 0) {
            j().f12472f.f(((C2236g0) this.f12783a).f12685m.g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleV = v(str, bundle2, Collections.singletonList("_o"), true);
        if (z3) {
            bundleV = u(bundleV);
        }
        z.i(bundleV);
        return new C2264v(str, new r(bundleV), str2, j5);
    }
}
