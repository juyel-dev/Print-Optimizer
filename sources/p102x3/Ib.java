package p102x3;

import O3.a;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowForwardKt;
import androidx.compose.material.icons.outlined.AccountCircleKt;
import androidx.compose.material.icons.outlined.UploadFileKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Ib implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f14091o;
    public final /* synthetic */ Brush p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f14093s;
    public final /* synthetic */ a t;
    public final /* synthetic */ InterfaceC0200y u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f14094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f14095w;

    public Ib(float f5, Brush brush, boolean z3, State state, State state2, a aVar, InterfaceC0200y interfaceC0200y, h hVar, Context context) {
        this.f14091o = f5;
        this.p = brush;
        this.q = z3;
        this.f14092r = state;
        this.f14093s = state2;
        this.t = aVar;
        this.u = interfaceC0200y;
        this.f14094v = hVar;
        this.f14095w = context;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer;
        Composer composer2 = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1314559822, iIntValue, -1, "com.notescrafter.ui.screens.PrintLandingScreen.<anonymous>.<anonymous>.<anonymous> (PrintLandingScreen.kt:192)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(14));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f6 = 16;
            Modifier modifierThen = BackgroundKt.background$default(b.g(ScaleKt.scale(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), this.f14091o), f6), this.p, null, 0.0f, 6, null).then(this.q ? BorderKt.m220borderxT4_qwU(companion, Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))) : companion);
            composer2.startReplaceGroup(1027420374);
            State state = this.f14092r;
            boolean zChanged = composer2.changed(state);
            State state2 = this.f14093s;
            boolean zChanged2 = zChanged | composer2.changed(state2);
            a aVar = this.t;
            boolean zChanged3 = zChanged2 | composer2.changed(aVar);
            InterfaceC0200y interfaceC0200y = this.u;
            boolean zChangedInstance = zChanged3 | composer2.changedInstance(interfaceC0200y);
            h hVar = this.f14094v;
            boolean zChangedInstance2 = zChangedInstance | composer2.changedInstance(hVar);
            Context context = this.f14095w;
            boolean zChangedInstance3 = zChangedInstance2 | composer2.changedInstance(context);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2460f4(aVar, interfaceC0200y, state, state2, hVar, context, 2);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierThen, false, null, null, (a) objRememberedValue, 7, null), 0.0f, Dp.m6403constructorimpl(f6), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), b.c(companion3, composerM3407constructorimpl2, modifierMaterializeModifier2, companion2), composer2, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
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
            if (((Boolean) state.getValue()).booleanValue()) {
                composer2.startReplaceGroup(-1266142838);
                float f7 = ((Boolean) state2.getValue()).booleanValue() ? 1.0f : 0.5f;
                ImageVector uploadFile = UploadFileKt.getUploadFile(Icons.Outlined.INSTANCE);
                Color.Companion companion4 = Color.Companion;
                IconKt.m1877Iconww6aTOc(uploadFile, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), f7, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 0);
                androidx.compose.foundation.text.modifiers.a.q(12, companion, composer2, 6);
                TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium();
                TextKt.m2432Text4IGK_g("Start Your Order", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), f7, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                androidx.compose.foundation.text.modifiers.a.q(8, companion, composer2, 6);
                IconKt.m1877Iconww6aTOc(ArrowForwardKt.getArrowForward(Icons.Filled.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), f7, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 0);
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(-1264749078);
                ImageVector accountCircle = AccountCircleKt.getAccountCircle(Icons.Outlined.INSTANCE);
                Color.Companion companion5 = Color.Companion;
                IconKt.m1877Iconww6aTOc(accountCircle, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), companion5.m3964getWhite0d7_KjU(), composer2, 3504, 0);
                androidx.compose.foundation.text.modifiers.a.q(12, companion, composer2, 6);
                TextStyle titleMedium2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium();
                TextKt.m2432Text4IGK_g("Sign In with Google", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium2.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium2.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                composer = composer2;
                androidx.compose.foundation.text.modifiers.a.q(8, companion, composer, 6);
                IconKt.m1877Iconww6aTOc(ArrowForwardKt.getArrowForward(Icons.Filled.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endReplaceGroup();
            }
            if (S2.b(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
