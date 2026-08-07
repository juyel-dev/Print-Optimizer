package p017d1;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f11017b;

    public n(u uVar, t tVar) {
        this.f11016a = uVar;
        this.f11017b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f11016a;
        if (uVar != null ? uVar.equals(((n) vVar).f11016a) : ((n) vVar).f11016a == null) {
            t tVar = this.f11017b;
            if (tVar == null) {
                if (((n) vVar).f11017b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f11017b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f11016a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f11017b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11016a + ", mobileSubtype=" + this.f11017b + "}";
    }
}
