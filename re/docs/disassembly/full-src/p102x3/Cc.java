package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material.icons.outlined.FolderKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.graphics.Fields;
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
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;

/* JADX INFO: loaded from: classes2.dex */
public final class Cc implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f13849o;
    public final /* synthetic */ a p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f13850r;

    public Cc(List list, a aVar, a aVar2, c cVar) {
        this.f13849o = list;
        this.p = aVar;
        this.q = aVar2;
        this.f13850r = cVar;
    }

    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        float f5;
        Composer composer;
        Composer composer2;
        String str;
        Composer composer3 = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1731506785, iIntValue, -1, "com.notescrafter.ui.screens.PdfSourcePickerDialog.<anonymous> (PrintOrderScreens.kt:776)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(320)), 0.0f, Dp.m6403constructorimpl(4), 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer3, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
            a constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer3, i5).getTitleMedium();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = companion4.getBold();
            Color.Companion companion5 = Color.Companion;
            TextKt.m2432Text4IGK_g("Select PDF Source", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            IconButtonKt.IconButton(this.q, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), false, null, null, X2.f14628d, composer3, 196656, 28);
            composer3.endNode();
            float f6 = 16;
            b.m(f6, companion, composer3, 6);
            TextStyle bodySmall = materialTheme.getTypography(composer3, i5).getBodySmall();
            TextKt.m2432Text4IGK_g("Choose a file from your NotesCrafter downloads or browse your device storage.", SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.p, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(16), (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer3, 54, 0, 65532);
            float f7 = 20;
            b.m(f7, companion, composer3, 6);
            TextStyle labelSmall = materialTheme.getTypography(composer3, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("NOTESCRAFTER DOWNLOADS", SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15980c, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer3, 54, 0, 65532);
            float f8 = 8;
            b.m(f8, companion, composer3, 6);
            List<File> list = this.f13849o;
            if (list.isEmpty()) {
                composer3.startReplaceGroup(-1545355264);
                float f9 = 12;
                Modifier modifierE = b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(100)), f9), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierE);
                a constructor3 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextStyle bodySmall2 = materialTheme.getTypography(composer3, i5).getBodySmall();
                f5 = f8;
                composer2 = composer3;
                TextKt.m2432Text4IGK_g("No NotesCrafter downloads found", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                f5 = f8;
                composer.startReplaceGroup(-1544492100);
                Object obj3 = null;
                int i6 = 1;
                float f10 = 0.0f;
                ?? r10 = 0;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(ComposerKt.invocationKey), 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                int i7 = 6;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getStart(), composer, 6);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
                a constructor4 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    composer = composer3;
                    ComposablesKt.invalidApplier();
                }
                composer = composer3;
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                p035i0.a.w(companion3, composerM3407constructorimpl4, modifierMaterializeModifier4, composer, -2095964730);
                for (File file : list) {
                    if (file.length() < 1024) {
                        str = file.length() + " B";
                    } else if (file.length() < 1048576) {
                        str = (file.length() / ((long) Fields.RotationZ)) + " KB";
                    } else {
                        str = String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(file.length() / 1048576.0d)}, i6));
                    }
                    String str2 = str;
                    String str3 = new SimpleDateFormat("MMM dd, HH:mm", Locale.getDefault()).format(new Date(file.lastModified()));
                    Modifier.Companion companion6 = Modifier.Companion;
                    float f11 = 10;
                    Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion6, f10, i6, obj3), f11);
                    Color.Companion companion7 = Color.Companion;
                    Modifier modifierE2 = b.e(f11, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(i6), Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer.startReplaceGroup(30930987);
                    c cVar = this.f13850r;
                    boolean zChanged = composer.changed(cVar) | composer.changedInstance(file);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C2290i(21, cVar, file);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    float f12 = 12;
                    Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f12));
                    Alignment.Companion companion8 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion8.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically, composer, 48);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, r10);
                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                    a constructor5 = companion9.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor5);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                    e eVarG5 = p035i0.a.g(companion9, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion9.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(32)), i7), Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), r10);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, r10);
                    CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
                    a constructor6 = companion9.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor6);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                    e eVarG6 = p035i0.a.g(companion9, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion9.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m1877Iconww6aTOc(DescriptionKt.getDescription(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f6)), p107y3.a.f15980c, composer, 3504, 0);
                    b.u(composer, f12, companion6, composer, i7);
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, companion6, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion8.getStart(), composer, 0);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
                    a constructor7 = companion9.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor7);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
                    e eVarG7 = p035i0.a.g(companion9, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion9.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String name = file.getName();
                    o.e(name, "getName(...)");
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle bodySmall3 = materialTheme2.getTypography(composer, i8).getBodySmall();
                    Composer composer4 = composer;
                    TextKt.m2432Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : companion7.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer4, 0, 3120, 55294);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(2)), composer4, 6);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    String strP = p035i0.a.p(sb, " · ", str3);
                    TextStyle labelSmall2 = materialTheme2.getTypography(composer4, i8).getLabelSmall();
                    TextKt.m2432Text4IGK_g(strP, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.p, (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer4, 0, 0, 65534);
                    composer4.endNode();
                    composer4.endNode();
                    composer = composer4;
                    r10 = 0;
                    i7 = 6;
                    obj3 = null;
                    i6 = 1;
                    f10 = 0.0f;
                }
                composer2 = composer;
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion10 = Modifier.Companion;
            Composer composer5 = composer2;
            b.m(f7, companion10, composer5, 6);
            Color.Companion companion11 = Color.Companion;
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), composer5, 384, 3);
            b.m(f6, companion10, composer5, 6);
            Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(BackgroundKt.background$default(b.g(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), 14), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), false, null, null, this.p, 7, null), 0.0f, Dp.m6403constructorimpl(12), 1, null);
            Alignment.Companion companion12 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer5, modifierM670paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
            a constructor8 = companion13.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor8);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer5);
            e eVarG8 = p035i0.a.g(companion13, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion13.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion12.getCenterVertically(), composer5, 48);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer5, companion10);
            a constructor9 = companion13.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor9);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer5);
            e eVarG9 = p035i0.a.g(companion13, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl9, currentCompositionLocalMap9);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion13.getSetModifier());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(FolderKt.getFolder(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(18)), companion11.m3964getWhite0d7_KjU(), composer5, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(f5, companion10, composer5, 6);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyMedium();
            TextKt.m2432Text4IGK_g("Choose from Phone Storage", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : companion11.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer5, 6, 0, 65534);
            if (S2.b(composer5)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
