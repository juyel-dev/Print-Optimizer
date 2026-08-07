package p064o2;

import com.google.android.gms.internal.measurement.S1;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public class X implements Iterable, Serializable {
    public static final X q = new X(Y.f12120a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12119o = 0;
    public final byte[] p;

    static {
        int i5 = V.f12116a;
    }

    public X(byte[] bArr) {
        bArr.getClass();
        this.p = bArr;
    }

    public static int r(int i5, int i6, int i7) {
        int i8 = i6 - i5;
        if ((i5 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(a.k("Beginning index: ", i5, " < 0"));
        }
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(a.m("Beginning index larger than ending index: ", ", ", i5, i6));
        }
        throw new IndexOutOfBoundsException(a.m("End index: ", " >= ", i6, i7));
    }

    public static X s(byte[] bArr, int i5) {
        r(0, i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return new X(bArr2);
    }

    public byte c(int i5) {
        return this.p[i5];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X) || k() != ((X) obj).k()) {
            return false;
        }
        if (k() == 0) {
            return true;
        }
        if (!(obj instanceof X)) {
            return obj.equals(this);
        }
        X x4 = (X) obj;
        int i5 = this.f12119o;
        int i6 = x4.f12119o;
        if (i5 != 0 && i6 != 0 && i5 != i6) {
            return false;
        }
        int iK = k();
        if (iK > x4.k()) {
            throw new IllegalArgumentException("Length too large: " + iK + k());
        }
        if (iK > x4.k()) {
            throw new IllegalArgumentException(a.m("Ran off end of other: 0, ", ", ", iK, x4.k()));
        }
        int i7 = i() + iK;
        int i8 = i();
        int i9 = x4.i();
        while (i8 < i7) {
            if (this.p[i8] != x4.p[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    public byte g(int i5) {
        return this.p[i5];
    }

    public final int hashCode() {
        int i5 = this.f12119o;
        if (i5 != 0) {
            return i5;
        }
        int iK = k();
        int i6 = i();
        byte[] bArr = Y.f12120a;
        int i7 = iK;
        for (int i8 = i6; i8 < i6 + iK; i8++) {
            i7 = (i7 * 31) + this.p[i8];
        }
        int i9 = i7 != 0 ? i7 : 1;
        this.f12119o = i9;
        return i9;
    }

    public int i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new S1(this);
    }

    public int k() {
        return this.p.length;
    }

    public void l(byte[] bArr, int i5) {
        System.arraycopy(this.p, 0, bArr, 0, i5);
    }

    public final ByteArrayInputStream o() {
        return new ByteArrayInputStream(this.p, i(), k());
    }

    public final byte[] t() {
        int iK = k();
        if (iK == 0) {
            return Y.f12120a;
        }
        byte[] bArr = new byte[iK];
        l(bArr, iK);
        return bArr;
    }

    public final String toString() {
        X w4;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iK = k();
        if (k() <= 50) {
            strConcat = AbstractC2198a.d(this);
        } else {
            int iR = r(0, 47, k());
            if (iR == 0) {
                w4 = q;
            } else {
                w4 = new W(this.p, i(), iR);
            }
            strConcat = AbstractC2198a.d(w4).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iK);
        sb.append(" contents=\"");
        return a.p(sb, strConcat, "\">");
    }
}
