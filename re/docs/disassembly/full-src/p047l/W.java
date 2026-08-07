package p047l;

import C3.C0121a;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11764d;

    public final boolean a(Object obj) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b() {
        return this.f11764d == 0;
    }

    public final boolean c() {
        return this.f11764d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w4 = (W) obj;
        if (w4.f11764d != this.f11764d) {
            return false;
        }
        Object[] objArr = this.f11762b;
        long[] jArr = this.f11761a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128 && !w4.a(objArr[(i5 << 3) + i7])) {
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

    public final int hashCode() {
        Object[] objArr = this.f11762b;
        long[] jArr = this.f11761a;
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
                            Object obj = objArr[(i6 << 3) + i8];
                            iHashCode += obj != null ? obj.hashCode() : 0;
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

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[DONT_INVERT, PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[LOOP:0: B:5:0x001c->B:20:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[SYNTHETIC] */
    public final String toString() {
        C0121a c0121a = new C0121a(this, 8);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f11762b;
        long[] jArr = this.f11761a;
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
                        Object obj = objArr[(i5 << 3) + i8];
                        if (i6 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i6 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) c0121a.invoke(obj));
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
}
