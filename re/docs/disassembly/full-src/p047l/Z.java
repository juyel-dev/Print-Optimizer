package p047l;

import C3.r;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int[] f11767o;
    public /* synthetic */ Object[] p;
    public /* synthetic */ int q;

    public Z(int i5) {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 40;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (40 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 4;
        this.f11767o = new int[i9];
        this.p = new Object[i9];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        o.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Z z3 = (Z) objClone;
        z3.f11767o = (int[]) this.f11767o.clone();
        z3.p = (Object[]) this.p.clone();
        return z3;
    }

    public final Object b(int i5) {
        Object obj;
        int iA = a.a(this.f11767o, this.q, i5);
        if (iA < 0 || (obj = this.p[iA]) == AbstractC2190v.f11807c) {
            return null;
        }
        return obj;
    }

    public final void c(int i5, Object obj) {
        int iA = a.a(this.f11767o, this.q, i5);
        if (iA >= 0) {
            this.p[iA] = obj;
            return;
        }
        int i6 = ~iA;
        int i7 = this.q;
        if (i6 < i7) {
            Object[] objArr = this.p;
            if (objArr[i6] == AbstractC2190v.f11807c) {
                this.f11767o[i6] = i5;
                objArr[i6] = obj;
                return;
            }
        }
        if (i7 >= this.f11767o.length) {
            int i8 = (i7 + 1) * 4;
            for (int i9 = 4; i9 < 32; i9++) {
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f11767o, i11);
            o.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11767o = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.p, i11);
            o.e(objArrCopyOf, "copyOf(this, newSize)");
            this.p = objArrCopyOf;
        }
        int i12 = this.q;
        if (i12 - i6 != 0) {
            int[] iArr = this.f11767o;
            int i13 = i6 + 1;
            r.B(i13, i6, i12, iArr, iArr);
            Object[] objArr2 = this.p;
            r.E(objArr2, objArr2, i13, i6, this.q);
        }
        this.f11767o[i6] = i5;
        this.p[i6] = obj;
        this.q++;
    }

    public final String toString() {
        int i5 = this.q;
        if (i5 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i5 * 28);
        sb.append('{');
        int i6 = this.q;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f11767o[i7]);
            sb.append('=');
            Object obj = this.p[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "buffer.toString()");
        return string;
    }
}
