package p047l;

import C3.r;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC2185p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11709f;

    public C(int i5) {
        this.f11792a = U.f11754a;
        this.f11793b = AbstractC2188t.f11802a;
        this.f11794c = AbstractC2184o.f11791a;
        if (i5 >= 0) {
            c(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i5) {
        int i6 = this.f11795d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11792a;
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

    public final void c(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11795d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11792a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11709f = U.c(this.f11795d) - this.e;
        this.f11793b = new long[iMax];
        this.f11794c = new int[iMax];
    }

    public final void d(int i5, long j5) {
        long j6;
        int i6;
        int i7;
        int i8;
        byte b5 = -862048943;
        int iHashCode = Long.hashCode(j5) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f11795d;
        int i13 = i10 & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11792a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j7 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j8 = i11;
            int i17 = i14;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j10) >> 3)) & i12;
                if (this.f11793b[iNumberOfTrailingZeros] == j5) {
                    i7 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            int i18 = 8;
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iB = b(i10);
                long j11 = 128;
                long j12 = 255;
                if (this.f11709f != 0 || ((this.f11792a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j6 = j8;
                    i6 = 0;
                } else {
                    int i19 = this.f11795d;
                    if (i19 > 8) {
                        i8 = i10;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.f11792a;
                            int i20 = this.f11795d;
                            long[] jArr3 = this.f11793b;
                            int[] iArr = this.f11794c;
                            U.a(jArr2, i20);
                            int iB2 = -1;
                            int i21 = 0;
                            while (i21 != i20) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr2[i22] >> i23) & 255;
                                if (j13 == j11) {
                                    int i24 = i21;
                                    i21++;
                                    iB2 = i24;
                                } else if (j13 != 254) {
                                    i21++;
                                } else {
                                    int iHashCode2 = Long.hashCode(jArr3[i21]) * (-862048943);
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iB3 = b(i26);
                                    int i27 = i26 & i20;
                                    if (((iB3 - i27) & i20) / 8 == ((i21 - i27) & i20) / i18) {
                                        jArr2[i22] = (((long) (i25 & 127)) << i23) | (jArr2[i22] & (~(255 << i23)));
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = 128;
                                    } else {
                                        int i28 = iB2;
                                        int i29 = iB3 >> 3;
                                        long j14 = jArr2[i29];
                                        int i30 = (iB3 & 7) << 3;
                                        if (((j14 >> i30) & 255) == 128) {
                                            jArr2[i29] = (j14 & (~(255 << i30))) | (((long) (i25 & 127)) << i30);
                                            jArr2[i22] = (jArr2[i22] & (~(255 << i23))) | (128 << i23);
                                            jArr3[iB3] = jArr3[i21];
                                            jArr3[i21] = 0;
                                            iArr[iB3] = iArr[i21];
                                            iArr[i21] = 0;
                                            iB2 = i21;
                                        } else {
                                            int i31 = i21;
                                            jArr2[i29] = (((long) (i25 & 127)) << i30) | (j14 & (~(255 << i30)));
                                            iB2 = i28 == -1 ? U.b(jArr2, i31 + 1, i20) : i28;
                                            jArr3[iB2] = jArr3[iB3];
                                            jArr3[iB3] = jArr3[i31];
                                            jArr3[i31] = jArr3[iB2];
                                            iArr[iB2] = iArr[iB3];
                                            iArr[iB3] = iArr[i31];
                                            iArr[i31] = iArr[iB2];
                                            i21 = i31 - 1;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = 128;
                                        i18 = 8;
                                    }
                                }
                            }
                            i6 = 0;
                            this.f11709f = U.c(this.f11795d) - this.e;
                        }
                        j6 = j8;
                        iB = b(i8);
                    } else {
                        i8 = i10;
                    }
                    i6 = 0;
                    int iD = U.d(this.f11795d);
                    long[] jArr4 = this.f11792a;
                    long[] jArr5 = this.f11793b;
                    int[] iArr2 = this.f11794c;
                    int i32 = this.f11795d;
                    c(iD);
                    long[] jArr6 = this.f11792a;
                    long[] jArr7 = this.f11793b;
                    int[] iArr3 = this.f11794c;
                    int i33 = this.f11795d;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr4[i34 >> 3] >> ((i34 & 7) << 3)) & j12) < 128) {
                            long j15 = jArr5[i34];
                            int iHashCode3 = Long.hashCode(j15) * (-862048943);
                            int i35 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i35 >>> 7);
                            int i36 = iB4 >> 3;
                            int i37 = (iB4 & 7) << 3;
                            long j16 = (((long) (i35 & 127)) << i37) | (jArr6[i36] & (~(255 << i37)));
                            jArr6[i36] = j16;
                            jArr6[(((iB4 - 7) & i33) + (i33 & 7)) >> 3] = j16;
                            jArr7[iB4] = j15;
                            iArr3[iB4] = iArr2[i34];
                        }
                        i34++;
                        jArr4 = jArr4;
                        jArr5 = jArr5;
                        j8 = j8;
                        j12 = 255;
                    }
                    j6 = j8;
                    iB = b(i8);
                }
                this.e++;
                int i38 = this.f11709f;
                long[] jArr8 = this.f11792a;
                int i39 = iB >> 3;
                long j17 = jArr8[i39];
                int i40 = (iB & 7) << 3;
                this.f11709f = i38 - (((j17 >> i40) & 255) != 128 ? i6 : 1);
                int i41 = this.f11795d;
                long j18 = (j17 & (~(255 << i40))) | (j6 << i40);
                jArr8[i39] = j18;
                jArr8[(((iB - 7) & i41) + (i41 & 7)) >> 3] = j18;
                i7 = ~iB;
                break;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
            i10 = i10;
            b5 = b5;
        }
        if (i7 < 0) {
            i7 = ~i7;
        }
        this.f11793b[i7] = j5;
        this.f11794c[i7] = i5;
    }
}
