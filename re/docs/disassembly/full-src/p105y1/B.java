package p105y1;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC0863a8;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.C1844wj;
import com.google.android.gms.internal.ads.Ct;
import com.google.android.gms.internal.ads.Dt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends AbstractC1223ib {
    public static void w(String str) {
        if (!y()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        C1844wj c1844wj = AbstractC1223ib.f7708A;
        Iterator itP = ((Dt) c1844wj.p).p(c1844wj, str);
        boolean z3 = true;
        while (true) {
            Ct ct = (Ct) itP;
            if (!ct.hasNext()) {
                return;
            }
            String str2 = (String) ct.next();
            if (z3) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void x(String str, Throwable th) {
        if (y()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean y() {
        return AbstractC1223ib.v(2) && ((Boolean) AbstractC0863a8.f6594a.p()).booleanValue();
    }
}
