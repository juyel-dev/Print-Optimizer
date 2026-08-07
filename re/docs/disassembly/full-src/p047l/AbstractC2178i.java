package p047l;

import C3.r;

/* JADX INFO: renamed from: l.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2178i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f11781a;

    static {
        long[] jArr = U.f11754a;
        int iF = U.f(0);
        int iMax = iF > 0 ? Math.max(7, U.e(iF)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        int i5 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        float[] fArr = new float[iMax];
        f11781a = new float[0];
    }
}
