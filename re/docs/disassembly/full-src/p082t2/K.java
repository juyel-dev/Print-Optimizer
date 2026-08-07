package p082t2;

import T1.z;
import android.os.Bundle;
import androidx.compose.foundation.text.modifiers.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p042j3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f12458b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f12459c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f12460d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12461a;

    public K(c cVar) {
        this.f12461a = cVar;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        z.i(atomicReference);
        z.b(strArr.length == strArr2.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (Objects.equals(str, strArr[i5])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i5] == null) {
                            strArr3[i5] = strArr2[i5] + "(" + strArr[i5] + ")";
                        }
                        str2 = strArr3[i5];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String strE;
        if (bundle == null) {
            return null;
        }
        if (!this.f12461a.x()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strE = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strE = e((Object[]) obj);
            } else {
                strE = obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strE);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f12461a.x() ? str : c(str, AbstractC2261t0.f12853c, AbstractC2261t0.f12851a, f12458b);
    }

    public final String d(C2264v c2264v) {
        String string;
        c cVar = this.f12461a;
        if (!cVar.x()) {
            return c2264v.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c2264v.q);
        sb.append(",name=");
        sb.append(b(c2264v.f12869o));
        sb.append(",params=");
        r rVar = c2264v.p;
        if (rVar == null) {
            string = null;
        } else {
            string = !cVar.x() ? rVar.f12826o.toString() : a(rVar.i());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strA);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f12461a.x() ? str : c(str, AbstractC2261t0.f12856h, AbstractC2261t0.g, f12459c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (this.f12461a.x()) {
            return str.startsWith("_exp_") ? a.z("experiment_id(", str, ")") : c(str, AbstractC2261t0.f12855f, AbstractC2261t0.e, f12460d);
        }
        return str;
    }
}
