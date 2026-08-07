package p064o2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC2216t {
    public static final A u;
    public final transient AbstractC2210m t;

    static {
        C2206i c2206i = AbstractC2210m.p;
        u = new A(C2221y.f12160s, C2219w.f12159o);
    }

    public A(AbstractC2210m abstractC2210m, Comparator comparator) {
        super(comparator);
        this.t = abstractC2210m;
    }

    @Override // p064o2.AbstractC2205h
    public final int c(Object[] objArr) {
        return this.t.c(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iY = y(obj, true);
        AbstractC2210m abstractC2210m = this.t;
        if (iY == abstractC2210m.size()) {
            return null;
        }
        return abstractC2210m.get(iY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.t, obj, this.f12156r) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC2218v) {
            collection = ((InterfaceC2218v) collection).a();
        }
        Comparator comparator = this.f12156r;
        if (!AbstractC2198a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C2206i c2206iListIterator = this.t.listIterator(0);
        Iterator it = collection.iterator();
        if (!c2206iListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = c2206iListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c2206iListIterator.hasNext()) {
                        return false;
                    }
                    next2 = c2206iListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.t.o().listIterator(0);
    }

    @Override // p064o2.AbstractC2212o, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        AbstractC2210m abstractC2210m = this.t;
        if (abstractC2210m.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f12156r;
        if (!AbstractC2198a.i(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C2206i c2206iListIterator = abstractC2210m.listIterator(0);
            while (c2206iListIterator.hasNext()) {
                Object next = c2206iListIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p064o2.AbstractC2216t, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.t.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iX = x(obj, true) - 1;
        if (iX == -1) {
            return null;
        }
        return this.t.get(iX);
    }

    @Override // p064o2.AbstractC2205h
    public final int g() {
        return this.t.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iY = y(obj, false);
        AbstractC2210m abstractC2210m = this.t;
        if (iY == abstractC2210m.size()) {
            return null;
        }
        return abstractC2210m.get(iY);
    }

    @Override // p064o2.AbstractC2205h
    public final int i() {
        return this.t.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.t.listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final F k() {
        return this.t.listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final Object[] l() {
        return this.t.l();
    }

    @Override // p064o2.AbstractC2216t, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC2210m abstractC2210m = this.t;
        return abstractC2210m.get(abstractC2210m.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iX = x(obj, false) - 1;
        if (iX == -1) {
            return null;
        }
        return this.t.get(iX);
    }

    @Override // p064o2.AbstractC2212o
    public final AbstractC2210m s() {
        return this.t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t.size();
    }

    public final int x(Object obj, boolean z3) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.t, obj, this.f12156r);
        if (iBinarySearch >= 0) {
            return z3 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int y(Object obj, boolean z3) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.t, obj, this.f12156r);
        if (iBinarySearch >= 0) {
            return z3 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final A z(int i5, int i6) {
        AbstractC2210m abstractC2210m = this.t;
        if (i5 == 0) {
            if (i6 == abstractC2210m.size()) {
                return this;
            }
            i5 = 0;
        }
        Comparator comparator = this.f12156r;
        return i5 < i6 ? new A(abstractC2210m.subList(i5, i6), comparator) : AbstractC2216t.w(comparator);
    }
}
