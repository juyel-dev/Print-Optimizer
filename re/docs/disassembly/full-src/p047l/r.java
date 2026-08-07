package p047l;

import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f11798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11800d;
    public int e;

    public final boolean a(long j5) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j5) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f11800d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f11797a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j6 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j7 = (((long) i6) * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i8) & i7;
                if (this.f11798b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b(long j5) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j5) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f11800d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f11797a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j6 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j7 = (((long) i6) * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i8) & i7;
                if (this.f11798b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final Object c(long j5) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j5) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f11800d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f11797a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j6 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j7 = (((long) i6) * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i8) & i7;
                if (this.f11798b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f11799c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[LOOP:0: B:14:0x0023->B:35:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[EDGE_INSN: B:38:0x0079->B:36:0x0079 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0076], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.e != this.e) {
            return false;
        }
        long[] jArr = this.f11798b;
        Object[] objArr = this.f11799c;
        long[] jArr2 = this.f11797a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr2[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i5 << 3) + i8;
                            long j6 = jArr[i9];
                            Object obj2 = objArr[i9];
                            if (obj2 == null) {
                                if (rVar.c(j6) != null || !rVar.b(j6)) {
                                    return false;
                                }
                            } else if (!obj2.equals(rVar.c(j6))) {
                                return false;
                            }
                            i6 = 8;
                        }
                        j5 >>= i6;
                    }
                    if (i7 != i6) {
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

    public final int hashCode() {
        long[] jArr = this.f11798b;
        Object[] objArr = this.f11799c;
        long[] jArr2 = this.f11797a;
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
                            long j6 = jArr[i9];
                            Object obj = objArr[i9];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j6);
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
        long[] jArr = this.f11798b;
        Object[] objArr = this.f11799c;
        long[] jArr2 = this.f11797a;
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
                            i6 = i7;
                            long j6 = jArr[i11];
                            Object obj = objArr[i11];
                            sb.append(j6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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
