package p060n3;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f11946a;

    static {
        q oVar;
        if (g.f11928a >= 9) {
            try {
                oVar = new o(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (oVar == null) {
            oVar = new p();
        }
        f11946a = oVar;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
