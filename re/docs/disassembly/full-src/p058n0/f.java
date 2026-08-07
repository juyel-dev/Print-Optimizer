package p058n0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
