package p105y1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import p085u1.k;

/* JADX INFO: renamed from: y1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2798i implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f15937o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15938r;

    public RunnableC2798i(Context context, String str, boolean z3, boolean z4) {
        this.f15937o = context;
        this.p = str;
        this.q = z3;
        this.f15938r = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f5 = k.f13311A.f13314c;
        AlertDialog.Builder builderH = F.h(this.f15937o);
        builderH.setMessage(this.p);
        if (this.q) {
            builderH.setTitle("Error");
        } else {
            builderH.setTitle("Info");
        }
        if (this.f15938r) {
            builderH.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderH.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC2794e(this, 2));
            builderH.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderH.create().show();
    }
}
