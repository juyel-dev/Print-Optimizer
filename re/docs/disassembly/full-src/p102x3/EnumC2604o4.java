package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2604o4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2604o4 f15367o;
    public static final EnumC2604o4 p;
    public static final /* synthetic */ EnumC2604o4[] q;

    static {
        EnumC2604o4 enumC2604o4 = new EnumC2604o4("RECTANGLE", 0);
        f15367o = enumC2604o4;
        EnumC2604o4 enumC2604o5 = new EnumC2604o4("CIRCLE", 1);
        p = enumC2604o5;
        EnumC2604o4[] enumC2604o4Arr = {enumC2604o4, enumC2604o5};
        q = enumC2604o4Arr;
        b.m(enumC2604o4Arr);
    }

    public static EnumC2604o4 valueOf(String str) {
        return (EnumC2604o4) Enum.valueOf(EnumC2604o4.class, str);
    }

    public static EnumC2604o4[] values() {
        return (EnumC2604o4[]) q.clone();
    }
}
