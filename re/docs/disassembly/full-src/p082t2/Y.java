package p082t2;

import E1.k;
import T1.z;
import U0.e;
import W.P;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.AbstractC2020e2;
import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C2076o2;
import com.google.android.gms.internal.measurement.C2093s0;
import com.google.android.gms.internal.measurement.C2098t0;
import com.google.android.gms.internal.measurement.C2099t1;
import com.google.android.gms.internal.measurement.C2103u0;
import com.google.android.gms.internal.measurement.C2104u1;
import com.google.android.gms.internal.measurement.C2108v0;
import com.google.android.gms.internal.measurement.C2112w;
import com.google.android.gms.internal.measurement.C2113w0;
import com.google.android.gms.internal.measurement.C2115w2;
import com.google.android.gms.internal.measurement.C2118x0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.internal.measurement.K0;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.L0;
import com.google.android.gms.internal.measurement.M0;
import com.google.android.gms.internal.measurement.N0;
import com.google.android.gms.internal.measurement.Q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p047l.C2174e;
import p090v1.C2358m;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends h1 implements InterfaceC2237h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2174e f12579d;
    public final C2174e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2174e f12580f;
    public final C2174e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2174e f12581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2174e f12582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f12583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A.e f12584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2174e f12585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2174e f12586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2174e f12587n;

    public Y(j1 j1Var) {
        super(j1Var);
        this.f12579d = new C2174e(0);
        this.e = new C2174e(0);
        this.f12580f = new C2174e(0);
        this.g = new C2174e(0);
        this.f12581h = new C2174e(0);
        this.f12585l = new C2174e(0);
        this.f12586m = new C2174e(0);
        this.f12587n = new C2174e(0);
        this.f12582i = new C2174e(0);
        this.f12583j = new e(this);
        this.f12584k = new A.e(this, 19);
    }

    public static C2174e t(N0 n1) {
        C2174e c2174e = new C2174e(0);
        for (Q0 q2 : n1.E()) {
            c2174e.put(q2.p(), q2.q());
        }
        return c2174e;
    }

    public static EnumC2257r0 u(int i5) {
        int i6 = AbstractC2224a0.f12598b[P.b(i5)];
        if (i6 == 1) {
            return EnumC2257r0.AD_STORAGE;
        }
        if (i6 == 2) {
            return EnumC2257r0.ANALYTICS_STORAGE;
        }
        if (i6 == 3) {
            return EnumC2257r0.AD_USER_DATA;
        }
        if (i6 != 4) {
            return null;
        }
        return EnumC2257r0.AD_PERSONALIZATION;
    }

    public final boolean A(String str, EnumC2257r0 enumC2257r0) {
        h();
        G(str);
        I0 i0Z = z(str);
        if (i0Z == null) {
            return false;
        }
        for (F0 f5 : i0Z.r()) {
            if (enumC2257r0 == u(f5.q())) {
                if (f5.p() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final N0 B(String str) {
        o();
        h();
        z.e(str);
        G(str);
        return (N0) this.f12581h.get(str);
    }

    public final boolean C(String str, String str2) {
        Boolean bool;
        h();
        G(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean D(String str, String str2) {
        Boolean bool;
        h();
        G(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && n1.o0(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && n1.q0(str2)) {
            return true;
        }
        Map map = (Map) this.f12580f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str) {
        h();
        G(str);
        C2174e c2174e = this.e;
        return c2174e.get(str) != null && ((Set) c2174e.get(str)).contains("app_instance_id");
    }

    public final boolean F(String str) {
        h();
        G(str);
        C2174e c2174e = this.e;
        if (c2174e.get(str) != null) {
            return ((Set) c2174e.get(str)).contains("os_version") || ((Set) c2174e.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    public final void G(String str) {
        Cursor cursorQuery;
        p036i2.e eVar;
        C2174e c2174e;
        C2174e c2174e2;
        C2174e c2174e3;
        C2174e c2174e4;
        o();
        h();
        z.e(str);
        C2174e c2174e5 = this.f12581h;
        if (c2174e5.get(str) == null) {
            C2243k c2243kL = l();
            z.e(str);
            c2243kL.h();
            c2243kL.o();
            Cursor cursor = null;
            try {
                cursorQuery = c2243kL.r().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                c2243kL.j().f12472f.f(L.q(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob == null) {
                                cursorQuery.close();
                            } else {
                                eVar = new p036i2.e(blob, string, string2, 23);
                                cursorQuery.close();
                            }
                            c2174e = this.f12587n;
                            c2174e2 = this.f12586m;
                            c2174e3 = this.f12585l;
                            c2174e4 = this.f12579d;
                            if (eVar == null) {
                                M0 m5 = (M0) s((byte[]) eVar.p, str).l();
                                v(str, m5);
                                c2174e4.put(str, t((N0) m5.a()));
                                c2174e5.put(str, (N0) m5.a());
                                w(str, (N0) m5.a());
                                c2174e3.put(str, ((N0) m5.p).A());
                                c2174e2.put(str, (String) eVar.q);
                                c2174e.put(str, (String) eVar.f11537r);
                                return;
                            }
                            c2174e4.put(str, null);
                            this.f12580f.put(str, null);
                            this.e.put(str, null);
                            this.g.put(str, null);
                            c2174e5.put(str, null);
                            c2174e3.put(str, null);
                            c2174e2.put(str, null);
                            c2174e.put(str, null);
                            this.f12582i.put(str, null);
                        }
                        cursorQuery.close();
                    } catch (SQLiteException e) {
                        e = e;
                        c2243kL.j().f12472f.h("Error querying remote config. appId", L.q(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            eVar = null;
            c2174e = this.f12587n;
            c2174e2 = this.f12586m;
            c2174e3 = this.f12585l;
            c2174e4 = this.f12579d;
            if (eVar == null) {
                M0 m6 = (M0) s((byte[]) eVar.p, str).l();
                v(str, m6);
                c2174e4.put(str, t((N0) m6.a()));
                c2174e5.put(str, (N0) m6.a());
                w(str, (N0) m6.a());
                c2174e3.put(str, ((N0) m6.p).A());
                c2174e2.put(str, (String) eVar.q);
                c2174e.put(str, (String) eVar.f11537r);
                return;
            }
            c2174e4.put(str, null);
            this.f12580f.put(str, null);
            this.e.put(str, null);
            this.g.put(str, null);
            c2174e5.put(str, null);
            c2174e3.put(str, null);
            c2174e2.put(str, null);
            c2174e.put(str, null);
            this.f12582i.put(str, null);
        }
    }

    @Override // p082t2.InterfaceC2237h
    public final String b(String str, String str2) {
        h();
        G(str);
        Map map = (Map) this.f12579d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p082t2.h1
    public final boolean q() {
        return false;
    }

    public final long r(String str) {
        String strB = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strB)) {
            return 0L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException e) {
            L lJ = j();
            lJ.f12474i.h("Unable to parse timezone offset. appId", L.q(str), e);
            return 0L;
        }
    }

    public final N0 s(byte[] bArr, String str) {
        if (bArr == null) {
            return N0.x();
        }
        try {
            N0 n1 = (N0) ((M0) P.x(N0.w(), bArr)).a();
            j().f12479n.h("Parsed config. version, gmp_app_id", n1.J() ? Long.valueOf(n1.u()) : null, n1.H() ? n1.z() : null);
            return n1;
        } catch (C2076o2 e) {
            j().f12474i.h("Unable to merge remote config. appId", L.q(str), e);
            return N0.x();
        } catch (RuntimeException e3) {
            j().f12474i.h("Unable to merge remote config. appId", L.q(str), e3);
            return N0.x();
        }
    }

    public final void v(String str, M0 m5) {
        HashSet hashSet = new HashSet();
        C2174e c2174e = new C2174e(0);
        C2174e c2174e2 = new C2174e(0);
        C2174e c2174e3 = new C2174e(0);
        Iterator it = Collections.unmodifiableList(((N0) m5.p).C()).iterator();
        while (it.hasNext()) {
            hashSet.add(((J0) it.next()).p());
        }
        for (int i5 = 0; i5 < ((N0) m5.p).t(); i5++) {
            K0 k3 = (K0) ((N0) m5.p).q(i5).l();
            if (k3.e().isEmpty()) {
                j().f12474i.g("EventConfig contained null event name");
            } else {
                String strE = k3.e();
                String strC = AbstractC2261t0.c(k3.e(), AbstractC2261t0.f12851a, AbstractC2261t0.f12853c);
                if (!TextUtils.isEmpty(strC)) {
                    k3.c();
                    L0.q((L0) k3.p, strC);
                    m5.c();
                    N0.s((N0) m5.p, i5, (L0) k3.a());
                }
                if (((L0) k3.p).u() && ((L0) k3.p).s()) {
                    c2174e.put(strE, Boolean.TRUE);
                }
                if (((L0) k3.p).v() && ((L0) k3.p).t()) {
                    c2174e2.put(k3.e(), Boolean.TRUE);
                }
                if (((L0) k3.p).w()) {
                    if (((L0) k3.p).p() < 2 || ((L0) k3.p).p() > 65535) {
                        L lJ = j();
                        lJ.f12474i.h("Invalid sampling rate. Event name, sample rate", k3.e(), Integer.valueOf(((L0) k3.p).p()));
                    } else {
                        c2174e3.put(k3.e(), Integer.valueOf(((L0) k3.p).p()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f12580f.put(str, c2174e);
        this.g.put(str, c2174e2);
        this.f12582i.put(str, c2174e3);
    }

    public final void w(String str, N0 n1) {
        int iP = n1.p();
        e eVar = this.f12583j;
        if (iP == 0) {
            eVar.e(str);
            return;
        }
        L lJ = j();
        lJ.f12479n.f(Integer.valueOf(n1.p()), "EES programs found");
        C2104u1 c2104u1 = (C2104u1) n1.D().get(0);
        try {
            C2112w c2112w = new C2112w();
            C2358m c2358m = c2112w.f10797a;
            Z z3 = new Z(0);
            z3.f12590b = this;
            z3.f12591c = str;
            ((HashMap) ((C2115w2) c2358m.f13472r).f10802o).put("internal.remoteConfig", z3);
            Z z4 = new Z(2);
            z4.f12590b = this;
            z4.f12591c = str;
            ((HashMap) ((C2115w2) c2358m.f13472r).f10802o).put("internal.appMetadata", z4);
            k kVar = new k();
            kVar.f339b = this;
            ((HashMap) ((C2115w2) c2358m.f13472r).f10802o).put("internal.logger", kVar);
            c2112w.a(c2104u1);
            eVar.d(str, c2112w);
            j().f12479n.h("EES program loaded for appId, activities", str, Integer.valueOf(c2104u1.p().p()));
            Iterator it = c2104u1.p().r().iterator();
            while (it.hasNext()) {
                j().f12479n.f(((C2099t1) it.next()).p(), "EES program activity");
            }
        } catch (L unused) {
            j().f12472f.f(str, "Failed to load EES program. appId");
        }
    }

    public final void x(String str, String str2, String str3, byte[] bArr) {
        M0 m5;
        byte[] bArrC;
        boolean z3;
        String str4;
        boolean z4;
        o();
        h();
        z.e(str);
        M0 m6 = (M0) s(bArr, str).l();
        v(str, m6);
        w(str, (N0) m6.a());
        N0 n1 = (N0) m6.a();
        C2174e c2174e = this.f12581h;
        c2174e.put(str, n1);
        this.f12585l.put(str, ((N0) m6.p).A());
        this.f12586m.put(str, str2);
        this.f12587n.put(str, str3);
        this.f12579d.put(str, t((N0) m6.a()));
        C2243k c2243kL = l();
        ArrayList<C2098t0> arrayList = new ArrayList(Collections.unmodifiableList(((N0) m6.p).B()));
        String str5 = "app_id=? and audience_id=?";
        int i5 = 0;
        while (i5 < arrayList.size()) {
            C2093s0 c2093s0 = (C2093s0) ((C2098t0) arrayList.get(i5)).l();
            if (((C2098t0) c2093s0.p).t() != 0) {
                int i6 = 0;
                while (i6 < ((C2098t0) c2093s0.p).t()) {
                    C2103u0 c2103u0 = (C2103u0) ((C2098t0) c2093s0.p).q(i6).l();
                    C2103u0 c2103u1 = (C2103u0) ((AbstractC2020e2) c2103u0.clone());
                    C2174e c2174e2 = c2174e;
                    String strC = AbstractC2261t0.c(((C2108v0) c2103u0.p).w(), AbstractC2261t0.f12851a, AbstractC2261t0.f12853c);
                    if (strC != null) {
                        c2103u1.c();
                        C2108v0.s((C2108v0) c2103u1.p, strC);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i7 = 0;
                    while (i7 < ((C2108v0) c2103u0.p).p()) {
                        C2118x0 c2118x0Q = ((C2108v0) c2103u0.p).q(i7);
                        C2103u0 c2103u2 = c2103u0;
                        M0 m7 = m6;
                        String str6 = str5;
                        String strC2 = AbstractC2261t0.c(c2118x0Q.t(), AbstractC2261t0.g, AbstractC2261t0.f12856h);
                        if (strC2 != null) {
                            C2113w0 c2113w0 = (C2113w0) c2118x0Q.l();
                            c2113w0.c();
                            C2118x0.p((C2118x0) c2113w0.p, strC2);
                            C2118x0 c2118x0 = (C2118x0) c2113w0.a();
                            c2103u1.c();
                            C2108v0.r((C2108v0) c2103u1.p, i7, c2118x0);
                            z4 = true;
                        }
                        i7++;
                        c2103u0 = c2103u2;
                        m6 = m7;
                        str5 = str6;
                    }
                    M0 m8 = m6;
                    String str7 = str5;
                    if (z4) {
                        c2093s0.c();
                        C2098t0.r((C2098t0) c2093s0.p, i6, (C2108v0) c2103u1.a());
                        arrayList.set(i5, (C2098t0) c2093s0.a());
                    }
                    i6++;
                    c2174e = c2174e2;
                    m6 = m8;
                    str5 = str7;
                }
            }
            M0 m9 = m6;
            C2174e c2174e3 = c2174e;
            String str8 = str5;
            if (((C2098t0) c2093s0.p).v() != 0) {
                for (int i8 = 0; i8 < ((C2098t0) c2093s0.p).v(); i8++) {
                    B0 b0U = ((C2098t0) c2093s0.p).u(i8);
                    String strC3 = AbstractC2261t0.c(b0U.t(), AbstractC2261t0.e, AbstractC2261t0.f12855f);
                    if (strC3 != null) {
                        A0 a5 = (A0) b0U.l();
                        a5.c();
                        B0.q((B0) a5.p, strC3);
                        c2093s0.c();
                        C2098t0.s((C2098t0) c2093s0.p, i8, (B0) a5.a());
                        arrayList.set(i5, (C2098t0) c2093s0.a());
                    }
                }
            }
            i5++;
            c2174e = c2174e3;
            m6 = m9;
            str5 = str8;
        }
        M0 m10 = m6;
        C2174e c2174e4 = c2174e;
        String str9 = str5;
        c2243kL.o();
        c2243kL.h();
        z.e(str);
        SQLiteDatabase sQLiteDatabaseR = c2243kL.r();
        sQLiteDatabaseR.beginTransaction();
        try {
            c2243kL.o();
            c2243kL.h();
            z.e(str);
            SQLiteDatabase sQLiteDatabaseR2 = c2243kL.r();
            sQLiteDatabaseR2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseR2.delete("event_filters", "app_id=?", new String[]{str});
            for (C2098t0 c2098t0 : arrayList) {
                c2243kL.o();
                c2243kL.h();
                z.e(str);
                z.i(c2098t0);
                if (c2098t0.y()) {
                    int iP = c2098t0.p();
                    Iterator it = c2098t0.w().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C2108v0) it.next()).C()) {
                                c2243kL.j().f12474i.h("Event filter with no ID. Audience definition ignored. appId, audienceId", L.q(str), Integer.valueOf(iP));
                                break;
                            }
                        } else {
                            Iterator it2 = c2098t0.x().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = c2098t0.w().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!c2243kL.M(str, iP, (C2108v0) it3.next())) {
                                                z3 = false;
                                                break;
                                            }
                                        } else {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    if (z3) {
                                        Iterator it4 = c2098t0.x().iterator();
                                        while (it4.hasNext()) {
                                            if (!c2243kL.N(str, iP, (B0) it4.next())) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z3) {
                                        str4 = str9;
                                    } else {
                                        c2243kL.o();
                                        c2243kL.h();
                                        z.e(str);
                                        SQLiteDatabase sQLiteDatabaseR3 = c2243kL.r();
                                        str4 = str9;
                                        sQLiteDatabaseR3.delete("property_filters", str4, new String[]{str, String.valueOf(iP)});
                                        sQLiteDatabaseR3.delete("event_filters", str4, new String[]{str, String.valueOf(iP)});
                                    }
                                    str9 = str4;
                                    break;
                                }
                                if (!((B0) it2.next()).x()) {
                                    c2243kL.j().f12474i.h("Property filter with no ID. Audience definition ignored. appId, audienceId", L.q(str), Integer.valueOf(iP));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    c2243kL.j().f12474i.f(L.q(str), "Audience with no ID. appId");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C2098t0 c2098t1 : arrayList) {
                arrayList2.add(c2098t1.y() ? Integer.valueOf(c2098t1.p()) : null);
            }
            c2243kL.U(str, arrayList2);
            sQLiteDatabaseR.setTransactionSuccessful();
            sQLiteDatabaseR.endTransaction();
            try {
                m10.c();
                m5 = m10;
                try {
                    N0.r((N0) m5.p);
                    bArrC = ((N0) m5.a()).c();
                } catch (RuntimeException e) {
                    e = e;
                    j().f12474i.h("Unable to serialize reduced-size config. Storing full config instead. appId", L.q(str), e);
                    bArrC = bArr;
                }
            } catch (RuntimeException e3) {
                e = e3;
                m5 = m10;
            }
            C2243k c2243kL2 = l();
            z.e(str);
            c2243kL2.h();
            c2243kL2.o();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrC);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c2243kL2.r().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c2243kL2.j().f12472f.f(L.q(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e5) {
                c2243kL2.j().f12472f.h("Error storing remote config. appId", L.q(str), e5);
            }
            c2174e4.put(str, (N0) m5.a());
        } catch (Throwable th) {
            sQLiteDatabaseR.endTransaction();
            throw th;
        }
    }

    public final int y(String str, String str2) {
        Integer num;
        h();
        G(str);
        Map map = (Map) this.f12582i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final I0 z(String str) {
        h();
        G(str);
        N0 n0B = B(str);
        if (n0B == null || !n0B.G()) {
            return null;
        }
        return n0B.v();
    }
}
