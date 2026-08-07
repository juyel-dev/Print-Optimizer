package p047l;

import C3.r;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11708d;
    public int e;

    public B(int i5) {
        this.f11705a = U.f11754a;
        this.f11706b = AbstractC2184o.f11791a;
        if (i5 >= 0) {
            f(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i5) {
        int i6 = this.f11708d;
        this.f11706b[d(i5)] = i5;
        return this.f11708d != i6;
    }

    public final void b() {
        this.f11708d = 0;
        long[] jArr = this.f11705a;
        if (jArr != U.f11754a) {
            r.N(jArr);
            long[] jArr2 = this.f11705a;
            int i5 = this.f11707c;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        this.e = U.c(this.f11707c) - this.f11708d;
    }

    public final boolean c(int i5) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f11707c;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f11705a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                if (this.f11706b[iNumberOfTrailingZeros] == i5) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0092  */
    public final int d(int i5) {
        long j5;
        int i6;
        int i7;
        int i8;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f11707c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f11705a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j7 = i11;
            int i17 = i14;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j9) >> 3)) & i12;
                if (this.f11706b[iNumberOfTrailingZeros] == i5) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j10 = 128;
                if (this.e == 0) {
                    long j11 = 254;
                    if (((this.f11705a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                        j5 = j7;
                        i6 = 0;
                    } else {
                        int i18 = this.f11707c;
                        if (i18 > 8) {
                            i7 = i10;
                            if (Long.compare((((long) this.f11708d) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                                long[] jArr2 = this.f11705a;
                                int i19 = this.f11707c;
                                int[] iArr = this.f11706b;
                                U.a(jArr2, i19);
                                int iB = -1;
                                int i20 = 0;
                                while (i20 != i19) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr2[i21] >> i22) & 255;
                                    if (j12 == j10) {
                                        int i23 = i20;
                                        i20++;
                                        iB = i23;
                                    } else if (j12 != j11) {
                                        i20++;
                                    } else {
                                        int iHashCode2 = Integer.hashCode(iArr[i20]) * (-862048943);
                                        int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i25 = i24 >>> 7;
                                        int iE2 = e(i25);
                                        int i26 = i25 & i19;
                                        if (((iE2 - i26) & i19) / 8 == ((i20 - i26) & i19) / 8) {
                                            jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (((long) (i24 & 127)) << i22);
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i20++;
                                        } else {
                                            int i27 = iB;
                                            int i28 = iE2 >> 3;
                                            long j13 = jArr2[i28];
                                            int i29 = (iE2 & 7) << 3;
                                            if (((j13 >> i29) & 255) == 128) {
                                                int i30 = i20;
                                                jArr2[i28] = (((long) (i24 & 127)) << i29) | (j13 & (~(255 << i29)));
                                                jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (128 << i22);
                                                iArr[iE2] = iArr[i30];
                                                iArr[i30] = 0;
                                                iB = i30;
                                                i8 = iB;
                                            } else {
                                                int i31 = i20;
                                                jArr2[i28] = (((long) (i24 & 127)) << i29) | (j13 & (~(255 << i29)));
                                                iB = i27 == -1 ? U.b(jArr2, i31 + 1, i19) : i27;
                                                iArr[iB] = iArr[iE2];
                                                iArr[iE2] = iArr[i31];
                                                iArr[i31] = iArr[iB];
                                                i8 = i31 - 1;
                                            }
                                            jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i20 = i8 + 1;
                                            j7 = j7;
                                        }
                                        j10 = 128;
                                        j11 = 254;
                                    }
                                }
                                j5 = j7;
                                i6 = 0;
                                this.e = U.c(this.f11707c) - this.f11708d;
                            }
                            iE = e(i7);
                        } else {
                            i7 = i10;
                        }
                        j5 = j7;
                        i6 = 0;
                        int iD = U.d(this.f11707c);
                        long[] jArr3 = this.f11705a;
                        int[] iArr2 = this.f11706b;
                        int i32 = this.f11707c;
                        f(iD);
                        long[] jArr4 = this.f11705a;
                        int[] iArr3 = this.f11706b;
                        int i33 = this.f11707c;
                        for (int i34 = 0; i34 < i32; i34++) {
                            if (((jArr3[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < 128) {
                                int i35 = iArr2[i34];
                                int iHashCode3 = Integer.hashCode(i35) * (-862048943);
                                int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                int iE3 = e(i36 >>> 7);
                                long j14 = i36 & 127;
                                int i37 = iE3 >> 3;
                                int i38 = (iE3 & 7) << 3;
                                long j15 = (jArr4[i37] & (~(255 << i38))) | (j14 << i38);
                                jArr4[i37] = j15;
                                jArr4[(((iE3 - 7) & i33) + (i33 & 7)) >> 3] = j15;
                                iArr3[iE3] = i35;
                            }
                        }
                        iE = e(i7);
                    }
                } else {
                    j5 = j7;
                    i6 = 0;
                }
                this.f11708d++;
                int i39 = this.e;
                long[] jArr5 = this.f11705a;
                int i40 = iE >> 3;
                long j16 = jArr5[i40];
                int i41 = (iE & 7) << 3;
                this.e = i39 - (((j16 >> i41) & 255) != 128 ? i6 : 1);
                int i42 = this.f11707c;
                long j17 = (j16 & (~(255 << i41))) | (j5 << i41);
                jArr5[i40] = j17;
                jArr5[(((iE - 7) & i42) + (i42 & 7)) >> 3] = j17;
                return iE;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int e(int i5) {
        int i6 = this.f11707c;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11705a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        if (b5.f11708d != this.f11708d) {
            return false;
        }
        int[] iArr = this.f11706b;
        long[] jArr = this.f11705a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128 && !b5.c(iArr[(i5 << 3) + i7])) {
                            return false;
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
        this.f11707c = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11705a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.e = U.c(this.f11707c) - this.f11708d;
        this.f11706b = new int[iMax];
    }

    public final void g(int i5) {
        this.f11708d--;
        long[] jArr = this.f11705a;
        int i6 = this.f11707c;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
    }

    public final int hashCode() {
        int[] iArr = this.f11706b;
        long[] jArr = this.f11705a;
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
                            iHashCode = Integer.hashCode(iArr[(i6 << 3) + i8]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f11706b;
        long[] jArr = this.f11705a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j5) < 128) {
                        int i9 = iArr[(i5 << 3) + i8];
                        if (i6 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i6 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i9);
                        i6++;
                    }
                    j5 >>= 8;
                }
                if (i7 == 8) {
                    if (i5 == length) {
                        i5++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i5 == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i5++;
        }
        String string = sb.toString();
        o.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ B() {
        this(6);
    }
}
