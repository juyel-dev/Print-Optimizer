package p003a2;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1955b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1956a;

    static {
        c cVar = new c();
        cVar.f1956a = null;
        f1955b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f1955b;
        synchronized (cVar) {
            try {
                if (cVar.f1956a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f1956a = new b(context);
                }
                bVar = cVar.f1956a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
