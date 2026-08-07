package p036i2;

import A2.m;
import H.i;
import J1.a;
import M0.k;
import S.r;
import S.u;
import S.v;
import T1.C0149f;
import T1.z;
import Z0.l;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.compose.ui.graphics.Fields;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.AbstractServiceC0686z;
import androidx.lifecycle.C0685y;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.C1006dd;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.notescrafter.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.o;
import p010c.RunnableC0691d;
import p020e1.p;
import p027g1.b;
import p046k2.h;
import p092v3.y;
import p101x2.c;
import p104y0.f;
import p104y0.n;
import p111z2.d;
import p111z2.j;

/* JADX INFO: loaded from: classes2.dex */
public class e implements a, i, K0.a, c, V0.e, b, A2.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static e f11535s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11536o;
    public Object p;
    public Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f11537r;

    public /* synthetic */ e(int i5, boolean z3) {
        this.f11536o = i5;
    }

    public static final SharedPreferences C(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void D(Context context) throws d {
        if (C(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static final void j(e eVar, Network network, boolean z3) {
        boolean z4;
        boolean z5 = false;
        for (Network network2 : ((ConnectivityManager) eVar.p).getAllNetworks()) {
            if (o.b(network2, network)) {
                z4 = z3;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) eVar.p).getNetworkCapabilities(network2);
                z4 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z4) {
                z5 = true;
                break;
            }
        }
        l lVar = (l) eVar.q;
        synchronized (lVar) {
            try {
                if (((k) lVar.f1897o.get()) != null) {
                    lVar.f1899s = z5;
                } else {
                    lVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(String str, double d4, double d5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5 = 0;
        while (true) {
            arrayList = (ArrayList) this.p;
            int size = arrayList.size();
            arrayList2 = (ArrayList) this.q;
            arrayList3 = (ArrayList) this.f11537r;
            if (i5 >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i5)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i5)).doubleValue();
            if (d4 < dDoubleValue || (dDoubleValue == d4 && d5 < dDoubleValue2)) {
                break;
            } else {
                i5++;
            }
        }
        arrayList.add(i5, str);
        arrayList3.add(i5, Double.valueOf(d4));
        arrayList2.add(i5, Double.valueOf(d5));
    }

    public void B(Object obj, String str) {
        e eVar = new e(21, false);
        ((e) this.f11537r).f11537r = eVar;
        this.f11537r = eVar;
        eVar.q = obj;
        eVar.p = str;
    }

    @Override // A2.c
    /* JADX INFO: renamed from: a */
    public Object mo6685a() {
        return new d((j) ((A2.c) this.p).mo6685a(), (p111z2.c) ((A2.c) this.q).mo6685a(), ((p003a2.b) ((A.e) this.f11537r).p).f1954o);
    }

    @Override // J1.a
    public p101x2.o b() {
        p101x2.i iVar = new p101x2.i();
        ((ExecutorService) this.f11537r).execute(new RunnableC1805vo(10, this, iVar));
        return iVar.f13713a;
    }

    @Override // V0.e
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.p;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // H.i
    public Uri d() {
        return (Uri) this.p;
    }

    @Override // H.i
    public Uri f() {
        return (Uri) this.f11537r;
    }

    @Override // H.i
    public ClipDescription g() {
        return (ClipDescription) this.q;
    }

    @Override // A3.a
    public Object get() {
        switch (this.f11536o) {
            case 16:
                return new p(new h(9), new h(8), (p040j1.b) ((M0.b) this.p).get(), (p045k1.j) ((C0149f) this.q).get(), (p045k1.k) ((F0.h) this.f11537r).get());
            default:
                return new p045k1.d((Context) ((A.e) this.p).p, (p049l1.d) ((A3.a) this.q).get(), (p045k1.b) ((Y2.d) this.f11537r).get());
        }
    }

    @Override // p101x2.c
    public void h(p101x2.h hVar) {
        P1.a aVar = (P1.a) this.p;
        String str = (String) this.q;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f11537r;
        synchronized (aVar.f857a) {
            aVar.f857a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // H.i
    public Object i() {
        return null;
    }

    public void k(String str, String value) {
        o.f(value, "value");
        ((ArrayList) this.f11537r).add(Q3.a.x(str, null, p003a2.a.g(value, null)));
    }

    public p020e1.j l() {
        String strConcat = ((String) this.p) == null ? " backendName" : "";
        if (((p007b1.d) this.f11537r) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new p020e1.j((String) this.p, (byte[]) this.q, (p007b1.d) this.f11537r);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public n m() {
        UUID uuid = (UUID) this.p;
        H0.i iVar = (H0.i) this.q;
        HashSet hashSet = (HashSet) this.f11537r;
        n nVar = new n();
        nVar.f15860a = uuid;
        nVar.f15861b = iVar;
        nVar.f15862c = hashSet;
        p104y0.c cVar = iVar.f477j;
        boolean z3 = cVar.f15846h.f15849a.size() > 0 || cVar.f15844d || cVar.f15842b || cVar.f15843c;
        if (((H0.i) this.q).q && z3) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.p = UUID.randomUUID();
        H0.i iVar2 = (H0.i) this.q;
        H0.i iVar3 = new H0.i();
        iVar3.f471b = 1;
        f fVar = f.f15851c;
        iVar3.e = fVar;
        iVar3.f474f = fVar;
        iVar3.f477j = p104y0.c.f15840i;
        iVar3.f479l = 1;
        iVar3.f480m = 30000L;
        iVar3.p = -1L;
        iVar3.f483r = 1;
        iVar3.f470a = iVar2.f470a;
        iVar3.f472c = iVar2.f472c;
        iVar3.f471b = iVar2.f471b;
        iVar3.f473d = iVar2.f473d;
        iVar3.e = new f(iVar2.e);
        iVar3.f474f = new f(iVar2.f474f);
        iVar3.g = iVar2.g;
        iVar3.f475h = iVar2.f475h;
        iVar3.f476i = iVar2.f476i;
        p104y0.c cVar2 = iVar2.f477j;
        p104y0.c cVar3 = new p104y0.c();
        cVar3.f15841a = 1;
        cVar3.f15845f = -1L;
        cVar3.g = -1L;
        cVar3.f15846h = new p104y0.e();
        cVar3.f15842b = cVar2.f15842b;
        cVar3.f15843c = cVar2.f15843c;
        cVar3.f15841a = cVar2.f15841a;
        cVar3.f15844d = cVar2.f15844d;
        cVar3.e = cVar2.e;
        cVar3.f15846h = cVar2.f15846h;
        iVar3.f477j = cVar3;
        iVar3.f478k = iVar2.f478k;
        iVar3.f479l = iVar2.f479l;
        iVar3.f480m = iVar2.f480m;
        iVar3.f481n = iVar2.f481n;
        iVar3.f482o = iVar2.f482o;
        iVar3.p = iVar2.p;
        iVar3.q = iVar2.q;
        iVar3.f483r = iVar2.f483r;
        this.q = iVar3;
        iVar3.f470a = ((UUID) this.p).toString();
        return nVar;
    }

    public void n(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.q;
        HashMap map2 = (HashMap) this.p;
        W2.f fVar = new W2.f(byteArrayOutputStream, map2, map, (V2.a) this.f11537r);
        T2.d dVar = (T2.d) map2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new T2.b("No encoder for " + obj.getClass());
        }
    }

    public void o(Runnable runnable) {
        ((I0.i) this.p).execute(runnable);
    }

    public H0.d p(String str) {
        p062o0.h hVarH = p062o0.h.h(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            hVarH.j(1);
        } else {
            hVarH.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.p;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarH);
        try {
            return cursorG.moveToFirst() ? new H0.d(cursorG.getString(K2.b.p(cursorG, "work_spec_id")), cursorG.getInt(K2.b.p(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            hVarH.p();
        }
    }

    public X q(C2167f c2167f, String key) {
        boolean zIsInstance;
        X viewModel;
        o.f(key, "key");
        b0 b0Var = (b0) this.p;
        b0Var.getClass();
        LinkedHashMap linkedHashMap = b0Var.f2336a;
        X x4 = (X) linkedHashMap.get(key);
        Class jClass = c2167f.f11699o;
        o.f(jClass, "jClass");
        Map map = C2167f.p;
        o.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            zIsInstance = H.e(num.intValue(), x4);
        } else {
            if (jClass.isPrimitive()) {
                jClass = p003a2.a.v(F.a(jClass));
            }
            zIsInstance = jClass.isInstance(x4);
        }
        Z factory = (Z) this.q;
        if (zIsInstance) {
            if (factory instanceof U) {
                U u = (U) factory;
                o.c(x4);
                u.getClass();
                AbstractC0677p abstractC0677p = u.f2325d;
                if (abstractC0677p != null) {
                    p074r0.e eVar = u.e;
                    o.c(eVar);
                    Q.a(x4, eVar, abstractC0677p);
                }
            }
            o.d(x4, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return x4;
        }
        p011c0.e eVar2 = new p011c0.e((p011c0.c) this.f11537r);
        eVar2.f2532a.put(p019e0.d.f11045o, key);
        o.f(factory, "factory");
        try {
            try {
                viewModel = factory.c(c2167f, eVar2);
            } catch (AbstractMethodError unused) {
                viewModel = factory.a(p003a2.a.u(c2167f));
            }
        } catch (AbstractMethodError unused2) {
            viewModel = factory.b(p003a2.a.u(c2167f), eVar2);
        }
        o.f(viewModel, "viewModel");
        X x5 = (X) linkedHashMap.put(key, viewModel);
        if (x5 != null) {
            x5.b();
        }
        return viewModel;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:240:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:59:0x015f  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    public boolean r() {
        p033h3.n nVar;
        Bundle bundle;
        int identifier;
        String string;
        int i5;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        char c5;
        ?? r1;
        IconCompat iconCompat;
        boolean z3;
        int i6;
        if (((O1.i) this.q).h("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.p;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strV = ((O1.i) this.q).v("gcm.n.image");
        if (TextUtils.isEmpty(strV)) {
            nVar = null;
        } else {
            try {
                nVar = new p033h3.n(new URL(strV));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strV);
                nVar = null;
            }
        }
        if (nVar != null) {
            ExecutorService executorService = (ExecutorService) this.f11537r;
            p101x2.i iVar = new p101x2.i();
            nVar.p = executorService.submit(new N.h(12, nVar, iVar));
            nVar.q = iVar.f13713a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.p;
        O1.i iVar2 = (O1.i) this.q;
        AtomicInteger atomicInteger = p033h3.d.f11465a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), Fields.SpotShadowColor);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strV2 = iVar2.v("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strV2 = null;
        } else {
            try {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                    strV2 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strV2)) {
                        strV2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strV2)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strV2) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(com.razorpay.f.e(string));
                        }
                        strV2 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strV2) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strV2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strV2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strV2)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strV2) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(com.razorpay.f.e(string));
                        }
                        strV2 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        p098x.k kVar = new p098x.k(firebaseMessagingService2, strV2);
        String strU = iVar2.u(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strU)) {
            kVar.e = p098x.k.b(strU);
        }
        String strU2 = iVar2.u(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strU2)) {
            kVar.f13650f = p098x.k.b(strU2);
            p098x.i iVar3 = new p098x.i();
            iVar3.e = p098x.k.b(strU2);
            kVar.e(iVar3);
        }
        String strV3 = iVar2.v("gcm.n.icon");
        if (TextUtils.isEmpty(strV3)) {
            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i5 != 0 || !p033h3.d.a(resources, i5)) {
                try {
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
                }
            }
            if (i5 == 0 && p033h3.d.a(resources, i5)) {
                identifier2 = i5;
            } else {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strV3, "drawable", packageName);
            if ((identifier2 == 0 || !p033h3.d.a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strV3, "mipmap", packageName)) == 0 || !p033h3.d.a(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strV3 + " not found. Notification will use default icon.");
                i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                i5 = i5 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (i5 == 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        kVar.f13660s.icon = identifier2;
        String strV4 = iVar2.v("gcm.n.sound2");
        if (TextUtils.isEmpty(strV4)) {
            strV4 = iVar2.v("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strV4)) {
            defaultUri = null;
        } else if ("default".equals(strV4) || resources.getIdentifier(strV4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strV4);
        }
        if (defaultUri != null) {
            Notification notification = kVar.f13660s;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = p098x.j.a(p098x.j.d(p098x.j.c(p098x.j.b(), 4), 5));
        }
        String strV5 = iVar2.v("gcm.n.click_action");
        if (TextUtils.isEmpty(strV5)) {
            String strV6 = iVar2.v("gcm.n.link_android");
            if (TextUtils.isEmpty(strV6)) {
                strV6 = iVar2.v("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strV6) ? Uri.parse(strV6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strV5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger2 = p033h3.d.f11465a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) iVar2.p;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (iVar2.h("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", iVar2.D());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        kVar.g = activity;
        PendingIntent broadcast = !iVar2.h("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(iVar2.D())), 1140850688);
        if (broadcast != null) {
            kVar.f13660s.deleteIntent = broadcast;
        }
        String strV7 = iVar2.v("gcm.n.color");
        if (TextUtils.isEmpty(strV7)) {
            i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i6 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i6));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strV7));
            } catch (IllegalArgumentException unused3) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strV7 + ". Notification will use default color.");
                i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i6 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i6));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            kVar.f13658o = numValueOf.intValue();
        }
        kVar.c(!iVar2.h("gcm.n.sticky"));
        kVar.f13656m = iVar2.h("gcm.n.local_only");
        String strV8 = iVar2.v("gcm.n.ticker");
        if (strV8 != null) {
            kVar.f13660s.tickerText = p098x.k.b(strV8);
        }
        Integer numN = iVar2.n("gcm.n.notification_priority");
        if (numN == null) {
            numN = null;
        } else if (numN.intValue() < -2 || numN.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numN + ". Skipping setting notificationPriority.");
            numN = null;
        }
        if (numN != null) {
            kVar.f13653j = numN.intValue();
        }
        Integer numN2 = iVar2.n("gcm.n.visibility");
        if (numN2 == null) {
            numN2 = null;
        } else if (numN2.intValue() < -1 || numN2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numN2 + ". Skipping setting visibility.");
            numN2 = null;
        }
        if (numN2 != null) {
            kVar.p = numN2.intValue();
        }
        Integer numN3 = iVar2.n("gcm.n.notification_count");
        if (numN3 == null) {
            numN3 = null;
        } else if (numN3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numN3 + ". Skipping setting notificationCount.");
            numN3 = null;
        }
        if (numN3 != null) {
            kVar.f13652i = numN3.intValue();
        }
        Long lT = iVar2.t();
        if (lT != null) {
            kVar.f13654k = true;
            kVar.f13660s.when = lT.longValue();
        }
        long[] jArrW = iVar2.w();
        if (jArrW != null) {
            kVar.f13660s.vibrate = jArrW;
        }
        int[] iArrQ = iVar2.q();
        if (iArrQ != null) {
            int i7 = iArrQ[0];
            int i8 = iArrQ[1];
            int i9 = iArrQ[2];
            Notification notification2 = kVar.f13660s;
            notification2.ledARGB = i7;
            notification2.ledOnMS = i8;
            notification2.ledOffMS = i9;
            notification2.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | ((-2) & notification2.flags);
        }
        boolean zH = iVar2.h("gcm.n.default_sound");
        ?? r4 = zH;
        if (iVar2.h("gcm.n.default_vibrate_timings")) {
            r4 = (zH ? 1 : 0) | 2;
        }
        if (iVar2.h("gcm.n.default_light_settings")) {
            c5 = 4;
            r1 = (r4 == true ? 1 : 0) | 4;
        } else {
            c5 = 4;
            r1 = r4;
        }
        Notification notification3 = kVar.f13660s;
        notification3.defaults = r1;
        if ((r1 & c5) != 0) {
            notification3.flags |= 1;
        }
        String strV9 = iVar2.v("gcm.n.tag");
        if (TextUtils.isEmpty(strV9)) {
            strV9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strV9;
        if (nVar != null) {
            try {
                p101x2.o oVar = nVar.q;
                z.i(oVar);
                Bitmap bitmap = (Bitmap) p000a.a.c(oVar, 5L, TimeUnit.SECONDS);
                kVar.d(bitmap);
                p098x.h hVar = new p098x.h();
                if (bitmap == null) {
                    iconCompat = null;
                    z3 = true;
                } else {
                    z3 = true;
                    iconCompat = new IconCompat(1);
                    iconCompat.f2208b = bitmap;
                }
                hVar.e = iconCompat;
                hVar.f13645f = null;
                hVar.g = z3;
                kVar.e(hVar);
            } catch (InterruptedException unused5) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                nVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e5) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e5.getCause());
            } catch (TimeoutException unused6) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                nVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.p).getSystemService("notification")).notify(str2, 0, kVar.a());
        return true;
    }

    public boolean s(CharSequence charSequence, int i5, int i6, v vVar) {
        if ((vVar.f1126c & 3) == 0) {
            S.d dVar = (S.d) this.f11537r;
            T.a aVarC = vVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.f253r).getShort(iA + aVarC.f252o);
            }
            dVar.getClass();
            ThreadLocal threadLocal = S.d.f1084b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i5 < i6) {
                sb.append(charSequence.charAt(i5));
                i5++;
            }
            TextPaint textPaint = dVar.f1085a;
            String string = sb.toString();
            int i7 = A.d.f68a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i8 = vVar.f1126c & 4;
            vVar.f1126c = zHasGlyph ? i8 | 2 : i8 | 1;
        }
        return (vVar.f1126c & 3) == 2;
    }

    @Override // V0.e
    public void shutdown() {
        ((ConnectivityManager) this.p).unregisterNetworkCallback((F0.e) this.f11537r);
    }

    public void t(H0.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.p;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((H0.b) this.q).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public String toString() {
        switch (this.f11536o) {
            case 3:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.p);
                sb.append('{');
                C0789Pb c0789Pb = (C0789Pb) ((C0789Pb) this.q).q;
                String str = "";
                while (c0789Pb != null) {
                    Object obj = c0789Pb.p;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c0789Pb = (C0789Pb) c0789Pb.q;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 22:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.p);
                sb2.append('{');
                e eVar = (e) ((e) this.q).f11537r;
                String str2 = "";
                while (eVar != null) {
                    Object obj2 = eVar.q;
                    sb2.append(str2);
                    String str3 = (String) eVar.p;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    eVar = (e) eVar.f11537r;
                    str2 = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(EnumC0675n enumC0675n) {
        W w4 = (W) this.f11537r;
        if (w4 != null) {
            w4.run();
        }
        W w5 = new W((C0685y) this.p, enumC0675n);
        this.f11537r = w5;
        ((Handler) this.q).postAtFrontOfQueue(w5);
    }

    public Object v(CharSequence charSequence, int i5, int i6, int i7, boolean z3, S.p pVar) {
        int i8;
        char c5;
        r rVar = new r((u) ((C1006dd) this.q).f6946r);
        int iCodePointAt = Character.codePointAt(charSequence, i5);
        boolean zA = true;
        int i9 = 0;
        int iCharCount = i5;
        loop0: while (true) {
            i8 = iCharCount;
            while (true) {
                if (iCharCount < i6 && i9 < i7 && zA) {
                    SparseArray sparseArray = rVar.f1108c.f1121a;
                    u uVar = sparseArray == null ? null : (u) sparseArray.get(iCodePointAt);
                    if (rVar.f1106a == 2) {
                        if (uVar != null) {
                            rVar.f1108c = uVar;
                            rVar.f1110f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                rVar.a();
                            } else if (iCodePointAt != 65039) {
                                u uVar2 = rVar.f1108c;
                                if (uVar2.f1122b != null) {
                                    if (rVar.f1110f != 1) {
                                        rVar.f1109d = uVar2;
                                        rVar.a();
                                    } else if (rVar.b()) {
                                        rVar.f1109d = rVar.f1108c;
                                        rVar.a();
                                    } else {
                                        rVar.a();
                                    }
                                    c5 = 3;
                                } else {
                                    rVar.a();
                                }
                            }
                            c5 = 1;
                        }
                        c5 = 2;
                    } else if (uVar == null) {
                        rVar.a();
                        c5 = 1;
                    } else {
                        rVar.f1106a = 2;
                        rVar.f1108c = uVar;
                        rVar.f1110f = 1;
                        c5 = 2;
                    }
                    rVar.e = iCodePointAt;
                    if (c5 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i8)) + i8;
                        if (iCharCount >= i6) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c5 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c5 == 3) {
                        if (!z3 && s(charSequence, i8, iCharCount, rVar.f1109d.f1122b)) {
                            break;
                        }
                        zA = pVar.a(charSequence, i8, iCharCount, rVar.f1109d.f1122b);
                        i9++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (rVar.f1106a == 2 && rVar.f1108c.f1122b != null && ((rVar.f1110f > 1 || rVar.b()) && i9 < i7 && zA && (z3 || !s(charSequence, i8, iCharCount, rVar.f1108c.f1122b)))) {
            pVar.a(charSequence, i8, iCharCount, rVar.f1108c.f1122b);
        }
        return pVar.d();
    }

    public void w(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.p;
        workDatabase_Impl.b();
        H0.e eVar = (H0.e) this.f11537r;
        p080t0.f fVarA = eVar.a();
        if (str == null) {
            fVarA.i(1);
        } else {
            fVarA.j(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.A();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void x(p007b1.a aVar) {
        K2.i iVar = new K2.i(19);
        p020e1.j jVar = (p020e1.j) this.p;
        p007b1.c cVar = (p007b1.c) this.q;
        p pVar = (p) this.f11537r;
        p007b1.d dVar = p007b1.d.f2408o;
        e eVarA = p020e1.j.a();
        eVarA.y(jVar.f11075a);
        eVarA.f11537r = dVar;
        eVarA.q = jVar.f11076b;
        p020e1.j jVarL = eVarA.l();
        p020e1.h hVar = new p020e1.h();
        hVar.g = new HashMap();
        hVar.e = Long.valueOf(pVar.f11088a.q());
        hVar.f11069f = Long.valueOf(pVar.f11089b.q());
        hVar.f11066b = "FCM_CLIENT_EVENT_LOGGING";
        p037i3.e eVar = aVar.f2404a;
        e eVar2 = p033h3.o.f11483a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.n(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        hVar.f11068d = new p020e1.l(cVar, byteArrayOutputStream.toByteArray());
        hVar.f11067c = null;
        p020e1.i iVarB = hVar.b();
        p040j1.a aVar2 = (p040j1.a) pVar.f11090c;
        aVar2.getClass();
        aVar2.f11568b.execute(new S.k(aVar2, jVarL, iVar, iVarB));
    }

    public void y(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.p = str;
    }

    public void z(g4.p type) {
        o.f(type, "type");
        if (type.f11332b.equals("multipart")) {
            this.q = type;
        } else {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    public e(F7 f7, Context context, Uri uri) {
        this.f11536o = 28;
        this.q = f7;
        this.p = context;
        this.f11537r = uri;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i5) {
        this.f11536o = i5;
        this.p = obj;
        this.q = obj2;
        this.f11537r = obj3;
    }

    public e(Context context, int i5) {
        this.f11536o = i5;
        switch (i5) {
            case 5:
                this.p = context.getApplicationContext();
                this.q = Z0.d.f1883a;
                this.f11537r = new Z0.i();
                break;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.q = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                this.f11537r = Executors.newSingleThreadExecutor();
                this.p = context;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new L0.a(this, 9), 0L, 86400L, TimeUnit.SECONDS);
                break;
        }
    }

    public e(MainActivity mainActivity) {
        p111z2.e eVar;
        this.f11536o = 24;
        synchronized (p111z2.b.class) {
            try {
                if (p111z2.b.f16085a == null) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    p111z2.b.f16085a = new p111z2.e(new p003a2.b(applicationContext != null ? applicationContext : mainActivity));
                }
                eVar = p111z2.b.f16085a;
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = (d) eVar.f16093o.mo6685a();
        o.e(dVar, "create(...)");
        this.p = dVar;
        y yVar = new y(this);
        this.f11537r = yVar;
        synchronized (dVar) {
            p111z2.c cVar = dVar.f16091b;
            synchronized (cVar) {
                cVar.f16086a.f("registerListener", new Object[0]);
                cVar.f16089d.add(yVar);
                cVar.a();
            }
        }
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f11536o = 2;
        this.p = workDatabase_Impl;
        this.q = new H0.b(workDatabase_Impl, 2);
        this.f11537r = new H0.e(workDatabase_Impl, 0);
    }

    @Override // H.i
    public void e() {
    }

    public e(AbstractServiceC0686z abstractServiceC0686z) {
        this.f11536o = 12;
        this.p = new C0685y(abstractServiceC0686z);
        this.q = new Handler();
    }

    public e(b0 store, Z factory, p011c0.c extras) {
        this.f11536o = 13;
        o.f(store, "store");
        o.f(factory, "factory");
        o.f(extras, "extras");
        this.p = store;
        this.q = factory;
        this.f11537r = extras;
    }

    public e(p020e1.j jVar, p007b1.c cVar, K2.i iVar, p pVar) {
        this.f11536o = 15;
        this.p = jVar;
        this.q = cVar;
        this.f11537r = pVar;
    }

    public e(ExecutorService executorService) {
        this.f11536o = 4;
        this.q = new Handler(Looper.getMainLooper());
        this.f11537r = new D.n(this, 1);
        this.p = new I0.i(executorService);
    }

    public e(RunnableC0691d runnableC0691d) {
        this.f11536o = 11;
        this.q = new CopyOnWriteArrayList();
        this.f11537r = new HashMap();
        this.p = runnableC0691d;
    }

    public e(ConnectivityManager connectivityManager, l lVar) {
        this.f11536o = 9;
        this.p = connectivityManager;
        this.q = lVar;
        F0.e eVar = new F0.e(this, 1);
        this.f11537r = eVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public e(Class cls) {
        this.f11536o = 25;
        this.f11537r = new HashSet();
        this.p = UUID.randomUUID();
        this.q = new H0.i(((UUID) this.p).toString(), cls.getName());
        ((HashSet) this.f11537r).add(cls.getName());
        ((H0.i) this.q).f473d = OverwritingInputMerger.class.getName();
    }

    public e(C1006dd c1006dd, Y2.d dVar, S.d dVar2, Set set) {
        this.f11536o = 7;
        this.p = dVar;
        this.q = c1006dd;
        this.f11537r = dVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            v(str, 0, str.length(), 1, true, new m(str, 2));
        }
    }

    public e(String str, int i5) {
        this.f11536o = i5;
        switch (i5) {
            case 22:
                e eVar = new e(21, false);
                this.q = eVar;
                this.f11537r = eVar;
                this.p = str;
                break;
            default:
                C0789Pb c0789Pb = new C0789Pb(3);
                this.q = c0789Pb;
                this.f11537r = c0789Pb;
                this.p = str;
                break;
        }
    }

    public e(int i5) {
        this.f11536o = i5;
        switch (i5) {
            case 26:
                this.p = Collections.emptyList();
                this.q = Collections.emptyList();
                break;
            case 27:
                this.p = new ArrayList();
                this.q = new ArrayList();
                this.f11537r = new ArrayList();
                break;
            default:
                String string = UUID.randomUUID().toString();
                o.e(string, "randomUUID().toString()");
                t4.j jVar = t4.j.f13258r;
                this.p = h.m(string);
                this.q = g4.r.g;
                this.f11537r = new ArrayList();
                break;
        }
    }

    public e(O1.i iVar) {
        this.f11536o = 19;
        this.p = iVar.v("gcm.n.title");
        iVar.s("gcm.n.title");
        Object[] objArrR = iVar.r("gcm.n.title");
        if (objArrR != null) {
            String[] strArr = new String[objArrR.length];
            for (int i5 = 0; i5 < objArrR.length; i5++) {
                strArr[i5] = String.valueOf(objArrR[i5]);
            }
        }
        this.q = iVar.v("gcm.n.body");
        iVar.s("gcm.n.body");
        Object[] objArrR2 = iVar.r("gcm.n.body");
        if (objArrR2 != null) {
            String[] strArr2 = new String[objArrR2.length];
            for (int i6 = 0; i6 < objArrR2.length; i6++) {
                strArr2[i6] = String.valueOf(objArrR2[i6]);
            }
        }
        iVar.v("gcm.n.icon");
        if (TextUtils.isEmpty(iVar.v("gcm.n.sound2"))) {
            iVar.v("gcm.n.sound");
        }
        iVar.v("gcm.n.tag");
        iVar.v("gcm.n.color");
        iVar.v("gcm.n.click_action");
        iVar.v("gcm.n.android_channel_id");
        String strV = iVar.v("gcm.n.link_android");
        strV = TextUtils.isEmpty(strV) ? iVar.v("gcm.n.link") : strV;
        if (!TextUtils.isEmpty(strV)) {
            Uri.parse(strV);
        }
        this.f11537r = iVar.v("gcm.n.image");
        iVar.v("gcm.n.ticker");
        iVar.n("gcm.n.notification_priority");
        iVar.n("gcm.n.visibility");
        iVar.n("gcm.n.notification_count");
        iVar.h("gcm.n.sticky");
        iVar.h("gcm.n.local_only");
        iVar.h("gcm.n.default_sound");
        iVar.h("gcm.n.default_vibrate_timings");
        iVar.h("gcm.n.default_light_settings");
        iVar.t();
        iVar.q();
        iVar.w();
    }
}
