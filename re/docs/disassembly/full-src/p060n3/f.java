package p060n3;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p051l3.d;
import p051l3.p;
import p051l3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements q, Cloneable {
    public static final f q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f11927o;
    public List p;

    static {
        f fVar = new f();
        fVar.f11927o = Collections.emptyList();
        fVar.p = Collections.emptyList();
        q = fVar;
    }

    public static boolean c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        boolean z3;
        boolean z4;
        boolean zC = c(typeToken.getRawType());
        if (zC) {
            z3 = true;
        } else {
            b(true);
            z3 = false;
        }
        if (zC) {
            z4 = true;
        } else {
            b(false);
            z4 = false;
        }
        if (z3 || z4) {
            return new e(this, z4, z3, dVar, typeToken);
        }
        return null;
    }

    public final void b(boolean z3) {
        Iterator it = (z3 ? this.f11927o : this.p).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
