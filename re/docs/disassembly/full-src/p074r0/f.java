package p074r0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.EnumC0676o;
import java.util.Map;
import kotlin.jvm.internal.o;
import p010c.C0692e;
import p038j.d;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12327b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12328c;

    public f(g gVar) {
        this.f12326a = gVar;
    }

    public final void a() {
        g gVar = this.f12326a;
        AbstractC0677p lifecycle = gVar.getLifecycle();
        if (lifecycle.b() != EnumC0676o.p) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(gVar, 0));
        e eVar = this.f12327b;
        eVar.getClass();
        if (eVar.f12322b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0692e(eVar, 2));
        eVar.f12322b = true;
        this.f12328c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f12328c) {
            a();
        }
        AbstractC0677p lifecycle = this.f12326a.getLifecycle();
        if (lifecycle.b().compareTo(EnumC0676o.f2349r) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        e eVar = this.f12327b;
        if (!eVar.f12322b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f12324d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f12323c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f12324d = true;
    }

    public final void c(Bundle outBundle) {
        o.f(outBundle, "outBundle");
        e eVar = this.f12327b;
        eVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = eVar.f12323c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        p038j.f fVar = eVar.f12321a;
        fVar.getClass();
        d dVar = new d(fVar);
        fVar.q.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
