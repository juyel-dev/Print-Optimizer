package p091v2;

import R1.c;
import R1.g;
import R1.h;
import T1.AbstractC0152i;
import T1.C0149f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC0152i implements c {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f13504N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0149f f13505O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Bundle f13506P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Integer f13507Q;

    public a(Context context, Looper looper, C0149f c0149f, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, c0149f, gVar, hVar);
        this.f13504N = true;
        this.f13505O = c0149f;
        this.f13506P = bundle;
        this.f13507Q = (Integer) c0149f.f1255o;
    }

    @Override // T1.AbstractC0148e, R1.c
    public final int j() {
        return 12451000;
    }

    @Override // T1.AbstractC0148e, R1.c
    public final boolean m() {
        return this.f13504N;
    }

    @Override // T1.AbstractC0148e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 3);
    }

    @Override // T1.AbstractC0148e
    public final Bundle r() {
        C0149f c0149f = this.f13505O;
        boolean zEquals = this.q.getPackageName().equals((String) c0149f.p);
        Bundle bundle = this.f13506P;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0149f.p);
        }
        return bundle;
    }

    @Override // T1.AbstractC0148e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // T1.AbstractC0148e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
