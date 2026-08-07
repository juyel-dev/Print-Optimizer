package p023f0;

import O1.d;
import W.G;
import androidx.lifecycle.X;
import com.google.android.gms.internal.ads.C1730u0;
import p047l.Z;

/* JADX INFO: loaded from: classes2.dex */
public class b extends X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f11132d = new G(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f11133b = new Z(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11134c = false;

    @Override // androidx.lifecycle.X
    public final void d() {
        Z z3 = this.f11133b;
        int i5 = z3.q;
        for (int i6 = 0; i6 < i5; i6++) {
            a aVar = (a) z3.p[i6];
            d dVar = aVar.f11129l;
            dVar.a();
            dVar.f802c = true;
            C1730u0 c1730u0 = aVar.f11131n;
            if (c1730u0 != null) {
                aVar.h(c1730u0);
            }
            a aVar2 = dVar.f800a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f800a = null;
            if (c1730u0 != null) {
                boolean z4 = c1730u0.p;
            }
            dVar.f803d = true;
            dVar.f801b = false;
            dVar.f802c = false;
            dVar.e = false;
        }
        int i7 = z3.q;
        Object[] objArr = z3.p;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        z3.q = 0;
    }
}
