package p007b1;

import p037i3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2405b;

    public a(e eVar, b bVar) {
        this.f2404a = eVar;
        this.f2405b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f2404a.equals(aVar.f2404a)) {
            Object obj2 = d.f2408o;
            if (obj2.equals(obj2)) {
                if (this.f2405b.equals(aVar.f2405b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2405b.hashCode() ^ (((((1000003 * 1000003) ^ this.f2404a.hashCode()) * 1000003) ^ d.f2408o.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f2404a + ", priority=" + d.f2408o + ", productData=" + this.f2405b + "}";
    }
}
