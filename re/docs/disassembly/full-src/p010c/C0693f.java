package p010c;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.InterfaceC0681u;
import androidx.lifecycle.InterfaceC0683w;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0693f implements InterfaceC0681u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F f2491o;
    public final /* synthetic */ m p;

    public /* synthetic */ C0693f(F f5, m mVar) {
        this.f2491o = f5;
        this.p = mVar;
    }

    @Override // androidx.lifecycle.InterfaceC0681u
    public final void onStateChanged(InterfaceC0683w interfaceC0683w, EnumC0675n enumC0675n) {
        F f5 = this.f2491o;
        m mVar = this.p;
        if (enumC0675n == EnumC0675n.ON_CREATE) {
            OnBackInvokedDispatcher invoker = C0694g.f2492a.a(mVar);
            o.f(invoker, "invoker");
            f5.e = invoker;
            f5.d(f5.g);
        }
    }
}
