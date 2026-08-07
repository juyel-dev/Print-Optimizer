package p097w3;

import C3.v;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f13630o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ ImageVector q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13631r;

    public p(boolean z3, boolean z4, ImageVector imageVector, String str) {
        this.f13630o = z3;
        this.p = z4;
        this.q = imageVector;
        this.f13631r = str;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Brush brushM3876horizontalGradient8A3gB4$default;
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348999213, iIntValue, -1, "com.notescrafter.ui.components.GradientButton.<anonymous> (GradientButton.kt:47)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean z3 = this.f13630o;
            if (z3) {
                brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null);
            } else {
                Brush.Companion companion2 = Brush.Companion;
                Color.Companion companion3 = Color.Companion;
                brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(companion3.m3957getGray0d7_KjU()), Color.m3917boximpl(companion3.m3957getGray0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null);
            }
            Modifier modifierThen = BackgroundKt.background$default(modifierFillMaxSize$default, brushM3876horizontalGradient8A3gB4$default, null, 0.0f, 6, null).then(!z3 ? BackgroundKt.m207backgroundbw27NRU$default(companion, Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null) : companion);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            O3.a constructor = companion5.getConstructor();
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
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion4.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            O3.a constructor2 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (this.p) {
                composer.startReplaceGroup(360493642);
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), Color.Companion.m3964getWhite0d7_KjU(), Dp.m6403constructorimpl(2), 0L, 0, composer, 438, 24);
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(12)), composer, 6);
                composer.endReplaceGroup();
            } else {
                ImageVector imageVector = this.q;
                if (imageVector != null) {
                    composer.startReplaceGroup(360809966);
                    IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), Color.Companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(8)), composer, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(361119408);
                    composer.endReplaceGroup();
                }
            }
            TextKt.m2432Text4IGK_g(this.f13631r, (Modifier) null, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), z3 ? 1.0f : 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 199680, 0, 131026);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
