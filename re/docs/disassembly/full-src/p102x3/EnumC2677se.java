package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2677se {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2677se f15538o;
    public static final EnumC2677se p;
    public static final EnumC2677se q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC2677se[] f15539r;

    static {
        EnumC2677se enumC2677se = new EnumC2677se("EXTRACT", 0);
        f15538o = enumC2677se;
        EnumC2677se enumC2677se2 = new EnumC2677se("ALL", 1);
        p = enumC2677se2;
        EnumC2677se enumC2677se3 = new EnumC2677se("EVERY_N", 2);
        q = enumC2677se3;
        EnumC2677se[] enumC2677seArr = {enumC2677se, enumC2677se2, enumC2677se3};
        f15539r = enumC2677seArr;
        b.m(enumC2677seArr);
    }

    public static EnumC2677se valueOf(String str) {
        return (EnumC2677se) Enum.valueOf(EnumC2677se.class, str);
    }

    public static EnumC2677se[] values() {
        return (EnumC2677se[]) f15539r.clone();
    }
}
