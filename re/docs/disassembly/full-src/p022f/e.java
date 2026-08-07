package p022f;

import K2.b;
import Q3.a;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import p010c.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11126d;
    public final /* synthetic */ a e;

    public e(k kVar, String str, a aVar) {
        this.f11125c = kVar;
        this.f11126d = str;
        this.e = aVar;
    }

    public final void J(Object obj) {
        k kVar = this.f11125c;
        LinkedHashMap linkedHashMap = kVar.f2499b;
        String str = this.f11126d;
        Object obj2 = linkedHashMap.get(str);
        a aVar = this.e;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = kVar.f2501d;
        arrayList.add(str);
        try {
            kVar.b(iIntValue, aVar, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void K() {
        Object parcelable;
        Integer num;
        k kVar = this.f11125c;
        kVar.getClass();
        String key = this.f11126d;
        o.f(key, "key");
        if (!kVar.f2501d.contains(key) && (num = (Integer) kVar.f2499b.remove(key)) != null) {
            kVar.f2498a.remove(num);
        }
        kVar.e.remove(key);
        LinkedHashMap linkedHashMap = kVar.f2502f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbK = AbstractC1421mz.k("Dropping pending result for request ", key, ": ");
            sbK.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbK.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = kVar.g;
        if (bundle.containsKey(key)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = C.b.a(key, bundle);
            } else {
                parcelable = bundle.getParcelable(key);
                if (!a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) parcelable));
            bundle.remove(key);
        }
        if (kVar.f2500c.get(key) != null) {
            throw new ClassCastException();
        }
    }
}
