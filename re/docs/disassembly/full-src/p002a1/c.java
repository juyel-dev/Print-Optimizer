package p002a1;

import A2.t;
import B3.l;
import I.j;
import Q3.a;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.o;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f1946o;
    public final MutableState p;
    public final MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f1947r;

    public c(Drawable drawable) {
        o.f(drawable, "drawable");
        this.f1946o = drawable;
        this.p = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.q = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3743boximpl(e.a(drawable)), null, 2, null);
        this.f1947r = g.o(new j(this, 4));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f5) {
        this.f1946o.setAlpha(a.r(a.Q(f5 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f1946o.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        o.f(layoutDirection, "layoutDirection");
        int i5 = a.f1944a[layoutDirection.ordinal()];
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 2) {
            throw new t();
        }
        return this.f1946o.setLayoutDirection(i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1getIntrinsicSizeNHjbRc() {
        return ((Size) this.q.getValue()).m3760unboximpl();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        o.f(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        ((Number) this.p.getValue()).intValue();
        int iQ = a.Q(Size.m3755getWidthimpl(drawScope.mo4477getSizeNHjbRc()));
        int iQ2 = a.Q(Size.m3752getHeightimpl(drawScope.mo4477getSizeNHjbRc()));
        Drawable drawable = this.f1946o;
        drawable.setBounds(0, 0, iQ, iQ2);
        try {
            canvas.save();
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Drawable drawable = this.f1946o;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.f1947r.getValue();
        Drawable drawable = this.f1946o;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
