package p038j;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f11556o;
    public final Object p;
    public c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f11557r;

    public c(Object obj, Object obj2) {
        this.f11556o = obj;
        this.p = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11556o.equals(cVar.f11556o) && this.p.equals(cVar.p);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11556o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.p;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11556o.hashCode() ^ this.p.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11556o + "=" + this.p;
    }
}
