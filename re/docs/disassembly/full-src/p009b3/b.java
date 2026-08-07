package p009b3;

import K2.g;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0789Pb;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2413o;
    public final /* synthetic */ c p;

    public /* synthetic */ b(c cVar, int i5) {
        this.f2413o = i5;
        this.p = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p014c3.b bVarZ;
        p014c3.b bVarG;
        switch (this.f2413o) {
            case 0:
                this.p.a();
                return;
            case 1:
                c cVar = this.p;
                cVar.getClass();
                Object obj = c.f2414m;
                synchronized (obj) {
                    try {
                        g gVar = cVar.f2415a;
                        gVar.a();
                        C0789Pb c0789PbC = C0789Pb.c(gVar.f607a);
                        try {
                            bVarZ = cVar.f2417c.z();
                            if (c0789PbC != null) {
                                c0789PbC.t();
                            }
                        } catch (Throwable th) {
                            if (c0789PbC != null) {
                                c0789PbC.t();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i5 = bVarZ.f2574b;
                    if (i5 == 5) {
                        bVarG = cVar.g(bVarZ);
                    } else {
                        if (i5 == 3) {
                            bVarG = cVar.g(bVarZ);
                        } else if (!cVar.f2418d.a(bVarZ)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarZ);
                        }
                    }
                    synchronized (obj) {
                        try {
                            g gVar2 = cVar.f2415a;
                            gVar2.a();
                            C0789Pb c0789PbC2 = C0789Pb.c(gVar2.f607a);
                            try {
                                cVar.f2417c.w(bVarG);
                                if (c0789PbC2 != null) {
                                    c0789PbC2.t();
                                }
                            } catch (Throwable th3) {
                                if (c0789PbC2 != null) {
                                    c0789PbC2.t();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.f2423k.size() != 0 && !TextUtils.equals(bVarZ.f2573a, bVarG.f2573a)) {
                                Iterator it = cVar.f2423k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (bVarG.f2574b == 4) {
                        String str = bVarG.f2573a;
                        synchronized (cVar) {
                            cVar.f2422j = str;
                        }
                    }
                    int i6 = bVarG.f2574b;
                    if (i6 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i6 == 2 || i6 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e) {
                    cVar.h(e);
                    return;
                }
            default:
                this.p.a();
                return;
        }
    }
}
