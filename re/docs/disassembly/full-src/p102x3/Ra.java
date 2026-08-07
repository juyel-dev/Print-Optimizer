package p102x3;

import O3.a;
import O3.c;
import O3.e;
import W3.q;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.A;
import p083t3.C2321y;

/* JADX INFO: loaded from: classes2.dex */
public final class Ra implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f14380o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14381r;

    public Ra(c cVar, MutableState mutableState, MutableState mutableState2, List list) {
        this.f14380o = list;
        this.p = mutableState;
        this.q = cVar;
        this.f14381r = mutableState2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x03ab  */
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
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763256981, iIntValue, -1, "com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:287)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer, i5).getTitleLarge();
            FontWeight bold = FontWeight.Companion.getBold();
            long j5 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g("Add Blank Slide", (Modifier) null, j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composer, 196998, 0, 65498);
            float f5 = 16;
            b.m(f5, companion, composer, 6);
            List list = this.f14380o;
            String strK = p035i0.a.k("Enter the position where you want to insert the blank slide (1-", list.size() + 1, "):");
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null);
            long j6 = p107y3.a.p;
            TextKt.m2432Text4IGK_g(strK, modifierM672paddingqDBjuR0$default, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium, composer, 432, 0, 65528);
            MutableState mutableState = this.p;
            String str = (String) mutableState.getValue();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            long j7 = p107y3.a.f15978a;
            TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j5, j5, 0L, 0L, Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), j7, 0L, null, j7, p107y3.a.f15991r, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j7, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 115040310, 432, 27648, 0, 3072, 2122311180, 4095);
            composer.startReplaceGroup(-1820527519);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new C2321y(21, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(str, (c) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (e) AbstractC2474g2.f15047i, (e) ComposableLambdaKt.rememberComposableLambda(141333210, true, new A(list, 2), composer, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2076colors0hiis_0, composer, 14156208, 12779520, 0, 4030264);
            b.m(24, companion, composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
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
            composer.startReplaceGroup(1115585070);
            Object objRememberedValue2 = composer.rememberedValue();
            Object empty = companion4.getEmpty();
            MutableState mutableState2 = this.f14381r;
            if (objRememberedValue2 == empty) {
                objRememberedValue2 = new C2412c4(9, mutableState2, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((a) objRememberedValue2, null, false, null, null, null, null, null, null, AbstractC2474g2.f15048j, composer, 805306374, 510);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(8)), composer, 6);
            composer.startReplaceGroup(1115598996);
            boolean zChangedInstance = composer.changedInstance(list);
            c cVar = this.q;
            boolean zChanged = zChangedInstance | composer.changed(cVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Na(list, cVar, mutableState, mutableState2, 1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a aVar = (a) objRememberedValue3;
            composer.endReplaceGroup();
            Modifier modifierM718width3ABfNKs = SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(MenuKt.InTransitionDuration));
            Integer numZ = q.Z((String) mutableState.getValue());
            if (numZ != null) {
                int iIntValue2 = numZ.intValue();
                z3 = 1 <= iIntValue2 && iIntValue2 <= list.size() + 1;
            }
            ButtonKt.TextButton(aVar, modifierM718width3ABfNKs, z3, null, null, null, null, null, null, AbstractC2474g2.f15049k, composer, 805306416, 504);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
