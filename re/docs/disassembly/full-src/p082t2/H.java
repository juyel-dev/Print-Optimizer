package p082t2;

import T1.z;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12443d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12444f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f12450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f12451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12452o;
    public String p;

    @Override // p082t2.B
    public final boolean q() {
        return true;
    }

    public final String r() {
        o();
        z.i(this.f12442c);
        return this.f12442c;
    }

    public final String s() {
        h();
        o();
        z.i(this.f12449l);
        return this.f12449l;
    }

    public final void t() {
        String str;
        h();
        if (f().u().e(EnumC2257r0.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            g().w0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            j().f12478m.g("Analytics Storage consent is not granted");
            str = null;
        }
        j().f12478m.g("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f12451n = str;
        ((C2236g0) this.f12783a).f12686n.getClass();
        this.f12452o = System.currentTimeMillis();
    }
}
