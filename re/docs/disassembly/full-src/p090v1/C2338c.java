package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C0807Sb;
import p008b2.b;

/* JADX INFO: renamed from: v1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2338c extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f13440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC1923ya f13441c;

    public C2338c(OutOfContextTestingActivity outOfContextTestingActivity, BinderC1923ya binderC1923ya) {
        this.f13440b = outOfContextTestingActivity;
        this.f13441c = binderC1923ya;
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object a() {
        C2358m.q(this.f13440b, "out_of_context_tester");
        return null;
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f13440b;
        b bVar = new b(outOfContextTestingActivity);
        AbstractC1869x7.a(outOfContextTestingActivity);
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.s8)).booleanValue()) {
            return p.C1(bVar, this.f13441c, 240304000);
        }
        return null;
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        C2353j0 c2353j0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f13440b;
        b bVar = new b(outOfContextTestingActivity);
        AbstractC1869x7.a(outOfContextTestingActivity);
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.s8)).booleanValue()) {
            return null;
        }
        try {
            try {
                IBinder iBinderB = AbstractC0773Md.D(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                if (iBinderB == null) {
                    c2353j0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    c2353j0 = iInterfaceQueryLocalInterface instanceof C2353j0 ? (C2353j0) iInterfaceQueryLocalInterface : new C2353j0(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 0);
                }
                return c2353j0.S3(bVar, this.f13441c);
            } catch (Exception e) {
                throw new C0767Ld(e);
            }
        } catch (RemoteException e3) {
            e = e3;
            C0807Sb.f(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (C0767Ld e5) {
            e = e5;
            C0807Sb.f(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            C0807Sb.f(outOfContextTestingActivity).b("ClientApiBroker.getOutOfContextTester", e);
            return null;
        }
    }
}
