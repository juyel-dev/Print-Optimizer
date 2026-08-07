package p020e1;

import T2.c;
import T2.d;
import W2.a;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f11062a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11063b = new c("startMs", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11064c = new c("endMs", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(2))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        h1.g gVar = (h1.g) obj;
        T2.e eVar = (T2.e) obj2;
        eVar.b(f11063b, gVar.f11438a);
        eVar.b(f11064c, gVar.f11439b);
    }
}
