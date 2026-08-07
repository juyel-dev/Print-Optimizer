package p020e1;

import java.util.Arrays;
import p007b1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11082b;

    public l(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f11081a = cVar;
        this.f11082b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11081a.equals(lVar.f11081a)) {
            return Arrays.equals(this.f11082b, lVar.f11082b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11081a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11082b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f11081a + ", bytes=[...]}";
    }
}
