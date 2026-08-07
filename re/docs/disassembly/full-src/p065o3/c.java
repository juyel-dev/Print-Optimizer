package p065o3;

import com.google.android.gms.internal.measurement.C2117x;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p051l3.b;
import p051l3.d;
import p051l3.p;
import p051l3.q;
import p056m3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12172o;
    public final C2117x p;

    public /* synthetic */ c(C2117x c2117x, int i5) {
        this.f12172o = i5;
        this.p = c2117x;
    }

    public static p b(C2117x c2117x, d dVar, TypeToken typeToken, a aVar) {
        p pVarA;
        Object objH = c2117x.f(TypeToken.get(aVar.value())).h();
        boolean zNullSafe = aVar.nullSafe();
        if (objH instanceof p) {
            pVarA = (p) objH;
        } else {
            if (!(objH instanceof q)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objH.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            pVarA = ((q) objH).a(dVar, typeToken);
        }
        return (pVarA == null || !zNullSafe) ? pVarA : new b(pVarA, 2);
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = Object.class;
        C2117x c2117x = this.p;
        switch (this.f12172o) {
            case 0:
                Type type2 = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                p060n3.d.b(Collection.class.isAssignableFrom(rawType));
                Type typeH = p060n3.d.h(type2, rawType, p060n3.d.f(type2, rawType, Collection.class), new HashMap());
                type = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new b(dVar, type, dVar.c(TypeToken.get(type)), c2117x.f(typeToken));
            case 1:
                a aVar = (a) typeToken.getRawType().getAnnotation(a.class);
                if (aVar == null) {
                    return null;
                }
                return b(c2117x, dVar, typeToken, aVar);
            default:
                Type type3 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    p060n3.d.b(Map.class.isAssignableFrom(rawType2));
                    Type typeH2 = p060n3.d.h(type3, rawType2, p060n3.d.f(type3, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                return new e(this, dVar, actualTypeArguments[0], (type4 == Boolean.TYPE || type4 == Boolean.class) ? q.f12211c : dVar.c(TypeToken.get(type4)), actualTypeArguments[1], dVar.c(TypeToken.get(actualTypeArguments[1])), c2117x.f(typeToken));
        }
    }
}
