package p047l;

import C3.r;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: l.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2193y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11813a = U.f11754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f11815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11816d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11817f;

    public C2193y() {
        int[] iArr = AbstractC2184o.f11791a;
        this.f11814b = iArr;
        this.f11815c = iArr;
        f(U.f(6));
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f11813a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11813a;
            int i5 = this.f11816d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        this.f11817f = U.c(this.f11816d) - this.e;
    }

    public final int b(int i5) {
        int i6 = this.f11816d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11813a;
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

    public final int c(int i5) {
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11816d;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f11813a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                if (this.f11814b[iNumberOfTrailingZeros] == i5) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int d(int i5) {
        int iC = c(i5);
        if (iC >= 0) {
            return this.f11815c[iC];
        }
        throw new NoSuchElementException(AbstractC1421mz.h(i5, "Cannot find value for key "));
    }

    public final int e(int i5) {
        int iC = c(i5);
        if (iC >= 0) {
            return this.f11815c[iC];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0023->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2193y)) {
            return false;
        }
        C2193y c2193y = (C2193y) obj;
        if (c2193y.e != this.e) {
            return false;
        }
        int[] iArr = this.f11814b;
        int[] iArr2 = this.f11815c;
        long[] jArr = this.f11813a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            if (iArr2[i8] != c2193y.d(iArr[i8])) {
                                return false;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 == 8) {
                        if (i5 != length) {
                            i5++;
                        }
                    }
                } else if (i5 != length) {
                    i5++;
                }
            }
        }
        return true;
    }

    public final void f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11816d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11813a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11817f = U.c(this.f11816d) - this.e;
        this.f11814b = new int[iMax];
        this.f11815c = new int[iMax];
    }

    public final void g(int i5, int i6) {
        long j5;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        C2193y c2193y = this;
        int i10 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = c2193y.f11816d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = c2193y.f11813a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = i16;
            long j6 = (((-i18) >> 63) & (jArr[i17 + 1] << (64 - i18))) | (jArr[i17] >>> i18);
            long j7 = i13;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i14;
                if (c2193y.f11814b[iNumberOfTrailingZeros] == i5) {
                    c2193y = c2193y;
                    i8 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int iB = c2193y.b(i12);
                long j10 = 128;
                long j11 = 255;
                if (c2193y.f11817f != 0 || ((c2193y.f11813a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    c2193y = c2193y;
                    j5 = j7;
                    i7 = 0;
                } else {
                    int i20 = c2193y.f11816d;
                    if (i20 > 8) {
                        j5 = j7;
                        if (Long.compare((((long) c2193y.e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = c2193y.f11813a;
                            int i21 = c2193y.f11816d;
                            int[] iArr2 = c2193y.f11814b;
                            int[] iArr3 = c2193y.f11815c;
                            U.a(jArr2, i21);
                            int i22 = -1;
                            int i23 = 0;
                            while (i23 != i21) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j12 = (jArr2[i24] >> i25) & 255;
                                if (j12 == j10) {
                                    int i26 = i23;
                                    i23++;
                                    i22 = i26;
                                } else if (j12 != 254) {
                                    i23++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr2[i23]) * i10;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iB2 = c2193y.b(i28);
                                    int i29 = i28 & i21;
                                    if (((iB2 - i29) & i21) / 8 == ((i23 - i29) & i21) / 8) {
                                        jArr2[i24] = (jArr2[i24] & (~(255 << i25))) | (((long) (i27 & 127)) << i25);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i22 = i22;
                                        i10 = -862048943;
                                    } else {
                                        int i30 = i22;
                                        int i31 = i23;
                                        int i32 = iB2 >> 3;
                                        long j13 = jArr2[i32];
                                        int i33 = (iB2 & 7) << 3;
                                        if (((j13 >> i33) & 255) == 128) {
                                            jArr2[i32] = (j13 & (~(255 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr2[i24] = (jArr2[i24] & (~(255 << i25))) | (128 << i25);
                                            iArr2[iB2] = iArr2[i31];
                                            iArr2[i31] = 0;
                                            iArr3[iB2] = iArr3[i31];
                                            iArr3[i31] = 0;
                                            i9 = i31;
                                            iArr = iArr3;
                                        } else {
                                            iArr = iArr3;
                                            jArr2[i32] = (((long) (i27 & 127)) << i33) | (j13 & (~(255 << i33)));
                                            int iB3 = i30 == -1 ? U.b(jArr2, i31 + 1, i21) : i30;
                                            iArr2[iB3] = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i31];
                                            iArr2[i31] = iArr2[iB3];
                                            iArr[iB3] = iArr[iB2];
                                            iArr[iB2] = iArr[i31];
                                            iArr[i31] = iArr[iB3];
                                            i9 = i31 - 1;
                                            i31 = iB3;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23 = i9 + 1;
                                        i10 = -862048943;
                                        c2193y = this;
                                        i22 = i31;
                                        iArr3 = iArr;
                                    }
                                    j10 = 128;
                                }
                            }
                            c2193y = c2193y;
                            i7 = 0;
                            c2193y.f11817f = U.c(c2193y.f11816d) - c2193y.e;
                        }
                        iB = c2193y.b(i12);
                    } else {
                        j5 = j7;
                    }
                    i7 = 0;
                    int iD = U.d(c2193y.f11816d);
                    long[] jArr3 = c2193y.f11813a;
                    int[] iArr4 = c2193y.f11814b;
                    int[] iArr5 = c2193y.f11815c;
                    int i34 = c2193y.f11816d;
                    c2193y.f(iD);
                    long[] jArr4 = c2193y.f11813a;
                    int[] iArr6 = c2193y.f11814b;
                    int[] iArr7 = c2193y.f11815c;
                    int i35 = c2193y.f11816d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr3[i36 >> 3] >> ((i36 & 7) << 3)) & j11) < 128) {
                            int i37 = iArr4[i36];
                            int iHashCode3 = Integer.hashCode(i37) * (-862048943);
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = c2193y.b(i38 >>> 7);
                            long j14 = i38 & 127;
                            int i39 = iB4 >> 3;
                            int i40 = (iB4 & 7) << 3;
                            long j15 = (jArr4[i39] & (~(255 << i40))) | (j14 << i40);
                            jArr4[i39] = j15;
                            jArr4[(((iB4 - 7) & i35) + (i35 & 7)) >> 3] = j15;
                            iArr6[iB4] = i37;
                            iArr7[iB4] = iArr5[i36];
                        }
                        i36++;
                        jArr3 = jArr3;
                        iArr4 = iArr4;
                        j11 = 255;
                    }
                    iB = c2193y.b(i12);
                }
                c2193y.e++;
                int i41 = c2193y.f11817f;
                long[] jArr5 = c2193y.f11813a;
                int i42 = iB >> 3;
                long j16 = jArr5[i42];
                int i43 = (iB & 7) << 3;
                c2193y.f11817f = i41 - (((j16 >> i43) & 255) != 128 ? i7 : 1);
                int i44 = c2193y.f11816d;
                long j17 = (j16 & (~(255 << i43))) | (j5 << i43);
                jArr5[i42] = j17;
                jArr5[(((iB - 7) & i44) + (i44 & 7)) >> 3] = j17;
                i8 = ~iB;
                break;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
            c2193y = c2193y;
        }
        if (i8 < 0) {
            i8 = ~i8;
        }
        c2193y.f11814b[i8] = i5;
        c2193y.f11815c[i8] = i6;
    }

    public final int hashCode() {
        int[] iArr = this.f11814b;
        int[] iArr2 = this.f11815c;
        long[] jArr = this.f11813a;
        int length = jArr.length - 2;
        int i5 = 0;
        if (length >= 0) {
            int i6 = 0;
            int iHashCode = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i6 << 3) + i8;
                            int i10 = iArr[i9];
                            iHashCode += Integer.hashCode(iArr2[i9]) ^ Integer.hashCode(i10);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[DONT_INVERT, PHI: r8
  0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x006a A[LOOP:0: B:9:0x0020->B:21:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d A[EDGE_INSN: B:25:0x006d->B:22:0x006d BREAK  A[LOOP:0: B:9:0x0020->B:21:0x006a], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f11814b;
        int[] iArr2 = this.f11815c;
        long[] jArr = this.f11813a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i5 << 3) + i8;
                            int i10 = iArr[i9];
                            int i11 = iArr2[i9];
                            sb.append(i10);
                            sb.append("=");
                            sb.append(i11);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                    if (i5 != length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        o.e(string, "s.append('}').toString()");
        return string;
    }
}
