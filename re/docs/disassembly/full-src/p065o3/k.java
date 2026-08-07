package p065o3;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p051l3.g;
import p060n3.n;
import p072q3.c;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f12196b;

    public k(n nVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f12196b = nVar;
    }

    @Override // p065o3.j
    public final Object c() {
        return this.f12196b.h();
    }

    @Override // p065o3.j
    public final void e(Object obj, a aVar, i iVar) throws IllegalAccessException {
        Object objA = iVar.f12190i.a(aVar);
        if (objA == null && iVar.f12193l) {
            return;
        }
        Field field = iVar.f12185b;
        if (iVar.f12188f) {
            m.b(obj, field);
        } else if (iVar.f12194m) {
            throw new g(androidx.compose.foundation.text.modifiers.a.y("Cannot set value of 'static final' ", c.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // p065o3.j
    public final Object d(Object obj) {
        return obj;
    }
}
