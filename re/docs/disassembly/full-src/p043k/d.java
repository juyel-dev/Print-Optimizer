package p043k;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.G7;
import p005b.a;
import p005b.c;
import p090v1.C2358m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f11610b;

    public d(c cVar, ComponentName componentName) {
        this.f11609a = cVar;
        this.f11610b = componentName;
    }

    public final C2358m a(G7 g7) {
        c cVar = new c(g7);
        c cVar2 = this.f11609a;
        try {
            if (((a) cVar2).b0(cVar)) {
                return new C2358m(cVar2, cVar, this.f11610b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
