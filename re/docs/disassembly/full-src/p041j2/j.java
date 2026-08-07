package p041j2;

import Q1.d;
import S1.p;
import T1.AbstractC0152i;
import T1.C0149f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends AbstractC0152i {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Bundle f11582N;

    public j(Context context, Looper looper, C0149f c0149f, p pVar, p pVar2) {
        super(context, looper, 223, c0149f, pVar, pVar2);
        this.f11582N = new Bundle();
    }

    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 17895000;
    }

    @Override // T1.AbstractC0148e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 2);
    }

    @Override // T1.AbstractC0148e
    public final d[] q() {
        return e.e;
    }

    @Override // T1.AbstractC0148e
    public final Bundle r() {
        return this.f11582N;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // T1.AbstractC0148e
    public final boolean w() {
        return true;
    }

    @Override // T1.AbstractC0148e
    public final boolean x() {
        return true;
    }
}
