package p105y1;

import T1.z;
import com.google.android.gms.internal.ads.C0925bj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f15948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f15949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f15950d;
    public final int e;

    public o(String str, double d4, double d5, double d6, int i5) {
        this.f15947a = str;
        this.f15949c = d4;
        this.f15948b = d5;
        this.f15950d = d6;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return z.m(this.f15947a, oVar.f15947a) && this.f15948b == oVar.f15948b && this.f15949c == oVar.f15949c && this.e == oVar.e && Double.compare(this.f15950d, oVar.f15950d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15947a, Double.valueOf(this.f15948b), Double.valueOf(this.f15949c), Double.valueOf(this.f15950d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        C0925bj c0925bj = new C0925bj(this);
        c0925bj.c(this.f15947a, "name");
        c0925bj.c(Double.valueOf(this.f15949c), "minBound");
        c0925bj.c(Double.valueOf(this.f15948b), "maxBound");
        c0925bj.c(Double.valueOf(this.f15950d), "percent");
        c0925bj.c(Integer.valueOf(this.e), "count");
        return c0925bj.toString();
    }
}
