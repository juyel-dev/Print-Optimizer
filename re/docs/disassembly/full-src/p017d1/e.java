package p017d1;

import T2.c;
import T2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10978a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10979b = c.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10980c = c.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10981d = c.a("eventUptimeMs");
    public static final c e = c.a("sourceExtension");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f10982f = c.a("sourceExtensionJsonProto3");
    public static final c g = c.a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f10983h = c.a("networkConnectionInfo");

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        T2.e eVar = (T2.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.b(f10979b, kVar.f11005a);
        eVar.c(f10980c, kVar.f11006b);
        eVar.b(f10981d, kVar.f11007c);
        eVar.c(e, kVar.f11008d);
        eVar.c(f10982f, kVar.e);
        eVar.b(g, kVar.f11009f);
        eVar.c(f10983h, kVar.g);
    }
}
