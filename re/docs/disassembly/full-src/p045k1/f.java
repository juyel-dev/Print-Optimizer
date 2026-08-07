package p045k1;

import N.b;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import p020e1.j;
import p049l1.d;
import p049l1.h;
import p054m1.a;
import p054m1.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f11623o;
    public final /* synthetic */ j p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Runnable f11624r;

    public /* synthetic */ f(j jVar, j jVar2, int i5, Runnable runnable) {
        this.f11623o = jVar;
        this.p = jVar2;
        this.q = i5;
        this.f11624r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final j jVar = this.p;
        final int i5 = this.q;
        Runnable runnable = this.f11624r;
        final j jVar2 = this.f11623o;
        c cVar = jVar2.f11632f;
        try {
            try {
                d dVar = jVar2.f11630c;
                Objects.requireNonNull(dVar);
                ((h) cVar).n(new b(dVar, 15));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar2.f11628a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((h) cVar).n(new p054m1.b() { // from class: k1.g
                        @Override // p054m1.b
                        public final Object b() {
                            jVar2.f11631d.a(jVar, i5 + 1, false);
                            return null;
                        }
                    });
                } else {
                    jVar2.a(jVar, i5);
                }
            } catch (a unused) {
                jVar2.f11631d.a(jVar, i5 + 1, false);
            }
        } finally {
            runnable.run();
        }
    }
}
