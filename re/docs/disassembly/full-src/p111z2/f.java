package p111z2;

import A2.m;
import A2.n;
import A2.s;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0789Pb;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends n {
    public final /* synthetic */ int p;
    public final /* synthetic */ i q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16095s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, i iVar, i iVar2, Object obj2, int i5) {
        super(iVar);
        this.p = i5;
        this.f16095s = obj;
        this.q = iVar2;
        this.f16094r = obj2;
    }

    @Override // A2.n
    public final void a() {
        switch (this.p) {
            case 0:
                i iVar = this.q;
                j jVar = (j) this.f16095s;
                String str = (String) this.f16094r;
                try {
                    jVar.f16099a.f118m.t0(jVar.f16100b, j.a(jVar, str), new i(jVar, iVar, str));
                    return;
                } catch (RemoteException e) {
                    j.e.e(e, "requestUpdateInfo(%s)", str);
                    iVar.c(new RuntimeException(e));
                    return;
                }
            case 1:
                i iVar2 = this.q;
                j jVar2 = (j) this.f16095s;
                try {
                    jVar2.f16099a.f118m.b2(jVar2.f16100b, j.b(), new h(jVar2, new m("OnCompleteUpdateCallback"), iVar2));
                    return;
                } catch (RemoteException e3) {
                    j.e.e(e3, "completeUpdate(%s)", (String) this.f16094r);
                    iVar2.c(new RuntimeException(e3));
                    return;
                }
            default:
                synchronized (((s) this.f16095s).f112f) {
                    try {
                        s sVar = (s) this.f16095s;
                        i iVar3 = this.q;
                        sVar.e.add(iVar3);
                        iVar3.f13713a.h(new C0789Pb(1, sVar, iVar3));
                        if (((s) this.f16095s).f116k.getAndIncrement() > 0) {
                            ((s) this.f16095s).f109b.f("Already connected to the service.", new Object[0]);
                        }
                        s.b((s) this.f16095s, (n) this.f16094r);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, i iVar, String str, i iVar2) {
        super(iVar);
        this.p = 0;
        this.f16095s = jVar;
        this.f16094r = str;
        this.q = iVar2;
    }
}
