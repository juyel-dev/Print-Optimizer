package p102x3;

import O3.f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Be implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13826o;

    public Be(int i5) {
        this.f13826o = i5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(186924643, iIntValue, -1, "com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:359)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(this.f13826o, composer, 0), "Print Preview Image", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
