package p102x3;

import O3.c;
import O3.e;
import O3.f;
import W3.p;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
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
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
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
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class K7 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f14131o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14133s;

    public K7(Bitmap bitmap, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.f14131o = bitmap;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14132r = mutableState3;
        this.f14133s = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831101410, iIntValue, -1, "com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:841)");
            }
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextStyle textStyleM5917copyp1EtxEg = titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null);
            long j5 = a.f15990o;
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            TextKt.m2432Text4IGK_g("Page Preview & Margins", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 438, 0, 65528);
            float f6 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.m207backgroundbw27NRU$default(b.e(f6, b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(260)), f6), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(a.t, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), a.u, null, 2, null), Dp.m6403constructorimpl(f6));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWrapContentSize$default);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(this.f14131o), "Page Preview", SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(ComposerKt.invocationKey)), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 25008, 232);
            Float fQ = p.Q((String) this.p.getValue());
            final float fN = fQ != null ? Q3.a.n(fQ.floatValue(), 0.0f) : 0.0f;
            Float fQ2 = p.Q((String) this.q.getValue());
            final float fN2 = fQ2 != null ? Q3.a.n(fQ2.floatValue(), 0.0f) : 0.0f;
            Float fQ3 = p.Q((String) this.f14132r.getValue());
            final float fN3 = fQ3 != null ? Q3.a.n(fQ3.floatValue(), 0.0f) : 0.0f;
            Float fQ4 = p.Q((String) this.f14133s.getValue());
            final float fN4 = fQ4 != null ? Q3.a.n(fQ4.floatValue(), 0.0f) : 0.0f;
            Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
            composer.startReplaceGroup(-440010209);
            boolean zChanged = composer.changed(fN) | composer.changed(fN2) | composer.changed(fN3) | composer.changed(fN4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new c() { // from class: x3.J7
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        DrawScope Canvas = (DrawScope) obj4;
                        o.f(Canvas, "$this$Canvas");
                        float fM3755getWidthimpl = Size.m3755getWidthimpl(Canvas.mo4477getSizeNHjbRc());
                        float fM3752getHeightimpl = Size.m3752getHeightimpl(Canvas.mo4477getSizeNHjbRc());
                        float f7 = (fN / 100.0f) * fM3752getHeightimpl * 0.4f;
                        float f8 = (fN2 / 100.0f) * fM3752getHeightimpl * 0.4f;
                        float f9 = (fN3 / 100.0f) * fM3755getWidthimpl * 0.4f;
                        float f10 = (fN4 / 100.0f) * fM3755getWidthimpl * 0.4f;
                        DrawScope.m4471drawRectnJ9OG0$default(Canvas, Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), 0L, androidx.compose.ui.geometry.SizeKt.Size(fM3755getWidthimpl, f7), 0.0f, null, null, 0, 122, null);
                        DrawScope.m4471drawRectnJ9OG0$default(Canvas, Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, fM3752getHeightimpl - f8), androidx.compose.ui.geometry.SizeKt.Size(fM3755getWidthimpl, f8), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                        long jOffset = OffsetKt.Offset(0.0f, f7);
                        float f11 = (fM3752getHeightimpl - f7) - f8;
                        DrawScope.m4471drawRectnJ9OG0$default(Canvas, jM3926copywmQWz5c$default, jOffset, androidx.compose.ui.geometry.SizeKt.Size(f9, f11), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        DrawScope.m4471drawRectnJ9OG0$default(Canvas, Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(fM3755getWidthimpl - f10, f7), androidx.compose.ui.geometry.SizeKt.Size(f10, f11), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CanvasKt.Canvas(modifierMatchParentSize, (c) objRememberedValue, composer, 0);
            composer.endNode();
            composer.endNode();
            if (b.q(f5, companion, composer, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
