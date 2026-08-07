package p090v1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C0712Cc;
import com.google.android.gms.internal.ads.C0748Ic;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.InterfaceC0724Ec;
import p008b2.b;

/* JADX INFO: renamed from: v1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2356l extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC1923ya f13470d;

    public C2356l(Context context, String str, BinderC1923ya binderC1923ya) {
        this.f13468b = context;
        this.f13469c = str;
        this.f13470d = binderC1923ya;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13468b, "rewarded");
        return new C0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.N1(new b(this.f13468b), this.f13469c, this.f13470d, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        C0748Ic c0748Ic;
        String str = this.f13469c;
        BinderC1923ya binderC1923ya = this.f13470d;
        Context context = this.f13468b;
        b bVar = new b(context);
        try {
            try {
                IBinder iBinderB = AbstractC0773Md.D(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    c0748Ic = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c0748Ic = iInterfaceQueryLocalInterface instanceof C0748Ic ? (C0748Ic) iInterfaceQueryLocalInterface : new C0748Ic(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 0);
                }
                IBinder iBinderS3 = c0748Ic.S3(bVar, str, binderC1923ya);
                if (iBinderS3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderS3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof InterfaceC0724Ec ? (InterfaceC0724Ec) iInterfaceQueryLocalInterface2 : new C0712Cc(iBinderS3);
            } catch (Exception e) {
                throw new C0767Ld(e);
            }
        } catch (RemoteException e3) {
            e = e3;
            AbstractC1223ib.u("#007 Could not call remote method.", e);
            return null;
        } catch (C0767Ld e5) {
            e = e5;
            AbstractC1223ib.u("#007 Could not call remote method.", e);
            return null;
        }
    }
}
