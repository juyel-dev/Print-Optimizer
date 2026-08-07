package p047l;

import C3.C0121a;
import C3.r;
import Q3.a;
import T3.e;
import androidx.compose.foundation.interaction.Interaction;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11718b;

    public H(int i5) {
        this.f11717a = i5 == 0 ? AbstractC2190v.f11806b : new Object[i5];
    }

    public final void a(Object obj) {
        int i5 = this.f11718b + 1;
        Object[] objArr = this.f11717a;
        if (objArr.length < i5) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i5, (objArr.length * 3) / 2));
            o.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f11717a = objArrCopyOf;
        }
        Object[] objArr2 = this.f11717a;
        int i6 = this.f11718b;
        objArr2[i6] = obj;
        this.f11718b = i6 + 1;
    }

    public final int b(Object obj) {
        int i5 = 0;
        if (obj == null) {
            Object[] objArr = this.f11717a;
            int i6 = this.f11718b;
            while (i5 < i6) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        Object[] objArr2 = this.f11717a;
        int i7 = this.f11718b;
        while (i5 < i7) {
            if (obj.equals(objArr2[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public final void c(Interaction interaction) {
        int i5;
        int iB = b(interaction);
        if (iB >= 0) {
            if (iB < 0 || iB >= (i5 = this.f11718b)) {
                StringBuilder sbJ = AbstractC1421mz.j("Index ", iB, " must be in 0..");
                sbJ.append(this.f11718b - 1);
                throw new IndexOutOfBoundsException(sbJ.toString());
            }
            Object[] objArr = this.f11717a;
            Object obj = objArr[iB];
            if (iB != i5 - 1) {
                r.E(objArr, objArr, iB, iB + 1, i5);
            }
            int i6 = this.f11718b - 1;
            this.f11718b = i6;
            objArr[i6] = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h5 = (H) obj;
            int i5 = h5.f11718b;
            int i6 = this.f11718b;
            if (i5 == i6) {
                Object[] objArr = this.f11717a;
                Object[] objArr2 = h5.f11717a;
                e eVarT = a.T(0, i6);
                int i7 = eVarT.f1308o;
                int i8 = eVarT.p;
                if (i7 > i8) {
                    return true;
                }
                while (o.b(objArr[i7], objArr2[i7])) {
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
        Object[] objArr = this.f11717a;
        int i5 = this.f11718b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[i6];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        C0121a c0121a = new C0121a(this, 7);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f11717a;
        int i5 = this.f11718b;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                o.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c0121a.invoke(obj));
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        o.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public /* synthetic */ H() {
        this(16);
    }
}
