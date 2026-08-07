package p102x3;

import C3.u;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.utils.ToDoManager;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2321y;

/* JADX INFO: loaded from: classes2.dex */
public final class Ga implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f14000o;
    public final /* synthetic */ long p;
    public final /* synthetic */ ToDoManager q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14002s;
    public final /* synthetic */ long t;

    public Ga(long j5, long j6, ToDoManager toDoManager, MutableState mutableState, MutableState mutableState2, long j7) {
        this.f14000o = j5;
        this.p = j6;
        this.q = toDoManager;
        this.f14001r = mutableState;
        this.f14002s = mutableState2;
        this.t = j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        MutableState mutableState2;
        int i5 = 0;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109522700, iIntValue, -1, "com.notescrafter.ui.screens.PomodoroTimerScreen.<anonymous>.<anonymous>.<anonymous> (PomodoroTimerScreen.kt:408)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = 12;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f6), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer, i6).getTitleMedium();
            TextStyle textStyleM5917copyp1EtxEg = titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null);
            final long j5 = this.f14000o;
            TextKt.m2432Text4IGK_g("Focus Checklist", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 6, 0, 65530);
            composer.startReplaceGroup(1623568967);
            final ToDoManager toDoManager = this.q;
            boolean zChangedInstance = composer.changedInstance(toDoManager);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState3 = this.f14001r;
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2785za(toDoManager, mutableState3, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PaddingValues paddingValuesM661PaddingValues0680j_4 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
            final long j6 = this.p;
            ButtonKt.TextButton((a) objRememberedValue, null, false, null, null, null, null, paddingValuesM661PaddingValues0680j_4, null, ComposableLambdaKt.rememberComposableLambda(-1722473795, true, new Ba(j6, i5), composer, 54), composer, 817889280, 382);
            composer.endNode();
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(44)), f6), Color.m3926copywmQWz5c$default(j5, 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            MutableState mutableState4 = this.f14002s;
            String str = (String) mutableState4.getValue();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), companion2.getCenterVertically(), false, 2, null);
            TextStyle bodyMedium = materialTheme.getTypography(composer, i6).getBodyMedium();
            TextStyle textStyleM5917copyp1EtxEg2 = bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null);
            SolidColor solidColor = new SolidColor(j5, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m6069getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (AbstractC2168g) null);
            composer.startReplaceGroup(-1329930700);
            boolean zChangedInstance2 = composer.changedInstance(toDoManager);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                mutableState = mutableState3;
                objRememberedValue2 = new C2546ka(toDoManager, mutableState4, mutableState, 1);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState = mutableState3;
            }
            composer.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions((c) objRememberedValue2, null, null, null, null, null, 62, null);
            composer.startReplaceGroup(-1329952022);
            Object objRememberedValue3 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new C2321y(18, mutableState4);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            MutableState mutableState5 = mutableState;
            BasicTextFieldKt.BasicTextField(str, (c) objRememberedValue3, modifierWrapContentHeight$default, false, false, textStyleM5917copyp1EtxEg2, keyboardOptions, keyboardActions, true, 0, 0, (VisualTransformation) null, (c) null, (MutableInteractionSource) null, (Brush) solidColor, (f) ComposableLambdaKt.rememberComposableLambda(2129092343, true, new Ca(mutableState4, j6), composer, 54), composer, 102236208, 196608, 15896);
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(j5, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(-1329890160);
            boolean zChangedInstance3 = composer.changedInstance(toDoManager);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion4.getEmpty()) {
                mutableState2 = mutableState5;
                objRememberedValue4 = new C2562la(toDoManager, mutableState4, mutableState2, 1);
                composer.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState2 = mutableState5;
            }
            composer.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue4, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            final MutableState mutableState6 = mutableState2;
            IconKt.m1877Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "Add", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), this.t, composer, 432, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer, 6);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(6));
            PaddingValues paddingValuesM665PaddingValuesa9UjIt4$default = PaddingKt.m665PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(8), 7, null);
            composer.startReplaceGroup(-1478255123);
            boolean zChanged = composer.changed(j5) | composer.changed(j6) | composer.changedInstance(toDoManager);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new c() { // from class: x3.Aa
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        LazyListScope LazyColumn = (LazyListScope) obj4;
                        o.f(LazyColumn, "$this$LazyColumn");
                        MutableState mutableState7 = mutableState6;
                        List listD0 = u.D0((List) mutableState7.getValue(), new N3(2));
                        LazyColumn.items(listD0.size(), null, new V3(listD0, 5), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Fa(listD0, j5, j6, toDoManager, mutableState7)));
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, paddingValuesM665PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue5, composer, 24960, 234);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
