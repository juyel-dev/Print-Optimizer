package p064o2;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC2212o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2215s f12152r;

    public r(C2215s c2215s) {
        this.f12152r = c2215s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f12152r.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p064o2.AbstractC2212o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2198a.b(this.f12152r.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return s().listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final F k() {
        return s().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12152r.f12154r.size();
    }

    @Override // p064o2.AbstractC2212o
    public final AbstractC2210m t() {
        return new C2214q(this);
    }
}
