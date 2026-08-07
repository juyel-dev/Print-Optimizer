package p060n3;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type f11920o;
    public final Type p;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.p = null;
            this.f11920o = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.p = d.a(typeArr2[0]);
        this.f11920o = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.p;
        return type != null ? new Type[]{type} : d.f11921a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f11920o};
    }

    public final int hashCode() {
        Type type = this.p;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f11920o.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.p;
        if (type != null) {
            return "? super " + d.i(type);
        }
        Type type2 = this.f11920o;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.i(type2);
    }
}
