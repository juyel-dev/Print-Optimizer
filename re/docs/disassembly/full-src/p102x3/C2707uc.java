package p102x3;

import O3.c;
import O3.e;
import O3.g;
import Q3.a;
import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.Z;
import p087u3.m;

/* JADX INFO: renamed from: x3.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2707uc implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PagerState f15611o;
    public final /* synthetic */ m p;
    public final /* synthetic */ Z q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15613s;

    public C2707uc(PagerState pagerState, m mVar, Z z3, boolean z4, MutableState mutableState) {
        this.f15611o = pagerState;
        this.p = mVar;
        this.q = z3;
        this.f15612r = z4;
        this.f15613s = mutableState;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerScope HorizontalPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1780165506, iIntValue2, -1, "com.notescrafter.ui.screens.NativePDFPageSlider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2333)");
        }
        PagerState pagerState = this.f15611o;
        final float currentPageOffsetFraction = pagerState.getCurrentPageOffsetFraction() + (pagerState.getCurrentPage() - iIntValue);
        final float fQ = a.q(1.0f - (Math.abs(currentPageOffsetFraction) * 0.15f), 0.85f, 1.0f);
        final float fQ2 = a.q(1.0f - (Math.abs(currentPageOffsetFraction) * 0.5f), 0.5f, 1.0f);
        Modifier.Companion companion = Modifier.Companion;
        Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.70711356f, false, 2, null);
        composer.startReplaceGroup(-1364837123);
        boolean zChanged = composer.changed(fQ) | composer.changed(fQ2) | composer.changed(currentPageOffsetFraction);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new c() { // from class: x3.tc
                @Override // O3.c
                public final Object invoke(Object obj5) {
                    GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj5;
                    o.f(graphicsLayer, "$this$graphicsLayer");
                    float f5 = fQ;
                    graphicsLayer.setScaleX(f5);
                    graphicsLayer.setScaleY(f5);
                    graphicsLayer.setAlpha(fQ2);
                    graphicsLayer.setRotationY(currentPageOffsetFraction * (-12.0f));
                    return B3.o.f154a;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierAspectRatio$default, (c) objRememberedValue);
        float fM6403constructorimpl = Dp.m6403constructorimpl(16);
        float f5 = 12;
        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5));
        Color.Companion companion2 = Color.Companion;
        Modifier modifierE = b.e(f5, b.f(f5, ShadowKt.m3584shadows4CzXII(modifierGraphicsLayer, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), companion2.m3964getWhite0d7_KjU()), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierE);
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
        if (iIntValue == 0) {
            composer.startReplaceGroup(2131428385);
            Gd.a(this.p.getName(), this.q.f13139a, this.f15612r, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2131732681);
            ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) ((List) this.f15613s.getValue()).get(iIntValue - 1)), AbstractC1421mz.h(iIntValue, "PDF Page "), b.g(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), f5), null, null, 0.0f, null, 0, composer, 0, 248);
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
