package p100x1;

import L0.a;
import O1.i;
import P1.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC0717Db;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.C0785Od;
import com.google.android.gms.internal.ads.C1051ef;
import com.google.android.gms.internal.ads.C1313kf;
import com.google.android.gms.internal.ads.C1517p6;
import com.google.android.gms.internal.ads.C1538pk;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1926yd;
import com.google.android.gms.internal.ads.Gh;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.Gv;
import com.google.android.gms.internal.ads.Hm;
import com.google.android.gms.internal.ads.Ii;
import com.google.android.gms.internal.ads.InterfaceC0828Ve;
import com.google.android.gms.internal.ads.InterfaceC1256j9;
import com.google.android.gms.internal.ads.InterfaceC1924yb;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1781v7;
import com.notescrafter.app.R;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import p008b2.b;
import p013c2.d;
import p085u1.e;
import p085u1.k;
import p090v1.C2362o;
import p090v1.C2366q;
import p090v1.InterfaceC2334a;
import p105y1.B;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractBinderC0717Db {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f13676M = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public a f13680D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f13681E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f13682F;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Toolbar f13686J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ int f13688L;
    public final Activity p;
    public AdOverlayInfoParcel q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0828Ve f13689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f13690s;
    public k t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FrameLayout f13691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f13692w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f13695z;
    public boolean u = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13693x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13694y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13677A = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13687K = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f13678B = new Object();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final e f13679C = new e(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f13683G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13684H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13685I = true;

    public c(Activity activity, int i5) {
        this.f13688L = i5;
        this.p = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void B() {
        h hVar;
        h();
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (hVar = adOverlayInfoParcel.q) != null) {
            hVar.c0();
        }
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9844i4)).booleanValue() && this.f13689r != null && (!this.p.isFinishing() || this.f13690s == null)) {
            this.f13689r.onPause();
        }
        M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void C() {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9844i4)).booleanValue() && this.f13689r != null && (!this.p.isFinishing() || this.f13690s == null)) {
            this.f13689r.onPause();
        }
        M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void J1(int i5, String[] strArr, int[] iArr) {
        if (i5 == 12345) {
            Activity activity = this.p;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.q;
            try {
                adOverlayInfoParcel.f2652J.E0(strArr, iArr, new b(new Hm(activity, adOverlayInfoParcel.f2660y == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void M() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        h hVar;
        if (!this.p.isFinishing() || this.f13683G) {
            return;
        }
        this.f13683G = true;
        InterfaceC0828Ve interfaceC0828Ve = this.f13689r;
        if (interfaceC0828Ve != null) {
            interfaceC0828Ve.O0(this.f13687K - 1);
            synchronized (this.f13678B) {
                try {
                    if (!this.f13681E && this.f13689r.u0()) {
                        C1693t7 c1693t7 = AbstractC1869x7.f9833g4;
                        C2366q c2366q = C2366q.f13480d;
                        if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue() && !this.f13684H && (adOverlayInfoParcel = this.q) != null && (hVar = adOverlayInfoParcel.q) != null) {
                            hVar.e2();
                        }
                        a aVar = new a(this, 20);
                        this.f13680D = aVar;
                        F.f15900l.postDelayed(aVar, ((Long) c2366q.f13483c.a(AbstractC1869x7.f9734N0)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void N() {
        h hVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (hVar = adOverlayInfoParcel.q) != null) {
            hVar.i0();
        }
        U3(this.p.getResources().getConfiguration());
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9844i4)).booleanValue()) {
            return;
        }
        InterfaceC0828Ve interfaceC0828Ve = this.f13689r;
        if (interfaceC0828Ve == null || interfaceC0828Ve.S0()) {
            AbstractC1223ib.s("The webview does not exist. Ignoring action.");
        } else {
            this.f13689r.onResume();
        }
    }

    public final void S3(int i5) {
        int i6;
        Activity activity = this.p;
        int i7 = activity.getApplicationInfo().targetSdkVersion;
        C1693t7 c1693t7 = AbstractC1869x7.h5;
        C2366q c2366q = C2366q.f13480d;
        if (i7 >= ((Integer) c2366q.f13483c.a(c1693t7)).intValue()) {
            int i8 = activity.getApplicationInfo().targetSdkVersion;
            C1693t7 c1693t8 = AbstractC1869x7.i5;
            SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
            if (i8 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8)).intValue() && (i6 = Build.VERSION.SDK_INT) >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.j5)).intValue() && i6 <= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.k5)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i5);
        } catch (Throwable th) {
            k.f13311A.g.f("AdOverlay.setRequestedOrientation", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    public final void T3(boolean z3) throws f {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = this.f13682F;
        Activity activity = this.p;
        if (!z7) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new f("Invalid activity, no window available.");
        }
        InterfaceC0828Ve interfaceC0828Ve = this.q.f2655r;
        C1313kf c1313kfK = interfaceC0828Ve != null ? interfaceC0828Ve.K() : null;
        if (c1313kfK != null) {
            synchronized (c1313kfK.f8039r) {
                z6 = c1313kfK.f8023E;
            }
            if (z6) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f13677A = false;
        if (z4) {
            int i5 = this.q.f2659x;
            if (i5 == 6) {
                z5 = activity.getResources().getConfiguration().orientation == 1;
                this.f13677A = z5;
            } else if (i5 == 7) {
                z5 = activity.getResources().getConfiguration().orientation == 2;
                this.f13677A = z5;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        AbstractC1223ib.m("Delay onShow to next orientation change: " + z5);
        S3(this.q.f2659x);
        window.setFlags(16777216, 16777216);
        AbstractC1223ib.m("Hardware acceleration on the AdActivity window enabled.");
        if (this.f13694y) {
            this.f13695z.setBackgroundColor(f13676M);
        } else {
            this.f13695z.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.f13695z);
        this.f13682F = true;
        if (z3) {
            try {
                S6 s6 = k.f13311A.f13315d;
                Activity activity2 = this.p;
                InterfaceC0828Ve interfaceC0828Ve2 = this.q.f2655r;
                d dVarP = interfaceC0828Ve2 != null ? interfaceC0828Ve2.P() : null;
                InterfaceC0828Ve interfaceC0828Ve3 = this.q.f2655r;
                String strF0 = interfaceC0828Ve3 != null ? interfaceC0828Ve3.f0() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.q;
                C0785Od c0785Od = adOverlayInfoParcel.f2643A;
                InterfaceC0828Ve interfaceC0828Ve4 = adOverlayInfoParcel.f2655r;
                C1051ef c1051efE = S6.e(activity2, dVarP, null, new C1517p6(), null, c0785Od, null, null, null, null, null, interfaceC0828Ve4 != null ? interfaceC0828Ve4.j() : null, strF0, true, z4);
                this.f13689r = c1051efE;
                C1313kf c1313kf = c1051efE.f7079o.f7451B;
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
                InterfaceC1256j9 interfaceC1256j9 = adOverlayInfoParcel2.f2646D;
                InterfaceC0828Ve interfaceC0828Ve5 = adOverlayInfoParcel2.f2655r;
                c1313kf.g(null, interfaceC1256j9, null, adOverlayInfoParcel2.f2656s, adOverlayInfoParcel2.f2658w, true, null, interfaceC0828Ve5 != null ? interfaceC0828Ve5.K().f8028J : null, null, null, null, null, null, null, null, null, null, null, null);
                this.f13689r.K().u = new i(this, 24);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.q;
                String str = adOverlayInfoParcel3.f2661z;
                if (str != null) {
                    this.f13689r.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f2657v;
                    if (str2 == null) {
                        throw new f("No URL or HTML to display in ad overlay.");
                    }
                    this.f13689r.loadDataWithBaseURL(adOverlayInfoParcel3.t, str2, "text/html", "UTF-8", null);
                }
                InterfaceC0828Ve interfaceC0828Ve6 = this.q.f2655r;
                if (interfaceC0828Ve6 != null) {
                    interfaceC0828Ve6.L0(this);
                }
            } catch (Exception e) {
                AbstractC1223ib.q("Error obtaining webview.", e);
                throw new f("Could not obtain webview for the overlay.", e);
            }
        } else {
            InterfaceC0828Ve interfaceC0828Ve7 = this.q.f2655r;
            this.f13689r = interfaceC0828Ve7;
            interfaceC0828Ve7.X0(activity);
        }
        if (this.q.f2653K) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f13689r.y0(), false);
        }
        this.f13689r.q0(this);
        InterfaceC0828Ve interfaceC0828Ve8 = this.q.f2655r;
        if (interfaceC0828Ve8 != null) {
            Gr grO0 = interfaceC0828Ve8.o0();
            g gVar = this.f13695z;
            if (grO0 != null && gVar != null) {
                k.f13311A.f13327v.getClass();
                C1538pk.r(new Gv(29, grO0, gVar));
            }
        }
        if (this.q.f2660y != 5) {
            ViewParent parent = this.f13689r.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f13689r.M());
            }
            if (this.f13694y) {
                this.f13689r.W0();
            }
            if (this.q.f2653K) {
                Toolbar toolbar = new Toolbar(activity);
                this.f13686J = toolbar;
                toolbar.setId(View.generateViewId());
                this.f13689r.M().setId(View.generateViewId());
                this.f13686J.setBackgroundColor(-12303292);
                this.f13686J.setVisibility(0);
                this.f13686J.setNavigationIcon(k.f13311A.g.a().getDrawable(R.drawable.admob_close_button_white_cross));
                this.f13686J.setNavigationOnClickListener(this.f13679C);
                this.f13686J.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f13695z.addView(this.f13686J, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f13686J.getId());
                layoutParams2.addRule(12);
                this.f13695z.addView(this.f13689r.M(), layoutParams2);
            } else {
                this.f13695z.addView(this.f13689r.M(), -1, -1);
            }
        }
        if (!z3 && !this.f13677A) {
            this.f13689r.k0();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.q;
        if (adOverlayInfoParcel4.f2660y != 5) {
            V3(z4);
            if (this.f13689r.z0()) {
                W3(z4, true);
                return;
            }
            return;
        }
        Hm hm = new Hm(activity, this, adOverlayInfoParcel4.f2647E, adOverlayInfoParcel4.f2648F);
        if (adOverlayInfoParcel4 != null) {
            try {
                InterfaceC1924yb interfaceC1924yb = adOverlayInfoParcel4.f2652J;
                if (interfaceC1924yb != null) {
                    interfaceC1924yb.f1(new b(hm));
                    return;
                }
            } catch (RemoteException | f e3) {
                throw new f(e3.getMessage(), e3);
            }
        }
        throw new f("noioou");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public final void U3(Configuration configuration) {
        boolean zIsInMultiWindowMode;
        e eVar;
        int i5;
        e eVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (adOverlayInfoParcel == null || (eVar2 = adOverlayInfoParcel.f2645C) == null || !eVar2.p) ? false : true;
        k.f13311A.e.getClass();
        C1693t7 c1693t7 = AbstractC1869x7.f9839h4;
        C2366q c2366q = C2366q.f13480d;
        boolean zBooleanValue = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        Activity activity = this.p;
        if (!zBooleanValue) {
            zIsInMultiWindowMode = false;
        } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9850j4)).booleanValue()) {
            zIsInMultiWindowMode = activity.isInMultiWindowMode();
        } else {
            C0743Hd c0743Hd = C2362o.f13474f.f13475a;
            int iL = C0743Hd.l(activity, configuration.screenHeightDp);
            int i6 = C0743Hd.i(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
            WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i7 = displayMetrics.heightPixels;
            int i8 = displayMetrics.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int iIntValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9828f4)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
            if (Math.abs(i7 - (iL + dimensionPixelSize)) > iIntValue || Math.abs(i8 - i6) > iIntValue) {
                zIsInMultiWindowMode = true;
            } else {
                zIsInMultiWindowMode = false;
            }
        }
        if ((!this.f13694y || z5 || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9913w0)).booleanValue()) && (!zIsInMultiWindowMode || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9908v0)).booleanValue())) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
            if (adOverlayInfoParcel2 != null && (eVar = adOverlayInfoParcel2.f2645C) != null && eVar.u) {
                z4 = true;
            }
        } else {
            z3 = false;
        }
        Window window = activity.getWindow();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9767U0)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z3) {
                i5 = z4 ? 5894 : 5380;
            } else {
                i5 = Fields.RotationX;
            }
            decorView.setSystemUiVisibility(i5);
            return;
        }
        if (!z3) {
            window.addFlags(Fields.CameraDistance);
            window.clearFlags(Fields.RotationZ);
            return;
        }
        window.addFlags(Fields.RotationZ);
        window.clearFlags(Fields.CameraDistance);
        if (z4) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    public final void V3(boolean z3) {
        if (this.q.f2653K) {
            return;
        }
        C1693t7 c1693t7 = AbstractC1869x7.f9861l4;
        C2366q c2366q = C2366q.f13480d;
        int iIntValue = ((Integer) c2366q.f13483c.a(c1693t7)).intValue();
        boolean z4 = ((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9749Q0)).booleanValue() || z3;
        j jVar = new j();
        jVar.f13705a = 0;
        jVar.f13706b = 0;
        jVar.f13707c = 0;
        jVar.f13708d = 50;
        jVar.f13705a = true != z4 ? 0 : iIntValue;
        jVar.f13706b = true != z4 ? iIntValue : 0;
        jVar.f13707c = iIntValue;
        this.t = new k(this.p, jVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z4 ? 9 : 11);
        W3(z3, this.q.u);
        this.f13695z.addView(this.t, layoutParams);
    }

    public final void W3(boolean z3, boolean z4) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        e eVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        e eVar2;
        C1693t7 c1693t7 = AbstractC1869x7.f9739O0;
        C2366q c2366q = C2366q.f13480d;
        boolean z5 = true;
        boolean z6 = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue() && (adOverlayInfoParcel2 = this.q) != null && (eVar2 = adOverlayInfoParcel2.f2645C) != null && eVar2.f13301v;
        C1693t7 c1693t8 = AbstractC1869x7.f9744P0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        boolean z7 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t8)).booleanValue() && (adOverlayInfoParcel = this.q) != null && (eVar = adOverlayInfoParcel.f2645C) != null && eVar.f13302w;
        if (z3 && z4 && z6 && !z7) {
            InterfaceC0828Ve interfaceC0828Ve = this.f13689r;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (interfaceC0828Ve != null) {
                    interfaceC0828Ve.b("onError", jSONObjectPut);
                }
            } catch (JSONException e) {
                AbstractC1223ib.q("Error occurred while dispatching error event.", e);
            }
        }
        k kVar = this.t;
        if (kVar != null) {
            if (!z7 && (!z4 || z6)) {
                z5 = false;
            }
            ImageButton imageButton = kVar.f13709o;
            if (!z5) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.f9758S0)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void Z() {
        InterfaceC0828Ve interfaceC0828Ve = this.f13689r;
        if (interfaceC0828Ve != null) {
            try {
                this.f13695z.removeView(interfaceC0828Ve.M());
            } catch (NullPointerException unused) {
            }
        }
        M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void f() {
        this.f13687K = 1;
    }

    public final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && this.u) {
            S3(adOverlayInfoParcel.f2659x);
        }
        if (this.f13691v != null) {
            this.p.setContentView(this.f13695z);
            this.f13682F = true;
            this.f13691v.removeAllViews();
            this.f13691v = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f13692w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f13692w = null;
        }
        this.u = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void i3(p008b2.a aVar) {
        U3((Configuration) b.o3(aVar));
    }

    public final void l() {
        InterfaceC0828Ve interfaceC0828Ve;
        h hVar;
        if (this.f13684H) {
            return;
        }
        this.f13684H = true;
        InterfaceC0828Ve interfaceC0828Ve2 = this.f13689r;
        if (interfaceC0828Ve2 != null) {
            this.f13695z.removeView(interfaceC0828Ve2.M());
            l lVar = this.f13690s;
            if (lVar != null) {
                this.f13689r.X0((Context) lVar.f880c);
                this.f13689r.Z0(false);
                ViewGroup viewGroup = (ViewGroup) this.f13690s.e;
                View viewM = this.f13689r.M();
                l lVar2 = this.f13690s;
                viewGroup.addView(viewM, lVar2.f879b, (ViewGroup.LayoutParams) lVar2.f881d);
                this.f13690s = null;
            } else {
                Activity activity = this.p;
                if (activity.getApplicationContext() != null) {
                    this.f13689r.X0(activity.getApplicationContext());
                }
            }
            this.f13689r = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (hVar = adOverlayInfoParcel.q) != null) {
            hVar.R1(this.f13687K);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
        if (adOverlayInfoParcel2 == null || (interfaceC0828Ve = adOverlayInfoParcel2.f2655r) == null) {
            return;
        }
        Gr grO0 = interfaceC0828Ve.o0();
        View viewM2 = this.q.f2655r.M();
        if (grO0 != null) {
            k.f13311A.f13327v.getClass();
            C1538pk.r(new Gv(29, grO0, viewM2));
        }
    }

    public final void o() {
        this.f13687K = 3;
        Activity activity = this.p;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f2660y != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void o2() {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9844i4)).booleanValue()) {
            InterfaceC0828Ve interfaceC0828Ve = this.f13689r;
            if (interfaceC0828Ve == null || interfaceC0828Ve.S0()) {
                AbstractC1223ib.s("The webview does not exist. Ignoring action.");
            } else {
                this.f13689r.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final boolean q3() {
        this.f13687K = 1;
        if (this.f13689r == null) {
            return true;
        }
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.T7)).booleanValue() && this.f13689r.canGoBack()) {
            this.f13689r.goBack();
            return false;
        }
        boolean zS0 = this.f13689r.s0();
        if (!zS0) {
            this.f13689r.i("onbackblocked", Collections.emptyMap());
        }
        return zS0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public void s2(Bundle bundle) {
        switch (this.f13688L) {
            case 4:
                B.w("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f13687K = 4;
                this.p.finish();
                return;
            default:
                if (!this.f13682F) {
                    this.p.requestWindowFeature(1);
                }
                this.f13693x = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcelG = AdOverlayInfoParcel.g(this.p.getIntent());
                    this.q = adOverlayInfoParcelG;
                    if (adOverlayInfoParcelG == null) {
                        throw new f("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelG.f2653K) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            this.p.setShowWhenLocked(true);
                        } else {
                            this.p.getWindow().addFlags(524288);
                        }
                    }
                    if (this.q.f2643A.q > 7500000) {
                        this.f13687K = 4;
                    }
                    if (this.p.getIntent() != null) {
                        this.f13685I = this.p.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.q;
                    e eVar = adOverlayInfoParcel.f2645C;
                    if (eVar != null) {
                        boolean z3 = eVar.f13298o;
                        this.f13694y = z3;
                        if (z3) {
                            if (adOverlayInfoParcel.f2660y != 5 && eVar.t != -1) {
                                new C1926yd(this, 1).d();
                            }
                        }
                        AbstractC1223ib.s(e.getMessage());
                        this.f13687K = 4;
                        this.p.finish();
                        return;
                    }
                    if (adOverlayInfoParcel.f2660y == 5) {
                        this.f13694y = true;
                        if (adOverlayInfoParcel.f2660y != 5) {
                            new C1926yd(this, 1).d();
                        }
                    } else {
                        this.f13694y = false;
                    }
                    if (bundle == null) {
                        if (this.f13685I) {
                            Gh gh = this.q.f2650H;
                            if (gh != null) {
                                synchronized (gh) {
                                    ScheduledFuture scheduledFuture = gh.f3802r;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            h hVar = this.q.q;
                            if (hVar != null) {
                                hVar.b0();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
                        if (adOverlayInfoParcel2.f2660y != 1) {
                            InterfaceC2334a interfaceC2334a = adOverlayInfoParcel2.p;
                            if (interfaceC2334a != null) {
                                interfaceC2334a.I();
                            }
                            Ii ii = this.q.f2651I;
                            if (ii != null) {
                                ii.e();
                            }
                        }
                    }
                    Activity activity = this.p;
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.q;
                    g gVar = new g(activity, adOverlayInfoParcel3.f2644B, adOverlayInfoParcel3.f2643A.f5227o, adOverlayInfoParcel3.f2649G);
                    this.f13695z = gVar;
                    gVar.setId(1000);
                    k.f13311A.e.g(this.p);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.q;
                    int i5 = adOverlayInfoParcel4.f2660y;
                    if (i5 == 1) {
                        T3(false);
                        return;
                    }
                    if (i5 == 2) {
                        this.f13690s = new l(adOverlayInfoParcel4.f2655r);
                        T3(false);
                        return;
                    } else if (i5 == 3) {
                        T3(true);
                        return;
                    } else {
                        if (i5 != 5) {
                            throw new f("Could not determine ad overlay type.");
                        }
                        T3(false);
                        return;
                    }
                } catch (f e) {
                    AbstractC1223ib.s(e.getMessage());
                    this.f13687K = 4;
                    this.p.finish();
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void x() {
        this.f13682F = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void x2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f13693x);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void z() {
        h hVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel == null || (hVar = adOverlayInfoParcel.q) == null) {
            return;
        }
        hVar.L3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void S() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void j1(int i5, int i6, Intent intent) {
    }
}
