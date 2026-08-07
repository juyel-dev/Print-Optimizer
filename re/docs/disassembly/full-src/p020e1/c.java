package p020e1;

import T2.d;
import W2.a;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11052a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T2.c f11053b = new T2.c("eventsDroppedCount", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T2.c f11054c = new T2.c("reason", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(3))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        h1.d dVar = (h1.d) obj;
        T2.e eVar = (T2.e) obj2;
        eVar.b(f11053b, dVar.f11431a);
        eVar.c(f11054c, dVar.f11432b);
    }
}
