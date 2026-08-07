package p047l;

import Q3.a;
import T3.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2180k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11784b;

    public final int a(int i5) {
        if (i5 >= 0 && i5 < this.f11784b) {
            return this.f11783a[i5];
        }
        StringBuilder sbJ = AbstractC1421mz.j("Index ", i5, " must be in 0..");
        sbJ.append(this.f11784b - 1);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC2180k) {
            AbstractC2180k abstractC2180k = (AbstractC2180k) obj;
            int i5 = abstractC2180k.f11784b;
            int i6 = this.f11784b;
            if (i5 == i6) {
                int[] iArr = this.f11783a;
                int[] iArr2 = abstractC2180k.f11783a;
                e eVarT = a.T(0, i6);
                int i7 = eVarT.f1308o;
                int i8 = eVarT.p;
                if (i7 > i8) {
                    return true;
                }
                while (iArr[i7] == iArr2[i7]) {
                    if (i7 == i8) {
                        return true;
                    }
                    i7++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f11783a;
        int i5 = this.f11784b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode += Integer.hashCode(iArr[i6]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f11783a;
        int i5 = this.f11784b;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = iArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                o.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i7);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        o.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
