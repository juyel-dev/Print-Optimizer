package p010c;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0694g f2492a = new C0694g();

    public final OnBackInvokedDispatcher a(Activity activity) {
        o.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        o.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
