package p064o2;

import java.io.Serializable;

/* JADX INFO: renamed from: o2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2219w extends AbstractC2220x implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2219w f12159o = new C2219w();

    @Override // p064o2.AbstractC2220x
    public final AbstractC2220x a() {
        return B.f12092o;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
