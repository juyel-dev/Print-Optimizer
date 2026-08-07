package p051l3;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import p060n3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Serializable f11856o;

    public j(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f11856o = bool;
    }

    public static boolean i(j jVar) {
        Serializable serializable = jVar.f11856o;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number c() {
        Serializable serializable = this.f11856o;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        Serializable serializable = this.f11856o;
        Serializable serializable2 = jVar.f11856o;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (i(this) && i(jVar)) {
            return c().longValue() == jVar.c().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = c().doubleValue();
        double dDoubleValue2 = jVar.c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final String g() {
        Serializable serializable = this.f11856o;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f11856o;
        if (serializable == null) {
            return 31;
        }
        if (i(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public j(Number number) {
        Objects.requireNonNull(number);
        this.f11856o = number;
    }

    public j(String str) {
        Objects.requireNonNull(str);
        this.f11856o = str;
    }
}
