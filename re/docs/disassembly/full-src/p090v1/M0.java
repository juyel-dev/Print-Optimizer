package p090v1;

import U1.a;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C0743Hd;
import p013c2.g;
import p067p1.e;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends a {
    public static final Parcelable.Creator<M0> CREATOR = new C2339c0(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f13420A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f13421B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f13422C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13423o;
    public final int p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13425s;
    public final int t;
    public final M0[] u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f13429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f13430z;

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    public M0(Context context, e[] eVarArr) {
        int i5;
        int i6;
        String str;
        int dimensionPixelSize;
        e eVar = eVarArr[0];
        this.f13424r = false;
        int i7 = eVar.f12266a;
        int i8 = eVar.f12267b;
        boolean z3 = i7 == -3 && i8 == -4;
        this.f13427w = z3;
        this.f13420A = false;
        boolean z4 = eVar.f12269d;
        this.f13421B = z4;
        boolean z5 = eVar.f12270f;
        this.f13422C = z5;
        if (z3) {
            e eVar2 = e.f12263h;
            this.f13425s = eVar2.f12266a;
            i8 = eVar2.f12267b;
            this.p = i8;
        } else if (z4) {
            this.f13425s = i7;
            i8 = eVar.e;
            this.p = i8;
        } else if (z5) {
            this.f13425s = i7;
            i8 = eVar.g;
            this.p = i8;
        } else {
            this.f13425s = i7;
            this.p = i8;
        }
        boolean z6 = this.f13425s == -1;
        boolean z7 = i8 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z6) {
            C0743Hd c0743Hd = C2362o.f13474f.f13475a;
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.t = dimensionPixelSize;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i9 = displayMetrics3.heightPixels;
                        int i10 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i11 = displayMetrics3.heightPixels;
                        int i12 = displayMetrics3.widthPixels;
                        if (i11 == i9 && i12 == i10) {
                            int i13 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i13 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.t = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.t = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.t = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.t = dimensionPixelSize;
                }
            }
            double d4 = dimensionPixelSize / displayMetrics.density;
            i5 = (int) d4;
            if (d4 - ((double) i5) >= 0.01d) {
                i5++;
            }
        } else {
            i5 = this.f13425s;
            C0743Hd c0743Hd2 = C2362o.f13474f.f13475a;
            this.t = C0743Hd.i(displayMetrics, i5);
        }
        if (z7) {
            int i14 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i6 = i14 <= 400 ? 32 : i14 <= 720 ? 50 : 90;
        } else {
            i6 = this.p;
        }
        C0743Hd c0743Hd3 = C2362o.f13474f.f13475a;
        this.q = C0743Hd.i(displayMetrics, i6);
        if (z6 || z7) {
            this.f13423o = i5 + "x" + i6 + "_as";
        } else {
            if (z4 || z5) {
                str = this.f13425s + "x" + this.p + "_as";
            } else if (z3) {
                str = "320x50_mb";
            } else {
                this.f13423o = eVar.f12268c;
            }
            this.f13423o = str;
        }
        int length = eVarArr.length;
        if (length > 1) {
            this.u = new M0[length];
            for (int i15 = 0; i15 < eVarArr.length; i15++) {
                this.u[i15] = new M0(context, eVarArr[i15]);
            }
        } else {
            this.u = null;
        }
        this.f13426v = false;
        this.f13428x = false;
    }

    public static M0 g() {
        return new M0("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static M0 i() {
        return new M0("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f13423o);
        g.I(parcel, 3, 4);
        parcel.writeInt(this.p);
        g.I(parcel, 4, 4);
        parcel.writeInt(this.q);
        g.I(parcel, 5, 4);
        parcel.writeInt(this.f13424r ? 1 : 0);
        g.I(parcel, 6, 4);
        parcel.writeInt(this.f13425s);
        g.I(parcel, 7, 4);
        parcel.writeInt(this.t);
        g.C(parcel, 8, this.u, i5);
        g.I(parcel, 9, 4);
        parcel.writeInt(this.f13426v ? 1 : 0);
        g.I(parcel, 10, 4);
        parcel.writeInt(this.f13427w ? 1 : 0);
        boolean z3 = this.f13428x;
        g.I(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        g.I(parcel, 12, 4);
        parcel.writeInt(this.f13429y ? 1 : 0);
        g.I(parcel, 13, 4);
        parcel.writeInt(this.f13430z ? 1 : 0);
        g.I(parcel, 14, 4);
        parcel.writeInt(this.f13420A ? 1 : 0);
        g.I(parcel, 15, 4);
        parcel.writeInt(this.f13421B ? 1 : 0);
        g.I(parcel, 16, 4);
        parcel.writeInt(this.f13422C ? 1 : 0);
        g.H(parcel, iE);
    }

    public M0(String str, int i5, int i6, boolean z3, int i7, int i8, M0[] m0Arr, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f13423o = str;
        this.p = i5;
        this.q = i6;
        this.f13424r = z3;
        this.f13425s = i7;
        this.t = i8;
        this.u = m0Arr;
        this.f13426v = z4;
        this.f13427w = z5;
        this.f13428x = z6;
        this.f13429y = z7;
        this.f13430z = z8;
        this.f13420A = z9;
        this.f13421B = z10;
        this.f13422C = z11;
    }

    public M0() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public M0(Context context, e eVar) {
        this(context, new e[]{eVar});
    }
}
