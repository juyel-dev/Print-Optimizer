package p100x1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.Ii;
import p046k2.h;
import p085u1.k;
import p090v1.InterfaceC2334a;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z3) {
        if (adOverlayInfoParcel.f2660y != 4 || adOverlayInfoParcel.q != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f2643A.f5228r);
            intent.putExtra("shouldCallOnOverlayOpened", z3);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            F f5 = k.f13311A.f13314c;
            F.o(context, intent);
            return;
        }
        InterfaceC2334a interfaceC2334a = adOverlayInfoParcel.p;
        if (interfaceC2334a != null) {
            interfaceC2334a.I();
        }
        Ii ii = adOverlayInfoParcel.f2651I;
        if (ii != null) {
            ii.e();
        }
        Activity activityF = adOverlayInfoParcel.f2655r.f();
        d dVar = adOverlayInfoParcel.f2654o;
        if (dVar != null && dVar.f13701x && activityF != null) {
            context = activityF;
        }
        h hVar = k.f13311A.f13312a;
        h.w(context, dVar, adOverlayInfoParcel.f2658w, dVar != null ? dVar.f13700w : null);
    }
}
