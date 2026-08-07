package p047l;

import C3.r;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11719a = U.f11754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11720b = a.f11872c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f11721c = AbstractC2188t.f11802a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11722d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11723f;

    public I(int i5) {
        if (i5 >= 0) {
            d(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i5) {
        int i6 = this.f11722d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11719a;
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

    public final int b(Object obj) {
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11722d;
        int i9 = i6 >>> 7;
        while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f11719a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (o.b(this.f11720b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
    }

    public final long c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f11721c[iB];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11722d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11719a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11723f = U.c(this.f11722d) - this.e;
        this.f11720b = new Object[iMax];
        this.f11721c = new long[iMax];
    }

    public final void e(long j5, Object obj) {
        I i5;
        long j6;
        int i6;
        int i7;
        int i8;
        int iHashCode;
        long[] jArr;
        I i9 = this;
        Object obj2 = obj;
        int iHashCode2 = (obj2 != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode2 ^ (iHashCode2 << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = i9.f11722d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr2 = i9.f11719a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j7 = ((jArr2[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr2[i16] >>> i17);
            long j8 = i12;
            int i18 = i12;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j10) >> 3)) & i13;
                if (o.b(i9.f11720b[iNumberOfTrailingZeros], obj2)) {
                    i5 = i9;
                    i6 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iA = i9.a(i11);
                long j11 = 128;
                long j12 = 255;
                if (i9.f11723f != 0 || ((i9.f11719a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    i5 = i9;
                    j6 = j8;
                } else {
                    int i19 = i9.f11722d;
                    if (i19 <= 8 || Long.compare((((long) i9.e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) > 0) {
                        i5 = i9;
                        i7 = i11;
                        j6 = j8;
                        int i20 = 0;
                        int iD = U.d(i5.f11722d);
                        long[] jArr3 = i5.f11719a;
                        Object[] objArr = i5.f11720b;
                        long[] jArr4 = i5.f11721c;
                        int i21 = i5.f11722d;
                        i5.d(iD);
                        long[] jArr5 = i5.f11719a;
                        Object[] objArr2 = i5.f11720b;
                        long[] jArr6 = i5.f11721c;
                        int i22 = i5.f11722d;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr3[i23 >> 3] >> ((i23 & 7) << 3)) & j12) < 128) {
                                Object obj3 = objArr[i23];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : i20) * (-862048943);
                                int i24 = iHashCode3 ^ (iHashCode3 << 16);
                                int iA2 = i5.a(i24 >>> 7);
                                long j13 = i24 & 127;
                                int i25 = iA2 >> 3;
                                int i26 = (iA2 & 7) << 3;
                                long j14 = (jArr5[i25] & (~(255 << i26))) | (j13 << i26);
                                jArr5[i25] = j14;
                                jArr5[(((iA2 - 7) & i22) + (i22 & 7)) >> 3] = j14;
                                objArr2[iA2] = obj3;
                                jArr6[iA2] = jArr4[i23];
                            }
                            i23++;
                            jArr3 = jArr3;
                            objArr = objArr;
                            j12 = 255;
                            i20 = 0;
                        }
                    } else {
                        long[] jArr7 = i9.f11719a;
                        int i27 = i9.f11722d;
                        Object[] objArr3 = i9.f11720b;
                        long[] jArr8 = i9.f11721c;
                        U.a(jArr7, i27);
                        int i28 = 0;
                        int i29 = -1;
                        while (i28 != i27) {
                            int i30 = i28 >> 3;
                            int i31 = (i28 & 7) << 3;
                            long j15 = (jArr7[i30] >> i31) & 255;
                            if (j15 == j11) {
                                i29 = i28;
                                i28++;
                            } else if (j15 != 254) {
                                i28++;
                            } else {
                                Object obj4 = objArr3[i28];
                                if (obj4 != null) {
                                    iHashCode = obj4.hashCode();
                                    i8 = -862048943;
                                } else {
                                    i8 = -862048943;
                                    iHashCode = 0;
                                }
                                int i32 = iHashCode * i8;
                                int i33 = i32 ^ (i32 << 16);
                                int i34 = i33 >>> 7;
                                int iA3 = i9.a(i34);
                                int i35 = i34 & i27;
                                if (((iA3 - i35) & i27) / 8 == ((i28 - i35) & i27) / 8) {
                                    jArr7[i30] = (((long) (i33 & 127)) << i31) | (jArr7[i30] & (~(255 << i31)));
                                    jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i28++;
                                } else {
                                    int iB = i29;
                                    int i36 = iA3 >> 3;
                                    long j16 = jArr7[i36];
                                    int i37 = (iA3 & 7) << 3;
                                    if (((j16 >> i37) & 255) == 128) {
                                        jArr = jArr8;
                                        jArr7[i36] = (((long) (i33 & 127)) << i37) | ((~(255 << i37)) & j16);
                                        jArr7[i30] = (jArr7[i30] & (~(255 << i31))) | (128 << i31);
                                        objArr3[iA3] = objArr3[i28];
                                        objArr3[i28] = null;
                                        jArr[iA3] = jArr[i28];
                                        jArr[i28] = 0;
                                        iB = i28;
                                    } else {
                                        jArr = jArr8;
                                        jArr7[i36] = (((long) (i33 & 127)) << i37) | ((~(255 << i37)) & j16);
                                        if (iB == -1) {
                                            iB = U.b(jArr7, i28 + 1, i27);
                                        }
                                        objArr3[iB] = objArr3[iA3];
                                        objArr3[iA3] = objArr3[i28];
                                        objArr3[i28] = objArr3[iB];
                                        jArr[iB] = jArr[iA3];
                                        jArr[iA3] = jArr[i28];
                                        jArr[i28] = jArr[iB];
                                        i28--;
                                    }
                                    jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i28++;
                                    i9 = this;
                                    i29 = iB;
                                    i11 = i11;
                                    jArr8 = jArr;
                                }
                                j8 = j8;
                                j11 = 128;
                            }
                        }
                        i5 = i9;
                        i7 = i11;
                        j6 = j8;
                        i5.f11723f = U.c(i5.f11722d) - i5.e;
                    }
                    iA = i5.a(i7);
                }
                i5.e++;
                int i38 = i5.f11723f;
                long[] jArr9 = i5.f11719a;
                int i39 = iA >> 3;
                long j17 = jArr9[i39];
                int i40 = (iA & 7) << 3;
                i5.f11723f = i38 - (((j17 >> i40) & 255) == 128 ? 1 : 0);
                int i41 = i5.f11722d;
                long j18 = (j17 & (~(255 << i40))) | (j6 << i40);
                jArr9[i39] = j18;
                jArr9[(((iA - 7) & i41) + (i41 & 7)) >> 3] = j18;
                i6 = ~iA;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i9 = i9;
            i12 = i18;
            obj2 = obj;
        }
        if (i6 < 0) {
            i6 = ~i6;
        }
        i5.f11720b[i6] = obj;
        i5.f11721c[i6] = j5;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[LOOP:0: B:14:0x0023->B:26:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i5 = (I) obj;
        if (i5.e != this.e) {
            return false;
        }
        Object[] objArr = this.f11720b;
        long[] jArr = this.f11721c;
        long[] jArr2 = this.f11719a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr2[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i6 << 3) + i8;
                            if (jArr[i9] != i5.c(objArr[i9])) {
                                return false;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i7 == 8) {
                        if (i6 != length) {
                            i6++;
                        }
                    }
                } else if (i6 != length) {
                    i6++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f11720b;
        long[] jArr = this.f11721c;
        long[] jArr2 = this.f11719a;
        int length = jArr2.length - 2;
        int i5 = 0;
        if (length >= 0) {
            int i6 = 0;
            int iHashCode = 0;
            while (true) {
                long j5 = jArr2[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = objArr[i9];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i9]);
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        return iHashCode;
                    }
                }
                if (i6 != length) {
                    i6++;
                } else {
                    i5 = iHashCode;
                }
            }
        }
        return i5;
    }

    public final String toString() {
        int i5;
        int i6;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f11720b;
        long[] jArr = this.f11721c;
        long[] jArr2 = this.f11719a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j5 = jArr2[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((255 & j5) < 128) {
                            int i11 = (i7 << 3) + i10;
                            Object obj = objArr[i11];
                            i6 = i7;
                            long j6 = jArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j6);
                            i8++;
                            if (i8 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i6 = i7;
                        }
                        j5 >>= 8;
                        i10++;
                        i7 = i6;
                    }
                    int i12 = i7;
                    if (i9 != 8) {
                        break;
                    }
                    i5 = i12;
                } else {
                    i5 = i7;
                }
                if (i5 == length) {
                    break;
                }
                i7 = i5 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "s.append('}').toString()");
        return string;
    }
}
