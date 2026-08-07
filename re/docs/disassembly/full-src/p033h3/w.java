package p033h3;

import M0.b;
import N.e;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.C1846wl;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000a.a;
import p020e1.h;
import p047l.C2174e;
import p101x2.i;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f11504i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f11505j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1846wl f11507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f11508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f11509d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11510f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f11511h;
    public final C2174e e = new C2174e(0);
    public boolean g = false;

    public w(FirebaseMessaging firebaseMessaging, C1846wl c1846wl, u uVar, h hVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11509d = firebaseMessaging;
        this.f11507b = c1846wl;
        this.f11511h = uVar;
        this.f11508c = hVar;
        this.f11506a = context;
        this.f11510f = scheduledThreadPoolExecutor;
    }

    public static void a(o oVar) throws IOException {
        try {
            a.c(oVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e5) {
            e = e5;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f11509d.a();
        h hVar = this.f11508c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(hVar.d(hVar.g(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f11509d.a();
        h hVar = this.f11508c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(hVar.d(hVar.g(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z3) {
        this.g = z3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    public final boolean e() throws IOException {
        t tVarA;
        byte b5;
        while (true) {
            synchronized (this) {
                try {
                    tVarA = this.f11511h.a();
                    if (tVarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = tVarA.f11495b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b5 = 1;
                    } else {
                        b5 = -1;
                    }
                } else if (str.equals("S")) {
                    b5 = 0;
                } else {
                    b5 = -1;
                }
                String str2 = tVarA.f11494a;
                if (b5 == 0) {
                    b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (b5 == 1) {
                    c(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + tVarA + ".");
                }
                u uVar = this.f11511h;
                synchronized (uVar) {
                    b bVar = uVar.f11498a;
                    String str3 = tVarA.f11496c;
                    synchronized (((ArrayDeque) bVar.f656r)) {
                        if (((ArrayDeque) bVar.f656r).remove(str3)) {
                            ((ScheduledThreadPoolExecutor) bVar.f657s).execute(new e(bVar, 10));
                        }
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = tVarA.f11496c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            i iVar = (i) arrayDeque.poll();
                            if (iVar != null) {
                                iVar.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j5) {
        long jMin = Math.min(Math.max(30L, 2 * j5), f11504i);
        this.f11510f.schedule(new y(this, this.f11506a, this.f11507b, jMin), j5, TimeUnit.SECONDS);
        d(true);
    }
}
