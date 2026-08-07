package p010c;

import N.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.C0685y;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.InterfaceC0683w;
import androidx.lifecycle.Q;
import com.notescrafter.app.R;
import kotlin.jvm.internal.o;
import p074r0.f;
import p074r0.g;

/* JADX INFO: loaded from: classes.dex */
public class n extends Dialog implements InterfaceC0683w, G, g {
    private C0685y _lifecycleRegistry;
    private final F onBackPressedDispatcher;
    private final f savedStateRegistryController;

    public n(Context context, int i5) {
        super(context, i5);
        this.savedStateRegistryController = new f(this);
        this.onBackPressedDispatcher = new F(new e(this, 9));
    }

    public static void a(n this$0) {
        o.f(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.f(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final C0685y b() {
        C0685y c0685y = this._lifecycleRegistry;
        if (c0685y != null) {
            return c0685y;
        }
        C0685y c0685y2 = new C0685y(this);
        this._lifecycleRegistry = c0685y2;
        return c0685y2;
    }

    @Override // androidx.lifecycle.InterfaceC0683w
    public AbstractC0677p getLifecycle() {
        return b();
    }

    @Override // p010c.G
    public final F getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // p074r0.g
    public p074r0.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f12327b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        o.c(window);
        View decorView = window.getDecorView();
        o.e(decorView, "window!!.decorView");
        Q.i(decorView, this);
        Window window2 = getWindow();
        o.c(window2);
        View decorView2 = window2.getDecorView();
        o.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        o.c(window3);
        View decorView3 = window3.getDecorView();
        o.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            F f5 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            o.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            f5.getClass();
            f5.e = onBackInvokedDispatcher;
            f5.d(f5.g);
        }
        this.savedStateRegistryController.b(bundle);
        b().f(EnumC0675n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        o.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().f(EnumC0675n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(EnumC0675n.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        o.f(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.f(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
