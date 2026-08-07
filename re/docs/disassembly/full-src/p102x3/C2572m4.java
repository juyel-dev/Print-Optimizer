package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.graphics.RectF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
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

/* JADX INFO: renamed from: x3.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2572m4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ RectF f15306o;
    public final /* synthetic */ EnumC2380a4 p;
    public final /* synthetic */ EnumC2604o4 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f15307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f15308s;
    public final /* synthetic */ a t;

    public C2572m4(RectF rectF, EnumC2380a4 enumC2380a4, EnumC2604o4 enumC2604o4, float f5, a aVar, a aVar2) {
        this.f15306o = rectF;
        this.p = enumC2380a4;
        this.q = enumC2604o4;
        this.f15307r = f5;
        this.f15308s = aVar;
        this.t = aVar2;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposeUiNode.Companion companion;
        float f5;
        float f6;
        float f7;
        float f8;
        Modifier.Companion companion2;
        ?? r4;
        Composer composer;
        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1810639720, iIntValue, -1, "com.notescrafter.ui.screens.SelectionOverlay.<anonymous> (EditPageScreen.kt:520)");
            }
            float fMo577getMaxWidthD9Ej5fM = BoxWithConstraints.mo577getMaxWidthD9Ej5fM();
            float fMo576getMaxHeightD9Ej5fM = BoxWithConstraints.mo576getMaxHeightD9Ej5fM();
            RectF rectF = this.f15306o;
            final float fM6403constructorimpl = Dp.m6403constructorimpl(rectF.left * fMo577getMaxWidthD9Ej5fM);
            final float fM6403constructorimpl2 = Dp.m6403constructorimpl(rectF.top * fMo576getMaxHeightD9Ej5fM);
            final float fM6403constructorimpl3 = Dp.m6403constructorimpl(rectF.width() * fMo577getMaxWidthD9Ej5fM);
            final float fM6403constructorimpl4 = Dp.m6403constructorimpl(rectF.height() * fMo576getMaxHeightD9Ej5fM);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            composer2.startReplaceGroup(-833281775);
            boolean zChanged = composer2.changed(fM6403constructorimpl) | composer2.changed(fM6403constructorimpl2) | composer2.changed(fM6403constructorimpl3) | composer2.changed(fM6403constructorimpl4);
            EnumC2380a4 enumC2380a4 = this.p;
            boolean zChanged2 = composer2.changed(this.q) | zChanged | composer2.changed(enumC2380a4) | composer2.changed(this.f15307r);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                final float f9 = this.f15307r;
                final EnumC2380a4 enumC2380a5 = this.p;
                final EnumC2604o4 enumC2604o4 = this.q;
                objRememberedValue = new c() { // from class: x3.l4
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        Rect rect;
                        DrawScope Canvas = (DrawScope) obj4;
                        o.f(Canvas, "$this$Canvas");
                        float f10 = fM6403constructorimpl;
                        float fMo349toPx0680j_4 = Canvas.mo349toPx0680j_4(f10);
                        float f11 = fM6403constructorimpl2;
                        Rect rect2 = new Rect(fMo349toPx0680j_4, Canvas.mo349toPx0680j_4(f11), Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f10 + fM6403constructorimpl3)), Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f11 + fM6403constructorimpl4)));
                        EnumC2380a4 enumC2380a6 = EnumC2380a4.p;
                        EnumC2380a4 enumC2380a7 = enumC2380a5;
                        EnumC2604o4 enumC2604o5 = enumC2604o4;
                        if (enumC2380a7 != enumC2380a6) {
                            rect = rect2;
                        } else if (enumC2604o5 == EnumC2604o4.f15367o) {
                            rect = rect2;
                            DrawScope.m4471drawRectnJ9OG0$default(Canvas, Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), rect2.m3721getTopLeftF1C5BW0(), rect2.m3719getSizeNHjbRc(), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        } else {
                            rect = rect2;
                            DrawScope.m4465drawOvalnJ9OG0$default(Canvas, Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), rect.m3721getTopLeftF1C5BW0(), rect.m3719getSizeNHjbRc(), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        }
                        EnumC2604o4 enumC2604o6 = EnumC2604o4.f15367o;
                        float f12 = f9;
                        if (enumC2604o5 == enumC2604o6) {
                            Color.Companion companion4 = Color.Companion;
                            DrawScope.m4471drawRectnJ9OG0$default(Canvas, companion4.m3953getBlack0d7_KjU(), rect.m3721getTopLeftF1C5BW0(), rect.m3719getSizeNHjbRc(), 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(3)), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                            DrawScope.m4471drawRectnJ9OG0$default(Canvas, companion4.m3964getWhite0d7_KjU(), rect.m3721getTopLeftF1C5BW0(), rect.m3719getSizeNHjbRc(), 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(2)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect(new float[]{20.0f, 10.0f}, f12), 14, null), null, 0, 104, null);
                        } else {
                            Color.Companion companion5 = Color.Companion;
                            DrawScope.m4465drawOvalnJ9OG0$default(Canvas, companion5.m3953getBlack0d7_KjU(), rect.m3721getTopLeftF1C5BW0(), rect.m3719getSizeNHjbRc(), 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(3)), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                            DrawScope.m4465drawOvalnJ9OG0$default(Canvas, companion5.m3964getWhite0d7_KjU(), rect.m3721getTopLeftF1C5BW0(), rect.m3719getSizeNHjbRc(), 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(2)), 0.0f, 0, 0, PathEffect.Companion.dashPathEffect(new float[]{20.0f, 10.0f}, f12), 14, null), null, 0, 104, null);
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (c) objRememberedValue, composer2, 6);
            Modifier modifierM715sizeVpY3zN4 = SizeKt.m715sizeVpY3zN4(OffsetKt.m628offsetVpY3zN4(companion3, fM6403constructorimpl, fM6403constructorimpl2), fM6403constructorimpl3, fM6403constructorimpl4);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM715sizeVpY3zN4);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor = companion5.getConstructor();
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
            e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f10 = 12;
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(f10));
            Color.Companion companion6 = Color.Companion;
            float f11 = 2;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs, companion6.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(f11), p107y3.a.f15978a, RoundedCornerShapeKt.getCircleShape());
            float f12 = -6;
            BoxKt.Box(OffsetKt.m628offsetVpY3zN4(boxScopeInstance.align(modifierM220borderxT4_qwU, companion4.getTopStart()), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f12)), composer2, 0);
            float f13 = 6;
            BoxKt.Box(OffsetKt.m628offsetVpY3zN4(boxScopeInstance.align(modifierM220borderxT4_qwU, companion4.getTopEnd()), Dp.m6403constructorimpl(f13), Dp.m6403constructorimpl(f12)), composer2, 0);
            BoxKt.Box(OffsetKt.m628offsetVpY3zN4(boxScopeInstance.align(modifierM220borderxT4_qwU, companion4.getBottomStart()), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f13)), composer2, 0);
            BoxKt.Box(OffsetKt.m628offsetVpY3zN4(boxScopeInstance.align(modifierM220borderxT4_qwU, companion4.getBottomEnd()), Dp.m6403constructorimpl(f13), Dp.m6403constructorimpl(f13)), composer2, 0);
            if (enumC2380a4 == EnumC2380a4.f14770o) {
                composer2.startReplaceGroup(1242888992);
                float f14 = 4;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.f(f14, OffsetKt.m629offsetVpY3zN4$default(boxScopeInstance.align(companion3, companion4.getBottomStart()), 0.0f, Dp.m6403constructorimpl(20), 1, null), ColorKt.Color(4282090230L)), Dp.m6403constructorimpl(f14), Dp.m6403constructorimpl(f11));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
                a constructor2 = companion5.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                f8 = f10;
                companion = companion5;
                f5 = fM6403constructorimpl2;
                f6 = f13;
                f7 = fM6403constructorimpl;
                TextKt.m2432Text4IGK_g("Invert", (Modifier) null, companion6.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 131058);
                composer2.endNode();
                composer2.endReplaceGroup();
                companion2 = companion3;
                composer = composer2;
                r4 = 0;
            } else {
                companion = companion5;
                f5 = fM6403constructorimpl2;
                f6 = f13;
                f7 = fM6403constructorimpl;
                f8 = f10;
                if (enumC2380a4 == EnumC2380a4.p) {
                    composer2.startReplaceGroup(1243369275);
                    float f15 = 4;
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.f(f15, OffsetKt.m629offsetVpY3zN4$default(boxScopeInstance.align(companion3, companion4.getBottomStart()), 0.0f, Dp.m6403constructorimpl(20), 1, null), ColorKt.Color(4282090230L)), Dp.m6403constructorimpl(f15), Dp.m6403constructorimpl(f11));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN5);
                    a constructor3 = companion.getConstructor();
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
                    e eVarG3 = p035i0.a.g(companion, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                    r4 = 0;
                    companion = companion;
                    companion2 = companion3;
                    TextKt.m2432Text4IGK_g("Paint Black", (Modifier) null, companion6.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 131058);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    composer = composer2;
                } else {
                    companion2 = companion3;
                    r4 = 0;
                    composer = composer2;
                    composer.startReplaceGroup(1243793076);
                    composer.endReplaceGroup();
                }
            }
            composer.endNode();
            Dp dpM6401boximpl = Dp.m6401boximpl(Dp.m6403constructorimpl(f5 - Dp.m6403constructorimpl(50)));
            Dp minimumValue = Dp.m6401boximpl(Dp.m6403constructorimpl((float) r4));
            o.f(dpM6401boximpl, "<this>");
            o.f(minimumValue, "minimumValue");
            if (dpM6401boximpl.compareTo(minimumValue) < 0) {
                dpM6401boximpl = minimumValue;
            }
            Modifier.Companion companion7 = companion2;
            Modifier modifierM628offsetVpY3zN4 = OffsetKt.m628offsetVpY3zN4(companion7, f7, dpM6401boximpl.m6417unboximpl());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r4);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, r4);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM628offsetVpY3zN4);
            a constructor4 = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
            ComposeUiNode.Companion companion8 = companion;
            e eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
            float f16 = 8;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion4.getTop(), composer, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, r4);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, companion7);
            a constructor5 = companion8.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
            e eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion8.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jColor = ColorKt.Color(4280468830L);
            int i5 = (ButtonDefaults.$stable << 12) | 6;
            float f17 = 32;
            Composer composer3 = composer;
            ButtonKt.Button(this.f15308s, SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f17)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16)), buttonDefaults.m1520buttonColorsro_MJ88(jColor, 0L, 0L, 0L, composer, i5, 14), null, null, PaddingKt.m662PaddingValuesYgX7TsA(Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f6)), null, T.f14440c, composer, 817889328, 356);
            ButtonKt.Button(this.t, SizeKt.m699height3ABfNKs(companion7, Dp.m6403constructorimpl(f17)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16)), buttonDefaults.m1520buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, composer3, i5, 14), null, null, PaddingKt.m662PaddingValuesYgX7TsA(Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f6)), null, T.f14441d, composer3, 817889328, 356);
            if (androidx.compose.foundation.text.modifiers.a.w(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
