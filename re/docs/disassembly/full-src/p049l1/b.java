package p049l1;

import p020e1.i;
import p020e1.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f11826c;

    public b(long j5, j jVar, i iVar) {
        this.f11824a = j5;
        this.f11825b = jVar;
        this.f11826c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11824a == bVar.f11824a && this.f11825b.equals(bVar.f11825b) && this.f11826c.equals(bVar.f11826c);
    }

    public final int hashCode() {
        long j5 = this.f11824a;
        return ((((((int) ((j5 >>> 32) ^ j5)) ^ 1000003) * 1000003) ^ this.f11825b.hashCode()) * 1000003) ^ this.f11826c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f11824a + ", transportContext=" + this.f11825b + ", event=" + this.f11826c + "}";
    }
}
