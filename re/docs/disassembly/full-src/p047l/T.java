package p047l;

import P3.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p111z2.b;

/* JADX INFO: loaded from: classes.dex */
public class T implements Set, a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11753o;
    public final /* synthetic */ Object p;

    public /* synthetic */ T(Object obj, int i5) {
        this.f11753o = i5;
        this.p = obj;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11753o) {
            case 0:
                return ((J) this.p).b(obj);
            default:
                return ((W) this.p).a(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f11753o) {
            case 0:
                o.f(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((J) this.p).b(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                o.f(elements, "elements");
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((W) this.p).a(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f11753o) {
            case 0:
                return ((J) this.p).g();
            default:
                return ((W) this.p).b();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.f11753o) {
            case 0:
                return b.q(new S((J) this.p, null));
            default:
                return b.q(new V((W) this.p, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f11753o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f11753o) {
            case 0:
                return ((J) this.p).e;
            default:
                return ((W) this.p).f11764d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f11753o) {
            case 0:
                break;
        }
        return n.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f11753o) {
            case 0:
                o.f(array, "array");
                break;
            default:
                o.f(array, "array");
                break;
        }
        return n.b(this, array);
    }
}
