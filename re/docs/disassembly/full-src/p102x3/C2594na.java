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
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2306q;
import p083t3.C2321y;
import p083t3.F;

/* JADX INFO: renamed from: x3.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2594na implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ToDoManager f15356o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public C2594na(ToDoManager toDoManager, MutableState mutableState, MutableState mutableState2) {
        this.f15356o = toDoManager;
        this.p = mutableState;
        this.q = mutableState2;
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
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261282050, iIntValue, -1, "com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:359)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(20));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
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
            float f5 = 12;
            Modifier modifierG = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(48)), f5);
            Color.Companion companion4 = Color.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
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
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            List list = AbstractC2642qa.f15449c;
            MutableState mutableState = this.p;
            String str = (String) mutableState.getValue();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), companion2.getCenterVertically(), false, 2, null);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
            long j5 = p107y3.a.f15990o;
            TextStyle textStyleM5917copyp1EtxEg = bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null);
            SolidColor solidColor = new SolidColor(j5, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m6069getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (AbstractC2168g) null);
            composer2.startReplaceGroup(-377648639);
            ToDoManager toDoManager = this.f15356o;
            boolean zChangedInstance = composer2.changedInstance(toDoManager);
            Object objRememberedValue = composer2.rememberedValue();
            MutableState mutableState2 = this.q;
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2546ka(toDoManager, mutableState, mutableState2, 0);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions((c) objRememberedValue, null, null, null, null, null, 62, null);
            composer2.startReplaceGroup(-377672449);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new C2321y(17, mutableState);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(str, (c) objRememberedValue2, modifierWrapContentHeight$default, false, false, textStyleM5917copyp1EtxEg, keyboardOptions, keyboardActions, true, 0, 0, (VisualTransformation) null, (c) null, (MutableInteractionSource) null, (Brush) solidColor, (f) ComposableLambdaKt.rememberComposableLambda(-2133791073, true, new C2578ma(mutableState), composer2, 54), composer2, 102236208, 221184, 15896);
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(28)), RoundedCornerShapeKt.getCircleShape()), p107y3.a.f15978a, null, 2, null);
            composer2.startReplaceGroup(-377602563);
            boolean zChangedInstance2 = composer2.changedInstance(toDoManager);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new C2562la(toDoManager, mutableState, mutableState2, 0);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue3, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            float f6 = 16;
            IconKt.m1877Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "Add", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), companion4.m3964getWhite0d7_KjU(), composer2, 3504, 0);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            int i5 = 6;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer2, 6);
            if (((List) mutableState2.getValue()).isEmpty()) {
                composer2.startReplaceGroup(-655607004);
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f6), 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                a constructor5 = companion3.getConstructor();
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
                e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                TextKt.m2432Text4IGK_g("No tasks listed. Add some to stay focused!", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 130546);
                composer2.endNode();
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer = composer2;
                composer.startReplaceGroup(-654834267);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                p035i0.a.w(companion3, composerM3407constructorimpl6, modifierMaterializeModifier6, composer, 1872734758);
                for (ToDoItem toDoItem : u.D0((List) mutableState2.getValue(), new N3(1))) {
                    long j6 = p107y3.a.f15990o;
                    long j7 = p107y3.a.p;
                    long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null);
                    composer.startReplaceGroup(-377525516);
                    boolean zChangedInstance3 = composer.changedInstance(toDoItem) | composer.changedInstance(toDoManager);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new F(toDoManager, mutableState2, toDoItem);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    c cVar = (c) objRememberedValue4;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-377515263);
                    boolean zChangedInstance4 = composer.changedInstance(toDoItem) | composer.changedInstance(toDoManager);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2306q(toDoManager, mutableState2, toDoItem, 4);
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    int i6 = i5;
                    Ja.f(toDoItem, j6, j7, jM3926copywmQWz5c$default, cVar, (a) objRememberedValue5, composer, 3504, 0);
                    b.m(i6, Modifier.Companion, composer, i6);
                    i5 = i6;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
