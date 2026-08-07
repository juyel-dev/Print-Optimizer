package p064o2;

import com.google.android.gms.internal.ads.C1521pA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p046k2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2221y f12121o;
    public final int p;

    public Z(C2221y c2221y) throws C1521pA {
        c2221y.getClass();
        this.f12121o = c2221y;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            C2221y c2221y2 = this.f12121o;
            if (i5 >= c2221y2.size()) {
                break;
            }
            int iB = ((h0) c2221y2.get(i5)).b();
            if (i6 < iB) {
                i6 = iB;
            }
            i5++;
        }
        int i7 = i6 + 1;
        this.p = i7;
        if (i7 > 8) {
            throw new C1521pA("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d((byte) -128);
    }

    @Override // p064o2.h0
    public final int b() {
        return this.p;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        h0 h0Var = (h0) obj;
        int iA = h0Var.a();
        int iD = h0.d((byte) -128);
        if (iD != iA) {
            return iD - h0Var.a();
        }
        C2221y c2221y = this.f12121o;
        int size = c2221y.size();
        C2221y c2221y2 = ((Z) h0Var).f12121o;
        if (size != c2221y2.size()) {
            return c2221y.size() - c2221y2.size();
        }
        for (int i5 = 0; i5 < c2221y.size(); i5++) {
            int iCompareTo = ((h0) c2221y.get(i5)).compareTo((h0) c2221y2.get(i5));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            return this.f12121o.equals(((Z) obj).f12121o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h0.d((byte) -128)), this.f12121o});
    }

    public final String toString() {
        C2221y c2221y = this.f12121o;
        if (c2221y.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < c2221y.f12161r; i5++) {
            arrayList.add(((h0) c2221y.get(i5)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(h.x(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(h.x(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
