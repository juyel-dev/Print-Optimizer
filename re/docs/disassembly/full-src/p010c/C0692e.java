package p010c;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.InterfaceC0681u;
import androidx.lifecycle.InterfaceC0683w;
import kotlin.jvm.internal.o;
import p074r0.e;

/* JADX INFO: renamed from: c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0692e implements InterfaceC0681u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2490o;
    public final /* synthetic */ Object p;

    public /* synthetic */ C0692e(Object obj, int i5) {
        this.f2490o = i5;
        this.p = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0681u
    public final void onStateChanged(InterfaceC0683w interfaceC0683w, EnumC0675n enumC0675n) {
        Window window;
        View viewPeekDecorView;
        switch (this.f2490o) {
            case 0:
                m mVar = (m) this.p;
                if (enumC0675n == EnumC0675n.ON_STOP && (window = mVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                m mVar2 = (m) this.p;
                if (enumC0675n == EnumC0675n.ON_DESTROY) {
                    mVar2.p.p = null;
                    if (!mVar2.isChangingConfigurations()) {
                        mVar2.e().a();
                    }
                    ViewTreeObserverOnDrawListenerC0696i viewTreeObserverOnDrawListenerC0696i = mVar2.t;
                    m mVar3 = viewTreeObserverOnDrawListenerC0696i.f2495r;
                    mVar3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0696i);
                    mVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0696i);
                }
                break;
            default:
                e this$0 = (e) this.p;
                o.f(this$0, "this$0");
                if (enumC0675n == EnumC0675n.ON_START) {
                    this$0.f12325f = true;
                } else if (enumC0675n == EnumC0675n.ON_STOP) {
                    this$0.f12325f = false;
                }
                break;
        }
    }
}
