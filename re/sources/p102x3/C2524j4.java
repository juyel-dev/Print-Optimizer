package p102x3;

import B3.h;
import B3.o;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import Y3.d;
import android.graphics.RectF;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import p076s.b;
import p087u3.g;

/* JADX INFO: renamed from: x3.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2524j4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f15208o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15210s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ State f15212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15213x;

    public C2524j4(g gVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, State state, MutableState mutableState8) {
        this.f15208o = gVar;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15209r = mutableState3;
        this.f15210s = mutableState4;
        this.t = mutableState5;
        this.u = mutableState6;
        this.f15211v = mutableState7;
        this.f15212w = state;
        this.f15213x = mutableState8;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar;
        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.o.f(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        int i5 = iIntValue & 19;
        o oVar2 = o.f154a;
        if (i5 == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return oVar2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986572859, iIntValue, -1, "com.notescrafter.ui.screens.EditPageScreen.<anonymous>.<anonymous> (EditPageScreen.kt:207)");
        }
        g gVar = this.f15208o;
        if ((gVar != null ? gVar.getThumbnail() : null) != null) {
            composer.startReplaceGroup(1073126606);
            float width = gVar.getThumbnail().getWidth() / gVar.getThumbnail().getHeight();
            h hVar = width > BoxWithConstraints.mo577getMaxWidthD9Ej5fM() / BoxWithConstraints.mo576getMaxHeightD9Ej5fM() ? new h(Dp.m6401boximpl(BoxWithConstraints.mo577getMaxWidthD9Ej5fM()), Dp.m6401boximpl(Dp.m6403constructorimpl(BoxWithConstraints.mo577getMaxWidthD9Ej5fM() / width))) : new h(Dp.m6401boximpl(Dp.m6403constructorimpl(BoxWithConstraints.mo576getMaxHeightD9Ej5fM() * width)), Dp.m6401boximpl(BoxWithConstraints.mo576getMaxHeightD9Ej5fM()));
            float fM6417unboximpl = ((Dp) hVar.f148o).m6417unboximpl();
            float fM6417unboximpl2 = ((Dp) hVar.p).m6417unboximpl();
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM715sizeVpY3zN4 = SizeKt.m715sizeVpY3zN4(companion, fM6417unboximpl, fM6417unboximpl2);
            composer.startReplaceGroup(865919716);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new C2508i4(this.p, this.q, this.f15209r, this.f15210s, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM715sizeVpY3zN4, oVar2, (e) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPointerInput);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(gVar.getThumbnail());
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(-1168830475);
            boolean zChangedInstance = composer.changedInstance(imageBitmapAsImageBitmap);
            Object objRememberedValue2 = composer.rememberedValue();
            MutableState mutableState = this.t;
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new d(7, imageBitmapAsImageBitmap, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (c) objRememberedValue2, composer, 6);
            composer.startReplaceGroup(-1168728750);
            MutableState mutableState2 = this.f15210s;
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                MutableState mutableState3 = this.p;
                if (((RectF) mutableState3.getValue()) != null) {
                    RectF rectF = (RectF) mutableState3.getValue();
                    kotlin.jvm.internal.o.c(rectF);
                    long jSize = androidx.compose.ui.geometry.SizeKt.Size(fM6417unboximpl, fM6417unboximpl2);
                    MutableState mutableState4 = this.u;
                    EnumC2604o4 enumC2604o4 = (EnumC2604o4) mutableState4.getValue();
                    MutableState mutableState5 = this.f15211v;
                    EnumC2380a4 enumC2380a4 = (EnumC2380a4) mutableState5.getValue();
                    float fFloatValue = ((Number) this.f15212w.getValue()).floatValue();
                    composer.startReplaceGroup(-1168716452);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new C2460f4(mutableState4, mutableState5, mutableState3, mutableState, this.f15213x, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    a aVar = (a) objRememberedValue3;
                    Object objK = b.k(composer, -1168673928);
                    if (objK == companion2.getEmpty()) {
                        objK = new C2412c4(2, mutableState2, mutableState3);
                        composer.updateRememberedValue(objK);
                    }
                    composer.endReplaceGroup();
                    AbstractC2588n4.c(rectF, jSize, enumC2604o4, enumC2380a4, fFloatValue, aVar, (a) objK, composer, 1769472);
                }
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endReplaceGroup();
            oVar = oVar2;
        } else {
            composer.startReplaceGroup(1088761704);
            oVar = oVar2;
            TextKt.m2432Text4IGK_g("No Preview", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 390, 0, 131066);
            composer.endReplaceGroup();
        }
        if (!ComposerKt.isTraceInProgress()) {
            return oVar;
        }
        ComposerKt.traceEventEnd();
        return oVar;
    }
}
