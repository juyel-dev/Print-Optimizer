package p082t2;

import T1.z;
import W.P;
import com.google.android.gms.internal.measurement.AbstractC2026f2;
import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.C2001b1;
import com.google.android.gms.internal.measurement.C2019e1;
import com.google.android.gms.internal.measurement.C2085q1;
import com.google.android.gms.internal.measurement.C2108v0;
import com.google.android.gms.internal.measurement.C2118x0;
import com.google.android.gms.internal.measurement.C2126y3;
import com.google.android.gms.internal.measurement.C2128z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p047l.C2174e;

/* JADX INFO: renamed from: t2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2227c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f12612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f12613d;
    public Long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f12614f;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q1 f12615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2026f2 f12616i;

    public C2227c(q1 q1Var, String str, int i5, AbstractC2026f2 abstractC2026f2, int i6) {
        this.g = i6;
        this.f12615h = q1Var;
        this.f12610a = str;
        this.f12611b = i5;
        this.f12616i = abstractC2026f2;
    }

    public static Boolean a(long j5, C2128z0 c2128z0) {
        try {
            return d(new BigDecimal(j5), c2128z0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean b(Boolean bool, boolean z3) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z3);
    }

    public static Boolean c(String str, C0 c5, L l5) {
        List listT;
        z.i(c5);
        if (str == null || !c5.x() || c5.q() == 1) {
            return null;
        }
        if (c5.q() == 7) {
            if (c5.p() == 0) {
                return null;
            }
        } else if (!c5.w()) {
            return null;
        }
        int iQ = c5.q();
        boolean zU = c5.u();
        String strS = (zU || iQ == 2 || iQ == 7) ? c5.s() : c5.s().toUpperCase(Locale.ENGLISH);
        if (c5.p() == 0) {
            listT = null;
        } else {
            listT = c5.t();
            if (!zU) {
                ArrayList arrayList = new ArrayList(listT.size());
                Iterator it = listT.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listT = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iQ == 2 ? strS : null;
        if (iQ == 7) {
            if (listT == null || listT.isEmpty()) {
                return null;
            }
        } else if (strS == null) {
            return null;
        }
        if (!zU && iQ != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (p1.f12816a[P.b(iQ)]) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, zU ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    l5.f12474i.f(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(strS));
            case 3:
                return Boolean.valueOf(str.endsWith(strS));
            case 4:
                return Boolean.valueOf(str.contains(strS));
            case 5:
                return Boolean.valueOf(str.equals(strS));
            case 6:
                if (listT == null) {
                    return null;
                }
                return Boolean.valueOf(listT.contains(str));
            default:
                return null;
        }
    }

    public static Boolean d(BigDecimal bigDecimal, C2128z0 c2128z0, double d4) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        z.i(c2128z0);
        if (c2128z0.v()) {
            if (c2128z0.p() != 1) {
                if (c2128z0.p() == 5) {
                    if (!c2128z0.z() || !c2128z0.y()) {
                        return null;
                    }
                } else if (!c2128z0.w()) {
                    return null;
                }
                int iP = c2128z0.p();
                if (c2128z0.p() == 5) {
                    if (P.X(c2128z0.t()) && P.X(c2128z0.s())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c2128z0.t());
                            bigDecimal4 = new BigDecimal(c2128z0.s());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!P.X(c2128z0.r())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c2128z0.r());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iP == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 != null) {
                }
                int i5 = p1.f12817b[P.b(iP)];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4 && bigDecimal3 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                            }
                            return null;
                        }
                        if (bigDecimal2 != null) {
                            if (d4 != 0.0d) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d4).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d4).multiply(new BigDecimal(2)))) < 0);
                            }
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                    } else if (bigDecimal2 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x029a  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x0304  */
    /* JADX WARN: Code duplicated, block: B:127:0x030a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0319  */
    /* JADX WARN: Code duplicated, block: B:130:0x031f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0327  */
    /* JADX WARN: Code duplicated, block: B:134:0x0331  */
    /* JADX WARN: Code duplicated, block: B:138:0x0342  */
    /* JADX WARN: Code duplicated, block: B:144:0x037f A[EDGE_INSN: B:144:0x037f->B:147:0x03b4 BREAK  A[LOOP:1: B:57:0x0175->B:62:0x019d]] */
    /* JADX WARN: Code duplicated, block: B:145:0x0399  */
    /* JADX WARN: Code duplicated, block: B:183:0x0333 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x034b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019d A[LOOP:1: B:57:0x0175->B:62:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:94:0x0255  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    public boolean e(Long l5, Long l6, C2001b1 c2001b1, long j5, C2260t c2260t, boolean z3) {
        HashSet hashSet;
        Iterator it;
        C2174e c2174e;
        Iterator it2;
        Iterator it3;
        Boolean bool;
        C2118x0 c2118x0;
        boolean z4;
        String strT;
        Object obj;
        Boolean boolA;
        Boolean boolD;
        String str;
        C2128z0 c2128z0R;
        Boolean boolD2;
        C2019e1 c2019e1;
        Long lValueOf;
        Double dValueOf;
        C2118x0 c2118x1;
        C2126y3.a();
        q1 q1Var = this.f12615h;
        C2235g c2235g = ((C2236g0) q1Var.f12783a).g;
        F f5 = AbstractC2268x.f12946h0;
        String str2 = this.f12610a;
        boolean zT = c2235g.t(str2, f5);
        C2108v0 c2108v0 = (C2108v0) this.f12616i;
        long j6 = c2108v0.A() ? c2260t.e : j5;
        boolean zS = q1Var.j().s(2);
        int i5 = this.f12611b;
        C2236g0 c2236g0 = (C2236g0) q1Var.f12783a;
        if (zS) {
            q1Var.j().f12479n.i("Evaluating filter. audience, filter, event", Integer.valueOf(i5), c2108v0.C() ? Integer.valueOf(c2108v0.t()) : null, c2236g0.f12685m.b(c2108v0.w()));
            L lJ = q1Var.j();
            P pK = q1Var.k();
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (c2108v0.C()) {
                P.Q(sb, 0, "filter_id", Integer.valueOf(c2108v0.t()));
            }
            P.Q(sb, 0, "event_name", ((C2236g0) pK.f12783a).f12685m.b(c2108v0.w()));
            String strZ = P.z(c2108v0.y(), c2108v0.z(), c2108v0.A());
            if (!strZ.isEmpty()) {
                P.Q(sb, 0, "filter_type", strZ);
            }
            if (c2108v0.B()) {
                P.P(sb, 1, "event_count_filter", c2108v0.v());
            }
            if (c2108v0.p() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = c2108v0.x().iterator();
                while (it4.hasNext()) {
                    pK.N(sb, 2, (C2118x0) it4.next());
                }
            }
            P.M(sb, 1);
            sb.append("}\n}\n");
            lJ.f12479n.f(sb.toString(), "Filter definition");
        }
        if (!c2108v0.C() || c2108v0.t() > 256) {
            q1Var.j().f12474i.h("Invalid event filter ID. appId, id", L.q(str2), String.valueOf(c2108v0.C() ? Integer.valueOf(c2108v0.t()) : null));
            return false;
        }
        boolean z5 = c2108v0.y() || c2108v0.z() || c2108v0.A();
        if (z3 && !z5) {
            q1Var.j().f12479n.h("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i5), c2108v0.C() ? Integer.valueOf(c2108v0.t()) : null);
            return true;
        }
        String strD = c2001b1.D();
        if (!c2108v0.B()) {
            hashSet = new HashSet();
            it = c2108v0.x().iterator();
            while (true) {
                if (it.hasNext()) {
                    c2174e = new C2174e(0);
                    it2 = c2001b1.E().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c2108v0.x().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c2118x0 = (C2118x0) it3.next();
                                if (c2118x0.v() || !c2118x0.u()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                strT = c2118x0.t();
                                if (strT.isEmpty()) {
                                    q1Var.j().f12474i.f(c2236g0.f12685m.b(strD), "Event has empty param name. event");
                                } else {
                                    obj = c2174e.get(strT);
                                    if (obj instanceof Long) {
                                        if (c2118x0.w()) {
                                            boolA = a(((Long) obj).longValue(), c2118x0.r());
                                            if (boolA == null) {
                                                if (boolA.booleanValue() == z4) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            q1Var.j().f12474i.h("No number filter for long param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        }
                                    } else if (obj instanceof Double) {
                                        if (c2118x0.w()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            try {
                                                boolD = d(new BigDecimal(dDoubleValue), c2118x0.r(), Math.ulp(dDoubleValue));
                                            } catch (NumberFormatException unused) {
                                                boolD = null;
                                            }
                                            if (boolD == null) {
                                                if (boolD.booleanValue() == z4) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            q1Var.j().f12474i.h("No number filter for double param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        }
                                    } else if (obj instanceof String) {
                                        if (c2118x0.y()) {
                                            boolD2 = c((String) obj, c2118x0.s(), q1Var.j());
                                        } else if (c2118x0.w()) {
                                            str = (String) obj;
                                            if (P.X(str)) {
                                                c2128z0R = c2118x0.r();
                                                if (P.X(str)) {
                                                    try {
                                                        boolD2 = d(new BigDecimal(str), c2128z0R, 0.0d);
                                                    } catch (NumberFormatException unused2) {
                                                        boolD2 = null;
                                                    }
                                                } else {
                                                    boolD2 = null;
                                                }
                                            } else {
                                                q1Var.j().f12474i.h("Invalid param value for number filter. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                            }
                                        } else {
                                            q1Var.j().f12474i.h("No filter for String param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        }
                                        if (boolD2 == null) {
                                            if (boolD2.booleanValue() == z4) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (obj == null) {
                                            q1Var.j().f12479n.h("Missing param for filter. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        q1Var.j().f12474i.h("Unknown param type. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                    }
                                }
                            }
                        } else {
                            c2019e1 = (C2019e1) it2.next();
                            if (!hashSet.contains(c2019e1.E())) {
                                if (c2019e1.J()) {
                                    String strE = c2019e1.E();
                                    if (c2019e1.J()) {
                                        lValueOf = Long.valueOf(c2019e1.B());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c2174e.put(strE, lValueOf);
                                } else if (c2019e1.H()) {
                                    String strE2 = c2019e1.E();
                                    if (c2019e1.H()) {
                                        dValueOf = Double.valueOf(c2019e1.p());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c2174e.put(strE2, dValueOf);
                                } else if (c2019e1.L()) {
                                    c2174e.put(c2019e1.E(), c2019e1.F());
                                } else {
                                    q1Var.j().f12474i.h("Unknown value for param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(c2019e1.E()));
                                }
                            }
                        }
                    }
                } else {
                    c2118x1 = (C2118x0) it.next();
                    if (c2118x1.t().isEmpty()) {
                        q1Var.j().f12474i.f(c2236g0.f12685m.b(strD), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c2118x1.t());
                    }
                }
                bool = null;
                break;
            }
        }
        Boolean boolA2 = a(j6, c2108v0.v());
        if (boolA2 == null) {
            bool = null;
            break;
        }
        if (boolA2.booleanValue()) {
            hashSet = new HashSet();
            it = c2108v0.x().iterator();
            while (true) {
                if (it.hasNext()) {
                    c2174e = new C2174e(0);
                    it2 = c2001b1.E().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c2108v0.x().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c2118x0 = (C2118x0) it3.next();
                                if (c2118x0.v()) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                strT = c2118x0.t();
                                if (strT.isEmpty()) {
                                    q1Var.j().f12474i.f(c2236g0.f12685m.b(strD), "Event has empty param name. event");
                                } else {
                                    obj = c2174e.get(strT);
                                    if (obj instanceof Long) {
                                        if (c2118x0.w()) {
                                            q1Var.j().f12474i.h("No number filter for long param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        } else {
                                            boolA = a(((Long) obj).longValue(), c2118x0.r());
                                            if (boolA == null) {
                                                if (boolA.booleanValue() == z4) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (obj instanceof Double) {
                                        if (c2118x0.w()) {
                                            q1Var.j().f12474i.h("No number filter for double param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        } else {
                                            double dDoubleValue2 = ((Double) obj).doubleValue();
                                            boolD = d(new BigDecimal(dDoubleValue2), c2118x0.r(), Math.ulp(dDoubleValue2));
                                            if (boolD == null) {
                                                if (boolD.booleanValue() == z4) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (obj instanceof String) {
                                        if (c2118x0.y()) {
                                            boolD2 = c((String) obj, c2118x0.s(), q1Var.j());
                                        } else if (c2118x0.w()) {
                                            str = (String) obj;
                                            if (P.X(str)) {
                                                c2128z0R = c2118x0.r();
                                                if (P.X(str)) {
                                                    boolD2 = null;
                                                } else {
                                                    boolD2 = d(new BigDecimal(str), c2128z0R, 0.0d);
                                                }
                                            } else {
                                                q1Var.j().f12474i.h("Invalid param value for number filter. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                            }
                                        } else {
                                            q1Var.j().f12474i.h("No filter for String param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                        }
                                        if (boolD2 == null) {
                                            if (boolD2.booleanValue() == z4) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (obj == null) {
                                            q1Var.j().f12479n.h("Missing param for filter. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        q1Var.j().f12474i.h("Unknown param type. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(strT));
                                    }
                                }
                            }
                        } else {
                            c2019e1 = (C2019e1) it2.next();
                            if (!hashSet.contains(c2019e1.E())) {
                                if (c2019e1.J()) {
                                    String strE3 = c2019e1.E();
                                    if (c2019e1.J()) {
                                        lValueOf = Long.valueOf(c2019e1.B());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c2174e.put(strE3, lValueOf);
                                } else if (c2019e1.H()) {
                                    String strE4 = c2019e1.E();
                                    if (c2019e1.H()) {
                                        dValueOf = Double.valueOf(c2019e1.p());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c2174e.put(strE4, dValueOf);
                                } else if (c2019e1.L()) {
                                    c2174e.put(c2019e1.E(), c2019e1.F());
                                } else {
                                    q1Var.j().f12474i.h("Unknown value for param. event, param", c2236g0.f12685m.b(strD), c2236g0.f12685m.f(c2019e1.E()));
                                }
                            }
                        }
                    }
                } else {
                    c2118x1 = (C2118x0) it.next();
                    if (c2118x1.t().isEmpty()) {
                        q1Var.j().f12474i.f(c2236g0.f12685m.b(strD), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c2118x1.t());
                    }
                }
                bool = null;
                break;
            }
        }
        bool = Boolean.FALSE;
        q1Var.j().f12479n.f(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f12612c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f12613d = bool2;
        if (!z5 || !c2001b1.H()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(c2001b1.B());
        if (c2108v0.z()) {
            if (zT && c2108v0.B()) {
                lValueOf2 = l5;
            }
            this.f12614f = lValueOf2;
            return true;
        }
        if (zT && c2108v0.B()) {
            lValueOf2 = l6;
        }
        this.e = lValueOf2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean f(Long l5, Long l6, C2085q1 c2085q1, boolean z3) {
        C2126y3.a();
        q1 q1Var = this.f12615h;
        boolean zT = ((C2236g0) q1Var.f12783a).g.t(this.f12610a, AbstractC2268x.f12943f0);
        B0 b5 = (B0) this.f12616i;
        boolean zU = b5.u();
        boolean zV = b5.v();
        boolean zW = b5.w();
        Object[] objArr = zU || zV || zW;
        Boolean boolB = null;
        boolD = null;
        Boolean boolD = null;
        boolB = null;
        boolB = null;
        boolB = null;
        Boolean boolD2 = null;
        boolB = null;
        if (z3 && objArr != true) {
            q1Var.j().f12479n.h("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f12611b), b5.x() ? Integer.valueOf(b5.p()) : null);
            return true;
        }
        C2118x0 c2118x0R = b5.r();
        boolean zU2 = c2118x0R.u();
        boolean zG = c2085q1.G();
        C2236g0 c2236g0 = (C2236g0) q1Var.f12783a;
        if (zG) {
            if (c2118x0R.w()) {
                boolB = b(a(c2085q1.y(), c2118x0R.r()), zU2);
            } else {
                q1Var.j().f12474i.f(c2236g0.f12685m.g(c2085q1.C()), "No number filter for long property. property");
            }
        } else if (c2085q1.E()) {
            if (c2118x0R.w()) {
                double dP = c2085q1.p();
                try {
                    boolD = d(new BigDecimal(dP), c2118x0R.r(), Math.ulp(dP));
                } catch (NumberFormatException unused) {
                }
                boolB = b(boolD, zU2);
            } else {
                q1Var.j().f12474i.f(c2236g0.f12685m.g(c2085q1.C()), "No number filter for double property. property");
            }
        } else if (!c2085q1.I()) {
            q1Var.j().f12474i.f(c2236g0.f12685m.g(c2085q1.C()), "User property has no value, property");
        } else if (c2118x0R.y()) {
            boolB = b(c(c2085q1.D(), c2118x0R.s(), q1Var.j()), zU2);
        } else if (!c2118x0R.w()) {
            q1Var.j().f12474i.f(c2236g0.f12685m.g(c2085q1.C()), "No string or number filter defined. property");
        } else if (P.X(c2085q1.D())) {
            String strD = c2085q1.D();
            C2128z0 c2128z0R = c2118x0R.r();
            if (P.X(strD)) {
                try {
                    boolD2 = d(new BigDecimal(strD), c2128z0R, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            boolB = b(boolD2, zU2);
        } else {
            q1Var.j().f12474i.h("Invalid user property value for Numeric number filter. property, value", c2236g0.f12685m.g(c2085q1.C()), c2085q1.D());
        }
        q1Var.j().f12479n.f(boolB == null ? "null" : boolB, "Property filter result");
        if (boolB == null) {
            return false;
        }
        this.f12612c = Boolean.TRUE;
        if (zW && !boolB.booleanValue()) {
            return true;
        }
        if (!z3 || b5.u()) {
            this.f12613d = boolB;
        }
        if (boolB.booleanValue() && objArr != false && c2085q1.H()) {
            long jA = c2085q1.A();
            if (l5 != null) {
                jA = l5.longValue();
            }
            if (zT && b5.u() && !b5.v() && l6 != null) {
                jA = l6.longValue();
            }
            if (b5.v()) {
                this.f12614f = Long.valueOf(jA);
            } else {
                this.e = Long.valueOf(jA);
            }
        }
        return true;
    }
}
