package p047l;

import C3.r;
import C3.u;
import P3.b;
import P3.f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: renamed from: l.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2175f implements Collection, Set, b, f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f11777o = a.f11870a;
    public Object[] p = a.f11872c;
    public int q;

    public C2175f(int i5) {
        if (i5 > 0) {
            AbstractC2190v.a(this, i5);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int iC;
        int i6 = this.q;
        if (obj == null) {
            iC = AbstractC2190v.c(this, null, 0);
            i5 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i5 = iHashCode;
            iC = AbstractC2190v.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i7 = ~iC;
        int[] iArr = this.f11777o;
        if (i6 >= iArr.length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.p;
            AbstractC2190v.a(this, i8);
            if (i6 != this.q) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f11777o;
            if (iArr2.length != 0) {
                r.F(0, iArr.length, 6, iArr, iArr2);
                r.H(objArr, this.p, 0, 0, objArr.length, 6);
            }
        }
        if (i7 < i6) {
            int[] iArr3 = this.f11777o;
            int i9 = i7 + 1;
            r.B(i9, i7, i6, iArr3, iArr3);
            Object[] objArr2 = this.p;
            r.E(objArr2, objArr2, i9, i7, i6);
        }
        int i10 = this.q;
        if (i6 == i10) {
            int[] iArr4 = this.f11777o;
            if (i7 < iArr4.length) {
                iArr4[i7] = i5;
                this.p[i7] = obj;
                this.q = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        o.f(elements, "elements");
        int size = elements.size() + this.q;
        int i5 = this.q;
        int[] iArr = this.f11777o;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.p;
            AbstractC2190v.a(this, size);
            int i6 = this.q;
            if (i6 > 0) {
                r.F(0, i6, 6, iArr, this.f11777o);
                r.H(objArr, this.p, 0, 0, this.q, 6);
            }
        }
        if (this.q != i5) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.q != 0) {
            this.f11777o = a.f11870a;
            this.p = a.f11872c;
            this.q = 0;
        }
        if (this.q != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2190v.c(this, null, 0) : AbstractC2190v.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        o.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.q == ((Set) obj).size()) {
            try {
                int i5 = this.q;
                for (int i6 = 0; i6 < i5; i6++) {
                    if (((Set) obj).contains(this.p[i6])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final Object g(int i5) {
        int i6 = this.q;
        Object[] objArr = this.p;
        Object obj = objArr[i5];
        if (i6 <= 1) {
            clear();
        } else {
            int i7 = i6 - 1;
            int[] iArr = this.f11777o;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i5 < i7) {
                    int i8 = i5 + 1;
                    r.B(i5, i8, i6, iArr, iArr);
                    Object[] objArr2 = this.p;
                    r.E(objArr2, objArr2, i5, i8, i6);
                }
                this.p[i7] = null;
            } else {
                AbstractC2190v.a(this, i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i5 > 0) {
                    r.F(0, i5, 6, iArr, this.f11777o);
                    r.H(objArr, this.p, 0, 0, i5, 6);
                }
                if (i5 < i7) {
                    int i9 = i5 + 1;
                    r.B(i5, i9, i6, iArr, this.f11777o);
                    r.E(objArr, this.p, i5, i9, i6);
                }
            }
            if (i6 != this.q) {
                throw new ConcurrentModificationException();
            }
            this.q = i7;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f11777o;
        int i5 = this.q;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2170a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC2190v.c(this, null, 0) : AbstractC2190v.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        g(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        o.f(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        o.f(elements, "elements");
        boolean z3 = false;
        for (int i5 = this.q - 1; -1 < i5; i5--) {
            if (!u.m0(elements, this.p[i5])) {
                g(i5);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.q;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return r.J(this.p, 0, this.q);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.q * 14);
        sb.append('{');
        int i5 = this.q;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = this.p[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        o.f(array, "array");
        int i5 = this.q;
        if (array.length < i5) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i5);
        } else if (array.length > i5) {
            array[i5] = null;
        }
        r.E(this.p, array, 0, 0, this.q);
        return array;
    }
}
