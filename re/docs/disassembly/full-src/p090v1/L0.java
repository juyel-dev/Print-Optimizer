package p090v1;

import W.P;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C0743Hd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import p067p1.l;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f13418a = new L0();

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    public static J0 a(Context context, r0 r0Var) {
        boolean z3;
        String str;
        String className;
        r0Var.getClass();
        Set set = r0Var.g;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        l lVar = (l) u0.n().q;
        C0743Hd c0743Hd = C2362o.f13474f.f13475a;
        String strM = C0743Hd.m(context);
        int i5 = 0;
        if (r0Var.f13492i.contains(strM)) {
            z3 = true;
        } else {
            lVar.getClass();
            if (new ArrayList(lVar.f12275a).contains(strM)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        Bundle bundle = r0Var.f13487b.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i6 = i5 + 1;
                if (i6 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i5];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (C0743Hd.f3899c.equalsIgnoreCase(className2) || C0743Hd.f3900d.equalsIgnoreCase(className2) || C0743Hd.e.equalsIgnoreCase(className2) || C0743Hd.f3901f.equalsIgnoreCase(className2) || C0743Hd.g.equalsIgnoreCase(className2) || C0743Hd.f3902h.equalsIgnoreCase(className2))) {
                    className = stackTrace[i6].getClassName();
                    break;
                }
                i5 = i6;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    for (int i7 = 2; i7 > 0 && stringTokenizer.hasMoreElements(); i7--) {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        ((l) u0.n().q).getClass();
        return new J0(8, -1L, bundle, -1, listUnmodifiableList, z3, Math.max(r0Var.f13488c, -1), false, null, null, null, null, r0Var.f13487b, r0Var.f13489d, Collections.unmodifiableList(new ArrayList((Set) r0Var.f13493j)), null, str, r0Var.e, null, -1, (String) Collections.max(Arrays.asList(null, ""), K0.f13417o), new ArrayList(r0Var.f13486a), r0Var.f13490f, null, P.b(1));
    }
}
