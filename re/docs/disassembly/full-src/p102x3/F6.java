package p102x3;

import K2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class F6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F6 f13949o;
    public static final F6 p;
    public static final F6 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F6 f13950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F6 f13951s;
    public static final F6 t;
    public static final /* synthetic */ F6[] u;

    static {
        F6 f6 = new F6("TL", 0);
        f13949o = f6;
        F6 f7 = new F6("TC", 1);
        p = f7;
        F6 f8 = new F6("TR", 2);
        q = f8;
        F6 f9 = new F6("BL", 3);
        f13950r = f9;
        F6 f10 = new F6("BC", 4);
        f13951s = f10;
        F6 f11 = new F6("BR", 5);
        t = f11;
        F6[] f6Arr = {f6, f7, f8, f9, f10, f11};
        u = f6Arr;
        b.m(f6Arr);
    }

    public static F6 valueOf(String str) {
        return (F6) Enum.valueOf(F6.class, str);
    }

    public static F6[] values() {
        return (F6[]) u.clone();
    }
}
