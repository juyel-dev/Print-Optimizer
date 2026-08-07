package p058n0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11906o;
    public final /* synthetic */ Context p;

    public /* synthetic */ d(Context context, int i5) {
        this.f11906o = i5;
        this.p = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f11906o) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new d(this.p, 1));
                break;
            default:
                c.s(this.p, new I.d(0), c.f11898a, false);
                break;
        }
    }
}
