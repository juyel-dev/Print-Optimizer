package p072q3;

import Q3.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p051l3.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12317a;

    static {
        a aVar;
        try {
            aVar = new b();
        } catch (NoSuchMethodException unused) {
            aVar = new a();
        }
        f12317a = aVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i5].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z3) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z3 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new g(androidx.compose.foundation.text.modifiers.a.z("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }
}
