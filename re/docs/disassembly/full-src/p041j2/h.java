package p041j2;

import K1.c;
import S1.p;
import T1.AbstractC0152i;
import T1.C0149f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.ads.C0925bj;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC0152i {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final c f11581N;

    public h(Context context, Looper looper, C0149f c0149f, c cVar, p pVar, p pVar2) {
        super(context, looper, 68, c0149f, pVar, pVar2);
        cVar = cVar == null ? c.q : cVar;
        C0925bj c0925bj = new C0925bj(3, (char) 0);
        c0925bj.p = Boolean.FALSE;
        c cVar2 = c.q;
        cVar.getClass();
        c0925bj.p = Boolean.valueOf(cVar.f592o);
        c0925bj.q = cVar.p;
        c0925bj.q = f.a();
        this.f11581N = new c(c0925bj);
    }

    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 12800000;
    }

    @Override // T1.AbstractC0148e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
    }

    @Override // T1.AbstractC0148e
    public final Bundle r() {
        c cVar = this.f11581N;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cVar.f592o);
        bundle.putString("log_session_id", cVar.p);
        return bundle;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
