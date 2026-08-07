package p009b3;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2412c;

    public a(long j5, String str, long j6) {
        this.f2410a = str;
        this.f2411b = j5;
        this.f2412c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2410a.equals(aVar.f2410a) && this.f2411b == aVar.f2411b && this.f2412c == aVar.f2412c;
    }

    public final int hashCode() {
        int iHashCode = (this.f2410a.hashCode() ^ 1000003) * 1000003;
        long j5 = this.f2411b;
        long j6 = this.f2412c;
        return ((iHashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f2410a + ", tokenExpirationTimestamp=" + this.f2411b + ", tokenCreationTimestamp=" + this.f2412c + "}";
    }
}
