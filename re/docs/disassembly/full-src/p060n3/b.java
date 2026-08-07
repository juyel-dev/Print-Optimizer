package p060n3;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type f11919o;
    public final Type p;
    public final Type[] q;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z3 = true;
            boolean z4 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z4) {
                z3 = false;
            }
            d.b(z3);
        }
        this.f11919o = type == null ? null : d.a(type);
        this.p = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.q = typeArr2;
        int length = typeArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            Objects.requireNonNull(this.q[i5]);
            d.c(this.q[i5]);
            Type[] typeArr3 = this.q;
            typeArr3[i5] = d.a(typeArr3[i5]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.q.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f11919o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.p;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.q) ^ this.p.hashCode();
        Type type = this.f11919o;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.q;
        int length = typeArr.length;
        Type type = this.p;
        if (length == 0) {
            return d.i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.i(type));
        sb.append("<");
        sb.append(d.i(typeArr[0]));
        for (int i5 = 1; i5 < length; i5++) {
            sb.append(", ");
            sb.append(d.i(typeArr[i5]));
        }
        sb.append(">");
        return sb.toString();
    }
}
