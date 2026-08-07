package p102x3;

import O3.a;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2685t6 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f15547o;

    public C2685t6(e eVar) {
        this.f15547o = eVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final int i5 = 0;
        final int i6 = 2;
        final int i7 = 1;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119348643, iIntValue, -1, "com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelectionScreen.kt:487)");
            }
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composer, 54);
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
            Icons.AutoMirrored.Filled filled = Icons.AutoMirrored.Filled.INSTANCE;
            ImageVector keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(filled);
            composer.startReplaceGroup(-1121318745);
            final e eVar = this.f15547o;
            boolean zChanged = composer.changed(eVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: x3.s6
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                eVar.invoke(Float.valueOf(-0.01f), Float.valueOf(0.0f));
                                break;
                            case 1:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(0.01f));
                                break;
                            case 2:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(-0.01f));
                                break;
                            default:
                                eVar.invoke(Float.valueOf(0.01f), Float.valueOf(0.0f));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            A6.e(keyboardArrowLeft, (a) objRememberedValue, composer, 0);
            Icons icons = Icons.INSTANCE;
            ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(icons.getDefault());
            composer.startReplaceGroup(-1121315930);
            boolean zChanged2 = composer.changed(eVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: x3.s6
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                eVar.invoke(Float.valueOf(-0.01f), Float.valueOf(0.0f));
                                break;
                            case 1:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(0.01f));
                                break;
                            case 2:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(-0.01f));
                                break;
                            default:
                                eVar.invoke(Float.valueOf(0.01f), Float.valueOf(0.0f));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            A6.e(keyboardArrowDown, (a) objRememberedValue2, composer, 0);
            ImageVector keyboardArrowUp = KeyboardArrowUpKt.getKeyboardArrowUp(icons.getDefault());
            composer.startReplaceGroup(-1121313209);
            boolean zChanged3 = composer.changed(eVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new a() { // from class: x3.s6
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                eVar.invoke(Float.valueOf(-0.01f), Float.valueOf(0.0f));
                                break;
                            case 1:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(0.01f));
                                break;
                            case 2:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(-0.01f));
                                break;
                            default:
                                eVar.invoke(Float.valueOf(0.01f), Float.valueOf(0.0f));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            A6.e(keyboardArrowUp, (a) objRememberedValue3, composer, 0);
            ImageVector keyboardArrowRight = KeyboardArrowRightKt.getKeyboardArrowRight(filled);
            composer.startReplaceGroup(-1121309978);
            boolean zChanged4 = composer.changed(eVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                final int i8 = 3;
                objRememberedValue4 = new a() { // from class: x3.s6
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                eVar.invoke(Float.valueOf(-0.01f), Float.valueOf(0.0f));
                                break;
                            case 1:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(0.01f));
                                break;
                            case 2:
                                eVar.invoke(Float.valueOf(0.0f), Float.valueOf(-0.01f));
                                break;
                            default:
                                eVar.invoke(Float.valueOf(0.01f), Float.valueOf(0.0f));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            A6.e(keyboardArrowRight, (a) objRememberedValue4, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
