package p033h3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p096w2.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f11518a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11519b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f11520c;

    public static void a(Context context) {
        if (f11520c == null) {
            a aVar = new a(context);
            f11520c = aVar;
            synchronized (aVar.f13596a) {
                aVar.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f11519b) {
            try {
                if (f11520c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f11520c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f11519b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f11520c.a(f11518a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
