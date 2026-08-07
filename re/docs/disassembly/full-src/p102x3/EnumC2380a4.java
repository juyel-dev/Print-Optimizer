package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2380a4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2380a4 f14770o;
    public static final EnumC2380a4 p;
    public static final /* synthetic */ EnumC2380a4[] q;

    static {
        EnumC2380a4 enumC2380a4 = new EnumC2380a4("INVERT", 0);
        f14770o = enumC2380a4;
        EnumC2380a4 enumC2380a5 = new EnumC2380a4("PAINT_BLACK", 1);
        p = enumC2380a5;
        EnumC2380a4[] enumC2380a4Arr = {enumC2380a4, enumC2380a5};
        q = enumC2380a4Arr;
        b.m(enumC2380a4Arr);
    }

    public static EnumC2380a4 valueOf(String str) {
        return (EnumC2380a4) Enum.valueOf(EnumC2380a4.class, str);
    }

    public static EnumC2380a4[] values() {
        return (EnumC2380a4[]) q.clone();
    }
}
