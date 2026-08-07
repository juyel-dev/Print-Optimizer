package p017d1;

import T2.c;
import T2.d;
import T2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10990a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10991b = c.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10992c = c.a("mobileSubtype");

    @Override // T2.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        n nVar = (n) ((v) obj);
        eVar.c(f10991b, nVar.f11016a);
        eVar.c(f10992c, nVar.f11017b);
    }
}
