package p082t2;

import B0.d;
import D.g;
import E1.k;
import E1.l;
import Q1.h;
import Q1.i;
import T1.z;
import Y1.b;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.I;
import com.google.android.gms.internal.measurement.J;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: t2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2238h0 extends J implements G {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j1 f12695o;
    public Boolean p;
    public String q;

    public BinderC2238h0(j1 j1Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        z.i(j1Var);
        this.f12695o = j1Var;
        this.q = null;
    }

    @Override // p082t2.G
    public final void E3(o1 o1Var) {
        z.e(o1Var.f12803o);
        z.i(o1Var.f12793J);
        RunnableC2240i0 runnableC2240i0 = new RunnableC2240i0(this, o1Var, 1);
        j1 j1Var = this.f12695o;
        if (j1Var.m().v()) {
            runnableC2240i0.run();
        } else {
            j1Var.m().u(runnableC2240i0);
        }
    }

    @Override // p082t2.G
    public final C2239i I1(o1 o1Var) {
        R1(o1Var);
        String str = o1Var.f12803o;
        z.e(str);
        C2072n3.a();
        j1 j1Var = this.f12695o;
        try {
            return (C2239i) j1Var.m().s(new l(14, this, false, o1Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            L lJ = j1Var.j();
            lJ.f12472f.h("Failed to get consent. appId", L.q(str), e);
            return new C2239i(null);
        }
    }

    @Override // p082t2.G
    public final void I2(C2231e c2231e, o1 o1Var) {
        z.i(c2231e);
        z.i(c2231e.q);
        R1(o1Var);
        C2231e c2231e2 = new C2231e(c2231e);
        c2231e2.f12625o = o1Var.f12803o;
        c0(new d(7, this, c2231e2, o1Var, false));
    }

    @Override // p082t2.G
    public final List M0(String str, String str2, String str3, boolean z3) {
        i0(str, true);
        j1 j1Var = this.f12695o;
        try {
            List<l1> list = (List) j1Var.m().p(new CallableC2246l0(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (l1 l1Var : list) {
                if (z3 || !n1.o0(l1Var.f12763c)) {
                    arrayList.add(new k1(l1Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            L lJ = j1Var.j();
            lJ.f12472f.h("Failed to get user properties as. appId", L.q(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            L lJ2 = j1Var.j();
            lJ2.f12472f.h("Failed to get user properties as. appId", L.q(str), e);
            return Collections.emptyList();
        }
    }

    @Override // p082t2.G
    public final void M3(k1 k1Var, o1 o1Var) {
        z.i(k1Var);
        R1(o1Var);
        c0(new d(10, this, k1Var, o1Var, false));
    }

    @Override // p082t2.G
    public final void O1(long j5, String str, String str2, String str3) {
        c0(new RunnableC2244k0(this, str2, str3, str, j5, 0));
    }

    @Override // p082t2.G
    public final void O3(C2264v c2264v, o1 o1Var) {
        z.i(c2264v);
        R1(o1Var);
        c0(new d(9, this, c2264v, o1Var, false));
    }

    @Override // p082t2.G
    public final List Q1(String str, String str2, String str3) {
        i0(str, true);
        j1 j1Var = this.f12695o;
        try {
            return (List) j1Var.m().p(new CallableC2246l0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            j1Var.j().f12472f.f(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // p082t2.G
    public final void R0(o1 o1Var) {
        R1(o1Var);
        c0(new RunnableC2240i0(this, o1Var, 0));
    }

    public final void R1(o1 o1Var) {
        z.i(o1Var);
        String str = o1Var.f12803o;
        z.e(str);
        i0(str, false);
        this.f12695o.U().V(o1Var.p, o1Var.f12788E);
    }

    @Override // p082t2.G
    public final List U(Bundle bundle, o1 o1Var) {
        R1(o1Var);
        String str = o1Var.f12803o;
        z.i(str);
        j1 j1Var = this.f12695o;
        try {
            return (List) j1Var.m().p(new g(this, o1Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            L lJ = j1Var.j();
            lJ.f12472f.h("Failed to get trigger URIs. appId", L.q(str), e);
            return Collections.emptyList();
        }
    }

    public final void X1(C2264v c2264v, o1 o1Var) {
        j1 j1Var = this.f12695o;
        j1Var.V();
        j1Var.u(c2264v, o1Var);
    }

    @Override // p082t2.G
    public final byte[] Y1(C2264v c2264v, String str) {
        z.e(str);
        z.i(c2264v);
        i0(str, true);
        j1 j1Var = this.f12695o;
        L lJ = j1Var.j();
        C2236g0 c2236g0 = j1Var.f12726l;
        K k3 = c2236g0.f12685m;
        String str2 = c2264v.f12869o;
        lJ.f12478m.f(k3.b(str2), "Log and bundle. event");
        j1Var.e().getClass();
        long jNanoTime = System.nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) j1Var.m().s(new k(this, c2264v, str)).get();
            if (bArr == null) {
                j1Var.j().f12472f.f(L.q(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            j1Var.e().getClass();
            j1Var.j().f12478m.i("Log and bundle processed. event, size, time_ms", c2236g0.f12685m.b(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / AnimationKt.MillisToNanos) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            L lJ2 = j1Var.j();
            lJ2.f12472f.i("Failed to log and bundle. appId, event, error", L.q(str), c2236g0.f12685m.b(str2), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            L lJ3 = j1Var.j();
            lJ3.f12472f.i("Failed to log and bundle. appId, event, error", L.q(str), c2236g0.f12685m.b(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final boolean b0(int i5, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        boolean z3 = false;
        switch (i5) {
            case 1:
                C2264v c2264v = (C2264v) I.a(parcel, C2264v.CREATOR);
                o1 o1Var = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                O3(c2264v, o1Var);
                parcel2.writeNoException();
                return true;
            case 2:
                k1 k1Var = (k1) I.a(parcel, k1.CREATOR);
                o1 o1Var2 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                M3(k1Var, o1Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                o1 o1Var3 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                R0(o1Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C2264v c2264v2 = (C2264v) I.a(parcel, C2264v.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                I.d(parcel);
                z.i(c2264v2);
                z.e(string);
                i0(string, true);
                c0(new d(8, this, c2264v2, string, false));
                parcel2.writeNoException();
                return true;
            case 6:
                o1 o1Var4 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                j3(o1Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                o1 o1Var5 = (o1) I.a(parcel, o1.CREATOR);
                z3 = parcel.readInt() != 0;
                I.d(parcel);
                R1(o1Var5);
                String str = o1Var5.f12803o;
                z.i(str);
                j1 j1Var = this.f12695o;
                try {
                    List<l1> list = (List) j1Var.m().p(new l(15, this, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (l1 l1Var : list) {
                        if (z3 || !n1.o0(l1Var.f12763c)) {
                            arrayList.add(new k1(l1Var));
                        }
                        break;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    j1Var.j().f12472f.h("Failed to get user properties. appId", L.q(str), e);
                    arrayList = null;
                } catch (ExecutionException e3) {
                    e = e3;
                    j1Var.j().f12472f.h("Failed to get user properties. appId", L.q(str), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                C2264v c2264v3 = (C2264v) I.a(parcel, C2264v.CREATOR);
                String string2 = parcel.readString();
                I.d(parcel);
                byte[] bArrY1 = Y1(c2264v3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrY1);
                return true;
            case 10:
                long j5 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                I.d(parcel);
                O1(j5, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                o1 o1Var6 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                String strG1 = g1(o1Var6);
                parcel2.writeNoException();
                parcel2.writeString(strG1);
                return true;
            case Matrix.TranslateX /* 12 */:
                C2231e c2231e = (C2231e) I.a(parcel, C2231e.CREATOR);
                o1 o1Var7 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                I2(c2231e, o1Var7);
                parcel2.writeNoException();
                return true;
            case Matrix.TranslateY /* 13 */:
                C2231e c2231e2 = (C2231e) I.a(parcel, C2231e.CREATOR);
                I.d(parcel);
                z.i(c2231e2);
                z.i(c2231e2.q);
                z.e(c2231e2.f12625o);
                i0(c2231e2.f12625o, true);
                c0(new Gp(12, this, z3, new C2231e(c2231e2)));
                parcel2.writeNoException();
                return true;
            case Matrix.TranslateZ /* 14 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = I.f10545a;
                z3 = parcel.readInt() != 0;
                o1 o1Var8 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                List listU3 = u3(string6, string7, z3, o1Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU3);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = I.f10545a;
                z3 = parcel.readInt() != 0;
                I.d(parcel);
                List listM0 = M0(string8, string9, string10, z3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM0);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                o1 o1Var9 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                List listU0 = u0(string11, string12, o1Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU0);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                I.d(parcel);
                List listQ1 = Q1(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ1);
                return true;
            case 18:
                o1 o1Var10 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                z0(o1Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) I.a(parcel, Bundle.CREATOR);
                o1 o1Var11 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                mo6719U(bundle, o1Var11);
                parcel2.writeNoException();
                return true;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                o1 o1Var12 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                E3(o1Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                o1 o1Var13 = (o1) I.a(parcel, o1.CREATOR);
                I.d(parcel);
                C2239i c2239iI1 = I1(o1Var13);
                parcel2.writeNoException();
                if (c2239iI1 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c2239iI1.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                o1 o1Var14 = (o1) I.a(parcel, o1.CREATOR);
                Bundle bundle2 = (Bundle) I.a(parcel, Bundle.CREATOR);
                I.d(parcel);
                List listU = U(bundle2, o1Var14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU);
                return true;
        }
    }

    public final void c0(Runnable runnable) {
        j1 j1Var = this.f12695o;
        if (j1Var.m().v()) {
            runnable.run();
        } else {
            j1Var.m().t(runnable);
        }
    }

    @Override // p082t2.G
    public final String g1(o1 o1Var) {
        R1(o1Var);
        j1 j1Var = this.f12695o;
        try {
            return (String) j1Var.m().p(new l(16, j1Var, false, o1Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            L lJ = j1Var.j();
            lJ.f12472f.h("Failed to get app instance id. appId", L.q(o1Var.f12803o), e);
            return null;
        }
    }

    public final void i0(String str, boolean z3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        j1 j1Var = this.f12695o;
        if (zIsEmpty) {
            j1Var.j().f12472f.g("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z3) {
            try {
                if (this.p == null) {
                    this.p = Boolean.valueOf("com.google.android.gms".equals(this.q) || b.j(j1Var.f12726l.f12675a, Binder.getCallingUid()) || i.a(j1Var.f12726l.f12675a).c(Binder.getCallingUid()));
                }
                if (this.p.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                j1Var.j().f12472f.f(L.q(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.q == null) {
            Context context = j1Var.f12726l.f12675a;
            int callingUid = Binder.getCallingUid();
            int i5 = h.e;
            if (b.n(callingUid, context, str)) {
                this.q = str;
            }
        }
        if (str.equals(this.q)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // p082t2.G
    public final void j3(o1 o1Var) {
        R1(o1Var);
        c0(new RunnableC2242j0(this, o1Var, 0));
    }

    @Override // p082t2.G
    public final List u0(String str, String str2, o1 o1Var) {
        R1(o1Var);
        String str3 = o1Var.f12803o;
        z.i(str3);
        j1 j1Var = this.f12695o;
        try {
            return (List) j1Var.m().p(new CallableC2246l0(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            j1Var.j().f12472f.f(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // p082t2.G
    public final List u3(String str, String str2, boolean z3, o1 o1Var) {
        R1(o1Var);
        String str3 = o1Var.f12803o;
        z.i(str3);
        j1 j1Var = this.f12695o;
        try {
            List<l1> list = (List) j1Var.m().p(new CallableC2246l0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (l1 l1Var : list) {
                if (z3 || !n1.o0(l1Var.f12763c)) {
                    arrayList.add(new k1(l1Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            L lJ = j1Var.j();
            lJ.f12472f.h("Failed to query user properties. appId", L.q(str3), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            L lJ2 = j1Var.j();
            lJ2.f12472f.h("Failed to query user properties. appId", L.q(str3), e);
            return Collections.emptyList();
        }
    }

    @Override // p082t2.G
    public final void z0(o1 o1Var) {
        z.e(o1Var.f12803o);
        i0(o1Var.f12803o, false);
        c0(new RunnableC2242j0(this, o1Var, 1));
    }

    @Override // p082t2.G
    /* JADX INFO: renamed from: U */
    public final void mo6719U(Bundle bundle, o1 o1Var) {
        R1(o1Var);
        String str = o1Var.f12803o;
        z.i(str);
        d dVar = new d(6);
        dVar.p = this;
        dVar.q = str;
        dVar.f124r = bundle;
        c0(dVar);
    }
}
