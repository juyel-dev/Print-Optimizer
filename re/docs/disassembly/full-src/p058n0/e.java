package p058n0;

import android.view.Choreographer;
import androidx.compose.ui.text.input.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new a(runnable, 1));
    }
}
