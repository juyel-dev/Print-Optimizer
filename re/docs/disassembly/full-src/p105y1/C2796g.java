package p105y1;

import W.DialogInterfaceOnCancelListenerC0163h;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0797Qd;
import com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC0810Se;
import com.google.android.gms.internal.ads.Dl;
import com.google.android.gms.internal.ads.Gl;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.Ns;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p035i0.a;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: renamed from: y1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2796g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gl f15927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15929d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15930f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PointF f15932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f15933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Ns f15934k;
    public int g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RunnableC2791b f15935l = new RunnableC2791b(this, 2);

    public C2796g(Context context) {
        this.f15926a = context;
        this.f15931h = ViewConfiguration.get(context).getScaledTouchSlop();
        k kVar = k.f13311A;
        kVar.f13325r.c();
        this.f15934k = (Ns) kVar.f13325r.f881d;
        this.f15927b = kVar.f13322m.g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z3) {
        if (!z3) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.f15932i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i5 = this.g;
        if (i5 == -1) {
            return;
        }
        RunnableC2791b runnableC2791b = this.f15935l;
        Ns ns = this.f15934k;
        if (i5 == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.f15933j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                ns.postDelayed(runnableC2791b, ((Long) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9795Z3)).longValue());
                return;
            }
            return;
        }
        if (i5 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z3 = false;
                for (int i6 = 0; i6 < historySize; i6++) {
                    z3 |= !d(motionEvent.getHistoricalX(0, i6), motionEvent.getHistoricalY(0, i6), motionEvent.getHistoricalX(1, i6), motionEvent.getHistoricalY(1, i6));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z3) {
                    return;
                }
            }
            this.g = -1;
            ns.removeCallbacks(runnableC2791b);
        }
    }

    public final void b() {
        String str;
        Context context = this.f15926a;
        try {
            if (!(context instanceof Activity)) {
                AbstractC1223ib.r("Can not create dialog without Activity Context");
                return;
            }
            k kVar = k.f13311A;
            C2799j c2799j = kVar.f13322m;
            synchronized (c2799j.f15939a) {
                str = c2799j.f15941c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != kVar.f13322m.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.i8)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderH = F.h(context);
            builderH.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: y1.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    C2796g c2796g = this.f15915a;
                    c2796g.getClass();
                    if (i5 != iE) {
                        if (i5 == iE2) {
                            AbstractC1223ib.m("Debug mode [Creative Preview] selected.");
                            AbstractC0803Rd.f5534a.execute(new RunnableC2791b(c2796g, 3));
                            return;
                        }
                        if (i5 == iE3) {
                            AbstractC1223ib.m("Debug mode [Troubleshooting] selected.");
                            AbstractC0803Rd.f5534a.execute(new RunnableC2791b(c2796g, 1));
                            return;
                        }
                        int i6 = iE4;
                        Gl gl = c2796g.f15927b;
                        if (i5 == i6) {
                            C0797Qd c0797Qd = AbstractC0803Rd.e;
                            C0797Qd c0797Qd2 = AbstractC0803Rd.f5534a;
                            if (gl.f()) {
                                c0797Qd.execute(new RunnableC2791b(c2796g, 6));
                                return;
                            } else {
                                c0797Qd2.execute(new Gp(24, c2796g, c0797Qd));
                                return;
                            }
                        }
                        if (i5 == iE5) {
                            C0797Qd c0797Qd3 = AbstractC0803Rd.e;
                            C0797Qd c0797Qd4 = AbstractC0803Rd.f5534a;
                            if (gl.f()) {
                                c0797Qd3.execute(new RunnableC2791b(c2796g, 0));
                                return;
                            } else {
                                c0797Qd4.execute(new RunnableC1805vo(24, c2796g, c0797Qd3));
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = c2796g.f15926a;
                    if (!(context2 instanceof Activity)) {
                        AbstractC1223ib.r("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c2796g.f15928c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        F f5 = k.f13311A.f13314c;
                        HashMap mapK = F.k(uriBuild);
                        for (String str6 : mapK.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapK.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    F f6 = k.f13311A.f13314c;
                    AlertDialog.Builder builderH2 = F.h(context2);
                    builderH2.setMessage(str5);
                    builderH2.setTitle("Ad Information");
                    builderH2.setPositiveButton("Share", new DialogInterfaceOnClickListenerC0810Se(1, c2796g, str5));
                    builderH2.setNegativeButton("Close", DialogInterfaceOnClickListenerC2792c.f15914a);
                    builderH2.create().show();
                }
            });
            builderH.create().show();
        } catch (WindowManager.BadTokenException e) {
            B.x("", e);
        }
    }

    public final void c(Context context) {
        final int i5;
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f15927b.f3823o.ordinal();
        if (iOrdinal != 1) {
            i5 = iOrdinal != 2 ? iE : iE3;
        } else {
            i5 = iE2;
        }
        F f5 = k.f13311A.f13314c;
        AlertDialog.Builder builderH = F.h(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i5);
        builderH.setTitle("Setup gesture");
        builderH.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i5, new DialogInterfaceOnClickListenerC2794e(atomicInteger, 0));
        builderH.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC2794e(this, 1));
        builderH.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: y1.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                C2796g c2796g = this.f15922a;
                c2796g.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i5) {
                    int i7 = atomicInteger2.get();
                    int i8 = iE2;
                    Gl gl = c2796g.f15927b;
                    if (i7 == i8) {
                        gl.j(Dl.p, true);
                    } else if (atomicInteger2.get() == iE3) {
                        gl.j(Dl.q, true);
                    } else {
                        gl.j(Dl.f3195o, true);
                    }
                }
                c2796g.b();
            }
        });
        builderH.setOnCancelListener(new DialogInterfaceOnCancelListenerC0163h(this, 1));
        builderH.create().show();
    }

    public final boolean d(float f5, float f6, float f7, float f8) {
        float fAbs = Math.abs(this.f15932i.x - f5);
        int i5 = this.f15931h;
        return fAbs < ((float) i5) && Math.abs(this.f15932i.y - f6) < ((float) i5) && Math.abs(this.f15933j.x - f7) < ((float) i5) && Math.abs(this.f15933j.y - f8) < ((float) i5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f15928c);
        sb.append(",DebugSignal: ");
        sb.append(this.f15930f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return a.p(sb, this.f15929d, "}");
    }
}
