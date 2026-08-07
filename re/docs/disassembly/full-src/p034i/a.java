package p034i;

import I.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Q3.a {
    public static volatile a p;
    public static final d q = new d(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f11529o = new c();

    public static a f0() {
        if (p != null) {
            return p;
        }
        synchronized (a.class) {
            try {
                if (p == null) {
                    p = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p;
    }
}
