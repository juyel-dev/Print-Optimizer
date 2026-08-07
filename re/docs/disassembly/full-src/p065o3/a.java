package p065o3;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p051l3.d;
import p051l3.p;
import p051l3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12167o;

    public /* synthetic */ a(int i5) {
        this.f12167o = i5;
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        switch (this.f12167o) {
            case 0:
                Type type = typeToken.getType();
                boolean z3 = type instanceof GenericArrayType;
                if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(dVar, dVar.c(TypeToken.get(genericComponentType)), p060n3.d.g(genericComponentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                if (typeToken.getRawType() == Object.class) {
                    return new h(dVar);
                }
                return null;
            case 3:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new n(rawType);
            case 4:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new p075r3.a(0);
                }
                return null;
            case 5:
                if (typeToken.getRawType() == Time.class) {
                    return new p075r3.a(1);
                }
                return null;
            default:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                dVar.getClass();
                return new p075r3.a(dVar.c(TypeToken.get(Date.class)));
        }
    }
}
