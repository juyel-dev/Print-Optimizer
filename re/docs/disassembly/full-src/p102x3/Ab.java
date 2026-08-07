package p102x3;

import O3.a;
import O3.c;
import O3.g;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ab implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f13778o;
    public final /* synthetic */ PagerState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13780s;

    public Ab(List list, PagerState pagerState, MutableState mutableState, List list2, MutableState mutableState2) {
        this.f13778o = list;
        this.p = pagerState;
        this.q = mutableState;
        this.f13779r = list2;
        this.f13780s = mutableState2;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Modifier modifierM242clickableXHw0xAI$default;
        PagerScope HorizontalPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803237584, iIntValue2, -1, "com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous> (PrintLandingScreen.kt:1502)");
        }
        composer.startReplaceGroup(-998586170);
        List list = this.f13778o;
        if (iIntValue > 0) {
            int iIntValue3 = ((Number) list.get(iIntValue - 1)).intValue();
            Modifier.Companion companion = Modifier.Companion;
            composer.startReplaceGroup(-998583254);
            boolean zChanged = composer.changed(iIntValue3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2754xb(iIntValue3, 0, this.q);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue, 7, null);
        } else {
            modifierM242clickableXHw0xAI$default = Modifier.Companion;
        }
        composer.endReplaceGroup();
        Modifier modifierAspectRatio$default = iIntValue == 0 ? AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.7777778f, false, 2, null) : AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.8f, false, 2, null);
        composer.startReplaceGroup(-998567530);
        PagerState pagerState = this.p;
        boolean zChanged2 = composer.changed(pagerState) | ((((iIntValue2 & 112) ^ 48) > 32 && composer.changed(iIntValue)) || (iIntValue2 & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new C2770yb(pagerState, iIntValue, 0);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CardKt.Card(GraphicsLayerModifierKt.graphicsLayer(modifierAspectRatio$default, (c) objRememberedValue2).then(modifierM242clickableXHw0xAI$default), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16)), CardDefaults.INSTANCE.m1540cardColorsro_MJ88(p107y3.a.u, 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), ComposableLambdaKt.rememberComposableLambda(758091842, true, new C2786zb(iIntValue, this.f13779r, list, this.f13780s, this.q), composer, 54), composer, 221184, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
