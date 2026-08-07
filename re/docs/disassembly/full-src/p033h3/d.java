package p033h3;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.razorpay.f;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f11465a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i5) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!f.v(resources.getDrawable(i5, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i5);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i5 + ", treating it as an invalid icon");
            return false;
        }
    }
}
