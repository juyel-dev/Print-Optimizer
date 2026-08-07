package p082t2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import p003a2.b;
import p003a2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2236g0 f12578a;

    public void a(String str, Bundle bundle) {
        String string;
        C2236g0 c2236g0 = this.f12578a;
        C2226b0 c2226b0 = c2236g0.f12682j;
        C2236g0.d(c2226b0);
        c2226b0.h();
        if (c2236g0.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        U u = c2236g0.f12680h;
        C2236g0.f(u);
        u.f12558x.k(string);
        C2236g0.f(u);
        c2236g0.f12686n.getClass();
        u.f12559y.b(System.currentTimeMillis());
    }

    public boolean b() {
        C2236g0 c2236g0 = this.f12578a;
        try {
            b bVarA = c.a(c2236g0.f12675a);
            if (bVarA != null) {
                return bVarA.c(Fields.SpotShadowColor, "com.android.vending").versionCode >= 80837300;
            }
            L l5 = c2236g0.f12681i;
            C2236g0.d(l5);
            l5.f12479n.g("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            L l6 = c2236g0.f12681i;
            C2236g0.d(l6);
            l6.f12479n.f(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public boolean c() {
        U u = this.f12578a.f12680h;
        C2236g0.f(u);
        return u.f12559y.a() > 0;
    }

    public boolean d() {
        if (!c()) {
            return false;
        }
        C2236g0 c2236g0 = this.f12578a;
        c2236g0.f12686n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        U u = c2236g0.f12680h;
        C2236g0.f(u);
        return jCurrentTimeMillis - u.f12559y.a() > c2236g0.g.q(null, AbstractC2268x.f12926U);
    }
}
