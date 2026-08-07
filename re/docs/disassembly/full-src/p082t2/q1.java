package p082t2;

import T1.z;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.ads.PC;
import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C2001b1;
import com.google.android.gms.internal.measurement.C2060l1;
import com.google.android.gms.internal.measurement.C2065m1;
import com.google.android.gms.internal.measurement.C2070n1;
import com.google.android.gms.internal.measurement.C2075o1;
import com.google.android.gms.internal.measurement.C2085q1;
import com.google.android.gms.internal.measurement.C2103u0;
import com.google.android.gms.internal.measurement.C2108v0;
import com.google.android.gms.internal.measurement.C2126y3;
import com.google.android.gms.internal.measurement.InterfaceC2066m2;
import com.google.android.gms.internal.measurement.W0;
import com.google.android.gms.internal.measurement.X0;
import com.google.android.gms.internal.measurement.Y0;
import com.google.android.gms.internal.measurement.Z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p047l.C2170a;
import p047l.C2171b;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12823d;
    public HashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2174e f12824f;
    public Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f12825h;

    @Override // p082t2.h1
    public final boolean q() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:350:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:430:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v37 */
    public final ArrayList r(String str, List list, List list2, Long l5, Long l6) throws Throwable {
        int i5;
        boolean z3;
        String str2;
        Object obj;
        ?? r7;
        Cursor cursorQuery;
        Map mapEmptyMap;
        Map map;
        String str3;
        String str4;
        ArrayList arrayList;
        List listEmptyList;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        C2260t c2260t;
        PC pc;
        Integer num;
        String str5;
        Map map2;
        List<C2108v0> list3;
        String str6;
        ?? r8;
        Cursor cursorRawQuery;
        Map map3;
        Map map4;
        String str7;
        ?? r9;
        Cursor cursorQuery2;
        String str8 = "current_results";
        z.e(str);
        z.i(list);
        z.i(list2);
        this.f12823d = str;
        this.e = new HashSet();
        int i7 = 0;
        this.f12824f = new C2174e(0);
        this.g = l5;
        this.f12825h = l6;
        Iterator it = list.iterator();
        while (true) {
            i5 = 1;
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(((C2001b1) it.next()).D())) {
                z3 = true;
                break;
            }
        }
        C2126y3.a();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        boolean zT = c2236g0.g.t(this.f12823d, AbstractC2268x.f12946h0);
        C2126y3.a();
        boolean zT2 = c2236g0.g.t(this.f12823d, AbstractC2268x.f12944g0);
        if (z3) {
            C2243k c2243kL = l();
            String str9 = this.f12823d;
            c2243kL.o();
            c2243kL.h();
            z.e(str9);
            ContentValues contentValues = new ContentValues();
            str2 = "current_session_count";
            contentValues.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseR = c2243kL.r();
                str2 = "events";
                sQLiteDatabaseR.update("events", contentValues, "app_id = ?", new String[]{str9});
                obj = sQLiteDatabaseR;
            } catch (SQLiteException e) {
                c2243kL.j().f12472f.h("Error resetting session-scoped event counts. appId", L.q(str9), e);
                obj = "Error resetting session-scoped event counts. appId";
            }
        }
        Map mapEmptyMap2 = Collections.emptyMap();
        String str10 = "audience_id";
        Object obj2 = mapEmptyMap2;
        obj2 = mapEmptyMap2;
        Object obj3 = obj;
        obj3 = obj;
        if (zT2 && zT) {
            C2243k c2243kL2 = l();
            String str11 = this.f12823d;
            z.e(str11);
            C2174e c2174e = new C2174e(0);
            try {
                try {
                    cursorQuery2 = c2243kL2.r().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str11}, null, null, null);
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                try {
                                    C2108v0 c2108v0 = (C2108v0) ((C2103u0) P.x(C2108v0.u(), cursorQuery2.getBlob(i5))).a();
                                    if (c2108v0.B()) {
                                        int i8 = cursorQuery2.getInt(0);
                                        List arrayList2 = (List) c2174e.get(Integer.valueOf(i8));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            c2174e.put(Integer.valueOf(i8), arrayList2);
                                        }
                                        arrayList2.add(c2108v0);
                                    }
                                } catch (IOException e3) {
                                    c2243kL2.j().f12472f.h("Failed to merge filter. appId", L.q(str11), e3);
                                }
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                }
                                i5 = 1;
                            }
                            cursorQuery2.close();
                            obj2 = c2174e;
                            obj3 = c2174e;
                        } else {
                            Map mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery2.close();
                            obj2 = mapEmptyMap3;
                            obj3 = c2174e;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        c2243kL2.j().f12472f.h("Database error querying filters. appId", L.q(str11), e);
                        Map mapEmptyMap4 = Collections.emptyMap();
                        obj2 = mapEmptyMap4;
                        obj3 = "Database error querying filters. appId";
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                            obj2 = mapEmptyMap4;
                            obj3 = "Database error querying filters. appId";
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r9 = str2;
                    if (r9 != 0) {
                        r9.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e6) {
                e = e6;
                cursorQuery2 = null;
            } catch (Throwable th2) {
                th = th2;
                r9 = 0;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        }
        ?? r12 = obj2;
        C2243k c2243kL3 = l();
        String str12 = this.f12823d;
        c2243kL3.o();
        c2243kL3.h();
        z.e(str12);
        try {
            try {
                cursorQuery = c2243kL3.r().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str12}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        C2174e c2174e2 = new C2174e(0);
                        while (true) {
                            int i9 = cursorQuery.getInt(i7);
                            try {
                                c2174e2.put(Integer.valueOf(i9), (C2065m1) ((C2060l1) P.x(C2065m1.B(), cursorQuery.getBlob(1))).a());
                            } catch (IOException e7) {
                                c2243kL3.j().f12472f.i("Failed to merge filter results. appId, audienceId, error", L.q(str12), Integer.valueOf(i9), e7);
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            c2174e2 = c2174e2;
                            i7 = 0;
                        }
                        cursorQuery.close();
                        map = c2174e2;
                    } else {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        map = mapEmptyMap;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    c2243kL3.j().f12472f.h("Database error querying filter results. appId", L.q(str12), e);
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r7 = obj3;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            r7 = 0;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        if (map.isEmpty()) {
            str3 = "audience_id";
            str4 = "current_results";
        } else {
            HashSet<Integer> hashSet = new HashSet(map.keySet());
            if (z3) {
                String str13 = this.f12823d;
                C2243k c2243kL4 = l();
                String str14 = this.f12823d;
                c2243kL4.o();
                c2243kL4.h();
                z.e(str14);
                C2174e c2174e3 = new C2174e(0);
                SQLiteDatabase sQLiteDatabaseR2 = c2243kL4.r();
                try {
                    try {
                        cursorRawQuery = sQLiteDatabaseR2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str14, str14});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    int i10 = cursorRawQuery.getInt(0);
                                    List arrayList3 = (List) c2174e3.get(Integer.valueOf(i10));
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        c2174e3.put(Integer.valueOf(i10), arrayList3);
                                    }
                                    arrayList3.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                                cursorRawQuery.close();
                                map3 = c2174e3;
                            } else {
                                Map mapEmptyMap5 = Collections.emptyMap();
                                cursorRawQuery.close();
                                map3 = mapEmptyMap5;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            c2243kL4.j().f12472f.h("Database error querying scoped filters. appId", L.q(str14), e);
                            Map mapEmptyMap6 = Collections.emptyMap();
                            map3 = mapEmptyMap6;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                map3 = mapEmptyMap6;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r8 = sQLiteDatabaseR2;
                        if (r8 != 0) {
                            r8.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorRawQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                    r8 = 0;
                    if (r8 != 0) {
                        r8.close();
                    }
                    throw th;
                }
                z.e(str13);
                C2174e c2174e4 = new C2174e(0);
                if (!map.isEmpty()) {
                    Iterator it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        Integer num2 = (Integer) it2.next();
                        num2.getClass();
                        C2065m1 c2065m1 = (C2065m1) map.get(num2);
                        List list4 = (List) map3.get(num2);
                        if (list4 == null || list4.isEmpty()) {
                            map4 = map3;
                            str7 = str10;
                            c2174e4.put(num2, c2065m1);
                            it2 = it2;
                            map3 = map4;
                            str10 = str7;
                        } else {
                            Map map5 = map3;
                            List listC = k().C((InterfaceC2066m2) c2065m1.E(), list4);
                            if (listC.isEmpty()) {
                                map3 = map5;
                            } else {
                                C2060l1 c2060l1 = (C2060l1) c2065m1.l();
                                c2060l1.c();
                                C2065m1.u((C2065m1) c2060l1.p);
                                c2060l1.c();
                                C2065m1.t((C2065m1) c2060l1.p, listC);
                                List listC2 = k().C((InterfaceC2066m2) c2065m1.G(), list4);
                                c2060l1.c();
                                C2065m1.r((C2065m1) c2060l1.p);
                                c2060l1.c();
                                C2065m1.q((C2065m1) c2060l1.p, listC2);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = c2065m1.D().iterator();
                                while (it3.hasNext()) {
                                    Iterator it4 = it3;
                                    Z0 z7 = (Z0) it3.next();
                                    String str15 = str10;
                                    if (!list4.contains(Integer.valueOf(z7.p()))) {
                                        arrayList4.add(z7);
                                    }
                                    it3 = it4;
                                    str10 = str15;
                                }
                                str7 = str10;
                                c2060l1.c();
                                C2065m1.w((C2065m1) c2060l1.p);
                                c2060l1.c();
                                C2065m1.x((C2065m1) c2060l1.p, arrayList4);
                                ArrayList arrayList5 = new ArrayList();
                                for (C2075o1 c2075o1 : c2065m1.F()) {
                                    if (!list4.contains(Integer.valueOf(c2075o1.t()))) {
                                        arrayList5.add(c2075o1);
                                    }
                                }
                                c2060l1.c();
                                C2065m1.z((C2065m1) c2060l1.p);
                                c2060l1.c();
                                C2065m1.A((C2065m1) c2060l1.p, arrayList5);
                                c2174e4.put(num2, (C2065m1) c2060l1.a());
                                map4 = map5;
                                it2 = it2;
                                map3 = map4;
                                str10 = str7;
                            }
                        }
                    }
                }
                str5 = str10;
                map2 = c2174e4;
            } else {
                str5 = "audience_id";
                map2 = map;
            }
            for (Integer num3 : hashSet) {
                num3.getClass();
                C2065m1 c2065m2 = (C2065m1) map2.get(num3);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C2174e c2174e5 = new C2174e(0);
                if (c2065m2 != null && c2065m2.p() != 0) {
                    for (Z0 z8 : c2065m2.D()) {
                        if (z8.v()) {
                            c2174e5.put(Integer.valueOf(z8.p()), z8.u() ? Long.valueOf(z8.s()) : null);
                        }
                    }
                }
                C2174e c2174e6 = new C2174e(0);
                if (c2065m2 != null && c2065m2.v() != 0) {
                    Iterator it5 = c2065m2.F().iterator();
                    while (it5.hasNext()) {
                        C2075o1 c2075o2 = (C2075o1) it5.next();
                        if (c2075o2.w() && c2075o2.p() > 0) {
                            c2174e6.put(Integer.valueOf(c2075o2.t()), Long.valueOf(c2075o2.q(c2075o2.p() - 1)));
                        }
                        it5 = it5;
                        map2 = map2;
                    }
                }
                Map map6 = map2;
                if (c2065m2 != null) {
                    int i11 = 0;
                    while (i11 < (c2065m2.y() << 6)) {
                        if (P.T((InterfaceC2066m2) c2065m2.G(), i11)) {
                            str6 = str8;
                            j().f12479n.h("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i11));
                            bitSet2.set(i11);
                            if (P.T((InterfaceC2066m2) c2065m2.E(), i11)) {
                                bitSet.set(i11);
                            }
                            i11++;
                            str8 = str6;
                        } else {
                            str6 = str8;
                        }
                        c2174e5.remove(Integer.valueOf(i11));
                        i11++;
                        str8 = str6;
                    }
                }
                String str16 = str8;
                C2065m1 c2065m3 = (C2065m1) map.get(num3);
                if (zT2 && zT && (list3 = (List) r12.get(num3)) != null && this.f12825h != null && this.g != null) {
                    for (C2108v0 c2108v1 : list3) {
                        int iT = c2108v1.t();
                        long jLongValue = this.f12825h.longValue() / 1000;
                        if (c2108v1.z()) {
                            jLongValue = this.g.longValue() / 1000;
                        }
                        if (c2174e5.containsKey(Integer.valueOf(iT))) {
                            c2174e5.put(Integer.valueOf(iT), Long.valueOf(jLongValue));
                        }
                        if (c2174e6.containsKey(Integer.valueOf(iT))) {
                            c2174e6.put(Integer.valueOf(iT), Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f12824f.put(num3, new r1(this, this.f12823d, c2065m3, bitSet, bitSet2, c2174e5, c2174e6));
                str8 = str16;
                map2 = map6;
                map = map;
            }
            str4 = str8;
            str3 = str5;
        }
        if (!list.isEmpty()) {
            PC pc2 = new PC(this);
            C2174e c2174e7 = new C2174e(0);
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                C2001b1 c2001b1 = (C2001b1) it6.next();
                C2001b1 c2001b1L = pc2.l(c2001b1, this.f12823d);
                if (c2001b1L != null) {
                    C2243k c2243kL5 = l();
                    String str17 = this.f12823d;
                    String strD = c2001b1L.D();
                    C2260t c2260tX = c2243kL5.X(str17, c2001b1.D());
                    if (c2260tX == null) {
                        c2243kL5.j().f12474i.h("Event aggregate wasn't created during raw event logging. appId, event", L.q(str17), ((C2236g0) c2243kL5.f12783a).f12685m.b(strD));
                        c2260t = new C2260t(str17, c2001b1.D(), 1L, 1L, 1L, c2001b1.B(), 0L, null, null, null, null);
                    } else {
                        c2260t = new C2260t(c2260tX.f12842a, c2260tX.f12843b, c2260tX.f12844c + 1, c2260tX.f12845d + 1, c2260tX.e + 1, c2260tX.f12846f, c2260tX.g, c2260tX.f12847h, c2260tX.f12848i, c2260tX.f12849j, c2260tX.f12850k);
                    }
                    C2260t c2260t2 = c2260t;
                    l().K(c2260t2);
                    String strD2 = c2001b1L.D();
                    Map mapA0 = (Map) c2174e7.get(strD2);
                    if (mapA0 == null) {
                        mapA0 = l().a0(this.f12823d, strD2);
                        c2174e7.put(strD2, mapA0);
                    }
                    Map map7 = mapA0;
                    for (Integer num4 : map7.keySet()) {
                        int iIntValue = num4.intValue();
                        if (this.e.contains(num4)) {
                            j().f12479n.f(num4, "Skipping failed audience ID");
                        } else {
                            Iterator it7 = ((List) map7.get(num4)).iterator();
                            boolean zE = true;
                            while (true) {
                                if (!it7.hasNext()) {
                                    pc = pc2;
                                    num = num4;
                                    break;
                                }
                                C2108v0 c2108v2 = (C2108v0) it7.next();
                                pc = pc2;
                                num = num4;
                                C2227c c2227c = new C2227c(this, this.f12823d, iIntValue, c2108v2, 0);
                                Long l7 = this.g;
                                Long l8 = this.f12825h;
                                int iT2 = c2108v2.t();
                                r1 r1Var = (r1) this.f12824f.get(num);
                                zE = c2227c.e(l7, l8, c2001b1L, c2260t2.f12844c, c2260t2, r1Var == null ? false : r1Var.f12833d.get(iT2));
                                if (!zE) {
                                    this.e.add(num);
                                    break;
                                }
                                s(num).a(c2227c);
                                num4 = num;
                                pc2 = pc;
                            }
                            if (!zE) {
                                this.e.add(num);
                            }
                            pc2 = pc;
                        }
                    }
                }
            }
        }
        if (!list2.isEmpty()) {
            C2174e c2174e8 = new C2174e(0);
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                C2085q1 c2085q1 = (C2085q1) it8.next();
                String strC = c2085q1.C();
                Map mapB0 = (Map) c2174e8.get(strC);
                if (mapB0 == null) {
                    mapB0 = l().b0(this.f12823d, strC);
                    c2174e8.put(strC, mapB0);
                }
                Map map8 = mapB0;
                for (Integer num5 : map8.keySet()) {
                    int iIntValue2 = num5.intValue();
                    if (this.e.contains(num5)) {
                        j().f12479n.f(num5, "Skipping failed audience ID");
                        break;
                    }
                    Iterator it9 = ((List) map8.get(num5)).iterator();
                    boolean zF = true;
                    while (true) {
                        if (it9.hasNext()) {
                            B0 b5 = (B0) it9.next();
                            if (j().s(2)) {
                                j().f12479n.i("Evaluating filter. audience, filter, property", num5, b5.x() ? Integer.valueOf(b5.p()) : null, c2236g0.f12685m.g(b5.t()));
                                L lJ = j();
                                P pK = k();
                                StringBuilder sb = new StringBuilder();
                                sb.append("\nproperty_filter {\n");
                                if (b5.x()) {
                                    i6 = 0;
                                    P.Q(sb, 0, "filter_id", Integer.valueOf(b5.p()));
                                } else {
                                    i6 = 0;
                                }
                                P.Q(sb, i6, "property_name", ((C2236g0) pK.f12783a).f12685m.g(b5.t()));
                                String strZ = P.z(b5.u(), b5.v(), b5.w());
                                if (strZ.isEmpty()) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                    P.Q(sb, 0, "filter_type", strZ);
                                }
                                z5 = true;
                                pK.N(sb, 1, b5.r());
                                sb.append("}\n");
                                lJ.f12479n.f(sb.toString(), "Filter definition");
                            } else {
                                z5 = true;
                                z6 = false;
                            }
                            if (!b5.x() || b5.p() > 256) {
                                boolean z9 = z6;
                                j().f12474i.h("Invalid property filter ID. appId, id", L.q(this.f12823d), String.valueOf(b5.x() ? Integer.valueOf(b5.p()) : null));
                                z4 = z9;
                                if (!z4) {
                                    this.e.add(num5);
                                }
                            } else {
                                boolean z10 = z6;
                                C2227c c2227c2 = new C2227c(this, this.f12823d, iIntValue2, b5, 1);
                                Long l9 = this.g;
                                Long l10 = this.f12825h;
                                int iP = b5.p();
                                r1 r1Var2 = (r1) this.f12824f.get(num5);
                                zF = c2227c2.f(l9, l10, c2085q1, r1Var2 == null ? z10 : r1Var2.f12833d.get(iP));
                                if (zF) {
                                    s(num5).a(c2227c2);
                                } else {
                                    this.e.add(num5);
                                }
                            }
                        }
                        z4 = zF;
                        if (!z4) {
                            this.e.add(num5);
                        }
                    }
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        C2171b<Integer> c2171b = (C2171b) this.f12824f.keySet();
        c2171b.removeAll(this.e);
        for (Integer num6 : c2171b) {
            int iIntValue3 = num6.intValue();
            r1 r1Var3 = (r1) this.f12824f.get(num6);
            z.i(r1Var3);
            W0 w0T = X0.t();
            w0T.c();
            X0.q((X0) w0T.p, iIntValue3);
            w0T.c();
            X0.s((X0) w0T.p, r1Var3.f12831b);
            C2065m1 c2065m4 = r1Var3.f12832c;
            if (c2065m4 != null) {
                w0T.c();
                X0.u((X0) w0T.p, c2065m4);
            }
            C2060l1 c2060l1B = C2065m1.B();
            ArrayList arrayListA = P.A(r1Var3.f12833d);
            c2060l1B.c();
            C2065m1.t((C2065m1) c2060l1B.p, arrayListA);
            ArrayList arrayListA2 = P.A(r1Var3.e);
            c2060l1B.c();
            C2065m1.q((C2065m1) c2060l1B.p, arrayListA2);
            C2174e c2174e9 = r1Var3.f12834f;
            if (c2174e9 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c2174e9.q);
                for (Integer num7 : (C2171b) c2174e9.keySet()) {
                    int iIntValue4 = num7.intValue();
                    Long l11 = (Long) c2174e9.get(num7);
                    if (l11 != null) {
                        Y0 y0T = Z0.t();
                        y0T.c();
                        Z0.q((Z0) y0T.p, iIntValue4);
                        long jLongValue2 = l11.longValue();
                        y0T.c();
                        Z0.r((Z0) y0T.p, jLongValue2);
                        arrayList.add((Z0) y0T.a());
                    }
                }
            }
            if (arrayList != null) {
                c2060l1B.c();
                C2065m1.x((C2065m1) c2060l1B.p, arrayList);
            }
            C2174e c2174e10 = r1Var3.g;
            if (c2174e10 == null) {
                listEmptyList = Collections.emptyList();
            } else {
                ArrayList arrayList7 = new ArrayList(c2174e10.q);
                Iterator it10 = ((C2171b) c2174e10.keySet()).iterator();
                while (true) {
                    C2170a c2170a = (C2170a) it10;
                    if (!c2170a.hasNext()) {
                        break;
                    }
                    Integer num8 = (Integer) c2170a.next();
                    C2070n1 c2070n1U = C2075o1.u();
                    int iIntValue5 = num8.intValue();
                    c2070n1U.c();
                    C2075o1.r((C2075o1) c2070n1U.p, iIntValue5);
                    List list5 = (List) c2174e10.get(num8);
                    if (list5 != null) {
                        Collections.sort(list5);
                        c2070n1U.c();
                        C2075o1.s((C2075o1) c2070n1U.p, list5);
                    }
                    arrayList7.add((C2075o1) c2070n1U.a());
                }
                listEmptyList = arrayList7;
            }
            c2060l1B.c();
            C2065m1.A((C2065m1) c2060l1B.p, listEmptyList);
            w0T.c();
            X0.r((X0) w0T.p, (C2065m1) c2060l1B.a());
            X0 x4 = (X0) w0T.a();
            arrayList6.add(x4);
            C2243k c2243kL6 = l();
            String str18 = this.f12823d;
            C2065m1 c2065m1V = x4.v();
            c2243kL6.o();
            c2243kL6.h();
            z.e(str18);
            z.i(c2065m1V);
            byte[] bArrC = c2065m1V.c();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str18);
            contentValues2.put(str3, num6);
            String str19 = str4;
            contentValues2.put(str19, bArrC);
            try {
                try {
                    if (c2243kL6.r().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        c2243kL6.j().f12472f.f(L.q(str18), "Failed to insert filter results (got -1). appId");
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    c2243kL6.j().f12472f.h("Error storing filter results. appId", L.q(str18), e);
                }
            } catch (SQLiteException e13) {
                e = e13;
            }
            str4 = str19;
        }
        return arrayList6;
    }

    public final r1 s(Integer num) {
        if (this.f12824f.containsKey(num)) {
            return (r1) this.f12824f.get(num);
        }
        r1 r1Var = new r1(this, this.f12823d);
        this.f12824f.put(num, r1Var);
        return r1Var;
    }
}
