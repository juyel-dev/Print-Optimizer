package p051l3;

import p079s3.a;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f11844a;

    @Override // p051l3.p
    public final Object a(a aVar) {
        p pVar = this.f11844a;
        if (pVar != null) {
            return pVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) {
        p pVar = this.f11844a;
        if (pVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        pVar.b(bVar, obj);
    }
}
