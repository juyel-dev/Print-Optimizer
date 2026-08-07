package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2773ye implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f15792o;

    public C2773ye(float f5) {
        this.f15792o = f5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286120252, iIntValue, -1, "com.notescrafter.ui.screens.SuccessScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuccessScreen.kt:288)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment centerStart = companion.getCenterStart();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(491666281);
            final float f5 = this.f15792o;
            boolean zChanged = composer.changed(f5);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: x3.xe
                    @Override // O3.a
                    public final Object invoke() {
                        return Float.valueOf(f5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null), 0.3f);
            Color.Companion companion4 = Color.Companion;
            ProgressIndicatorKt.m2104LinearProgressIndicatorGJbTh5U((a) objRememberedValue, modifierAlpha, companion4.m3964getWhite0d7_KjU(), companion4.m3962getTransparent0d7_KjU(), 0, 0.0f, null, composer, 3504, 112);
            TextKt.m2432Text4IGK_g(p035i0.a.k("Downloading ", (int) (f5 * 100), "%"), boxScopeInstance.align(companion2, companion.getCenter()), companion4.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 384, 0, 131064);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
