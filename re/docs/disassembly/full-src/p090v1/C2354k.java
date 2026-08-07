package p090v1;

import D1.e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C0807Sb;
import com.google.android.gms.internal.ads.C1038e9;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.E8;
import com.google.android.gms.internal.ads.F8;
import com.google.android.gms.internal.ads.G8;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.I8;
import com.google.android.gms.internal.ads.InterfaceC0813Tb;
import p008b2.b;
import p008b2.c;

/* JADX INFO: renamed from: v1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2354k extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13467d;
    public final /* synthetic */ C2358m e;

    public C2354k(C2358m c2358m, e eVar, FrameLayout frameLayout, Context context) {
        this.f13465b = eVar;
        this.f13466c = frameLayout;
        this.f13467d = context;
        this.e = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13467d, "native_ad_view_delegate");
        return new B0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.j2(new b(this.f13465b), new b(this.f13466c));
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        IInterface g8;
        Context context = this.f13467d;
        AbstractC1869x7.a(context);
        boolean zBooleanValue = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.m9)).booleanValue();
        FrameLayout frameLayout = this.f13466c;
        e eVar = this.f13465b;
        C2358m c2358m = this.e;
        if (!zBooleanValue) {
            C1038e9 c1038e9 = (C1038e9) c2358m.q;
            try {
                b bVar = new b(context);
                b bVar2 = new b(eVar);
                b bVar3 = new b(frameLayout);
                G8 g9 = (G8) ((I8) c1038e9.b(context));
                Parcel parcelX1 = g9.X1();
                AbstractC1955z5.e(parcelX1, bVar);
                AbstractC1955z5.e(parcelX1, bVar2);
                AbstractC1955z5.e(parcelX1, bVar3);
                parcelX1.writeInt(240304000);
                Parcel parcelO3 = g9.o3(parcelX1, 1);
                IBinder strongBinder = parcelO3.readStrongBinder();
                parcelO3.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof F8 ? (F8) iInterfaceQueryLocalInterface : new D8(strongBinder);
            } catch (RemoteException e) {
                e = e;
                AbstractC1223ib.t("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (c e3) {
                e = e3;
                AbstractC1223ib.t("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            b bVar4 = new b(context);
            b bVar5 = new b(eVar);
            b bVar6 = new b(frameLayout);
            try {
                IBinder iBinderB = AbstractC0773Md.D(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i5 = H8.f3873o;
                if (iBinderB == null) {
                    g8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    g8 = iInterfaceQueryLocalInterface2 instanceof I8 ? (I8) iInterfaceQueryLocalInterface2 : new G8(iBinderB);
                }
                G8 g10 = (G8) g8;
                Parcel parcelX2 = g10.X1();
                AbstractC1955z5.e(parcelX2, bVar4);
                AbstractC1955z5.e(parcelX2, bVar5);
                AbstractC1955z5.e(parcelX2, bVar6);
                parcelX2.writeInt(240304000);
                Parcel parcelO4 = g10.o3(parcelX2, 1);
                IBinder strongBinder2 = parcelO4.readStrongBinder();
                parcelO4.recycle();
                int i6 = E8.f3255o;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof F8 ? (F8) iInterfaceQueryLocalInterface3 : new D8(strongBinder2);
            } catch (Exception e5) {
                throw new C0767Ld(e5);
            }
        } catch (RemoteException | C0767Ld | NullPointerException e6) {
            InterfaceC0813Tb interfaceC0813TbF = C0807Sb.f(context);
            c2358m.getClass();
            interfaceC0813TbF.b("ClientApiBroker.createNativeAdViewDelegate", e6);
            return null;
        }
    }
}
