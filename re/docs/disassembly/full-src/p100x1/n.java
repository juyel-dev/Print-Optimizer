package p100x1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC0717Db;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.Ii;
import p008b2.a;
import p046k2.h;
import p085u1.k;
import p090v1.C2366q;
import p090v1.InterfaceC2334a;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends AbstractBinderC0717Db {
    public final AdOverlayInfoParcel p;
    public final Activity q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13711r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13712s = false;
    public boolean t = false;

    public n(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.p = adOverlayInfoParcel;
        this.q = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void B() {
        h hVar = this.p.q;
        if (hVar != null) {
            hVar.c0();
        }
        if (this.q.isFinishing()) {
            S3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void C() {
        if (this.q.isFinishing()) {
            S3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void N() {
        if (this.f13711r) {
            this.q.finish();
            return;
        }
        this.f13711r = true;
        h hVar = this.p.q;
        if (hVar != null) {
            hVar.i0();
        }
    }

    public final synchronized void S3() {
        try {
            if (this.f13712s) {
                return;
            }
            h hVar = this.p.q;
            if (hVar != null) {
                hVar.R1(4);
            }
            this.f13712s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void Z() {
        if (this.q.isFinishing()) {
            S3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final boolean q3() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void s2(Bundle bundle) {
        h hVar;
        boolean zBooleanValue = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.R7)).booleanValue();
        Activity activity = this.q;
        if (zBooleanValue && !this.t) {
            activity.requestWindowFeature(1);
        }
        boolean z3 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z3 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.p;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z3) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC2334a interfaceC2334a = adOverlayInfoParcel.p;
            if (interfaceC2334a != null) {
                interfaceC2334a.I();
            }
            Ii ii = adOverlayInfoParcel.f2651I;
            if (ii != null) {
                ii.e();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (hVar = adOverlayInfoParcel.q) != null) {
                hVar.b0();
            }
        }
        h hVar2 = k.f13311A.f13312a;
        d dVar = adOverlayInfoParcel.f2654o;
        if (h.w(activity, dVar, adOverlayInfoParcel.f2658w, dVar.f13700w)) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void x() {
        this.t = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void x2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f13711r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void z() {
        h hVar = this.p.q;
        if (hVar != null) {
            hVar.L3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void S() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void o2() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void i3(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void J1(int i5, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0723Eb
    public final void j1(int i5, int i6, Intent intent) {
    }
}
