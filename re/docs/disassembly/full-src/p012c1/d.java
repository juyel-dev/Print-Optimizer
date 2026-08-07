package p012c1;

import A.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import f1.h;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p017d1.a;
import p017d1.b;
import p017d1.c;
import p017d1.f;
import p017d1.g;
import p017d1.i;
import p017d1.j;
import p017d1.k;
import p017d1.l;
import p017d1.n;
import p017d1.o;
import p017d1.q;
import p017d1.r;
import p017d1.s;
import p017d1.t;
import p017d1.u;
import p017d1.v;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f2545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f2547d;
    public final p046k2.h e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p046k2.h f2548f;
    public final int g;

    public d(Context context, p046k2.h hVar, p046k2.h hVar2) {
        V2.d dVar = new V2.d();
        c cVar = c.f10973a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f10984a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        p017d1.d dVar2 = p017d1.d.f10975a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        b bVar = b.f10962a;
        dVar.a(a.class, bVar);
        dVar.a(p017d1.h.class, bVar);
        p017d1.e eVar = p017d1.e.f10978a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f10990a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f1405d = true;
        this.f2544a = new e(dVar, 5);
        this.f2546c = context;
        this.f2545b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2547d = b(a.f2536c);
        this.e = hVar2;
        this.f2548f = hVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.modifiers.a.y("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final p020e1.i a(p020e1.i iVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f2545b.getActiveNetworkInfo();
        p020e1.h hVarC = iVar.c();
        int i5 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) hVarC.g;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i5));
        hVarC.a("model", Build.MODEL);
        hVarC.a("hardware", Build.HARDWARE);
        hVarC.a("device", Build.DEVICE);
        hVarC.a("product", Build.PRODUCT);
        hVarC.a("os-uild", Build.ID);
        hVarC.a("manufacturer", Build.MANUFACTURER);
        hVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) hVarC.g;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i6 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f11020o;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) hVarC.g;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f11019o;
                subtype = 100;
            } else if (((t) t.f11019o.get(subtype)) == null) {
            }
            map = (HashMap) hVarC.g;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            hVarC.a("country", Locale.getDefault().getCountry());
            hVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f2546c;
            hVarC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                p003a2.a.s("CctTransportBackend", "Unable to find version code for package", e);
            }
            hVarC.a("application_build", Integer.toString(i6));
            return hVarC.b();
        }
        SparseArray sparseArray3 = t.f11019o;
        subtype = 0;
        map = (HashMap) hVarC.g;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        hVarC.a("country", Locale.getDefault().getCountry());
        hVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f2546c;
        hVarC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i6 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        hVarC.a("application_build", Integer.toString(i6));
        return hVarC.b();
    }
}
