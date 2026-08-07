package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends X {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12118s;

    public W(byte[] bArr, int i5, int i6) {
        super(bArr);
        X.r(i5, i5 + i6, bArr.length);
        this.f12117r = i5;
        this.f12118s = i6;
    }

    @Override // p064o2.X
    public final byte c(int i5) {
        int i6 = this.f12118s;
        if (((i6 - (i5 + 1)) | i5) >= 0) {
            return this.p[this.f12117r + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC1421mz.h(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.m("Index > length: ", ", ", i5, i6));
    }

    @Override // p064o2.X
    public final byte g(int i5) {
        return this.p[this.f12117r + i5];
    }

    @Override // p064o2.X
    public final int i() {
        return this.f12117r;
    }

    @Override // p064o2.X
    public final int k() {
        return this.f12118s;
    }

    @Override // p064o2.X
    public final void l(byte[] bArr, int i5) {
        System.arraycopy(this.p, this.f12117r, bArr, 0, i5);
    }
}
