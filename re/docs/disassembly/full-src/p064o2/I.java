package p064o2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char[] f12095o = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z3;
        if (obj instanceof I) {
            I i5 = (I) obj;
            byte[] bArr = ((H) this).p;
            if (bArr.length * 8 == ((H) i5).p.length * 8) {
                byte[] bArr2 = ((H) i5).p;
                if (bArr.length == bArr2.length) {
                    z3 = true;
                    for (int i6 = 0; i6 < bArr.length; i6++) {
                        z3 &= bArr[i6] == bArr2[i6];
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((H) this).p;
        if (bArr.length * 8 < 32) {
            int i5 = bArr[0] & 255;
            for (int i6 = 1; i6 < bArr.length; i6++) {
                i5 |= (bArr[i6] & 255) << (i6 * 8);
            }
            return i5;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(AbstractC2198a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i7 = bArr[0] & 255;
        int i8 = bArr[1] & 255;
        int i9 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i7 | (i8 << 8) | (i9 << 16);
    }

    public final String toString() {
        byte[] bArr = ((H) this).p;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b5 : bArr) {
            char[] cArr = f12095o;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & 15]);
        }
        return sb.toString();
    }
}
