package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: o2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2212o extends AbstractC2205h implements Set {
    public static final /* synthetic */ int q = 0;
    public transient AbstractC2210m p;

    public static AbstractC2212o o(int i5, Object... objArr) {
        if (i5 == 0) {
            return C2222z.f12163x;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new D(obj);
        }
        int iR = r(i5);
        Object[] objArr2 = new Object[iR];
        int i6 = iR - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC1421mz.h(i9, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i10 = iRotateLeft & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += iHashCode;
                    i8++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i8, i5, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new D(obj4);
        }
        if (r(i8) < iR / 2) {
            return o(i8, objArr);
        }
        if (i8 <= 0) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new C2222z(objArr, objArr2, i7, i6, i8);
    }

    public static int r(int i5) {
        int iMax = Math.max(i5, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2212o) && (this instanceof C2222z)) {
            AbstractC2212o abstractC2212o = (AbstractC2212o) obj;
            abstractC2212o.getClass();
            if (abstractC2212o instanceof C2222z) {
                if (((C2222z) this).f12165s != obj.hashCode()) {
                    return false;
                }
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2198a.b(this);
    }

    public AbstractC2210m s() {
        AbstractC2210m abstractC2210m = this.p;
        if (abstractC2210m != null) {
            return abstractC2210m;
        }
        AbstractC2210m abstractC2210mT = t();
        this.p = abstractC2210mT;
        return abstractC2210mT;
    }

    public AbstractC2210m t() {
        Object[] array = toArray(AbstractC2205h.f12135o);
        C2206i c2206i = AbstractC2210m.p;
        return AbstractC2210m.s(array.length, array);
    }
}
