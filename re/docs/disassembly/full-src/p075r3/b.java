package p075r3;

import p065o3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f12337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12340d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f12337a = z3;
        if (z3) {
            f12338b = a.f12333c;
            f12339c = a.f12334d;
            f12340d = a.e;
        } else {
            f12338b = null;
            f12339c = null;
            f12340d = null;
        }
    }
}
