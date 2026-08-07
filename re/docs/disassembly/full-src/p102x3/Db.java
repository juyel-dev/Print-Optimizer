package p102x3;

import O3.a;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Db implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f13874o;

    public Db(MutableState mutableState) {
        this.f13874o = mutableState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1939018986, iIntValue, -1, "com.notescrafter.ui.screens.NcfGallerySlider.<anonymous> (PrintLandingScreen.kt:1741)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.Companion;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(-948647094);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            Object empty = companion3.getEmpty();
            MutableState mutableState = this.f13874o;
            if (objRememberedValue == empty) {
                objRememberedValue = new O6(29, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue, 7, null);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor = companion5.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CardKt.Card(b.g(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth(companion, 0.9f), 0.8f, false, 2, null), 16), null, CardDefaults.INSTANCE.m1540cardColorsro_MJ88(companion2.m3962getTransparent0d7_KjU(), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), ComposableLambdaKt.rememberComposableLambda(-1556300830, true, new Cb(mutableState), composer, 54), composer, 221184, 10);
            composer.startReplaceGroup(-998189079);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Bb(0, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((a) objRememberedValue2, BackgroundKt.m206backgroundbw27NRU(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance.align(companion, companion4.getTopEnd()), 0.0f, Dp.m6403constructorimpl(40), Dp.m6403constructorimpl(24), 0.0f, 9, null), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, AbstractC2745x2.f15706c, composer, 196614, 28);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
