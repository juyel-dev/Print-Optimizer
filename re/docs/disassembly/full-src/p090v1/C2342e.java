package p090v1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC0698Ab;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C1968zb;
import com.google.android.gms.internal.ads.InterfaceC0705Bb;
import p008b2.b;

/* JADX INFO: renamed from: v1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2342e extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC1923ya f13446c;

    public C2342e(Context context, BinderC1923ya binderC1923ya) {
        this.f13445b = context;
        this.f13446c = binderC1923ya;
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.c3(new b(this.f13445b), this.f13446c, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        IInterface c1968zb;
        Context context = this.f13445b;
        b bVar = new b(context);
        try {
            try {
                IBinder iBinderB = AbstractC0773Md.D(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i5 = AbstractBinderC0698Ab.f2758o;
                if (iBinderB == null) {
                    c1968zb = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c1968zb = iInterfaceQueryLocalInterface instanceof InterfaceC0705Bb ? (InterfaceC0705Bb) iInterfaceQueryLocalInterface : new C1968zb(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 0);
                }
                return ((C1968zb) c1968zb).S3(bVar, this.f13446c);
            } catch (RemoteException | C0767Ld | NullPointerException unused) {
                return null;
            }
        } catch (Exception e) {
            throw new C0767Ld(e);
        }
    }
}
