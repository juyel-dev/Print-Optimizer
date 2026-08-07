package p082t2;

import T1.z;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.C0782Oa;
import com.google.android.gms.internal.measurement.C2131z3;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC2250n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f12470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12471d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0782Oa f12472f;
    public final C0782Oa g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0782Oa f12473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0782Oa f12474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0782Oa f12475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0782Oa f12476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0782Oa f12477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0782Oa f12478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0782Oa f12479n;

    public L(C2236g0 c2236g0) {
        super(c2236g0);
        this.f12470c = (char) 0;
        this.f12471d = -1L;
        this.f12472f = new C0782Oa(this, 6, false, false);
        this.g = new C0782Oa(this, 6, true, false);
        this.f12473h = new C0782Oa(this, 6, false, true);
        this.f12474i = new C0782Oa(this, 5, false, false);
        this.f12475j = new C0782Oa(this, 5, true, false);
        this.f12476k = new C0782Oa(this, 5, false, true);
        this.f12477l = new C0782Oa(this, 4, false, false);
        this.f12478m = new C0782Oa(this, 3, false, false);
        this.f12479n = new C0782Oa(this, 2, false, false);
    }

    public static String o(Object obj, boolean z3) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z3) {
                return String.valueOf(obj);
            }
            Long l5 = (Long) obj;
            if (Math.abs(l5.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l5.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof N) {
                return ((N) obj).f12489a;
            }
            return z3 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z3 ? th.getClass().getName() : th.toString());
        String strT = t(C2236g0.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && t(className).equals(strT)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    public static String p(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strO = o(obj, z3);
        String strO2 = o(obj2, z3);
        String strO3 = o(obj3, z3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strO)) {
            sb.append(str2);
            sb.append(strO);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strO2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strO2);
        }
        if (!TextUtils.isEmpty(strO3)) {
            sb.append(str3);
            sb.append(strO3);
        }
        return sb.toString();
    }

    public static N q(String str) {
        if (str == null) {
            return null;
        }
        return new N(str);
    }

    public static String t(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        C2131z3.p.get();
        return ((Boolean) AbstractC2268x.f12976y0.a(null)).booleanValue() ? "" : str;
    }

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        return false;
    }

    public final void r(int i5, boolean z3, boolean z4, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && s(i5)) {
            Log.println(i5, y(), p(false, str, obj, obj2, obj3));
        }
        if (z4 || i5 < 5) {
            return;
        }
        z.i(str);
        C2226b0 c2226b0 = ((C2236g0) this.f12783a).f12682j;
        if (c2226b0 == null) {
            Log.println(6, y(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!c2226b0.f12771b) {
            Log.println(6, y(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 >= 9) {
            i5 = 8;
        }
        c2226b0.t(new M(this, i5, str, obj, obj2, obj3));
    }

    public final boolean s(int i5) {
        return Log.isLoggable(y(), i5);
    }

    public final C0782Oa u() {
        return this.f12478m;
    }

    public final C0782Oa v() {
        return this.f12472f;
    }

    public final C0782Oa w() {
        return this.f12479n;
    }

    public final C0782Oa x() {
        return this.f12474i;
    }

    public final String y() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    String str2 = ((C2236g0) this.f12783a).f12678d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.e = str2;
                }
                z.i(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
