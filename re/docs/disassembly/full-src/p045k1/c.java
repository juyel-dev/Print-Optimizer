package p045k1;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11617c;

    public c(long j5, long j6, Set set) {
        this.f11615a = j5;
        this.f11616b = j6;
        this.f11617c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11615a == cVar.f11615a && this.f11616b == cVar.f11616b && this.f11617c.equals(cVar.f11617c);
    }

    public final int hashCode() {
        long j5 = this.f11615a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f11616b;
        return ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f11617c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f11615a + ", maxAllowedDelay=" + this.f11616b + ", flags=" + this.f11617c + "}";
    }
}
