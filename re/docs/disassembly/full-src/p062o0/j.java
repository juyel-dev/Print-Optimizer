package p062o0;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import p080t0.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f12087a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f12089c;

    public j(g gVar) {
        this.f12088b = gVar;
    }

    public final f a() {
        this.f12088b.a();
        if (!this.f12087a.compareAndSet(false, true)) {
            String strB = b();
            g gVar = this.f12088b;
            gVar.a();
            gVar.b();
            return new f(((SQLiteDatabase) gVar.f12077c.l().p).compileStatement(strB));
        }
        if (this.f12089c == null) {
            String strB2 = b();
            g gVar2 = this.f12088b;
            gVar2.a();
            gVar2.b();
            this.f12089c = new f(((SQLiteDatabase) gVar2.f12077c.l().p).compileStatement(strB2));
        }
        return this.f12089c;
    }

    public abstract String b();

    public final void c(f fVar) {
        if (fVar == this.f12089c) {
            this.f12087a.set(false);
        }
    }
}
