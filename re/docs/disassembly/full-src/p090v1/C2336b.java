package p090v1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC0717Db;
import com.google.android.gms.internal.ads.AbstractBinderC0735Gb;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.C0711Cb;
import com.google.android.gms.internal.ads.C0729Fb;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C0807Sb;
import com.google.android.gms.internal.ads.C1038e9;
import com.google.android.gms.internal.ads.InterfaceC0723Eb;
import com.google.android.gms.internal.ads.InterfaceC0741Hb;
import com.google.android.gms.internal.ads.InterfaceC0813Tb;
import p008b2.b;
import p008b2.c;

/* JADX INFO: renamed from: v1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2336b extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f13438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2358m f13439c;

    public C2336b(C2358m c2358m, AdActivity adActivity) {
        this.f13438b = adActivity;
        this.f13439c = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object a() {
        C2358m.q(this.f13438b, "ad_overlay");
        return null;
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.L(new b(this.f13438b));
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        IInterface c0729Fb;
        AdActivity adActivity = this.f13438b;
        AbstractC1869x7.a(adActivity);
        boolean zBooleanValue = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.m9)).booleanValue();
        C2358m c2358m = this.f13439c;
        if (!zBooleanValue) {
            C1038e9 c1038e9 = (C1038e9) c2358m.f13472r;
            try {
                b bVar = new b(adActivity);
                C0729Fb c0729Fb2 = (C0729Fb) ((InterfaceC0741Hb) c1038e9.b(adActivity));
                Parcel parcelX1 = c0729Fb2.X1();
                AbstractC1955z5.e(parcelX1, bVar);
                Parcel parcelO3 = c0729Fb2.o3(parcelX1, 1);
                IBinder strongBinder = parcelO3.readStrongBinder();
                parcelO3.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0723Eb ? (InterfaceC0723Eb) iInterfaceQueryLocalInterface : new C0711Cb(strongBinder);
            } catch (RemoteException e) {
                AbstractC1223ib.t("Could not create remote AdOverlay.", e);
                return null;
            } catch (c e3) {
                AbstractC1223ib.t("Could not create remote AdOverlay.", e3);
                return null;
            }
        }
        try {
            b bVar2 = new b(adActivity);
            try {
                IBinder iBinderB = AbstractC0773Md.D(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i5 = AbstractBinderC0735Gb.f3763o;
                if (iBinderB == null) {
                    c0729Fb = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c0729Fb = iInterfaceQueryLocalInterface2 instanceof InterfaceC0741Hb ? (InterfaceC0741Hb) iInterfaceQueryLocalInterface2 : new C0729Fb(iBinderB);
                }
                C0729Fb c0729Fb3 = (C0729Fb) c0729Fb;
                Parcel parcelX2 = c0729Fb3.X1();
                AbstractC1955z5.e(parcelX2, bVar2);
                Parcel parcelO4 = c0729Fb3.o3(parcelX2, 1);
                IBinder strongBinder2 = parcelO4.readStrongBinder();
                parcelO4.recycle();
                int i6 = AbstractBinderC0717Db.f3153o;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC0723Eb ? (InterfaceC0723Eb) iInterfaceQueryLocalInterface3 : new C0711Cb(strongBinder2);
            } catch (Exception e5) {
                throw new C0767Ld(e5);
            }
        } catch (RemoteException | C0767Ld | NullPointerException e6) {
            InterfaceC0813Tb interfaceC0813TbF = C0807Sb.f(adActivity.getApplicationContext());
            c2358m.getClass();
            interfaceC0813TbF.b("ClientApiBroker.createAdOverlay", e6);
            return null;
        }
    }
}
