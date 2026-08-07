package p020e1;

import T2.c;
import T2.d;
import W2.a;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11059a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11060b = new c("currentCacheSizeBytes", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11061c = new c("maxCacheSizeBytes", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(2))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        h1.f fVar = (h1.f) obj;
        T2.e eVar = (T2.e) obj2;
        eVar.b(f11060b, fVar.f11436a);
        eVar.b(f11061c, fVar.f11437b);
    }
}
