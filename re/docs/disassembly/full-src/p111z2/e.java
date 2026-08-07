package p111z2;

import A2.c;
import O1.i;
import com.google.android.gms.internal.measurement.C;
import p003a2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f16093o;

    public e(c cVar) {
        this.f16093o = cVar;
    }

    @Override // A2.c
    /* JADX INFO: renamed from: a */
    public Object mo6685a() {
        d dVar = (d) this.f16093o.mo6685a();
        if (dVar != null) {
            return dVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ e(b bVar) {
        A.e eVar = new A.e(bVar, 29);
        this.f16093o = A2.b.b(new e(A2.b.b(new p036i2.e(A2.b.b(new C(8, eVar, A2.b.b(new i(eVar, 27)))), A2.b.b(new A.e(eVar, 28)), eVar, 29))));
    }
}
