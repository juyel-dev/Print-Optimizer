package p015d;

import V3.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.o;
import p010c.G;
import p010c.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f10950a = CompositionLocalKt.compositionLocalOf$default(null, d.f10940r, 1, null);

    public static G a(Composer composer) {
        composer.startReplaceableGroup(-2068013981);
        G g = (G) composer.consume(f10950a);
        composer.startReplaceableGroup(1680121597);
        if (g == null) {
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            o.f(view, "<this>");
            g = (G) l.D(l.G(l.E(view, I.p), I.q));
        }
        composer.endReplaceableGroup();
        if (g == null) {
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof G) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            g = (G) baseContext;
        }
        composer.endReplaceableGroup();
        return g;
    }
}
