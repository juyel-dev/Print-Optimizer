package p064o2;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O f12109d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f12110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f12111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Q f12112c;

    static {
        new P("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new P("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new Q("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new Q("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f12109d = new O(new N("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public Q(N n5, Character ch) {
        this.f12110a = n5;
        if (ch != null) {
            byte[] bArr = n5.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC2198a.c("Padding character %s was already in alphabet", ch));
            }
        }
        this.f12111b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i5) {
        int i6 = 0;
        AbstractC2198a.m(0, i5, bArr.length);
        while (i6 < i5) {
            N n5 = this.f12110a;
            b(sb, bArr, i6, Math.min(n5.f12107f, i5 - i6));
            i6 += n5.f12107f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i5, int i6) {
        int i7;
        AbstractC2198a.m(i5, i5 + i6, bArr.length);
        N n5 = this.f12110a;
        if (i6 > n5.f12107f) {
            throw new IllegalArgumentException();
        }
        int i8 = 0;
        long j5 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            j5 = (j5 | ((long) (bArr[i5 + i9] & 255))) << 8;
        }
        int i10 = (i6 + 1) * 8;
        while (true) {
            int i11 = i6 * 8;
            i7 = n5.f12106d;
            if (i8 >= i11) {
                break;
            }
            sb.append(n5.f12104b[((int) (j5 >>> ((i10 - i7) - i8))) & n5.f12105c]);
            i8 += i7;
        }
        if (this.f12111b != null) {
            while (i8 < n5.f12107f * 8) {
                sb.append('=');
                i8 += i7;
            }
        }
    }

    public final String c(byte[] bArr, int i5) {
        AbstractC2198a.m(0, i5, bArr.length);
        N n5 = this.f12110a;
        StringBuilder sb = new StringBuilder(n5.e * AbstractC2198a.a(i5, n5.f12107f, RoundingMode.CEILING));
        try {
            a(sb, bArr, i5);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            Q q = (Q) obj;
            if (this.f12110a.equals(q.f12110a) && Objects.equals(this.f12111b, q.f12111b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12110a.hashCode() ^ Objects.hashCode(this.f12111b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        N n5 = this.f12110a;
        sb.append(n5);
        if (8 % n5.f12106d != 0) {
            Character ch = this.f12111b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public Q(String str, String str2) {
        this(new N(str, str2.toCharArray()), (Character) '=');
    }
}
