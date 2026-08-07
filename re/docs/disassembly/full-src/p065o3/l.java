package p065o3;

import A2.t;
import Q3.a;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p072q3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends j {
    public static final HashMap e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f12197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f12198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12199d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public l(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f12199d = new HashMap();
        a aVar = c.f12317a;
        Constructor constructorA = aVar.A(cls);
        this.f12197b = constructorA;
        c.e(constructorA);
        String[] strArrB = aVar.B(cls);
        for (int i5 = 0; i5 < strArrB.length; i5++) {
            this.f12199d.put(strArrB[i5], Integer.valueOf(i5));
        }
        Class<?>[] parameterTypes = this.f12197b.getParameterTypes();
        this.f12198c = new Object[parameterTypes.length];
        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
            this.f12198c[i6] = e.get(parameterTypes[i6]);
        }
    }

    @Override // p065o3.j
    public final Object c() {
        return (Object[]) this.f12198c.clone();
    }

    @Override // p065o3.j
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f12197b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e3) {
            a aVar = c.f12317a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalArgumentException e5) {
            e = e5;
            throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e6) {
            e = e6;
            throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with args " + Arrays.toString(objArr), e7.getCause());
        }
    }

    @Override // p065o3.j
    public final void e(Object obj, p079s3.a aVar, i iVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f12199d;
        String str = iVar.f12186c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + c.b(this.f12197b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = iVar.f12190i.a(aVar);
        if (objA != null || !iVar.f12193l) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbK = AbstractC1421mz.k("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbK.append(aVar.u(false));
            throw new t(sbK.toString());
        }
    }
}
