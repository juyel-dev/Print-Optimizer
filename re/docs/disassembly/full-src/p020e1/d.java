package p020e1;

import T2.c;
import W2.a;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements T2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11055a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11056b = new c("logSource", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11057c = new c("logEventDropped", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(2))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        h1.e eVar = (h1.e) obj;
        T2.e eVar2 = (T2.e) obj2;
        eVar2.c(f11056b, eVar.f11434a);
        eVar2.c(f11057c, eVar.f11435b);
    }
}
