package p063o1;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.HashMap;
import p007b1.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f12090a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f12091b;

    static {
        HashMap map = new HashMap();
        f12091b = map;
        map.put(d.f2408o, 0);
        map.put(d.p, 1);
        map.put(d.q, 2);
        for (d dVar : map.keySet()) {
            f12090a.append(((Integer) f12091b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f12091b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i5) {
        d dVar = (d) f12090a.get(i5);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC1421mz.h(i5, "Unknown Priority for value "));
    }
}
