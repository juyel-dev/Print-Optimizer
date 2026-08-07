package p047l;

import C3.r;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends W {
    public int e;

    public M(int i5) {
        this.f11761a = U.f11754a;
        this.f11762b = a.f11872c;
        if (i5 >= 0) {
            h(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean d(Object obj) {
        int i5 = this.f11764d;
        this.f11762b[f(obj)] = obj;
        return this.f11764d != i5;
    }

    public final void e() {
        this.f11764d = 0;
        long[] jArr = this.f11761a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11761a;
            int i5 = this.f11763c;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        r.L(this.f11762b, 0, this.f11763c);
        this.e = U.c(this.f11763c) - this.f11764d;
    }

    public final int f(Object obj) {
        long j5;
        int i5;
        int i6;
        int i7;
        int i8 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f11763c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f11761a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = i11;
            int i17 = i11;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j9) >> 3)) & i12;
                if (o.b(this.f11762b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i18 = 8;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iG = g(i10);
                long j10 = 128;
                long j11 = 255;
                if (this.e != 0 || ((this.f11761a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j5 = j7;
                    i5 = 0;
                } else {
                    int i19 = this.f11763c;
                    if (i19 <= 8 || Long.compare((((long) this.f11764d) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = j7;
                        i5 = 0;
                        int iD = U.d(this.f11763c);
                        long[] jArr2 = this.f11761a;
                        Object[] objArr = this.f11762b;
                        int i20 = this.f11763c;
                        h(iD);
                        long[] jArr3 = this.f11761a;
                        Object[] objArr2 = this.f11762b;
                        int i21 = this.f11763c;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr2[i22 >> 3] >> ((i22 & 7) << 3)) & j11) < 128) {
                                Object obj2 = objArr[i22];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                int iG2 = g(i23 >>> 7);
                                long j12 = i23 & 127;
                                int i24 = iG2 >> 3;
                                int i25 = (iG2 & 7) << 3;
                                long j13 = (j12 << i25) | (jArr3[i24] & (~(255 << i25)));
                                jArr3[i24] = j13;
                                jArr3[(((iG2 - 7) & i21) + (i21 & 7)) >> 3] = j13;
                                objArr2[iG2] = obj2;
                            }
                            i22++;
                            j11 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f11761a;
                        int i26 = this.f11763c;
                        Object[] objArr3 = this.f11762b;
                        U.a(jArr4, i26);
                        int i27 = 0;
                        int i28 = -1;
                        while (i27 != i26) {
                            int i29 = i27 >> 3;
                            int i30 = (i27 & 7) << 3;
                            long j14 = (jArr4[i29] >> i30) & 255;
                            if (j14 == j10) {
                                i28 = i27;
                                i27++;
                            } else if (j14 != 254) {
                                i27++;
                            } else {
                                Object obj3 = objArr3[i27];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i8;
                                int i31 = iHashCode3 ^ (iHashCode3 << 16);
                                int i32 = i31 >>> 7;
                                int iG3 = g(i32);
                                int i33 = i32 & i26;
                                if (((iG3 - i33) & i26) / 8 == ((i27 - i33) & i26) / i18) {
                                    jArr4[i29] = (((long) (i31 & 127)) << i30) | (jArr4[i29] & (~(255 << i30)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                } else {
                                    int iB = i28;
                                    int i34 = iG3 >> 3;
                                    long j15 = jArr4[i34];
                                    int i35 = (iG3 & 7) << 3;
                                    if (((j15 >> i35) & 255) == 128) {
                                        i7 = i27;
                                        jArr4[i34] = (j15 & (~(255 << i35))) | (((long) (i31 & 127)) << i35);
                                        jArr4[i29] = (jArr4[i29] & (~(255 << i30))) | (128 << i30);
                                        objArr3[iG3] = objArr3[i7];
                                        objArr3[i7] = null;
                                        i6 = i7;
                                    } else {
                                        int i36 = i27;
                                        jArr4[i34] = (j15 & (~(255 << i35))) | (((long) (i31 & 127)) << i35);
                                        if (iB == -1) {
                                            iB = U.b(jArr4, i36 + 1, i26);
                                        }
                                        objArr3[iB] = objArr3[iG3];
                                        objArr3[iG3] = objArr3[i36];
                                        objArr3[i36] = objArr3[iB];
                                        i6 = i36 - 1;
                                        i7 = iB;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27 = i6 + 1;
                                    i28 = i7;
                                    j7 = j7;
                                }
                                i18 = 8;
                                i8 = -862048943;
                                j10 = 128;
                            }
                        }
                        j5 = j7;
                        i5 = 0;
                        this.e = U.c(this.f11763c) - this.f11764d;
                    }
                    iG = g(i10);
                }
                this.f11764d++;
                int i37 = this.e;
                long[] jArr5 = this.f11761a;
                int i38 = iG >> 3;
                long j16 = jArr5[i38];
                int i39 = (iG & 7) << 3;
                this.e = i37 - (((j16 >> i39) & 255) != 128 ? i5 : 1);
                int i40 = this.f11763c;
                long j17 = (j16 & (~(255 << i39))) | (j5 << i39);
                jArr5[i38] = j17;
                jArr5[(((iG - 7) & i40) + (i40 & 7)) >> 3] = j17;
                return iG;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = -862048943;
        }
    }

    public final int g(int i5) {
        int i6 = this.f11763c;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11761a;
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

    public final void h(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11763c = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11761a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.e = U.c(this.f11763c) - this.f11764d;
        this.f11762b = new Object[iMax];
    }

    public final void i(Object obj) {
        this.f11762b[f(obj)] = obj;
    }

    public final void j(W elements) {
        o.f(elements, "elements");
        Object[] objArr = elements.f11762b;
        long[] jArr = elements.f11761a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        i(objArr[(i5 << 3) + i7]);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final boolean k(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f11763c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f11761a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (o.b(this.f11762b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        boolean z3 = iNumberOfTrailingZeros >= 0;
        if (z3) {
            l(iNumberOfTrailingZeros);
        }
        return z3;
    }

    public final void l(int i5) {
        this.f11764d--;
        long[] jArr = this.f11761a;
        int i6 = this.f11763c;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f11762b[i5] = null;
    }

    public /* synthetic */ M() {
        this(6);
    }
}
