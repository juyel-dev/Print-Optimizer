package p074r0;

import android.os.Bundle;
import androidx.lifecycle.C0672k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import p038j.b;
import p038j.c;
import p038j.f;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f12323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12324d;
    public a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12321a = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12325f = true;

    public final Bundle a(String key) {
        o.f(key, "key");
        if (!this.f12324d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f12323c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f12323c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f12323c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f12323c = null;
        }
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f12321a.iterator();
        do {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            o.e(components, "components");
            str = (String) components.getKey();
            dVar = (d) components.getValue();
        } while (!o.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d provider) {
        Object obj;
        o.f(provider, "provider");
        f fVar = this.f12321a;
        c cVarC = fVar.c(str);
        if (cVarC != null) {
            obj = cVarC.p;
        } else {
            c cVar = new c(str, provider);
            fVar.f11560r++;
            c cVar2 = fVar.p;
            if (cVar2 == null) {
                fVar.f11559o = cVar;
                fVar.p = cVar;
            } else {
                cVar2.q = cVar;
                cVar.f11557r = cVar2;
                fVar.p = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f12325f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.e = aVar;
        try {
            C0672k.class.getDeclaredConstructor(null);
            a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.f12319a.add(C0672k.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0672k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
