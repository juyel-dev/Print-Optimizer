package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class E6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E6 f13911o;
    public static final /* synthetic */ E6[] p;

    static {
        E6 e6 = new E6("PLAIN", 0);
        f13911o = e6;
        E6[] e6Arr = {e6, new E6("PAGE", 1), new E6("OF", 2), new E6("ROMAN_LOWER", 3), new E6("ROMAN_UPPER", 4)};
        p = e6Arr;
        b.m(e6Arr);
    }

    public static E6 valueOf(String str) {
        return (E6) Enum.valueOf(E6.class, str);
    }

    public static E6[] values() {
        return (E6[]) p.clone();
    }
}
