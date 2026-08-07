package p046k2;

import S1.j;
import W3.q;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Matrix;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.measurement.C;
import com.google.firebase.components.ComponentRegistrar;
import com.razorpay.AppSignatureHelper;
import g4.u;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p013c2.f;
import p058n0.b;
import p060n3.n;
import p077s0.a;
import p085u1.k;
import p090v1.C2366q;
import p100x1.d;
import p100x1.m;
import p101x2.i;
import p105y1.B;
import p105y1.F;
import t4.C2328d;
import t4.C2331g;
import t4.w;
import u4.c;
import u4.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements j, b, n, a {
    public static h p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11645o;

    public /* synthetic */ h(int i5) {
        this.f11645o = i5;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    public static final String c(byte[] bArr, byte[][] bArr2, int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = -1;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (i10 + length) / 2;
            while (i11 > i9 && bArr[i11] != 10) {
                i11 += i9;
            }
            int i12 = i11 + 1;
            int i13 = 1;
            while (true) {
                i6 = i12 + i13;
                if (bArr[i6] == 10) {
                    break;
                }
                i13++;
            }
            int i14 = i6 - i12;
            int i15 = i5;
            boolean z4 = false;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (z4) {
                    i7 = 46;
                    z3 = false;
                } else {
                    byte b5 = bArr2[i15][i16];
                    byte[] bArr4 = h4.b.f11523a;
                    int i18 = b5 & 255;
                    z3 = z4;
                    i7 = i18;
                }
                byte b6 = bArr[i12 + i17];
                byte[] bArr5 = h4.b.f11523a;
                i8 = i7 - (b6 & 255);
                if (i8 != 0) {
                    break;
                }
                i17++;
                i16++;
                if (i17 == i14) {
                    break;
                }
                if (bArr2[i15].length != i16) {
                    z4 = z3;
                } else {
                    if (i15 == bArr2.length - 1) {
                        break;
                    }
                    i15++;
                    z4 = true;
                    i16 = -1;
                }
            }
            if (i8 >= 0) {
                if (i8 <= 0) {
                    int i19 = i14 - i17;
                    int length2 = bArr2[i15].length - i16;
                    int length3 = bArr2.length;
                    for (int i20 = i15 + 1; i20 < length3; i20++) {
                        length2 += bArr2[i20].length;
                    }
                    if (length2 < i19) {
                        length = i11;
                    } else if (length2 <= i19) {
                        Charset UTF_8 = StandardCharsets.UTF_8;
                        o.e(UTF_8, "UTF_8");
                        return new String(bArr, i12, i14, UTF_8);
                    }
                }
                i10 = i6 + 1;
            } else {
                length = i11;
            }
            i9 = -1;
        }
        return null;
    }

    public static final void d(C2328d c2328d, long j5, boolean z3) {
        C2328d c2328d2;
        ReentrantLock reentrantLock = C2328d.f13250h;
        if (C2328d.f13254l == null) {
            C2328d.f13254l = new C2328d();
            f fVar = new f("Okio Watchdog");
            fVar.setDaemon(true);
            fVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j5 != 0 && z3) {
            c2328d.g = Math.min(j5, c2328d.c() - jNanoTime) + jNanoTime;
        } else if (j5 != 0) {
            c2328d.g = j5 + jNanoTime;
        } else {
            if (!z3) {
                throw new AssertionError();
            }
            c2328d.g = c2328d.c();
        }
        long j6 = c2328d.g - jNanoTime;
        C2328d c2328d3 = C2328d.f13254l;
        o.c(c2328d3);
        while (true) {
            c2328d2 = c2328d3.f13255f;
            if (c2328d2 == null || j6 < c2328d2.g - jNanoTime) {
                break;
            }
            o.c(c2328d2);
            c2328d3 = c2328d2;
        }
        c2328d.f13255f = c2328d2;
        c2328d3.f13255f = c2328d;
        if (c2328d3 == C2328d.f13254l) {
            C2328d.f13251i.signal();
        }
    }

    public static final boolean f(w wVar) {
        w wVar2 = e.e;
        wVar.getClass();
        t4.j jVar = c.f13336a;
        t4.j jVarN = wVar.f13273o;
        int iJ = t4.j.j(jVarN, jVar);
        if (iJ == -1) {
            iJ = t4.j.j(jVarN, c.f13337b);
        }
        if (iJ != -1) {
            jVarN = t4.j.n(jVarN, iJ + 1, 0, 2);
        } else if (wVar.g() != null && jVarN.c() == 2) {
            jVarN = t4.j.f13258r;
        }
        return !q.S(jVarN.p(), ".class", true);
    }

    public static ArrayList g(List protocols) {
        o.f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((u) obj) != u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3.w.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u) it.next()).f11384o);
        }
        return arrayList2;
    }

    public static C2328d j() throws InterruptedException {
        C2328d c2328d = C2328d.f13254l;
        o.c(c2328d);
        C2328d c2328d2 = c2328d.f13255f;
        if (c2328d2 == null) {
            long jNanoTime = System.nanoTime();
            C2328d.f13251i.await(C2328d.f13252j, TimeUnit.MILLISECONDS);
            C2328d c2328d3 = C2328d.f13254l;
            o.c(c2328d3);
            if (c2328d3.f13255f != null || System.nanoTime() - jNanoTime < C2328d.f13253k) {
                return null;
            }
            return C2328d.f13254l;
        }
        long jNanoTime2 = c2328d2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C2328d.f13251i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C2328d c2328d4 = C2328d.f13254l;
        o.c(c2328d4);
        c2328d4.f13255f = c2328d2.f13255f;
        c2328d2.f13255f = null;
        c2328d2.e = 2;
        return c2328d2;
    }

    public static byte[] k(List protocols) {
        o.f(protocols, "protocols");
        C2331g c2331g = new C2331g();
        for (String str : g(protocols)) {
            c2331g.M(str.length());
            c2331g.R(str);
        }
        return c2331g.z(c2331g.p);
    }

    public static t4.j l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = (byte) (u4.b.a(str.charAt(i6 + 1)) + (u4.b.a(str.charAt(i6)) << 4));
        }
        return new t4.j(bArr);
    }

    public static t4.j m(String str) {
        o.f(str, "<this>");
        byte[] bytes = str.getBytes(W3.a.f1714a);
        o.e(bytes, "getBytes(...)");
        t4.j jVar = new t4.j(bytes);
        jVar.q = str;
        return jVar;
    }

    public static w n(String str, boolean z3) {
        o.f(str, "<this>");
        t4.j jVar = c.f13336a;
        C2331g c2331g = new C2331g();
        c2331g.R(str);
        return c.d(c2331g, z3);
    }

    public static w o(File file) {
        String str = w.p;
        String string = file.toString();
        o.e(string, "toString(...)");
        return n(string, false);
    }

    public static boolean r() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static final boolean v(Context context, Intent intent, p100x1.a aVar, m mVar, boolean z3) {
        int iA;
        if (z3) {
            Uri data = intent.getData();
            try {
                k.f13311A.f13314c.getClass();
                iA = F.A(context, data);
                if (aVar != null) {
                    aVar.h();
                }
            } catch (ActivityNotFoundException e) {
                AbstractC1223ib.s(e.getMessage());
                iA = 6;
            }
            if (mVar != null) {
                mVar.q(iA);
            }
            return iA == 5;
        }
        try {
            B.w("Launching an intent: " + intent.toURI());
            F f5 = k.f13311A.f13314c;
            F.o(context, intent);
            if (aVar != null) {
                aVar.h();
            }
            if (mVar != null) {
                mVar.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e3) {
            AbstractC1223ib.s(e3.getMessage());
            if (mVar != null) {
                mVar.a(false);
            }
            return false;
        }
    }

    public static final boolean w(Context context, d dVar, p100x1.a aVar, m mVar) {
        int i5 = 0;
        if (dVar == null) {
            AbstractC1223ib.s("No intent data for launcher overlay.");
            return false;
        }
        AbstractC1869x7.a(context);
        boolean z3 = dVar.f13701x;
        Intent intent = dVar.f13699v;
        if (intent != null) {
            return v(context, intent, aVar, mVar, z3);
        }
        Intent intent2 = new Intent();
        String str = dVar.p;
        if (TextUtils.isEmpty(str)) {
            AbstractC1223ib.s("Open GMSG did not contain a URL.");
            return false;
        }
        String str2 = dVar.q;
        if (TextUtils.isEmpty(str2)) {
            intent2.setData(Uri.parse(str));
        } else {
            intent2.setDataAndType(Uri.parse(str), str2);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str3 = dVar.f13697r;
        if (!TextUtils.isEmpty(str3)) {
            intent2.setPackage(str3);
        }
        String str4 = dVar.f13698s;
        if (!TextUtils.isEmpty(str4)) {
            String[] strArrSplit = str4.split("/", 2);
            if (strArrSplit.length < 2) {
                AbstractC1223ib.s("Could not parse component name from open GMSG: ".concat(str4));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str5 = dVar.t;
        if (!TextUtils.isEmpty(str5)) {
            try {
                i5 = Integer.parseInt(str5);
            } catch (NumberFormatException unused) {
                AbstractC1223ib.s("Could not parse intent flags.");
            }
            intent2.addFlags(i5);
        }
        C1693t7 c1693t7 = AbstractC1869x7.f9765T3;
        C2366q c2366q = C2366q.f13480d;
        if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9760S3)).booleanValue()) {
                F f5 = k.f13311A.f13314c;
                F.C(context, intent2);
            }
        }
        return v(context, intent2, aVar, mVar, z3);
    }

    public static final CharSequence x(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // p058n0.b
    public void a(int i5, Serializable serializable) {
        String str;
        switch (this.f11645o) {
            case 4:
                break;
            default:
                switch (i5) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i5 == 6 || i5 == 7 || i5 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // p077s0.a
    public p077s0.b b(P0.c cVar) {
        boolean z3 = cVar.f826o;
        return new p080t0.e((Context) cVar.p, (String) cVar.q, (C) cVar.f827r, z3);
    }

    @Override // p058n0.b
    public void e() {
        switch (this.f11645o) {
            case 4:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p060n3.n
    public Object h() {
        switch (this.f11645o) {
            case 10:
                return new TreeSet();
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                return new LinkedHashSet();
            case Matrix.TranslateX /* 12 */:
                return new ArrayDeque();
            case Matrix.TranslateY /* 13 */:
                return new ArrayList();
            case Matrix.TranslateZ /* 14 */:
                return new ConcurrentSkipListMap();
            case 15:
                return new ConcurrentHashMap();
            case 16:
                return new TreeMap();
            case 17:
                return new LinkedHashMap();
            default:
                return new p060n3.m(true);
        }
    }

    @Override // S1.j
    public void i(Object obj, Object obj2) {
        g gVar = (g) obj;
        i iVar = (i) obj2;
        switch (this.f11645o) {
            case 0:
                e eVar = (e) gVar.t();
                a aVar = new a(iVar, 1);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i5 = d.f11643a;
                parcelObtain.writeStrongBinder(aVar);
                eVar.b0(parcelObtain, 1);
                break;
            default:
                e eVar2 = (e) gVar.t();
                a aVar2 = new a(iVar, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                parcelObtain2.writeString(null);
                int i6 = d.f11643a;
                parcelObtain2.writeStrongBinder(aVar2);
                eVar2.b0(parcelObtain2, 2);
                break;
        }
    }

    public p092v3.h p(Context context) {
        o.f(context, "context");
        p092v3.h hVar = p092v3.h.f13520z;
        if (hVar == null) {
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                o.e(applicationContext, "getApplicationContext(...)");
                hVar = new p092v3.h(applicationContext);
                p092v3.h.f13520z = hVar;
            }
        }
        return hVar;
    }

    public long q() {
        switch (this.f11645o) {
            case 8:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public List u(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (P2.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f891a;
            if (str != null) {
                p033h3.f fVar = new p033h3.f(5, str, bVar);
                bVar = new P2.b(str, bVar.f892b, bVar.f893c, bVar.f894d, bVar.e, fVar, bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public /* synthetic */ h(b bVar, int i5) {
        this.f11645o = i5;
    }

    private final void s() {
    }

    private final void t(int i5, Serializable serializable) {
    }
}
