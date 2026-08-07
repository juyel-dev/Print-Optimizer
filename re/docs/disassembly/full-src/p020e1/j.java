package p020e1;

import android.util.Base64;
import java.util.Arrays;
import p007b1.d;
import p036i2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f11077c;

    public j(String str, byte[] bArr, d dVar) {
        this.f11075a = str;
        this.f11076b = bArr;
        this.f11077c = dVar;
    }

    public static e a() {
        e eVar = new e(14, false);
        eVar.f11537r = d.f2408o;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11075a.equals(jVar.f11075a) && Arrays.equals(this.f11076b, jVar.f11076b) && this.f11077c.equals(jVar.f11077c);
    }

    public final int hashCode() {
        return ((((this.f11075a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11076b)) * 1000003) ^ this.f11077c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f11076b;
        return "TransportContext(" + this.f11075a + ", " + this.f11077c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
