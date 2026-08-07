package p047l;

import C3.r;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class D extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11710f;

    public D(int i5) {
        this.f11797a = U.f11754a;
        this.f11798b = AbstractC2188t.f11802a;
        this.f11799c = a.f11872c;
        if (i5 >= 0) {
            f(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int d(long j5) {
        long j6;
        int i5;
        int i6;
        byte b5 = -862048943;
        int iHashCode = Long.hashCode(j5) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f11800d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f11797a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = i9;
            int i15 = i12;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
                if (this.f11798b[iNumberOfTrailingZeros] == j5) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i16 = 8;
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iE = e(i8);
                long j11 = 128;
                long j12 = 255;
                if (this.f11710f != 0 || ((this.f11797a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j6 = j8;
                    i5 = 0;
                } else {
                    int i17 = this.f11800d;
                    if (i17 > 8) {
                        i6 = i8;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.f11797a;
                            int i18 = this.f11800d;
                            long[] jArr3 = this.f11798b;
                            Object[] objArr = this.f11799c;
                            U.a(jArr2, i18);
                            int iB = -1;
                            int i19 = 0;
                            while (i19 != i18) {
                                int i20 = i19 >> 3;
                                int i21 = (i19 & 7) << 3;
                                long j13 = (jArr2[i20] >> i21) & 255;
                                if (j13 == j11) {
                                    int i22 = i19;
                                    i19++;
                                    iB = i22;
                                } else if (j13 != 254) {
                                    i19++;
                                } else {
                                    int iHashCode2 = Long.hashCode(jArr3[i19]) * (-862048943);
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iE2 = e(i24);
                                    int i25 = i24 & i18;
                                    if (((iE2 - i25) & i18) / 8 == ((i19 - i25) & i18) / i16) {
                                        jArr2[i20] = (((long) (i23 & 127)) << i21) | (jArr2[i20] & (~(255 << i21)));
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                        j11 = 128;
                                    } else {
                                        int i26 = iB;
                                        int i27 = iE2 >> 3;
                                        long j14 = jArr2[i27];
                                        int i28 = (iE2 & 7) << 3;
                                        if (((j14 >> i28) & 255) == 128) {
                                            jArr2[i27] = (j14 & (~(255 << i28))) | (((long) (i23 & 127)) << i28);
                                            jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (128 << i21);
                                            jArr3[iE2] = jArr3[i19];
                                            jArr3[i19] = 0;
                                            objArr[iE2] = objArr[i19];
                                            objArr[i19] = null;
                                            iB = i19;
                                        } else {
                                            int i29 = i19;
                                            jArr2[i27] = (((long) (i23 & 127)) << i28) | (j14 & (~(255 << i28)));
                                            iB = i26 == -1 ? U.b(jArr2, i29 + 1, i18) : i26;
                                            jArr3[iB] = jArr3[iE2];
                                            jArr3[iE2] = jArr3[i29];
                                            jArr3[i29] = jArr3[iB];
                                            objArr[iB] = objArr[iE2];
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = objArr[iB];
                                            i19 = i29 - 1;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                        j11 = 128;
                                        i16 = 8;
                                    }
                                }
                            }
                            i5 = 0;
                            this.f11710f = U.c(this.f11800d) - this.e;
                        }
                        j6 = j8;
                        iE = e(i6);
                    } else {
                        i6 = i8;
                    }
                    i5 = 0;
                    int iD = U.d(this.f11800d);
                    long[] jArr4 = this.f11797a;
                    long[] jArr5 = this.f11798b;
                    Object[] objArr2 = this.f11799c;
                    int i30 = this.f11800d;
                    f(iD);
                    long[] jArr6 = this.f11797a;
                    long[] jArr7 = this.f11798b;
                    Object[] objArr3 = this.f11799c;
                    int i31 = this.f11800d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & j12) < 128) {
                            long j15 = jArr5[i32];
                            int iHashCode3 = Long.hashCode(j15) * (-862048943);
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i33 >>> 7);
                            int i34 = iE3 >> 3;
                            int i35 = (iE3 & 7) << 3;
                            long j16 = (((long) (i33 & 127)) << i35) | (jArr6[i34] & (~(255 << i35)));
                            jArr6[i34] = j16;
                            jArr6[(((iE3 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            jArr7[iE3] = j15;
                            objArr3[iE3] = objArr2[i32];
                        }
                        i32++;
                        jArr4 = jArr4;
                        jArr5 = jArr5;
                        j8 = j8;
                        j12 = 255;
                    }
                    j6 = j8;
                    iE = e(i6);
                }
                this.e++;
                int i36 = this.f11710f;
                long[] jArr8 = this.f11797a;
                int i37 = iE >> 3;
                long j17 = jArr8[i37];
                int i38 = (iE & 7) << 3;
                this.f11710f = i36 - (((j17 >> i38) & 255) != 128 ? i5 : 1);
                int i39 = this.f11800d;
                long j18 = (j17 & (~(255 << i38))) | (j6 << i38);
                jArr8[i37] = j18;
                jArr8[(((iE - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return iE;
            }
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
            i8 = i8;
            b5 = b5;
        }
    }

    public final int e(int i5) {
        int i6 = this.f11800d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11797a;
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

    public final void f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11800d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11797a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11710f = U.c(this.f11800d) - this.e;
        this.f11798b = new long[iMax];
        this.f11799c = new Object[iMax];
    }

    public final void g(long j5, Object obj) {
        int iD = d(j5);
        this.f11798b[iD] = j5;
        this.f11799c[iD] = obj;
    }

    public /* synthetic */ D() {
        this(6);
    }
}
