package p027g1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements A3.a {
    public static final Object q = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile b f11171o;
    public volatile Object p;

    public static A3.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.p = q;
        aVar.f11171o = bVar;
        return aVar;
    }

    @Override // A3.a
    public final Object get() {
        Object obj = this.p;
        Object obj2 = q;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.p;
                    if (obj == obj2) {
                        obj = this.f11171o.get();
                        Object obj3 = this.p;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.p = obj;
                        this.f11171o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
