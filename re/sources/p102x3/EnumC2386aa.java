package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2386aa {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2386aa f14793o;
    public static final EnumC2386aa p;
    public static final EnumC2386aa q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC2386aa[] f14794r;

    static {
        EnumC2386aa enumC2386aa = new EnumC2386aa("FOCUS", 0);
        f14793o = enumC2386aa;
        EnumC2386aa enumC2386aa2 = new EnumC2386aa("SHORT_BREAK", 1);
        p = enumC2386aa2;
        EnumC2386aa enumC2386aa3 = new EnumC2386aa("LONG_BREAK", 2);
        q = enumC2386aa3;
        EnumC2386aa[] enumC2386aaArr = {enumC2386aa, enumC2386aa2, enumC2386aa3};
        f14794r = enumC2386aaArr;
        b.m(enumC2386aaArr);
    }

    public static EnumC2386aa valueOf(String str) {
        return (EnumC2386aa) Enum.valueOf(EnumC2386aa.class, str);
    }

    public static EnumC2386aa[] values() {
        return (EnumC2386aa[]) f14794r.clone();
    }
}
