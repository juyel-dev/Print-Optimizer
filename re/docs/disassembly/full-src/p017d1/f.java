package p017d1;

import T2.c;
import T2.d;
import T2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10984a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10985b = c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10986c = c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10987d = c.a("clientInfo");
    public static final c e = c.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f10988f = c.a("logSourceName");
    public static final c g = c.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f10989h = c.a("qosTier");

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(f10985b, lVar.f11010a);
        eVar.b(f10986c, lVar.f11011b);
        eVar.c(f10987d, lVar.f11012c);
        eVar.c(e, lVar.f11013d);
        eVar.c(f10988f, lVar.e);
        eVar.c(g, lVar.f11014f);
        eVar.c(f10989h, w.f11021o);
    }
}
