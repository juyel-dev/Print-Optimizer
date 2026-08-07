package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class A3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final A3 f13729o;
    public static final A3 p;
    public static final A3 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ A3[] f13730r;

    static {
        A3 a5 = new A3("LOW", 0);
        f13729o = a5;
        A3 a6 = new A3("MEDIUM", 1);
        p = a6;
        A3 a7 = new A3("HIGH", 2);
        q = a7;
        A3[] a3Arr = {a5, a6, a7};
        f13730r = a3Arr;
        b.m(a3Arr);
    }

    public static A3 valueOf(String str) {
        return (A3) Enum.valueOf(A3.class, str);
    }

    public static A3[] values() {
        return (A3[]) f13730r.clone();
    }
}
