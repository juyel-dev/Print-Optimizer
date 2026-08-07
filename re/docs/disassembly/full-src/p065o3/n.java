package p065o3;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import p051l3.c;
import p051l3.d;
import p051l3.p;
import p056m3.b;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12205d;

    public n(Class cls) {
        this.f12202a = 1;
        this.f12203b = new HashMap();
        this.f12204c = new HashMap();
        this.f12205d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new p(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                b bVar = (b) field.getAnnotation(b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((HashMap) this.f12203b).put(str, r4);
                    }
                }
                ((HashMap) this.f12203b).put(strName, r4);
                ((HashMap) this.f12204c).put(string, r4);
                ((HashMap) this.f12205d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        switch (this.f12202a) {
            case 0:
                return ((p) this.f12204c).a(aVar);
            default:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ = aVar.J();
                Enum r1 = (Enum) ((HashMap) this.f12203b).get(strJ);
                return r1 == null ? (Enum) ((HashMap) this.f12204c).get(strJ) : r1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    @Override // p051l3.p
    public final void b(p079s3.b bVar, Object obj) throws IOException {
        switch (this.f12202a) {
            case 0:
                Type type = (Type) this.f12205d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                p pVar = (p) this.f12204c;
                if (type2 != type) {
                    p pVarC = ((d) this.f12203b).c(TypeToken.get(type2));
                    if (pVarC instanceof j) {
                        p pVar2 = pVar;
                        while (pVar2 instanceof c) {
                            p pVar3 = ((c) pVar2).f11844a;
                            if (pVar3 == null) {
                                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                            }
                            if (pVar3 != pVar2) {
                                pVar2 = pVar3;
                            } else if (pVar2 instanceof j) {
                                pVar = pVarC;
                            }
                        }
                        if (pVar2 instanceof j) {
                            pVar = pVarC;
                        }
                    } else {
                        pVar = pVarC;
                    }
                }
                pVar.b(bVar, obj);
                return;
            default:
                Enum r6 = (Enum) obj;
                bVar.E(r6 == null ? null : (String) ((HashMap) this.f12205d).get(r6));
                return;
        }
    }

    public n(d dVar, p pVar, Type type) {
        this.f12202a = 0;
        this.f12203b = dVar;
        this.f12204c = pVar;
        this.f12205d = type;
    }
}
