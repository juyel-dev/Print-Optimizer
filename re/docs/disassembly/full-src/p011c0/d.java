package p011c0;

import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import java.util.Arrays;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.o;
import p111z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f2533a;

    public d(f... initializers) {
        o.f(initializers, "initializers");
        this.f2533a = initializers;
    }

    @Override // androidx.lifecycle.Z
    public final X b(Class cls, e eVar) {
        f fVar;
        C2167f c2167fA = F.a(cls);
        f[] fVarArr = this.f2533a;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        o.f(initializers, "initializers");
        int length = initializers.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i5];
            if (fVar.f2534a.equals(c2167fA)) {
                break;
            }
            i5++;
        }
        X x4 = fVar != null ? (X) fVar.f2535b.invoke(eVar) : null;
        if (x4 != null) {
            return x4;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + b.l(c2167fA)).toString());
    }
}
