package p065o3;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p051l3.g;
import p051l3.p;
import p072q3.c;
import p079s3.a;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12195a;

    public j(LinkedHashMap linkedHashMap) {
        this.f12195a = linkedHashMap;
    }

    @Override // p051l3.p
    public final Object a(a aVar) throws IOException {
        if (aVar.L() == 9) {
            aVar.H();
            return null;
        }
        Object objC = c();
        try {
            aVar.g();
            while (aVar.y()) {
                i iVar = (i) this.f12195a.get(aVar.F());
                if (iVar == null || !iVar.e) {
                    aVar.R();
                } else {
                    e(objC, aVar, iVar);
                }
            }
            aVar.n();
            return d(objC);
        } catch (IllegalAccessException e) {
            Q3.a aVar2 = c.f12317a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e3) {
            throw new g(e3);
        }
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.y();
            return;
        }
        bVar.h();
        try {
            Iterator it = this.f12195a.values().iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(bVar, obj);
            }
            bVar.n();
        } catch (IllegalAccessException e) {
            Q3.a aVar = c.f12317a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, a aVar, i iVar);
}
