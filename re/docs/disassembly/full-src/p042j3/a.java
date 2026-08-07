package p042j3;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11584b;

    public a(String str, String str2) {
        this.f11583a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f11584b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11583a.equals(aVar.f11583a) && this.f11584b.equals(aVar.f11584b);
    }

    public final int hashCode() {
        return ((this.f11583a.hashCode() ^ 1000003) * 1000003) ^ this.f11584b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f11583a);
        sb.append(", version=");
        return p035i0.a.p(sb, this.f11584b, "}");
    }
}
