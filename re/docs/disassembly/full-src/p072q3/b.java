package p072q3;

import Q3.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f12315o = Class.class.getMethod("isRecord", null);
    public final Method p;
    public final Method q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f12316r;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.p = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.q = componentType.getMethod("getName", null);
        this.f12316r = componentType.getMethod("getType", null);
    }

    @Override // Q3.a
    public final Constructor A(Class cls) {
        try {
            Object[] objArr = (Object[]) this.p.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                clsArr[i5] = (Class) this.f12316r.invoke(objArr[i5], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // Q3.a
    public final String[] B(Class cls) {
        try {
            Object[] objArr = (Object[]) this.p.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                strArr[i5] = (String) this.q.invoke(objArr[i5], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // Q3.a
    public final boolean E(Class cls) {
        try {
            return ((Boolean) this.f12315o.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // Q3.a
    public final Method z(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
