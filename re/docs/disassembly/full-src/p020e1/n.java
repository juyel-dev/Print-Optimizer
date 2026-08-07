package p020e1;

import V2.a;
import W2.g;
import h1.b;
import h1.d;
import h1.f;
import java.util.HashMap;
import p036i2.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11084a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        a aVar = g.f1709a;
        map.put(n.class, e.f11058a);
        map2.remove(n.class);
        map.put(h1.a.class, a.f11046a);
        map2.remove(h1.a.class);
        map.put(h1.g.class, g.f11062a);
        map2.remove(h1.g.class);
        map.put(h1.e.class, d.f11055a);
        map2.remove(h1.e.class);
        map.put(d.class, c.f11052a);
        map2.remove(d.class);
        map.put(b.class, b.f11050a);
        map2.remove(b.class);
        map.put(f.class, f.f11059a);
        map2.remove(f.class);
        f11084a = new e(new HashMap(map), new HashMap(map2), aVar, 10);
    }
}
