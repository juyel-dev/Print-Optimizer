package p065o3;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p046k2.h;
import p051l3.d;
import p051l3.g;
import p051l3.p;
import p060n3.n;
import p076s.b;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f12175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f12176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f12177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f12178d;

    public e(c cVar, d dVar, Type type, p pVar, Type type2, p pVar2, n nVar) {
        this.f12178d = cVar;
        this.f12175a = new n(dVar, pVar, type);
        this.f12176b = new n(dVar, pVar2, type2);
        this.f12177c = nVar;
    }

    @Override // p051l3.p
    public final Object a(a aVar) throws IOException {
        int iL = aVar.L();
        if (iL == 9) {
            aVar.H();
            return null;
        }
        Map map = (Map) this.f12177c.h();
        n nVar = this.f12176b;
        n nVar2 = this.f12175a;
        p pVar = (p) nVar.f12204c;
        p pVar2 = (p) nVar2.f12204c;
        if (iL == 1) {
            aVar.c();
            while (aVar.y()) {
                aVar.c();
                Object objA = pVar2.a(aVar);
                if (map.put(objA, pVar.a(aVar)) != null) {
                    throw new g("duplicate key: " + objA);
                }
                aVar.j();
            }
            aVar.j();
        } else {
            aVar.g();
            while (aVar.y()) {
                h.p.getClass();
                int i5 = aVar.f12355v;
                if (i5 == 0) {
                    i5 = aVar.i();
                }
                if (i5 == 13) {
                    aVar.f12355v = 9;
                } else if (i5 == 12) {
                    aVar.f12355v = 8;
                } else {
                    if (i5 != 14) {
                        throw new IllegalStateException("Expected a name but was " + b.D(aVar.L()) + aVar.A());
                    }
                    aVar.f12355v = 10;
                }
                Object objA2 = pVar2.a(aVar);
                if (map.put(objA2, pVar.a(aVar)) != null) {
                    throw new g("duplicate key: " + objA2);
                }
            }
            aVar.n();
        }
        return map;
    }

    @Override // p051l3.p
    public final void b(p079s3.b bVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bVar.y();
            return;
        }
        this.f12178d.getClass();
        n nVar = this.f12176b;
        bVar.h();
        for (Map.Entry entry : map.entrySet()) {
            bVar.p(String.valueOf(entry.getKey()));
            nVar.b(bVar, entry.getValue());
        }
        bVar.n();
    }
}
