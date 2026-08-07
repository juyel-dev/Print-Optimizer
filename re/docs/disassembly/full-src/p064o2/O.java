package p064o2;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends Q {
    public final char[] e;

    public O(N n5) {
        super(n5, (Character) null);
        this.e = new char[Fields.RotationY];
        char[] cArr = n5.f12104b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i5 = 0; i5 < 256; i5++) {
            char[] cArr2 = this.e;
            cArr2[i5] = cArr[i5 >>> 4];
            cArr2[i5 | Fields.RotationX] = cArr[i5 & 15];
        }
    }

    @Override // p064o2.Q
    public final void a(StringBuilder sb, byte[] bArr, int i5) {
        AbstractC2198a.m(0, i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = bArr[i6] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i7]);
            sb.append(cArr[i7 | Fields.RotationX]);
        }
    }
}
