package p065o3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p051l3.d;
import p051l3.g;
import p051l3.p;
import p060n3.n;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12168d = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12169a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12171c;

    public b(d dVar, Type type, p pVar, n nVar) {
        this.f12170b = new n(dVar, pVar, type);
        this.f12171c = nVar;
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        switch (this.f12169a) {
            case 0:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.y()) {
                    arrayList.add(((p) ((n) this.f12170b).f12204c).a(aVar));
                }
                aVar.j();
                int size = arrayList.size();
                Class cls = (Class) this.f12171c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i5 = 0; i5 < size; i5++) {
                    Array.set(objNewInstance, i5, arrayList.get(i5));
                }
                return objNewInstance;
            case 1:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                Collection collection = (Collection) ((n) this.f12171c).h();
                aVar.c();
                while (aVar.y()) {
                    collection.add(((p) ((n) this.f12170b).f12204c).a(aVar));
                }
                aVar.j();
                return collection;
            default:
                Object objA = ((o) this.f12170b).q.a(aVar);
                if (objA != null) {
                    Class cls2 = (Class) this.f12171c;
                    if (!cls2.isInstance(objA)) {
                        throw new g("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + aVar.u(true));
                    }
                }
                return objA;
        }
    }

    @Override // p051l3.p
    public final void b(p079s3.b bVar, Object obj) throws IOException {
        switch (this.f12169a) {
            case 0:
                if (obj == null) {
                    bVar.y();
                } else {
                    bVar.g();
                    int length = Array.getLength(obj);
                    for (int i5 = 0; i5 < length; i5++) {
                        ((n) this.f12170b).b(bVar, Array.get(obj, i5));
                    }
                    bVar.j();
                }
                break;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.y();
                } else {
                    bVar.g();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((n) this.f12170b).b(bVar, it.next());
                    }
                    bVar.j();
                }
                break;
            default:
                ((o) this.f12170b).q.b(bVar, obj);
                break;
        }
    }

    public b(d dVar, p pVar, Class cls) {
        this.f12170b = new n(dVar, pVar, cls);
        this.f12171c = cls;
    }

    public b(o oVar, Class cls) {
        this.f12170b = oVar;
        this.f12171c = cls;
    }
}
