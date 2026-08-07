package p082t2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: renamed from: t2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2251o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2251o f12778f = new C2251o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f12781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12782d;
    public final EnumMap e;

    public C2251o(Boolean bool, int i5, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        this.e = enumMap;
        enumMap.put(EnumC2257r0.AD_USER_DATA, bool);
        this.f12779a = i5;
        this.f12780b = c();
        this.f12781c = bool2;
        this.f12782d = str;
    }

    public static C2251o a(int i5, Bundle bundle) {
        if (bundle == null) {
            return new C2251o((Boolean) null, i5, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.DMA.f12822o) {
            enumMap.put(enumC2257r0, C2259s0.f(bundle.getString(enumC2257r0.f12829o)));
        }
        return new C2251o(enumMap, i5, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C2251o b(String str) {
        if (str == null || str.length() <= 0) {
            return f12778f;
        }
        String[] strArrSplit = str.split(":");
        int i5 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        EnumC2257r0[] enumC2257r0Arr = EnumC2256q0.DMA.f12822o;
        int length = enumC2257r0Arr.length;
        int i6 = 1;
        int i7 = 0;
        while (true) {
            Boolean bool = null;
            if (i7 >= length) {
                return new C2251o(enumMap, i5, (Boolean) null, (String) null);
            }
            EnumC2257r0 enumC2257r0 = enumC2257r0Arr[i7];
            int i8 = i6 + 1;
            char cCharAt = strArrSplit[i6].charAt(0);
            C2259s0 c2259s0 = C2259s0.f12839c;
            if (cCharAt == '0') {
                bool = Boolean.FALSE;
            } else if (cCharAt == '1') {
                bool = Boolean.TRUE;
            }
            enumMap.put(enumC2257r0, bool);
            i7++;
            i6 = i8;
        }
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12779a);
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.DMA.f12822o) {
            sb.append(":");
            Boolean bool = (Boolean) this.e.get(enumC2257r0);
            C2259s0 c2259s0 = C2259s0.f12839c;
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2251o)) {
            return false;
        }
        C2251o c2251o = (C2251o) obj;
        if (this.f12780b.equalsIgnoreCase(c2251o.f12780b) && Objects.equals(this.f12781c, c2251o.f12781c)) {
            return Objects.equals(this.f12782d, c2251o.f12782d);
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        Boolean bool = this.f12781c;
        if (bool == null) {
            i5 = 3;
        } else {
            i5 = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f12782d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i5 * 29) + this.f12780b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C2259s0.a(this.f12779a));
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.DMA.f12822o) {
            sb.append(",");
            sb.append(enumC2257r0.f12829o);
            sb.append("=");
            Boolean bool = (Boolean) this.e.get(enumC2257r0);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        Boolean bool2 = this.f12781c;
        if (bool2 != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool2);
        }
        String str = this.f12782d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C2251o(EnumMap enumMap, int i5, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC2257r0.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f12779a = i5;
        this.f12780b = c();
        this.f12781c = bool;
        this.f12782d = str;
    }
}
