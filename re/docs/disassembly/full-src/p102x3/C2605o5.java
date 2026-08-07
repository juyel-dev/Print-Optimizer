package p102x3;

import O3.g;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2605o5 implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f15368o;

    public C2605o5(List list) {
        this.f15368o = list;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerScope HorizontalPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-230570411, iIntValue2, -1, "com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:176)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(((Number) this.f15368o.get(iIntValue)).intValue(), composer, 0), "Prints Gallery Image", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 25008, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
