package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.FlashOnKt;
import androidx.compose.material.icons.outlined.SecurityKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2294k;
import p097w3.j;

/* JADX INFO: renamed from: x3.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2684t5 {
    public static final void a(ImageVector icon, String str, String str2, Modifier modifier, Composer composer, int i5) {
        int i6;
        o.f(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(693654735);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693654735, i6, -1, "com.notescrafter.ui.screens.BrandFeatureBadge (GlobalHomeScreen.kt:552)");
            }
            j.a(modifier, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(285132682, true, new C2541k5(icon, str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 9) & 14) | 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2509i5(icon, str, str2, modifier, i5, 0));
        }
    }

    public static final void b(a onNavigateToFlow, a onNavigateToPrints, a onNavigateToTools, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Modifier modifier2;
        o.f(onNavigateToFlow, "onNavigateToFlow");
        o.f(onNavigateToPrints, "onNavigateToPrints");
        o.f(onNavigateToTools, "onNavigateToTools");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1908136729);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onNavigateToFlow) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateToPrints) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateToTools) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6 | 3072;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1908136729, i7, -1, "com.notescrafter.ui.screens.GlobalHomeScreen (GlobalHomeScreen.kt:52)");
            }
            float f5 = 16;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(Dp.m6403constructorimpl(80) + WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo618calculateBottomPaddingD9Ej5fM()), 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = 24;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
            float f7 = 8;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i8).getHeadlineLarge();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight extraBold = companion4.getExtraBold();
            long sp = TextUnitKt.getSp(40);
            long sp2 = TextUnitKt.getSp(-0.5d);
            Brush.Companion companion5 = Brush.Companion;
            long j5 = p107y3.a.f15978a;
            TextStyle textStyleM5915copyNs73l9s = headlineLarge.m5915copyNs73l9s(Brush.Companion.m3878linearGradientmHitzGk$default(companion5, v.S(Color.m3917boximpl(j5), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), (33554430 & 2) != 0 ? headlineLarge.spanStyle.getAlpha() : 0.0f, (33554430 & 4) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : sp, (33554430 & 8) != 0 ? headlineLarge.spanStyle.getFontWeight() : extraBold, (33554430 & 16) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (33554430 & 32) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (33554430 & 64) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (33554430 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (33554430 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : sp2, (33554430 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (33554430 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (33554430 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (33554430 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (33554430 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (33554430 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getShadow() : null, (33554430 & Fields.CompositingStrategy) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (33554430 & 65536) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (33554430 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (33554430 & 262144) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (524288 & 33554430) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (33554430 & 1048576) != 0 ? headlineLarge.platformStyle : null, (33554430 & 2097152) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (33554430 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (33554430 & 8388608) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (33554430 & 16777216) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null);
            TextAlign.Companion companion6 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, textStyleM5915copyNs73l9s, composerStartRestartGroup, 6, 0, 65022);
            b.m(f7, companion, composerStartRestartGroup, 6);
            TextStyle titleMedium = materialTheme.getTypography(composerStartRestartGroup, i8).getTitleMedium();
            TextKt.m2432Text4IGK_g("Reimagining the Student Learning Experience", SizeKt.fillMaxWidth(companion, 0.9f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15990o, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 54, 0, 65020);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(32)), composerStartRestartGroup, 6);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composer2 = composerStartRestartGroup;
            c("FLOW", j5, onNavigateToFlow, ComposableLambdaKt.rememberComposableLambda(319849660, true, new C2557l5(onNavigateToFlow), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 << 6) & 896) | 3126);
            c("PRINTS", ColorKt.Color(4279286145L), onNavigateToPrints, ComposableLambdaKt.rememberComposableLambda(-1121408973, true, new C2621p5(onNavigateToPrints), composer2, 54), composer2, ((i7 << 3) & 896) | 3126);
            c("TOOLS", ColorKt.Color(4294286859L), onNavigateToTools, ComposableLambdaKt.rememberComposableLambda(431678388, true, new C2637q5(onNavigateToTools), composer2, 54), composer2, (i7 & 896) | 3126);
            composer2.endNode();
            b.m(36, companion, composer2, 6);
            Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
            a constructor4 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            a(SecurityKt.getSecurity(outlined), "100% Secure", "Processed Locally", RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 432);
            a(FlashOnKt.getFlashOn(outlined), "Lightning Fast", "Offline Capabilities", RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 432);
            if (androidx.compose.foundation.text.modifiers.a.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(onNavigateToFlow, onNavigateToPrints, onNavigateToTools, modifier2, i5));
        }
    }

    public static final void c(String str, long j5, a onClick, ComposableLambda content, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onClick, "onClick");
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2068864324);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(content) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2068864324, i7, -1, "com.notescrafter.ui.screens.ProductContainer (GlobalHomeScreen.kt:337)");
            }
            composerStartRestartGroup.startReplaceGroup(73504549);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            j.a(b.e(16, ScaleKt.scale(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AnimateAsStateKt.animateFloatAsState(PressInteractionKt.collectIsPressedAsState((MutableInteractionSource) objRememberedValue, composerStartRestartGroup, 6).getValue().booleanValue() ? 0.98f : 1.0f, null, 0.0f, "card_scale", null, composerStartRestartGroup, 3072, 22).getValue().floatValue()), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3926copywmQWz5c$default(p107y3.a.f15983h, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, onClick, ComposableLambdaKt.rememberComposableLambda(-194940375, true, new C2652r5(j5, content, str), composerStartRestartGroup, 54), composer2, (57344 & (i7 << 6)) | 196656, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2525j5(str, j5, onClick, content, i5));
        }
    }

    public static final void d(String str, ImageVector imageVector, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1379596191);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379596191, i7, -1, "com.notescrafter.ui.screens.ToolGridItem (GlobalHomeScreen.kt:512)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f5 = 8;
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(36)), f5);
            Color.Companion companion4 = Color.Companion;
            Modifier modifierE = b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(16)), ColorKt.Color(4290807036L), composerStartRestartGroup, ((i7 >> 3) & 14) | 3456 | ((i7 << 3) & 112), 0);
            composerStartRestartGroup.endNode();
            b.m(4, companion3, composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.p, TextUnitKt.getSp(8), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(10), 0, false, 2, 0, (c) null, (TextStyle) null, composerStartRestartGroup, (i7 & 14) | 200064, 3078, 121298);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a(str, imageVector, modifier, i5, 3));
        }
    }

    public static final void e(String str, String str2, String str3, List list, a onClick, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(388403722);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(list) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.Clip : Fields.Shape;
        }
        if ((i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388403722, i6, -1, "com.notescrafter.ui.screens.WebStyleCTA (GlobalHomeScreen.kt:418)");
            }
            composerStartRestartGroup.startReplaceGroup(-1027032114);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue() ? 0.98f : 1.0f, null, 0.0f, "cta_scale", null, composerStartRestartGroup, 3072, 22);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-1027023681);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = DensityKt.Density(density.getDensity(), Q3.a.o(density.getFontScale(), 1.3f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue2), ComposableLambdaKt.rememberComposableLambda(1140344522, true, new C2668s5(list, mutableInteractionSource, onClick, stateAnimateFloatAsState, str2, str, str3), composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(str, str2, str3, list, onClick, i5));
        }
    }
}
