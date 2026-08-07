package p082t2;

import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C2065m1;
import com.google.android.gms.internal.measurement.C2108v0;
import com.google.android.gms.internal.measurement.C2126y3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import p047l.C2171b;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2065m1 f12832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f12833d;
    public final BitSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2174e f12834f;
    public final C2174e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q1 f12835h;

    public r1(q1 q1Var, String str) {
        this.f12835h = q1Var;
        this.f12830a = str;
        this.f12831b = true;
        this.f12833d = new BitSet();
        this.e = new BitSet();
        this.f12834f = new C2174e(0);
        this.g = new C2174e(0);
    }

    public final void a(C2227c c2227c) {
        int iT;
        boolean z3;
        boolean zB;
        switch (c2227c.g) {
            case 0:
                iT = ((C2108v0) c2227c.f12616i).t();
                break;
            default:
                iT = ((B0) c2227c.f12616i).p();
                break;
        }
        Boolean bool = c2227c.f12612c;
        if (bool != null) {
            this.e.set(iT, bool.booleanValue());
        }
        Boolean bool2 = c2227c.f12613d;
        if (bool2 != null) {
            this.f12833d.set(iT, bool2.booleanValue());
        }
        if (c2227c.e != null) {
            Integer numValueOf = Integer.valueOf(iT);
            C2174e c2174e = this.f12834f;
            Long l5 = (Long) c2174e.get(numValueOf);
            long jLongValue = c2227c.e.longValue() / 1000;
            if (l5 == null || jLongValue > l5.longValue()) {
                c2174e.put(Integer.valueOf(iT), Long.valueOf(jLongValue));
            }
        }
        if (c2227c.f12614f != null) {
            C2174e c2174e2 = this.g;
            List arrayList = (List) c2174e2.get(Integer.valueOf(iT));
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2174e2.put(Integer.valueOf(iT), arrayList);
            }
            switch (c2227c.g) {
                case 0:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                arrayList.clear();
            }
            C2126y3.a();
            q1 q1Var = this.f12835h;
            C2235g c2235g = ((C2236g0) q1Var.f12783a).g;
            F f5 = AbstractC2268x.f12946h0;
            String str = this.f12830a;
            if (c2235g.t(str, f5)) {
                switch (c2227c.g) {
                    case 0:
                        zB = ((C2108v0) c2227c.f12616i).B();
                        break;
                    default:
                        zB = false;
                        break;
                }
                if (zB) {
                    arrayList.clear();
                }
            }
            C2126y3.a();
            if (!((C2236g0) q1Var.f12783a).g.t(str, f5)) {
                arrayList.add(Long.valueOf(c2227c.f12614f.longValue() / 1000));
                return;
            }
            long jLongValue2 = c2227c.f12614f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public r1(q1 q1Var, String str, C2065m1 c2065m1, BitSet bitSet, BitSet bitSet2, C2174e c2174e, C2174e c2174e2) {
        this.f12835h = q1Var;
        this.f12830a = str;
        this.f12833d = bitSet;
        this.e = bitSet2;
        this.f12834f = c2174e;
        this.g = new C2174e(0);
        for (Integer num : (C2171b) c2174e2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c2174e2.get(num));
            this.g.put(num, arrayList);
        }
        this.f12831b = false;
        this.f12832c = c2065m1;
    }
}
