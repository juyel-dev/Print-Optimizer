package p103y;

import A2.k;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static Intent a(Context context, k kVar, IntentFilter intentFilter, int i5) {
        if ((i5 & 4) == 0) {
            return context.registerReceiver(kVar, intentFilter, null, null, i5 & 1);
        }
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (b.b(context, str) == 0) {
            return context.registerReceiver(kVar, intentFilter, str, null);
        }
        throw new RuntimeException(androidx.compose.foundation.text.modifiers.a.z("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent b(Context context, k kVar, IntentFilter intentFilter, int i5) {
        return context.registerReceiver(kVar, intentFilter, null, null, i5);
    }

    public static void c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
