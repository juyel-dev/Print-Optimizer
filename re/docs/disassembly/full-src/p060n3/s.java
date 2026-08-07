package p060n3;

import com.google.android.gms.internal.measurement.C2117x;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f11949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11950c;

    public s(int i5, Method method) {
        this.f11949b = method;
        this.f11950c = i5;
    }

    @Override // p060n3.v
    public final Object a(Class cls) {
        String strD = C2117x.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f11949b.invoke(null, cls, Integer.valueOf(this.f11950c));
    }
}
