package p039j0;

import X3.A;
import X3.H;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.o;
import p031h0.a;
import p048l0.b;
import p048l0.c;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11565a;

    public d(b bVar) {
        this.f11565a = bVar;
    }

    public static final d b(Context context) {
        o.f(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i5 = Build.VERSION.SDK_INT;
        a aVar = a.f11420a;
        sb.append(i5 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        b bVar = (i5 >= 30 ? aVar.a() : 0) >= 5 ? new b(context) : null;
        if (bVar != null) {
            return new d(bVar);
        }
        return null;
    }

    public J2.b a(p048l0.a deletionRequest) {
        o.f(deletionRequest, "deletionRequest");
        throw null;
    }

    public J2.b c() {
        return p000a.a.a(A.c(A.a(H.f1766a), null, new a(this, null), 3));
    }

    public J2.b d(Uri attributionSource, InputEvent inputEvent) {
        o.f(attributionSource, "attributionSource");
        return p000a.a.a(A.c(A.a(H.f1766a), null, new b(this, attributionSource, inputEvent, null), 3));
    }

    public J2.b e(Uri trigger) {
        o.f(trigger, "trigger");
        return p000a.a.a(A.c(A.a(H.f1766a), null, new c(this, trigger, null), 3));
    }

    public J2.b f(c request) {
        o.f(request, "request");
        throw null;
    }

    public J2.b g(p048l0.d request) {
        o.f(request, "request");
        throw null;
    }
}
