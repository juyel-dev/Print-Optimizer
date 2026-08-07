package p082t2;

/* JADX INFO: loaded from: classes2.dex */
public final class F {
    public static final Object g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f12432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12434d;
    public final Object e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f12435f = null;

    public F(String str, Object obj, Object obj2, E e) {
        this.f12431a = str;
        this.f12433c = obj;
        this.f12434d = obj2;
        this.f12432b = e;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2261t0.f12859k == null) {
            return this.f12433c;
        }
        synchronized (g) {
            try {
                if (C.b()) {
                    return this.f12435f == null ? this.f12433c : this.f12435f;
                }
                try {
                    for (F f5 : AbstractC2268x.f12933a) {
                        if (C.b()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            E e = f5.f12432b;
                            if (e != null) {
                                objA = e.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (g) {
                            f5.f12435f = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                E e3 = this.f12432b;
                if (e3 == null) {
                    return this.f12433c;
                }
                try {
                    return e3.a();
                } catch (IllegalStateException unused3) {
                    return this.f12433c;
                } catch (SecurityException unused4) {
                    return this.f12433c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
