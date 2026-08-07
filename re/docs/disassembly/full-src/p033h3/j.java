package p033h3;

import I.d;
import K2.i;
import N.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p000a.a;
import p047l.C2174e;
import p101x2.h;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11474c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C f11475d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11477b;

    public j(ExecutorService executorService) {
        this.f11477b = new C2174e(0);
        this.f11476a = executorService;
    }

    public static o a(Context context, Intent intent, boolean z3) {
        C c5;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f11474c) {
            try {
                if (f11475d == null) {
                    f11475d = new C(context);
                }
                c5 = f11475d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            return c5.b(intent).i(new d(0), new i(21));
        }
        if (r.h().j(context)) {
            synchronized (z.f11519b) {
                try {
                    z.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        z.f11520c.a(z.f11518a);
                    }
                    c5.b(intent).h(new b(intent, 11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            c5.b(intent);
        }
        return a.o(-1);
    }

    public o b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zH = Y1.b.h();
        final Context context = (Context) this.f11476a;
        boolean z3 = zH && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z4 = (intent.getFlags() & 268435456) != 0;
        if (z3 && !z4) {
            return a(context, intent, z4);
        }
        d dVar = (d) this.f11477b;
        return a.f(dVar, new Callable() { // from class: h3.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i5;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                r rVarH = r.h();
                rVarH.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) rVarH.f11488r).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (rVarH) {
                    try {
                        str = (String) rVarH.f11487o;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    rVarH.f11487o = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    rVarH.f11487o = serviceInfo.name;
                                }
                                str = (String) rVarH.f11487o;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (rVarH.j(context2)) {
                        componentNameStartService = z.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i5 = 404;
                    } else {
                        i5 = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i5 = 402;
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
                    i5 = 401;
                }
                return Integer.valueOf(i5);
            }
        }).j(dVar, new p101x2.a() { // from class: h3.i
            @Override // p101x2.a
            public final Object f(h hVar) {
                if (!Y1.b.h() || ((Integer) hVar.e()).intValue() != 402) {
                    return hVar;
                }
                return j.a(context, intent, z4).i(new d(0), new K2.i(20));
            }
        });
    }

    public j(Context context) {
        this.f11476a = context;
        this.f11477b = new d(0);
    }
}
