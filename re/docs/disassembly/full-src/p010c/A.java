package p010c;

import O3.a;
import O3.c;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class A implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f2467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f2470d;

    public A(c cVar, c cVar2, a aVar, a aVar2) {
        this.f2467a = cVar;
        this.f2468b = cVar2;
        this.f2469c = aVar;
        this.f2470d = aVar2;
    }

    public final void onBackCancelled() {
        this.f2470d.invoke();
    }

    public final void onBackInvoked() {
        this.f2469c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        this.f2468b.invoke(new C0689b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        o.f(backEvent, "backEvent");
        this.f2467a.invoke(new C0689b(backEvent));
    }
}
