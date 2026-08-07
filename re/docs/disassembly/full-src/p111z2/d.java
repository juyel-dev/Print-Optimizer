package p111z2;

import A2.m;
import A2.s;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import p000a.a;
import p101x2.i;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f16090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16092c;

    public d(j jVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f16090a = jVar;
        this.f16091b = cVar;
        this.f16092c = context;
    }

    public final o a() {
        String packageName = this.f16092c.getPackageName();
        j jVar = this.f16090a;
        s sVar = jVar.f16099a;
        if (sVar == null) {
            Object[] objArr = {-9};
            m mVar = j.e;
            mVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m.i(mVar.p, "onError(%d)", objArr));
            }
            return a.n(new B2.a(-9));
        }
        j.e.f("requestUpdateInfo(%s)", packageName);
        i iVar = new i();
        sVar.a().post(new f(sVar, iVar, iVar, new f(jVar, iVar, packageName, iVar), 2));
        return iVar.f13713a;
    }
}
