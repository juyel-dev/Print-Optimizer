package p002a1;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f1945o;

    public b(c cVar) {
        this.f1945o = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d4) {
        o.f(d4, "d");
        c cVar = this.f1945o;
        cVar.p.setValue(Integer.valueOf(((Number) cVar.p.getValue()).intValue() + 1));
        cVar.q.setValue(Size.m3743boximpl(e.a(cVar.f1946o)));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [B3.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d4, Runnable what, long j5) {
        o.f(d4, "d");
        o.f(what, "what");
        ((Handler) e.f1949a.getValue()).postAtTime(what, j5);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [B3.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d4, Runnable what) {
        o.f(d4, "d");
        o.f(what, "what");
        ((Handler) e.f1949a.getValue()).removeCallbacks(what);
    }
}
