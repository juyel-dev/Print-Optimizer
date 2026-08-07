package p010c;

import O3.a;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f2530a = new z();

    public final OnBackInvokedCallback a(final a onBackInvoked) {
        o.f(onBackInvoked, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: c.y
            public final void onBackInvoked() {
                a onBackInvoked2 = onBackInvoked;
                o.f(onBackInvoked2, "$onBackInvoked");
                onBackInvoked2.invoke();
            }
        };
    }

    public final void b(Object dispatcher, int i5, Object callback) {
        o.f(dispatcher, "dispatcher");
        o.f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i5, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        o.f(dispatcher, "dispatcher");
        o.f(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
