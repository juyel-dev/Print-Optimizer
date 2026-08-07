package p079s3;

import androidx.compose.ui.graphics.Fields;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f12360w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f12361x = new String[Fields.SpotShadowColor];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f12362y;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Writer f12363o;
    public int[] p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12365s;
    public boolean t;
    public String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12366v;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f12361x[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f12361x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f12362y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.p = iArr;
        this.q = 0;
        if (iArr.length == 0) {
            this.p = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        iArr2[i5] = 6;
        this.f12364r = ":";
        this.f12366v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f12363o = writer;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void A(String str) throws IOException {
        String str2;
        String[] strArr = this.t ? f12362y : f12361x;
        Writer writer = this.f12363o;
        writer.write(34);
        int length = str.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i5 < i6) {
                        writer.write(str, i5, i6 - i5);
                    }
                    writer.write(str2);
                    i5 = i6 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i5 < i6) {
                    writer.write(str, i5, i6 - i5);
                }
                writer.write(str2);
                i5 = i6 + 1;
            }
        }
        if (i5 < length) {
            writer.write(str, i5, length - i5);
        }
        writer.write(34);
    }

    public void B(double d4) throws IOException {
        G();
        if (this.f12365s || !(Double.isNaN(d4) || Double.isInfinite(d4))) {
            c();
            this.f12363o.append((CharSequence) Double.toString(d4));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
    }

    public void C(long j5) throws IOException {
        G();
        c();
        this.f12363o.write(Long.toString(j5));
    }

    public void D(Number number) throws IOException {
        if (number == null) {
            y();
            return;
        }
        G();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f12360w.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f12365s) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        c();
        this.f12363o.append((CharSequence) string);
    }

    public void E(String str) throws IOException {
        if (str == null) {
            y();
            return;
        }
        G();
        c();
        A(str);
    }

    public void F(boolean z3) throws IOException {
        G();
        c();
        this.f12363o.write(z3 ? "true" : "false");
    }

    public final void G() throws IOException {
        if (this.u != null) {
            int iZ = z();
            if (iZ == 5) {
                this.f12363o.write(44);
            } else if (iZ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u();
            this.p[this.q - 1] = 4;
            A(this.u);
            this.u = null;
        }
    }

    public final void c() throws IOException {
        int iZ = z();
        if (iZ == 1) {
            this.p[this.q - 1] = 2;
            u();
            return;
        }
        Writer writer = this.f12363o;
        if (iZ == 2) {
            writer.append(',');
            u();
        } else {
            if (iZ == 4) {
                writer.append((CharSequence) this.f12364r);
                this.p[this.q - 1] = 5;
                return;
            }
            if (iZ != 6) {
                if (iZ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f12365s) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.p[this.q - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12363o.close();
        int i5 = this.q;
        if (i5 > 1 || (i5 == 1 && this.p[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.q = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.q == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f12363o.flush();
    }

    public void g() throws IOException {
        G();
        c();
        int i5 = this.q;
        int[] iArr = this.p;
        if (i5 == iArr.length) {
            this.p = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.p;
        int i6 = this.q;
        this.q = i6 + 1;
        iArr2[i6] = 1;
        this.f12363o.write(91);
    }

    public void h() throws IOException {
        G();
        c();
        int i5 = this.q;
        int[] iArr = this.p;
        if (i5 == iArr.length) {
            this.p = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.p;
        int i6 = this.q;
        this.q = i6 + 1;
        iArr2[i6] = 3;
        this.f12363o.write(123);
    }

    public final void i(int i5, int i6, char c5) throws IOException {
        int iZ = z();
        if (iZ != i6 && iZ != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.u != null) {
            throw new IllegalStateException("Dangling name: " + this.u);
        }
        this.q--;
        if (iZ == i6) {
            u();
        }
        this.f12363o.write(c5);
    }

    public void j() throws IOException {
        i(1, 2, ']');
    }

    public void n() throws IOException {
        i(3, 5, '}');
    }

    public void p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.u != null) {
            throw new IllegalStateException();
        }
        if (this.q == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.u = str;
    }

    public b y() throws IOException {
        if (this.u != null) {
            if (!this.f12366v) {
                this.u = null;
                return this;
            }
            G();
        }
        c();
        this.f12363o.write("null");
        return this;
    }

    public final int z() {
        int i5 = this.q;
        if (i5 != 0) {
            return this.p[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void u() {
    }
}
