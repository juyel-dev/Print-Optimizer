package p047l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2171b implements Set {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2174e f11771o;

    public C2171b(C2174e c2174e) {
        this.f11771o = c2174e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f11771o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11771o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f11771o.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2174e c2174e = this.f11771o;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c2174e.q == set.size() && c2174e.k(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2174e c2174e = this.f11771o;
        int iHashCode = 0;
        for (int i5 = c2174e.q - 1; i5 >= 0; i5--) {
            Object objG = c2174e.g(i5);
            iHashCode += objG == null ? 0 : objG.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f11771o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2170a(this.f11771o, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2174e c2174e = this.f11771o;
        int iE = c2174e.e(obj);
        if (iE < 0) {
            return false;
        }
        c2174e.h(iE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f11771o.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2174e c2174e = this.f11771o;
        int i5 = c2174e.q;
        for (int i6 = i5 - 1; i6 >= 0; i6--) {
            if (!collection.contains(c2174e.g(i6))) {
                c2174e.h(i6);
            }
        }
        return i5 != c2174e.q;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f11771o.q;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2174e c2174e = this.f11771o;
        int i5 = c2174e.q;
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = c2174e.g(i6);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2174e c2174e = this.f11771o;
        int i5 = c2174e.q;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = c2174e.g(i6);
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
