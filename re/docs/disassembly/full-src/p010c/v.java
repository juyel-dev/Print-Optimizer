package p010c;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2525b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f2526c;

    public v(boolean z3) {
        this.f2524a = z3;
    }

    public abstract void b();

    public void c(C0689b backEvent) {
        o.f(backEvent, "backEvent");
    }

    public void d(C0689b backEvent) {
        o.f(backEvent, "backEvent");
    }

    public final void e() {
        Iterator it = this.f2525b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0690c) it.next()).cancel();
        }
    }

    public void a() {
    }
}
