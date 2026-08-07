package p105y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1225id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15967a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15968b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15969c;

    public y(Context context) {
        this.f15969c = context;
    }

    public final void a() {
        C1693t7 c1693t7 = AbstractC1869x7.Z8;
        C2366q c2366q = C2366q.f13480d;
        if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue()) {
            F f5 = k.f13311A.f13314c;
            HashMap mapG = F.G((String) c2366q.f13483c.a(AbstractC1869x7.d9));
            for (String str : mapG.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f15967a.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f15969c) : this.f15969c.getSharedPreferences(str, 0);
                            SharedPreferencesOnSharedPreferenceChangeListenerC1225id sharedPreferencesOnSharedPreferenceChangeListenerC1225id = new SharedPreferencesOnSharedPreferenceChangeListenerC1225id(2, this, str);
                            this.f15967a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC1225id);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1225id);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            x xVar = new x(mapG);
            synchronized (this) {
                this.f15968b.add(xVar);
            }
        }
    }
}
