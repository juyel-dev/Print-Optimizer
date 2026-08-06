package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2422ce {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2422ce f14895o;
    public static final EnumC2422ce p;
    public static final EnumC2422ce q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC2422ce[] f14896r;

    static {
        EnumC2422ce enumC2422ce = new EnumC2422ce("BOTH", 0);
        f14895o = enumC2422ce;
        EnumC2422ce enumC2422ce2 = new EnumC2422ce("WIDTH", 1);
        p = enumC2422ce2;
        EnumC2422ce enumC2422ce3 = new EnumC2422ce("HEIGHT", 2);
        q = enumC2422ce3;
        EnumC2422ce[] enumC2422ceArr = {enumC2422ce, enumC2422ce2, enumC2422ce3};
        f14896r = enumC2422ceArr;
        b.m(enumC2422ceArr);
    }

    public static EnumC2422ce valueOf(String str) {
        return (EnumC2422ce) Enum.valueOf(EnumC2422ce.class, str);
    }

    public static EnumC2422ce[] values() {
        return (EnumC2422ce[]) f14896r.clone();
    }
}
