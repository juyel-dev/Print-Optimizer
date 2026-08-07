package p102x3;

import C3.u;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.outlined.ExpandMoreKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.service.PDFProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2294k;
import p083t3.I;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final int i5, final List list, final c onValueChange, final Modifier modifier, Composer composer, final int i6) {
        int i7;
        o.f(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-9879212);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(list) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onValueChange) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(modifier) ? Fields.Clip : Fields.Shape;
        }
        if ((i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-9879212, i7, -1, "com.notescrafter.ui.screens.DropdownSelector (EnhanceScreen.kt:621)");
            }
            composerStartRestartGroup.startReplaceGroup(-402679138);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelMedium();
            long j5 = p107y3.a.p;
            Modifier.Companion companion4 = Modifier.Companion;
            float f5 = 8;
            TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelMedium, composerStartRestartGroup, (i7 & 14) | 432, 0, 65528);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierE = b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), f5), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), p107y3.a.f15991r);
            composerStartRestartGroup.startReplaceGroup(1813401517);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new I(20, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(12));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g(String.valueOf(i5), (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 384, 0, 131066);
            IconKt.m1877Iconww6aTOc(ExpandMoreKt.getExpandMore(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, p107y3.a.q, composerStartRestartGroup, 3120, 4);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1813420654);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new I(21, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidMenu_androidKt.m1474DropdownMenuIlH_yew(zBooleanValue, (a) objRememberedValue3, BackgroundKt.m207backgroundbw27NRU$default(companion4, p107y3.a.f15983h, null, 2, null), 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(400069395, true, new C2763y4(list, onValueChange, i5, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 48, 2040);
            if (androidx.compose.foundation.text.modifiers.a.w(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.q4
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    String str2 = str;
                    List list2 = list;
                    c cVar = onValueChange;
                    Modifier modifier2 = modifier;
                    Z4.a(str2, i5, list2, cVar, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0325  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final List pages, final long j5, final int i5, final p087u3.b filterSettings, final p087u3.e outputSettings, final c onFilterChange, final c onOutputChange, final a onBack, final a onProcess, Modifier modifier, Composer composer, final int i6) {
        Context context;
        Object obj;
        Composer composer2;
        Modifier modifier2;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        o.f(pages, "pages");
        o.f(filterSettings, "filterSettings");
        o.f(outputSettings, "outputSettings");
        o.f(onFilterChange, "onFilterChange");
        o.f(onOutputChange, "onOutputChange");
        o.f(onBack, "onBack");
        o.f(onProcess, "onProcess");
        Composer composerStartRestartGroup = composer.startRestartGroup(1434900103);
        int i7 = (i6 & 6) == 0 ? (composerStartRestartGroup.changedInstance(pages) ? 4 : 2) | i6 : i6;
        if ((i6 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(i5) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(filterSettings) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(outputSettings) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onFilterChange) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onOutputChange) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onBack) ? 8388608 : 4194304;
        }
        if ((100663296 & i6) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onProcess) ? 67108864 : 33554432;
        }
        int i8 = i7 | 805306368;
        if ((306783379 & i8) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer5 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434900103, i8, -1, "com.notescrafter.ui.screens.EnhanceScreen (EnhanceScreen.kt:69)");
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1309921072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new PDFProcessor(context2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PDFProcessor pDFProcessor = (PDFProcessor) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1309917280);
            boolean zChanged = composerStartRestartGroup.changed(pages);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : pages) {
                    Context context3 = context2;
                    if (((g) obj2).isSelected()) {
                        arrayList.add(obj2);
                    }
                    context2 = context3;
                }
                context = context2;
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                context = context2;
                obj = objRememberedValue2;
            }
            List list = (List) obj;
            Object objK = b.k(composerStartRestartGroup, -1309914769);
            Composer.Companion companion3 = Composer.Companion;
            if (objK == companion3.getEmpty()) {
                objK = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableIntState mutableIntState = (MutableIntState) objK;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1309911548);
            boolean z3 = (i8 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = j5 > 1048576 ? String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1048576.0d)}, 1)) : String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1024.0d)}, 1));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                companion3 = companion3;
            }
            String str = (String) objRememberedValue3;
            Object objK2 = b.k(composerStartRestartGroup, -1309903760);
            if (objK2 == companion3.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState = (MutableState) objK2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting()) {
                composer2 = composerStartRestartGroup;
            } else {
                composer4 = composerStartRestartGroup;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                composer = composer4;
                composer2 = composer4;
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                boolean z4 = !((Boolean) mutableState.getValue()).booleanValue();
                Modifier.Companion companion5 = Modifier.Companion;
                Context context4 = context;
                modifier2 = companion;
                composer3 = composer;
                AnimatedVisibilityKt.AnimatedVisibility(z4, SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1227093403, true, new Q4(scrollStateRememberScrollState, outputSettings, str, i5, pages, filterSettings, pDFProcessor, onFilterChange, mutableIntState, mutableState, onOutputChange, list, onBack, context4, onProcess), composer3, 54), composer3, 196656, 28);
                composer3.endNode();
                AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1312047967, true, new S4(pages, filterSettings, onFilterChange, mutableState), composer3, 54), composer3, 196656, 28);
                composer5 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer5 = composer3;
                }
            }
            composer = composer4;
            composer2 = composer4;
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            Composer composer6 = composer2;
            composer6 = composer4;
            composer2 = composer4;
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            boolean z5 = !((Boolean) mutableState.getValue()).booleanValue();
            Modifier.Companion companion6 = Modifier.Companion;
            Context context5 = context;
            modifier2 = companion;
            composer3 = composer6;
            AnimatedVisibilityKt.AnimatedVisibility(z5, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1227093403, true, new Q4(scrollStateRememberScrollState, outputSettings, str, i5, pages, filterSettings, pDFProcessor, onFilterChange, mutableIntState, mutableState, onOutputChange, list, onBack, context5, onProcess), composer3, 54), composer3, 196656, 28);
            composer3.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1312047967, true, new S4(pages, filterSettings, onFilterChange, mutableState), composer3, 54), composer3, 196656, 28);
            composer5 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer5 = composer3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.p4
                @Override // O3.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    a aVar = onProcess;
                    Modifier modifier4 = modifier3;
                    Z4.b(pages, j5, i5, filterSettings, outputSettings, onFilterChange, onOutputChange, onBack, aVar, modifier4, (Composer) obj3, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void c(String str, String str2, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-650123341);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i6;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650123341, i7, -1, "com.notescrafter.ui.screens.EnhanceStatItem (EnhanceScreen.kt:518)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 8;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m718width3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(80)), f5), Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), p107y3.a.f15991r), 0.0f, Dp.m6403constructorimpl(f5), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
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
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.q, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall(), composerStartRestartGroup, (i7 & 14) | 3456, 0, 65522);
            b.m(4, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i8).getTitleMedium(), composer2, ((i7 >> 3) & 14) | 200064, 0, 65490);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2683t4(str, str2, i5, 0));
        }
    }

    public static final void d(String str, String str2, boolean z3, c onCheckedChange, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onCheckedChange, "onCheckedChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555621801);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onCheckedChange) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555621801, i6, -1, "com.notescrafter.ui.screens.FilterToggle (EnhanceScreen.kt:592)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f5), Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, (i6 & 14) | 196992, 0, 131034);
            composerStartRestartGroup.startReplaceGroup(795276964);
            if (str2.length() > 0) {
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, ((i6 >> 3) & 14) | 384, 0, 65530);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SwitchDefaults switchDefaults = SwitchDefaults.INSTANCE;
            Color.Companion companion4 = Color.Companion;
            composer2 = composerStartRestartGroup;
            SwitchKt.Switch(z3, onCheckedChange, null, null, false, switchDefaults.m2314colorsV1nXRL4(companion4.m3964getWhite0d7_KjU(), p107y3.a.f15978a, 0L, 0L, companion4.m3964getWhite0d7_KjU(), companion4.m3956getDarkGray0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 221238, SwitchDefaults.$stable << 18, 65484), null, composerStartRestartGroup, (i6 >> 6) & 126, 92);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2519j(str, str2, z3, onCheckedChange, i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(g gVar, p087u3.b filterSettings, PDFProcessor pdfProcessor, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(filterSettings, "filterSettings");
        o.f(pdfProcessor, "pdfProcessor");
        Composer composerStartRestartGroup = composer.startRestartGroup(1956138750);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(gVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(filterSettings) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(pdfProcessor) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1956138750, i7, -1, "com.notescrafter.ui.screens.LayoutPageThumbnail (EnhanceScreen.kt:757)");
            }
            Bitmap thumbnail = gVar.getThumbnail();
            composerStartRestartGroup.startReplaceGroup(-1103789519);
            boolean zChanged = composerStartRestartGroup.changed(thumbnail) | composerStartRestartGroup.changed(filterSettings);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Bitmap thumbnail2 = gVar.getThumbnail();
            composerStartRestartGroup.startReplaceGroup(-1103785002);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(gVar) | composerStartRestartGroup.changedInstance(pdfProcessor) | composerStartRestartGroup.changedInstance(filterSettings) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                U4 u5 = new U4(gVar, pdfProcessor, filterSettings, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(u5);
                objRememberedValue2 = u5;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(thumbnail2, filterSettings, (e) objRememberedValue2, composerStartRestartGroup, i7 & 112);
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), Color.Companion.m3964getWhite0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
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
            Bitmap bitmap = (Bitmap) mutableState.getValue();
            composerStartRestartGroup.startReplaceGroup(-771658855);
            if (bitmap == null) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer2, 25008, 232);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(gVar, filterSettings, pdfProcessor, modifier, i5, 3));
        }
    }

    public static final void f(final List list, final p087u3.b bVar, final PDFProcessor pDFProcessor, final int i5, final int i6, final int i7, final boolean z3, final p087u3.c cVar, Composer composer, final int i8) {
        int i9;
        int i10;
        List list2 = list;
        int i11 = i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(779958234);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(list2) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(bVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(pDFProcessor) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i8 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(i5) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i8 & 24576) == 0) {
            i9 |= composerStartRestartGroup.changed(i11) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(cVar) ? 8388608 : 4194304;
        }
        int i12 = i9;
        if ((4793491 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(779958234, i12, -1, "com.notescrafter.ui.screens.LayoutPreview (EnhanceScreen.kt:685)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            float f6 = 1;
            int i13 = i12;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(240)), f5), Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), p107y3.a.f15991r), Dp.m6403constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(AspectRatioKt.aspectRatio$default(companion, cVar == p087u3.c.PORTRAIT ? 0.7072136f : 1.414f, false, 2, null), 0.9f);
            Color.Companion companion4 = Color.Companion;
            float f7 = 4;
            Modifier modifierE = b.e(f7, b.f(f7, modifierFillMaxHeight, companion4.m3964getWhite0d7_KjU()), Dp.m6403constructorimpl(f6), companion4.m3957getGray0d7_KjU());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            int i14 = i11 * i7;
            int i15 = (i5 / i14) * i14;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(566971235);
            int i16 = 0;
            while (i16 < i11) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.Companion, 1.0f, false, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                a constructor4 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-366488783);
                int i17 = 0;
                while (i17 < i7) {
                    g gVar = (g) u.s0((i16 * i7) + i17 + i15, list2);
                    Modifier.Companion companion6 = Modifier.Companion;
                    ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(0, SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), 0.0f, 1, null), z3 ? Dp.m6403constructorimpl(f6) : Dp.m6403constructorimpl((float) 0.5d), z3 ? p107y3.a.f15978a : Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    a constructor5 = companion7.getConstructor();
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
                    e eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (gVar != null) {
                        composerStartRestartGroup.startReplaceGroup(-1231178046);
                        i10 = i13;
                        e(gVar, bVar, pDFProcessor, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), composerStartRestartGroup, (i13 & 112) | 3072 | (i10 & 896));
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i10 = i13;
                        composerStartRestartGroup.startReplaceGroup(-1230780657);
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Color.Companion.m3964getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    i17++;
                    list2 = list;
                    f6 = f6;
                    i13 = i10;
                    columnScopeInstance = columnScopeInstance2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i16++;
                list2 = list;
                f6 = f6;
                columnScopeInstance = columnScopeInstance;
                i11 = i6;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.r4
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Z4.f(list, bVar, pDFProcessor, i5, i6, i7, z3, cVar, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                    return B3.o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x05de  */
    /* JADX WARN: Code duplicated, block: B:178:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x065b  */
    /* JADX WARN: Code duplicated, block: B:182:0x065e  */
    /* JADX WARN: Code duplicated, block: B:185:0x066e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0672  */
    /* JADX WARN: Code duplicated, block: B:189:0x0676  */
    /* JADX WARN: Code duplicated, block: B:190:0x0678  */
    /* JADX WARN: Code duplicated, block: B:197:0x068a  */
    /* JADX WARN: Code duplicated, block: B:200:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:203:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:204:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:209:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:212:0x0710  */
    /* JADX WARN: Code duplicated, block: B:214:0x0717  */
    /* JADX WARN: Code duplicated, block: B:217:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x07d6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(List pages, p087u3.b filterSettings, PDFProcessor pdfProcessor, final int i5, final c onPageIndexChange, Modifier modifier, Composer composer, int i6) {
        Object obj;
        int i7;
        int i8;
        Composer composer2;
        int i9;
        long jM3926copywmQWz5c$default;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        long jM3926copywmQWz5c$default2;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        Composer composer3;
        o.f(pages, "pages");
        o.f(filterSettings, "filterSettings");
        o.f(pdfProcessor, "pdfProcessor");
        o.f(onPageIndexChange, "onPageIndexChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-477311809);
        int i10 = (i6 & 6) == 0 ? (composerStartRestartGroup.changedInstance(pages) ? 4 : 2) | i6 : i6;
        if ((i6 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(filterSettings) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(pdfProcessor) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(i5) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onPageIndexChange) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i6) == 0) {
            i10 |= composerStartRestartGroup.changed(modifier) ? Fields.RenderEffect : 65536;
        }
        int i11 = i10;
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477311809, i11, -1, "com.notescrafter.ui.screens.LivePreviewComparison (EnhanceScreen.kt:798)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1261396277);
            boolean zChanged = composerStartRestartGroup.changed(pages);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                obj = objRememberedValue2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : pages) {
                    if (((g) obj2).isSelected()) {
                        arrayList.add(obj2);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue2;
            List list = (List) obj;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1261393927);
            if (list.isEmpty()) {
                float f5 = 24;
                Modifier modifierE = b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m6403constructorimpl(220)), f5), Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), p107y3.a.f15991r);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                a constructor3 = companion.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m2432Text4IGK_g("No pages selected to process", (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 390, 0, 131066);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new C2699u4(pages, filterSettings, pdfProcessor, i5, onPageIndexChange, modifier, i6, 0));
                    return;
                }
                return;
            }
            Object objK = b.k(composerStartRestartGroup, -1261377981);
            Composer.Companion companion2 = Composer.Companion;
            if (objK == companion2.getEmpty()) {
                i7 = 2;
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            } else {
                i7 = 2;
            }
            MutableState mutableState = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1261375773);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i7, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState2 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1261373509);
            if (objK3 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objK3 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) objK3;
            composerStartRestartGroup.endReplaceGroup();
            g gVar = (g) u.s0(i5, list);
            Integer numValueOf = Integer.valueOf(i5);
            composerStartRestartGroup.startReplaceGroup(-1261365812);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(gVar) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new W4(gVar, mutableState3, context, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(gVar, numValueOf, (e) objRememberedValue3, composerStartRestartGroup, (i11 >> 6) & 112);
            Bitmap bitmap = (Bitmap) mutableState.getValue();
            composerStartRestartGroup.startReplaceGroup(-1261302812);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(pdfProcessor) | composerStartRestartGroup.changedInstance(filterSettings);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
                i8 = i11;
                Composer composer4 = composerStartRestartGroup;
                Y4 y4 = new Y4(mutableState, pdfProcessor, filterSettings, mutableState2, null);
                composer4.updateRememberedValue(y4);
                objRememberedValue4 = y4;
                composer2 = composer4;
            } else {
                i8 = i11;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(bitmap, filterSettings, (e) objRememberedValue4, composer2, i8 & 112);
            float f6 = 24;
            Modifier modifierG = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m6403constructorimpl(240)), f6);
            Color.Companion companion3 = Color.Companion;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            float f7 = 1;
            float fM6403constructorimpl = Dp.m6403constructorimpl(f7);
            long j5 = p107y3.a.f15991r;
            Modifier modifierE2 = b.e(f6, modifierM207backgroundbw27NRU$default, fM6403constructorimpl, j5);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierE2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            int i12 = i8;
            a constructor4 = companion5.getConstructor();
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
            e eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap2);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composer2.startReplaceGroup(1230925191);
                Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Modifier.Companion companion6 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion6);
                a constructor5 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap3);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier3, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(36)), p107y3.a.f15978a, 0.0f, 0L, 0, composer2, 54, 28);
                b.m(8, companion6, composer2, 6);
                TextKt.m2432Text4IGK_g("Generating Preview", (Modifier) null, p107y3.a.q, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200070, 0, 131026);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1231464467);
                Bitmap bitmap2 = (Bitmap) mutableState2.getValue();
                composer2.startReplaceGroup(-1207203067);
                if (bitmap2 != null) {
                    float f8 = 12;
                    ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap2), "PDF Page Preview", b.e(f8, b.g(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight(Modifier.Companion, 0.85f), bitmap2.getWidth() / bitmap2.getHeight(), false, 2, null), f8), Dp.m6403constructorimpl(f7), j5), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer2, 24624, 232);
                }
                composer2.endReplaceGroup();
                if (list.size() > 1) {
                    Modifier.Companion companion7 = Modifier.Companion;
                    float f9 = 12;
                    float f10 = 40;
                    Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion4.getCenterStart()), Dp.m6403constructorimpl(f9), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    boolean z7 = i5 > 0;
                    composer2.startReplaceGroup(-1207170729);
                    int i13 = i12 & 57344;
                    int i14 = i12 & 7168;
                    boolean z8 = (i13 == 16384) | (i14 == 2048);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (z8 || objRememberedValue5 == companion2.getEmpty()) {
                        final int i15 = 0;
                        objRememberedValue5 = new a() { // from class: x3.v4
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 - 1));
                                        break;
                                    default:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 + 1));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default2, z7, null, null, (a) objRememberedValue5, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default);
                    a constructor6 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                    e eVarG6 = p035i0.a.g(companion5, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl6.getInserting()) {
                        i9 = i13;
                    } else {
                        i9 = i13;
                        if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier4, companion5.getSetModifier());
                        Icons icons = Icons.INSTANCE;
                        ImageVector keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons.getDefault());
                        if (i5 > 0) {
                            jM3926copywmQWz5c$default = companion3.m3964getWhite0d7_KjU();
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        IconKt.m1877Iconww6aTOc(keyboardArrowLeft, "Previous Page", (Modifier) null, jM3926copywmQWz5c$default, composer2, 48, 4);
                        composer2.endNode();
                        Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion4.getCenterEnd()), 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 0.0f, 11, null), Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        if (i5 < list.size() - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        composer2.startReplaceGroup(-1207141289);
                        if (i9 == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i14 == 2048) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z4 | z5;
                        objRememberedValue = composer2.rememberedValue();
                        if (z6 || objRememberedValue == companion2.getEmpty()) {
                            final int i16 = 1;
                            objRememberedValue = new a() { // from class: x3.v4
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            onPageIndexChange.invoke(Integer.valueOf(i5 - 1));
                                            break;
                                        default:
                                            onPageIndexChange.invoke(Integer.valueOf(i5 + 1));
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM242clickableXHw0xAI$default2 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default3, z3, null, null, (a) objRememberedValue, 6, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default2);
                        constructor = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                        eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion5.getSetModifier());
                        ImageVector keyboardArrowRight = KeyboardArrowRightKt.getKeyboardArrowRight(icons.getDefault());
                        if (i5 < list.size() - 1) {
                            jM3926copywmQWz5c$default2 = companion3.m3964getWhite0d7_KjU();
                        } else {
                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        IconKt.m1877Iconww6aTOc(keyboardArrowRight, "Next Page", (Modifier) null, jM3926copywmQWz5c$default2, composer2, 48, 4);
                        composer2.endNode();
                        Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(b.g(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null), f9), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(4));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
                        constructor2 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                        eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion5.getSetModifier());
                        TextKt.m2432Text4IGK_g(p035i0.a.m("Page ", " of ", 1 + i5, list.size()), (Modifier) null, companion3.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200064, 0, 131026);
                        composer2.endNode();
                    }
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier4, companion5.getSetModifier());
                    Icons icons2 = Icons.INSTANCE;
                    ImageVector keyboardArrowLeft2 = KeyboardArrowLeftKt.getKeyboardArrowLeft(icons2.getDefault());
                    if (i5 > 0) {
                        jM3926copywmQWz5c$default = companion3.m3964getWhite0d7_KjU();
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    IconKt.m1877Iconww6aTOc(keyboardArrowLeft2, "Previous Page", (Modifier) null, jM3926copywmQWz5c$default, composer2, 48, 4);
                    composer2.endNode();
                    Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion4.getCenterEnd()), 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 0.0f, 11, null), Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    if (i5 < list.size() - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    composer2.startReplaceGroup(-1207141289);
                    if (i9 == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i14 == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z4 | z5;
                    objRememberedValue = composer2.rememberedValue();
                    if (z6) {
                        final int i17 = 1;
                        objRememberedValue = new a() { // from class: x3.v4
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 - 1));
                                        break;
                                    default:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 + 1));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        final int i18 = 1;
                        objRememberedValue = new a() { // from class: x3.v4
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 - 1));
                                        break;
                                    default:
                                        onPageIndexChange.invoke(Integer.valueOf(i5 + 1));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default3 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default4, z3, null, null, (a) objRememberedValue, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default3);
                    constructor = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion5.getSetModifier());
                    ImageVector keyboardArrowRight2 = KeyboardArrowRightKt.getKeyboardArrowRight(icons2.getDefault());
                    if (i5 < list.size() - 1) {
                        jM3926copywmQWz5c$default2 = companion3.m3964getWhite0d7_KjU();
                    } else {
                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    IconKt.m1877Iconww6aTOc(keyboardArrowRight2, "Next Page", (Modifier) null, jM3926copywmQWz5c$default2, composer2, 48, 4);
                    composer2.endNode();
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(b.g(PaddingKt.m672paddingqDBjuR0$default(boxScopeInstance2.align(companion7, companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null), f9), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(4));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN5);
                    constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                    eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier8, companion5.getSetModifier());
                    TextKt.m2432Text4IGK_g(p035i0.a.m("Page ", " of ", 1 + i5, list.size()), (Modifier) null, companion3.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 200064, 0, 131026);
                    composer2.endNode();
                }
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer3 = composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer3 = composer2;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new C2699u4(pages, filterSettings, pdfProcessor, i5, onPageIndexChange, modifier, i6, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0209  */
    /* JADX WARN: Code duplicated, block: B:90:0x0217  */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0299  */
    public static final void h(String label, boolean z3, a onClick, Modifier modifier, Composer composer, int i5, int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        Modifier modifier3;
        long j5;
        long jM3926copywmQWz5c$default;
        Modifier modifierFillMaxWidth$default;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        Modifier.Companion companion;
        long jM3962getTransparent0d7_KjU;
        long j6;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        Composer composer2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        o.f(label, "label");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1215179692);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i6 & 8;
        if (i9 == 0) {
            if ((i5 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            i8 = i7;
            if ((i8 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i9 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1215179692, i8, -1, "com.notescrafter.ui.screens.RadioButtonCustom (EnhanceScreen.kt:545)");
                }
                if (z3) {
                    j5 = p107y3.a.f15978a;
                } else {
                    j5 = p107y3.a.f15991r;
                }
                if (z3) {
                    jM3926copywmQWz5c$default = ColorKt.m3972compositeOverOWjLjI(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.g);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j7 = jM3926copywmQWz5c$default;
                if (z3) {
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    float fM6403constructorimpl = Dp.m6403constructorimpl(15);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                    long j8 = p107y3.a.f15978a;
                    modifierFillMaxWidth$default = ShadowKt.m3585shadows4CzXII$default(modifierFillMaxWidth$default2, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, j8, j8, 4, null);
                } else {
                    modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                }
                float f5 = 12;
                Modifier modifier5 = modifier3;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierFillMaxWidth$default, f5), j7, null, 2, null), Dp.m6403constructorimpl(1), j5), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(16));
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
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
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                companion = Modifier.Companion;
                Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20));
                if (z3) {
                    jM3962getTransparent0d7_KjU = p107y3.a.f15978a;
                } else {
                    jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                }
                Modifier modifierM206backgroundbw27NRU = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs, jM3962getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                float fM6403constructorimpl2 = Dp.m6403constructorimpl(2);
                if (z3) {
                    j6 = p107y3.a.f15978a;
                } else {
                    j6 = p107y3.a.q;
                }
                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM206backgroundbw27NRU, fM6403constructorimpl2, j6, RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU);
                constructor2 = companion3.getConstructor();
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
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1661427260);
                if (z3) {
                    BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(8)), Color.Companion.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(label, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, (i8 & 14) | 196992, 0, 131034);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new C2731w4(label, z3, onClick, modifier4, i5, i6));
            }
        }
        i7 |= 3072;
        modifier2 = modifier;
        i8 = i7;
        if ((i8 & 1171) == 1170) {
            if (i9 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1215179692, i8, -1, "com.notescrafter.ui.screens.RadioButtonCustom (EnhanceScreen.kt:545)");
            }
            if (z3) {
                j5 = p107y3.a.f15978a;
            } else {
                j5 = p107y3.a.f15991r;
            }
            if (z3) {
                jM3926copywmQWz5c$default = ColorKt.m3972compositeOverOWjLjI(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.g);
            } else {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j9 = jM3926copywmQWz5c$default;
            if (z3) {
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                float fM6403constructorimpl3 = Dp.m6403constructorimpl(15);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                long j10 = p107y3.a.f15978a;
                modifierFillMaxWidth$default = ShadowKt.m3585shadows4CzXII$default(modifierFillMaxWidth$default3, fM6403constructorimpl3, roundedCornerShapeM955RoundedCornerShape0680j_5, false, j10, j10, 4, null);
            } else {
                modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            }
            float f6 = 12;
            Modifier modifier6 = modifier3;
            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierFillMaxWidth$default, f6), j9, null, 2, null), Dp.m6403constructorimpl(1), j5), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(16));
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            constructor = companion5.getConstructor();
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
            eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap3);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            companion = Modifier.Companion;
            Modifier modifierM713size3ABfNKs2 = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20));
            if (z3) {
                jM3962getTransparent0d7_KjU = p107y3.a.f15978a;
            } else {
                jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
            }
            Modifier modifierM206backgroundbw27NRU2 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs2, jM3962getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
            float fM6403constructorimpl4 = Dp.m6403constructorimpl(2);
            if (z3) {
                j6 = p107y3.a.f15978a;
            } else {
                j6 = p107y3.a.q;
            }
            Modifier modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(modifierM206backgroundbw27NRU2, fM6403constructorimpl4, j6, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU2);
            constructor2 = companion5.getConstructor();
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
            eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap4);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1661427260);
            if (z3) {
                BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(8)), Color.Companion.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(label, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, (i8 & 14) | 196992, 0, 131034);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1215179692, i8, -1, "com.notescrafter.ui.screens.RadioButtonCustom (EnhanceScreen.kt:545)");
            }
            if (z3) {
                j5 = p107y3.a.f15978a;
            } else {
                j5 = p107y3.a.f15991r;
            }
            if (z3) {
                jM3926copywmQWz5c$default = ColorKt.m3972compositeOverOWjLjI(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.g);
            } else {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j11 = jM3926copywmQWz5c$default;
            if (z3) {
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                float fM6403constructorimpl5 = Dp.m6403constructorimpl(15);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                long j12 = p107y3.a.f15978a;
                modifierFillMaxWidth$default = ShadowKt.m3585shadows4CzXII$default(modifierFillMaxWidth$default4, fM6403constructorimpl5, roundedCornerShapeM955RoundedCornerShape0680j_6, false, j12, j12, 4, null);
            } else {
                modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            }
            float f7 = 12;
            Modifier modifier7 = modifier3;
            Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(b.e(f7, BackgroundKt.m207backgroundbw27NRU$default(b.g(modifierFillMaxWidth$default, f7), j11, null, 2, null), Dp.m6403constructorimpl(1), j5), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(16));
            Alignment.Companion companion6 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion6.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs3);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            constructor = companion7.getConstructor();
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
            eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap5);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            companion = Modifier.Companion;
            Modifier modifierM713size3ABfNKs3 = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20));
            if (z3) {
                jM3962getTransparent0d7_KjU = p107y3.a.f15978a;
            } else {
                jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
            }
            Modifier modifierM206backgroundbw27NRU3 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs3, jM3962getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
            float fM6403constructorimpl6 = Dp.m6403constructorimpl(2);
            if (z3) {
                j6 = p107y3.a.f15978a;
            } else {
                j6 = p107y3.a.q;
            }
            Modifier modifierM220borderxT4_qwU3 = BorderKt.m220borderxT4_qwU(modifierM206backgroundbw27NRU3, fM6403constructorimpl6, j6, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU3);
            constructor2 = companion7.getConstructor();
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
            eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap6);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion7.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1661427260);
            if (z3) {
                BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(8)), Color.Companion.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(label, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, (i8 & 14) | 196992, 0, 131034);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2731w4(label, z3, onClick, modifier4, i5, i6));
        }
    }

    public static final void i(String str, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348635898);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348635898, i6, -1, "com.notescrafter.ui.screens.SectionTitle (EnhanceScreen.kt:540)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composer2, (i6 & 14) | 196992, 0, 65498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2667s4(str, i5, 0));
        }
    }

    public static final void j(List list, String str, c cVar, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        Modifier modifierM242clickableXHw0xAI$default;
        Object selectedValue = str;
        Object onValueChange = cVar;
        o.f(selectedValue, "selectedValue");
        o.f(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1953644873);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed("Print Optimization Preset") ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(selectedValue) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onValueChange) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.Clip : Fields.Shape;
        }
        int i8 = i6;
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953644873, i8, -1, "com.notescrafter.ui.screens.ToggleGroup (EnhanceScreen.kt:981)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            float f5 = 8;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 6);
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
            String upperCase = "Print Optimization Preset".toUpperCase(Locale.ROOT);
            o.e(upperCase, "toUpperCase(...)");
            float f6 = f5;
            int i9 = i8;
            TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), composerStartRestartGroup, 12779904, 0, 65370);
            float f7 = 16;
            float f8 = 1;
            float f9 = 4;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f7, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), f7), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f8), p107y3.a.f15991r), Dp.m6403constructorimpl(f9));
            Composer composer3 = composerStartRestartGroup;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion.getTop(), composer3, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
            a constructor2 = companion2.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer3.startReplaceGroup(1294005266);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Ze ze = (Ze) it.next();
                boolean zEquals = ze.f14757a.equals(selectedValue);
                Brush.Companion companion3 = Brush.Companion;
                long j5 = p107y3.a.f15978a;
                Brush brushM3878linearGradientmHitzGk$default = Brush.Companion.m3878linearGradientmHitzGk$default(companion3, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15979b, 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null);
                long jM3926copywmQWz5c$default = zEquals ? Color.m3926copywmQWz5c$default(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : Color.Companion.m3962getTransparent0d7_KjU();
                long j6 = zEquals ? j5 : p107y3.a.q;
                Modifier.Companion companion4 = Modifier.Companion;
                long jM3926copywmQWz5c$default2 = j5;
                float f10 = 12;
                Modifier modifierClip = ClipKt.clip(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f10)));
                composer3.startReplaceGroup(1294023571);
                if (zEquals) {
                    modifierM242clickableXHw0xAI$default = b.e(f10, BackgroundKt.background$default(companion4, brushM3878linearGradientmHitzGk$default, null, 0.0f, 6, null), Dp.m6403constructorimpl(f8), jM3926copywmQWz5c$default);
                    i7 = i9;
                } else {
                    composer3.startReplaceGroup(631348315);
                    i7 = i9;
                    boolean zChanged = ((i7 & 7168) == 2048) | composer3.changed(ze);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C2290i(6, onValueChange, ze);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(companion4, false, null, null, (a) objRememberedValue, 7, null);
                }
                composer3.endReplaceGroup();
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(modifierClip.then(modifierM242clickableXHw0xAI$default), 0.0f, Dp.m6403constructorimpl(f10), 1, null);
                Alignment.Companion companion5 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default);
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                i9 = i7;
                a constructor3 = companion6.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion5.getCenterVertically(), composer3, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion4);
                a constructor4 = companion6.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                e eVarG4 = p035i0.a.g(companion6, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                if (!zEquals) {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.q, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Composer composer4 = composer3;
                IconKt.m1877Iconww6aTOc(ze.f14759c, (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f7)), jM3926copywmQWz5c$default2, composer4, 432, 0);
                float f11 = f6;
                androidx.compose.foundation.text.modifiers.a.q(f11, companion4, composer4, 6);
                TextKt.m2432Text4IGK_g(ze.f14758b, (Modifier) null, j6, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 199680, 0, 131026);
                composer4.endNode();
                composer4.endNode();
                onValueChange = cVar;
                f6 = f11;
                composer3 = composer4;
                rowScopeInstance = rowScopeInstance2;
                f8 = f8;
                f7 = f7;
                selectedValue = str;
            }
            composer2 = composer3;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(list, str, cVar, modifier, i5));
        }
    }
}
