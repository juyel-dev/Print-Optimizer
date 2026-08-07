package p108z;

import N.h;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(final int i5, Handler handler) {
        getHandler(handler).post(new Runnable() { // from class: z.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f16020o.onFontRetrievalFailed(i5);
            }
        });
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new h(15, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i5);

    public abstract void onFontRetrieved(Typeface typeface);
}
