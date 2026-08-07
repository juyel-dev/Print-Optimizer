package p090v1;

import Q1.f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC1125g8;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.R7;
import com.google.android.gms.internal.ads.S6;
import p013c2.e;

/* JADX INFO: renamed from: v1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2360n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f13473a;

    static {
        P o5 = null;
        try {
            Object objNewInstance = C2358m.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    o5 = iInterfaceQueryLocalInterface instanceof P ? (P) iInterfaceQueryLocalInterface : new O(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 0);
                }
            } else {
                AbstractC1223ib.s("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            AbstractC1223ib.s("Failed to instantiate ClientApi class.");
        }
        f13473a = o5;
    }

    public abstract Object a();

    public abstract Object b(P p);

    public abstract Object c();

    public final Object d(Context context, boolean z3) {
        boolean z4;
        Object objC;
        Object objB;
        if (!z3) {
            C0743Hd c0743Hd = C2362o.f13474f.f13475a;
            if (f.f969b.c(context, 12451000) != 0) {
                AbstractC1223ib.m("Google Play Services is not available.");
                z3 = true;
            }
        }
        boolean z5 = false;
        boolean z6 = !(e.a(context, ModuleDescriptor.MODULE_ID) <= e.d(context, ModuleDescriptor.MODULE_ID, false));
        AbstractC1869x7.a(context);
        if (((Boolean) R7.f5515a.p()).booleanValue()) {
            z4 = false;
        } else if (((Boolean) R7.f5516b.p()).booleanValue()) {
            z4 = true;
            z5 = true;
        } else {
            z5 = z3 | z6;
            z4 = false;
        }
        P p = f13473a;
        Object objB2 = null;
        if (z5) {
            if (p != null) {
                try {
                    objB = b(p);
                } catch (RemoteException e) {
                    AbstractC1223ib.t("Cannot invoke local loader using ClientApi class.", e);
                    objB = null;
                }
                if (objB == null && !z4) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e3) {
                        AbstractC1223ib.t("Cannot invoke remote loader.", e3);
                    }
                    objB = objB2;
                }
            } else {
                AbstractC1223ib.s("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e5) {
                AbstractC1223ib.t("Cannot invoke remote loader.", e5);
                objC = null;
            }
            if (objC == null) {
                int iIntValue = ((Long) AbstractC1125g8.f7416a.p()).intValue();
                C2362o c2362o = C2362o.f13474f;
                if (c2362o.e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c2362o.f13478d.f5227o;
                    C0743Hd c0743Hd2 = c2362o.f13475a;
                    c0743Hd2.getClass();
                    C0743Hd.k(context, str, bundle, new S6(c0743Hd2));
                }
            }
            if (objC == null) {
                if (p != null) {
                    try {
                        objB2 = b(p);
                    } catch (RemoteException e6) {
                        AbstractC1223ib.t("Cannot invoke local loader using ClientApi class.", e6);
                    }
                } else {
                    AbstractC1223ib.s("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
