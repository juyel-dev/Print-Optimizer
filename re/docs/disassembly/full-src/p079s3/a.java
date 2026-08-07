package p079s3;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import com.razorpay.AppSignatureHelper;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import p046k2.h;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String[] f12350B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f12351C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StringReader f12352o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f12359z;
    public boolean p = false;
    public final char[] q = new char[Fields.RotationZ];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12353r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12354s = 0;
    public int t = 0;
    public int u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12355v = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12349A = 1;

    static {
        h.p = new h(22);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f12359z = iArr;
        iArr[0] = 6;
        this.f12350B = new String[32];
        this.f12351C = new int[32];
        this.f12352o = stringReader;
    }

    public final String A() {
        StringBuilder sbQ = p035i0.a.q(" at line ", this.t + 1, " column ", (this.f12353r - this.u) + 1, " path ");
        sbQ.append(u(false));
        return sbQ.toString();
    }

    public final boolean B() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 5) {
            this.f12355v = 0;
            int[] iArr = this.f12351C;
            int i6 = this.f12349A - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (i5 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + b.D(L()) + A());
        }
        this.f12355v = 0;
        int[] iArr2 = this.f12351C;
        int i7 = this.f12349A - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return false;
    }

    public final double C() throws IOException {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 15) {
            this.f12355v = 0;
            int[] iArr = this.f12351C;
            int i6 = this.f12349A - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f12356w;
        }
        if (i5 == 16) {
            this.f12358y = new String(this.q, this.f12353r, this.f12357x);
            this.f12353r += this.f12357x;
        } else if (i5 == 8 || i5 == 9) {
            this.f12358y = I(i5 == 8 ? '\'' : '\"');
        } else if (i5 == 10) {
            this.f12358y = K();
        } else if (i5 != 11) {
            throw new IllegalStateException("Expected a double but was " + b.D(L()) + A());
        }
        this.f12355v = 11;
        double d4 = Double.parseDouble(this.f12358y);
        if (!this.p && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new c("JSON forbids NaN and infinities: " + d4 + A());
        }
        this.f12358y = null;
        this.f12355v = 0;
        int[] iArr2 = this.f12351C;
        int i7 = this.f12349A - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return d4;
    }

    public final int D() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 15) {
            long j5 = this.f12356w;
            int i6 = (int) j5;
            if (j5 != i6) {
                throw new NumberFormatException("Expected an int but was " + this.f12356w + A());
            }
            this.f12355v = 0;
            int[] iArr = this.f12351C;
            int i7 = this.f12349A - 1;
            iArr[i7] = iArr[i7] + 1;
            return i6;
        }
        if (i5 == 16) {
            this.f12358y = new String(this.q, this.f12353r, this.f12357x);
            this.f12353r += this.f12357x;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw new IllegalStateException("Expected an int but was " + b.D(L()) + A());
            }
            if (i5 == 10) {
                this.f12358y = K();
            } else {
                this.f12358y = I(i5 == 8 ? '\'' : '\"');
            }
            try {
                int i8 = Integer.parseInt(this.f12358y);
                this.f12355v = 0;
                int[] iArr2 = this.f12351C;
                int i9 = this.f12349A - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f12355v = 11;
        double d4 = Double.parseDouble(this.f12358y);
        int i10 = (int) d4;
        if (i10 != d4) {
            throw new NumberFormatException("Expected an int but was " + this.f12358y + A());
        }
        this.f12358y = null;
        this.f12355v = 0;
        int[] iArr3 = this.f12351C;
        int i11 = this.f12349A - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return i10;
    }

    public final long E() throws IOException {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 15) {
            this.f12355v = 0;
            int[] iArr = this.f12351C;
            int i6 = this.f12349A - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f12356w;
        }
        if (i5 == 16) {
            this.f12358y = new String(this.q, this.f12353r, this.f12357x);
            this.f12353r += this.f12357x;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw new IllegalStateException("Expected a long but was " + b.D(L()) + A());
            }
            if (i5 == 10) {
                this.f12358y = K();
            } else {
                this.f12358y = I(i5 == 8 ? '\'' : '\"');
            }
            try {
                long j5 = Long.parseLong(this.f12358y);
                this.f12355v = 0;
                int[] iArr2 = this.f12351C;
                int i7 = this.f12349A - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return j5;
            } catch (NumberFormatException unused) {
            }
        }
        this.f12355v = 11;
        double d4 = Double.parseDouble(this.f12358y);
        long j6 = (long) d4;
        if (j6 != d4) {
            throw new NumberFormatException("Expected a long but was " + this.f12358y + A());
        }
        this.f12358y = null;
        this.f12355v = 0;
        int[] iArr3 = this.f12351C;
        int i8 = this.f12349A - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return j6;
    }

    public final String F() {
        String strI;
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 14) {
            strI = K();
        } else if (i5 == 12) {
            strI = I('\'');
        } else {
            if (i5 != 13) {
                throw new IllegalStateException("Expected a name but was " + b.D(L()) + A());
            }
            strI = I('\"');
        }
        this.f12355v = 0;
        this.f12350B[this.f12349A - 1] = strI;
        return strI;
    }

    public final int G(boolean z3) throws IOException {
        int i5 = this.f12353r;
        int i6 = this.f12354s;
        while (true) {
            if (i5 == i6) {
                this.f12353r = i5;
                if (!p(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + A());
                }
                i5 = this.f12353r;
                i6 = this.f12354s;
            }
            int i7 = i5 + 1;
            char[] cArr = this.q;
            char c5 = cArr[i5];
            if (c5 == '\n') {
                this.t++;
                this.u = i7;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.f12353r = i7;
                    if (i7 == i6) {
                        this.f12353r = i5;
                        boolean zP = p(2);
                        this.f12353r++;
                        if (!zP) {
                            return c5;
                        }
                    }
                    h();
                    int i8 = this.f12353r;
                    char c6 = cArr[i8];
                    if (c6 == '*') {
                        this.f12353r = i8 + 1;
                        while (true) {
                            if (this.f12353r + 2 > this.f12354s && !p(2)) {
                                S("Unterminated comment");
                                throw null;
                            }
                            int i9 = this.f12353r;
                            if (cArr[i9] != '\n') {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 2) {
                                        i5 = this.f12353r + 2;
                                        i6 = this.f12354s;
                                        break;
                                    }
                                    if (cArr[this.f12353r + i10] != "*/".charAt(i10)) {
                                        break;
                                    }
                                    i10++;
                                }
                            } else {
                                this.t++;
                                this.u = i9 + 1;
                            }
                            this.f12353r++;
                        }
                    } else {
                        if (c6 != '/') {
                            return c5;
                        }
                        this.f12353r = i8 + 1;
                        P();
                        i5 = this.f12353r;
                        i6 = this.f12354s;
                    }
                } else {
                    if (c5 != '#') {
                        this.f12353r = i7;
                        return c5;
                    }
                    this.f12353r = i7;
                    h();
                    P();
                    i5 = this.f12353r;
                    i6 = this.f12354s;
                }
            }
            i5 = i7;
        }
    }

    public final void H() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 != 7) {
            throw new IllegalStateException("Expected null but was " + b.D(L()) + A());
        }
        this.f12355v = 0;
        int[] iArr = this.f12351C;
        int i6 = this.f12349A - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final String I(char c5) throws c {
        int i5;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i6 = this.f12353r;
            int i7 = this.f12354s;
            while (true) {
                int i8 = i7;
                i5 = i6;
                while (true) {
                    cArr = this.q;
                    if (i6 < i8) {
                        int i9 = i6 + 1;
                        char c6 = cArr[i6];
                        if (c6 == c5) {
                            this.f12353r = i9;
                            int i10 = (i9 - i5) - 1;
                            if (sb == null) {
                                return new String(cArr, i5, i10);
                            }
                            sb.append(cArr, i5, i10);
                            return sb.toString();
                        }
                        if (c6 == '\\') {
                            this.f12353r = i9;
                            int i11 = i9 - i5;
                            int i12 = i11 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i11 * 2, 16));
                            }
                            sb.append(cArr, i5, i12);
                            sb.append(N());
                            i6 = this.f12353r;
                            i7 = this.f12354s;
                        } else {
                            if (c6 == '\n') {
                                this.t++;
                                this.u = i9;
                            }
                            i6 = i9;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i6 - i5) * 2, 16));
            }
            sb.append(cArr, i5, i6 - i5);
            this.f12353r = i6;
        } while (p(1));
        S("Unterminated string");
        throw null;
    }

    public final String J() {
        String str;
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 10) {
            str = K();
        } else if (i5 == 8) {
            str = I('\'');
        } else if (i5 == 9) {
            str = I('\"');
        } else if (i5 == 11) {
            str = this.f12358y;
            this.f12358y = null;
        } else if (i5 == 15) {
            str = Long.toString(this.f12356w);
        } else {
            if (i5 != 16) {
                throw new IllegalStateException("Expected a string but was " + b.D(L()) + A());
            }
            str = new String(this.q, this.f12353r, this.f12357x);
            this.f12353r += this.f12357x;
        }
        this.f12355v = 0;
        int[] iArr = this.f12351C;
        int i6 = this.f12349A - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String K() throws c {
        String string;
        StringBuilder sb = null;
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (true) {
                int i7 = this.f12353r;
                int i8 = i7 + i6;
                int i9 = this.f12354s;
                char[] cArr = this.q;
                if (i8 < i9) {
                    char c5 = cArr[i7 + i6];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i6++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    i5 = i6;
                } else if (i6 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i6, 16));
                    }
                    sb.append(cArr, this.f12353r, i6);
                    this.f12353r += i6;
                    if (!p(1)) {
                    }
                } else if (!p(i6 + 1)) {
                    i5 = i6;
                }
                if (sb == null) {
                    string = new String(cArr, this.f12353r, i5);
                } else {
                    sb.append(cArr, this.f12353r, i5);
                    string = sb.toString();
                }
                this.f12353r += i5;
                return string;
            }
        }
    }

    public final int L() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        switch (i5) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
            case 10:
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                return 6;
            case Matrix.TranslateX /* 12 */:
            case Matrix.TranslateY /* 13 */:
            case Matrix.TranslateZ /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void M(int i5) {
        int i6 = this.f12349A;
        int[] iArr = this.f12359z;
        if (i6 == iArr.length) {
            int i7 = i6 * 2;
            this.f12359z = Arrays.copyOf(iArr, i7);
            this.f12351C = Arrays.copyOf(this.f12351C, i7);
            this.f12350B = (String[]) Arrays.copyOf(this.f12350B, i7);
        }
        int[] iArr2 = this.f12359z;
        int i8 = this.f12349A;
        this.f12349A = i8 + 1;
        iArr2[i8] = i5;
    }

    public final char N() throws c {
        int i5;
        if (this.f12353r == this.f12354s && !p(1)) {
            S("Unterminated escape sequence");
            throw null;
        }
        int i6 = this.f12353r;
        int i7 = i6 + 1;
        this.f12353r = i7;
        char[] cArr = this.q;
        char c5 = cArr[i6];
        if (c5 == '\n') {
            this.t++;
            this.u = i7;
        } else if (c5 != '\"' && c5 != '\'' && c5 != '/' && c5 != '\\') {
            if (c5 == 'b') {
                return '\b';
            }
            if (c5 == 'f') {
                return '\f';
            }
            if (c5 == 'n') {
                return '\n';
            }
            if (c5 == 'r') {
                return '\r';
            }
            if (c5 == 't') {
                return '\t';
            }
            if (c5 != 'u') {
                S("Invalid escape sequence");
                throw null;
            }
            if (i6 + 5 > this.f12354s && !p(4)) {
                S("Unterminated escape sequence");
                throw null;
            }
            int i8 = this.f12353r;
            int i9 = i8 + 4;
            char c6 = 0;
            while (i8 < i9) {
                char c7 = cArr[i8];
                char c8 = (char) (c6 << 4);
                if (c7 >= '0' && c7 <= '9') {
                    i5 = c7 - '0';
                } else if (c7 >= 'a' && c7 <= 'f') {
                    i5 = c7 - 'W';
                } else {
                    if (c7 < 'A' || c7 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f12353r, 4)));
                    }
                    i5 = c7 - '7';
                }
                c6 = (char) (i5 + c8);
                i8++;
            }
            this.f12353r += 4;
            return c6;
        }
        return c5;
    }

    public final void O(char c5) throws c {
        do {
            int i5 = this.f12353r;
            int i6 = this.f12354s;
            while (i5 < i6) {
                int i7 = i5 + 1;
                char c6 = this.q[i5];
                if (c6 == c5) {
                    this.f12353r = i7;
                    return;
                }
                if (c6 == '\\') {
                    this.f12353r = i7;
                    N();
                    i5 = this.f12353r;
                    i6 = this.f12354s;
                } else {
                    if (c6 == '\n') {
                        this.t++;
                        this.u = i7;
                    }
                    i5 = i7;
                }
            }
            this.f12353r = i5;
        } while (p(1));
        S("Unterminated string");
        throw null;
    }

    public final void P() {
        char c5;
        do {
            if (this.f12353r >= this.f12354s && !p(1)) {
                return;
            }
            int i5 = this.f12353r;
            int i6 = i5 + 1;
            this.f12353r = i6;
            c5 = this.q[i5];
            if (c5 == '\n') {
                this.t++;
                this.u = i6;
                return;
            }
        } while (c5 != '\r');
    }

    public final void Q() throws c {
        do {
            int i5 = 0;
            while (true) {
                int i6 = this.f12353r;
                if (i6 + i5 < this.f12354s) {
                    char c5 = this.q[i6 + i5];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    this.f12353r += i5;
                    return;
                }
                this.f12353r = i6 + i5;
            }
        } while (p(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void R() throws IOException {
        int i5 = 0;
        do {
            int i6 = this.f12355v;
            if (i6 == 0) {
                i6 = i();
            }
            switch (i6) {
                case 1:
                    M(3);
                    i5++;
                    this.f12355v = 0;
                    break;
                case 2:
                    if (i5 == 0) {
                        this.f12350B[this.f12349A - 1] = null;
                    }
                    this.f12349A--;
                    i5--;
                    this.f12355v = 0;
                    break;
                case 3:
                    M(1);
                    i5++;
                    this.f12355v = 0;
                    break;
                case 4:
                    this.f12349A--;
                    i5--;
                    this.f12355v = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                case 15:
                default:
                    this.f12355v = 0;
                    break;
                case 8:
                    O('\'');
                    this.f12355v = 0;
                    break;
                case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                    O('\"');
                    this.f12355v = 0;
                    break;
                case 10:
                    Q();
                    this.f12355v = 0;
                    break;
                case Matrix.TranslateX /* 12 */:
                    O('\'');
                    if (i5 == 0) {
                        this.f12350B[this.f12349A - 1] = "<skipped>";
                    }
                    this.f12355v = 0;
                    break;
                case Matrix.TranslateY /* 13 */:
                    O('\"');
                    if (i5 == 0) {
                        this.f12350B[this.f12349A - 1] = "<skipped>";
                    }
                    this.f12355v = 0;
                    break;
                case Matrix.TranslateZ /* 14 */:
                    Q();
                    if (i5 == 0) {
                        this.f12350B[this.f12349A - 1] = "<skipped>";
                    }
                    this.f12355v = 0;
                    break;
                case 16:
                    this.f12353r += this.f12357x;
                    this.f12355v = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i5 > 0);
        int[] iArr = this.f12351C;
        int i7 = this.f12349A - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    public final void S(String str) throws c {
        throw new c(str + A());
    }

    public final void c() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 3) {
            M(1);
            this.f12351C[this.f12349A - 1] = 0;
            this.f12355v = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + b.D(L()) + A());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12355v = 0;
        this.f12359z[0] = 8;
        this.f12349A = 1;
        this.f12352o.close();
    }

    public final void g() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 == 1) {
            M(3);
            this.f12355v = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + b.D(L()) + A());
        }
    }

    public final void h() throws c {
        if (this.p) {
            return;
        }
        S("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a2 A[PHI: r2 r4
  0x01a2: PHI (r2v51 int) = (r2v50 int), (r2v53 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x01a2: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:170:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:183:0x0238 A[DONT_INVERT, PHI: r1
  0x0238: PHI (r1v68 int) = (r1v67 int), (r1v71 int) binds: [B:169:0x0213, B:175:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023a  */
    /* JADX WARN: Code duplicated, block: B:198:0x025b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0261  */
    /* JADX WARN: Code duplicated, block: B:203:0x0266  */
    /* JADX WARN: Code duplicated, block: B:208:0x0276 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0277  */
    /* JADX WARN: Code duplicated, block: B:211:0x0281  */
    /* JADX WARN: Code duplicated, block: B:213:0x0289  */
    /* JADX WARN: Code duplicated, block: B:223:0x029f  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:277:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    public final int i() throws IOException {
        int i5;
        int iG;
        int i6;
        int iG2;
        int i7;
        String str;
        String str2;
        int i8;
        char c5;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        char c6;
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f12359z;
        int i16 = 1;
        int i17 = this.f12349A - 1;
        int i18 = iArr[i17];
        char[] cArr = this.q;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else {
            if (i18 != 2) {
                if (i18 == 3) {
                    i5 = 4;
                } else if (i18 == 5) {
                    i5 = 4;
                } else {
                    if (i18 != 4) {
                        if (i18 == 6) {
                            if (this.p) {
                                G(true);
                                int i19 = this.f12353r;
                                this.f12353r = i19 - 1;
                                if (i19 + 4 <= this.f12354s || p(5)) {
                                    int i20 = this.f12353r;
                                    if (cArr[i20] == ')' && cArr[i20 + 1] == ']' && cArr[i20 + 2] == '}' && cArr[i20 + 3] == '\'' && cArr[i20 + 4] == '\n') {
                                        this.f12353r = i20 + 5;
                                    }
                                }
                            }
                            this.f12359z[this.f12349A - 1] = 7;
                        } else if (i18 == 7) {
                            i6 = 0;
                            if (G(false) == -1) {
                                this.f12355v = 17;
                                return 17;
                            }
                            h();
                            this.f12353r--;
                        } else {
                            i6 = 0;
                            if (i18 == 8) {
                                throw new IllegalStateException("JsonReader is closed");
                            }
                        }
                        iG2 = G(true);
                        if (iG2 != 34) {
                            this.f12355v = 9;
                            return 9;
                        }
                        if (iG2 != 39) {
                            h();
                            this.f12355v = 8;
                            return 8;
                        }
                        if (iG2 != 44 || iG2 == 59) {
                            i7 = 1;
                        } else {
                            if (iG2 == 91) {
                                this.f12355v = 3;
                                return 3;
                            }
                            if (iG2 != 93) {
                                if (iG2 == 123) {
                                    this.f12355v = 1;
                                    return 1;
                                }
                                int i21 = this.f12353r - 1;
                                this.f12353r = i21;
                                char c7 = cArr[i21];
                                if (c7 == 't' || c7 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i8 = 5;
                                } else {
                                    if (c7 != 'f' && c7 != 'F') {
                                        if (c7 != 'n' && c7 != 'N') {
                                            i8 = i6;
                                            break;
                                        }
                                        str = "null";
                                        str2 = "NULL";
                                        i8 = 7;
                                        if (i8 != 0) {
                                            return i8;
                                        }
                                        i9 = this.f12353r;
                                        i10 = this.f12354s;
                                        i11 = i6;
                                        i12 = i11;
                                        int i22 = i12;
                                        z3 = true;
                                        long j5 = 0;
                                        while (true) {
                                            if (i9 + i12 != i10) {
                                                c6 = cArr[i9 + i12];
                                                if (c6 != '+') {
                                                    if (c6 != 'E' || c6 == 'e') {
                                                        i13 = i10;
                                                        if (i11 != 2 || i11 == 4) {
                                                            i11 = 5;
                                                            i12++;
                                                            i10 = i13;
                                                            i16 = 1;
                                                        }
                                                    } else if (c6 == '-') {
                                                        i13 = i10;
                                                        if (i11 == 0) {
                                                            i11 = 1;
                                                            i22 = 1;
                                                        } else {
                                                            if (i11 != 5) {
                                                            }
                                                            i11 = 6;
                                                        }
                                                        i12++;
                                                        i10 = i13;
                                                        i16 = 1;
                                                    } else if (c6 == '.') {
                                                        i13 = i10;
                                                        if (i11 == 2) {
                                                            i11 = 3;
                                                            i12++;
                                                            i10 = i13;
                                                            i16 = 1;
                                                        }
                                                    } else if (c6 >= '0' && c6 <= '9') {
                                                        if (i11 == i16 || i11 == 0) {
                                                            i13 = i10;
                                                            j5 = -(c6 - '0');
                                                            i11 = 2;
                                                        } else if (i11 != 2) {
                                                            i13 = i10;
                                                            if (i11 == 3) {
                                                                i11 = 4;
                                                            } else if (i11 == 5 || i11 == 6) {
                                                                i11 = 7;
                                                            }
                                                        } else if (j5 != 0) {
                                                            i13 = i10;
                                                            long j6 = (10 * j5) - ((long) (c6 - '0'));
                                                            z3 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j6 < j5);
                                                            j5 = j6;
                                                        }
                                                        i12++;
                                                        i10 = i13;
                                                        i16 = 1;
                                                    } else if (!z(c6)) {
                                                        i15 = 2;
                                                        if (i11 != 2) {
                                                            if (i11 != i15 || i11 == 4 || i11 == 7) {
                                                                this.f12357x = i12;
                                                                i14 = 16;
                                                                this.f12355v = 16;
                                                            }
                                                        } else if (z3 || ((j5 == Long.MIN_VALUE && i22 == 0) || (j5 == 0 && i22 != 0))) {
                                                            i15 = 2;
                                                            if (i11 != i15) {
                                                            }
                                                            this.f12357x = i12;
                                                            i14 = 16;
                                                            this.f12355v = 16;
                                                        } else {
                                                            if (i22 == 0) {
                                                                j5 = -j5;
                                                            }
                                                            this.f12356w = j5;
                                                            this.f12353r += i12;
                                                            i14 = 15;
                                                            this.f12355v = 15;
                                                        }
                                                    }
                                                    if (i14 != 0) {
                                                        return i14;
                                                    }
                                                    if (z(cArr[this.f12353r])) {
                                                        S("Expected value");
                                                        throw null;
                                                    }
                                                    h();
                                                    this.f12355v = 10;
                                                    return 10;
                                                }
                                                i13 = i10;
                                                if (i11 != 5) {
                                                }
                                                i11 = 6;
                                                i12++;
                                                i10 = i13;
                                                i16 = 1;
                                            } else if (i12 != cArr.length) {
                                                if (!p(i12 + 1)) {
                                                    int i23 = this.f12353r;
                                                    i10 = this.f12354s;
                                                    i9 = i23;
                                                    c6 = cArr[i9 + i12];
                                                    if (c6 != '+') {
                                                        if (c6 != 'E') {
                                                            i13 = i10;
                                                            if (i11 != 2) {
                                                            }
                                                            i11 = 5;
                                                            i12++;
                                                            i10 = i13;
                                                            i16 = 1;
                                                        } else {
                                                            i13 = i10;
                                                            if (i11 != 2) {
                                                            }
                                                            i11 = 5;
                                                            i12++;
                                                            i10 = i13;
                                                            i16 = 1;
                                                        }
                                                        if (i14 != 0) {
                                                            return i14;
                                                        }
                                                        if (z(cArr[this.f12353r])) {
                                                            S("Expected value");
                                                            throw null;
                                                        }
                                                        h();
                                                        this.f12355v = 10;
                                                        return 10;
                                                    }
                                                    i13 = i10;
                                                    if (i11 != 5) {
                                                    }
                                                    i11 = 6;
                                                    i12++;
                                                    i10 = i13;
                                                    i16 = 1;
                                                }
                                                i15 = 2;
                                                if (i11 != 2) {
                                                    if (i11 != i15) {
                                                    }
                                                    this.f12357x = i12;
                                                    i14 = 16;
                                                    this.f12355v = 16;
                                                } else {
                                                    if (z3) {
                                                    }
                                                    i15 = 2;
                                                    if (i11 != i15) {
                                                    }
                                                    this.f12357x = i12;
                                                    i14 = 16;
                                                    this.f12355v = 16;
                                                }
                                                if (i14 != 0) {
                                                    return i14;
                                                }
                                                if (z(cArr[this.f12353r])) {
                                                    S("Expected value");
                                                    throw null;
                                                }
                                                h();
                                                this.f12355v = 10;
                                                return 10;
                                            }
                                            i14 = 0;
                                            if (i14 != 0) {
                                                return i14;
                                            }
                                            if (z(cArr[this.f12353r])) {
                                                S("Expected value");
                                                throw null;
                                            }
                                            h();
                                            this.f12355v = 10;
                                            return 10;
                                        }
                                    }
                                    str = "false";
                                    str2 = "FALSE";
                                    i8 = 6;
                                }
                                int length = str.length();
                                int i24 = 1;
                                while (true) {
                                    if (i24 >= length) {
                                        if ((this.f12353r + length >= this.f12354s && !p(length + 1)) || !z(cArr[this.f12353r + length])) {
                                            this.f12353r += length;
                                            this.f12355v = i8;
                                            break;
                                        }
                                        break;
                                    }
                                    if ((this.f12353r + i24 < this.f12354s || p(i24 + 1)) && ((c5 = cArr[this.f12353r + i24]) == str.charAt(i24) || c5 == str2.charAt(i24))) {
                                        i24++;
                                    }
                                    i8 = i6;
                                    break;
                                }
                                if (i8 != 0) {
                                    return i8;
                                }
                                i9 = this.f12353r;
                                i10 = this.f12354s;
                                i11 = i6;
                                i12 = i11;
                                int i25 = i12;
                                z3 = true;
                                long j7 = 0;
                                while (true) {
                                    if (i9 + i12 != i10) {
                                        c6 = cArr[i9 + i12];
                                        if (c6 != '+') {
                                            if (c6 != 'E') {
                                                i13 = i10;
                                                if (i11 != 2) {
                                                }
                                                i11 = 5;
                                                i12++;
                                                i10 = i13;
                                                i16 = 1;
                                            } else {
                                                i13 = i10;
                                                if (i11 != 2) {
                                                }
                                                i11 = 5;
                                                i12++;
                                                i10 = i13;
                                                i16 = 1;
                                            }
                                            if (i14 != 0) {
                                                return i14;
                                            }
                                            if (z(cArr[this.f12353r])) {
                                                S("Expected value");
                                                throw null;
                                            }
                                            h();
                                            this.f12355v = 10;
                                            return 10;
                                        }
                                        i13 = i10;
                                        if (i11 != 5) {
                                        }
                                        i11 = 6;
                                        i12++;
                                        i10 = i13;
                                        i16 = 1;
                                    } else if (i12 != cArr.length) {
                                        if (!p(i12 + 1)) {
                                            int i26 = this.f12353r;
                                            i10 = this.f12354s;
                                            i9 = i26;
                                            c6 = cArr[i9 + i12];
                                            if (c6 != '+') {
                                                if (c6 != 'E') {
                                                    i13 = i10;
                                                    if (i11 != 2) {
                                                    }
                                                    i11 = 5;
                                                    i12++;
                                                    i10 = i13;
                                                    i16 = 1;
                                                } else {
                                                    i13 = i10;
                                                    if (i11 != 2) {
                                                    }
                                                    i11 = 5;
                                                    i12++;
                                                    i10 = i13;
                                                    i16 = 1;
                                                }
                                                if (i14 != 0) {
                                                    return i14;
                                                }
                                                if (z(cArr[this.f12353r])) {
                                                    S("Expected value");
                                                    throw null;
                                                }
                                                h();
                                                this.f12355v = 10;
                                                return 10;
                                            }
                                            i13 = i10;
                                            if (i11 != 5) {
                                            }
                                            i11 = 6;
                                            i12++;
                                            i10 = i13;
                                            i16 = 1;
                                        }
                                        i15 = 2;
                                        if (i11 != 2) {
                                            if (i11 != i15) {
                                            }
                                            this.f12357x = i12;
                                            i14 = 16;
                                            this.f12355v = 16;
                                        } else {
                                            if (z3) {
                                            }
                                            i15 = 2;
                                            if (i11 != i15) {
                                            }
                                            this.f12357x = i12;
                                            i14 = 16;
                                            this.f12355v = 16;
                                        }
                                        if (i14 != 0) {
                                            return i14;
                                        }
                                        if (z(cArr[this.f12353r])) {
                                            S("Expected value");
                                            throw null;
                                        }
                                        h();
                                        this.f12355v = 10;
                                        return 10;
                                    }
                                    i14 = 0;
                                    if (i14 != 0) {
                                        return i14;
                                    }
                                    if (z(cArr[this.f12353r])) {
                                        S("Expected value");
                                        throw null;
                                    }
                                    h();
                                    this.f12355v = 10;
                                    return 10;
                                }
                            }
                            i7 = 1;
                            if (i18 == 1) {
                                this.f12355v = 4;
                                return 4;
                            }
                        }
                        if (i18 == i7 && i18 != 2) {
                            S("Unexpected value");
                            throw null;
                        }
                        h();
                        this.f12353r -= i7;
                        this.f12355v = 7;
                        return 7;
                    }
                    iArr[i17] = 5;
                    int iG3 = G(true);
                    if (iG3 != 58) {
                        if (iG3 != 61) {
                            S("Expected ':'");
                            throw null;
                        }
                        h();
                        if (this.f12353r < this.f12354s || p(1)) {
                            int i27 = this.f12353r;
                            if (cArr[i27] == '>') {
                                this.f12353r = i27 + 1;
                            }
                        }
                    }
                }
                iArr[i17] = i5;
                if (i18 == 5 && (iG = G(true)) != 44) {
                    if (iG != 59) {
                        if (iG == 125) {
                            this.f12355v = 2;
                            return 2;
                        }
                        S("Unterminated object");
                        throw null;
                    }
                    h();
                }
                int iG4 = G(true);
                if (iG4 == 34) {
                    this.f12355v = 13;
                    return 13;
                }
                if (iG4 == 39) {
                    h();
                    this.f12355v = 12;
                    return 12;
                }
                if (iG4 == 125) {
                    if (i18 != 5) {
                        this.f12355v = 2;
                        return 2;
                    }
                    S("Expected name");
                    throw null;
                }
                h();
                this.f12353r--;
                if (z((char) iG4)) {
                    this.f12355v = 14;
                    return 14;
                }
                S("Expected name");
                throw null;
            }
            int iG5 = G(true);
            if (iG5 != 44) {
                if (iG5 != 59) {
                    if (iG5 == 93) {
                        this.f12355v = 4;
                        return 4;
                    }
                    S("Unterminated array");
                    throw null;
                }
                h();
            }
        }
        i6 = 0;
        iG2 = G(true);
        if (iG2 != 34) {
            this.f12355v = 9;
            return 9;
        }
        if (iG2 != 39) {
            h();
            this.f12355v = 8;
            return 8;
        }
        if (iG2 != 44) {
            i7 = 1;
        } else {
            i7 = 1;
        }
        if (i18 == i7) {
        }
        h();
        this.f12353r -= i7;
        this.f12355v = 7;
        return 7;
    }

    public final void j() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + b.D(L()) + A());
        }
        int i6 = this.f12349A;
        this.f12349A = i6 - 1;
        int[] iArr = this.f12351C;
        int i7 = i6 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f12355v = 0;
    }

    public final void n() {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        if (i5 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + b.D(L()) + A());
        }
        int i6 = this.f12349A;
        int i7 = i6 - 1;
        this.f12349A = i7;
        this.f12350B[i7] = null;
        int[] iArr = this.f12351C;
        int i8 = i6 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f12355v = 0;
    }

    public final boolean p(int i5) throws IOException {
        int i6;
        int i7;
        int i8 = this.u;
        int i9 = this.f12353r;
        this.u = i8 - i9;
        int i10 = this.f12354s;
        char[] cArr = this.q;
        if (i10 != i9) {
            int i11 = i10 - i9;
            this.f12354s = i11;
            System.arraycopy(cArr, i9, cArr, 0, i11);
        } else {
            this.f12354s = 0;
        }
        this.f12353r = 0;
        do {
            int i12 = this.f12354s;
            int i13 = this.f12352o.read(cArr, i12, cArr.length - i12);
            if (i13 == -1) {
                return false;
            }
            i6 = this.f12354s + i13;
            this.f12354s = i6;
            if (this.t == 0 && (i7 = this.u) == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f12353r++;
                this.u = i7 + 1;
                i5++;
            }
        } while (i6 < i5);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + A();
    }

    public final String u(boolean z3) {
        StringBuilder sb = new StringBuilder("$");
        int i5 = 0;
        while (true) {
            int i6 = this.f12349A;
            if (i5 >= i6) {
                return sb.toString();
            }
            int i7 = this.f12359z[i5];
            if (i7 == 1 || i7 == 2) {
                int i8 = this.f12351C[i5];
                if (z3 && i8 > 0 && i5 == i6 - 1) {
                    i8--;
                }
                sb.append('[');
                sb.append(i8);
                sb.append(']');
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                sb.append('.');
                String str = this.f12350B[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
            i5++;
        }
    }

    public final boolean y() throws IOException {
        int i5 = this.f12355v;
        if (i5 == 0) {
            i5 = i();
        }
        return (i5 == 2 || i5 == 4 || i5 == 17) ? false : true;
    }

    public final boolean z(char c5) throws c {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }
}
