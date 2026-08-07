package p090v1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C0807Sb;
import com.google.android.gms.internal.ads.C1038e9;
import com.google.android.gms.internal.ads.InterfaceC0813Tb;
import p008b2.b;
import p008b2.c;

/* JADX INFO: renamed from: v1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2352j extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC1923ya f13464d;
    public final /* synthetic */ C2358m e;

    public C2352j(C2358m c2358m, Context context, String str, BinderC1923ya binderC1923ya) {
        this.f13462b = context;
        this.f13463c = str;
        this.f13464d = binderC1923ya;
        this.e = c2358m;
    }

    @Override // p090v1.AbstractC2360n
    public final Object a() {
        C2358m.q(this.f13462b, "native_ad");
        return new z0();
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.x3(new b(this.f13462b), this.f13463c, this.f13464d, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        F f5;
        Context context = this.f13462b;
        AbstractC1869x7.a(context);
        boolean zBooleanValue = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.m9)).booleanValue();
        BinderC1923ya binderC1923ya = this.f13464d;
        String str = this.f13463c;
        C2358m c2358m = this.e;
        if (!zBooleanValue) {
            C1038e9 c1038e9 = (C1038e9) c2358m.p;
            try {
                b bVar = new b(context);
                F f6 = (F) c1038e9.b(context);
                Parcel parcelX1 = f6.X1();
                AbstractC1955z5.e(parcelX1, bVar);
                parcelX1.writeString(str);
                AbstractC1955z5.e(parcelX1, binderC1923ya);
                parcelX1.writeInt(240304000);
                Parcel parcelO3 = f6.o3(parcelX1, 1);
                IBinder strongBinder = parcelO3.readStrongBinder();
                parcelO3.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new C(strongBinder);
            } catch (RemoteException e) {
                e = e;
                AbstractC1223ib.t("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (c e3) {
                e = e3;
                AbstractC1223ib.t("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            b bVar2 = new b(context);
            try {
                IBinder iBinderB = AbstractC0773Md.D(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    f5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    f5 = iInterfaceQueryLocalInterface2 instanceof F ? (F) iInterfaceQueryLocalInterface2 : new F(iBinderB);
                }
                Parcel parcelX2 = f5.X1();
                AbstractC1955z5.e(parcelX2, bVar2);
                parcelX2.writeString(str);
                AbstractC1955z5.e(parcelX2, binderC1923ya);
                parcelX2.writeInt(240304000);
                Parcel parcelO4 = f5.o3(parcelX2, 1);
                IBinder strongBinder2 = parcelO4.readStrongBinder();
                parcelO4.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof E ? (E) iInterfaceQueryLocalInterface3 : new C(strongBinder2);
            } catch (Exception e5) {
                throw new C0767Ld(e5);
            }
        } catch (RemoteException e6) {
            e = e6;
            InterfaceC0813Tb interfaceC0813TbF = C0807Sb.f(context);
            c2358m.getClass();
            interfaceC0813TbF.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (C0767Ld e7) {
            e = e7;
            InterfaceC0813Tb interfaceC0813TbF2 = C0807Sb.f(context);
            c2358m.getClass();
            interfaceC0813TbF2.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            InterfaceC0813Tb interfaceC0813TbF3 = C0807Sb.f(context);
            c2358m.getClass();
            interfaceC0813TbF3.b("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}
