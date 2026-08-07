package p064o2;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: o2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2216t extends AbstractC2212o implements NavigableSet, E {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Comparator f12156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient AbstractC2216t f12157s;

    public AbstractC2216t(Comparator comparator) {
        this.f12156r = comparator;
    }

    public static A w(Comparator comparator) {
        if (C2219w.f12159o.equals(comparator)) {
            return A.u;
        }
        C2206i c2206i = AbstractC2210m.p;
        return new A(C2221y.f12160s, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f12156r;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        A a5 = (A) this;
        return a5.z(0, a5.x(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        A a5 = (A) this;
        return a5.z(a5.y(obj, true), a5.t.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC2216t descendingSet() {
        AbstractC2216t abstractC2216tW = this.f12157s;
        if (abstractC2216tW == null) {
            A a5 = (A) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(a5.f12156r);
            abstractC2216tW = a5.isEmpty() ? w(comparatorReverseOrder) : new A(a5.t.o(), comparatorReverseOrder);
            this.f12157s = abstractC2216tW;
            abstractC2216tW.f12157s = this;
        }
        return abstractC2216tW;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final A subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.f12156r.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        A a5 = (A) this;
        A aZ = a5.z(a5.y(obj, z3), a5.t.size());
        return aZ.z(0, aZ.x(obj2, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        obj.getClass();
        A a5 = (A) this;
        return a5.z(0, a5.x(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        obj.getClass();
        A a5 = (A) this;
        return a5.z(a5.y(obj, z3), a5.t.size());
    }
}
