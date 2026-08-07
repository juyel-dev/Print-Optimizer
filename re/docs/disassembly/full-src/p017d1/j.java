package p017d1;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11004a;

    public j(h hVar) {
        this.f11004a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f11018o;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f11004a.equals(((j) qVar).f11004a);
    }

    public final int hashCode() {
        return ((p.f11018o.hashCode() ^ 1000003) * 1000003) ^ this.f11004a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f11018o + ", androidClientInfo=" + this.f11004a + "}";
    }
}
