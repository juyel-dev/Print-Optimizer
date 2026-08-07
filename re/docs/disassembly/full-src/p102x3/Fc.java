package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.LockKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Fc implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f13959o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f13960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13961s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f13962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ double f13963w;

    public Fc(InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state2, double d4) {
        this.f13959o = interfaceC0200y;
        this.p = printOrderViewModel;
        this.q = state;
        this.f13960r = mutableState;
        this.f13961s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f13962v = state2;
        this.f13963w = d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468673932, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:3483)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
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
            Modifier modifierG = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(58)), f5);
            Brush.Companion companion4 = Brush.Companion;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierG, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion4, v.S(Color.m3917boximpl(ColorKt.Color(4287837162L)), Color.m3917boximpl(ColorKt.Color(4286331629L)), Color.m3917boximpl(ColorKt.Color(4283385573L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            boolean zIsEmpty = ((List) this.q.getValue()).isEmpty();
            MutableState mutableState = this.f13960r;
            boolean z3 = (zIsEmpty || ((Boolean) mutableState.getValue()).booleanValue()) ? false : true;
            composer.startReplaceGroup(-1741580743);
            InterfaceC0200y interfaceC0200y = this.f13959o;
            boolean zChangedInstance = composer.changedInstance(interfaceC0200y);
            PrintOrderViewModel printOrderViewModel = this.p;
            boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(printOrderViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2460f4(interfaceC0200y, mutableState, this.f13961s, printOrderViewModel, this.t, this.u);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierBackground$default, z3, null, null, (a) objRememberedValue, 6, null);
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
            composer.startReplaceGroup(-2083871722);
            if (!((Boolean) mutableState.getValue()).booleanValue()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Color.Companion companion5 = Color.Companion;
                List listS = v.S(Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU()), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(companion5.m3962getTransparent0d7_KjU()));
                State state = this.f13962v;
                BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m3876horizontalGradient8A3gB4$default(companion4, listS, ((Number) state.getValue()).floatValue() * 800.0f, (((Number) state.getValue()).floatValue() + 0.4f) * 800.0f, 0, 8, (Object) null), null, 0.0f, 6, null), composer, 0);
            }
            composer.endReplaceGroup();
            float f6 = 8;
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f6, arrangement, companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyI, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(-1811243349);
                Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20));
                float fM6403constructorimpl = Dp.m6403constructorimpl(2);
                Color.Companion companion6 = Color.Companion;
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(modifierM713size3ABfNKs, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), fM6403constructorimpl, companion6.m3964getWhite0d7_KjU(), 0, composer, 3510, 16);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1810827515);
                IconKt.m1877Iconww6aTOc(LockKt.getLock(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(18)), Color.Companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endReplaceGroup();
            }
            String strY = ((Boolean) mutableState.getValue()).booleanValue() ? "Connecting to Razorpay..." : androidx.compose.foundation.text.modifiers.a.y("Pay with Razorpay · ", Gd.y(this.f13963w));
            TextStyle bodyLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge();
            TextKt.m2432Text4IGK_g(strY, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodyLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyLarge.spanStyle.m5841getColor0d7_KjU() : Color.Companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyLarge.spanStyle.getFontWeight() : FontWeight.Companion.getExtraBold(), (16645977 & 8) != 0 ? bodyLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyLarge.platformStyle : null, (16645977 & 1048576) != 0 ? bodyLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyLarge.paragraphStyle.getTextMotion() : null), composer, 0, 3120, 55294);
            composer.endNode();
            composer.endNode();
            b.m(10, companion, composer, 6);
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), arrangement.m549spacedByD5KLDUw(Dp.m6403constructorimpl(f5), companion2.getCenterHorizontally()), arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), 0, 0, null, X2.q, composer, 1573302, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
