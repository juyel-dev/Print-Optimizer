package p111z2;

import A2.d;
import A2.i;
import A2.m;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends d implements i {
    public final m p;
    public final p101x2.i q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f16096r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, m mVar, p101x2.i iVar) {
        super(0);
        this.f16096r = jVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.p = mVar;
        this.q = iVar;
    }

    @Override // A2.i
    public void D2(Bundle bundle) {
        this.f16096r.f16099a.c(this.q);
        this.p.f("onCompleteUpdate", new Object[0]);
    }

    @Override // A2.i
    public void i2(Bundle bundle) {
        this.f16096r.f16099a.c(this.q);
        this.p.f("onRequestInfo", new Object[0]);
    }
}
