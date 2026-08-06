package p102x3;

import B3.h;
import B3.o;
import C3.v;
import N0.C0134b;
import N0.C0135c;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ArticleKt;
import androidx.compose.material.icons.outlined.CalculateKt;
import androidx.compose.material.icons.outlined.CardGiftcardKt;
import androidx.compose.material.icons.outlined.ChevronRightKt;
import androidx.compose.material.icons.outlined.CorporateFareKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material.icons.outlined.FlagKt;
import androidx.compose.material.icons.outlined.LocalShippingKt;
import androidx.compose.material.icons.outlined.LoopKt;
import androidx.compose.material.icons.outlined.PaymentsKt;
import androidx.compose.material.icons.outlined.PlaceKt;
import androidx.compose.material.icons.outlined.PrintKt;
import androidx.compose.material.icons.outlined.ReceiptKt;
import androidx.compose.material.icons.outlined.SchoolKt;
import androidx.compose.material.icons.outlined.ShieldKt;
import androidx.compose.material.icons.outlined.UploadFileKt;
import androidx.compose.material.icons.outlined.VisibilityKt;
import androidx.compose.material.icons.outlined.WorkOutlineKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.app.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC2168g;
import p076s.b;
import p083t3.C2292j;
import p083t3.J;
import p083t3.O;
import p097w3.g;
import p097w3.j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Rb {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, Composer composer, int i5) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1914542485);
        int i6 = i5 | 6;
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1914542485, i6, -1, "com.notescrafter.ui.screens.AnimatedPromoBanner (PrintLandingScreen.kt:289)");
            }
            composerStartRestartGroup.startReplaceGroup(-1719013014);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            o oVar = o.f154a;
            composerStartRestartGroup.startReplaceGroup(-1719011150);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new C2706ub(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue2, composerStartRestartGroup, 6);
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(8));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Integer numValueOf = Integer.valueOf(((Number) mutableState.getValue()).intValue());
            composerStartRestartGroup.startReplaceGroup(-1898529574);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C0135c(11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(numValueOf, null, (c) objRememberedValue3, null, "promo_rotation", null, AbstractC2745x2.f15704a, composerStartRestartGroup, 1597824, 42);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2375a(modifier2, i5, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Composer composer, int i5) {
        Composer composer2;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145249864);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1145249864, i5, -1, "com.notescrafter.ui.screens.NcfGallerySlider (PrintLandingScreen.kt:1451)");
            }
            List listS = v.S(Integer.valueOf(R.drawable.ncp_gallery_1), Integer.valueOf(R.drawable.ncp_gallery_2), Integer.valueOf(R.drawable.ncp_gallery_3), Integer.valueOf(R.drawable.ncp_gallery_4), Integer.valueOf(R.drawable.ncp_gallery_5), Integer.valueOf(R.drawable.ncp_gallery_6));
            List listS2 = v.S(new h("pS3wCZcXGq4", "Showcase Video"), new h("cYzFSce7WYM", "Print Quality Demonstration"), new h("C21wII-Ac8U", "Binding Strength Test"));
            composerStartRestartGroup.startReplaceGroup(144471841);
            boolean zChanged = composerStartRestartGroup.changed(listS);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2573m5(listS, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (O3.a) objRememberedValue, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(144473493);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objK = b.k(composerStartRestartGroup, 144475596);
            if (objK == companion.getEmpty()) {
                objK = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState3 = (MutableState) objK;
            composerStartRestartGroup.endReplaceGroup();
            o oVar = o.f154a;
            composerStartRestartGroup.startReplaceGroup(144479332);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C2722vb(mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(144486624);
            boolean zChanged2 = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changed(listS);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new C2738wb(pagerStateRememberPagerState, listS, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (e) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            O3.a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.m700heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(220), Dp.m6403constructorimpl(340)), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(64), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(f5), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(1803237584, true, new Ab(listS, pagerStateRememberPagerState, mutableState2, listS2, mutableState3), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 3072, 8152);
            composer2 = composerStartRestartGroup;
            b.m(f5, companion2, composer2, 6);
            float f6 = 6;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion3.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
            O3.a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-998246154);
            int size = listS.size() + 1;
            int i6 = 0;
            while (i6 < size) {
                boolean z3 = pagerStateRememberPagerState.getCurrentPage() == i6;
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(Modifier.Companion, z3 ? Dp.m6403constructorimpl(8) : Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), z3 ? a.f15980c : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                i6++;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (((Integer) mutableState2.getValue()) != null) {
                composer2.startReplaceGroup(144869515);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    mutableState = mutableState2;
                    objRememberedValue5 = new O6(26, mutableState);
                    composer2.updateRememberedValue(objRememberedValue5);
                } else {
                    mutableState = mutableState2;
                }
                composer2.endReplaceGroup();
                AndroidDialog_androidKt.Dialog((O3.a) objRememberedValue5, new DialogProperties(false, false, false, 3, (AbstractC2168g) null), ComposableLambdaKt.rememberComposableLambda(1939018986, true, new Db(mutableState), composer2, 54), composer2, 438, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 8));
        }
    }

    public static final void c(C2611ob c2611ob, boolean z3, O3.a aVar, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-959025985);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(c2611ob) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-959025985, i6, -1, "com.notescrafter.ui.screens.PrintFaqAccordionItem (PrintLandingScreen.kt:1392)");
            }
            j.a(ClickableKt.m242clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, null, 3, null), false, null, null, aVar, 7, null), a.u, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1588272314, true, new Eb(z3, c2611ob, AnimateAsStateKt.animateFloatAsState(z3 ? 180.0f : 0.0f, null, 0.0f, "chevron_rotation", null, composerStartRestartGroup, 3072, 22)), composerStartRestartGroup, 54), composerStartRestartGroup, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2732w5(c2611ob, z3, aVar, i5, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Composer composer, int i5) {
        Composer composer2;
        Throwable th;
        Composer composerStartRestartGroup = composer.startRestartGroup(612386330);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(612386330, i5, -1, "com.notescrafter.ui.screens.PrintFaqSection (PrintLandingScreen.kt:1324)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i6).getHeadlineLarge();
            TextKt.m2432Text4IGK_g("Frequently Asked", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineLarge.platformStyle : null, (16645977 & 1048576) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i6).getBodyMedium();
            TextKt.m2432Text4IGK_g("Everything you need to know about our premium print service.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(28)), composer2, 6);
            List listS = v.S(new C2611ob("What is the delivery time?", "Typically, orders are processed and shipped within 24-48 hours. Depending on your location in India, you can expect delivery within 3-7 business days."), new C2611ob("What paper quality do you use?", "We use premium 75 GSM paper which is perfect for writing with any pen without bleed-through. It feels smooth and professional."), new C2611ob("How do I track my order?", "Once your order is shipped, you will receive a tracking link via email and you can also track it directly from the 'My Orders' section in your account."), new C2611ob("Can I order in bulk for my institute?", "Yes! We offer special pricing for bulk orders for coaching institutes and colleges. Please contact our support for a custom quote."));
            composer2.startReplaceGroup(1647451734);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                th = null;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                th = null;
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composer2.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(12)), companion2.getStart(), composer2, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl2, modifierMaterializeModifier2, composer2, 43795158);
            final int i7 = 0;
            for (Object obj : listS) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    v.X();
                    throw th;
                }
                C2611ob c2611ob = (C2611ob) obj;
                Integer num = (Integer) mutableState.getValue();
                final boolean z3 = num != null && num.intValue() == i7;
                composer2.startReplaceGroup(1619143660);
                boolean zChanged = composer2.changed(z3) | composer2.changed(i7);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new O3.a() { // from class: x3.qb
                        @Override // O3.a
                        public final Object invoke() {
                            mutableState.setValue(z3 ? null : Integer.valueOf(i7));
                            return o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                c(c2611ob, z3, (O3.a) objRememberedValue2, composer2, 0);
                i7 = i8;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 6));
        }
    }

    public static final void e(C2627pb c2627pb, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1801990010);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(c2627pb) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1801990010, i6, -1, "com.notescrafter.ui.screens.PrintFeatureCard (PrintLandingScreen.kt:967)");
            }
            j.a(SizeKt.m701heightInVpY3zN4$default(modifier, Dp.m6403constructorimpl(140), 0.0f, 2, null), a.u, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(133049921, true, new Fb(c2627pb), composerStartRestartGroup, 54), composerStartRestartGroup, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 7, c2627pb, modifier));
        }
    }

    public static final void f(Composer composer, int i5) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1047055711);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1047055711, i5, -1, "com.notescrafter.ui.screens.PrintFeaturesSection (PrintLandingScreen.kt:910)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i6).getHeadlineLarge();
            TextKt.m2432Text4IGK_g("Premium by Default", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineLarge.platformStyle : null, (16645977 & 1048576) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i6).getBodyMedium();
            float f5 = 16;
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g("We don't compromise on quality. Every notebook is crafted with industry-leading materials.", PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer2, 54, 0, 65532);
            int i7 = 6;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(28)), composer2, 6);
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            List listS = v.S(new C2627pb(ArticleKt.getArticle(outlined), "Premium 75 GSM Paper", "Ultra-smooth, zero-bleed pages."), new C2627pb(LoopKt.getLoop(outlined), "Golden Wire-O Binding", "Durable double-loop 360° folds."), new C2627pb(ShieldKt.getShield(outlined), "Frosted PVC Covers", "Water-resistant frosted protection."), new C2627pb(PrintKt.getPrint(outlined), "High-Fidelity Inkjet", "Crisp text & vibrant colors."), new C2627pb(VisibilityKt.getVisibility(outlined), "Live 3D Preview", "Interact with a digital twin."), new C2627pb(LocalShippingKt.getLocalShipping(outlined), "Pan India Delivery", "Fast delivery to your doorstep."));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getStart(), composer2, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl2, modifierMaterializeModifier2, composer2, -1322610257);
            int iW = p003a2.a.w(0, listS.size() - 1, 2);
            if (iW >= 0) {
                int i8 = 0;
                while (true) {
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), Alignment.Companion.getTop(), composer2, i7);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    O3.a constructor3 = companion5.getConstructor();
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
                    e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    e((C2627pb) listS.get(i8), RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), composer2, 0);
                    int i9 = i8 + 1;
                    if (i9 < listS.size()) {
                        composer2.startReplaceGroup(-839571866);
                        e((C2627pb) listS.get(i9), RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-839447928);
                        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (i8 == iW) {
                        break;
                    }
                    i8 += 2;
                    i7 = 6;
                }
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x05be  */
    /* JADX WARN: Code duplicated, block: B:103:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:106:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x0612  */
    /* JADX WARN: Code duplicated, block: B:114:0x061e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0622  */
    /* JADX WARN: Code duplicated, block: B:118:0x0633  */
    /* JADX WARN: Code duplicated, block: B:120:0x0641  */
    /* JADX WARN: Code duplicated, block: B:123:0x0738  */
    /* JADX WARN: Code duplicated, block: B:125:0x073e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0787  */
    /* JADX WARN: Code duplicated, block: B:131:0x0793  */
    /* JADX WARN: Code duplicated, block: B:132:0x0797  */
    /* JADX WARN: Code duplicated, block: B:135:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0804  */
    /* JADX WARN: Code duplicated, block: B:151:0x0812  */
    /* JADX WARN: Code duplicated, block: B:154:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0918  */
    /* JADX WARN: Code duplicated, block: B:159:0x0924  */
    /* JADX WARN: Code duplicated, block: B:160:0x0928  */
    /* JADX WARN: Code duplicated, block: B:163:0x093b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0949  */
    /* JADX WARN: Code duplicated, block: B:167:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:64:0x035e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0362  */
    /* JADX WARN: Code duplicated, block: B:68:0x036e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0376  */
    /* JADX WARN: Code duplicated, block: B:72:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0405  */
    /* JADX WARN: Code duplicated, block: B:83:0x0485  */
    /* JADX WARN: Code duplicated, block: B:86:0x0491  */
    /* JADX WARN: Code duplicated, block: B:87:0x0495  */
    /* JADX WARN: Code duplicated, block: B:90:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x050f  */
    /* JADX WARN: Code duplicated, block: B:99:0x05b2  */
    public static final void g(p092v3.h hVar, PrintOrderViewModel printOrderViewModel, float f5, boolean z3, String str, O3.a aVar, O3.a aVar2, O3.a aVar3, Composer composer, int i5) {
        int i6;
        Alignment.Companion companion;
        AnnotatedString.Builder builder;
        Color.Companion companion2;
        int iPushStyle;
        FontWeight.Companion companion3;
        int iPushStyle2;
        MaterialTheme materialTheme;
        int i7;
        float f6;
        float f7;
        State stateCollectAsState;
        State stateCollectAsState2;
        State stateCollectAsState3;
        String str2;
        String str3;
        boolean z4;
        Object objRememberedValue;
        float f8;
        float f9;
        int i8;
        int currentCompositeKeyHash;
        O3.a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        O3.a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        Icons.Outlined outlined;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash3;
        O3.a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        Alignment.Companion companion4;
        int currentCompositeKeyHash4;
        O3.a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        Composer composer2;
        int currentCompositeKeyHash5;
        O3.a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG5;
        float f10;
        int currentCompositeKeyHash6;
        O3.a constructor6;
        Composer composerM3407constructorimpl6;
        float f11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-36522603);
        if ((i5 & 6) == 0) {
            i6 = i5 | (composerStartRestartGroup.changedInstance(hVar) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(printOrderViewModel) ? 32 : 16;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar3) ? 8388608 : 4194304;
        }
        if ((4718611 & i6) == 4718610 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36522603, i6, -1, "com.notescrafter.ui.screens.PrintHeroSection (PrintLandingScreen.kt:705)");
            }
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(hVar.e, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(printOrderViewModel.f10911z, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(printOrderViewModel.f10863B, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(printOrderViewModel.f10865D, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(printOrderViewModel.f10867F, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState9 = SnapshotStateKt.collectAsState(printOrderViewModel.f10869H, null, composerStartRestartGroup, 0, 1);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion7 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
            O3.a constructor7 = companion8.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG6 = p035i0.a.g(companion8, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap);
            try {
                try {
                    if (composerM3407constructorimpl7.getInserting()) {
                        companion = companion7;
                    } else {
                        companion = companion7;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier, companion8.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        builder = new AnnotatedString.Builder(0, 1, null);
                        companion2 = Color.Companion;
                        iPushStyle = builder.pushStyle(new SpanStyle(Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC2168g) null));
                        builder.append("We ");
                        builder.pop(iPushStyle);
                        Brush brushM3878linearGradientmHitzGk$default = Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null);
                        companion3 = FontWeight.Companion;
                        iPushStyle2 = builder.pushStyle(new SpanStyle(brushM3878linearGradientmHitzGk$default, 0.0f, 0L, companion3.getExtraBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 131062, null));
                        builder.append("Print.Bind.Deliver");
                        builder.pop(iPushStyle2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        materialTheme = MaterialTheme.INSTANCE;
                        i7 = MaterialTheme.$stable;
                        TextStyle displaySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                        TextStyle textStyleM5917copyp1EtxEg = displaySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? displaySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? displaySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(32), (16645977 & 4) != 0 ? displaySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? displaySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? displaySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? displaySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? displaySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? displaySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.5d), (16645977 & Fields.RotationX) != 0 ? displaySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? displaySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? displaySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? displaySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? displaySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? displaySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? displaySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? displaySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? displaySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? displaySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(38), (16645977 & 262144) != 0 ? displaySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? displaySmall.platformStyle : null, (16645977 & 1048576) != 0 ? displaySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? displaySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? displaySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? displaySmall.paragraphStyle.getTextMotion() : null);
                        TextAlign.Companion companion9 = TextAlign.Companion;
                        TextKt.m2433TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m6285boximpl(companion9.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, textStyleM5917copyp1EtxEg, composerStartRestartGroup, 0, 0, 130558);
                        f6 = 16;
                        b.m(f6, companion6, composerStartRestartGroup, 6);
                        TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                        f7 = 8;
                        TextKt.m2432Text4IGK_g("Upload your PDF, choose print specs, and let us handle the rest. We create premium notebooks and deliver them to your doorstep – made for Indian students. 🇮🇳", PaddingKt.m670paddingVpY3zN4$default(companion6, Dp.m6403constructorimpl(f7), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : companion9.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 54, 0, 65532);
                        float f12 = 20;
                        b.m(f12, companion6, composerStartRestartGroup, 6);
                        b(composerStartRestartGroup, 0);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composerStartRestartGroup, 6);
                        stateCollectAsState = SnapshotStateKt.collectAsState(hVar.g, null, composerStartRestartGroup, 0, 1);
                        stateCollectAsState2 = SnapshotStateKt.collectAsState(hVar.f13533o, null, composerStartRestartGroup, 0, 1);
                        stateCollectAsState3 = SnapshotStateKt.collectAsState(hVar.t, null, composerStartRestartGroup, 0, 1);
                        if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                            str3 = "lifetime";
                        } else {
                            if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                                str3 = (String) stateCollectAsState2.getValue();
                            } else {
                                str2 = null;
                            }
                            boolean zBooleanValue = ((Boolean) stateCollectAsState4.getValue()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) stateCollectAsState9.getValue()).booleanValue();
                            boolean zBooleanValue3 = ((Boolean) stateCollectAsState8.getValue()).booleanValue();
                            h hVar2 = (h) stateCollectAsState5.getValue();
                            String str4 = (String) stateCollectAsState7.getValue();
                            String str5 = (String) stateCollectAsState6.getValue();
                            composerStartRestartGroup.startReplaceGroup(956300605);
                            if ((29360128 & i6) == 8388608) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue == companion5.getEmpty()) {
                                objRememberedValue = new O(7, aVar3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            p(zBooleanValue, zBooleanValue2, zBooleanValue3, hVar2, str4, str5, (O3.a) objRememberedValue, null, composerStartRestartGroup, 0);
                            f8 = 12;
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(956305367);
                            if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4));
                                f9 = f7;
                                f10 = 6;
                                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierM669paddingVpY3zN4, f9), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
                                constructor6 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                e eVarG7 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap2);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    f11 = f10;
                                } else {
                                    f11 = f10;
                                    if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion8.getSetModifier());
                                    TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                                    i8 = 6;
                                    b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                                }
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG7);
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion8.getSetModifier());
                                TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                                i8 = 6;
                                b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                            } else {
                                f9 = f7;
                                i8 = 6;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            o(str2, hVar, null, composerStartRestartGroup, (i6 << 3) & 112);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composerStartRestartGroup, i8);
                            float f13 = 1;
                            float f14 = 32;
                            Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion6, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, aVar2, 7, null), Dp.m6403constructorimpl(f14), Dp.m6403constructorimpl(f8));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN6);
                            constructor = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap3);
                            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion8.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                            constructor2 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap4);
                            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion8.getSetModifier());
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            outlined = Icons.Outlined.INSTANCE;
                            IconKt.m1877Iconww6aTOc(CalculateKt.getCalculate(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), ColorKt.Color(4290807036L), composerStartRestartGroup, 3504, 0);
                            androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                            TextStyle bodyMedium2 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                            TextKt.m2432Text4IGK_g("Price Calculator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : companion2.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                            b.r(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                            float f15 = 30;
                            Modifier modifierE = b.e(f15, BackgroundKt.m207backgroundbw27NRU$default(b.d(f15, companion6), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
                            composerStartRestartGroup.startReplaceGroup(956388427);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == companion5.getEmpty()) {
                                objRememberedValue2 = new J(context, 7);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (O3.a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f14), Dp.m6403constructorimpl(f8));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN7);
                            constructor3 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap5);
                            if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                            }
                            companion4 = companion;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), b.c(companion8, composerM3407constructorimpl3, modifierMaterializeModifier5, companion4), composerStartRestartGroup, 48);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                            constructor4 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap6);
                            if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier6, companion8.getSetModifier());
                            IconKt.m1876Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_whatsapp_glyph, composerStartRestartGroup, 0), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), ColorKt.Color(4280669030L), composerStartRestartGroup, 3504, 0);
                            androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                            TextStyle bodyMedium3 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                            TextKt.m2432Text4IGK_g("Chat on WhatsApp", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : ColorKt.Color(4280669030L), (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(956419685);
                            if (((Boolean) stateCollectAsState4.getValue()).booleanValue()) {
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                Alignment.Vertical centerVertically = companion4.getCenterVertically();
                                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(companion6, false, null, null, aVar3, 7, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f9));
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN8);
                                constructor5 = companion8.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor5);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap7);
                                if (composerM3407constructorimpl5.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier7, companion8.getSetModifier());
                                float f16 = 14;
                                composer2 = composerStartRestartGroup;
                                IconKt.m1877Iconww6aTOc(ReceiptKt.getReceipt(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f16)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                                androidx.compose.foundation.text.modifiers.a.q(6, companion6, composer2, 6);
                                TextStyle bodySmall = materialTheme.getTypography(composer2, i7).getBodySmall();
                                TextKt.m2432Text4IGK_g("View My Orders", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(4)), composer2, 6);
                                IconKt.m1877Iconww6aTOc(ChevronRightKt.getChevronRight(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f16)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                                composer2.endNode();
                            } else {
                                composer2 = composerStartRestartGroup;
                            }
                            if (p035i0.a.z(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        str2 = str3;
                        boolean zBooleanValue4 = ((Boolean) stateCollectAsState4.getValue()).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) stateCollectAsState9.getValue()).booleanValue();
                        boolean zBooleanValue6 = ((Boolean) stateCollectAsState8.getValue()).booleanValue();
                        h hVar3 = (h) stateCollectAsState5.getValue();
                        String str6 = (String) stateCollectAsState7.getValue();
                        String str7 = (String) stateCollectAsState6.getValue();
                        composerStartRestartGroup.startReplaceGroup(956300605);
                        if ((29360128 & i6) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            objRememberedValue = new O(7, aVar3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new O(7, aVar3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        p(zBooleanValue4, zBooleanValue5, zBooleanValue6, hVar3, str6, str7, (O3.a) objRememberedValue, null, composerStartRestartGroup, 0);
                        f8 = 12;
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(956305367);
                        if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                            Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4));
                            f9 = f7;
                            f10 = 6;
                            Modifier modifierM669paddingVpY3zN10 = PaddingKt.m669paddingVpY3zN4(b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierM669paddingVpY3zN9, f9), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN10);
                            constructor6 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG8 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap8);
                            if (composerM3407constructorimpl6.getInserting()) {
                                f11 = f10;
                                if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier8, companion8.getSetModifier());
                                TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                                i8 = 6;
                                b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                            } else {
                                f11 = f10;
                            }
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG8);
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier8, companion8.getSetModifier());
                            TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                            i8 = 6;
                            b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                        } else {
                            f9 = f7;
                            i8 = 6;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        o(str2, hVar, null, composerStartRestartGroup, (i6 << 3) & 112);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composerStartRestartGroup, i8);
                        float f17 = 1;
                        float f18 = 32;
                        Modifier modifierM669paddingVpY3zN11 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion6, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f17), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, aVar2, 7, null), Dp.m6403constructorimpl(f18), Dp.m6403constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN11);
                        constructor = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap9);
                        if (composerM3407constructorimpl.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion8.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                        constructor2 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap10);
                        if (composerM3407constructorimpl2.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion8.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        outlined = Icons.Outlined.INSTANCE;
                        IconKt.m1877Iconww6aTOc(CalculateKt.getCalculate(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), ColorKt.Color(4290807036L), composerStartRestartGroup, 3504, 0);
                        androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                        TextStyle bodyMedium4 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                        TextKt.m2432Text4IGK_g("Price Calculator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium4.spanStyle.m5841getColor0d7_KjU() : companion2.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium4.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                        b.r(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        float f19 = 30;
                        Modifier modifierE2 = b.e(f19, BackgroundKt.m207backgroundbw27NRU$default(b.d(f19, companion6), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f17), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
                        composerStartRestartGroup.startReplaceGroup(956388427);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new J(context, 7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new J(context, 7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM669paddingVpY3zN12 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (O3.a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f18), Dp.m6403constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN12);
                        constructor3 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl3, currentCompositionLocalMap11);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                        }
                        companion4 = companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.getStart(), b.c(companion8, composerM3407constructorimpl3, modifierMaterializeModifier11, companion4), composerStartRestartGroup, 48);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl4, currentCompositionLocalMap12);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier12, companion8.getSetModifier());
                        IconKt.m1876Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_whatsapp_glyph, composerStartRestartGroup, 0), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), ColorKt.Color(4280669030L), composerStartRestartGroup, 3504, 0);
                        androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                        TextStyle bodyMedium5 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                        TextKt.m2432Text4IGK_g("Chat on WhatsApp", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium5.spanStyle.m5841getColor0d7_KjU() : ColorKt.Color(4280669030L), (16645977 & 2) != 0 ? bodyMedium5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium5.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium5.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(956419685);
                        if (((Boolean) stateCollectAsState4.getValue()).booleanValue()) {
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
                            Modifier modifierM669paddingVpY3zN13 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(companion6, false, null, null, aVar3, 7, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f9));
                            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN13);
                            constructor5 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap13);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier13, companion8.getSetModifier());
                            float f110 = 14;
                            composer2 = composerStartRestartGroup;
                            IconKt.m1877Iconww6aTOc(ReceiptKt.getReceipt(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                            androidx.compose.foundation.text.modifiers.a.q(6, companion6, composer2, 6);
                            TextStyle bodySmall2 = materialTheme.getTypography(composer2, i7).getBodySmall();
                            TextKt.m2432Text4IGK_g("View My Orders", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(4)), composer2, 6);
                            IconKt.m1877Iconww6aTOc(ChevronRightKt.getChevronRight(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                            composer2.endNode();
                        } else {
                            composer2 = composerStartRestartGroup;
                        }
                        if (p035i0.a.z(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    builder.append("Print.Bind.Deliver");
                    builder.pop(iPushStyle2);
                    AnnotatedString annotatedString2 = builder.toAnnotatedString();
                    materialTheme = MaterialTheme.INSTANCE;
                    i7 = MaterialTheme.$stable;
                    TextStyle displaySmall2 = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                    TextStyle textStyleM5917copyp1EtxEg2 = displaySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? displaySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? displaySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(32), (16645977 & 4) != 0 ? displaySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? displaySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? displaySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? displaySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? displaySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? displaySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.5d), (16645977 & Fields.RotationX) != 0 ? displaySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? displaySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? displaySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? displaySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? displaySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? displaySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? displaySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? displaySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? displaySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? displaySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(38), (16645977 & 262144) != 0 ? displaySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? displaySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? displaySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? displaySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? displaySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? displaySmall2.paragraphStyle.getTextMotion() : null);
                    TextAlign.Companion companion10 = TextAlign.Companion;
                    TextKt.m2433TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m6285boximpl(companion10.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, textStyleM5917copyp1EtxEg2, composerStartRestartGroup, 0, 0, 130558);
                    f6 = 16;
                    b.m(f6, companion6, composerStartRestartGroup, 6);
                    TextStyle bodyMedium6 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                    f7 = 8;
                    TextKt.m2432Text4IGK_g("Upload your PDF, choose print specs, and let us handle the rest. We create premium notebooks and deliver them to your doorstep – made for Indian students. 🇮🇳", PaddingKt.m670paddingVpY3zN4$default(companion6, Dp.m6403constructorimpl(f7), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium6.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium6.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium6.paragraphStyle.m5797getTextAligne0LSkKk() : companion10.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium6.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 262144) != 0 ? bodyMedium6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium6.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 54, 0, 65532);
                    float f111 = 20;
                    b.m(f111, companion6, composerStartRestartGroup, 6);
                    b(composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), composerStartRestartGroup, 6);
                    stateCollectAsState = SnapshotStateKt.collectAsState(hVar.g, null, composerStartRestartGroup, 0, 1);
                    stateCollectAsState2 = SnapshotStateKt.collectAsState(hVar.f13533o, null, composerStartRestartGroup, 0, 1);
                    stateCollectAsState3 = SnapshotStateKt.collectAsState(hVar.t, null, composerStartRestartGroup, 0, 1);
                    if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                        str3 = "lifetime";
                    } else {
                        if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                            str3 = (String) stateCollectAsState2.getValue();
                        } else {
                            str2 = null;
                        }
                        boolean zBooleanValue7 = ((Boolean) stateCollectAsState4.getValue()).booleanValue();
                        boolean zBooleanValue8 = ((Boolean) stateCollectAsState9.getValue()).booleanValue();
                        boolean zBooleanValue9 = ((Boolean) stateCollectAsState8.getValue()).booleanValue();
                        h hVar4 = (h) stateCollectAsState5.getValue();
                        String str8 = (String) stateCollectAsState7.getValue();
                        String str9 = (String) stateCollectAsState6.getValue();
                        composerStartRestartGroup.startReplaceGroup(956300605);
                        if ((29360128 & i6) == 8388608) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            objRememberedValue = new O(7, aVar3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new O(7, aVar3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        p(zBooleanValue7, zBooleanValue8, zBooleanValue9, hVar4, str8, str9, (O3.a) objRememberedValue, null, composerStartRestartGroup, 0);
                        f8 = 12;
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(956305367);
                        if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                            Modifier modifierM669paddingVpY3zN14 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4));
                            f9 = f7;
                            f10 = 6;
                            Modifier modifierM669paddingVpY3zN15 = PaddingKt.m669paddingVpY3zN4(b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierM669paddingVpY3zN14, f9), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN15);
                            constructor6 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG9 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl6, currentCompositionLocalMap14);
                            if (composerM3407constructorimpl6.getInserting()) {
                                f11 = f10;
                                if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier14, companion8.getSetModifier());
                                TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                                i8 = 6;
                                b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                            } else {
                                f11 = f10;
                            }
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG9);
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier14, companion8.getSetModifier());
                            TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                            i8 = 6;
                            b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                        } else {
                            f9 = f7;
                            i8 = 6;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        o(str2, hVar, null, composerStartRestartGroup, (i6 << 3) & 112);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), composerStartRestartGroup, i8);
                        float f112 = 1;
                        float f113 = 32;
                        Modifier modifierM669paddingVpY3zN16 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion6, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f112), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, aVar2, 7, null), Dp.m6403constructorimpl(f113), Dp.m6403constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN16);
                        constructor = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl, currentCompositionLocalMap15);
                        if (composerM3407constructorimpl.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier15, companion8.getSetModifier());
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                        constructor2 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap16);
                        if (composerM3407constructorimpl2.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier16, companion8.getSetModifier());
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        outlined = Icons.Outlined.INSTANCE;
                        IconKt.m1877Iconww6aTOc(CalculateKt.getCalculate(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), ColorKt.Color(4290807036L), composerStartRestartGroup, 3504, 0);
                        androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                        TextStyle bodyMedium7 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                        TextKt.m2432Text4IGK_g("Price Calculator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium7.spanStyle.m5841getColor0d7_KjU() : companion2.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium7.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium7.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                        b.r(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                        float f114 = 30;
                        Modifier modifierE3 = b.e(f114, BackgroundKt.m207backgroundbw27NRU$default(b.d(f114, companion6), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f112), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
                        composerStartRestartGroup.startReplaceGroup(956388427);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new J(context, 7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new J(context, 7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM669paddingVpY3zN17 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE3, false, null, null, (O3.a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f113), Dp.m6403constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN17);
                        constructor3 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap17);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                        }
                        companion4 = companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.getStart(), b.c(companion8, composerM3407constructorimpl3, modifierMaterializeModifier17, companion4), composerStartRestartGroup, 48);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                        constructor4 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap18);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier18, companion8.getSetModifier());
                        IconKt.m1876Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_whatsapp_glyph, composerStartRestartGroup, 0), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), ColorKt.Color(4280669030L), composerStartRestartGroup, 3504, 0);
                        androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                        TextStyle bodyMedium8 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                        TextKt.m2432Text4IGK_g("Chat on WhatsApp", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium8.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium8.spanStyle.m5841getColor0d7_KjU() : ColorKt.Color(4280669030L), (16645977 & 2) != 0 ? bodyMedium8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium8.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium8.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium8.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(956419685);
                        if (((Boolean) stateCollectAsState4.getValue()).booleanValue()) {
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                            Arrangement.HorizontalOrVertical center3 = arrangement.getCenter();
                            Modifier modifierM669paddingVpY3zN18 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(companion6, false, null, null, aVar3, 7, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f9));
                            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(center3, centerVertically3, composerStartRestartGroup, 54);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN18);
                            constructor5 = companion8.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl5, currentCompositionLocalMap19);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion8.getSetModifier());
                            float f115 = 14;
                            composer2 = composerStartRestartGroup;
                            IconKt.m1877Iconww6aTOc(ReceiptKt.getReceipt(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f115)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                            androidx.compose.foundation.text.modifiers.a.q(6, companion6, composer2, 6);
                            TextStyle bodySmall3 = materialTheme.getTypography(composer2, i7).getBodySmall();
                            TextKt.m2432Text4IGK_g("View My Orders", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(4)), composer2, 6);
                            IconKt.m1877Iconww6aTOc(ChevronRightKt.getChevronRight(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f115)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                            composer2.endNode();
                        } else {
                            composer2 = composerStartRestartGroup;
                        }
                        if (p035i0.a.z(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    str2 = str3;
                    boolean zBooleanValue10 = ((Boolean) stateCollectAsState4.getValue()).booleanValue();
                    boolean zBooleanValue11 = ((Boolean) stateCollectAsState9.getValue()).booleanValue();
                    boolean zBooleanValue12 = ((Boolean) stateCollectAsState8.getValue()).booleanValue();
                    h hVar5 = (h) stateCollectAsState5.getValue();
                    String str10 = (String) stateCollectAsState7.getValue();
                    String str11 = (String) stateCollectAsState6.getValue();
                    composerStartRestartGroup.startReplaceGroup(956300605);
                    if ((29360128 & i6) == 8388608) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z4) {
                        objRememberedValue = new O(7, aVar3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new O(7, aVar3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    p(zBooleanValue10, zBooleanValue11, zBooleanValue12, hVar5, str10, str11, (O3.a) objRememberedValue, null, composerStartRestartGroup, 0);
                    f8 = 12;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(956305367);
                    if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
                        Modifier modifierM669paddingVpY3zN19 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4));
                        f9 = f7;
                        f10 = 6;
                        Modifier modifierM669paddingVpY3zN110 = PaddingKt.m669paddingVpY3zN4(b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierM669paddingVpY3zN19, f9), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN110);
                        constructor6 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG10 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl6, currentCompositionLocalMap110);
                        if (composerM3407constructorimpl6.getInserting()) {
                            f11 = f10;
                            if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier110, companion8.getSetModifier());
                            TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                            i8 = 6;
                            b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                        } else {
                            f11 = f10;
                        }
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG10);
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier110, companion8.getSetModifier());
                        TextKt.m2432Text4IGK_g("💎 First Order Diamond Deal Applied!", BoxScopeInstance.INSTANCE.align(companion6, companion.getCenter()), ColorKt.Color(4280472558L), TextUnitKt.getSp(10), (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131024);
                        i8 = 6;
                        b.n(composerStartRestartGroup, f11, companion6, composerStartRestartGroup, 6);
                    } else {
                        f9 = f7;
                        i8 = 6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    o(str2, hVar, null, composerStartRestartGroup, (i6 << 3) & 112);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), composerStartRestartGroup, i8);
                    float f116 = 1;
                    float f117 = 32;
                    Modifier modifierM669paddingVpY3zN111 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion6, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f116), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, aVar2, 7, null), Dp.m6403constructorimpl(f117), Dp.m6403constructorimpl(f8));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN111);
                    constructor = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl, currentCompositionLocalMap111);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier111, companion8.getSetModifier());
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                    constructor2 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl2, currentCompositionLocalMap112);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier112, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    outlined = Icons.Outlined.INSTANCE;
                    IconKt.m1877Iconww6aTOc(CalculateKt.getCalculate(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), ColorKt.Color(4290807036L), composerStartRestartGroup, 3504, 0);
                    androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                    TextStyle bodyMedium9 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                    TextKt.m2432Text4IGK_g("Price Calculator", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium9.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium9.spanStyle.m5841getColor0d7_KjU() : companion2.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium9.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium9.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium9.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium9.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                    b.r(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                    float f118 = 30;
                    Modifier modifierE4 = b.e(f118, BackgroundKt.m207backgroundbw27NRU$default(b.d(f118, companion6), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f116), Color.m3926copywmQWz5c$default(ColorKt.Color(4280669030L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null));
                    composerStartRestartGroup.startReplaceGroup(956388427);
                    zChangedInstance = composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue2 = new J(context, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new J(context, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM669paddingVpY3zN112 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE4, false, null, null, (O3.a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f117), Dp.m6403constructorimpl(f8));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN112);
                    constructor3 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl3, currentCompositionLocalMap113);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    companion4 = companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement.getStart(), b.c(companion8, composerM3407constructorimpl3, modifierMaterializeModifier113, companion4), composerStartRestartGroup, 48);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                    constructor4 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl4, currentCompositionLocalMap114);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier114, companion8.getSetModifier());
                    IconKt.m1876Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_whatsapp_glyph, composerStartRestartGroup, 0), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f111)), ColorKt.Color(4280669030L), composerStartRestartGroup, 3504, 0);
                    androidx.compose.foundation.text.modifiers.a.q(f9, companion6, composerStartRestartGroup, 6);
                    TextStyle bodyMedium10 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                    TextKt.m2432Text4IGK_g("Chat on WhatsApp", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium10.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium10.spanStyle.m5841getColor0d7_KjU() : ColorKt.Color(4280669030L), (16645977 & 2) != 0 ? bodyMedium10.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium10.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium10.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium10.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium10.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(956419685);
                    if (((Boolean) stateCollectAsState4.getValue()).booleanValue()) {
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        Alignment.Vertical centerVertically4 = companion4.getCenterVertically();
                        Arrangement.HorizontalOrVertical center4 = arrangement.getCenter();
                        Modifier modifierM669paddingVpY3zN113 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(companion6, false, null, null, aVar3, 7, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f9));
                        MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(center4, centerVertically4, composerStartRestartGroup, 54);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN113);
                        constructor5 = companion8.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl5, currentCompositionLocalMap115);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier115, companion8.getSetModifier());
                        float f119 = 14;
                        composer2 = composerStartRestartGroup;
                        IconKt.m1877Iconww6aTOc(ReceiptKt.getReceipt(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f119)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                        androidx.compose.foundation.text.modifiers.a.q(6, companion6, composer2, 6);
                        TextStyle bodySmall4 = materialTheme.getTypography(composer2, i7).getBodySmall();
                        TextKt.m2432Text4IGK_g("View My Orders", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : companion3.getSemiBold(), (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(4)), composer2, 6);
                        IconKt.m1877Iconww6aTOc(ChevronRightKt.getChevronRight(outlined), (String) null, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f119)), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
                        composer2.endNode();
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if (p035i0.a.z(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushStyle2);
                    throw th;
                }
                builder.append("We ");
                builder.pop(iPushStyle);
                Brush brushM3878linearGradientmHitzGk$default2 = Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null);
                companion3 = FontWeight.Companion;
                iPushStyle2 = builder.pushStyle(new SpanStyle(brushM3878linearGradientmHitzGk$default2, 0.0f, 0L, companion3.getExtraBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 131062, null));
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier, companion8.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            builder = new AnnotatedString.Builder(0, 1, null);
            companion2 = Color.Companion;
            iPushStyle = builder.pushStyle(new SpanStyle(Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC2168g) null));
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C0134b(hVar, printOrderViewModel, f5, z3, str, aVar, aVar2, aVar3, i5));
        }
    }

    public static final void h(Composer composer, int i5) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1951825417);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951825417, i5, -1, "com.notescrafter.ui.screens.PrintHowItWorksSection (PrintLandingScreen.kt:1019)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i6).getHeadlineLarge();
            TextKt.m2432Text4IGK_g("How It Works", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineLarge.platformStyle : null, (16645977 & 1048576) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i6).getBodyMedium();
            TextKt.m2432Text4IGK_g("Get your premium notebook delivered in three simple steps.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(28)), composer2, 6);
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            List listS = v.S(new Ld(UploadFileKt.getUploadFile(outlined), "01", "Upload Your PDF", "Securely upload your document and configure specs."), new Ld(PlaceKt.getPlace(outlined), "02", "Add Address Details", "Provide your contact information and shipping address."), new Ld(PaymentsKt.getPayments(outlined), "03", "Pay the Amount", "Complete your order securely and track your shipment."));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(16)), companion2.getStart(), composer2, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl2, modifierMaterializeModifier2, composer2, 1678441918);
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                m((Ld) it.next(), composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final p092v3.h authManager, final PrintOrderViewModel viewModel, final O3.a onStartOrder, final O3.a onNavigateToCalculator, final O3.a aVar, final O3.a aVar2, Modifier modifier, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        Brush brushM3876horizontalGradient8A3gB4$default;
        final Modifier modifier2;
        kotlin.jvm.internal.o.f(authManager, "authManager");
        kotlin.jvm.internal.o.f(viewModel, "viewModel");
        kotlin.jvm.internal.o.f(onStartOrder, "onStartOrder");
        kotlin.jvm.internal.o.f(onNavigateToCalculator, "onNavigateToCalculator");
        Composer composerStartRestartGroup = composer.startRestartGroup(685640475);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(authManager) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onStartOrder) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateToCalculator) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.RenderEffect : 65536;
        }
        int i7 = i6 | 1572864;
        if ((599187 & i7) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(685640475, i7, -1, "com.notescrafter.ui.screens.PrintLandingScreen (PrintLandingScreen.kt:79)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.f10877P, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(viewModel.f10879R, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(authManager.e, null, composerStartRestartGroup, 0, 1);
            Boolean bool = (Boolean) stateCollectAsState3.getValue();
            bool.getClass();
            composerStartRestartGroup.startReplaceGroup(-1583983114);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changed(stateCollectAsState3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Gb(viewModel, stateCollectAsState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (e) objRememberedValue, composerStartRestartGroup, 0);
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_cta", composerStartRestartGroup, 6, 0), 1.0f, 1.03f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "pulse_scale", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            composerStartRestartGroup.startReplaceGroup(-1583964445);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1583963094);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1583960516);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new O6(25, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                q((O3.a) objRememberedValue3, onStartOrder, composerStartRestartGroup, ((i7 >> 3) & 112) | 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            O3.a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            a(null, composerStartRestartGroup, 0);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            O3.a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(100), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            O3.a constructor3 = companion4.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(24)), composerStartRestartGroup, 6);
            int i8 = i7 << 9;
            g(authManager, viewModel, stateAnimateFloat.getValue().floatValue(), ((Boolean) stateCollectAsState.getValue()).booleanValue(), (String) stateCollectAsState2.getValue(), onStartOrder, onNavigateToCalculator, aVar, composerStartRestartGroup, (i7 & 126) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
            float f5 = 48;
            composer2 = composerStartRestartGroup;
            b.m(f5, companion, composer2, 6);
            f(composer2, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
            h(composer2, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
            j(composer2, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
            l(composer2, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
            d(composer2, 0);
            b.m(28, companion, composer2, 6);
            n(aVar2, composer2, (i7 >> 15) & 14);
            composer2.endNode();
            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composer2), composer2);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
            boolean z3 = ((Boolean) stateCollectAsState3.getValue()).booleanValue() && !((Boolean) stateCollectAsState.getValue()).booleanValue();
            float fFloatValue = z3 ? 1.0f : stateAnimateFloat.getValue().floatValue();
            if (z3) {
                Brush.Companion companion5 = Brush.Companion;
                Color.Companion companion6 = Color.Companion;
                brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion5, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
            } else {
                brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null);
            }
            float f6 = 20;
            SurfaceKt.m2282SurfaceT9BRK9s(BorderKt.m220borderxT4_qwU(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion3.getBottomCenter()), 0.0f, 1, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f6), 0.0f, 0.0f, 12, null)), null, Color.m3926copywmQWz5c$default(a.f15993v, 0.95f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1314559822, true, new Ib(fFloatValue, brushM3876horizontalGradient8A3gB4$default, z3, stateCollectAsState3, stateCollectAsState, onStartOrder, coroutineScope, authManager, context), composer2, 54), composer2, 12583296, 122);
            if (androidx.compose.foundation.text.modifiers.a.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.rb
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    O3.a aVar3 = aVar2;
                    Modifier modifier3 = modifier2;
                    Rb.i(authManager, viewModel, onStartOrder, onNavigateToCalculator, aVar, aVar3, modifier3, (Composer) obj, iUpdateChangedFlags);
                    return o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void j(Composer composer, int i5) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1100595208);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1100595208, i5, -1, "com.notescrafter.ui.screens.PrintMadeForSection (PrintLandingScreen.kt:1125)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i6).getHeadlineLarge();
            TextKt.m2432Text4IGK_g("Made For", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineLarge.platformStyle : null, (16645977 & 1048576) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i6).getBodyMedium();
            TextKt.m2432Text4IGK_g("Our notebooks are crafted for your specific intensive studying needs.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            List listS = v.S(new h("College Students", SchoolKt.getSchool(outlined)), new h("UPSC & JEE Aspirants", FlagKt.getFlag(outlined)), new h("Coaching Institutes", CorporateFareKt.getCorporateFare(outlined)), new h("Office Notes", WorkOutlineKt.getWorkOutline(outlined)), new h("Journaling", EditKt.getEdit(outlined)), new h("Gifted Notebooks", CardGiftcardKt.getCardGiftcard(outlined)));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10));
            PaddingValues paddingValuesM663PaddingValuesYgX7TsA$default = PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(4), 0.0f, 2, null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(171134854);
            boolean zChanged = composerStartRestartGroup.changed(listS);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new g(listS, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, paddingValuesM663PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue, composerStartRestartGroup, 24966, 234);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 3));
        }
    }

    public static final void k(String str, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-965065454);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-965065454, i6, -1, "com.notescrafter.ui.screens.PrintReviewCard (PrintLandingScreen.kt:1236)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), a.u, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2037477811, true, new Jb(str), composerStartRestartGroup, 54), composerStartRestartGroup, 196662, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2667s4(str, i5, 1));
        }
    }

    public static final void l(Composer composer, int i5) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(831516379);
        if (i5 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831516379, i5, -1, "com.notescrafter.ui.screens.PrintSocialProofSection (PrintLandingScreen.kt:1195)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i6).getHeadlineLarge();
            TextKt.m2432Text4IGK_g("Loved by Students", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? headlineLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineLarge.platformStyle : null, (16645977 & 1048576) != 0 ? headlineLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            b.m(8, companion, composerStartRestartGroup, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i6).getBodyMedium();
            TextKt.m2432Text4IGK_g("Join thousands of students who have upgraded their study materials.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            composer2 = composerStartRestartGroup;
            b.m(f5, companion, composer2, 6);
            List listS = v.S("“The cover quality feels premium.”", "“Pages flip smoothly and printing looks professional.”", "“Better than local stationery notebooks.”", "“Perfect for coaching notes and revision.”");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(16)), companion2.getStart(), composer2, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl2, modifierMaterializeModifier2, composer2, 456076860);
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                k((String) it.next(), composer2, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2526j6(i5, 5));
        }
    }

    public static final void m(Ld ld, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1811312906);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(ld) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811312906, i6, -1, "com.notescrafter.ui.screens.PrintStepCard (PrintLandingScreen.kt:1061)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), a.u, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1226255717, true, new Kb(ld), composerStartRestartGroup, 54), composerStartRestartGroup, 196662, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2445e5(ld, i5, 2));
        }
    }

    public static final void n(O3.a aVar, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(999122373);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999122373, i6, -1, "com.notescrafter.ui.screens.PrintSupportSection (PrintLandingScreen.kt:2573)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-675868896, true, new Lb(aVar), composerStartRestartGroup, 54), composerStartRestartGroup, 196662, 28);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2590n6(i5, 1, aVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:102:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:105:0x0514  */
    /* JADX WARN: Code duplicated, block: B:108:0x0520  */
    /* JADX WARN: Code duplicated, block: B:109:0x0524  */
    /* JADX WARN: Code duplicated, block: B:114:0x0543  */
    /* JADX WARN: Code duplicated, block: B:117:0x057f  */
    /* JADX WARN: Code duplicated, block: B:120:0x058b  */
    /* JADX WARN: Code duplicated, block: B:121:0x058f  */
    /* JADX WARN: Code duplicated, block: B:126:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x061c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0622  */
    /* JADX WARN: Code duplicated, block: B:134:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:137:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x0703  */
    /* JADX WARN: Code duplicated, block: B:146:0x0760  */
    /* JADX WARN: Code duplicated, block: B:148:0x0766  */
    /* JADX WARN: Code duplicated, block: B:151:0x0811  */
    /* JADX WARN: Code duplicated, block: B:154:0x081d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0821  */
    /* JADX WARN: Code duplicated, block: B:160:0x0842  */
    /* JADX WARN: Code duplicated, block: B:163:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:165:0x08ab  */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    public static final void o(String str, p092v3.h hVar, Modifier modifier, Composer composer, int i5) {
        Composer composer2;
        Modifier modifier2;
        RowScopeInstance rowScopeInstance;
        BoxScopeInstance boxScopeInstance;
        int i6;
        int currentCompositeKeyHash;
        O3.a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        O3.a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        Color.Companion companion;
        long jM3926copywmQWz5c$default;
        int currentCompositeKeyHash3;
        O3.a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        long jM3926copywmQWz5c$default2;
        int currentCompositeKeyHash4;
        O3.a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        long jM3926copywmQWz5c$default3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-25422582);
        int i7 = (i5 & 6) == 0 ? i5 | (composerStartRestartGroup.changed(str) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(hVar) ? 32 : 16;
        }
        int i8 = i7 | 384;
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-25422582, i8, -1, "com.notescrafter.ui.screens.PrintingRateCardGrid (PrintLandingScreen.kt:2382)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(hVar.f13538x, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1956092912);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2510i6(stateCollectAsState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            c cVar = (c) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1956086191);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C2510i6(stateCollectAsState, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            c cVar2 = (c) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            String str2 = (String) cVar.invoke(null);
            String str3 = (String) cVar2.invoke(null);
            Color.Companion companion3 = Color.Companion;
            List<Vd> listS = v.S(new Vd(null, "Guest", str2, str3, Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), new Vd("monthly", "Silver", (String) cVar.invoke("monthly"), (String) cVar2.invoke("monthly"), ColorKt.Color(4287931320L), Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), new Vd("half_yearly", "Gold", (String) cVar.invoke("half_yearly"), (String) cVar2.invoke("half_yearly"), ColorKt.Color(4294286859L), Color.m3926copywmQWz5c$default(ColorKt.Color(4294286859L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), new Vd("annual", "Platinum", (String) cVar.invoke("annual"), (String) cVar2.invoke("annual"), ColorKt.Color(4279548070L), Color.m3926copywmQWz5c$default(ColorKt.Color(4279548070L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), new Vd("lifetime", "Diamond", (String) cVar.invoke("lifetime"), (String) cVar2.invoke("lifetime"), ColorKt.Color(4278630100L), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)));
            float f5 = 8;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion4 = Alignment.Companion;
            Alignment.Horizontal start = companion4.getStart();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), start, composerStartRestartGroup, 48);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            O3.a constructor5 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap);
            if (composerM3407constructorimpl5.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            float f6 = 4;
            TextKt.m2432Text4IGK_g("Your Printing Rates", PaddingKt.m672paddingqDBjuR0$default(companion2, Dp.m6403constructorimpl(f6), 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 6, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 54, 0, 65532);
            Modifier.Companion companion6 = companion2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            float f7 = 6;
            Composer composer3 = composerStartRestartGroup;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion4.getCenterVertically(), composer3, 54);
            ?? r6 = 0;
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
            O3.a constructor6 = companion5.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor6);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
            e eVarG6 = p035i0.a.g(companion5, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap2);
            if (composerM3407constructorimpl6.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer3.startReplaceGroup(37834264);
            for (Vd vd : listS) {
                boolean zB = kotlin.jvm.internal.o.b(vd.f14538a, str);
                Modifier.Companion companion7 = Modifier.Companion;
                float f8 = 10;
                Composer composer4 = composer3;
                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f8, BackgroundKt.m207backgroundbw27NRU$default(b.g(RowScope.weight$default(rowScopeInstance2, companion7, zB ? 1.1f : 0.95f, false, 2, null), f8), zB ? vd.f14542f : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), zB ? Dp.m6403constructorimpl((float) 1.5d) : Dp.m6403constructorimpl(1), zB ? vd.e : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), zB ? Dp.m6403constructorimpl(f8) : Dp.m6403constructorimpl(f5));
                Alignment.Companion companion8 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getTopStart(), r6);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer4, r6);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM669paddingVpY3zN5);
                ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                O3.a constructor7 = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor7);
                } else {
                    composer4.useNode();
                }
                Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer4);
                e eVarG7 = p035i0.a.g(companion9, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap3);
                if (composerM3407constructorimpl7.getInserting()) {
                    rowScopeInstance = rowScopeInstance2;
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion9.getSetModifier());
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(-267954780);
                    if (zB) {
                        float f9 = 2;
                        i6 = 0;
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance.align(companion7, companion8.getTopEnd()), 0.0f, Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(f9), 0.0f, 9, null), Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4279286145L), null, 2, null), composer4, 0);
                    } else {
                        i6 = 0;
                    }
                    composer4.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = companion8.getCenterHorizontally();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composer4, 48);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, i6);
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default2);
                    constructor = companion9.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer4);
                    eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion9.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(38));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getSpaceBetween(), companion8.getCenterHorizontally(), composer4, 54);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierM699height3ABfNKs);
                    constructor2 = companion9.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer4);
                    eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier5, companion9.getSetModifier());
                    companion = Color.Companion;
                    long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    long sp = TextUnitKt.getSp(7);
                    FontWeight.Companion companion10 = FontWeight.Companion;
                    float f10 = f7;
                    Modifier.Companion companion11 = companion6;
                    TextKt.m2432Text4IGK_g("Pass", (Modifier) null, jM3926copywmQWz5c$default4, sp, (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                    String str4 = vd.f14539b;
                    if (zB) {
                        jM3926copywmQWz5c$default = companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(str4, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(8), (FontStyle) null, companion10.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composer4, 199680, 3120, 120786);
                    b.n(composer4, f10, companion7, composer4, 6);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    float f11 = 1;
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(modifierFillMaxWidth$default3, Dp.m6403constructorimpl(f11)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer4, 6);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f10)), composer4, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion8.getCenterHorizontally(), composer4, 48);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion7);
                    constructor3 = companion9.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer4);
                    eVarG3 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier6, companion9.getSetModifier());
                    TextKt.m2432Text4IGK_g("B&W", (Modifier) null, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(7), (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                    if (zB) {
                        jM3926copywmQWz5c$default2 = companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(vd.f14540c, (Modifier) null, jM3926copywmQWz5c$default2, TextUnitKt.getSp(10), (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 199680, 0, 131026);
                    b.n(composer4, f10, companion7, composer4, 6);
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), Dp.m6403constructorimpl(f11)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer4, 6);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f10)), composer4, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion8.getCenterHorizontally(), composer4, 48);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer4, companion7);
                    constructor4 = companion9.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer4);
                    eVarG4 = p035i0.a.g(companion9, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl4, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier7, companion9.getSetModifier());
                    TextKt.m2432Text4IGK_g("Color", (Modifier) null, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(7), (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                    if (zB) {
                        jM3926copywmQWz5c$default3 = ColorKt.Color(4279286145L);
                    } else {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(vd.f14541d, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(10), (FontStyle) null, companion10.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 199680, 0, 131026);
                    composer4.endNode();
                    composer4.endNode();
                    composer4.endNode();
                    r6 = 0;
                    f7 = f10;
                    composer3 = composer4;
                    rowScopeInstance2 = rowScopeInstance;
                    companion6 = companion11;
                }
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion9.getSetModifier());
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer4.startReplaceGroup(-267954780);
                if (zB) {
                    float f12 = 2;
                    i6 = 0;
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance.align(companion7, companion8.getTopEnd()), 0.0f, Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f12), 0.0f, 9, null), Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4279286145L), null, 2, null), composer4, 0);
                } else {
                    i6 = 0;
                }
                composer4.endReplaceGroup();
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally2 = companion8.getCenterHorizontally();
                Arrangement arrangement3 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), centerHorizontally2, composer4, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, i6);
                CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default4);
                constructor = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor);
                } else {
                    composer4.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer4);
                eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap8);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(38));
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement3.getSpaceBetween(), companion8.getCenterHorizontally(), composer4, 54);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer4, modifierM699height3ABfNKs2);
                constructor2 = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor2);
                } else {
                    composer4.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer4);
                eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap9);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier9, companion9.getSetModifier());
                companion = Color.Companion;
                long jM3926copywmQWz5c$default5 = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                long sp2 = TextUnitKt.getSp(7);
                FontWeight.Companion companion12 = FontWeight.Companion;
                float f13 = f7;
                Modifier.Companion companion13 = companion6;
                TextKt.m2432Text4IGK_g("Pass", (Modifier) null, jM3926copywmQWz5c$default5, sp2, (FontStyle) null, companion12.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                String str5 = vd.f14539b;
                if (zB) {
                    jM3926copywmQWz5c$default = companion.m3964getWhite0d7_KjU();
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(8), (FontStyle) null, companion12.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composer4, 199680, 3120, 120786);
                b.n(composer4, f13, companion7, composer4, 6);
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                float f14 = 1;
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(modifierFillMaxWidth$default5, Dp.m6403constructorimpl(f14)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer4, 6);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f13)), composer4, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion8.getCenterHorizontally(), composer4, 48);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer4, companion7);
                constructor3 = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor3);
                } else {
                    composer4.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer4);
                eVarG3 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl3, currentCompositionLocalMap10);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier10, companion9.getSetModifier());
                TextKt.m2432Text4IGK_g("B&W", (Modifier) null, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(7), (FontStyle) null, companion12.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                if (zB) {
                    jM3926copywmQWz5c$default2 = companion.m3964getWhite0d7_KjU();
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(vd.f14540c, (Modifier) null, jM3926copywmQWz5c$default2, TextUnitKt.getSp(10), (FontStyle) null, companion12.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 199680, 0, 131026);
                b.n(composer4, f13, companion7, composer4, 6);
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), Dp.m6403constructorimpl(f14)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer4, 6);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f13)), composer4, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion8.getCenterHorizontally(), composer4, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer4, companion7);
                constructor4 = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer4.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer4);
                eVarG4 = p035i0.a.g(companion9, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap11);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11, companion9.getSetModifier());
                TextKt.m2432Text4IGK_g("Color", (Modifier) null, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(7), (FontStyle) null, companion12.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                if (zB) {
                    jM3926copywmQWz5c$default3 = ColorKt.Color(4279286145L);
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(vd.f14541d, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(10), (FontStyle) null, companion12.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 199680, 0, 131026);
                composer4.endNode();
                composer4.endNode();
                composer4.endNode();
                r6 = 0;
                f7 = f13;
                composer3 = composer4;
                rowScopeInstance2 = rowScopeInstance;
                companion6 = companion13;
            }
            composer2 = composer3;
            Modifier.Companion companion14 = companion6;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion14;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a(str, hVar, modifier2, i5, 4));
        }
    }

    public static final void p(final boolean z3, final boolean z4, final boolean z5, final h hVar, final String str, final String str2, final O3.a aVar, Modifier modifier, Composer composer, final int i5) {
        int i6;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-215715271);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z5) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(hVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? 1048576 : 524288;
        }
        int i7 = i6 | 12582912;
        if ((4793491 & i7) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-215715271, i7, -1, "com.notescrafter.ui.screens.UnifiedShippingAndEddCard (PrintLandingScreen.kt:2219)");
            }
            modifier2 = companion;
            j.a(PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(8)), Color.Companion.m3962getTransparent0d7_KjU(), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-598366114, true, new Mb(Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4278556265L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4279080072L), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4278556265L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), z3, z4, z5, hVar, aVar, str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.sb
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    O3.a aVar2 = aVar;
                    Modifier modifier4 = modifier3;
                    Rb.p(z3, z4, z5, hVar, str, str2, aVar2, modifier4, (Composer) obj, iUpdateChangedFlags);
                    return o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(final O3.a onDismissRequest, final O3.a onStartOrder, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        kotlin.jvm.internal.o.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.o.f(onStartOrder, "onStartOrder");
        Composer composerStartRestartGroup = composer.startRestartGroup(371619874);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onStartOrder) ? 32 : 16;
        }
        int i7 = i6;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(371619874, i7, -1, "com.notescrafter.ui.screens.WeekendFlashSaleDialog (PrintLandingScreen.kt:388)");
            }
            composerStartRestartGroup.startReplaceGroup(-477130045);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            o oVar = o.f154a;
            composerStartRestartGroup.startReplaceGroup(-477128102);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Nb(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue2, composerStartRestartGroup, 6);
            long jLongValue = ((Number) mutableState.getValue()).longValue();
            composerStartRestartGroup.startReplaceGroup(-477123471);
            boolean zChanged = composerStartRestartGroup.changed(jLongValue);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                long jCurrentTimeMillis = System.currentTimeMillis() + 19800000;
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.setTimeInMillis(jCurrentTimeMillis);
                int i8 = calendar.get(7);
                calendar.add(6, i8 == 7 ? 0 : (14 - i8) % 7);
                calendar.set(11, 11);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long timeInMillis = calendar.getTimeInMillis();
                calendar.set(11, 23);
                objRememberedValue3 = new h(Long.valueOf(timeInMillis - 19800000), Long.valueOf(calendar.getTimeInMillis() - 19800000));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            h hVar = (h) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            long jLongValue2 = ((Number) hVar.f148o).longValue();
            long jLongValue3 = ((Number) hVar.p).longValue();
            long jLongValue4 = ((Number) mutableState.getValue()).longValue();
            Long lValueOf = Long.valueOf(jLongValue4);
            if (jLongValue4 <= 0) {
                lValueOf = null;
            }
            long jLongValue5 = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
            boolean z3 = jLongValue5 >= jLongValue2 && jLongValue5 < jLongValue3;
            boolean z4 = jLongValue5 < jLongValue2;
            if (!z3 && !z4) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i9 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.tb
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = i9;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i10) {
                                case 0:
                                    Rb.q(onDismissRequest, onStartOrder, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    Rb.q(onDismissRequest, onStartOrder, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return o.f154a;
                        }
                    });
                    return;
                }
                return;
            }
            if (z3) {
                jLongValue2 = jLongValue3;
            }
            long j5 = jLongValue2 - jLongValue5;
            long j6 = j5 >= 0 ? j5 : 0L;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, new DialogProperties(false, false, false, 3, (AbstractC2168g) null), ComposableLambdaKt.rememberComposableLambda(-632199573, true, new Qb(onDismissRequest, onStartOrder, z3, InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("glow", composerStartRestartGroup, 6, 0), 0.5f, 1.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(900, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), "glowPulse", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0), (int) (j6 / 3600000), (int) ((j6 % 3600000) / 60000), (int) ((j6 % 60000) / 1000)), composer2, 54), composer2, (i7 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i10 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new e() { // from class: x3.tb
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = i10;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i11) {
                        case 0:
                            Rb.q(onDismissRequest, onStartOrder, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            Rb.q(onDismissRequest, onStartOrder, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return o.f154a;
                }
            });
        }
    }
}
