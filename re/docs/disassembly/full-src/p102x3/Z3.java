package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Z3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Z3 f14726o;
    public static final Z3 p;
    public static final Z3 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z3 f14727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Z3 f14728s;
    public static final /* synthetic */ Z3[] t;

    static {
        Z3 z3 = new Z3("NONE", 0);
        f14726o = z3;
        Z3 z4 = new Z3("TOP_LEFT", 1);
        p = z4;
        Z3 z5 = new Z3("TOP_RIGHT", 2);
        q = z5;
        Z3 z6 = new Z3("BOTTOM_LEFT", 3);
        f14727r = z6;
        Z3 z7 = new Z3("BOTTOM_RIGHT", 4);
        f14728s = z7;
        Z3[] z3Arr = {z3, z4, z5, z6, z7};
        t = z3Arr;
        b.m(z3Arr);
    }

    public static Z3 valueOf(String str) {
        return (Z3) Enum.valueOf(Z3.class, str);
    }

    public static Z3[] values() {
        return (Z3[]) t.clone();
    }
}
