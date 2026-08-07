package p080t0;

import android.content.Context;
import com.google.android.gms.internal.measurement.C;
import java.io.File;
import p077s0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f12374o;
    public final String p;
    public final C q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f12375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12376s = new Object();
    public d t;
    public boolean u;

    public e(Context context, String str, C c5, boolean z3) {
        this.f12374o = context;
        this.p = str;
        this.q = c5;
        this.f12375r = z3;
    }

    public final d c() {
        d dVar;
        synchronized (this.f12376s) {
            try {
                if (this.t == null) {
                    b[] bVarArr = new b[1];
                    if (this.p == null || !this.f12375r) {
                        this.t = new d(this.f12374o, this.p, bVarArr, this.q);
                    } else {
                        this.t = new d(this.f12374o, new File(this.f12374o.getNoBackupFilesDir(), this.p).getAbsolutePath(), bVarArr, this.q);
                    }
                    this.t.setWriteAheadLoggingEnabled(this.u);
                }
                dVar = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c().close();
    }

    @Override // p077s0.b
    public final b l() {
        return c().g();
    }

    @Override // p077s0.b
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        synchronized (this.f12376s) {
            try {
                d dVar = this.t;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z3);
                }
                this.u = z3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
