package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
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
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2608o8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f15371o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15373s;
    public final /* synthetic */ MutableState t;

    public C2608o8(InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f15371o = interfaceC0200y;
        this.p = context;
        this.q = mutableState;
        this.f15372r = mutableState2;
        this.f15373s = mutableState3;
        this.t = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1158702509, iIntValue, -1, "com.notescrafter.ui.screens.PdfInvertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfInvertScreen.kt:821)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MutableState mutableState2 = this.q;
            boolean z3 = ((Number) mutableState2.getValue()).intValue() > 1;
            float f5 = 36;
            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), RoundedCornerShapeKt.getCircleShape());
            Color.Companion companion3 = Color.Companion;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(-1618489313);
            InterfaceC0200y interfaceC0200y = this.f15371o;
            boolean zChangedInstance = composer.changedInstance(interfaceC0200y);
            Context context = this.p;
            boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState3 = this.f15372r;
            MutableState mutableState4 = this.f15373s;
            MutableState mutableState5 = this.t;
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                mutableState = mutableState5;
                L7 l7 = new L7(mutableState2, mutableState3, mutableState4, interfaceC0200y, context, mutableState, 2);
                composer.updateRememberedValue(l7);
                objRememberedValue = l7;
            } else {
                mutableState = mutableState5;
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((a) objRememberedValue, modifierM207backgroundbw27NRU$default, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-342362578, true, new C2576m8(mutableState2), composer, 54), composer, 196608, 24);
            float f6 = 16;
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer, 6);
            String strM = p035i0.a.m("Page ", " of ", ((Number) mutableState2.getValue()).intValue(), AbstractC2783z8.b(mutableState4));
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
            TextKt.m2432Text4IGK_g(strM, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer, 6);
            boolean z4 = ((Number) mutableState2.getValue()).intValue() < ((Number) mutableState4.getValue()).intValue();
            Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(-1618449793);
            boolean zChangedInstance3 = composer.changedInstance(interfaceC0200y) | composer.changedInstance(context);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                L7 l8 = new L7(mutableState2, mutableState3, mutableState4, interfaceC0200y, context, mutableState, 3);
                composer.updateRememberedValue(l8);
                objRememberedValue2 = l8;
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default2, z4, null, null, ComposableLambdaKt.rememberComposableLambda(-469719579, true, new C2592n8(mutableState2, mutableState4), composer, 54), composer, 196608, 24);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
