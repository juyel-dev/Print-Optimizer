package p010c;

import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.InterfaceC0681u;
import androidx.lifecycle.InterfaceC0683w;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0681u, InterfaceC0690c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0677p f2472o;
    public final v p;
    public D q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f2473r;

    public C(F f5, AbstractC0677p abstractC0677p, v onBackPressedCallback) {
        o.f(onBackPressedCallback, "onBackPressedCallback");
        this.f2473r = f5;
        this.f2472o = abstractC0677p;
        this.p = onBackPressedCallback;
        abstractC0677p.a(this);
    }

    @Override // p010c.InterfaceC0690c
    public final void cancel() {
        this.f2472o.c(this);
        this.p.f2525b.remove(this);
        D d4 = this.q;
        if (d4 != null) {
            d4.cancel();
        }
        this.q = null;
    }

    @Override // androidx.lifecycle.InterfaceC0681u
    public final void onStateChanged(InterfaceC0683w interfaceC0683w, EnumC0675n enumC0675n) {
        if (enumC0675n != EnumC0675n.ON_START) {
            if (enumC0675n != EnumC0675n.ON_STOP) {
                if (enumC0675n == EnumC0675n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                D d4 = this.q;
                if (d4 != null) {
                    d4.cancel();
                    return;
                }
                return;
            }
        }
        F f5 = this.f2473r;
        v onBackPressedCallback = this.p;
        f5.getClass();
        o.f(onBackPressedCallback, "onBackPressedCallback");
        f5.f2477b.addLast(onBackPressedCallback);
        D d5 = new D(f5, onBackPressedCallback);
        onBackPressedCallback.f2525b.add(d5);
        f5.e();
        onBackPressedCallback.f2526c = new E(0, f5, F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.q = d5;
    }
}
