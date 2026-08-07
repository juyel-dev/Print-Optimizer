package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2210m extends AbstractC2205h implements List, RandomAccess {
    public static final C2206i p = new C2206i(C2221y.f12160s, 0);

    public static C2221y s(int i5, Object[] objArr) {
        return i5 == 0 ? C2221y.f12160s : new C2221y(objArr, i5);
    }

    public static C2221y t(Object[] objArr) {
        if (objArr.length == 0) {
            return C2221y.f12160s;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (objArr2[i5] == null) {
                throw new NullPointerException(AbstractC1421mz.h(i5, "at index "));
            }
        }
        return s(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p064o2.AbstractC2205h
    public int c(Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i5 = 0; i5 < size; i5++) {
                        if (AbstractC2198a.h(get(i5), list.get(i5))) {
                        }
                    }
                    return true;
                }
                C2206i c2206iListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c2206iListIterator.hasNext()) {
                    if (it.hasNext() && AbstractC2198a.h(c2206iListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i5 = 0; i5 < size; i5++) {
            iHashCode = (iHashCode * 31) + get(i5).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (obj.equals(get(i5))) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // p064o2.AbstractC2205h
    public final F k() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public AbstractC2210m o() {
        return size() <= 1 ? this : new C2208k(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC2210m subList(int i5, int i6) {
        AbstractC2198a.m(i5, i6, size());
        int i7 = i6 - i5;
        if (i7 == size()) {
            return this;
        }
        return i7 == 0 ? C2221y.f12160s : new C2209l(this, i5, i7);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final C2206i listIterator(int i5) {
        int size = size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(AbstractC2198a.n(i5, size, "index"));
        }
        return isEmpty() ? p : new C2206i(this, i5);
    }
}
