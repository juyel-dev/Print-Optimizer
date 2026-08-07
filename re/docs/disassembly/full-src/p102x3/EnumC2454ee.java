package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x3.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC2454ee {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2454ee f14979o;
    public static final EnumC2454ee p;
    public static final EnumC2454ee q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC2454ee f14980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC2454ee[] f14981s;

    static {
        EnumC2454ee enumC2454ee = new EnumC2454ee("NONE", 0);
        f14979o = enumC2454ee;
        EnumC2454ee enumC2454ee2 = new EnumC2454ee("CREATING", 1);
        p = enumC2454ee2;
        EnumC2454ee enumC2454ee3 = new EnumC2454ee("MOVING", 2);
        q = enumC2454ee3;
        EnumC2454ee enumC2454ee4 = new EnumC2454ee("RESIZING", 3);
        f14980r = enumC2454ee4;
        EnumC2454ee[] enumC2454eeArr = {enumC2454ee, enumC2454ee2, enumC2454ee3, enumC2454ee4};
        f14981s = enumC2454eeArr;
        b.m(enumC2454eeArr);
    }

    public static EnumC2454ee valueOf(String str) {
        return (EnumC2454ee) Enum.valueOf(EnumC2454ee.class, str);
    }

    public static EnumC2454ee[] values() {
        return (EnumC2454ee[]) f14981s.clone();
    }
}
