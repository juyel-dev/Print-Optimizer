package p047l;

import C3.r;
import com.google.android.gms.internal.ads.AbstractC1421mz;

/* JADX INFO: renamed from: l.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2181l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11785a = 0;

    static {
        int[] iArr = AbstractC2184o.f11791a;
    }

    public static final C2194z a(int... iArr) {
        C2194z c2194z = new C2194z(iArr.length);
        int i5 = c2194z.f11784b;
        if (i5 < 0) {
            StringBuilder sbJ = AbstractC1421mz.j("Index ", i5, " must be in 0..");
            sbJ.append(c2194z.f11784b);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (iArr.length != 0) {
            c2194z.d(iArr.length + i5);
            int[] iArr2 = c2194z.f11783a;
            int i6 = c2194z.f11784b;
            if (i5 != i6) {
                r.B(iArr.length + i5, i5, i6, iArr2, iArr2);
            }
            r.F(i5, 0, 12, iArr, iArr2);
            c2194z.f11784b += iArr.length;
        }
        return c2194z;
    }
}
