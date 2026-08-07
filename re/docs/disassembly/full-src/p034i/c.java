package p034i;

import B.b;
import Q3.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f11531o = new Object();
    public final ExecutorService p = Executors.newFixedThreadPool(4, new b());
    public volatile Handler q;

    public static Handler f0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
