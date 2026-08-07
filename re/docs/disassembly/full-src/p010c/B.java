package p010c;

import O3.a;
import O3.c;
import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f2471a = new B();

    public final OnBackInvokedCallback a(c onBackStarted, c onBackProgressed, a onBackInvoked, a onBackCancelled) {
        o.f(onBackStarted, "onBackStarted");
        o.f(onBackProgressed, "onBackProgressed");
        o.f(onBackInvoked, "onBackInvoked");
        o.f(onBackCancelled, "onBackCancelled");
        return new A(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
