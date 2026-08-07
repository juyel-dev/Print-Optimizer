package p084u0;

import A2.t;
import K2.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.notescrafter.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f13279d;
    public static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13282c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f13281b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13280a = new HashMap();

    public a(Context context) {
        this.f13282c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f13279d == null) {
            synchronized (e) {
                try {
                    if (f13279d == null) {
                        f13279d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13279d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f13282c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f13281b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new t(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (b.q()) {
            try {
                b.c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f13280a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f13282c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new t(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
