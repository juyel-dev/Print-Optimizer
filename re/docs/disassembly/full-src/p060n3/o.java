package p060n3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f11945b;

    public o(Method method) {
        this.f11945b = method;
    }

    @Override // p060n3.q
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f11945b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
