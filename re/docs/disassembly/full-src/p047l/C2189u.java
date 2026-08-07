package p047l;

import C3.r;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: renamed from: l.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2189u implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f11803o;
    public /* synthetic */ long[] p;
    public /* synthetic */ Object[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f11804r;

    public C2189u(int i5) {
        if (i5 == 0) {
            this.p = a.f11871b;
            this.q = a.f11872c;
            return;
        }
        int i6 = i5 * 8;
        for (int i7 = 4; i7 < 32; i7++) {
            int i8 = (1 << i7) - 12;
            if (i6 <= i8) {
                i6 = i8;
                break;
            }
        }
        int i9 = i6 / 8;
        this.p = new long[i9];
        this.q = new Object[i9];
    }

    public final long a(int i5) {
        if (!(i5 >= 0 && i5 < this.f11804r)) {
            a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f11803o) {
            int i6 = this.f11804r;
            long[] jArr = this.p;
            Object[] objArr = this.q;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC2190v.f11805a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f11803o = false;
            this.f11804r = i7;
        }
        return this.p[i5];
    }

    public final void b(long j5, Object obj) {
        int iB = a.b(this.p, this.f11804r, j5);
        if (iB >= 0) {
            this.q[iB] = obj;
            return;
        }
        int i5 = ~iB;
        int i6 = this.f11804r;
        Object obj2 = AbstractC2190v.f11805a;
        if (i5 < i6) {
            Object[] objArr = this.q;
            if (objArr[i5] == obj2) {
                this.p[i5] = j5;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f11803o) {
            long[] jArr = this.p;
            if (i6 >= jArr.length) {
                Object[] objArr2 = this.q;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj3 = objArr2[i8];
                    if (obj3 != obj2) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr2[i7] = obj3;
                            objArr2[i8] = null;
                        }
                        i7++;
                    }
                }
                this.f11803o = false;
                this.f11804r = i7;
                i5 = ~a.b(this.p, i7, j5);
            }
        }
        int i9 = this.f11804r;
        if (i9 >= this.p.length) {
            int i10 = (i9 + 1) * 8;
            for (int i11 = 4; i11 < 32; i11++) {
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
            }
            int i13 = i10 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.p, i13);
            o.e(jArrCopyOf, "copyOf(this, newSize)");
            this.p = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.q, i13);
            o.e(objArrCopyOf, "copyOf(this, newSize)");
            this.q = objArrCopyOf;
        }
        int i14 = this.f11804r - i5;
        if (i14 != 0) {
            long[] jArr2 = this.p;
            int i15 = i5 + 1;
            o.f(jArr2, "<this>");
            System.arraycopy(jArr2, i5, jArr2, i15, i14);
            Object[] objArr3 = this.q;
            r.E(objArr3, objArr3, i15, i5, this.f11804r);
        }
        this.p[i5] = j5;
        this.q[i5] = obj;
        this.f11804r++;
    }

    public final void c(long j5) {
        int iB = a.b(this.p, this.f11804r, j5);
        if (iB >= 0) {
            Object[] objArr = this.q;
            Object obj = objArr[iB];
            Object obj2 = AbstractC2190v.f11805a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f11803o = true;
            }
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        o.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2189u c2189u = (C2189u) objClone;
        c2189u.p = (long[]) this.p.clone();
        c2189u.q = (Object[]) this.q.clone();
        return c2189u;
    }

    public final int d() {
        if (this.f11803o) {
            int i5 = this.f11804r;
            long[] jArr = this.p;
            Object[] objArr = this.q;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2190v.f11805a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f11803o = false;
            this.f11804r = i6;
        }
        return this.f11804r;
    }

    public final Object e(int i5) {
        if (!(i5 >= 0 && i5 < this.f11804r)) {
            a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f11803o) {
            int i6 = this.f11804r;
            long[] jArr = this.p;
            Object[] objArr = this.q;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC2190v.f11805a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f11803o = false;
            this.f11804r = i7;
        }
        return this.q[i5];
    }

    public final String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11804r * 28);
        sb.append('{');
        int i5 = this.f11804r;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(a(i6));
            sb.append('=');
            Object objE = e(i6);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
