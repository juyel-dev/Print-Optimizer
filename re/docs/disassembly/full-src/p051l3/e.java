package p051l3;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends f implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f11853o = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f11853o.equals(this.f11853o));
    }

    public final int hashCode() {
        return this.f11853o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11853o.iterator();
    }
}
