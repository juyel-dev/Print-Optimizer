package p030h;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.notescrafter.app.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import p047l.AbstractC2190v;
import p047l.C2189u;
import p052m.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f11416d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f11417a = new WeakHashMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f11418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11419c;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public static synchronized b a() {
        try {
            if (f11416d == null) {
                f11416d = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11416d;
    }

    public final synchronized Drawable b(Context context, long j5) {
        Object obj;
        C2189u c2189u = (C2189u) this.f11417a.get(context);
        if (c2189u == null) {
            return null;
        }
        int iB = a.b(c2189u.p, c2189u.f11804r, j5);
        if (iB < 0 || (obj = c2189u.q[iB]) == AbstractC2190v.f11805a) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2189u.c(j5);
        }
        return null;
    }

    public final synchronized Drawable c(Context context, int i5) {
        return d(context, i5);
    }

    public final synchronized Drawable d(Context context, int i5) {
        Drawable drawableB;
        if (!this.f11419c) {
            this.f11419c = true;
            Drawable drawableC = c(context, R.drawable.abc_vector_test);
            if (drawableC == null || (!(drawableC instanceof p094w0.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                this.f11419c = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        if (this.f11418b == null) {
            this.f11418b = new TypedValue();
        }
        TypedValue typedValue = this.f11418b;
        context.getResources().getValue(i5, typedValue, true);
        drawableB = b(context, (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data));
        if (drawableB == null) {
            drawableB = null;
        }
        if (drawableB == null) {
            drawableB = context.getDrawable(i5);
        }
        if (drawableB != null) {
            synchronized (this) {
            }
        }
        if (drawableB != null) {
            int[] iArr = a.f11414a;
            String name = drawableB.getClass().getName();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29 && i6 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                int[] state = drawableB.getState();
                if (state == null || state.length == 0) {
                    drawableB.setState(a.f11414a);
                } else {
                    drawableB.setState(a.f11415b);
                }
                drawableB.setState(state);
            }
        }
        return drawableB;
    }
}
