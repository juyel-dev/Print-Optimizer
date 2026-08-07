package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2614oe {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2614oe f15388o;
    public static final EnumC2614oe p;
    public static final /* synthetic */ EnumC2614oe[] q;

    static {
        EnumC2614oe enumC2614oe = new EnumC2614oe("KB", 0);
        f15388o = enumC2614oe;
        EnumC2614oe enumC2614oe2 = new EnumC2614oe("MB", 1);
        p = enumC2614oe2;
        EnumC2614oe[] enumC2614oeArr = {enumC2614oe, enumC2614oe2};
        q = enumC2614oeArr;
        b.m(enumC2614oeArr);
    }

    public static EnumC2614oe valueOf(String str) {
        return (EnumC2614oe) Enum.valueOf(EnumC2614oe.class, str);
    }

    public static EnumC2614oe[] values() {
        return (EnumC2614oe[]) q.clone();
    }
}
