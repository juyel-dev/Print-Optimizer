package p102x3;

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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.utils.ToDoManager;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ve implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ToDoManager f14543o;
    public final /* synthetic */ long p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14544r;

    public Ve(ToDoManager toDoManager, long j5, MutableState mutableState, MutableState mutableState2) {
        this.f14543o = toDoManager;
        this.p = j5;
        this.q = mutableState;
        this.f14544r = mutableState2;
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
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806692702, iIntValue, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToDoScreen.kt:243)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MutableState mutableState = this.q;
            String str = (String) mutableState.getValue();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), companion2.getCenterVertically(), false, 2, null);
            TextStyle bodyLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge();
            Color.Companion companion4 = Color.Companion;
            TextStyle textStyleM5917copyp1EtxEg = bodyLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyLarge.spanStyle.m5841getColor0d7_KjU() : companion4.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyLarge.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyLarge.platformStyle : null, (16645977 & 1048576) != 0 ? bodyLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyLarge.paragraphStyle.getTextMotion() : null);
            SolidColor solidColor = new SolidColor(companion4.m3964getWhite0d7_KjU(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.Companion.m6069getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (AbstractC2168g) null);
            composer.startReplaceGroup(-2072764528);
            ToDoManager toDoManager = this.f14543o;
            boolean zChangedInstance = composer.changedInstance(toDoManager);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState2 = this.f14544r;
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2546ka(toDoManager, mutableState, mutableState2, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions((c) objRememberedValue, null, null, null, null, null, 62, null);
            composer.startReplaceGroup(-2072787734);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new C2435db(9, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(str, (c) objRememberedValue2, modifierWrapContentHeight$default, false, false, textStyleM5917copyp1EtxEg, keyboardOptions, keyboardActions, true, 0, 0, (VisualTransformation) null, (c) null, (MutableInteractionSource) null, (Brush) solidColor, (f) ComposableLambdaKt.rememberComposableLambda(738524385, true, new Ue(mutableState), composer, 54), composer, 102236208, 221184, 15896);
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), this.p, null, 2, null);
            composer.startReplaceGroup(-2072712340);
            boolean zChangedInstance2 = composer.changedInstance(toDoManager);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new C2562la(toDoManager, mutableState, mutableState2, 2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue3, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(AddKt.getAdd(Icons.Filled.INSTANCE), "Add", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), companion4.m3964getWhite0d7_KjU(), composer, 3504, 0);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
