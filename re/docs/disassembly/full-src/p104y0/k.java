package p104y0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15858a;

    public k(f fVar) {
        this.f15858a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f15858a.equals(((k) obj).f15858a);
    }

    public final int hashCode() {
        return this.f15858a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f15858a + '}';
    }
}
