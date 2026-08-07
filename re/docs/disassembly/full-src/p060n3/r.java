package p060n3;

import com.google.android.gms.internal.measurement.C2117x;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f11947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11948c;

    public r(Method method, Object obj) {
        this.f11947b = method;
        this.f11948c = obj;
    }

    @Override // p060n3.v
    public final Object a(Class cls) {
        String strD = C2117x.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f11947b.invoke(this.f11948c, cls);
    }
}
