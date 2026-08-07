package p099x0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2174e f13667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2174e f13668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2174e f13669c;

    public a(C2174e c2174e, C2174e c2174e2, C2174e c2174e3) {
        this.f13667a = c2174e;
        this.f13668b = c2174e2;
        this.f13669c = c2174e3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2174e c2174e = this.f13669c;
        Class cls2 = (Class) c2174e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2174e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C2174e c2174e = this.f13667a;
        Method method = (Method) c2174e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c2174e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C2174e c2174e = this.f13668b;
        Method method = (Method) c2174e.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        c2174e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i5);

    public final Parcelable f(Parcelable parcelable, int i5) {
        if (!e(i5)) {
            return parcelable;
        }
        return ((b) this).e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String string = ((b) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    public abstract void h(int i5);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).e.writeString(null);
            return;
        }
        try {
            ((b) this).e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                int i5 = bVarA.f13673i;
                if (i5 >= 0) {
                    int i6 = bVarA.f13670d.get(i5);
                    Parcel parcel = bVarA.e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i6);
                    parcel.writeInt(iDataPosition - i6);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
                throw ((RuntimeException) e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
