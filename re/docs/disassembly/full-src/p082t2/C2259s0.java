package p082t2;

import android.os.Bundle;
import java.util.EnumMap;

/* JADX INFO: renamed from: t2.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2259s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2259s0 f12839c = new C2259s0(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f12840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12841b;

    public C2259s0(EnumMap enumMap, int i5) {
        EnumMap enumMap2 = new EnumMap(EnumC2257r0.class);
        this.f12840a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f12841b = i5;
    }

    public static String a(int i5) {
        if (i5 == -20) {
            return "API";
        }
        if (i5 == -10) {
            return "MANIFEST";
        }
        if (i5 == 0) {
            return "1P_API";
        }
        if (i5 == 30) {
            return "1P_INIT";
        }
        if (i5 != 90) {
            return i5 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static C2259s0 b(int i5, Bundle bundle) {
        if (bundle == null) {
            return new C2259s0(null, null, i5);
        }
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.STORAGE.f12822o) {
            enumMap.put(enumC2257r0, f(bundle.getString(enumC2257r0.f12829o)));
        }
        return new C2259s0(enumMap, i5);
    }

    public static C2259s0 c(int i5, String str) {
        Boolean bool;
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        if (str != null) {
            EnumC2256q0 enumC2256q0 = EnumC2256q0.STORAGE;
            int i6 = 0;
            while (true) {
                EnumC2257r0[] enumC2257r0Arr = enumC2256q0.f12822o;
                if (i6 >= enumC2257r0Arr.length) {
                    break;
                }
                EnumC2257r0 enumC2257r0 = enumC2257r0Arr[i6];
                int i7 = i6 + 2;
                if (i7 < str.length()) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt != '0') {
                        bool = cCharAt != '1' ? null : Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    enumMap.put(enumC2257r0, bool);
                }
                i6++;
            }
        }
        return new C2259s0(enumMap, i5);
    }

    public static Boolean f(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final C2259s0 d(C2259s0 c2259s0) {
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.STORAGE.f12822o) {
            Boolean boolValueOf = (Boolean) this.f12840a.get(enumC2257r0);
            Boolean bool = (Boolean) c2259s0.f12840a.get(enumC2257r0);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(enumC2257r0, boolValueOf);
        }
        return new C2259s0(enumMap, 100);
    }

    public final boolean e(EnumC2257r0 enumC2257r0) {
        Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        char c5;
        if (!(obj instanceof C2259s0)) {
            return false;
        }
        C2259s0 c2259s0 = (C2259s0) obj;
        EnumC2257r0[] enumC2257r0Arr = EnumC2256q0.STORAGE.f12822o;
        int length = enumC2257r0Arr.length;
        int i5 = 0;
        while (true) {
            char c6 = 1;
            if (i5 >= length) {
                return this.f12841b == c2259s0.f12841b;
            }
            EnumC2257r0 enumC2257r0 = enumC2257r0Arr[i5];
            Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
            if (bool == null) {
                c5 = 0;
            } else {
                c5 = bool.booleanValue() ? (char) 1 : (char) 2;
            }
            Boolean bool2 = (Boolean) c2259s0.f12840a.get(enumC2257r0);
            if (bool2 == null) {
                c6 = 0;
            } else if (!bool2.booleanValue()) {
                c6 = 2;
            }
            if (c5 != c6) {
                return false;
            }
            i5++;
        }
    }

    public final C2259s0 g(C2259s0 c2259s0) {
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.STORAGE.f12822o) {
            Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
            if (bool == null) {
                bool = (Boolean) c2259s0.f12840a.get(enumC2257r0);
            }
            enumMap.put(enumC2257r0, bool);
        }
        return new C2259s0(enumMap, this.f12841b);
    }

    public final boolean h(C2259s0 c2259s0, EnumC2257r0... enumC2257r0Arr) {
        for (EnumC2257r0 enumC2257r0 : enumC2257r0Arr) {
            Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
            Boolean bool2 = (Boolean) c2259s0.f12840a.get(enumC2257r0);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f12841b * 17;
        for (Boolean bool : this.f12840a.values()) {
            i5 = (i5 * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i5;
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.STORAGE.f12822o) {
            Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean j() {
        return e(EnumC2257r0.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.f12841b));
        for (EnumC2257r0 enumC2257r0 : EnumC2256q0.STORAGE.f12822o) {
            sb.append(",");
            sb.append(enumC2257r0.f12829o);
            sb.append("=");
            Boolean bool = (Boolean) this.f12840a.get(enumC2257r0);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        return sb.toString();
    }

    public C2259s0(Boolean bool, Boolean bool2, int i5) {
        EnumMap enumMap = new EnumMap(EnumC2257r0.class);
        this.f12840a = enumMap;
        enumMap.put(EnumC2257r0.AD_STORAGE, bool);
        enumMap.put(EnumC2257r0.ANALYTICS_STORAGE, bool2);
        this.f12841b = i5;
    }
}
