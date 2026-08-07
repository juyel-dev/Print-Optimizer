package p002a1;

import B3.f;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1949a;

    static {
        f[] fVarArr = f.f147o;
        f1949a = g.n(d.f1948o);
    }

    public static final long a(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? Size.Companion.m3763getUnspecifiedNHjbRc() : SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
