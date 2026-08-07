package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2778z3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2778z3 f15797o;
    public static final EnumC2778z3 p;
    public static final /* synthetic */ EnumC2778z3[] q;

    static {
        EnumC2778z3 enumC2778z3 = new EnumC2778z3("LEVEL", 0);
        f15797o = enumC2778z3;
        EnumC2778z3 enumC2778z4 = new EnumC2778z3("TARGET", 1);
        p = enumC2778z4;
        EnumC2778z3[] enumC2778z3Arr = {enumC2778z3, enumC2778z4};
        q = enumC2778z3Arr;
        b.m(enumC2778z3Arr);
    }

    public static EnumC2778z3 valueOf(String str) {
        return (EnumC2778z3) Enum.valueOf(EnumC2778z3.class, str);
    }

    public static EnumC2778z3[] values() {
        return (EnumC2778z3[]) q.clone();
    }
}
