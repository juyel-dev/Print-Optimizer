package p082t2;

import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.C1999b;
import com.google.android.gms.internal.measurement.C2100t2;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Z implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Y f12590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f12591c;

    public /* synthetic */ Z(int i5) {
        this.f12589a = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12589a) {
            case 0:
                C c5 = new C(4, this.f12590b, this.f12591c);
                C1999b c1999b = new C1999b("internal.remoteConfig", 1);
                c1999b.p.put("getValue", new C2100t2(c5));
                return c1999b;
            case 1:
                C2243k c2243kL = this.f12590b.l();
                String str = this.f12591c;
                S sY = c2243kL.Y(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                map.put("gmp_version", 84002L);
                if (sY != null) {
                    String strD = sY.d();
                    if (strD != null) {
                        map.put("app_version", strD);
                    }
                    map.put("app_version_int", Long.valueOf(sY.m()));
                    map.put("dynamite_version", Long.valueOf(sY.D()));
                }
                return map;
            default:
                Z z3 = new Z(1);
                z3.f12590b = this.f12590b;
                z3.f12591c = this.f12591c;
                return new C2100t2(z3);
        }
    }
}
