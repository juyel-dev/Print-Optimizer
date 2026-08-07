package p033h3;

import V2.a;
import W2.g;
import java.util.HashMap;
import p036i2.e;
import p037i3.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11483a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        a aVar = g.f1709a;
        map.put(o.class, C2161c.f11464a);
        map2.remove(o.class);
        map.put(p037i3.e.class, C2160b.f11462a);
        map2.remove(p037i3.e.class);
        map.put(d.class, C2159a.f11449a);
        map2.remove(d.class);
        f11483a = new e(new HashMap(map), new HashMap(map2), aVar, 10);
    }
}
