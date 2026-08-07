package p033h3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.C1846wl;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Runnable {
    public static final Object t = new Object();
    public static Boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Boolean f11514v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f11515o;
    public final C1846wl p;
    public final PowerManager.WakeLock q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f11516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11517s;

    public y(w wVar, Context context, C1846wl c1846wl, long j5) {
        this.f11516r = wVar;
        this.f11515o = context;
        this.f11517s = j5;
        this.p = c1846wl;
        this.q = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (t) {
            try {
                Boolean bool = f11514v;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f11514v = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z3 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z3 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z3;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (t) {
            try {
                Boolean bool = u;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                u = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11515o.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f11516r;
        Context context = this.f11515o;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.q;
        if (zC) {
            wakeLock.acquire(e.f11466a);
        }
        try {
            wVar.d(true);
            if (!this.p.l()) {
                wVar.d(false);
            } else if (a(context) && !d()) {
                new x(this, this).a();
            } else {
                if (wVar.e()) {
                    wVar.d(false);
                } else {
                    wVar.f(this.f11517s);
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            wVar.d(false);
        } finally {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }
}
