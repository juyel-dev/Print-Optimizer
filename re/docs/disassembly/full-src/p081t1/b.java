package p081t1;

import Q1.a;
import Q1.f;
import Q1.g;
import T1.z;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C0731Fd;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p032h2.c;
import p032h2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12383d = new Object();
    public c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f12384f;
    public final long g;

    public b(Context context, long j5, boolean z3) {
        Context applicationContext;
        z.i(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f12384f = context;
        this.f12382c = false;
        this.g = j5;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a aVarF = bVar.f();
            e(aVarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            bVar.c();
            return aVarF;
        } catch (Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                bVar.c();
                throw th2;
            }
        }
    }

    public static boolean b(Context context) {
        boolean z3;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            z.h("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f12382c) {
                        synchronized (bVar.f12383d) {
                            c cVar = bVar.e;
                            if (cVar == null || !cVar.f12386r) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f12382c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    z.i(bVar.f12380a);
                    z.i(bVar.f12381b);
                    try {
                        p032h2.b bVar2 = (p032h2.b) bVar.f12381b;
                        bVar2.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelB0 = bVar2.b0(parcelObtain, 6);
                        int i5 = p032h2.a.f11440a;
                        z3 = parcelB0.readInt() != 0;
                        parcelB0.recycle();
                    } catch (RemoteException e3) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            bVar.c();
            return z3;
        } catch (Throwable th2) {
            bVar.c();
            throw th2;
        }
    }

    public static void e(a aVar, long j5, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f12379b ? "0" : "1");
                String str = aVar.f12378a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j5));
            new C0731Fd(1, map).start();
        }
    }

    public final void c() {
        z.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f12384f == null || this.f12380a == null) {
                    return;
                }
                try {
                    if (this.f12382c) {
                        X1.a.b().c(this.f12384f, this.f12380a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f12382c = false;
                this.f12381b = null;
                this.f12380a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z3) {
        z.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f12382c) {
                    c();
                }
                Context context = this.f12384f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = f.f969b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    a aVar = new a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!X1.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f12380a = aVar;
                        try {
                            IBinder iBinderA = aVar.a(TimeUnit.MILLISECONDS);
                            int i5 = c.f11442o;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f12381b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new p032h2.b(iBinderA);
                            this.f12382c = true;
                            if (z3) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final a f() {
        a aVar;
        z.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f12382c) {
                    synchronized (this.f12383d) {
                        c cVar = this.e;
                        if (cVar == null || !cVar.f12386r) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f12382c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                z.i(this.f12380a);
                z.i(this.f12381b);
                try {
                    p032h2.b bVar = (p032h2.b) this.f12381b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelB0 = bVar.b0(parcelObtain, 1);
                    String string = parcelB0.readString();
                    parcelB0.recycle();
                    p032h2.b bVar2 = (p032h2.b) this.f12381b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i5 = p032h2.a.f11440a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelB1 = bVar2.b0(parcelObtain2, 2);
                    boolean z3 = parcelB1.readInt() != 0;
                    parcelB1.recycle();
                    aVar = new a(string, z3);
                } catch (RemoteException e3) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f12383d) {
            c cVar = this.e;
            if (cVar != null) {
                cVar.q.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j5 = this.g;
            if (j5 > 0) {
                this.e = new c(this, j5);
            }
        }
    }
}
