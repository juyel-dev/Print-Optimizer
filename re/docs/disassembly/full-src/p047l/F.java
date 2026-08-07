package p047l;

import C3.r;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11715f;

    public F() {
        this.f11737a = U.f11754a;
        this.f11738b = a.f11872c;
        this.f11739c = AbstractC2178i.f11781a;
        d(U.f(6));
    }

    public final void b() {
        this.e = 0;
        long[] jArr = this.f11737a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11737a;
            int i5 = this.f11740d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        r.L(this.f11738b, 0, this.f11740d);
        this.f11715f = U.c(this.f11740d) - this.e;
    }

    public final int c(int i5) {
        int i6 = this.f11740d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11737a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final void d(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11740d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11737a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11715f = U.c(this.f11740d) - this.e;
        this.f11738b = new Object[iMax];
        this.f11739c = new float[iMax];
    }

    public final void e(Object obj, float f5) {
        F f6;
        long j5;
        int i5;
        int i6;
        int i7;
        int iHashCode;
        float[] fArr;
        F f7 = this;
        Object obj2 = obj;
        int iHashCode2 = (obj2 != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode2 ^ (iHashCode2 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = f7.f11740d;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = f7.f11737a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (o.b(f7.f11738b[iNumberOfTrailingZeros], obj2)) {
                    f6 = f7;
                    i5 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iC = f7.c(i9);
                long j10 = 128;
                long j11 = 255;
                if (f7.f11715f != 0 || ((f7.f11737a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    f6 = f7;
                    j5 = j7;
                } else {
                    int i17 = f7.f11740d;
                    if (i17 <= 8 || Long.compare((((long) f7.e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) > 0) {
                        f6 = f7;
                        i6 = i9;
                        j5 = j7;
                        int i18 = 0;
                        int iD = U.d(f6.f11740d);
                        long[] jArr2 = f6.f11737a;
                        Object[] objArr = f6.f11738b;
                        float[] fArr2 = f6.f11739c;
                        int i19 = f6.f11740d;
                        f6.d(iD);
                        long[] jArr3 = f6.f11737a;
                        Object[] objArr2 = f6.f11738b;
                        float[] fArr3 = f6.f11739c;
                        int i20 = f6.f11740d;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr2[i21 >> 3] >> ((i21 & 7) << 3)) & j11) < 128) {
                                Object obj3 = objArr[i21];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i18) * (-862048943);
                                int i22 = iHashCode3 ^ (iHashCode3 << 16);
                                int iC2 = f6.c(i22 >>> 7);
                                long j12 = i22 & 127;
                                int i23 = iC2 >> 3;
                                int i24 = (iC2 & 7) << 3;
                                long j13 = (jArr3[i23] & (~(255 << i24))) | (j12 << i24);
                                jArr3[i23] = j13;
                                jArr3[(((iC2 - 7) & i20) + (i20 & 7)) >> 3] = j13;
                                objArr2[iC2] = obj3;
                                fArr3[iC2] = fArr2[i21];
                            }
                            i21++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j11 = 255;
                            i18 = 0;
                        }
                    } else {
                        long[] jArr4 = f7.f11737a;
                        int i25 = f7.f11740d;
                        Object[] objArr3 = f7.f11738b;
                        float[] fArr4 = f7.f11739c;
                        U.a(jArr4, i25);
                        int i26 = 0;
                        int i27 = -1;
                        while (i26 != i25) {
                            int i28 = i26 >> 3;
                            int i29 = (i26 & 7) << 3;
                            long j14 = (jArr4[i28] >> i29) & 255;
                            if (j14 == j10) {
                                i27 = i26;
                                i26++;
                            } else if (j14 != 254) {
                                i26++;
                            } else {
                                Object obj4 = objArr3[i26];
                                if (obj4 != null) {
                                    iHashCode = obj4.hashCode();
                                    i7 = -862048943;
                                } else {
                                    i7 = -862048943;
                                    iHashCode = 0;
                                }
                                int i30 = iHashCode * i7;
                                int i31 = i30 ^ (i30 << 16);
                                int i32 = i31 >>> 7;
                                int iC3 = f7.c(i32);
                                int i33 = i32 & i25;
                                if (((iC3 - i33) & i25) / 8 == ((i26 - i33) & i25) / 8) {
                                    jArr4[i28] = (((long) (i31 & 127)) << i29) | (jArr4[i28] & (~(255 << i29)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i26++;
                                } else {
                                    int iB = i27;
                                    int i34 = iC3 >> 3;
                                    long j15 = jArr4[i34];
                                    int i35 = (iC3 & 7) << 3;
                                    if (((j15 >> i35) & 255) == 128) {
                                        fArr = fArr4;
                                        jArr4[i34] = (((long) (i31 & 127)) << i35) | ((~(255 << i35)) & j15);
                                        jArr4[i28] = (jArr4[i28] & (~(255 << i29))) | (128 << i29);
                                        objArr3[iC3] = objArr3[i26];
                                        objArr3[i26] = null;
                                        fArr[iC3] = fArr[i26];
                                        fArr[i26] = 0.0f;
                                        iB = i26;
                                    } else {
                                        fArr = fArr4;
                                        jArr4[i34] = (((long) (i31 & 127)) << i35) | ((~(255 << i35)) & j15);
                                        if (iB == -1) {
                                            iB = U.b(jArr4, i26 + 1, i25);
                                        }
                                        objArr3[iB] = objArr3[iC3];
                                        objArr3[iC3] = objArr3[i26];
                                        objArr3[i26] = objArr3[iB];
                                        fArr[iB] = fArr[iC3];
                                        fArr[iC3] = fArr[i26];
                                        fArr[i26] = fArr[iB];
                                        i26--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i26++;
                                    f7 = this;
                                    i27 = iB;
                                    i9 = i9;
                                    fArr4 = fArr;
                                }
                                j7 = j7;
                                j10 = 128;
                            }
                        }
                        f6 = f7;
                        i6 = i9;
                        j5 = j7;
                        f6.f11715f = U.c(f6.f11740d) - f6.e;
                    }
                    iC = f6.c(i6);
                }
                f6.e++;
                int i36 = f6.f11715f;
                long[] jArr5 = f6.f11737a;
                int i37 = iC >> 3;
                long j16 = jArr5[i37];
                int i38 = (iC & 7) << 3;
                f6.f11715f = i36 - (((j16 >> i38) & 255) == 128 ? 1 : 0);
                int i39 = f6.f11740d;
                long j17 = (j16 & (~(255 << i38))) | (j5 << i38);
                jArr5[i37] = j17;
                jArr5[(((iC - 7) & i39) + (i39 & 7)) >> 3] = j17;
                i5 = ~iC;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            f7 = f7;
            i10 = i16;
            obj2 = obj;
        }
        if (i5 < 0) {
            i5 = ~i5;
        }
        f6.f11738b[i5] = obj;
        f6.f11739c[i5] = f5;
    }
}
