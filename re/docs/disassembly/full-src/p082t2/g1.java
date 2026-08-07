package p082t2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2117x;
import com.google.android.gms.internal.measurement.N0;
import com.google.android.gms.internal.measurement.v4;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends f1 {
    public final Uri.Builder o(String str) {
        Y yN = n();
        yN.h();
        yN.G(str);
        String str2 = (String) yN.f12585l.get(str);
        Uri.Builder builder = new Uri.Builder();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        builder.scheme(c2236g0.g.r(str, AbstractC2268x.f12930X));
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        C2235g c2235g = c2236g0.g;
        if (zIsEmpty) {
            builder.authority(c2235g.r(str, AbstractC2268x.f12931Y));
        } else {
            builder.authority(str2 + "." + c2235g.r(str, AbstractC2268x.f12931Y));
        }
        builder.path(c2235g.r(str, AbstractC2268x.f12932Z));
        return builder;
    }

    public final C2117x p(String str) {
        v4.p.get();
        C2117x c2117x = null;
        if (((C2236g0) this.f12783a).g.t(null, AbstractC2268x.f12966s0)) {
            j().f12479n.g("sgtm feature flag enabled.");
            S sY = l().Y(str);
            if (sY == null) {
                return new C2117x(q(str));
            }
            if (sY.i()) {
                j().f12479n.g("sgtm upload enabled in manifest.");
                N0 n0B = n().B(sY.N());
                if (n0B != null && n0B.I()) {
                    String strR = n0B.y().r();
                    if (!TextUtils.isEmpty(strR)) {
                        String strQ = n0B.y().q();
                        j().f12479n.h("sgtm configured with upload_url, server_info", strR, TextUtils.isEmpty(strQ) ? "Y" : "N");
                        if (TextUtils.isEmpty(strQ)) {
                            c2117x = new C2117x(strR);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strQ);
                            C2117x c2117x2 = new C2117x(5);
                            c2117x2.q = strR;
                            c2117x2.p = map;
                            c2117x = c2117x2;
                        }
                    }
                }
            }
            if (c2117x != null) {
                return c2117x;
            }
        }
        return new C2117x(q(str));
    }

    public final String q(String str) {
        Y yN = n();
        yN.h();
        yN.G(str);
        String str2 = (String) yN.f12585l.get(str);
        if (TextUtils.isEmpty(str2)) {
            return (String) AbstractC2268x.f12965s.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC2268x.f12965s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
