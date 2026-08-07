package p102x3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2514ia implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f15190o;
    public final /* synthetic */ State p;

    public C2514ia(MutableState mutableState, State state) {
        this.f15190o = mutableState;
        this.p = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668305536, iIntValue, -1, "com.notescrafter.ui.screens.PomodoroSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PomodoroSetupScreen.kt:255)");
            }
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(16), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composer, 54);
            ?? r12 = 0;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a constructor = companion.getConstructor();
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
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-991274456);
            Iterator it = AbstractC2642qa.f15449c.iterator();
            while (it.hasNext()) {
                final long jM3937unboximpl = ((Color) it.next()).m3937unboximpl();
                final MutableState mutableState = this.f15190o;
                boolean zM3928equalsimpl0 = Color.m3928equalsimpl0(((Color) mutableState.getValue()).m3937unboximpl(), jM3937unboximpl);
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment center = companion2.getCenter();
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(64));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, r12);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, r12);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM713size3ABfNKs);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                a constructor2 = companion4.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceGroup(-377854914);
                if (zM3928equalsimpl0) {
                    BoxKt.Box(BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(jM3937unboximpl, ((Number) this.p.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(jM3937unboximpl, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer, r12);
                }
                composer.endReplaceGroup();
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), jM3937unboximpl, null, 2, null);
                float fM6403constructorimpl = Dp.m6403constructorimpl(1);
                Color.Companion companion5 = Color.Companion;
                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default, fM6403constructorimpl, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer.startReplaceGroup(-377817404);
                boolean zChanged = composer.changed(jM3937unboximpl);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new a() { // from class: x3.ha
                        @Override // O3.a
                        public final Object invoke() {
                            List list = AbstractC2642qa.f15449c;
                            mutableState.setValue(Color.m3917boximpl(jM3937unboximpl));
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, false, null, null, (a) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
                a constructor3 = companion4.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier3, composer, 1375705359);
                if (zM3928equalsimpl0) {
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Selected", SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(20)), Color.m3928equalsimpl0(jM3937unboximpl, AbstractC2642qa.f15448b) ? ColorKt.Color(4279308561L) : companion5.m3964getWhite0d7_KjU(), composer, 432, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endNode();
                r12 = 0;
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
