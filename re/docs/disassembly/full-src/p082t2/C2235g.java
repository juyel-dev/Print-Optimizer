package p082t2;

import T1.z;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.measurement.L3;
import java.lang.reflect.InvocationTargetException;
import p003a2.c;

/* JADX INFO: renamed from: t2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2235g extends AbstractC2252o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f12663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2237h f12665d;
    public Boolean e;

    public static long v() {
        return ((Long) AbstractC2268x.f12894E.a(null)).longValue();
    }

    public final double k(String str, F f5) {
        if (str == null) {
            return ((Double) f5.a(null)).doubleValue();
        }
        String strB = this.f12665d.b(str, f5.f12431a);
        if (TextUtils.isEmpty(strB)) {
            return ((Double) f5.a(null)).doubleValue();
        }
        try {
            return ((Double) f5.a(Double.valueOf(Double.parseDouble(strB)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) f5.a(null)).doubleValue();
        }
    }

    public final int l(String str, boolean z3) {
        L3.p.get();
        if (!((C2236g0) this.f12783a).g.t(null, AbstractC2268x.f12921R0)) {
            return 100;
        }
        if (z3) {
            return Math.max(Math.min(p(str, AbstractC2268x.f12922S), 500), 100);
        }
        return 500;
    }

    public final String n(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            z.i(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            j().f12472f.f(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e3) {
            j().f12472f.f(e3, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e5) {
            j().f12472f.f(e5, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e6) {
            j().f12472f.f(e6, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean o(F f5) {
        return t(null, f5);
    }

    public final int p(String str, F f5) {
        if (str == null) {
            return ((Integer) f5.a(null)).intValue();
        }
        String strB = this.f12665d.b(str, f5.f12431a);
        if (TextUtils.isEmpty(strB)) {
            return ((Integer) f5.a(null)).intValue();
        }
        try {
            return ((Integer) f5.a(Integer.valueOf(Integer.parseInt(strB)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) f5.a(null)).intValue();
        }
    }

    public final long q(String str, F f5) {
        if (str == null) {
            return ((Long) f5.a(null)).longValue();
        }
        String strB = this.f12665d.b(str, f5.f12431a);
        if (TextUtils.isEmpty(strB)) {
            return ((Long) f5.a(null)).longValue();
        }
        try {
            return ((Long) f5.a(Long.valueOf(Long.parseLong(strB)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) f5.a(null)).longValue();
        }
    }

    public final String r(String str, F f5) {
        return str == null ? (String) f5.a(null) : (String) f5.a(this.f12665d.b(str, f5.f12431a));
    }

    public final Boolean s(String str) {
        z.e(str);
        Bundle bundleY = y();
        if (bundleY == null) {
            j().f12472f.g("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleY.containsKey(str)) {
            return Boolean.valueOf(bundleY.getBoolean(str));
        }
        return null;
    }

    public final boolean t(String str, F f5) {
        if (str == null) {
            return ((Boolean) f5.a(null)).booleanValue();
        }
        String strB = this.f12665d.b(str, f5.f12431a);
        return TextUtils.isEmpty(strB) ? ((Boolean) f5.a(null)).booleanValue() : ((Boolean) f5.a(Boolean.valueOf("1".equals(strB)))).booleanValue();
    }

    public final boolean u(String str) {
        return "1".equals(this.f12665d.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean w() {
        Boolean boolS = s("google_analytics_automatic_screen_reporting_enabled");
        return boolS == null || boolS.booleanValue();
    }

    public final boolean x() {
        if (this.f12663b == null) {
            Boolean boolS = s("app_measurement_lite");
            this.f12663b = boolS;
            if (boolS == null) {
                this.f12663b = Boolean.FALSE;
            }
        }
        return this.f12663b.booleanValue() || !((C2236g0) this.f12783a).e;
    }

    public final Bundle y() {
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        try {
            if (c2236g0.f12675a.getPackageManager() == null) {
                j().f12472f.g("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = c.a(c2236g0.f12675a).a(Fields.SpotShadowColor, c2236g0.f12675a.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            j().f12472f.g("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            j().f12472f.f(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
