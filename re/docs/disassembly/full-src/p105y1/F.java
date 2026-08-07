package p105y1;

import E1.l;
import Q1.h;
import Y1.b;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1617rc;
import com.google.android.gms.internal.ads.AbstractC1683sy;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.C0977cs;
import com.google.android.gms.internal.ads.C1412mq;
import com.google.android.gms.internal.ads.C1500oq;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1722tt;
import com.google.android.gms.internal.ads.C1844wj;
import com.google.android.gms.internal.ads.Ct;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.HC;
import com.google.android.gms.internal.ads.InterfaceC0828Ve;
import com.google.android.gms.internal.ads.Kk;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1781v7;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.c;
import p036i2.e;
import p085u1.k;
import p090v1.C2362o;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C f15900l = new C(Looper.getMainLooper(), 0);
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f15906h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f15901a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15902b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f15903c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15904d = new AtomicBoolean();
    public boolean e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15905f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15907i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15908j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f15909k = Executors.newSingleThreadExecutor();

    public static int A(Context context, Uri uri) {
        int i5;
        String strC;
        if (context == null) {
            B.w("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i5 = 0;
        } else {
            B.w("Chrome Custom Tabs can only work with Activity context.");
            i5 = 2;
        }
        C1693t7 c1693t7 = AbstractC1869x7.f9775V3;
        C2366q c2366q = C2366q.f13480d;
        Boolean bool = (Boolean) c2366q.f13483c.a(c1693t7);
        C1693t7 c1693t8 = AbstractC1869x7.f9780W3;
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        if (true == bool.equals(sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8))) {
            i5 = 9;
        }
        if (i5 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i5;
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t7)).booleanValue()) {
            F7 f7 = new F7();
            f7.f3540d = new e(f7, context, uri);
            Activity activity = (Activity) context;
            if (f7.f3538b == null && (strC = AbstractC1683sy.c(activity)) != null) {
                HC hc = new HC(f7);
                f7.f3539c = hc;
                hc.p = activity.getApplicationContext();
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strC)) {
                    intent2.setPackage(strC);
                }
                activity.bindService(intent2, hc, 33);
            }
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8)).booleanValue()) {
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent3.putExtras(bundle);
        }
        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent3.putExtras(new Bundle());
        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent3.setPackage(AbstractC1683sy.c(context));
        intent3.setData(uri);
        context.startActivity(intent3, null);
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean B(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void C(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String D(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return r(q(context));
    }

    public static final String E() {
        StringBuilder sb = new StringBuilder(Fields.RotationX);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String F() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : a.m(str, " ", str2);
    }

    public static final HashMap G(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i5);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            k.f13311A.g.g("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long H(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final v I(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                AbstractC1223ib.p("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof v ? (v) iInterfaceQueryLocalInterface : new u(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 0);
        } catch (Exception e) {
            k.f13311A.g.g("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean J(Context context, String str) {
        int i5 = AbstractC1617rc.f8942a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return c.a(context).f1954o.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean a(Context context) {
        try {
            if (b.f1854h == null) {
                b.f1854h = Boolean.valueOf(b.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return b.f1854h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean b(String str) {
        if (!C0761Kd.c()) {
            return false;
        }
        C1693t7 c1693t7 = AbstractC1869x7.f9878o4;
        C2366q c2366q = C2366q.f13480d;
        if (!((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue()) {
            return false;
        }
        String str2 = (String) c2366q.f13483c.a(AbstractC1869x7.f9887q4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9883p4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            AbstractC1223ib.q("Error loading class.", th);
            k.f13311A.g.g("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean e(Context context) {
        try {
            Bundle bundleQ = q(context);
            return TextUtils.isEmpty(r(bundleQ)) && !TextUtils.isEmpty(bundleQ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    public static final boolean f(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void g(View view, int i5) {
        int iHeight;
        int iWidth;
        String str;
        ?? r6;
        C1412mq c1412mqV;
        String str2;
        C1500oq c1500oqG0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof Kk) {
                childAt = ((Kk) childAt).getChildAt(0);
            }
            boolean z3 = childAt instanceof D1.e;
            String str3 = z3 ? "NATIVE" : "UNKNOWN";
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            F f5 = k.f13311A.f13314c;
            long jH = H(childAt);
            childAt.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            String str4 = "none";
            if (!(childAt instanceof InterfaceC0828Ve) || (c1500oqG0 = ((InterfaceC0828Ve) childAt).g0()) == null) {
                str = "none";
            } else {
                str = c1500oqG0.f8652b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if (!(childAt instanceof InterfaceC0828Ve) || (c1412mqV = ((InterfaceC0828Ve) childAt).v()) == null) {
                r6 = z3;
            } else {
                switch (c1412mqV.f8318b) {
                    case 1:
                        str2 = "BANNER";
                        break;
                    case 2:
                        str2 = "INTERSTITIAL";
                        break;
                    case 3:
                        str2 = "NATIVE_EXPRESS";
                        break;
                    case 4:
                        str2 = "NATIVE";
                        break;
                    case 5:
                        str2 = "REWARDED";
                        break;
                    case 6:
                        str2 = "APP_OPEN_AD";
                        break;
                    case 7:
                        str2 = "REWARDED_INTERSTITIAL";
                        break;
                    default:
                        str2 = "UNKNOWN";
                        break;
                }
                int i8 = c1412mqV.e;
                str4 = c1412mqV.f8294E;
                str3 = str2;
                r6 = i8;
            }
            Locale locale = Locale.US;
            AbstractC1223ib.r("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str + ", format=" + str3 + ", impType=" + r6 + ", class=" + childAt.getClass().getName() + ", x=" + i6 + ", y=" + i7 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jH + ", state=" + Integer.toString(i5, 2) + ">");
        } catch (Exception e) {
            AbstractC1223ib.q("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder h(Context context) {
        G g = k.f13311A.e;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void i(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new w(context, str, (String) it.next()).d();
        }
    }

    public static final int j(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            AbstractC1223ib.s("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final HashMap k(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] l(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] m(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        C2362o c2362o = C2362o.f13474f;
        return new int[]{c2362o.f13475a.d(activity, iArr[0]), c2362o.f13475a.d(activity, iArr[1])};
    }

    public static final boolean n(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z3 = k.f13311A.f13314c.e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || B(view);
        long jH = H(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z3)) {
            C1693t7 c1693t7 = AbstractC1869x7.f9804b1;
            C2366q c2366q = C2366q.f13480d;
            if (!((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                C1693t7 c1693t8 = AbstractC1869x7.h9;
                SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8)).booleanValue() || jH >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.j9)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void o(Context context, Intent intent) {
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.B9)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            AbstractC1223ib.t("", e);
            k.f13311A.g.g("AdUtil.startActivityWithUnknownContext", e);
        }
    }

    public static final void p(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            C(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            AbstractC1223ib.m("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            AbstractC1223ib.q("No browser is found.", e);
        }
    }

    public static Bundle q(Context context) {
        try {
            return c.a(context).a(Fields.SpotShadowColor, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            B.x("Error getting metadata", e);
            return null;
        }
    }

    public static String r(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean s(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int t(int i5) {
        if (i5 >= 5000) {
            return i5;
        }
        if (i5 <= 0) {
            return 60000;
        }
        AbstractC1223ib.s("HTTP timeout too low: " + i5 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static final String u(Context context, String str) {
        Context contextCreatePackageContext;
        if (str == null) {
            return E();
        }
        String strE = null;
        try {
            if (E1.e.f323b == null) {
                E1.e.f323b = new E1.e();
            }
            E1.e eVar = E1.e.f323b;
            if (TextUtils.isEmpty(eVar.f324a)) {
                int i5 = h.e;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                eVar.f324a = (String) p000a.a.w(context, new l(17, contextCreatePackageContext, context));
            }
            strE = eVar.f324a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strE)) {
            strE = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strE)) {
            strE = E();
        }
        String strM = a.m(strE, " (Mobile; ", str);
        try {
            if (c.a(context).d()) {
                strM = strM + ";aia";
            }
        } catch (Exception e) {
            k.f13311A.g.g("AdUtil.getUserAgent", e);
        }
        return strM.concat(")");
    }

    public static ArrayList w() {
        C1693t7 c1693t7 = AbstractC1869x7.f9796a;
        ArrayList<String> arrayListU = C2366q.f13480d.f13481a.u();
        ArrayList arrayList = new ArrayList();
        for (String str : arrayListU) {
            C1844wj c1844wjS = C1844wj.s(new C1722tt(','));
            str.getClass();
            Iterator itP = ((Dt) c1844wjS.p).p(c1844wjS, str);
            while (true) {
                Ct ct = (Ct) itP;
                if (ct.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) ct.next()));
                    } catch (NumberFormatException unused) {
                        B.w("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public final String v(Context context, String str) {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.O9)).booleanValue()) {
            if (this.f15906h != null) {
                return this.f15906h;
            }
            this.f15906h = u(context, str);
            return this.f15906h;
        }
        synchronized (this.f15905f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String strU = u(context, str);
                this.g = strU;
                return strU;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(Context context, String str, HttpURLConnection httpURLConnection, int i5) {
        int iT = t(i5);
        AbstractC1223ib.r("HTTP timeout: " + iT + " milliseconds.");
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", v(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void y(Context context) {
        if (this.f15908j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC1869x7.a(context);
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.A9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C0977cs(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C0977cs(1), intentFilter, 4);
        }
        this.f15908j = true;
    }

    public final void z(Context context) {
        if (this.f15907i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC1869x7.a(context);
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.A9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new A2.k(this, 8), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new A2.k(this, 8), intentFilter, 4);
        }
        this.f15907i = true;
    }
}
