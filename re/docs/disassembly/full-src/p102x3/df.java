package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.J;

/* JADX INFO: loaded from: classes2.dex */
public final class df implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14947o;

    public df(Context context) {
        this.f14947o = context;
    }

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
                ComposerKt.traceEventStart(638948001, iIntValue, -1, "com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:211)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer, 48);
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
            float f6 = 16;
            Modifier modifierClip = ClipKt.clip(ShadowKt.m3585shadows4CzXII$default(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(64)), Dp.m6403constructorimpl(f6), RoundedCornerShapeKt.getCircleShape(), false, 0L, ColorKt.Color(4294953984L), 12, null), RoundedCornerShapeKt.getCircleShape());
            Brush.Companion companion4 = Brush.Companion;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierClip, Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(Color.m3917boximpl(ColorKt.Color(4294626325L)), Color.m3917boximpl(ColorKt.Color(4292441862L)), Color.m3917boximpl(ColorKt.Color(4291463684L))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierBackground$default);
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
            ImageVector playArrow = PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault());
            Color.Companion companion5 = Color.Companion;
            IconKt.m1877Iconww6aTOc(playArrow, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
            b.n(composer, f6, companion, composer, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer, i5).getTitleLarge();
            TextStyle textStyleM5915copyNs73l9s = titleLarge.m5915copyNs73l9s(Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(Color.m3917boximpl(ColorKt.Color(4293514751L)), Color.m3917boximpl(companion5.m3964getWhite0d7_KjU()), Color.m3917boximpl(ColorKt.Color(4293514751L))), 0L, 0L, 0, 14, (Object) null), (33554430 & 2) != 0 ? titleLarge.spanStyle.getAlpha() : 0.0f, (33554430 & 4) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (33554430 & 8) != 0 ? titleLarge.spanStyle.getFontWeight() : null, (33554430 & 16) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (33554430 & 32) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (33554430 & 64) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (33554430 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (33554430 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (33554430 & Fields.RotationY) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (33554430 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (33554430 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (33554430 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (33554430 & Fields.Shape) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (33554430 & Fields.Clip) != 0 ? titleLarge.spanStyle.getShadow() : null, (33554430 & Fields.CompositingStrategy) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (33554430 & 65536) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (33554430 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (33554430 & 262144) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (524288 & 33554430) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (33554430 & 1048576) != 0 ? titleLarge.platformStyle : null, (33554430 & 2097152) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (33554430 & 4194304) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (33554430 & 8388608) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (33554430 & 16777216) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null);
            FontWeight bold = FontWeight.Companion.getBold();
            TextAlign.Companion companion6 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("Help Us Reach 100K Subscribers!", (Modifier) null, 0L, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, textStyleM5915copyNs73l9s, composer, 196614, 0, 64990);
            float f7 = 8;
            b.m(f7, companion, composer, 6);
            TextKt.m2432Text4IGK_g("We've built NotesCrafter completely Free Forever - No login, No watermarks, No limits.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodyMedium(), composer, 390, 0, 65018);
            b.m(f5, companion, composer, 6);
            ButtonColors buttonColorsM1520buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(ColorKt.Color(4292617766L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            Modifier modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(companion, Dp.m6403constructorimpl(f7), RoundedCornerShapeKt.RoundedCornerShape(50), false, 0L, companion5.m3961getRed0d7_KjU(), 12, null);
            composer.startReplaceGroup(165994871);
            Context context = this.f14947o;
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new J(context, 8);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue, modifierM3585shadows4CzXII$default, false, RoundedCornerShape, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, AbstractC2762y3.f15748b, composer, 805306368, 484);
            b.m(12, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Every subscription helps us keep NotesCrafter free forever", (Modifier) null, p107y3.a.q, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 3462, 0, 65010);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
