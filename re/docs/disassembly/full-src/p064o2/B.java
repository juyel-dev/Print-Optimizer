package p064o2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC2220x implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B f12092o = new B();

    @Override // p064o2.AbstractC2220x
    public final AbstractC2220x a() {
        return C2219w.f12159o;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
