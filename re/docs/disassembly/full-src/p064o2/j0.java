package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import p035i0.a;
import p042j3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ByteArrayInputStream f12140o;
    public i0 p;
    public final byte[] q = new byte[8];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f12141r = new c(20);

    public j0(ByteArrayInputStream byteArrayInputStream) {
        this.f12140o = byteArrayInputStream;
    }

    public final long c() {
        u((byte) -128);
        p();
        long jN = n();
        if (jN < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jN > 0) {
            ((ArrayDeque) this.f12141r.p).push(Long.valueOf(jN));
        }
        return jN;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12140o.close();
        this.f12141r.y();
    }

    public final long g() {
        boolean z3;
        i();
        byte b5 = this.p.f12137a;
        if (b5 == 0) {
            z3 = true;
        } else {
            if (b5 != 32) {
                throw new IllegalStateException(AbstractC1421mz.h((this.p.f12137a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z3 = false;
        }
        long jN = n();
        if (jN >= 0) {
            return z3 ? jN : ~jN;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long h() {
        u((byte) -96);
        p();
        long jN = n();
        if (jN < 0 || jN > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jN > 0) {
            ((ArrayDeque) this.f12141r.p).push(Long.valueOf(jN + jN));
        }
        return jN;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p064o2.i0 i() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p064o2.j0.i():o2.i0");
    }

    public final boolean j() {
        u((byte) -32);
        if (this.p.f12138b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iN = (int) n();
        if (iN == 20) {
            return false;
        }
        if (iN == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long n() throws IOException {
        byte b5 = this.p.f12138b;
        if (b5 < 24) {
            long j5 = b5;
            this.p = null;
            return j5;
        }
        if (b5 == 24) {
            int i5 = this.f12140o.read();
            if (i5 == -1) {
                throw new EOFException();
            }
            this.p = null;
            return ((long) i5) & 255;
        }
        byte[] bArr = this.q;
        if (b5 == 25) {
            y(bArr, 2);
            return (((long) bArr[1]) & 255) | ((bArr[0] & 255) << 8);
        }
        if (b5 == 26) {
            y(bArr, 4);
            long j6 = bArr[0];
            long j7 = bArr[1];
            return (((long) bArr[3]) & 255) | ((j7 & 255) << 16) | ((j6 & 255) << 24) | ((bArr[2] & 255) << 8);
        }
        if (b5 != 27) {
            i0 i0Var = this.p;
            throw new IOException(a.m("invalid additional information ", " for major type ", i0Var.f12138b, (i0Var.f12137a >> 5) & 7));
        }
        y(bArr, 8);
        long j8 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j11 & 255) << 32) | ((j8 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void p() {
        i();
        if (this.p.f12138b == 31) {
            throw new IllegalStateException(AbstractC1421mz.h(this.p.f12138b, "expected definite length but found "));
        }
    }

    public final void u(byte b5) {
        i();
        if (this.p.f12137a != b5) {
            throw new IllegalStateException(a.m("expected major type ", " but found ", (b5 >> 5) & 7, (this.p.f12137a >> 5) & 7));
        }
    }

    public final void y(byte[] bArr, int i5) throws IOException {
        int i6 = 0;
        while (i6 != i5) {
            int i7 = this.f12140o.read(bArr, i6, i5 - i6);
            if (i7 == -1) {
                throw new EOFException();
            }
            i6 += i7;
        }
        this.p = null;
    }

    public final byte[] z() {
        p();
        long jN = n();
        if (jN < 0 || jN > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f12140o.available() < jN) {
            throw new EOFException();
        }
        int i5 = (int) jN;
        byte[] bArr = new byte[i5];
        y(bArr, i5);
        return bArr;
    }
}
