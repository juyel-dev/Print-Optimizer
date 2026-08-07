package p060n3;

import com.google.android.gms.internal.measurement.C2117x;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f11951b;

    public t(Method method) {
        this.f11951b = method;
    }

    @Override // p060n3.v
    public final Object a(Class cls) {
        String strD = C2117x.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f11951b.invoke(null, cls, Object.class);
    }
}
