package p105y1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import p085u1.k;

/* JADX INFO: loaded from: classes2.dex */
public class G {
    public static CookieManager a() {
        F f5 = k.f13311A.f13314c;
        int iMyUid = Process.myUid();
        if (iMyUid == 0 || iMyUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            AbstractC1223ib.q("Failed to obtain CookieManager.", th);
            k.f13311A.g.f("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public Intent b(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public boolean d(Context context) {
        return false;
    }

    public int e(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int f(AudioManager audioManager) {
        return 0;
    }

    public int h(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void c(Context context) {
    }

    public void g(Activity activity) {
    }
}
