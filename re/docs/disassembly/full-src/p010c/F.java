package p010c;

import C3.q;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.EnumC0676o;
import androidx.lifecycle.InterfaceC0683w;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f2477b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f2478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f2479d;
    public OnBackInvokedDispatcher e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2480f;
    public boolean g;

    public F(Runnable runnable) {
        this.f2476a = runnable;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            this.f2479d = i5 >= 34 ? B.f2471a.a(new w(this, 0), new w(this, 1), new x(this, 0), new x(this, 1)) : z.f2530a.a(new x(this, 2));
        }
    }

    public final void a(InterfaceC0683w owner, v onBackPressedCallback) {
        o.f(owner, "owner");
        o.f(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0677p lifecycle = owner.getLifecycle();
        if (lifecycle.b() == EnumC0676o.f2348o) {
            return;
        }
        onBackPressedCallback.f2525b.add(new C(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f2526c = new E(0, this, F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        v vVar = this.f2478c;
        if (vVar == null) {
            q qVar = this.f2477b;
            ListIterator<E> listIterator = qVar.listIterator(qVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).f2524a);
            vVar = (v) objPrevious;
        }
        this.f2478c = null;
        if (vVar != null) {
            vVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        v vVar = this.f2478c;
        if (vVar == null) {
            q qVar = this.f2477b;
            ListIterator listIterator = qVar.listIterator(qVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((v) objPrevious).f2524a);
            vVar = (v) objPrevious;
        }
        this.f2478c = null;
        if (vVar != null) {
            vVar.b();
        } else {
            this.f2476a.run();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.f2479d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        z zVar = z.f2530a;
        if (z3 && !this.f2480f) {
            zVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2480f = true;
        } else {
            if (z3 || !this.f2480f) {
                return;
            }
            zVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2480f = false;
        }
    }

    public final void e() {
        boolean z3 = this.g;
        boolean z4 = false;
        q qVar = this.f2477b;
        if (qVar == null || !qVar.isEmpty()) {
            Iterator it = qVar.iterator();
            while (it.hasNext()) {
                if (((v) it.next()).f2524a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
