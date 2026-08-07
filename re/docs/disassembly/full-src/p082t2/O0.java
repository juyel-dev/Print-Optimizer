package p082t2;

import B0.d;
import Q1.f;
import T1.z;
import U1.b;
import Y1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.util.Pair;
import androidx.compose.material3.internal.CalendarModelKt;
import com.google.android.gms.internal.ads.C0837Xb;
import com.google.android.gms.internal.ads.C1003da;
import com.google.android.gms.internal.ads.E0;
import com.google.android.gms.internal.measurement.B4;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.o4;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p003a2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S0 f12491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G f12492d;
    public volatile Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N0 f12493f;
    public final E0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f12494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N0 f12495i;

    public O0(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12494h = new ArrayList();
        this.g = new E0(c2236g0.f12686n);
        this.f12491c = new S0(this);
        this.f12493f = new N0(this, c2236g0, 0);
        this.f12495i = new N0(this, c2236g0, 1);
    }

    public final boolean A() {
        boolean z3;
        h();
        o();
        if (this.e == null) {
            h();
            o();
            U uF = f();
            uF.h();
            boolean z4 = false;
            Boolean boolValueOf = !uF.s().contains("use_service") ? null : Boolean.valueOf(uF.s().getBoolean("use_service", false));
            boolean z5 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                H hP = ((C2236g0) this.f12783a).p();
                hP.o();
                if (hP.f12448k == 1) {
                    z3 = true;
                } else {
                    j().f12479n.g("Checking service availability");
                    int iC = f.f969b.c(((C2236g0) g().f12783a).f12675a, 12451000);
                    if (iC != 0) {
                        if (iC == 1) {
                            j().f12479n.g("Service missing");
                        } else if (iC != 2) {
                            if (iC == 3) {
                                j().f12474i.g("Service disabled");
                            } else if (iC == 9) {
                                j().f12474i.g("Service invalid");
                            } else if (iC != 18) {
                                j().f12474i.f(Integer.valueOf(iC), "Unexpected service status");
                            } else {
                                j().f12474i.g("Service updating");
                            }
                            z3 = false;
                            z5 = false;
                        } else {
                            j().f12478m.g("Service container out of date");
                            if (g().n0() >= 17443) {
                                z5 = boolValueOf == null;
                                z3 = false;
                            }
                        }
                        z3 = true;
                        z5 = false;
                    } else {
                        j().f12479n.g("Service available");
                    }
                    z3 = true;
                }
                if (z5 || !((C2236g0) this.f12783a).g.x()) {
                    z4 = z3;
                } else {
                    j().f12472f.g("No way to upload. Consider using the full version of Analytics");
                }
                if (z4) {
                    U uF2 = f();
                    uF2.h();
                    SharedPreferences.Editor editorEdit = uF2.s().edit();
                    editorEdit.putBoolean("use_service", z5);
                    editorEdit.apply();
                }
            }
            this.e = Boolean.valueOf(z5);
        }
        return this.e.booleanValue();
    }

    public final void B() {
        h();
        L lJ = j();
        ArrayList arrayList = this.f12494h;
        lJ.f12479n.f(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                j().f12472f.f(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f12495i.a();
    }

    public final void C() {
        h();
        E0 e3 = this.g;
        ((a) e3.p).getClass();
        e3.f3226o = SystemClock.elapsedRealtime();
        this.f12493f.b(((Long) AbstractC2268x.f12906K.a(null)).longValue());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final o1 D(boolean z3) {
        String str;
        String str2;
        int i5;
        long j5;
        String str3;
        String str4;
        List list;
        long j6;
        String str5;
        int i6;
        int i7;
        long j7;
        int extensionVersion;
        long jS;
        long jAbs;
        Pair pair;
        H hP = ((C2236g0) this.f12783a).p();
        if (z3) {
            L lJ = j();
            String strM = null;
            if (lJ.f().f12545f != null) {
                C1003da c1003da = lJ.f().f12545f;
                U u = (U) c1003da.e;
                u.h();
                u.h();
                long j8 = ((U) c1003da.e).s().getLong((String) c1003da.f6942b, 0L);
                if (j8 == 0) {
                    c1003da.c();
                    jAbs = 0;
                } else {
                    ((C2236g0) u.f12783a).f12686n.getClass();
                    jAbs = Math.abs(j8 - System.currentTimeMillis());
                }
                long j9 = c1003da.f6941a;
                if (jAbs < j9) {
                    pair = null;
                } else if (jAbs > (j9 << 1)) {
                    c1003da.c();
                    pair = null;
                } else {
                    String string = u.s().getString((String) c1003da.f6944d, null);
                    long j10 = u.s().getLong((String) c1003da.f6943c, 0L);
                    c1003da.c();
                    pair = (string == null || j10 <= 0) ? U.f12542A : new Pair(string, Long.valueOf(j10));
                }
                if (pair != null && pair != U.f12542A) {
                    strM = androidx.compose.foundation.text.modifiers.a.m(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
            str = strM;
        } else {
            str = null;
        }
        hP.h();
        C2259s0 c2259s0U = hP.f().u();
        C2072n3.a();
        C2236g0 c2236g0 = (C2236g0) hP.f12783a;
        if (c2236g0.g.t(null, AbstractC2268x.f12905J0)) {
            U uF = hP.f();
            uF.h();
            str2 = C2251o.b(uF.s().getString("dma_consent_settings", null)).f12780b;
            i5 = c2259s0U.f12841b;
        } else {
            str2 = "";
            i5 = 100;
        }
        String str6 = str2;
        int i8 = i5;
        String strR = hP.r();
        String strS = hP.s();
        hP.o();
        String str7 = hP.f12443d;
        hP.o();
        long j11 = hP.e;
        hP.o();
        z.i(hP.f12444f);
        String str8 = hP.f12444f;
        hP.o();
        hP.h();
        long j12 = hP.g;
        Context context = c2236g0.f12675a;
        if (j12 == 0) {
            n1 n1Var = c2236g0.f12684l;
            C2236g0.f(n1Var);
            String packageName = context.getPackageName();
            n1Var.h();
            z.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestV0 = n1.v0();
            long j13 = -1;
            if (messageDigestV0 == null) {
                n1Var.j().f12472f.g("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (n1Var.g0(context, packageName)) {
                            j13 = 0;
                        } else {
                            Signature[] signatureArr = c.a(context).c(64, ((C2236g0) n1Var.f12783a).f12675a.getPackageName()).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                n1Var.j().f12474i.g("Could not get signatures");
                            } else {
                                jS = n1.s(messageDigestV0.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        n1Var.j().f12472f.f(e, "Package name not found");
                        jS = 0;
                    }
                } else {
                    jS = 0;
                }
                hP.g = jS;
            }
            jS = j13;
            hP.g = jS;
        }
        long j14 = hP.g;
        boolean zG = c2236g0.g();
        boolean z4 = !hP.f().f12555s;
        hP.h();
        boolean zG2 = c2236g0.g();
        C2235g c2235g = c2236g0.g;
        if (zG2) {
            B4.p.get();
            if (c2235g.t(null, AbstractC2268x.f12950j0)) {
                hP.j().f12479n.g("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        j5 = j14;
                        try {
                            str3 = null;
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                            if (objInvoke != null) {
                                try {
                                    str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    hP.j().f12476k.g("Failed to retrieve Firebase Instance Id");
                                    str3 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            hP.j().f12475j.g("Failed to obtain Firebase Analytics instance");
                        }
                        str4 = str3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
                str3 = null;
                str4 = str3;
            }
            j5 = j14;
            str3 = null;
            str4 = str3;
        } else {
            j5 = j14;
            str4 = null;
        }
        U u5 = c2236g0.f12680h;
        C2236g0.f(u5);
        long jA = u5.g.a();
        String str9 = str4;
        long jMin = c2236g0.f12674H;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        hP.o();
        int i9 = hP.f12448k;
        Boolean boolS = c2235g.s("google_analytics_adid_collection_enabled");
        boolean z5 = boolS == null || boolS.booleanValue();
        U uF2 = hP.f();
        uF2.h();
        boolean z6 = uF2.s().getBoolean("deferred_analytics_collection", false);
        hP.o();
        String str10 = hP.f12450m;
        Boolean boolS2 = c2235g.s("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolS2 == null ? null : Boolean.valueOf(!boolS2.booleanValue());
        List list2 = hP.f12446i;
        String strI = c2259s0U.i();
        if (hP.f12447j == null) {
            hP.f12447j = hP.g().u0();
        }
        String str11 = hP.f12447j;
        o4.a();
        if (c2235g.t(null, AbstractC2268x.f12962q0)) {
            hP.h();
            j6 = 0;
            if (hP.f12452o != 0) {
                c2236g0.f12686n.getClass();
                list = list2;
                long jCurrentTimeMillis = System.currentTimeMillis() - hP.f12452o;
                if (hP.f12451n != null && jCurrentTimeMillis > CalendarModelKt.MillisecondsIn24Hours && hP.p == null) {
                    hP.t();
                }
            } else {
                list = list2;
            }
            if (hP.f12451n == null) {
                hP.t();
            }
            str5 = hP.f12451n;
        } else {
            list = list2;
            j6 = 0;
            str5 = null;
        }
        Boolean boolS3 = c2235g.s("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolS3 == null ? false : boolS3.booleanValue();
        n1 n1VarG = hP.g();
        String strR2 = hP.r();
        C2236g0 c2236g1 = (C2236g0) n1VarG.f12783a;
        if (c2236g1.f12675a.getPackageManager() == null) {
            j7 = j6;
            i6 = 0;
        } else {
            try {
                i6 = 0;
                try {
                    ApplicationInfo applicationInfoA = c.a(c2236g1.f12675a).a(0, strR2);
                    i7 = applicationInfoA != null ? applicationInfoA.targetSdkVersion : i6;
                } catch (PackageManager.NameNotFoundException unused4) {
                    n1VarG.j().f12477l.f(strR2, "PackageManager failed to find running app: app_id");
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i6 = 0;
            }
            j7 = i7;
        }
        C2010c4.a();
        F f5 = AbstractC2268x.f12893D0;
        if (c2235g.t(null, f5)) {
            hP.g();
            extensionVersion = (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? i6 : SdkExtensions.getExtensionVersion(1000000);
        } else {
            extensionVersion = i6;
        }
        C2010c4.a();
        return new o1(strR, strS, str7, j11, str8, 84002L, j5, str, zG, z4, str9, jMin, i9, z5, z6, str10, boolValueOf, hP.f12445h, list, strI, str11, str5, zBooleanValue, j7, i8, str6, extensionVersion, c2235g.t(null, f5) ? hP.g().p0() : j6, c2235g.f12664c);
    }

    @Override // p082t2.B
    public final boolean q() {
        return false;
    }

    public final void r(Runnable runnable) {
        h();
        if (y()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f12494h;
        if (arrayList.size() >= 1000) {
            j().f12472f.g("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f12495i.b(60000L);
        w();
    }

    public final void s(AtomicReference atomicReference) {
        h();
        o();
        r(new d(12, this, atomicReference, D(false), false));
    }

    public final void t(C2231e c2231e) {
        boolean zS;
        h();
        o();
        J jQ = ((C2236g0) this.f12783a).q();
        jQ.g();
        byte[] bArrA0 = n1.a0(c2231e);
        if (bArrA0.length > 131072) {
            jQ.j().g.g("Conditional user property too long for local database. Sending directly to service");
            zS = false;
        } else {
            zS = jQ.s(bArrA0, 2);
        }
        boolean z3 = zS;
        r(new P0(this, D(true), z3, new C2231e(c2231e), c2231e));
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0202  */
    /* JADX WARN: Code duplicated, block: B:127:0x0207  */
    /* JADX WARN: Code duplicated, block: B:134:0x0217  */
    /* JADX WARN: Code duplicated, block: B:136:0x021c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:143:0x0237  */
    /* JADX WARN: Code duplicated, block: B:146:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x024c  */
    /* JADX WARN: Code duplicated, block: B:227:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x023a A[SYNTHETIC] */
    public final void u(G g, U1.a aVar, o1 o1Var) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseV;
        Cursor cursorQuery;
        String str;
        String[] strArr;
        int i5;
        C2231e c2231eCreateFromParcel;
        k1 k1VarCreateFromParcel;
        ArrayList arrayList;
        int size;
        h();
        o();
        int i6 = 100;
        int i7 = 0;
        int i8 = 100;
        int i9 = 0;
        while (i9 < 1001 && i8 == i6) {
            ArrayList arrayList2 = new ArrayList();
            J jQ = ((C2236g0) this.f12783a).q();
            jQ.h();
            if (jQ.f12454d) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (((C2236g0) jQ.f12783a).f12675a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i10 = 5;
                    int i11 = i7;
                    int i12 = 5;
                    while (true) {
                        if (i11 < i10) {
                            try {
                                sQLiteDatabaseV = jQ.v();
                                if (sQLiteDatabaseV == null) {
                                    try {
                                        try {
                                            jQ.f12454d = true;
                                            if (sQLiteDatabaseV != null) {
                                                sQLiteDatabaseV.close();
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            cursorQuery = null;
                                            jQ.j().f12472f.f(e, "Error reading entries from local database");
                                            jQ.f12454d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseV != null) {
                                                sQLiteDatabaseV.close();
                                            }
                                            i11++;
                                            arrayList3 = arrayList3;
                                            i7 = 0;
                                            i10 = 5;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i12);
                                        i12 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseV != null) {
                                            sQLiteDatabaseV.close();
                                        }
                                        i11++;
                                        arrayList3 = arrayList3;
                                        i7 = 0;
                                        i10 = 5;
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseV != null) {
                                            sQLiteDatabaseV.endTransaction();
                                        }
                                        jQ.j().f12472f.f(e, "Error reading entries from local database");
                                        jQ.f12454d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseV != null) {
                                            sQLiteDatabaseV.close();
                                        }
                                        arrayList3 = arrayList3;
                                        i11++;
                                        arrayList3 = arrayList3;
                                        i7 = 0;
                                        i10 = 5;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseV != null) {
                                            sQLiteDatabaseV.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    try {
                                        sQLiteDatabaseV.beginTransaction();
                                        long jR = J.r(sQLiteDatabaseV);
                                        long j5 = -1;
                                        if (jR != -1) {
                                            String[] strArr2 = new String[1];
                                            strArr2[i7] = String.valueOf(jR);
                                            str = "rowid<?";
                                            strArr = strArr2;
                                        } else {
                                            str = null;
                                            strArr = null;
                                        }
                                        cursorQuery = sQLiteDatabaseV.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                        while (cursorQuery.moveToNext()) {
                                            try {
                                                try {
                                                    j5 = cursorQuery.getLong(i7);
                                                    int i13 = cursorQuery.getInt(1);
                                                    try {
                                                        try {
                                                            byte[] blob = cursorQuery.getBlob(2);
                                                            if (i13 == 0) {
                                                                try {
                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain.setDataPosition(0);
                                                                            C2264v c2264vCreateFromParcel = C2264v.CREATOR.createFromParcel(parcelObtain);
                                                                            parcelObtain.recycle();
                                                                            if (c2264vCreateFromParcel != null) {
                                                                                arrayList3.add(c2264vCreateFromParcel);
                                                                            }
                                                                        } catch (b unused2) {
                                                                            jQ.j().f12472f.g("Failed to load event from local database");
                                                                            parcelObtain.recycle();
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        parcelObtain.recycle();
                                                                        throw th2;
                                                                    }
                                                                } catch (SQLiteFullException e5) {
                                                                    e = e5;
                                                                    jQ.j().f12472f.f(e, "Error reading entries from local database");
                                                                    jQ.f12454d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (sQLiteDatabaseV != null) {
                                                                        sQLiteDatabaseV.close();
                                                                    }
                                                                    i11++;
                                                                    arrayList3 = arrayList3;
                                                                    i7 = 0;
                                                                    i10 = 5;
                                                                }
                                                            } else {
                                                                if (i13 == 1) {
                                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain2.setDataPosition(0);
                                                                            k1VarCreateFromParcel = k1.CREATOR.createFromParcel(parcelObtain2);
                                                                            parcelObtain2.recycle();
                                                                        } catch (Throwable th3) {
                                                                            parcelObtain2.recycle();
                                                                            throw th3;
                                                                        }
                                                                    } catch (b unused3) {
                                                                        jQ.j().f12472f.g("Failed to load user property from local database");
                                                                        parcelObtain2.recycle();
                                                                        k1VarCreateFromParcel = null;
                                                                    }
                                                                    if (k1VarCreateFromParcel != null) {
                                                                        arrayList3.add(k1VarCreateFromParcel);
                                                                    }
                                                                } else if (i13 == 2) {
                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                    try {
                                                                        i5 = 0;
                                                                        try {
                                                                            try {
                                                                                parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                parcelObtain3.setDataPosition(0);
                                                                                c2231eCreateFromParcel = C2231e.CREATOR.createFromParcel(parcelObtain3);
                                                                                try {
                                                                                    parcelObtain3.recycle();
                                                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                                                    SystemClock.sleep(i12);
                                                                                    i12 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseV != null) {
                                                                                        sQLiteDatabaseV.close();
                                                                                    }
                                                                                    i11++;
                                                                                    arrayList3 = arrayList3;
                                                                                    i7 = 0;
                                                                                    i10 = 5;
                                                                                } catch (SQLiteException e6) {
                                                                                    e = e6;
                                                                                    if (sQLiteDatabaseV != null && sQLiteDatabaseV.inTransaction()) {
                                                                                        sQLiteDatabaseV.endTransaction();
                                                                                    }
                                                                                    jQ.j().f12472f.f(e, "Error reading entries from local database");
                                                                                    jQ.f12454d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseV != null) {
                                                                                        sQLiteDatabaseV.close();
                                                                                    }
                                                                                    arrayList3 = arrayList3;
                                                                                    i11++;
                                                                                    arrayList3 = arrayList3;
                                                                                    i7 = 0;
                                                                                    i10 = 5;
                                                                                }
                                                                            } catch (b unused5) {
                                                                                jQ.j().f12472f.g("Failed to load conditional user property from local database");
                                                                                parcelObtain3.recycle();
                                                                                c2231eCreateFromParcel = null;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            parcelObtain3.recycle();
                                                                            throw th;
                                                                        }
                                                                    } catch (b unused6) {
                                                                        i5 = 0;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                    }
                                                                    if (c2231eCreateFromParcel != null) {
                                                                        arrayList3.add(c2231eCreateFromParcel);
                                                                    }
                                                                } else {
                                                                    i5 = 0;
                                                                    if (i13 == 3) {
                                                                        jQ.j().f12474i.g("Skipping app launch break");
                                                                    } else {
                                                                        jQ.j().f12472f.g("Unknown record type in local database");
                                                                    }
                                                                }
                                                                i7 = i5;
                                                            }
                                                            i5 = 0;
                                                            i7 = i5;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused7) {
                                                    } catch (SQLiteException e8) {
                                                        e = e8;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    if (sQLiteDatabaseV != null) {
                                                        sQLiteDatabaseV.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused8) {
                                            } catch (SQLiteFullException e9) {
                                                e = e9;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                            }
                                        }
                                        if (sQLiteDatabaseV.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList3.size()) {
                                            jQ.j().f12472f.g("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabaseV.setTransactionSuccessful();
                                        sQLiteDatabaseV.endTransaction();
                                        cursorQuery.close();
                                        sQLiteDatabaseV.close();
                                    } catch (SQLiteFullException e11) {
                                        e = e11;
                                        cursorQuery = null;
                                        jQ.j().f12472f.f(e, "Error reading entries from local database");
                                        jQ.f12454d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseV != null) {
                                            sQLiteDatabaseV.close();
                                        }
                                        i11++;
                                        arrayList3 = arrayList3;
                                        i7 = 0;
                                        i10 = 5;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused9) {
                                cursorQuery = null;
                                sQLiteDatabaseV = null;
                            } catch (SQLiteFullException e12) {
                                e = e12;
                                cursorQuery = null;
                                sQLiteDatabaseV = null;
                            } catch (SQLiteException e13) {
                                e = e13;
                                cursorQuery = null;
                                sQLiteDatabaseV = null;
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = null;
                                sQLiteDatabaseV = null;
                            }
                            i11++;
                            arrayList3 = arrayList3;
                            i7 = 0;
                            i10 = 5;
                        } else {
                            jQ.j().f12474i.g("Failed to read events from database in reasonable time");
                        }
                        arrayList = null;
                    }
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList2.add(aVar);
            }
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                int i15 = i14 + 1;
                U1.a aVar2 = (U1.a) arrayList2.get(i14);
                if (aVar2 instanceof C2264v) {
                    try {
                        g.O3((C2264v) aVar2, o1Var);
                    } catch (RemoteException e14) {
                        j().f12472f.f(e14, "Failed to send event to the service");
                    }
                } else if (aVar2 instanceof k1) {
                    try {
                        g.M3((k1) aVar2, o1Var);
                    } catch (RemoteException e15) {
                        j().f12472f.f(e15, "Failed to send user property to the service");
                    }
                } else if (aVar2 instanceof C2231e) {
                    try {
                        g.I2((C2231e) aVar2, o1Var);
                    } catch (RemoteException e16) {
                        j().f12472f.f(e16, "Failed to send conditional user property to the service");
                    }
                } else {
                    j().f12472f.g("Discarding data. Unrecognized parcel type.");
                }
                i14 = i15;
            }
            i9++;
            i8 = size;
            i6 = 100;
            i7 = 0;
        }
    }

    public final void v(boolean z3) {
        h();
        o();
        if (z3) {
            ((C2236g0) this.f12783a).q().t();
        }
        if (z()) {
            r(new Q0(this, D(false), 1));
        }
    }

    public final void w() {
        h();
        o();
        if (y()) {
            return;
        }
        if (A()) {
            S0 s2 = this.f12491c;
            s2.q.h();
            Context context = ((C2236g0) s2.q.f12783a).f12675a;
            synchronized (s2) {
                try {
                    if (s2.f12537o) {
                        s2.q.j().f12479n.g("Connection attempt already in progress");
                        return;
                    }
                    if (s2.p != null && (s2.p.c() || s2.p.h())) {
                        s2.q.j().f12479n.g("Already awaiting connection attempt");
                        return;
                    }
                    s2.p = new C0837Xb(context, Looper.getMainLooper(), 93, s2, s2, 1);
                    s2.q.j().f12479n.g("Connecting to remote service");
                    s2.f12537o = true;
                    z.i(s2.p);
                    s2.p.n();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (((C2236g0) this.f12783a).g.x()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = ((C2236g0) this.f12783a).f12675a.getPackageManager().queryIntentServices(new Intent().setClassName(((C2236g0) this.f12783a).f12675a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            j().f12472f.g("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(((C2236g0) this.f12783a).f12675a, "com.google.android.gms.measurement.AppMeasurementService"));
        S0 s5 = this.f12491c;
        s5.q.h();
        Context context2 = ((C2236g0) s5.q.f12783a).f12675a;
        X1.a aVarB = X1.a.b();
        synchronized (s5) {
            try {
                if (s5.f12537o) {
                    s5.q.j().f12479n.g("Connection attempt already in progress");
                    return;
                }
                s5.q.j().f12479n.g("Using local app measurement service");
                s5.f12537o = true;
                aVarB.a(context2, intent, s5.q.f12491c, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        h();
        o();
        S0 s2 = this.f12491c;
        if (s2.p != null && (s2.p.h() || s2.p.c())) {
            s2.p.g();
        }
        s2.p = null;
        try {
            X1.a.b().c(((C2236g0) this.f12783a).f12675a, this.f12491c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f12492d = null;
    }

    public final boolean y() {
        h();
        o();
        return this.f12492d != null;
    }

    public final boolean z() {
        h();
        o();
        return !A() || g().n0() >= ((Integer) AbstractC2268x.f12956m0.a(null)).intValue();
    }
}
