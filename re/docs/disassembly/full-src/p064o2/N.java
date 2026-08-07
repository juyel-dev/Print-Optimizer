package p064o2;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f12104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12106d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12107f;
    public final byte[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12108h;

    /* JADX WARN: Illegal instructions before constructor call */
    public N(String str, char[] cArr) {
        byte[] bArr = new byte[Fields.SpotShadowColor];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c5 = cArr[i5];
            if (!(c5 < 128)) {
                throw new IllegalArgumentException(AbstractC2198a.c("Non-ASCII character: %s", Character.valueOf(c5)));
            }
            if (!(bArr[c5] == -1)) {
                throw new IllegalArgumentException(AbstractC2198a.c("Duplicate character: %s", Character.valueOf(c5)));
            }
            bArr[c5] = (byte) i5;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n5 = (N) obj;
            if (this.f12108h == n5.f12108h && Arrays.equals(this.f12104b, n5.f12104b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12104b) + (true != this.f12108h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f12103a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public N(String str, char[] cArr, byte[] bArr, boolean z3) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i5;
        this.f12103a = str;
        cArr.getClass();
        this.f12104b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (S.f12113a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f12106d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i6 = 1 << (3 - iNumberOfTrailingZeros);
                        this.e = i6;
                        this.f12107f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f12105c = length - 1;
                        this.g = bArr;
                        zArr = new boolean[i6];
                        for (i5 = 0; i5 < this.f12107f; i5++) {
                            zArr[AbstractC2198a.a(i5 * 8, this.f12106d, RoundingMode.CEILING)] = true;
                        }
                        this.f12108h = z3;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f12106d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i7 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.e = i7;
                        this.f12107f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f12105c = length - 1;
                        this.g = bArr;
                        zArr = new boolean[i7];
                        while (i5 < this.f12107f) {
                            zArr[AbstractC2198a.a(i5 * 8, this.f12106d, RoundingMode.CEILING)] = true;
                        }
                        this.f12108h = z3;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f12106d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i8 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.e = i8;
                        this.f12107f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f12105c = length - 1;
                        this.g = bArr;
                        zArr = new boolean[i8];
                        while (i5 < this.f12107f) {
                            zArr[AbstractC2198a.a(i5 * 8, this.f12106d, RoundingMode.CEILING)] = true;
                        }
                        this.f12108h = z3;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(AbstractC1421mz.h(cArr.length, "Illegal alphabet length "), e);
        }
    }
}
