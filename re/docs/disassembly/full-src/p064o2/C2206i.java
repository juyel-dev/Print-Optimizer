package p064o2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2206i extends F implements ListIterator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12136o;
    public int p;
    public final AbstractC2210m q;

    public C2206i(AbstractC2210m abstractC2210m, int i5) {
        int size = abstractC2210m.size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(AbstractC2198a.n(i5, size, "index"));
        }
        this.f12136o = size;
        this.p = i5;
        this.q = abstractC2210m;
    }

    public final Object a(int i5) {
        return this.q.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.p < this.f12136o;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.p > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.p;
        this.p = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.p - 1;
        this.p = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
