package p047l;

import C3.r;
import kotlin.jvm.internal.o;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11716f;

    public G(int i5) {
        this.f11741a = U.f11754a;
        this.f11742b = a.f11872c;
        this.f11743c = AbstractC2184o.f11791a;
        if (i5 >= 0) {
            e(U.f(i5));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i5) {
        int i6 = this.f11744d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f11741a;
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
        int i6 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f11744d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f11741a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j6 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j7 = i9;
            int i15 = i9;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j9) >> 3)) & i10;
                if (o.b(this.f11742b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i16 = 8;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iC = c(i8);
                long j10 = 128;
                long j11 = 255;
                if (this.f11716f != 0 || ((this.f11741a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j5 = j7;
                    i5 = 0;
                } else {
                    int i17 = this.f11744d;
                    if (i17 <= 8 || Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = j7;
                        i5 = 0;
                        int iD = U.d(this.f11744d);
                        long[] jArr2 = this.f11741a;
                        Object[] objArr = this.f11742b;
                        int[] iArr = this.f11743c;
                        int i18 = this.f11744d;
                        e(iD);
                        long[] jArr3 = this.f11741a;
                        Object[] objArr2 = this.f11742b;
                        int[] iArr2 = this.f11743c;
                        int i19 = this.f11744d;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr2[i20 >> 3] >> ((i20 & 7) << 3)) & j11) < 128) {
                                Object obj2 = objArr[i20];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i21 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC2 = c(i21 >>> 7);
                                long j12 = i21 & 127;
                                int i22 = iC2 >> 3;
                                int i23 = (iC2 & 7) << 3;
                                long j13 = (jArr3[i22] & (~(255 << i23))) | (j12 << i23);
                                jArr3[i22] = j13;
                                jArr3[(((iC2 - 7) & i19) + (i19 & 7)) >> 3] = j13;
                                objArr2[iC2] = obj2;
                                iArr2[iC2] = iArr[i20];
                            }
                            i20++;
                            jArr2 = jArr2;
                            objArr = objArr;
                            j11 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f11741a;
                        int i24 = this.f11744d;
                        Object[] objArr3 = this.f11742b;
                        int[] iArr3 = this.f11743c;
                        U.a(jArr4, i24);
                        int i25 = 0;
                        int iB = -1;
                        while (i25 != i24) {
                            int i26 = i25 >> 3;
                            int i27 = (i25 & 7) << 3;
                            long j14 = (jArr4[i26] >> i27) & 255;
                            if (j14 == j10) {
                                iB = i25;
                                i25++;
                            } else if (j14 != 254) {
                                i25++;
                            } else {
                                Object obj3 = objArr3[i25];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i6;
                                int i28 = iHashCode3 ^ (iHashCode3 << 16);
                                int i29 = i28 >>> 7;
                                int iC3 = c(i29);
                                int i30 = i29 & i24;
                                if (((iC3 - i30) & i24) / 8 == ((i25 - i30) & i24) / i16) {
                                    jArr4[i26] = (((long) (i28 & 127)) << i27) | (jArr4[i26] & (~(255 << i27)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i25++;
                                    i16 = 8;
                                    i6 = -862048943;
                                } else {
                                    int i31 = i25;
                                    int i32 = iC3 >> 3;
                                    long j15 = jArr4[i32];
                                    int i33 = (iC3 & 7) << 3;
                                    if (((j15 >> i33) & 255) == j10) {
                                        jArr4[i32] = (((long) (i28 & 127)) << i33) | (j15 & (~(255 << i33)));
                                        jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (128 << i27);
                                        objArr3[iC3] = objArr3[i31];
                                        objArr3[i31] = null;
                                        iArr3[iC3] = iArr3[i31];
                                        iArr3[i31] = 0;
                                        iB = i31;
                                    } else {
                                        jArr4[i32] = (((long) (i28 & 127)) << i33) | (j15 & (~(255 << i33)));
                                        int i34 = iB;
                                        iB = i34 == -1 ? U.b(jArr4, i31 + 1, i24) : i34;
                                        objArr3[iB] = objArr3[iC3];
                                        objArr3[iC3] = objArr3[i31];
                                        objArr3[i31] = objArr3[iB];
                                        iArr3[iB] = iArr3[iC3];
                                        iArr3[iC3] = iArr3[i31];
                                        iArr3[i31] = iArr3[iB];
                                        i31--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i25 = i31 + 1;
                                    j7 = j7;
                                    i16 = 8;
                                    i6 = -862048943;
                                    j10 = 128;
                                }
                            }
                        }
                        j5 = j7;
                        i5 = 0;
                        this.f11716f = U.c(this.f11744d) - this.e;
                    }
                    iC = c(i8);
                }
                this.e++;
                int i35 = this.f11716f;
                long[] jArr5 = this.f11741a;
                int i36 = iC >> 3;
                long j16 = jArr5[i36];
                int i37 = (iC & 7) << 3;
                this.f11716f = i35 - (((j16 >> i37) & 255) != 128 ? i5 : 1);
                int i38 = this.f11744d;
                long j17 = (j16 & (~(255 << i37))) | (j5 << i37);
                jArr5[i36] = j17;
                jArr5[(((iC - 7) & i38) + (i38 & 7)) >> 3] = j17;
                return ~iC;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i6 = -862048943;
        }
    }

    public final void e(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, U.e(i5)) : 0;
        this.f11744d = iMax;
        if (iMax == 0) {
            jArr = U.f11754a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            r.N(jArr);
        }
        this.f11741a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f11716f = U.c(this.f11744d) - this.e;
        this.f11742b = new Object[iMax];
        this.f11743c = new int[iMax];
    }

    public final void f(int i5) {
        this.e--;
        long[] jArr = this.f11741a;
        int i6 = this.f11744d;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f11742b[i5] = null;
    }

    public final void g(int i5, Object obj) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f11742b[iD] = obj;
        this.f11743c[iD] = i5;
    }

    public /* synthetic */ G() {
        this(6);
    }
}
