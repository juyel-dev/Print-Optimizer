package p049l1;

import androidx.compose.runtime.ComposerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11819f = new a(10485760, ComposerKt.invocationKey, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11823d;
    public final int e;

    public a(long j5, int i5, int i6, long j6, int i7) {
        this.f11820a = j5;
        this.f11821b = i5;
        this.f11822c = i6;
        this.f11823d = j6;
        this.e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11820a == aVar.f11820a && this.f11821b == aVar.f11821b && this.f11822c == aVar.f11822c && this.f11823d == aVar.f11823d && this.e == aVar.e;
    }

    public final int hashCode() {
        long j5 = this.f11820a;
        int i5 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f11821b) * 1000003) ^ this.f11822c) * 1000003;
        long j6 = this.f11823d;
        return ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f11820a);
        sb.append(", loadBatchSize=");
        sb.append(this.f11821b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f11822c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f11823d);
        sb.append(", maxBlobByteSizePerRow=");
        return androidx.compose.foundation.text.modifiers.a.o(sb, this.e, "}");
    }
}
