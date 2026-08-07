package p020e1;

import T2.c;
import T2.d;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11046a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11047b = new c("window", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new W2.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11048c = new c("logSourceMetrics", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new W2.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f11049d = new c("globalMetrics", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new W2.a(3))));
    public static final c e = new c("appNamespace", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new W2.a(4))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        h1.a aVar = (h1.a) obj;
        T2.e eVar = (T2.e) obj2;
        eVar.c(f11047b, aVar.f11421a);
        eVar.c(f11048c, aVar.f11422b);
        eVar.c(f11049d, aVar.f11423c);
        eVar.c(e, aVar.f11424d);
    }
}
