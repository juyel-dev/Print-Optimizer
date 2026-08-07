package p019e0;

import F3.i;
import X3.C0176b0;
import X3.InterfaceC0178c0;
import X3.InterfaceC0200y;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements AutoCloseable, InterfaceC0200y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f11039o;

    public a(i coroutineContext) {
        o.f(coroutineContext, "coroutineContext");
        this.f11039o = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC0178c0 interfaceC0178c0 = (InterfaceC0178c0) this.f11039o.get(C0176b0.f1783o);
        if (interfaceC0178c0 != null) {
            interfaceC0178c0.cancel(null);
        }
    }

    @Override // X3.InterfaceC0200y
    public final i getCoroutineContext() {
        return this.f11039o;
    }
}
