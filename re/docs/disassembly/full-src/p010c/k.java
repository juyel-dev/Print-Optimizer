package p010c;

import C3.C0121a;
import V3.h;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import p022f.a;
import p022f.c;
import p022f.d;
import p022f.e;
import p022f.g;
import p098x.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2498a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2499b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2500c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2501d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2502f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f2503h;

    public k(m mVar) {
        this.f2503h = mVar;
    }

    public final boolean a(int i5, int i6, Intent intent) {
        String str = (String) this.f2498a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.e.get(str);
        if ((cVar != null ? cVar.f11122a : null) != null) {
            ArrayList arrayList = this.f2501d;
            if (arrayList.contains(str)) {
                cVar.f11122a.d(cVar.f11123b.K(i6, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f2502f.remove(str);
        this.g.putParcelable(str, new a(i6, intent));
        return true;
    }

    public final void b(int i5, Q3.a aVar, Object obj) {
        Bundle bundle;
        m mVar = this.f2503h;
        p042j3.c cVarC = aVar.C(mVar, obj);
        if (cVarC != null) {
            new Handler(Looper.getMainLooper()).post(new j(i5, 0, this, cVarC));
            return;
        }
        Intent intentY = aVar.y(mVar, obj);
        if (intentY.getExtras() != null) {
            Bundle extras = intentY.getExtras();
            o.c(extras);
            if (extras.getClassLoader() == null) {
                intentY.setExtrasClassLoader(mVar.getClassLoader());
            }
        }
        if (intentY.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentY.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentY.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentY.getAction())) {
            String[] stringArrayExtra = intentY.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            b.c(mVar, stringArrayExtra, i5);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentY.getAction())) {
            mVar.startActivityForResult(intentY, i5, bundle);
            return;
        }
        g gVar = (g) intentY.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            o.c(gVar);
            mVar.startIntentSenderForResult(gVar.f11127o, i5, gVar.p, gVar.q, gVar.f11128r, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new j(i5, 1, this, e));
        }
    }

    public final e c(String key, Q3.a aVar, p022f.b bVar) {
        Object parcelable;
        Number number;
        int iIntValue;
        LinkedHashMap linkedHashMap;
        o.f(key, "key");
        LinkedHashMap linkedHashMap2 = this.f2499b;
        if (((Integer) linkedHashMap2.get(key)) == null) {
            d dVar = d.f11124o;
            Iterator it = new V3.a(new h(dVar, new C0121a(dVar))).iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number = (Number) it.next();
                iIntValue = number.intValue();
                linkedHashMap = this.f2498a;
            } while (linkedHashMap.containsKey(Integer.valueOf(iIntValue)));
            int iIntValue2 = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue2), key);
            linkedHashMap2.put(key, Integer.valueOf(iIntValue2));
        }
        this.e.put(key, new c(bVar, aVar));
        LinkedHashMap linkedHashMap3 = this.f2502f;
        if (linkedHashMap3.containsKey(key)) {
            Object obj = linkedHashMap3.get(key);
            linkedHashMap3.remove(key);
            bVar.d(obj);
        }
        int i5 = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i5 >= 34) {
            parcelable = C.b.a(key, bundle);
        } else {
            parcelable = bundle.getParcelable(key);
            if (!a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        a aVar2 = (a) parcelable;
        if (aVar2 != null) {
            bundle.remove(key);
            bVar.d(aVar.K(aVar2.f11121o, aVar2.p));
        }
        return new e(this, key, aVar);
    }
}
