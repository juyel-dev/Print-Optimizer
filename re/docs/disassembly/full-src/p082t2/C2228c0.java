package p082t2;

/* JADX INFO: renamed from: t2.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2228c0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2226b0 f12618b;

    public C2228c0(C2226b0 c2226b0, String str) {
        this.f12618b = c2226b0;
        this.f12617a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f12618b.j().f12472f.f(th, this.f12617a);
    }
}
