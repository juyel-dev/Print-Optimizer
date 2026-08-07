package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2535k {
    public static final void a(C2503i c2503i, boolean z3, a onClick, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1969549383);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(c2503i) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969549383, i6, -1, "com.notescrafter.ui.screens.CategoryChipItem (CategoryChipItem.kt:32)");
            }
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(BackgroundKt.background$default(b.g(modifier, 8), z3 ? Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null) : new SolidColor(p107y3.a.g, null), null, 0.0f, 6, null), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(4), Dp.m6403constructorimpl(12));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            FontWeight medium = FontWeight.Companion.getMedium();
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall();
            long jM3964getWhite0d7_KjU = z3 ? Color.Companion.m3964getWhite0d7_KjU() : p107y3.a.p;
            int iM6292getCentere0LSkKk = TextAlign.Companion.m6292getCentere0LSkKk();
            int iM6342getEllipsisgIe3tQ8 = TextOverflow.Companion.m6342getEllipsisgIe3tQ8();
            long sp = TextUnitKt.getSp(11);
            TextAlign textAlignM6285boximpl = TextAlign.m6285boximpl(iM6292getCentere0LSkKk);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(c2503i.f15168b, (Modifier) null, jM3964getWhite0d7_KjU, sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, textAlignM6285boximpl, 0L, iM6342getEllipsisgIe3tQ8, false, 1, 0, (c) null, bodySmall, composer2, 199680, 3120, 54738);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2519j(c2503i, z3, onClick, modifier, i5, 0));
        }
    }
}
