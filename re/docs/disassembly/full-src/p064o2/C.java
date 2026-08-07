package p064o2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC2220x implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC2220x f12093o;

    public C(AbstractC2220x abstractC2220x) {
        this.f12093o = abstractC2220x;
    }

    @Override // p064o2.AbstractC2220x
    public final AbstractC2220x a() {
        return this.f12093o;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f12093o.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            return this.f12093o.equals(((C) obj).f12093o);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f12093o.hashCode();
    }

    public final String toString() {
        return this.f12093o.toString().concat(".reverse()");
    }
}
