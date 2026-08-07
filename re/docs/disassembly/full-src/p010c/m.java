package p010c;

import B3.l;
import F.a;
import Q1.i;
import W.C0171p;
import W.r;
import W.x;
import Y2.d;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.C0685y;
import androidx.lifecycle.InterfaceC0671j;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.notescrafter.app.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import p022f.f;
import p036i2.e;
import p074r0.b;
import p074r0.g;
import p098x.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends c implements c0, InterfaceC0671j, g, G, f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f2505G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArrayList f2506A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f2507B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f2508C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2509D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final l f2510E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final l f2511F;
    public final i p;
    public final e q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p074r0.f f2512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b0 f2513s;
    public final ViewTreeObserverOnDrawListenerC0696i t;
    public final l u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f2514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f2515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f2516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f2517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f2518z;

    public m() {
        i iVar = new i();
        this.p = iVar;
        this.q = new e(new RunnableC0691d(this, 0));
        p074r0.f fVar = new p074r0.f(this);
        this.f2512r = fVar;
        this.t = new ViewTreeObserverOnDrawListenerC0696i(this);
        this.u = p013c2.g.o(new l(this, 2));
        new AtomicInteger();
        this.f2514v = new k(this);
        this.f2515w = new CopyOnWriteArrayList();
        this.f2516x = new CopyOnWriteArrayList();
        this.f2517y = new CopyOnWriteArrayList();
        this.f2518z = new CopyOnWriteArrayList();
        this.f2506A = new CopyOnWriteArrayList();
        this.f2507B = new CopyOnWriteArrayList();
        C0685y c0685y = this.f13638o;
        if (c0685y == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c0685y.a(new C0692e(this, 0));
        this.f13638o.a(new C0692e(this, 1));
        this.f13638o.a(new b(this, 4));
        fVar.a();
        Q.d(this);
        fVar.f12327b.c("android:support:activity-result", new C0171p(this, 3));
        r rVar = new r(this, 1);
        m mVar = (m) iVar.p;
        if (mVar != null) {
            rVar.a(mVar);
        }
        ((CopyOnWriteArraySet) iVar.f974o).add(rVar);
        this.f2510E = p013c2.g.o(new l(this, 0));
        this.f2511F = p013c2.g.o(new l(this, 3));
    }

    @Override // p022f.f
    public final k a() {
        return this.f2514v;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        this.t.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0671j
    public final Z b() {
        return (Z) this.f2510E.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0671j
    public final p011c0.e c() {
        p011c0.e eVar = new p011c0.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f2532a;
        if (application != null) {
            d dVar = Y.f2331d;
            Application application2 = getApplication();
            o.e(application2, "application");
            linkedHashMap.put(dVar, application2);
        }
        linkedHashMap.put(Q.f2313a, this);
        linkedHashMap.put(Q.f2314b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(Q.f2315c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.c0
    public final b0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2513s == null) {
            C0695h c0695h = (C0695h) getLastNonConfigurationInstance();
            if (c0695h != null) {
                this.f2513s = c0695h.f2493a;
            }
            if (this.f2513s == null) {
                this.f2513s = new b0();
            }
        }
        b0 b0Var = this.f2513s;
        o.c(b0Var);
        return b0Var;
    }

    public final void f(a listener) {
        o.f(listener, "listener");
        this.f2515w.add(listener);
    }

    public final void g() {
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        Q.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        o.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        o.e(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        o.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        o.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // androidx.lifecycle.InterfaceC0683w
    public final AbstractC0677p getLifecycle() {
        return this.f13638o;
    }

    @Override // p010c.G
    public final F getOnBackPressedDispatcher() {
        return (F) this.f2511F.getValue();
    }

    @Override // p074r0.g
    public final p074r0.e getSavedStateRegistry() {
        return this.f2512r.f12327b;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (this.f2514v.a(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f2515w.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(newConfig);
        }
    }

    @Override // p098x.c, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2512r.b(bundle);
        i iVar = this.p;
        iVar.getClass();
        iVar.p = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f974o).iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i5 = M.p;
        K.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        o.f(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.q.q).iterator();
        while (it.hasNext()) {
            ((x) it.next()).f1611a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem item) {
        o.f(item, "item");
        boolean z3 = true;
        if (super.onMenuItemSelected(i5, item)) {
            return true;
        }
        if (i5 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.q.q).iterator();
        while (it.hasNext()) {
            if (((x) it.next()).f1611a.o()) {
                return z3;
            }
        }
        z3 = false;
        return z3;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f2508C) {
            return;
        }
        Iterator it = this.f2518z.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(new p098x.d(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        o.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f2517y.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) {
        o.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.q.q).iterator();
        while (it.hasNext()) {
            ((x) it.next()).f1611a.p();
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f2509D) {
            return;
        }
        Iterator it = this.f2506A.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(new p098x.o(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        o.f(menu, "menu");
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.q.q).iterator();
        while (it.hasNext()) {
            ((x) it.next()).f1611a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] permissions, int[] grantResults) {
        o.f(permissions, "permissions");
        o.f(grantResults, "grantResults");
        if (this.f2514v.a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i5, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0695h c0695h;
        b0 b0Var = this.f2513s;
        if (b0Var == null && (c0695h = (C0695h) getLastNonConfigurationInstance()) != null) {
            b0Var = c0695h.f2493a;
        }
        if (b0Var == null) {
            return null;
        }
        C0695h c0695h2 = new C0695h();
        c0695h2.f2493a = b0Var;
        return c0695h2;
    }

    @Override // p098x.c, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.f(outState, "outState");
        C0685y c0685y = this.f13638o;
        if (c0685y != null) {
            c0685y.h();
        }
        super.onSaveInstanceState(outState);
        this.f2512r.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator it = this.f2516x.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(Integer.valueOf(i5));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2507B.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (K2.b.q()) {
                K2.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            u uVar = (u) this.u.getValue();
            synchronized (uVar.f2521b) {
                try {
                    uVar.f2522c = true;
                    Iterator it = uVar.f2523d.iterator();
                    while (it.hasNext()) {
                        ((O3.a) it.next()).invoke();
                    }
                    uVar.f2523d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i5) {
        g();
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        this.t.a(decorView);
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i5) {
        o.f(intent, "intent");
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i5, Intent intent2, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        o.f(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i6, i7, i8);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        o.f(intent, "intent");
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i5, Intent intent2, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        o.f(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i6, i7, i8, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration newConfig) {
        o.f(newConfig, "newConfig");
        this.f2508C = true;
        try {
            super.onMultiWindowModeChanged(z3, newConfig);
            this.f2508C = false;
            Iterator it = this.f2518z.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(new p098x.d(z3));
            }
        } catch (Throwable th) {
            this.f2508C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration newConfig) {
        o.f(newConfig, "newConfig");
        this.f2509D = true;
        try {
            super.onPictureInPictureModeChanged(z3, newConfig);
            this.f2509D = false;
            Iterator it = this.f2506A.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(new p098x.o(z3));
            }
        } catch (Throwable th) {
            this.f2509D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        g();
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        this.t.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        this.t.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
