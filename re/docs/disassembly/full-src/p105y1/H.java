package p105y1;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import p085u1.k;
import p090v1.C2366q;
import p092v3.i;

/* JADX INFO: loaded from: classes2.dex */
public class H extends G {
    @Override // p105y1.G
    public final Intent b(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // p105y1.G
    public final void c(Context context) {
        i.d();
        NotificationChannel notificationChannelB = i.b(((Integer) C2366q.f13480d.f13483c.a(AbstractC1869x7.x7)).intValue());
        notificationChannelB.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelB);
    }

    @Override // p105y1.G
    public final boolean d(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // p105y1.G
    public final int e(Context context, TelephonyManager telephonyManager) {
        F f5 = k.f13311A.f13314c;
        return (F.J(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
