package p047l;

import C3.r;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC2182m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11704f;

    public A(int i5) {
        this.f11786a = U.f11754a;
        this.f11787b = AbstractC2184o.f11791a;
        this.f11788c = a.f11872c;
        if (i5 >= 0) {
            g(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void d() {
        this.e = 0;
        long[] jArr = this.f11786a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11786a;
            int i5 = this.f11789d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        r.L(this.f11788c, 0, this.f11789d);
        this.f11704f = U.c(this.f11789d) - this.e;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0092  */
    public final int e(int i5) {
        long j5;
        int i6;
        int[] iArr;
        int i7;
        byte b5 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f11789d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11786a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j7 = i10;
            int i16 = i13;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (this.f11787b[iNumberOfTrailingZeros] == i5) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iF = f(i9);
                long j10 = 128;
                long j11 = 255;
                if (this.f11704f == 0) {
                    long j12 = 254;
                    if (((this.f11786a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                        j5 = j7;
                    } else {
                        int i17 = this.f11789d;
                        if (i17 > 8) {
                            i6 = i9;
                            if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                                long[] jArr2 = this.f11786a;
                                int i18 = this.f11789d;
                                int[] iArr2 = this.f11787b;
                                Object[] objArr = this.f11788c;
                                U.a(jArr2, i18);
                                int i19 = 0;
                                int iB = -1;
                                while (i19 != i18) {
                                    int i20 = i19 >> 3;
                                    int i21 = (i19 & 7) << 3;
                                    long j13 = (jArr2[i20] >> i21) & 255;
                                    if (j13 == j10) {
                                        iB = i19;
                                        i19++;
                                    } else if (j13 != j12) {
                                        i19++;
                                    } else {
                                        int iHashCode2 = Integer.hashCode(iArr2[i19]) * (-862048943);
                                        int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i23 = i22 >>> 7;
                                        int iF2 = f(i23);
                                        int i24 = i23 & i18;
                                        if (((iF2 - i24) & i18) / 8 == ((i19 - i24) & i18) / 8) {
                                            jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (((long) (i22 & 127)) << i21);
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i19++;
                                        } else {
                                            int i25 = i19;
                                            int i26 = iF2 >> 3;
                                            long j14 = jArr2[i26];
                                            int i27 = (iF2 & 7) << 3;
                                            if (((j14 >> i27) & 255) == 128) {
                                                iArr = iArr2;
                                                jArr2[i26] = ((~(255 << i27)) & j14) | (((long) (i22 & 127)) << i27);
                                                jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (128 << i21);
                                                iArr[iF2] = iArr[i25];
                                                iArr[i25] = 0;
                                                objArr[iF2] = objArr[i25];
                                                objArr[i25] = null;
                                                iB = i25;
                                                i7 = i18;
                                            } else {
                                                int i28 = i18;
                                                iArr = iArr2;
                                                jArr2[i26] = (((long) (i22 & 127)) << i27) | ((~(255 << i27)) & j14);
                                                int i29 = iB;
                                                if (i29 == -1) {
                                                    i7 = i28;
                                                    iB = U.b(jArr2, i25 + 1, i7);
                                                } else {
                                                    i7 = i28;
                                                    iB = i29;
                                                }
                                                iArr[iB] = iArr[iF2];
                                                iArr[iF2] = iArr[i25];
                                                iArr[i25] = iArr[iB];
                                                objArr[iB] = objArr[iF2];
                                                objArr[iF2] = objArr[i25];
                                                objArr[i25] = objArr[iB];
                                                i25--;
                                            }
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i19 = i25 + 1;
                                            i18 = i7;
                                            j7 = j7;
                                            iArr2 = iArr;
                                        }
                                        j10 = 128;
                                        j12 = 254;
                                    }
                                }
                                j5 = j7;
                                this.f11704f = U.c(this.f11789d) - this.e;
                            }
                            iF = f(i6);
                        } else {
                            i6 = i9;
                        }
                        j5 = j7;
                        int iD = U.d(this.f11789d);
                        long[] jArr3 = this.f11786a;
                        int[] iArr3 = this.f11787b;
                        Object[] objArr2 = this.f11788c;
                        int i30 = this.f11789d;
                        g(iD);
                        long[] jArr4 = this.f11786a;
                        int[] iArr4 = this.f11787b;
                        Object[] objArr3 = this.f11788c;
                        int i31 = this.f11789d;
                        int i32 = 0;
                        while (i32 < i30) {
                            if (((jArr3[i32 >> 3] >> ((i32 & 7) << 3)) & j11) < 128) {
                                int i33 = iArr3[i32];
                                int iHashCode3 = Integer.hashCode(i33) * (-862048943);
                                int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                int iF3 = f(i34 >>> 7);
                                long j15 = i34 & 127;
                                int i35 = iF3 >> 3;
                                int i36 = (iF3 & 7) << 3;
                                long j16 = (jArr4[i35] & (~(255 << i36))) | (j15 << i36);
                                jArr4[i35] = j16;
                                jArr4[(((iF3 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                                iArr4[iF3] = i33;
                                objArr3[iF3] = objArr2[i32];
                            }
                            i32++;
                            jArr3 = jArr3;
                            iArr3 = iArr3;
                            j11 = 255;
                        }
                        iF = f(i6);
                    }
                } else {
                    j5 = j7;
                }
                this.e++;
                int i37 = this.f11704f;
                long[] jArr5 = this.f11786a;
                int i38 = iF >> 3;
                long j17 = jArr5[i38];
                int i39 = (iF & 7) << 3;
                this.f11704f = i37 - (((j17 >> i39) & 255) != 128 ? 0 : 1);
                int i40 = this.f11789d;
                long j18 = (j17 & (~(255 << i39))) | (j5 << i39);
                jArr5[i38] = j18;
                jArr5[(((iF - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return iF;
            }
            i13 = i16 + 8;
            i12 = (i12 + i13) & i11;
            b5 = b5;
        }
    }

    public final int f(int i5) {
        int i6 = this.f11789d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11786a;
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

    public final void g(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11789d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11786a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11704f = U.c(this.f11789d) - this.e;
        this.f11787b = new int[iMax];
        this.f11788c = new Object[iMax];
    }

    public final Object h(int i5) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11789d;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f11786a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                if (this.f11787b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.f11786a;
        int i13 = this.f11789d;
        int i14 = iNumberOfTrailingZeros >> 3;
        int i15 = (iNumberOfTrailingZeros & 7) << 3;
        long j8 = (jArr2[i14] & (~(255 << i15))) | (254 << i15);
        jArr2[i14] = j8;
        jArr2[(((iNumberOfTrailingZeros - 7) & i13) + (i13 & 7)) >> 3] = j8;
        Object[] objArr = this.f11788c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void i(int i5, Object obj) {
        int iE = e(i5);
        this.f11787b[iE] = i5;
        this.f11788c[iE] = obj;
    }

    public /* synthetic */ A() {
        this(6);
    }
}
