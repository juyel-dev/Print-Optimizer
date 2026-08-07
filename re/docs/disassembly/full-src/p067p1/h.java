package p067p1;

import T1.z;
import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC0725Ed;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.J3;
import com.google.android.gms.internal.ads.J5;
import com.google.android.gms.internal.ads.U7;
import p071q1.b;
import p090v1.C2362o;
import p090v1.C2366q;
import p090v1.D0;
import p090v1.I;
import p090v1.InterfaceC2334a;
import p090v1.InterfaceC2357l0;
import p090v1.M0;
import p090v1.s0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends ViewGroup {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J3 f12273o;

    public h(Context context) {
        super(context);
        this.f12273o = new J3(this);
    }

    public final void a(d dVar) {
        z.d("#008 Must be called on the main UI thread.");
        AbstractC1869x7.a(getContext());
        if (((Boolean) U7.f5826d.p()).booleanValue()) {
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.K9)).booleanValue()) {
                AbstractC0725Ed.f3291b.execute(new Gp(10, this, dVar));
                return;
            }
        }
        this.f12273o.e(dVar.f12262a);
    }

    public a getAdListener() {
        return (a) this.f12273o.f4307f;
    }

    public e getAdSize() {
        M0 m0H;
        J3 j5 = this.f12273o;
        j5.getClass();
        try {
            I i5 = (I) j5.f4309i;
            if (i5 != null && (m0H = i5.h()) != null) {
                return new e(m0H.f13425s, m0H.p, m0H.f13423o);
            }
        } catch (RemoteException e) {
            AbstractC1223ib.u("#007 Could not call remote method.", e);
        }
        e[] eVarArr = (e[]) j5.g;
        if (eVarArr != null) {
            return eVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        I i5;
        J3 j5 = this.f12273o;
        if (((String) j5.f4310j) == null && (i5 = (I) j5.f4309i) != null) {
            try {
                j5.f4310j = i5.w();
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
        return (String) j5.f4310j;
    }

    public k getOnPaidEventListener() {
        this.f12273o.getClass();
        return null;
    }

    public m getResponseInfo() {
        InterfaceC2357l0 interfaceC2357l0K;
        J3 j5 = this.f12273o;
        j5.getClass();
        try {
            I i5 = (I) j5.f4309i;
            interfaceC2357l0K = i5 != null ? i5.k() : null;
        } catch (RemoteException e) {
            AbstractC1223ib.u("#007 Could not call remote method.", e);
        }
        if (interfaceC2357l0K != null) {
            return new m(interfaceC2357l0K);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i5, int i6, int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i9 = ((i7 - i5) - measuredWidth) / 2;
        int i10 = ((i8 - i6) - measuredHeight) / 2;
        childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        e adSize;
        int measuredHeight;
        int iL;
        int iL2;
        int i7;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                AbstractC1223ib.q("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i8 = adSize.f12266a;
                if (i8 == -3) {
                    iL = -1;
                } else if (i8 != -1) {
                    C0743Hd c0743Hd = C2362o.f13474f.f13475a;
                    iL = C0743Hd.l(context, i8);
                } else {
                    iL = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i9 = adSize.f12267b;
                if (i9 == -4 || i9 == -3) {
                    iL2 = -1;
                } else if (i9 != -2) {
                    C0743Hd c0743Hd2 = C2362o.f13474f.f13475a;
                    iL2 = C0743Hd.l(context, i9);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f5 = displayMetrics.heightPixels;
                    float f6 = displayMetrics.density;
                    int i10 = (int) (f5 / f6);
                    if (i10 <= 400) {
                        i7 = 32;
                    } else {
                        i7 = i10 <= 720 ? 50 : 90;
                    }
                    iL2 = (int) (i7 * f6);
                }
                measuredHeight = iL2;
                measuredWidth = iL;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i5, i6);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i5), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(a aVar) {
        J3 j5 = this.f12273o;
        j5.f4307f = aVar;
        s0 s0Var = (s0) j5.f4306d;
        synchronized (s0Var.f13494o) {
            s0Var.p = aVar;
        }
        if (aVar == 0) {
            this.f12273o.f(null);
            return;
        }
        if (aVar instanceof InterfaceC2334a) {
            this.f12273o.f((InterfaceC2334a) aVar);
        }
        if (aVar instanceof b) {
            J3 j6 = this.f12273o;
            b bVar = (b) aVar;
            j6.getClass();
            try {
                j6.f4308h = bVar;
                I i5 = (I) j6.f4309i;
                if (i5 != null) {
                    i5.J2(new J5(bVar));
                }
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
    }

    public void setAdSize(e eVar) {
        e[] eVarArr = {eVar};
        J3 j5 = this.f12273o;
        if (((e[]) j5.g) != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        h hVar = (h) j5.f4311k;
        j5.g = eVarArr;
        try {
            I i5 = (I) j5.f4309i;
            if (i5 != null) {
                i5.o1(J3.a(hVar.getContext(), (e[]) j5.g));
            }
        } catch (RemoteException e) {
            AbstractC1223ib.u("#007 Could not call remote method.", e);
        }
        hVar.requestLayout();
    }

    public void setAdUnitId(String str) {
        J3 j5 = this.f12273o;
        if (((String) j5.f4310j) != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        j5.f4310j = str;
    }

    public void setOnPaidEventListener(k kVar) {
        J3 j5 = this.f12273o;
        j5.getClass();
        try {
            I i5 = (I) j5.f4309i;
            if (i5 != null) {
                i5.B0(new D0());
            }
        } catch (RemoteException e) {
            AbstractC1223ib.u("#007 Could not call remote method.", e);
        }
    }
}
