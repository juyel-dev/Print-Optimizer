package p047l;

import C3.r;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11727d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11728f;

    public J(int i5) {
        this.f11724a = U.f11754a;
        Object[] objArr = a.f11872c;
        this.f11725b = objArr;
        this.f11726c = objArr;
        if (i5 >= 0) {
            f(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f11724a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11724a;
            int i5 = this.f11727d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        r.L(this.f11726c, 0, this.f11727d);
        r.L(this.f11725b, 0, this.f11727d);
        this.f11728f = U.c(this.f11727d) - this.e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f11727d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f11724a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (o.b(this.f11725b[iNumberOfTrailingZeros], obj)) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i5) {
        int i6 = this.f11727d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11724a;
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

    public final int d(Object obj) {
        long j5;
        int i5;
        int i6;
        int i7 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f11727d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11724a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (o.b(this.f11725b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i17 = 8;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iC = c(i9);
                long j10 = 128;
                long j11 = 255;
                if (this.f11728f != 0 || ((this.f11724a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j5 = j7;
                    i5 = 0;
                } else {
                    int i18 = this.f11727d;
                    if (i18 <= 8 || Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = j7;
                        i5 = 0;
                        int iD = U.d(this.f11727d);
                        long[] jArr2 = this.f11724a;
                        Object[] objArr = this.f11725b;
                        Object[] objArr2 = this.f11726c;
                        int i19 = this.f11727d;
                        f(iD);
                        long[] jArr3 = this.f11724a;
                        Object[] objArr3 = this.f11725b;
                        Object[] objArr4 = this.f11726c;
                        int i20 = this.f11727d;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr2[i21 >> 3] >> ((i21 & 7) << 3)) & j11) < 128) {
                                Object obj2 = objArr[i21];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC2 = c(i22 >>> 7);
                                long j12 = i22 & 127;
                                int i23 = iC2 >> 3;
                                int i24 = (iC2 & 7) << 3;
                                long j13 = (jArr3[i23] & (~(255 << i24))) | (j12 << i24);
                                jArr3[i23] = j13;
                                jArr3[(((iC2 - 7) & i20) + (i20 & 7)) >> 3] = j13;
                                objArr3[iC2] = obj2;
                                objArr4[iC2] = objArr2[i21];
                            }
                            i21++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j11 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f11724a;
                        int i25 = this.f11727d;
                        Object[] objArr5 = this.f11725b;
                        Object[] objArr6 = this.f11726c;
                        U.a(jArr4, i25);
                        int i26 = 0;
                        int iB = -1;
                        while (i26 != i25) {
                            int i27 = i26 >> 3;
                            int i28 = (i26 & 7) << 3;
                            long j14 = (jArr4[i27] >> i28) & 255;
                            if (j14 == j10) {
                                iB = i26;
                                i26++;
                            } else if (j14 != 254) {
                                i26++;
                            } else {
                                Object obj3 = objArr5[i26];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i7;
                                int i29 = iHashCode3 ^ (iHashCode3 << 16);
                                int i30 = i29 >>> 7;
                                int iC3 = c(i30);
                                int i31 = i30 & i25;
                                if (((iC3 - i31) & i25) / 8 == ((i26 - i31) & i25) / i17) {
                                    jArr4[i27] = (((long) (i29 & 127)) << i28) | (jArr4[i27] & (~(255 << i28)));
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i26++;
                                    i17 = 8;
                                    i7 = -862048943;
                                } else {
                                    int i32 = i26;
                                    int i33 = iC3 >> 3;
                                    long j15 = jArr4[i33];
                                    int i34 = (iC3 & 7) << 3;
                                    if (((j15 >> i34) & 255) == j10) {
                                        jArr4[i33] = (((long) (i29 & 127)) << i34) | (j15 & (~(255 << i34)));
                                        jArr4[i27] = (jArr4[i27] & (~(255 << i28))) | (128 << i28);
                                        objArr5[iC3] = objArr5[i32];
                                        objArr5[i32] = null;
                                        objArr6[iC3] = objArr6[i32];
                                        objArr6[i32] = null;
                                        i6 = i32;
                                        iB = i6;
                                    } else {
                                        jArr4[i33] = (((long) (i29 & 127)) << i34) | (j15 & (~(255 << i34)));
                                        int i35 = iB;
                                        iB = i35 == -1 ? U.b(jArr4, i32 + 1, i25) : i35;
                                        objArr5[iB] = objArr5[iC3];
                                        objArr5[iC3] = objArr5[i32];
                                        objArr5[i32] = objArr5[iB];
                                        objArr6[iB] = objArr6[iC3];
                                        objArr6[iC3] = objArr6[i32];
                                        objArr6[i32] = objArr6[iB];
                                        i6 = i32 - 1;
                                    }
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i26 = i6 + 1;
                                    j7 = j7;
                                    i17 = 8;
                                    i7 = -862048943;
                                    j10 = 128;
                                }
                            }
                        }
                        j5 = j7;
                        i5 = 0;
                        this.f11728f = U.c(this.f11727d) - this.e;
                    }
                    iC = c(i9);
                }
                this.e++;
                int i36 = this.f11728f;
                long[] jArr5 = this.f11724a;
                int i37 = iC >> 3;
                long j16 = jArr5[i37];
                int i38 = (iC & 7) << 3;
                this.f11728f = i36 - (((j16 >> i38) & 255) != 128 ? i5 : 1);
                int i39 = this.f11727d;
                long j17 = (j16 & (~(255 << i38))) | (j5 << i38);
                jArr5[i37] = j17;
                jArr5[(((iC - 7) & i39) + (i39 & 7)) >> 3] = j17;
                return ~iC;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = -862048943;
        }
    }

    public final Object e(Object obj) {
        int iNumberOfTrailingZeros;
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11727d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f11724a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (o.b(this.f11725b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f11726c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j5 = (J) obj;
        if (j5.e != this.e) {
            return false;
        }
        Object[] objArr = this.f11725b;
        Object[] objArr2 = this.f11726c;
        long[] jArr = this.f11724a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j6 = jArr[i5];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j6) < 128) {
                            int i8 = (i5 << 3) + i7;
                            Object obj2 = objArr[i8];
                            Object obj3 = objArr2[i8];
                            if (obj3 == null) {
                                if (j5.e(obj2) != null || !j5.b(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(j5.e(obj2))) {
                                return false;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 != length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return true;
    }

    public final void f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11727d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11724a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11728f = U.c(this.f11727d) - this.e;
        this.f11725b = new Object[iMax];
        this.f11726c = new Object[iMax];
    }

    public final boolean g() {
        return this.e == 0;
    }

    public final Object h(Object obj) {
        int iNumberOfTrailingZeros;
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11727d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f11724a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (o.b(this.f11725b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return i(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final int hashCode() {
        Object[] objArr = this.f11725b;
        Object[] objArr2 = this.f11726c;
        long[] jArr = this.f11724a;
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
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final Object i(int i5) {
        this.e--;
        long[] jArr = this.f11724a;
        int i6 = this.f11727d;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f11725b[i5] = null;
        Object[] objArr = this.f11726c;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    public final void j(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f11725b[iD] = obj;
        this.f11726c[iD] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[DONT_INVERT, PHI: r8
  0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[LOOP:0: B:9:0x0022->B:27:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[EDGE_INSN: B:31:0x0079->B:28:0x0079 BREAK  A[LOOP:0: B:9:0x0022->B:27:0x0076], SYNTHETIC] */
    public final String toString() {
        if (g()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f11725b;
        Object[] objArr2 = this.f11726c;
        long[] jArr = this.f11724a;
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
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ J() {
        this(6);
    }
}
