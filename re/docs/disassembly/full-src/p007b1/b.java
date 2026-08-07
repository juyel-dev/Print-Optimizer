package p007b1;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2406a;

    public b(Integer num) {
        this.f2406a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f2406a;
        if (num == null) {
            return bVar.f2406a == null;
        }
        return num.equals(bVar.f2406a);
    }

    public final int hashCode() {
        Integer num = this.f2406a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f2406a + "}";
    }
}
