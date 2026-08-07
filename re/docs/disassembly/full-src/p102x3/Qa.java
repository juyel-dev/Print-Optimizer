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
import p083t3.C2321y;

/* JADX INFO: loaded from: classes2.dex */
public final class Qa implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14331o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ List q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f14332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14333s;

    public Qa(MutableState mutableState, MutableState mutableState2, List list, c cVar, MutableState mutableState3) {
        this.f14331o = mutableState;
        this.p = mutableState2;
        this.q = list;
        this.f14332r = cVar;
        this.f14333s = mutableState3;
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
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        int iIntValue;
        Integer numZ;
        int iIntValue2;
        Composer composer = (Composer) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        if ((iIntValue3 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-907666676, iIntValue3, -1, "com.notescrafter.ui.screens.PreviewScreen.<anonymous> (PreviewScreen.kt:169)");
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
            TextKt.m2432Text4IGK_g("Reorder Slide", (Modifier) null, j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composer, 196998, 0, 65498);
            float f5 = 8;
            b.m(f5, companion, composer, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            long j6 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Move a slide to a new position.", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(16), 7, null), j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium, composer, 438, 0, 65528);
            MutableState mutableState5 = this.f14331o;
            String str = (String) mutableState5.getValue();
            KeyboardType.Companion companion4 = KeyboardType.Companion;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion4.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            long j7 = p107y3.a.f15978a;
            long j8 = p107y3.a.f15991r;
            TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j5, j5, 0L, 0L, Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), j7, 0L, null, j7, j8, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j7, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 115040310, 432, 27648, 0, 3072, 2122311180, 4095);
            composer.startReplaceGroup(-1820711038);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue == companion5.getEmpty()) {
                mutableState = mutableState5;
                objRememberedValue = new C2321y(19, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState = mutableState5;
            }
            composer.endReplaceGroup();
            MutableState mutableState6 = mutableState;
            OutlinedTextFieldKt.OutlinedTextField(str, (c) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (e) AbstractC2474g2.f15043c, (e) AbstractC2474g2.f15044d, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2076colors0hiis_0, composer, 14156208, 12779520, 0, 4030264);
            b.m(12, companion, composer, 6);
            MutableState mutableState7 = this.p;
            String str2 = (String) mutableState7.getValue();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion4.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextFieldColors textFieldColorsM2076colors0hiis_1 = outlinedTextFieldDefaults.m2076colors0hiis_0(j5, j5, 0L, 0L, Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278190080L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), j7, 0L, null, j7, j8, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j7, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 115040310, 432, 27648, 0, 3072, 2122311180, 4095);
            composer.startReplaceGroup(-1820666496);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                mutableState2 = mutableState7;
                objRememberedValue2 = new C2321y(20, mutableState2);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                mutableState2 = mutableState7;
            }
            composer.endReplaceGroup();
            MutableState mutableState8 = mutableState2;
            OutlinedTextFieldKt.OutlinedTextField(str2, (c) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (e) AbstractC2474g2.e, (e) AbstractC2474g2.f15045f, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2076colors0hiis_1, composer, 14156208, 12779520, 0, 4030264);
            b.m(24, companion, composer, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
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
            composer.startReplaceGroup(1115445727);
            Object objRememberedValue3 = composer.rememberedValue();
            Object empty = companion5.getEmpty();
            MutableState mutableState9 = this.f14333s;
            if (objRememberedValue3 == empty) {
                mutableState3 = mutableState6;
                mutableState4 = mutableState8;
                objRememberedValue3 = new P3(7, mutableState9, mutableState3, mutableState4);
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState3 = mutableState6;
                mutableState4 = mutableState8;
            }
            composer.endReplaceGroup();
            MutableState mutableState10 = mutableState4;
            MutableState mutableState11 = mutableState3;
            ButtonKt.TextButton((a) objRememberedValue3, null, false, null, null, null, null, null, null, AbstractC2474g2.g, composer, 805306374, 510);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            composer.startReplaceGroup(1115461295);
            List list = this.q;
            boolean zChangedInstance = composer.changedInstance(list);
            c cVar = this.f14332r;
            boolean zChanged = zChangedInstance | composer.changed(cVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion5.getEmpty()) {
                objRememberedValue4 = new Pa(list, cVar, mutableState11, mutableState10, mutableState9, 0);
                composer.updateRememberedValue(objRememberedValue4);
            }
            a aVar = (a) objRememberedValue4;
            composer.endReplaceGroup();
            Modifier modifierM718width3ABfNKs = SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(MenuKt.InTransitionDuration));
            Integer numZ2 = q.Z((String) mutableState11.getValue());
            ButtonKt.TextButton(aVar, modifierM718width3ABfNKs, numZ2 != null && 1 <= (iIntValue = numZ2.intValue()) && iIntValue <= list.size() && (numZ = q.Z((String) mutableState10.getValue())) != null && 1 <= (iIntValue2 = numZ.intValue()) && iIntValue2 <= list.size(), null, null, null, null, null, null, AbstractC2474g2.f15046h, composer, 805306416, 504);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
