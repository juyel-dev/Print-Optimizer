package p048l0;

import C.c;
import F3.d;
import G3.a;
import X3.C0185i;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.foundation.text.input.internal.e;
import kotlin.jvm.internal.o;
import o4.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f11818a;

    public b(Context context) {
        o.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.o());
        o.e(systemService, "context.getSystemService…:class.java\n            )");
        this.f11818a = e.d(systemService);
    }

    public Object a(a aVar, d dVar) {
        new C0185i(1, l.n(dVar)).u();
        e.B();
        throw null;
    }

    public Object b(d dVar) {
        C0185i c0185i = new C0185i(1, l.n(dVar));
        c0185i.u();
        this.f11818a.getMeasurementApiStatus(new I.d(0), new c(c0185i));
        Object objT = c0185i.t();
        a aVar = a.f448o;
        return objT;
    }

    public Object c(Uri uri, InputEvent inputEvent, d dVar) {
        C0185i c0185i = new C0185i(1, l.n(dVar));
        c0185i.u();
        this.f11818a.registerSource(uri, inputEvent, new I.d(0), new c(c0185i));
        Object objT = c0185i.t();
        return objT == a.f448o ? objT : B3.o.f154a;
    }

    public Object d(Uri uri, d dVar) {
        C0185i c0185i = new C0185i(1, l.n(dVar));
        c0185i.u();
        this.f11818a.registerTrigger(uri, new I.d(0), new c(c0185i));
        Object objT = c0185i.t();
        return objT == a.f448o ? objT : B3.o.f154a;
    }

    public Object e(c cVar, d dVar) {
        new C0185i(1, l.n(dVar)).u();
        e.C();
        throw null;
    }

    public Object f(d dVar, d dVar2) {
        new C0185i(1, l.n(dVar2)).u();
        e.D();
        throw null;
    }
}
