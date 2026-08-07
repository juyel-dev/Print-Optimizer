package p064o2;

import androidx.compose.foundation.text.modifiers.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f12128o;

    public b0(X x4) {
        this.f12128o = x4;
    }

    @Override // p064o2.h0
    public final int a() {
        return h0.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h0 h0Var = (h0) obj;
        int iA = h0Var.a();
        int iD = h0.d((byte) 64);
        if (iD != iA) {
            return iD - h0Var.a();
        }
        X x4 = this.f12128o;
        byte[] bArr = x4.p;
        int length = bArr.length;
        X x5 = ((b0) h0Var).f12128o;
        byte[] bArr2 = x5.p;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return U.f12115a.compare(x4.t(), x5.t());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            return this.f12128o.equals(((b0) obj).f12128o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h0.d((byte) 64)), this.f12128o});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        N n5;
        int i5;
        boolean z3;
        O o5 = Q.f12109d;
        Q o6 = o5.f12112c;
        if (o6 == null) {
            N n6 = o5.f12110a;
            int i6 = 0;
            while (true) {
                char[] cArr = n6.f12104b;
                if (i6 >= cArr.length) {
                    n5 = n6;
                    break;
                }
                char c5 = cArr[i6];
                if (c5 >= 'a' && c5 <= 'z') {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= cArr.length) {
                            z3 = false;
                            break;
                        }
                        char c6 = cArr[i7];
                        if (c6 >= 'A' && c6 <= 'Z') {
                            z3 = true;
                            break;
                        }
                        i7++;
                    }
                    if (!z3) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i8 = 0; i8 < cArr.length; i8++) {
                            char c7 = cArr[i8];
                            if (c7 >= 97 && c7 <= 122) {
                                c7 ^= 32;
                            }
                            cArr2[i8] = (char) c7;
                        }
                        n5 = new N(n6.f12103a.concat(".upperCase()"), cArr2);
                        if (!n6.f12108h || n5.f12108h) {
                            break;
                            break;
                        }
                        byte[] bArr = n5.g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i5 = 65; i5 <= 90; i5++) {
                            int i9 = i5 | 32;
                            byte b5 = bArr[i5];
                            byte b6 = bArr[i9];
                            if (b5 == -1) {
                                bArrCopyOf[i5] = b6;
                            } else {
                                char c8 = (char) i5;
                                char c9 = (char) i9;
                                if (b6 != -1) {
                                    throw new IllegalStateException(AbstractC2198a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c8), Character.valueOf(c9)));
                                }
                                bArrCopyOf[i9] = b5;
                            }
                        }
                        n5 = new N(n5.f12103a.concat(".ignoreCase()"), n5.f12104b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i6++;
            }
            o6 = n5 == n6 ? o5 : new O(n5);
            o5.f12112c = o6;
        }
        byte[] bArrT = this.f12128o.t();
        return a.z("h'", o6.c(bArrT, bArrT.length), "'");
    }
}
