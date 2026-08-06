package p102x3;

import B3.o;
import C3.u;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
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
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.utils.ExamItem;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p076s.b;
import p083t3.C2306q;
import p097w3.j;
import p097w3.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ye {
    public static final void a(Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(956087443);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956087443, i6, -1, "com.notescrafter.ui.screens.AnalogClock (ToDoScreen.kt:841)");
            }
            composerStartRestartGroup.startReplaceGroup(829428265);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            o oVar = o.f154a;
            composerStartRestartGroup.startReplaceGroup(829431094);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Ie(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue2, composerStartRestartGroup, 6);
            BoxWithConstraintsKt.BoxWithConstraints(modifier, Alignment.Companion.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(208254077, true, new Ke(mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2375a(modifier, i5, 3));
        }
    }

    public static final void b(final long j5, Composer composer, final int i5) {
        Composer composer2;
        Composer composer3;
        char c5;
        boolean z3;
        float f5;
        boolean z4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-996104593);
        if ((i5 & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996104593, i5, -1, "com.notescrafter.ui.screens.CalendarWidget (ToDoScreen.kt:735)");
            }
            Calendar calendar = Calendar.getInstance();
            int i6 = calendar.get(5);
            composerStartRestartGroup.startReplaceGroup(1971181788);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SimpleDateFormat("MMMM yyyy", Locale.getDefault()).format(new Date());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String str = (String) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, 1971185163);
            if (objK == companion.getEmpty()) {
                objK = Integer.valueOf(calendar.getActualMaximum(5));
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1971188017);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                objRememberedValue2 = Integer.valueOf(calendar2.get(7));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue2 = ((Number) objRememberedValue2).intValue();
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(10));
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            kotlin.jvm.internal.o.c(str);
            String upperCase = str.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.o.e(upperCase, "toUpperCase(...)");
            long jColor = ColorKt.Color(4289222135L);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            int i7 = i6;
            TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, jColor, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 196992, 0, 65498);
            Composer composer4 = composerStartRestartGroup;
            b.m(8, companion2, composer4, 6);
            Object obj = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getTop(), composer4, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
            a constructor2 = companion4.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor2);
            } else {
                composer4.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer4);
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            List listS = v.S("S", "M", "T", "W", "T", "F", "S");
            composer4.startReplaceGroup(805218411);
            int i8 = 0;
            for (Object obj2 : listS) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    v.X();
                    throw null;
                }
                Composer composer5 = composer4;
                TextKt.m2432Text4IGK_g((String) obj2, RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), i8 == 0 ? ColorKt.Color(4294472049L) : Color.Companion.m3957getGray0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 199680, 0, 130512);
                composer4 = composer5;
                i8 = i9;
                obj = null;
            }
            Composer composer6 = composer4;
            Object obj3 = obj;
            composer6.endReplaceGroup();
            composer6.endNode();
            Modifier.Companion companion5 = Modifier.Companion;
            Composer composer7 = composer6;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(6)), composer7, 6);
            int i10 = 1;
            int i11 = iIntValue2 - 1;
            int i12 = ((i11 + iIntValue) + 6) / 7;
            float f6 = 0.0f;
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, obj3), 1.0f, false, 2, null);
            boolean z5 = false;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer7, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer7, modifierWeight$default);
            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
            a constructor3 = companion6.getConstructor();
            if (composer7.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor3);
            } else {
                composer7.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer7);
            e eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            composer7.startReplaceGroup(805246723);
            int i13 = 0;
            while (i13 < i12) {
                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance2, SizeKt.fillMaxWidth$default(Modifier.Companion, f6, i10, obj3), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer7, z5 ? 1 : 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer7, z5 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierWeight$default2);
                ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                a constructor4 = companion7.getConstructor();
                if (composer7.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer7.startReusableNode();
                if (composer7.getInserting()) {
                    composer7.createNode(constructor4);
                } else {
                    composer7.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer7);
                e eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer7.startReplaceGroup(-361279563);
                int i14 = z5 ? 1 : 0;
                char c6 = 7;
                while (i14 < c6) {
                    int i15 = ((i13 * 7) + i14) - i11;
                    Alignment center = Alignment.Companion.getCenter();
                    Modifier.Companion companion8 = Modifier.Companion;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), f6, i10, obj3);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, z5);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer7, z5 ? 1 : 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxHeight$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                    a constructor5 = companion9.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor5);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer7);
                    e eVarG5 = p035i0.a.g(companion9, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl5.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion9.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer7.startReplaceGroup(591176081);
                    if (i15 < 0 || i15 >= iIntValue) {
                        composer3 = composer7;
                        i7 = i7;
                        c5 = 7;
                        z3 = false;
                        f5 = 0.0f;
                    } else {
                        int i16 = i15 + i10;
                        int i17 = i14 == 0 ? i10 : 0;
                        int i18 = i16 == i7 ? i10 : 0;
                        composer7.startReplaceGroup(591183931);
                        if (i18 != 0) {
                            z4 = false;
                            BoxKt.Box(BorderKt.m220borderxT4_qwU(BackgroundKt.background$default(SizeKt.m713size3ABfNKs(companion8, Dp.m6403constructorimpl(18)), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4289222135L)), Color.m3917boximpl(ColorKt.Color(4284704497L))), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), Dp.m6403constructorimpl(i10), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer7, 0);
                        } else {
                            z4 = false;
                        }
                        composer7.endReplaceGroup();
                        String strValueOf = String.valueOf(i16);
                        long jM3964getWhite0d7_KjU = i18 != 0 ? Color.Companion.m3964getWhite0d7_KjU() : i17 != 0 ? ColorKt.Color(4294472049L) : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                        long sp = TextUnitKt.getSp(11);
                        FontWeight.Companion companion10 = FontWeight.Companion;
                        c5 = 7;
                        z3 = z4;
                        f5 = 0.0f;
                        composer3 = composer7;
                        TextKt.m2432Text4IGK_g(strValueOf, (Modifier) null, jM3964getWhite0d7_KjU, sp, (FontStyle) null, i18 != 0 ? companion10.getBold() : companion10.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3072, 0, 131026);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    i14++;
                    i7 = i7;
                    c6 = c5;
                    z5 = z3;
                    i10 = i10;
                    i12 = i12;
                    composer7 = composer3;
                    f6 = f5;
                    i13 = i13;
                    obj3 = null;
                }
                Composer composer8 = composer7;
                Object[] objArr = z5 ? 1 : 0;
                composer8.endReplaceGroup();
                composer8.endNode();
                i13++;
                obj3 = null;
            }
            composer2 = composer7;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ge
                @Override // O3.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    Ye.b(j5, (Composer) obj4, iUpdateChangedFlags);
                    return o.f154a;
                }
            });
        }
    }

    public static final void c(ExamItem exam, Composer composer, int i5) {
        int i6;
        Composer composer2;
        kotlin.jvm.internal.o.f(exam, "exam");
        Composer composerStartRestartGroup = composer.startRestartGroup(-851765010);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(exam) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851765010, i6, -1, "com.notescrafter.ui.screens.ExamCardItem (ToDoScreen.kt:489)");
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(exam.getDateMillis());
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            long days = TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
            boolean z3 = days <= 0;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse", composerStartRestartGroup, 6, 0), 0.04f, 0.12f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "alpha", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(486606951);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = DensityKt.Density(density.getDensity(), Q3.a.o(density.getFontScale(), 1.15f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(940559790, true, new Le(z3, stateAnimateFloat, exam, days), composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2445e5(exam, i5, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void d(List exams, a onDismiss, c onUpdateExams, Composer composer, int i5) {
        int i6;
        Composer composer2;
        char c5;
        kotlin.jvm.internal.o.f(exams, "exams");
        kotlin.jvm.internal.o.f(onDismiss, "onDismiss");
        kotlin.jvm.internal.o.f(onUpdateExams, "onUpdateExams");
        Composer composerStartRestartGroup = composer.startRestartGroup(-963367637);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(exams) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onUpdateExams) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963367637, i7, -1, "com.notescrafter.ui.screens.ManageExamsContent (ToDoScreen.kt:376)");
            }
            composerStartRestartGroup.startReplaceGroup(-1111363947);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, -1111362163);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1111359560);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            composerStartRestartGroup.endReplaceGroup();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1111356447);
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                Calendar calendar = Calendar.getInstance();
                composerStartRestartGroup.startReplaceGroup(-1111352665);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new DatePickerDialog.OnDateSetListener() { // from class: x3.He
                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i8, int i9, int i10) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.set(i8, i9, i10);
                            mutableState2.setValue(Long.valueOf(calendar2.getTimeInMillis()));
                            mutableState3.setValue(Boolean.FALSE);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                new DatePickerDialog(context, (DatePickerDialog.OnDateSetListener) objRememberedValue2, calendar.get(1), calendar.get(2), calendar.get(5)).show();
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleLarge();
            Color.Companion companion5 = Color.Companion;
            TextKt.m2432Text4IGK_g("Track Your Exam", (Modifier) null, companion5.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composerStartRestartGroup, 196998, 0, 65498);
            float f5 = 16;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g("Add New Exam", (Modifier) null, companion5.m3957getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
            float f6 = 8;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
            String str = (String) mutableState.getValue();
            TextFieldColors textFieldColorsM2076colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion5.m3964getWhite0d7_KjU(), companion5.m3964getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, companion5.m3964getWhite0d7_KjU(), 0L, null, companion5.m3964getWhite0d7_KjU(), companion5.m3957getGray0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, companion5.m3964getWhite0d7_KjU(), companion5.m3957getGray0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663350, 432, 27648, 0, 3072, 2122311420, 4095);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1249077993);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C2435db(8, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(str, (c) objRememberedValue3, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (e) AbstractC2730w3.e, (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2076colors0hiis_0, composerStartRestartGroup, 1573296, 0, 0, 4194232);
            b.m(f6, companion2, composerStartRestartGroup, 6);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jColor = ColorKt.Color(4281545523L);
            int i8 = (ButtonDefaults.$stable << 12) | 6;
            ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(jColor, 0L, 0L, 0L, composerStartRestartGroup, i8, 14);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1249097870);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Bb(12, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue4, modifierFillMaxWidth$default3, false, null, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1572060177, true, new Me(mutableState2), composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 492);
            composerStartRestartGroup.startReplaceGroup(1249108918);
            int i9 = i7 & 896;
            boolean zChangedInstance = (i9 == 256) | composerStartRestartGroup.changedInstance(exams);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Na(onUpdateExams, mutableState, mutableState2, exams);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue5, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f6), 0.0f, 0.0f, 13, null), false, null, buttonDefaults.m1520buttonColorsro_MJ88(ColorKt.Color(4283215696L), 0L, 0L, 0L, composerStartRestartGroup, i8, 14), null, null, null, null, AbstractC2730w3.f15665f, composerStartRestartGroup, 805306416, 492);
            Object obj = null;
            int i10 = 0;
            DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m670paddingVpY3zN4$default(companion2, 0.0f, Dp.m6403constructorimpl(f5), 1, null), 0.0f, Color.m3926copywmQWz5c$default(companion5.m3957getGray0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 390, 2);
            TextKt.m2432Text4IGK_g("Your Exams", (Modifier) null, companion5.m3957getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m701heightInVpY3zN4$default(companion2, 0.0f, Dp.m6403constructorimpl(ComposerKt.invocationKey), 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            p035i0.a.w(companion4, composerM3407constructorimpl2, modifierMaterializeModifier2, composerStartRestartGroup, -1990677059);
            Iterator it = exams.iterator();
            while (it.hasNext()) {
                ExamItem examItem = (ExamItem) it.next();
                Modifier.Companion companion6 = Modifier.Companion;
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, obj), 0.0f, Dp.m6403constructorimpl(f6), 1, obj);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement2.getSpaceBetween();
                Alignment.Companion companion7 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion7.getCenterVertically(), composerStartRestartGroup, 54);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i10);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
                ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                a constructor3 = companion8.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion6, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                a constructor4 = companion8.getConstructor();
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
                e eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                String upperCase = examItem.getName().toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.o.e(upperCase, "toUpperCase(...)");
                Color.Companion companion9 = Color.Companion;
                Composer composer3 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, companion9.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composer3, 196992, 3120, 120794);
                String str2 = new SimpleDateFormat("MMM dd", Locale.getDefault()).format(new Date(examItem.getDateMillis()));
                kotlin.jvm.internal.o.e(str2, "format(...)");
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, companion9.m3957getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3456, 0, 131058);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1467170322);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(exams) | (i9 == 256) | composerStartRestartGroup.changed(examItem);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    c5 = '\f';
                    objRememberedValue6 = new C2306q(onUpdateExams, exams, examItem, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    c5 = '\f';
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer4 = composerStartRestartGroup;
                IconButtonKt.IconButton((a) objRememberedValue6, null, false, null, null, AbstractC2730w3.g, composerStartRestartGroup, 196608, 30);
                composer4.endNode();
                composerStartRestartGroup = composer4;
                i10 = 0;
                obj = null;
            }
            Composer composer5 = composerStartRestartGroup;
            composer5.endReplaceGroup();
            composer5.endNode();
            Modifier.Companion companion10 = Modifier.Companion;
            composer2 = composer5;
            b.m(f5, companion10, composer2, 6);
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.Companion.getTop(), composer2, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
            ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
            a constructor5 = companion11.getConstructor();
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
            e eVarG5 = p035i0.a.g(companion11, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion11.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, AbstractC2730w3.f15666h, composer2, ((i7 >> 3) & 14) | 805306368, 510);
            if (androidx.compose.foundation.text.modifiers.a.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a((Object) exams, (Object) onDismiss, (B3.c) onUpdateExams, i5, 10));
        }
    }

    public static final void e(ToDoItem task, long j5, c onToggle, a onDelete, Composer composer, int i5) {
        int i6;
        long jM3964getWhite0d7_KjU;
        float f5;
        float f6;
        float f7;
        long jM3964getWhite0d7_KjU2;
        float f8;
        float f9;
        float f10;
        Composer composer2;
        kotlin.jvm.internal.o.f(task, "task");
        kotlin.jvm.internal.o.f(onToggle, "onToggle");
        kotlin.jvm.internal.o.f(onDelete, "onDelete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211812902);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(task) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onToggle) ? 256 : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onDelete) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211812902, i6, -1, "com.notescrafter.ui.screens.TaskItemMinimal (ToDoScreen.kt:629)");
            }
            State<Color> stateM81animateColorAsStateeuL9pac = SingleValueAnimationKt.m81animateColorAsStateeuL9pac(task.isDone() ? j5 : Color.Companion.m3962getTransparent0d7_KjU(), AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            State<Color> stateM81animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m81animateColorAsStateeuL9pac(task.isDone() ? j5 : Color.m3926copywmQWz5c$default(Color.Companion.m3957getGray0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(task.isDone() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(task.isDone() ? 0.0f : -45.0f, AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(task.isDone() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(350, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(4), 1, null);
            if (task.isDone()) {
                jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.01f;
            } else {
                jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.04f;
            }
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f7, 0.0f, f5, f6, 14, null);
            if (task.isDone()) {
                jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.05f;
            } else {
                jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.1f;
            }
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU2, f10, 0.0f, f8, f9, 14, null);
            composerStartRestartGroup.startReplaceGroup(778203319);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(task) | ((i6 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2737wa(onToggle, task, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            j.a(modifierM670paddingVpY3zN4$default, jM3926copywmQWz5c$default, jM3926copywmQWz5c$default2, 0.0f, (a) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1723227029, true, new Ne(stateAnimateFloatAsState3, onDelete, stateM81animateColorAsStateeuL9pac2, stateM81animateColorAsStateeuL9pac, task, stateAnimateFloatAsState, stateAnimateFloatAsState2), composer2, 54), composer2, 196614, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2525j5(task, j5, onToggle, onDelete, i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final a aVar, Composer composer, int i5) {
        int i6;
        Composer composer2;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1371347892);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1371347892, i6, -1, "com.notescrafter.ui.screens.ToDoScreen (ToDoScreen.kt:69)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(518851167);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ToDoManager(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ToDoManager toDoManager = (ToDoManager) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, 518853393);
            if (objK == companion.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(toDoManager.getTasks(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 518855601);
            if (objK2 == companion.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(toDoManager.getExams(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 518857981);
            if (objK3 == companion.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            final MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 518860064);
            if (objK4 == companion.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState5 = (MutableState) objK4;
            composerStartRestartGroup.endReplaceGroup();
            final long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
            final long jColor = ColorKt.Color(4283215696L);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
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
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(20));
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, Dp.m6403constructorimpl(32), 0.0f, Dp.m6403constructorimpl(100), 5, null);
            composerStartRestartGroup.startReplaceGroup(394431388);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(toDoManager) | ((i6 & 14) == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                c cVar = new c() { // from class: x3.Fe
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        kotlin.jvm.internal.o.f(LazyColumn, "$this$LazyColumn");
                        long j5 = jM3964getWhite0d7_KjU;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(919651290, true, new Oe(j5)), 3, null);
                        long j6 = jColor;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1668083843, true, new Ba(j6, 2)), 3, null);
                        MutableState mutableState6 = mutableState5;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-603383902, true, new Qe(mutableState6, j5)), 3, null);
                        MutableState mutableState7 = mutableState3;
                        if (((List) mutableState7.getValue()).isEmpty()) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1363900705, true, new Re(mutableState6)), 3, null);
                        } else {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(733285814, true, new Te(mutableState7)), 3, null);
                        }
                        MutableState mutableState8 = mutableState4;
                        a aVar2 = aVar;
                        ToDoManager toDoManager2 = toDoManager;
                        MutableState mutableState9 = mutableState2;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1420115649, true, new We(aVar2, j5, toDoManager2, mutableState9, j6, mutableState8)), 3, null);
                        List listD0 = u.D0((List) mutableState9.getValue(), new N3(5));
                        LazyColumn.items(listD0.size(), null, new V3(listD0, 13), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Xe(listD0, j6, toDoManager2, mutableState9)));
                        return o.f154a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(cVar);
                objRememberedValue2 = cVar;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue2, composer2, 24966, 234);
            composer2.endNode();
            if (((Boolean) mutableState5.getValue()).booleanValue()) {
                composer2.startReplaceGroup(519271615);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    mutableState = mutableState5;
                    objRememberedValue3 = new Bb(13, mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState = mutableState5;
                }
                composer2.endReplaceGroup();
                n.a((a) objRememberedValue3, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(1865734692, true, new C2579mb(toDoManager, mutableState3, mutableState), composer2, 54), composer2, 24582, 14);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2590n6(i5, 3, aVar));
        }
    }
}
