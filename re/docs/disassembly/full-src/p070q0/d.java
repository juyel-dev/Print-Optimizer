package p070q0;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12310c;

    public d(String str, List list, boolean z3) {
        this.f12308a = str;
        this.f12309b = z3;
        this.f12310c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f12309b != dVar.f12309b || !this.f12310c.equals(dVar.f12310c)) {
            return false;
        }
        String str = this.f12308a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = dVar.f12308a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f12308a;
        return this.f12310c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f12309b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f12308a + "', unique=" + this.f12309b + ", columns=" + this.f12310c + '}';
    }
}
