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
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ce implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PagerState f13852o;
    public final /* synthetic */ MutableState p;

    public Ce(PagerState pagerState, MutableState mutableState) {
        this.f13852o = pagerState;
        this.p = mutableState;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerScope HorizontalPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2004631153, iIntValue2, -1, "com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:342)");
        }
        int iIntValue3 = ((Number) Ee.f13941a.get(iIntValue)).intValue();
        Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 0.8f, false, 2, null);
        composer.startReplaceGroup(2099073995);
        PagerState pagerState = this.f13852o;
        boolean zChanged = composer.changed(pagerState) | ((((iIntValue2 & 112) ^ 48) > 32 && composer.changed(iIntValue)) || (iIntValue2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new C2770yb(pagerState, iIntValue, 1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierAspectRatio$default, (c) objRememberedValue);
        composer.startReplaceGroup(2099089530);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new Bb(11, this.p);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CardKt.Card(ClickableKt.m242clickableXHw0xAI$default(modifierGraphicsLayer, false, null, null, (a) objRememberedValue2, 7, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(16)), CardDefaults.INSTANCE.m1540cardColorsro_MJ88(p107y3.a.u, 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), ComposableLambdaKt.rememberComposableLambda(186924643, true, new Be(iIntValue3), composer, 54), composer, 221184, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
