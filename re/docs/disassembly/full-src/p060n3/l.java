package p060n3;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Map.Entry {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f11935o;
    public l p;
    public l q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f11936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f11937s;
    public final Object t;
    public final boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f11938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11939w;

    public l(boolean z3) {
        this.t = null;
        this.u = z3;
        this.f11937s = this;
        this.f11936r = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.t;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f11938v;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11938v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.t;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f11938v;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.u) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f11938v;
        this.f11938v = obj;
        return obj2;
    }

    public final String toString() {
        return this.t + "=" + this.f11938v;
    }

    public l(boolean z3, l lVar, Object obj, l lVar2, l lVar3) {
        this.f11935o = lVar;
        this.t = obj;
        this.u = z3;
        this.f11939w = 1;
        this.f11936r = lVar2;
        this.f11937s = lVar3;
        lVar3.f11936r = this;
        lVar2.f11937s = this;
    }
}
