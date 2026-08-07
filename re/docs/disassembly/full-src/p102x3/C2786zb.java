package p102x3;

import B3.h;
import C3.v;
import N0.B;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.FullscreenKt;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import p083t3.C2290i;

/* JADX INFO: renamed from: x3.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2786zb implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15809o;
    public final /* synthetic */ List p;
    public final /* synthetic */ List q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15811s;

    public C2786zb(int i5, List list, List list2, MutableState mutableState, MutableState mutableState2) {
        this.f15809o = i5;
        this.p = list;
        this.q = list2;
        this.f15810r = mutableState;
        this.f15811s = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(758091842, iIntValue, -1, "com.notescrafter.ui.screens.NcfGallerySlider.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:1534)");
            }
            int i5 = this.f15809o;
            if (i5 == 0) {
                composer.startReplaceGroup(-1728733740);
                MutableState mutableState2 = this.f15810r;
                h hVar = (h) this.p.get(((Number) mutableState2.getValue()).intValue());
                String str = (String) hVar.f148o;
                String str2 = (String) hVar.p;
                Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer.startReplaceGroup(-1579780738);
                boolean zChanged = composer.changed(str) | composer.changedInstance(context);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new C2290i(18, (Object) context, str);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierFillMaxSize$default, false, null, null, (a) objRememberedValue, 7, null);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
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
                B.a(androidx.compose.foundation.text.modifiers.a.z("https://img.youtube.com/vi/", str, "/maxresdefault.jpg"), str2, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ContentScale.Companion.getCrop(), composer, 1573248);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Brush.Companion companion4 = Brush.Companion;
                Color.Companion companion5 = Color.Companion;
                BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default2, Brush.Companion.m3880radialGradientP_VxKs$default(companion4, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 6);
                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion5.m3961getRed0d7_KjU(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(2), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU);
                a constructor2 = companion3.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.Filled.INSTANCE), "Play video", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endNode();
                float f5 = 8;
                float f6 = 4;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(b.g(PaddingKt.m668padding3ABfNKs(boxScopeInstance.align(companion, companion2.getTopStart()), Dp.m6403constructorimpl(12)), f5), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f6));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
                a constructor3 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                long jM3964getWhite0d7_KjU = companion5.m3964getWhite0d7_KjU();
                long sp = TextUnitKt.getSp(10);
                FontWeight.Companion companion6 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, jM3964getWhite0d7_KjU, sp, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                composer.endNode();
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
                a constructor4 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f7 = 30;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer.startReplaceGroup(2024971334);
                Object objRememberedValue2 = composer.rememberedValue();
                Composer.Companion companion7 = Composer.Companion;
                if (objRememberedValue2 == companion7.getEmpty()) {
                    mutableState = mutableState2;
                    objRememberedValue2 = new O6(27, mutableState);
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState = mutableState2;
                }
                composer.endReplaceGroup();
                MutableState mutableState3 = mutableState;
                Modifier modifierM242clickableXHw0xAI$default2 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue2, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default2);
                a constructor5 = companion3.getConstructor();
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
                e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                Icons icons = Icons.INSTANCE;
                float f8 = 16;
                IconKt.m1877Iconww6aTOc(KeyboardArrowLeftKt.getKeyboardArrowLeft(icons.getDefault()), "Previous Video", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f8)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endNode();
                Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer.startReplaceGroup(2025002402);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion7.getEmpty()) {
                    objRememberedValue3 = new O6(28, mutableState3);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default3 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default2, false, null, null, (a) objRememberedValue3, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default3);
                a constructor6 = companion3.getConstructor();
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
                e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(icons.getDefault()), "Next Video", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f8)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endNode();
                composer.endNode();
                Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(10), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion2.getCenterHorizontally(), composer, 54);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
                a constructor7 = companion3.getConstructor();
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
                e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap7);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall();
                TextKt.m2432Text4IGK_g("Tap to Watch", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion6.getSemiBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                float f9 = 6;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getCenterVertically(), composer, 54);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, companion);
                a constructor8 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor8);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
                e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl8, currentCompositionLocalMap8);
                if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                }
                p035i0.a.w(companion3, composerM3407constructorimpl8, modifierMaterializeModifier8, composer, 2034168822);
                int i6 = 0;
                while (i6 < 3) {
                    boolean z3 = i6 == ((Number) mutableState3.getValue()).intValue();
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(Modifier.Companion, z3 ? Dp.m6403constructorimpl(f9) : Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), z3 ? Color.Companion.m3964getWhite0d7_KjU() : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
                    i6++;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1721393529);
                int iIntValue2 = ((Number) this.q.get(i5 - 1)).intValue();
                Modifier.Companion companion8 = Modifier.Companion;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                Alignment.Companion companion9 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default3);
                ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                a constructor9 = companion10.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor9);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
                e eVarG9 = p035i0.a.g(companion10, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl9, currentCompositionLocalMap9);
                if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion10.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue2, composer, 0), "Gallery Image", SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 25008, 104);
                Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(boxScopeInstance2.align(companion8, companion9.getTopEnd()), Dp.m6403constructorimpl(10)), Dp.m6403constructorimpl(32));
                Color.Companion companion11 = Color.Companion;
                Modifier modifierM206backgroundbw27NRU = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs, Color.m3926copywmQWz5c$default(companion11.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer.startReplaceGroup(-822464952);
                boolean zChanged2 = composer.changed(iIntValue2);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new C2754xb(iIntValue2, 1, this.f15811s);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default4 = ClickableKt.m242clickableXHw0xAI$default(modifierM206backgroundbw27NRU, false, null, null, (a) objRememberedValue4, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getCenter(), false);
                int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default4);
                a constructor10 = companion10.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor10);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
                e eVarG10 = p035i0.a.g(companion10, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl10, currentCompositionLocalMap10);
                if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
                }
                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion10.getSetModifier());
                IconKt.m1877Iconww6aTOc(FullscreenKt.getFullscreen(Icons.INSTANCE.getDefault()), "Expand to Fullscreen", SizeKt.m713size3ABfNKs(companion8, Dp.m6403constructorimpl(20)), companion11.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
