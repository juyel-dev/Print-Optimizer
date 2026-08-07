package p104y0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15857a = f.f15851c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f15857a.equals(((i) obj).f15857a);
    }

    public final int hashCode() {
        return this.f15857a.hashCode() + (i.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f15857a + '}';
    }
}
