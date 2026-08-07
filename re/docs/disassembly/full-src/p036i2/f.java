package p036i2;

import J1.a;
import K1.b;
import R1.e;
import S1.l;
import Y2.d;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C0789Pb;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends R1.f implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0789Pb f11538A = new C0789Pb("AppSet.API", new b(4), new d(7));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f11539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Q1.f f11540z;

    public f(Context context, Q1.f fVar) {
        super(context, null, f11538A, R1.b.f1067a, e.f1069c);
        this.f11539y = context;
        this.f11540z = fVar;
    }

    @Override // J1.a
    public final o b() {
        if (this.f11540z.c(this.f11539y, 212800000) != 0) {
            return p000a.a.n(new R1.d(new Status(17, null, null, null)));
        }
        l lVarB = l.b();
        lVarB.f1170a = new Q1.d[]{J1.d.f585a};
        lVarB.f1173d = new d(this);
        lVarB.f1171b = false;
        lVarB.f1172c = 27601;
        return c(0, lVarB.a());
    }
}
