package p064o2;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends Q {
    /* JADX WARN: Illegal instructions before constructor call */
    public P(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new N(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p064o2.Q
    public final void a(StringBuilder sb, byte[] bArr, int i5) {
        int i6 = 0;
        AbstractC2198a.m(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            int i8 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i6 + 2] & 255);
            N n5 = this.f12110a;
            sb.append(n5.f12104b[i8 >>> 18]);
            char[] cArr = n5.f12104b;
            sb.append(cArr[(i8 >>> 12) & 63]);
            sb.append(cArr[(i8 >>> 6) & 63]);
            sb.append(cArr[i8 & 63]);
            i6 += 3;
        }
        if (i6 < i5) {
            b(sb, bArr, i6, i5 - i6);
        }
    }
}
