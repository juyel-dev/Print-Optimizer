package p033h3;

import T2.c;
import T2.d;
import W2.a;
import W2.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2159a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2159a f11449a = new C2159a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11450b = new c("projectNumber", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11451c = new c("messageId", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f11452d = new c("instanceId", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(3))));
    public static final c e = new c("messageType", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f11453f = new c("sdkPlatform", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(5))));
    public static final c g = new c("packageName", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f11454h = new c("collapseKey", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f11455i = new c("priority", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(8))));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f11456j = new c("ttl", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f11457k = new c("topic", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f11458l = new c("bulkId", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f11459m = new c("event", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f11460n = new c("analyticsLabel", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f11461o = new c("campaignId", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(14))));
    public static final c p = new c("composerLabel", AbstractC1421mz.n(AbstractC1421mz.l(e.class, new a(15))));

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        p037i3.d dVar = (p037i3.d) obj;
        T2.e eVar = (T2.e) obj2;
        eVar.b(f11450b, dVar.f11545a);
        eVar.c(f11451c, dVar.f11546b);
        eVar.c(f11452d, dVar.f11547c);
        eVar.c(e, dVar.f11548d);
        eVar.c(f11453f, p037i3.c.ANDROID);
        eVar.c(g, dVar.e);
        eVar.c(f11454h, dVar.f11549f);
        eVar.a(f11455i, 0);
        eVar.a(f11456j, dVar.g);
        eVar.c(f11457k, dVar.f11550h);
        eVar.b(f11458l, 0L);
        eVar.c(f11459m, p037i3.a.MESSAGE_DELIVERED);
        eVar.c(f11460n, dVar.f11551i);
        eVar.b(f11461o, 0L);
        eVar.c(p, dVar.f11552j);
    }
}
