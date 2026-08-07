package p060n3;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Number {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11929o;

    public h(String str) {
        this.f11929o = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f11929o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Object obj2 = ((h) obj).f11929o;
        String str = this.f11929o;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f11929o);
    }

    public final int hashCode() {
        return this.f11929o.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f11929o;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f11929o;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f11929o;
    }
}
