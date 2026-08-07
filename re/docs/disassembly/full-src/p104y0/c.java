package p104y0;

import W.P;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f15840i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15844d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15841a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15845f = -1;
    public long g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f15846h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f15841a = 1;
        cVar.f15845f = -1L;
        cVar.g = -1L;
        new HashSet();
        cVar.f15842b = false;
        cVar.f15843c = false;
        cVar.f15841a = 1;
        cVar.f15844d = false;
        cVar.e = false;
        cVar.f15846h = eVar;
        cVar.f15845f = -1L;
        cVar.g = -1L;
        f15840i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15842b == cVar.f15842b && this.f15843c == cVar.f15843c && this.f15844d == cVar.f15844d && this.e == cVar.e && this.f15845f == cVar.f15845f && this.g == cVar.g && this.f15841a == cVar.f15841a) {
            return this.f15846h.equals(cVar.f15846h);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ((((((((P.b(this.f15841a) * 31) + (this.f15842b ? 1 : 0)) * 31) + (this.f15843c ? 1 : 0)) * 31) + (this.f15844d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j5 = this.f15845f;
        int i5 = (iB + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.g;
        return this.f15846h.f15849a.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }
}
