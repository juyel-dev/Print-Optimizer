package p047l;

import Q3.a;
import T3.e;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2176g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f11778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11779b;

    public final float a(int i5) {
        if (i5 >= 0 && i5 < this.f11779b) {
            return this.f11778a[i5];
        }
        StringBuilder sbJ = AbstractC1421mz.j("Index ", i5, " must be in 0..");
        sbJ.append(this.f11779b - 1);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC2176g) {
            AbstractC2176g abstractC2176g = (AbstractC2176g) obj;
            int i5 = abstractC2176g.f11779b;
            int i6 = this.f11779b;
            if (i5 == i6) {
                float[] fArr = this.f11778a;
                float[] fArr2 = abstractC2176g.f11778a;
                e eVarT = a.T(0, i6);
                int i7 = eVarT.f1308o;
                int i8 = eVarT.p;
                if (i7 > i8) {
                    return true;
                }
                while (fArr[i7] == fArr2[i7]) {
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
        float[] fArr = this.f11778a;
        int i5 = this.f11779b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode += Float.hashCode(fArr[i6]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.f11778a;
        int i5 = this.f11779b;
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = fArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                o.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f5);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        o.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
