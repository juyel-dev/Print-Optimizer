package p105y1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0827Vd;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1139gf;
import java.lang.ref.WeakReference;
import p085u1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1139gf f15867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15870d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1139gf f15871f;

    public A(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC1139gf viewTreeObserverOnGlobalLayoutListenerC1139gf, ViewTreeObserverOnGlobalLayoutListenerC1139gf viewTreeObserverOnGlobalLayoutListenerC1139gf2) {
        this.f15868b = activity;
        this.f15867a = viewTreeObserverOnGlobalLayoutListenerC1139gf;
        this.f15871f = viewTreeObserverOnGlobalLayoutListenerC1139gf2;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f15869c) {
            return;
        }
        Activity activity = this.f15868b;
        ViewTreeObserverOnGlobalLayoutListenerC1139gf viewTreeObserverOnGlobalLayoutListenerC1139gf = this.f15871f;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1139gf);
            }
        }
        S6 s6 = k.f13311A.f13331z;
        ViewTreeObserverOnGlobalLayoutListenerC0827Vd viewTreeObserverOnGlobalLayoutListenerC0827Vd = new ViewTreeObserverOnGlobalLayoutListenerC0827Vd(this.f15867a, viewTreeObserverOnGlobalLayoutListenerC1139gf);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0827Vd.f2742o).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0827Vd.e1(viewTreeObserver2);
        }
        this.f15869c = true;
    }
}
