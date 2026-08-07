package p067p1;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0725Ed;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import com.google.android.gms.internal.ads.U7;
import p090v1.B;
import p090v1.C2366q;
import p090v1.L0;
import p090v1.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f12261b;

    public c(Context context, B b5) {
        this.f12260a = context;
        this.f12261b = b5;
    }

    public final void a(d dVar) {
        r0 r0Var = dVar.f12262a;
        Context context = this.f12260a;
        AbstractC1869x7.a(context);
        if (((Boolean) U7.f5823a.p()).booleanValue()) {
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.K9)).booleanValue()) {
                AbstractC0725Ed.f3291b.execute(new RunnableC1805vo(11, this, r0Var));
                return;
            }
        }
        try {
            this.f12261b.b1(L0.a(context, r0Var));
        } catch (RemoteException e) {
            AbstractC1223ib.q("Failed to load ad.", e);
        }
    }
}
