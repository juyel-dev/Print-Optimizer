package p064o2;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: o2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2204g extends AbstractC2220x implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Comparator f12134o;

    public C2204g(Comparator comparator) {
        comparator.getClass();
        this.f12134o = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f12134o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2204g) {
            return this.f12134o.equals(((C2204g) obj).f12134o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12134o.hashCode();
    }

    public final String toString() {
        return this.f12134o.toString();
    }
}
