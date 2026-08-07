package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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

/* JADX INFO: renamed from: x3.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2580mc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f15319o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Brush q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Brush f15320r;

    public C2580mc(boolean z3, boolean z4, Brush brush, Brush brush2) {
        this.f15319o = z3;
        this.p = z4;
        this.q = brush;
        this.f15320r = brush2;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        RowScope Button = (RowScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927608327, iIntValue, -1, "com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:4798)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean z3 = this.f15319o;
            boolean z4 = this.p;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxSize$default, (!z3 || z4) ? this.f15320r : this.q, null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierBackground$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z4) {
                composer2.startReplaceGroup(-1697392385);
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20)), Color.Companion.m3964getWhite0d7_KjU(), 0.0f, 0L, 0, composer2, 54, 28);
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(-1697228705);
                composer = composer2;
                TextKt.m2432Text4IGK_g("Save Address", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196998, 0, 131034);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
