package p047l;

import C3.r;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public class Y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f11766o;
    public Object[] p;
    public int q;

    public Y(int i5) {
        this.f11766o = i5 == 0 ? a.f11870a : new int[i5];
        this.p = i5 == 0 ? a.f11872c : new Object[i5 << 1];
    }

    public final int a(Object obj) {
        int i5 = this.q * 2;
        Object[] objArr = this.p;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i5) {
        int i6 = this.q;
        int[] iArr = this.f11766o;
        if (iArr.length < i5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            o.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11766o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.p, i5 * 2);
            o.e(objArrCopyOf, "copyOf(this, newSize)");
            this.p = objArrCopyOf;
        }
        if (this.q != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.q > 0) {
            this.f11766o = a.f11870a;
            this.p = a.f11872c;
            this.q = 0;
        }
        if (this.q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj, int i5) {
        int i6 = this.q;
        if (i6 == 0) {
            return -1;
        }
        int iA = a.a(this.f11766o, i6, i5);
        if (iA < 0 || o.b(obj, this.p[iA << 1])) {
            return iA;
        }
        int i7 = iA + 1;
        while (i7 < i6 && this.f11766o[i7] == i5) {
            if (o.b(obj, this.p[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iA - 1; i8 >= 0 && this.f11766o[i8] == i5; i8--) {
            if (o.b(obj, this.p[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Y) {
                int i5 = this.q;
                if (i5 != ((Y) obj).q) {
                    return false;
                }
                Y y4 = (Y) obj;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object objG = g(i6);
                    Object objJ = j(i6);
                    Object obj2 = y4.get(objG);
                    if (objJ == null) {
                        if (obj2 != null || !y4.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.q != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.q;
            for (int i8 = 0; i8 < i7; i8++) {
                Object objG2 = g(i8);
                Object objJ2 = j(i8);
                Object obj3 = ((Map) obj).get(objG2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i5 = this.q;
        if (i5 == 0) {
            return -1;
        }
        int iA = a.a(this.f11766o, i5, 0);
        if (iA < 0 || this.p[iA << 1] == null) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f11766o[i6] == 0) {
            if (this.p[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f11766o[i7] == 0; i7--) {
            if (this.p[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public final Object g(int i5) {
        boolean z3 = false;
        if (i5 >= 0 && i5 < this.q) {
            z3 = true;
        }
        if (z3) {
            return this.p[i5 << 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.p[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.p[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i5) {
        if (!(i5 >= 0 && i5 < this.q)) {
            a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        Object[] objArr = this.p;
        int i6 = i5 << 1;
        Object obj = objArr[i6 + 1];
        int i7 = this.q;
        if (i7 <= 1) {
            clear();
        } else {
            int i8 = i7 - 1;
            int[] iArr = this.f11766o;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i5 < i8) {
                    int i9 = i5 + 1;
                    r.B(i5, i9, i7, iArr, iArr);
                    Object[] objArr2 = this.p;
                    r.E(objArr2, objArr2, i6, i9 << 1, i7 << 1);
                }
                Object[] objArr3 = this.p;
                int i10 = i8 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                int i11 = i7 > 8 ? i7 + (i7 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
                o.e(iArrCopyOf, "copyOf(this, newSize)");
                this.f11766o = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.p, i11 << 1);
                o.e(objArrCopyOf, "copyOf(this, newSize)");
                this.p = objArrCopyOf;
                if (i7 != this.q) {
                    throw new ConcurrentModificationException();
                }
                if (i5 > 0) {
                    r.B(0, 0, i5, iArr, this.f11766o);
                    r.E(objArr, this.p, 0, 0, i6);
                }
                if (i5 < i8) {
                    int i12 = i5 + 1;
                    r.B(i5, i12, i7, iArr, this.f11766o);
                    r.E(objArr, this.p, i6, i12 << 1, i7 << 1);
                }
            }
            if (i7 != this.q) {
                throw new ConcurrentModificationException();
            }
            this.q = i8;
        }
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f11766o;
        Object[] objArr = this.p;
        int i5 = this.q;
        int i6 = 1;
        int i7 = 0;
        int iHashCode = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i5, Object obj) {
        boolean z3 = false;
        if (i5 >= 0 && i5 < this.q) {
            z3 = true;
        }
        if (!z3) {
            a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.p;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.q <= 0;
    }

    public final Object j(int i5) {
        boolean z3 = false;
        if (i5 >= 0 && i5 < this.q) {
            z3 = true;
        }
        if (z3) {
            return this.p[(i5 << 1) + 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i5 = this.q;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(obj, iHashCode) : f();
        if (iD >= 0) {
            int i6 = (iD << 1) + 1;
            Object[] objArr = this.p;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iD;
        int[] iArr = this.f11766o;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            o.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11766o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.p, i8 << 1);
            o.e(objArrCopyOf, "copyOf(this, newSize)");
            this.p = objArrCopyOf;
            if (i5 != this.q) {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr2 = this.f11766o;
            int i9 = i7 + 1;
            r.B(i9, i7, i5, iArr2, iArr2);
            Object[] objArr2 = this.p;
            r.E(objArr2, objArr2, i9 << 1, i7 << 1, this.q << 1);
        }
        int i10 = this.q;
        if (i5 == i10) {
            int[] iArr3 = this.f11766o;
            if (i7 < iArr3.length) {
                iArr3[i7] = iHashCode;
                Object[] objArr3 = this.p;
                int i11 = i7 << 1;
                objArr3[i11] = obj;
                objArr3[i11 + 1] = obj2;
                this.q = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return h(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.q;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.q * 28);
        sb.append('{');
        int i5 = this.q;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object objG = g(i6);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i6);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !o.b(obj2, j(iE))) {
            return false;
        }
        h(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !o.b(obj2, j(iE))) {
            return false;
        }
        i(iE, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(Y y4) {
        this(0);
        int i5 = y4.q;
        b(this.q + i5);
        if (this.q != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(y4.g(i6), y4.j(i6));
            }
        } else if (i5 > 0) {
            r.B(0, 0, i5, y4.f11766o, this.f11766o);
            r.E(y4.p, this.p, 0, 0, i5 << 1);
            this.q = i5;
        }
    }
}
