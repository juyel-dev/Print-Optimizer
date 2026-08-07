package p047l;

import P3.f;
import V3.g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class L extends T implements f {
    public final /* synthetic */ M q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m5) {
        super(m5, 1);
        this.q = m5;
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.q.d(obj);
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        o.f(elements, "elements");
        M m5 = this.q;
        int i5 = m5.f11764d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            m5.i(it.next());
        }
        return i5 != m5.f11764d;
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final void clear() {
        this.q.e();
    }

    @Override // p047l.T, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.q);
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.q.k(obj);
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iHashCode;
        int iNumberOfTrailingZeros;
        o.f(elements, "elements");
        M m5 = this.q;
        int i5 = m5.f11764d;
        Iterator it = elements.iterator();
        while (true) {
            int i6 = 1;
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                m5.getClass();
                iHashCode = next.hashCode();
            } else {
                iHashCode = 0;
            }
            int i8 = iHashCode * (-862048943);
            int i9 = i8 ^ (i8 << 16);
            int i10 = i9 & 127;
            int i11 = m5.f11763c;
            int i12 = (i9 >>> 7) & i11;
            while (true) {
                long[] jArr = m5.f11761a;
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                int i15 = i7;
                long j5 = (((-i14) >> 63) & (jArr[i13 + i6] << (64 - i14))) | (jArr[i13] >>> i14);
                long j6 = (((long) i10) * 72340172838076673L) ^ j5;
                for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i12) & i11;
                    if (o.b(m5.f11762b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                }
                if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i7 = i15 + 8;
                i12 = (i12 + i7) & i11;
                i6 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                m5.l(iNumberOfTrailingZeros);
            }
        }
        return i5 != m5.f11764d;
    }

    @Override // p047l.T, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        o.f(elements, "elements");
        M m5 = this.q;
        long[] jArr = m5.f11761a;
        int length = jArr.length - 2;
        boolean z3 = false;
        if (length >= 0) {
            int i5 = 0;
            boolean z4 = false;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            if (!elements.contains(m5.f11762b[i8])) {
                                m5.l(i8);
                                z4 = true;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return z4;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    z3 = z4;
                }
            }
        }
        return z3;
    }
}
