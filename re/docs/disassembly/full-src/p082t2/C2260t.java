package p082t2;

import T1.z;

/* JADX INFO: renamed from: t2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2260t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12845d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12846f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f12847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f12849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f12850k;

    public C2260t(String str, String str2, long j5) {
        this(str, str2, 0L, 0L, 0L, j5, 0L, null, null, null, null);
    }

    public final C2260t a(long j5) {
        return new C2260t(this.f12842a, this.f12843b, this.f12844c, this.f12845d, this.e, j5, this.g, this.f12847h, this.f12848i, this.f12849j, this.f12850k);
    }

    public final C2260t b(Long l5, Long l6, Boolean bool) {
        return new C2260t(this.f12842a, this.f12843b, this.f12844c, this.f12845d, this.e, this.f12846f, this.g, this.f12847h, l5, l6, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C2260t(String str, String str2, long j5, long j6, long j7, long j8, long j9, Long l5, Long l6, Long l7, Boolean bool) {
        z.e(str);
        z.e(str2);
        z.b(j5 >= 0);
        z.b(j6 >= 0);
        z.b(j7 >= 0);
        z.b(j9 >= 0);
        this.f12842a = str;
        this.f12843b = str2;
        this.f12844c = j5;
        this.f12845d = j6;
        this.e = j7;
        this.f12846f = j8;
        this.g = j9;
        this.f12847h = l5;
        this.f12848i = l6;
        this.f12849j = l7;
        this.f12850k = bool;
    }
}
