package A2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.ads.C1458ns;
import com.google.android.gms.internal.ads.C1720tr;
import com.google.android.gms.internal.ads.Ft;
import com.google.android.gms.internal.ads.G5;
import com.google.android.gms.internal.ads.RunnableC0701Ae;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC0947c5;
import com.google.android.gms.internal.ads.Wq;
import com.google.android.gms.internal.measurement.C2010c4;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import p082t2.AbstractC2268x;
import p082t2.C2226b0;
import p082t2.C2236g0;
import p082t2.L;
import p083t3.C2306q;
import p092v3.y;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f101b;

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((RunnableC0701Ae) this.f101b).f2773r).f10846b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i5 = 3;
        switch (this.f100a) {
            case 0:
                p111z2.c cVar = (p111z2.c) this.f101b;
                cVar.getClass();
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f16086a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f16086a.b("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    cVar.f16086a.b("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                m mVar = cVar.f16086a;
                mVar.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                mVar.b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                mVar.b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f16086a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    for (y yVar : new HashSet(cVar.f16089d)) {
                        yVar.getClass();
                        if (zzaVar.f10830a == 11) {
                            Log.d("UpdateManager", "Update downloaded");
                            C2306q c2306q = (C2306q) yVar.f13588a.q;
                            if (c2306q != null) {
                                c2306q.invoke();
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return;
            case 1:
                if (intent != null) {
                    ((F0.c) this.f101b).g(intent);
                    return;
                }
                return;
            case 2:
                ((ViewOnAttachStateChangeListenerC0947c5) this.f101b).c();
                return;
            case 3:
                ((G5) this.f101b).c(3);
                return;
            case 4:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i5 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i5 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                    case 10:
                                    case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                                    case Matrix.TranslateX /* 12 */:
                                    case Matrix.TranslateZ /* 14 */:
                                    case 15:
                                    case 17:
                                        i5 = 4;
                                        break;
                                    case Matrix.TranslateY /* 13 */:
                                        i5 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i5 = 6;
                                        break;
                                    case 18:
                                        i5 = 2;
                                        break;
                                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                                        if (Ft.f3701a >= 29) {
                                            i5 = 9;
                                        } else {
                                            i5 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i5 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                    case 10:
                                    case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                                    case Matrix.TranslateX /* 12 */:
                                    case Matrix.TranslateZ /* 14 */:
                                    case 15:
                                    case 17:
                                        i5 = 4;
                                        break;
                                    case Matrix.TranslateY /* 13 */:
                                        i5 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i5 = 6;
                                        break;
                                    case 18:
                                        i5 = 2;
                                        break;
                                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                                        if (Ft.f3701a >= 29) {
                                            i5 = 9;
                                        } else {
                                            i5 = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i5 = type != 9 ? 8 : 7;
                            } else {
                                i5 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i6 = Ft.f3701a;
                C1720tr c1720tr = (C1720tr) this.f101b;
                if (i6 < 31 || i5 != 5) {
                    C1720tr.g(c1720tr, i5);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    Wq wq = new Wq(c1720tr);
                    telephonyManager.registerTelephonyCallback(context.getMainExecutor(), wq);
                    telephonyManager.unregisterTelephonyCallback(wq);
                    return;
                } catch (RuntimeException unused2) {
                    C1720tr.g(c1720tr, 5);
                    return;
                }
            case 5:
                RunnableC0701Ae runnableC0701Ae = (RunnableC0701Ae) this.f101b;
                if (runnableC0701Ae != null && runnableC0701Ae.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC0701Ae runnableC0701Ae2 = (RunnableC0701Ae) this.f101b;
                    ((FirebaseMessaging) runnableC0701Ae2.f2773r).getClass();
                    FirebaseMessaging.b(runnableC0701Ae2, 0L);
                    ((FirebaseMessaging) ((RunnableC0701Ae) this.f101b).f2773r).f10846b.unregisterReceiver(this);
                    this.f101b = null;
                    return;
                }
                return;
            case 6:
                C2236g0 c2236g0 = (C2236g0) this.f101b;
                if (intent == null) {
                    L l5 = c2236g0.f12681i;
                    C2236g0.d(l5);
                    l5.f12474i.g("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    L l6 = c2236g0.f12681i;
                    C2236g0.d(l6);
                    l6.f12474i.g("App receiver called with null action");
                    return;
                }
                if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    L l7 = c2236g0.f12681i;
                    C2236g0.d(l7);
                    l7.f12474i.g("App receiver called with unknown action");
                    return;
                }
                C2010c4.a();
                if (c2236g0.g.t(null, AbstractC2268x.f12893D0)) {
                    L l8 = c2236g0.f12681i;
                    C2236g0.d(l8);
                    l8.f12479n.g("App receiver notified triggers are available");
                    C2226b0 c2226b0 = c2236g0.f12682j;
                    C2236g0.d(c2226b0);
                    L0.a aVar = new L0.a(15);
                    aVar.p = c2236g0;
                    c2226b0.t(aVar);
                    return;
                }
                return;
            case 7:
                C1458ns c1458ns = (C1458ns) this.f101b;
                synchronized (c1458ns) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) c1458ns.f8462r).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((BroadcastReceiver) arrayList.get(i7)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                boolean zEquals = "android.intent.action.USER_PRESENT".equals(intent.getAction());
                F f5 = (F) this.f101b;
                if (zEquals) {
                    f5.e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        f5.e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ k(Object obj, int i5) {
        this.f100a = i5;
        this.f101b = obj;
    }

    public k(C2236g0 c2236g0) {
        this.f100a = 6;
        this.f101b = c2236g0;
    }
}
