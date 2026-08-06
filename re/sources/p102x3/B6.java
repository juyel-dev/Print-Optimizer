package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class B6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B6 f13795o;
    public static final B6 p;
    public static final /* synthetic */ B6[] q;

    static {
        B6 b6 = new B6("RECTANGLE", 0);
        f13795o = b6;
        B6 b7 = new B6("CIRCLE", 1);
        p = b7;
        B6[] b6Arr = {b6, b7};
        q = b6Arr;
        b.m(b6Arr);
    }

    public static B6 valueOf(String str) {
        return (B6) Enum.valueOf(B6.class, str);
    }

    public static B6[] values() {
        return (B6[]) q.clone();
    }
}
