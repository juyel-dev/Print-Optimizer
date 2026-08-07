package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.outlined.ArchiveKt;
import androidx.compose.material.icons.outlined.CheckCircleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2404bc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14849o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ State q;

    public C2404bc(a aVar, MutableState mutableState, State state) {
        this.f14849o = aVar;
        this.p = mutableState;
        this.q = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1459250090, iIntValue, -1, "com.notescrafter.ui.screens.PrintMyOrdersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:357)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(40), 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            float f5 = 14;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), centerHorizontally, composer2, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(68)), RoundedCornerShapeKt.getCircleShape());
            Brush.Companion companion4 = Brush.Companion;
            long j5 = p107y3.a.f15978a;
            Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
            long j6 = p107y3.a.f15979b;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.background$default(modifierClip, Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(colorM3917boximpl, Color.m3917boximpl(Color.m3926copywmQWz5c$default(j6, 0.08f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
            a constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            List list = AbstractC2452ec.f14975a;
            MutableState mutableState = this.p;
            IconKt.m1877Iconww6aTOc(o.b((String) mutableState.getValue(), "confirmed") ? CheckCircleKt.getCheckCircle(Icons.Outlined.INSTANCE) : ArchiveKt.getArchive(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(30)), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
            composer2.endNode();
            String str = o.b((String) mutableState.getValue(), "confirmed") ? "No confirmed orders" : "No pending drafts";
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleSmall = materialTheme.getTypography(composer2, i5).getTitleSmall();
            Color.Companion companion5 = Color.Companion;
            long jM3964getWhite0d7_KjU = companion5.m3964getWhite0d7_KjU();
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleSmall.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU, (16645977 & 2) != 0 ? titleSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleSmall.spanStyle.getFontWeight() : companion6.getBold(), (16645977 & 8) != 0 ? titleSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleSmall.platformStyle : null, (16645977 & 1048576) != 0 ? titleSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleSmall.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
            String str2 = o.b((String) mutableState.getValue(), "confirmed") ? "Orders confirmed after payment will appear here." : "Incomplete or draft orders will appear here.";
            TextStyle bodySmall = materialTheme.getTypography(composer2, i5).getBodySmall();
            TextKt.m2432Text4IGK_g(str2, PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(20), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.p, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(12), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer2, 48, 0, 65532);
            composer2.startReplaceGroup(-1447330094);
            if (((Boolean) this.q.getValue()).booleanValue()) {
                b.m(4, companion, composer2, 6);
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(BackgroundKt.background$default(b.g(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(44)), f5), Brush.Companion.m3876horizontalGradient8A3gB4$default(companion4, v.S(Color.m3917boximpl(j5), Color.m3917boximpl(j6)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), false, null, null, this.f14849o, 7, null), Dp.m6403constructorimpl(28), 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                a constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), b.c(companion3, composerM3407constructorimpl3, modifierMaterializeModifier3, companion2), composer2, 48);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                IconKt.m1877Iconww6aTOc(AddKt.getAdd(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(16)), companion5.m3964getWhite0d7_KjU(), composer2, 3504, 0);
                composer = composer2;
                TextKt.m2432Text4IGK_g("Place a New Order", (Modifier) null, b.a(6, companion, composer2, 6, companion5), TextUnitKt.getSp(13), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
                composer.endNode();
                composer.endNode();
            } else {
                composer = composer2;
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
