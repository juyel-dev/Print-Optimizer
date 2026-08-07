package p010c;

import N.e;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0696i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2494o = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f2495r;

    public ViewTreeObserverOnDrawListenerC0696i(m mVar) {
        this.f2495r = mVar;
    }

    public final void a(View view) {
        if (this.q) {
            return;
        }
        this.q = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o.f(runnable, "runnable");
        this.p = runnable;
        View decorView = this.f2495r.getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        if (!this.q) {
            decorView.postOnAnimation(new e(this, 8));
        } else if (o.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.p;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2494o) {
                this.q = false;
                this.f2495r.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.p = null;
        u uVar = (u) this.f2495r.u.getValue();
        synchronized (uVar.f2521b) {
            z3 = uVar.f2522c;
        }
        if (z3) {
            this.q = false;
            this.f2495r.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2495r.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
