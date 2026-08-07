package p102x3;

import B3.h;
import B3.o;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import java.util.List;
import kotlin.jvm.internal.p;

/* JADX INFO: renamed from: x3.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2477g5 extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15059o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2477g5(List list, int i5) {
        super(4);
        this.f15059o = i5;
        this.p = list;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        o oVar = o.f154a;
        List list = this.p;
        switch (this.f15059o) {
            case 0:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i5 = (6 & iIntValue2) == 0 ? (composer.changed(lazyGridItemScope) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((48 & iIntValue2) == 0) {
                    i5 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(699646206, i5, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                    }
                    C2429d5 c2429d5 = (C2429d5) list.get(iIntValue);
                    composer.startReplaceGroup(-122215874);
                    AbstractC2493h5.a(c2429d5, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i6 = (iIntValue4 & 6) == 0 ? (composer2.changed(lazyItemScope) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i6 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if ((i6 & 147) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    h hVar = (h) list.get(iIntValue3);
                    composer2.startReplaceGroup(1660284984);
                    String str = (String) hVar.f148o;
                    ImageVector imageVector = (ImageVector) hVar.p;
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierClip = ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50));
                    Color.Companion companion2 = Color.Companion;
                    float f5 = 16;
                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(12));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
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
                    e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                    if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), p107y3.a.f15980c, composer2, 3504, 0);
                    androidx.compose.foundation.text.modifiers.a.q(8, companion, composer2, 6);
                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge();
                    TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelLarge.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelLarge.spanStyle.getFontWeight() : FontWeight.Companion.getMedium(), (16645977 & 8) != 0 ? labelLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelLarge.platformStyle : null, (16645977 & 1048576) != 0 ? labelLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelLarge.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return oVar;
    }
}
