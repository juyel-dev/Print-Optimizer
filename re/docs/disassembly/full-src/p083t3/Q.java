package p083t3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AccountCircleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
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
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Q implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13094o;
    public final /* synthetic */ String p;
    public final /* synthetic */ InterfaceC0200y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f13095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13096s;
    public final /* synthetic */ a t;
    public final /* synthetic */ State u;

    public Q(String str, String str2, InterfaceC0200y interfaceC0200y, h hVar, Context context, a aVar, State state) {
        this.f13094o = str;
        this.p = str2;
        this.q = interfaceC0200y;
        this.f13095r = hVar;
        this.f13096s = context;
        this.t = aVar;
        this.u = state;
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
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MaterialTheme materialTheme;
        Composer composer;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(770060792, iIntValue, -1, "com.notescrafter.SignInRequiredScreen.<anonymous>.<anonymous> (MainActivity.kt:1251)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.Companion;
            long j5 = p107y3.a.f15978a;
            float f5 = 28;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m3884verticalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15979b, 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), centerHorizontally, composer2, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(72)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(j5, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl((float) 1.5d), Color.m3926copywmQWz5c$default(j5, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
            a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(AccountCircleKt.getAccountCircle(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(44)), j5, composer2, 3504, 0);
            composer2.endNode();
            b.m(20, companion, composer2, 6);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle headlineSmall = materialTheme2.getTypography(composer2, i5).getHeadlineSmall();
            FontWeight.Companion companion5 = FontWeight.Companion;
            FontWeight bold = companion5.getBold();
            Color.Companion companion6 = Color.Companion;
            TextStyle textStyleM5917copyp1EtxEg = headlineSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall.spanStyle.m5841getColor0d7_KjU() : companion6.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? headlineSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall.paragraphStyle.getTextMotion() : null);
            TextAlign.Companion companion7 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g(this.f13094o, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer2, 0, 0, 65022);
            float f6 = 8;
            b.m(f6, companion, composer2, 6);
            TextStyle bodyMedium = materialTheme2.getTypography(composer2, i5).getBodyMedium();
            TextKt.m2432Text4IGK_g(this.p, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : p107y3.a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65022);
            b.m(f5, companion, composer2, 6);
            if (((Boolean) this.u.getValue()).booleanValue()) {
                composer2.startReplaceGroup(-875334216);
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), j5, Dp.m6403constructorimpl(3), 0L, 0, composer2, 438, 24);
                composer2.endReplaceGroup();
                composer = composer2;
                materialTheme = materialTheme2;
            } else {
                composer2.startReplaceGroup(-875047280);
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(50)), 14), companion6.m3964getWhite0d7_KjU(), null, 2, null);
                composer2.startReplaceGroup(1772898134);
                InterfaceC0200y interfaceC0200y = this.q;
                boolean zChangedInstance = composer2.changedInstance(interfaceC0200y);
                h hVar = this.f13095r;
                boolean zChangedInstance2 = zChangedInstance | composer2.changedInstance(hVar);
                Context context = this.f13096s;
                boolean zChangedInstance3 = zChangedInstance2 | composer2.changedInstance(context);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new N(interfaceC0200y, hVar, context, 0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default);
                a constructor3 = companion4.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), b.c(companion4, composerM3407constructorimpl3, modifierMaterializeModifier3, companion3), composer2, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
                a constructor4 = companion4.getConstructor();
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
                e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                materialTheme = materialTheme2;
                composer = composer2;
                TextKt.m2432Text4IGK_g("Sign In with Google", (Modifier) null, companion6.m3953getBlack0d7_KjU(), 0L, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composer2, i5).getBodyLarge(), composer, 196998, 0, 65498);
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            }
            Composer composer3 = composer;
            b.m(16, companion, composer3, 6);
            TextStyle labelLarge = materialTheme.getTypography(composer3, i5).getLabelLarge();
            TextStyle textStyleM5917copyp1EtxEg2 = labelLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelLarge.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? labelLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelLarge.spanStyle.getFontWeight() : companion5.getSemiBold(), (16645977 & 8) != 0 ? labelLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelLarge.platformStyle : null, (16645977 & 1048576) != 0 ? labelLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelLarge.paragraphStyle.getTextMotion() : null);
            composer3.startReplaceGroup(1772956843);
            a aVar = this.t;
            boolean zChanged = composer3.changed(aVar);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new O(0, aVar);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            composer3.endReplaceGroup();
            TextKt.m2432Text4IGK_g("Go Back", PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg2, composer3, 6, 0, 65532);
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
