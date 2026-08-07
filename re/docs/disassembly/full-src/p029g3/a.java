package p029g3;

import O2.b;
import O2.c;
import O2.d;
import P2.e;
import P2.r;
import P2.t;
import X3.U;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {
    public static final a p = new a(0);
    public static final a q = new a(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11249r = new a(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f11250s = new a(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11251o;

    public /* synthetic */ a(int i5) {
        this.f11251o = i5;
    }

    @Override // P2.e
    public final Object a(t tVar) {
        switch (this.f11251o) {
            case 0:
                Object objF = tVar.f(new r(O2.a.class, Executor.class));
                o.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new U((Executor) objF);
            case 1:
                Object objF2 = tVar.f(new r(c.class, Executor.class));
                o.e(objF2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new U((Executor) objF2);
            case 2:
                Object objF3 = tVar.f(new r(b.class, Executor.class));
                o.e(objF3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new U((Executor) objF3);
            default:
                Object objF4 = tVar.f(new r(d.class, Executor.class));
                o.e(objF4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new U((Executor) objF4);
        }
    }
}
