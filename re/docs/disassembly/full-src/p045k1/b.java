package p045k1;

import java.util.HashMap;
import p007b1.d;
import p046k2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11614b;

    public b(h hVar, HashMap map) {
        this.f11613a = hVar;
        this.f11614b = map;
    }

    public final long a(d dVar, long j5, int i5) {
        long jQ = j5 - this.f11613a.q();
        c cVar = (c) this.f11614b.get(dVar);
        long j6 = cVar.f11615a;
        int i6 = i5 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i6) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * ((long) i6)))), jQ), cVar.f11616b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11613a.equals(bVar.f11613a) && this.f11614b.equals(bVar.f11614b);
    }

    public final int hashCode() {
        return ((this.f11613a.hashCode() ^ 1000003) * 1000003) ^ this.f11614b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f11613a + ", values=" + this.f11614b + "}";
    }
}
