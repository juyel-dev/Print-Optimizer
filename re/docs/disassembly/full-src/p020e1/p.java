package p020e1;

import N.e;
import android.content.Context;
import p040j1.b;
import p045k1.j;
import p045k1.k;
import p046k2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static volatile k e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f11091d;

    public p(h hVar, h hVar2, b bVar, j jVar, k kVar) {
        this.f11088a = hVar;
        this.f11089b = hVar2;
        this.f11090c = bVar;
        this.f11091d = jVar;
        kVar.getClass();
        kVar.f11635a.execute(new e(kVar, 12));
    }

    public static p a() {
        k kVar = e;
        if (kVar != null) {
            return (p) kVar.t.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (p.class) {
                try {
                    if (e == null) {
                        I.h hVar = new I.h();
                        context.getClass();
                        hVar.f507a = context;
                        e = hVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
