package p033h3;

import A.e;
import I.d;
import N.b;
import S.k;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends Binder {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f11443o;

    public A(e eVar) {
        this.f11443o = eVar;
    }

    public final void a(B b5) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = b5.f11444a;
        g gVar = (g) this.f11443o.p;
        gVar.getClass();
        i iVar = new i();
        gVar.f11468o.execute(new k(gVar, intent, iVar, 1));
        iVar.f13713a.a(new d(0), new b(b5, 12));
    }
}
