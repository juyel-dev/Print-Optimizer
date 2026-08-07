package p090v1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1618rd;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.C0767Ld;
import com.google.android.gms.internal.ads.C1575qd;
import com.google.android.gms.internal.ads.InterfaceC1662sd;
import p008b2.b;

/* JADX INFO: renamed from: v1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2340d extends AbstractC2360n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC1923ya f13444c;

    public C2340d(Context context, BinderC1923ya binderC1923ya) {
        this.f13443b = context;
        this.f13444c = binderC1923ya;
    }

    @Override // p090v1.AbstractC2360n
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // p090v1.AbstractC2360n
    public final Object b(P p) {
        return p.l1(new b(this.f13443b), this.f13444c, 240304000);
    }

    @Override // p090v1.AbstractC2360n
    public final Object c() {
        IInterface c1575qd;
        Context context = this.f13443b;
        b bVar = new b(context);
        try {
            try {
                IBinder iBinderB = AbstractC0773Md.D(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i5 = AbstractBinderC1618rd.f8943o;
                if (iBinderB == null) {
                    c1575qd = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c1575qd = iInterfaceQueryLocalInterface instanceof InterfaceC1662sd ? (InterfaceC1662sd) iInterfaceQueryLocalInterface : new C1575qd(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 0);
                }
                return ((C1575qd) c1575qd).S3(bVar, this.f13444c);
            } catch (RemoteException | C0767Ld | NullPointerException unused) {
                return null;
            }
        } catch (Exception e) {
            throw new C0767Ld(e);
        }
    }
}
