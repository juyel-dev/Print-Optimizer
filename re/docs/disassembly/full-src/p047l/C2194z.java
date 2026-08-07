package p047l;

import C3.r;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2194z extends AbstractC2180k {
    public C2194z(int i5) {
        this.f11783a = i5 == 0 ? AbstractC2184o.f11791a : new int[i5];
    }

    public final void b() {
        int i5 = this.f11784b;
        if (i5 < 0) {
            throw new IndexOutOfBoundsException("Index 0 must be in 0.." + this.f11784b);
        }
        d(i5 + 1);
        int[] iArr = this.f11783a;
        int i6 = this.f11784b;
        if (i6 != 0) {
            r.B(1, 0, i6, iArr, iArr);
        }
        iArr[0] = 0;
        this.f11784b++;
    }

    public final void c(int i5) {
        d(this.f11784b + 1);
        int[] iArr = this.f11783a;
        int i6 = this.f11784b;
        iArr[i6] = i5;
        this.f11784b = i6 + 1;
    }

    public final void d(int i5) {
        int[] iArr = this.f11783a;
        if (iArr.length < i5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i5, (iArr.length * 3) / 2));
            o.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11783a = iArrCopyOf;
        }
    }

    public final int e(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f11784b)) {
            StringBuilder sbJ = AbstractC1421mz.j("Index ", i5, " must be in 0..");
            sbJ.append(this.f11784b - 1);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int[] iArr = this.f11783a;
        int i7 = iArr[i5];
        if (i5 != i6 - 1) {
            r.B(i5, i5 + 1, i6, iArr, iArr);
        }
        this.f11784b--;
        return i7;
    }

    public final void g() {
        int i5 = this.f11784b;
        if (i5 == 0) {
            return;
        }
        int[] iArr = this.f11783a;
        o.f(iArr, "<this>");
        Arrays.sort(iArr, 0, i5);
    }

    public final void f(int i5, int i6) {
        if (i5 >= 0 && i5 < this.f11784b) {
            int[] iArr = this.f11783a;
            int i7 = iArr[i5];
            iArr[i5] = i6;
        } else {
            StringBuilder sbJ = AbstractC1421mz.j("set index ", i5, " must be between 0 .. ");
            sbJ.append(this.f11784b - 1);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    public /* synthetic */ C2194z() {
        this(16);
    }
}
