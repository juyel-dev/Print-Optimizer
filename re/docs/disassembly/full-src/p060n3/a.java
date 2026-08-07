package p060n3;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Type f11918o;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f11918o = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f11918o;
    }

    public final int hashCode() {
        return this.f11918o.hashCode();
    }

    public final String toString() {
        return d.i(this.f11918o) + "[]";
    }
}
