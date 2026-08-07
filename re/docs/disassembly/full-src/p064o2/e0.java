package p064o2;

import com.google.android.gms.internal.ads.C1521pA;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p046k2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12131o;
    public final C2215s p;

    public e0(C2215s c2215s) throws C1521pA {
        c2215s.getClass();
        this.p = c2215s;
        F fK = c2215s.entrySet().k();
        int i5 = 0;
        while (fK.hasNext()) {
            Map.Entry entry = (Map.Entry) fK.next();
            int iB = ((h0) entry.getKey()).b();
            i5 = i5 < iB ? iB : i5;
            int iB2 = ((h0) entry.getValue()).b();
            if (i5 < iB2) {
                i5 = iB2;
            }
        }
        int i6 = i5 + 1;
        this.f12131o = i6;
        if (i6 > 8) {
            throw new C1521pA("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d((byte) -96);
    }

    @Override // p064o2.h0
    public final int b() {
        return this.f12131o;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        h0 h0Var = (h0) obj;
        int iA = h0Var.a();
        int iD = h0.d((byte) -96);
        if (iD != iA) {
            return iD - h0Var.a();
        }
        C2215s c2215s = this.p;
        int size = c2215s.f12154r.size();
        C2215s c2215s2 = ((e0) h0Var).p;
        if (size != c2215s2.f12154r.size()) {
            return c2215s.f12154r.size() - c2215s2.f12154r.size();
        }
        F fK = c2215s.entrySet().k();
        F fK2 = c2215s2.entrySet().k();
        do {
            if (!fK.hasNext() && !fK2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) fK.next();
            Map.Entry entry2 = (Map.Entry) fK2.next();
            int iCompareTo2 = ((h0) entry.getKey()).compareTo((h0) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((h0) entry.getValue()).compareTo((h0) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            return this.p.equals(((e0) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h0.d((byte) -96)), this.p});
    }

    public final String toString() {
        C2215s c2215s = this.p;
        if (c2215s.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        F fK = c2215s.entrySet().k();
        while (fK.hasNext()) {
            Map.Entry entry = (Map.Entry) fK.next();
            linkedHashMap.put(((h0) entry.getKey()).toString().replace("\n", "\n  "), ((h0) entry.getValue()).toString().replace("\n", "\n  "));
        }
        h hVar = new h(19);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            AbstractC2198a.g(sb, linkedHashMap.entrySet().iterator(), hVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
