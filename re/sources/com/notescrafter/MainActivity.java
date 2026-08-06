package com.notescrafter;

import B3.k;
import M0.b;
import M0.f;
import X3.A;
import X3.s0;
import a4.C0210i;
import a4.C0217p;
import android.R;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.C0678q;
import androidx.lifecycle.C0685y;
import androidx.lifecycle.Q;
import androidx.lifecycle.r;
import c4.n;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.utils.AnalyticsManager;
import com.razorpay.Checkout;
import com.razorpay.PaymentData;
import com.razorpay.PaymentResultWithDataListener;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.jvm.internal.F;
import org.json.JSONObject;
import p000a.a;
import p010c.H;
import p010c.m;
import p010c.o;
import p010c.p;
import p010c.q;
import p010c.s;
import p010c.t;
import p013c2.g;
import p015d.i;
import p036i2.e;
import p083t3.C2280d;
import p083t3.C2282e;
import p083t3.C2284f;
import p083t3.C2286g;
import p083t3.C2291i0;
import p090v1.C2358m;
import p092v3.h;
import p101x2.j;
import p111z2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity extends m implements PaymentResultWithDataListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f10854N = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e f10855H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public b f10856I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public b f10857J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h f10858K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C2358m f10859L = new C2358m(F.a(PrintOrderViewModel.class), new C2286g(this, 0), new f(2), new C2286g(this, 1));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f10860M = "";

    public final PrintOrderViewModel h() {
        return (PrintOrderViewModel) this.f10859L.getValue();
    }

    @Override // p010c.m, p098x.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        p111z2.b qVar;
        r rVar;
        int i5 = 1;
        int i6 = 2;
        int color = Color.parseColor("#0A0A0F");
        H h5 = new H(color, color);
        int color2 = Color.parseColor("#0A0A0F");
        H h6 = new H(color2, color2);
        int i7 = o.f2519a;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "window.decorView");
        kotlin.jvm.internal.o.e(decorView.getResources(), "view.resources");
        kotlin.jvm.internal.o.e(decorView.getResources(), "view.resources");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            qVar = new t();
        } else if (i8 >= 29) {
            qVar = new s();
        } else if (i8 >= 28) {
            qVar = new p010c.r();
        } else {
            qVar = i8 >= 26 ? new q() : new p();
        }
        Window window = getWindow();
        kotlin.jvm.internal.o.e(window, "window");
        qVar.x(h5, h6, window, decorView, true, true);
        Window window2 = getWindow();
        kotlin.jvm.internal.o.e(window2, "window");
        qVar.c(window2);
        if (i8 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 3;
        }
        super.onCreate(bundle);
        Checkout.preload(getApplicationContext());
        this.f10855H = new e(this);
        C2280d c2280d = new C2280d(this);
        C0685y c0685y = this.f13638o;
        c0685y.a(c2280d);
        if (i8 >= 33 && p103y.b.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            p098x.b.c(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);
        }
        this.f10856I = new b(this, "ca-app-pub-1879950570227607/4664195660");
        this.f10857J = new b(this, "ca-app-pub-1879950570227607/5837949600");
        this.f10858K = h.f13519y.p(this);
        AnalyticsManager.INSTANCE.initialize(this);
        e eVar = this.f10855H;
        if (eVar == null) {
            kotlin.jvm.internal.o.k("updateManager");
            throw null;
        }
        p101x2.o oVarA = ((d) eVar.p).a();
        kotlin.jvm.internal.o.e(oVarA, "getAppUpdateInfo(...)");
        oVarA.c(j.f13714a, new N.b(new Y3.d(6, eVar, this), 20));
        File file = new File(getExternalFilesDir(null), "NotesCrafterFiles");
        if (!file.exists()) {
            file.mkdirs();
        }
        C0217p c0217p = new C0217p(h().f10894d0, new C2282e(this, null), i6);
        kotlin.jvm.internal.o.f(c0685y, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c0685y.f2351a;
            rVar = (r) atomicReference.get();
            if (rVar != null) {
                break;
            }
            s0 s0VarB = A.b();
            e4.e eVar2 = X3.H.f1766a;
            rVar = new r(c0685y, g.r(s0VarB, n.f2606a.f1874r));
            do {
                if (atomicReference.compareAndSet(null, rVar)) {
                    e4.e eVar3 = X3.H.f1766a;
                    A.t(rVar, n.f2606a.f1874r, null, new C0678q(rVar, null), 2);
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        A.t(rVar, null, null, new C0210i(c0217p, null), 3);
        Log.d("DEBUG", "setContent executed");
        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-546050999, true, new C2284f(this, i5));
        ViewGroup.LayoutParams layoutParams = i.f10948a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambdaComposableLambdaInstance);
            return;
        }
        ComposeView composeView2 = new ComposeView(this, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(composableLambdaComposableLambdaInstance);
        View decorView2 = getWindow().getDecorView();
        if (Q.e(decorView2) == null) {
            Q.i(decorView2, this);
        }
        if (Q.f(decorView2) == null) {
            decorView2.setTag(com.notescrafter.app.R.id.view_tree_view_model_store_owner, this);
        }
        if (a.q(decorView2) == null) {
            decorView2.setTag(com.notescrafter.app.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(composeView2, i.f10948a);
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentError(int i5, String str, PaymentData paymentData) {
        if (str == null) {
            str = p035i0.a.k("Payment was cancelled or failed (code ", i5, ")");
        }
        Log.e("MainActivity", "Razorpay payment error " + i5 + ": " + str);
        h().onPaymentFailed(str);
    }

    @Override // com.razorpay.PaymentResultWithDataListener
    public void onPaymentSuccess(String str, PaymentData paymentData) {
        if (str == null || paymentData == null) {
            h().onPaymentFailed("Missing payment data from gateway");
            return;
        }
        String orderId = paymentData.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        String signature = paymentData.getSignature();
        String str2 = signature != null ? signature : "";
        paymentData.getPaymentId();
        Log.d("MainActivity", "Payment success: " + str + ", order: " + orderId);
        PrintOrderViewModel printOrderViewModelH = h();
        String orderId2 = this.f10860M;
        kotlin.jvm.internal.o.f(orderId2, "orderId");
        C2291i0 c2291i0 = printOrderViewModelH.f10895e0;
        printOrderViewModelH.f10895e0 = null;
        C2117x c2117x = printOrderViewModelH.f10891c;
        p083t3.F f5 = new p083t3.F(printOrderViewModelH, c2291i0, orderId2, 2);
        c2117x.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("razorpay_order_id", orderId);
            jSONObject.put("razorpay_payment_id", str);
            jSONObject.put("razorpay_signature", str2);
            b bVarC = c2117x.c("https://notescrafter.com/api/print/orders/" + orderId2 + "/verify-payment");
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            Pattern pattern = g4.p.f11330d;
            bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            ((g4.t) c2117x.q).a(bVarC.d()).e(new f1.g(5, f5, c2117x));
        } catch (Exception e) {
            f5.invoke(new k(o4.d.d(e)));
        }
    }
}
